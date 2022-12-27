package pub.gll.modulevideo.db;

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
public final class VideoDao_Impl implements VideoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<VideoEntity> __insertionAdapterOfVideoEntity;

  private final SharedSQLiteStatement __preparedStmtOfClearVideo;

  public VideoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfVideoEntity = new EntityInsertionAdapter<VideoEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `VideoEntity` (`id`,`name`,`icon`,`url`,`page`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, VideoEntity value) {
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
        if (value.getUrl() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getUrl());
        }
        stmt.bindLong(5, value.getPage());
      }
    };
    this.__preparedStmtOfClearVideo = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM VideoEntity";
        return _query;
      }
    };
  }

  @Override
  public Object insertVideo(final List<VideoEntity> cookbookList,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfVideoEntity.insert(cookbookList);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object clearVideo(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClearVideo.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfClearVideo.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public PagingSource<Integer, VideoEntity> getVideoList() {
    final String _sql = "SELECT * FROM VideoEntity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return new LimitOffsetPagingSource<VideoEntity>(_statement, __db, "VideoEntity") {
      @Override
      protected List<VideoEntity> convertRows(Cursor cursor) {
        final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
        final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(cursor, "name");
        final int _cursorIndexOfIcon = CursorUtil.getColumnIndexOrThrow(cursor, "icon");
        final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(cursor, "url");
        final int _cursorIndexOfPage = CursorUtil.getColumnIndexOrThrow(cursor, "page");
        final List<VideoEntity> _result = new ArrayList<VideoEntity>(cursor.getCount());
        while(cursor.moveToNext()) {
          final VideoEntity _item;
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
          final String _tmpUrl;
          if (cursor.isNull(_cursorIndexOfUrl)) {
            _tmpUrl = null;
          } else {
            _tmpUrl = cursor.getString(_cursorIndexOfUrl);
          }
          final int _tmpPage;
          _tmpPage = cursor.getInt(_cursorIndexOfPage);
          _item = new VideoEntity(_tmpId,_tmpName,_tmpIcon,_tmpUrl,_tmpPage);
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
