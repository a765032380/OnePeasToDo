package pub.gll.onepeas.module.cookbook.db;

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
public final class CookbookDao_Impl implements CookbookDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CookbookEntity> __insertionAdapterOfCookbookEntity;

  private final SharedSQLiteStatement __preparedStmtOfClearCookbook;

  public CookbookDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCookbookEntity = new EntityInsertionAdapter<CookbookEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `CookbookEntity` (`id`,`name`,`icon`,`page`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CookbookEntity value) {
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
    this.__preparedStmtOfClearCookbook = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM CookbookEntity";
        return _query;
      }
    };
  }

  @Override
  public Object insertCookbook(final List<CookbookEntity> cookbookList,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCookbookEntity.insert(cookbookList);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object clearCookbook(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClearCookbook.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfClearCookbook.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public PagingSource<Integer, CookbookEntity> getCookbookList() {
    final String _sql = "SELECT * FROM CookbookEntity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new LimitOffsetPagingSource<CookbookEntity>(_statement, __db, "CookbookEntity") {
      @Override
      protected List<CookbookEntity> convertRows(Cursor cursor) {
        final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
        final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(cursor, "name");
        final int _cursorIndexOfIcon = CursorUtil.getColumnIndexOrThrow(cursor, "icon");
        final int _cursorIndexOfPage = CursorUtil.getColumnIndexOrThrow(cursor, "page");
        final List<CookbookEntity> _result = new ArrayList<CookbookEntity>(cursor.getCount());
        while(cursor.moveToNext()) {
          final CookbookEntity _item;
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
          _item = new CookbookEntity(_tmpId,_tmpName,_tmpIcon,_tmpPage);
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
