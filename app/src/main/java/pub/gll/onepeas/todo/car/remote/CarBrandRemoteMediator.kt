package pub.gll.onepeas.todo.car.remote

import androidx.paging.ExperimentalPagingApi
import androidx.paging.LoadType
import androidx.paging.PagingState
import androidx.paging.RemoteMediator
import androidx.room.withTransaction
import kotlinx.coroutines.delay
import pub.gll.onepeas.todo.car.db.AppDatabase
import pub.gll.onepeas.todo.car.db.CarBrandEntity
import pub.gll.onepeas.todo.car.init.AppHelper
import pub.gll.onepeas.todo.car.init.isConnectedNetwork
import pub.gll.onepeas.todo.util.showToast

@OptIn(ExperimentalPagingApi::class)
class CarBrandRemoteMediator(
    val api:CarBrandService,
    val db:AppDatabase
) :RemoteMediator<Int,CarBrandEntity>(){

    override suspend fun load(
        loadType: LoadType,
        state: PagingState<Int, CarBrandEntity>
    ): MediatorResult {
        try{
            //第一步：判断loadType
            val pageKey = when(loadType){
                LoadType.REFRESH->{//首次刷新的时候使用，或者调用Adapter.refresh()触发
                    null
                }
                LoadType.APPEND->{//在加载更多的时候触发，当LoadType.REFRESH触发当时候LoadType.PREPEND也会触发
                    val lastItem = state.lastItemOrNull()?:return MediatorResult.Success(true)
                    lastItem.page
                }
                LoadType.PREPEND->{//在当前列表的头部添加数据的时候触发
                    return MediatorResult.Success(true)
                }
            }
            //无网络加载本地数据
            if (!AppHelper.mContext.isConnectedNetwork()){
                showToast("无网络")
                return MediatorResult.Success(true)
            }


            val page = pageKey?:1
            //第二步：请求分页数据
            val result = api.fetchCarBrand(page,state.config.pageSize,"4c753f2f20288772bf555d0be98eede0","2015-07-10")
            delay(3*1000)
            val carBrandDao = db.getCarBrandDao()


            //第三步：插入数据库
            val item = result.result.showapi_res_body.contentlist.map {
                CarBrandEntity(
                    id = it.id,
                    name  = it.name,
//                    icon =  "https://image-1251228670.cos.ap-beijing.myqcloud.com/2022/06/16/shuang-ren-13x.png",
                    icon = it.icon,
                    page = page + 1
                )
            }

            db.withTransaction {
                if(loadType == LoadType.REFRESH){
                    carBrandDao.clearCarBrand()
                }
                carBrandDao.insertCarBrand(item)
            }

            val endOfPaginationReached = item.isEmpty()

            return MediatorResult.Success(endOfPaginationReached=endOfPaginationReached)
        }catch(e:Exception){
            e.printStackTrace()
            return MediatorResult.Error(e)
        }

        //PagingState 返回的上一页的数据，主要用于获取上一页最后一条数据作为下一页的开始位置
        //config PagingConfig 返回的初始化配置

        //endOfPaginationReached true请求成功且有数据 false 请求成功但是没数据

    }
}