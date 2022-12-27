package pub.gll.onepeas.module.car.db;

import android.database.Cursor;
import androidx.paging.PagingSource;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.paging.LimitOffsetPagingSource;
import androidx.room.util.CursorUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CarBrandDao_Impl implements CarBrandDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CarBrandEntity> __insertionAdapterOfCarBrandEntity;

  private final SharedSQLiteStatement __preparedStmtOfClearCarBrand;

  public CarBrandDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCarBrandEntity = new EntityInsertionAdapter<CarBrandEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `CarBrandEntity` (`id`,`name`,`icon`,`page`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CarBrandEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getIcon() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getIcon());
        }
        stmt.bindLong(4, value.getPage());
      }
    };
    this.__preparedStmtOfClearCarBrand = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM CarBrandEntity";
        return _query;
      }
    };
  }

  @Override
  public Object insertCarBrand(final List<CarBrandEntity> carBrandList,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCarBrandEntity.insert(carBrandList);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object clearCarBrand(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClearCarBrand.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfClearCarBrand.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public PagingSource<Integer, CarBrandEntity> getCarBrand() {
    final String _sql = "SELECT * FROM CarBrandEntity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new LimitOffsetPagingSource<CarBrandEntity>(_statement, __db, "CarBrandEntity") {
      @Override
      protected List<CarBrandEntity> convertRows(Cursor cursor) {
        final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
        final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(cursor, "name");
        final int _cursorIndexOfIcon = CursorUtil.getColumnIndexOrThrow(cursor, "icon");
        final int _cursorIndexOfPage = CursorUtil.getColumnIndexOrThrow(cursor, "page");
        final List<CarBrandEntity> _result = new ArrayList<CarBrandEntity>(cursor.getCount());
        while(cursor.moveToNext()) {
          final CarBrandEntity _item;
          final String _tmpId;
          if (cursor.isNull(_cursorIndexOfId)) {
            _tmpId = null;
          } else {
            _tmpId = cursor.getString(_cursorIndexOfId);
          }
          final String _tmpName;
          if (cursor.isNull(_cursorIndexOfName)) {
            _tmpName = null;
          } else {
            _tmpName = cursor.getString(_cursorIndexOfName);
          }
          final String _tmpIcon;
          if (cursor.isNull(_cursorIndexOfIcon)) {
            _tmpIcon = null;
          } else {
            _tmpIcon = cursor.getString(_cursorIndexOfIcon);
          }
          final int _tmpPage;
          _tmpPage = cursor.getInt(_cursorIndexOfPage);
          _item = new CarBrandEntity(_tmpId,_tmpName,_tmpIcon,_tmpPage);
          _result.add(_item);
        }
        return _result;
      }
    };
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
