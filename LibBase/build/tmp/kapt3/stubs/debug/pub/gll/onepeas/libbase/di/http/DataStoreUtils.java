package pub.gll.onepeas.libbase.di.http;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\u000eJ\'\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0012\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u0002H\u0013\u00a2\u0006\u0002\u0010\u0016J!\u0010\u0017\u001a\u0002H\u0013\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u0002H\u0013\u00a2\u0006\u0002\u0010\u0018J\u000e\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\bJ\'\u0010\u001b\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u0002H\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ!\u0010\u001e\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u0002H\u0013\u00a2\u0006\u0002\u0010\u001fJ\u0018\u0010 \u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020!J\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00122\u0006\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020!J\u0018\u0010#\u001a\u00020$2\u0006\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020$J\u001e\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u00122\u0006\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020$J\u0018\u0010&\u001a\u00020\'2\u0006\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\'J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00020\'0\u00122\u0006\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\'J\u0018\u0010)\u001a\u00020*2\u0006\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020*J\u001e\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u00122\u0006\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020*J\u0018\u0010,\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u0007J\u001e\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u0007J!\u0010.\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020!H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J!\u00100\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020$H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00101J!\u00102\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\'H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00103J!\u00104\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020*H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00105J!\u00106\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00107J\u0016\u00108\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020!J\u0016\u00109\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020$J\u0016\u0010:\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\'J\u0016\u0010;\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020*J\u0016\u0010<\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006="}, d2 = {"Lpub/gll/onepeas/libbase/di/http/DataStoreUtils;", "", "()V", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "preferenceName", "", "Landroid/content/Context;", "getDataStore", "(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", "dataStore$delegate", "Lkotlin/properties/ReadOnlyProperty;", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearSync", "getData", "Lkotlinx/coroutines/flow/Flow;", "U", "key", "default", "(Ljava/lang/String;Ljava/lang/Object;)Lkotlinx/coroutines/flow/Flow;", "getSyncData", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "init", "context", "putData", "value", "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putSyncData", "(Ljava/lang/String;Ljava/lang/Object;)V", "readBooleanData", "", "readBooleanFlow", "readFloatData", "", "readFloatFlow", "readIntData", "", "readIntFlow", "readLongData", "", "readLongFlow", "readStringData", "readStringFlow", "saveBooleanData", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveFloatData", "(Ljava/lang/String;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveIntData", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveLongData", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveStringData", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveSyncBooleanData", "saveSyncFloatData", "saveSyncIntData", "saveSyncLongData", "saveSyncStringData", "LibBase_debug"})
public final class DataStoreUtils {
    @org.jetbrains.annotations.NotNull()
    public static final pub.gll.onepeas.libbase.di.http.DataStoreUtils INSTANCE = null;
    private static final java.lang.String preferenceName = "WanAndroidDataStore";
    private static final kotlin.properties.ReadOnlyProperty dataStore$delegate = null;
    private static androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> dataStore;
    
    private DataStoreUtils() {
        super();
    }
    
    private final androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences> getDataStore(android.content.Context $this$dataStore) {
        return null;
    }
    
    /**
     * init Context
     * @param context Context
     */
    public final void init(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    public final <U extends java.lang.Object>U getSyncData(@org.jetbrains.annotations.NotNull()
    java.lang.String key, U p1_772401952) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    public final <U extends java.lang.Object>kotlinx.coroutines.flow.Flow<U> getData(@org.jetbrains.annotations.NotNull()
    java.lang.String key, U p1_772401952) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final <U extends java.lang.Object>java.lang.Object putData(@org.jetbrains.annotations.NotNull()
    java.lang.String key, U value, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final <U extends java.lang.Object>void putSyncData(@org.jetbrains.annotations.NotNull()
    java.lang.String key, U value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> readBooleanFlow(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean p1_772401952) {
        return null;
    }
    
    public final boolean readBooleanData(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean p1_772401952) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Integer> readIntFlow(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int p1_772401952) {
        return null;
    }
    
    public final int readIntData(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int p1_772401952) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.String> readStringFlow(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String p1_772401952) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String readStringData(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String p1_772401952) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Float> readFloatFlow(@org.jetbrains.annotations.NotNull()
    java.lang.String key, float p1_772401952) {
        return null;
    }
    
    public final float readFloatData(@org.jetbrains.annotations.NotNull()
    java.lang.String key, float p1_772401952) {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.lang.Long> readLongFlow(@org.jetbrains.annotations.NotNull()
    java.lang.String key, long p1_772401952) {
        return null;
    }
    
    public final long readLongData(@org.jetbrains.annotations.NotNull()
    java.lang.String key, long p1_772401952) {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveBooleanData(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean value, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void saveSyncBooleanData(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveIntData(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int value, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void saveSyncIntData(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveStringData(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void saveSyncStringData(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveFloatData(@org.jetbrains.annotations.NotNull()
    java.lang.String key, float value, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void saveSyncFloatData(@org.jetbrains.annotations.NotNull()
    java.lang.String key, float value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveLongData(@org.jetbrains.annotations.NotNull()
    java.lang.String key, long value, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void saveSyncLongData(@org.jetbrains.annotations.NotNull()
    java.lang.String key, long value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object clear(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void clearSync() {
    }
}