package pub.gll.onepeas.module.comic.comic.home.db;

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
public final class ComicHomeDao_Impl implements ComicHomeDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ComicHomeEntity> __insertionAdapterOfComicHomeEntity;

  private final SharedSQLiteStatement __preparedStmtOfClearComicHome;

  public ComicHomeDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfComicHomeEntity = new EntityInsertionAdapter<ComicHomeEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `ComicHomeEntity` (`id`,`page`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ComicHomeEntity value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getPage());
      }
    };
    this.__preparedStmtOfClearComicHome = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM ComicHomeEntity";
        return _query;
      }
    };
  }

  @Override
  public Object insertComicHome(final List<ComicHomeEntity> carBrandList,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfComicHomeEntity.insert(carBrandList);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object clearComicHome(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClearComicHome.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfClearComicHome.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public PagingSource<Integer, ComicHomeEntity> getComicHomeList() {
    final String _sql = "SELECT * FROM ComicHomeEntity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new LimitOffsetPagingSource<ComicHomeEntity>(_statement, __db, "ComicHomeEntity") {
      @Override
      protected List<ComicHomeEntity> convertRows(Cursor cursor) {
        final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
        final int _cursorIndexOfPage = CursorUtil.getColumnIndexOrThrow(cursor, "page");
        final List<ComicHomeEntity> _result = new ArrayList<ComicHomeEntity>(cursor.getCount());
        while(cursor.moveToNext()) {
          final ComicHomeEntity _item;
          final int _tmpId;
          _tmpId = cursor.getInt(_cursorIndexOfId);
          final int _tmpPage;
          _tmpPage = cursor.getInt(_cursorIndexOfPage);
          _item = new ComicHomeEntity(_tmpId,_tmpPage);
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
