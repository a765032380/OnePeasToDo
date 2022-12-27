package pub.gll.onepeas.libbase.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J?\u0010\u0003\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u00052\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u00042\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\bH\u0007\u00a2\u0006\u0002\u0010\tJ2\u0010\u0003\u001a\u00020\n\"\u0004\b\u0000\u0010\u00052\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u00042\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u000bH\u0007J7\u0010\f\u001a\u00020\n\"\u0004\b\u0000\u0010\u00052\u0016\b\u0001\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u000e\u0018\u00010\u00042\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u0001H\u0005H\u0007\u00a2\u0006\u0002\u0010\u0010J-\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00050\u0012\"\u0004\b\u0000\u0010\u00052\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u0001H\u0005\u0018\u00010\bH\u0007\u00a2\u0006\u0002\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\n2\u000e\b\u0001\u0010\u0016\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017H\u0007J\u0018\u0010\u0015\u001a\u00020\n2\u000e\b\u0001\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004H\u0007J\u001c\u0010\u0015\u001a\u00020\n2\u0012\b\u0001\u0010\u0018\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u0019H\u0007J$\u0010\u001a\u001a\u00020\u001b2\u000e\b\u0001\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0007J(\u0010\u001c\u001a\u00020\u001b2\u000e\b\u0001\u0010\u001d\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b2\u000e\b\u0001\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000bH\u0007J1\u0010\u001f\u001a\u0004\u0018\u0001H\u0005\"\u0004\b\u0000\u0010\u00052\u0012\b\u0001\u0010 \u001a\f\u0012\u0006\b\u0001\u0012\u0002H\u0005\u0018\u00010!2\u0006\u0010\"\u001a\u00020#H\u0007\u00a2\u0006\u0002\u0010$J)\u0010%\u001a\u0004\u0018\u0001H\u0005\"\u0004\b\u0000\u0010\u00052\u0012\b\u0001\u0010 \u001a\f\u0012\u0006\b\u0001\u0012\u0002H\u0005\u0018\u00010!H\u0007\u00a2\u0006\u0002\u0010&J\u0018\u0010\'\u001a\u00020#2\u000e\b\u0001\u0010(\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017H\u0007J\u0018\u0010\'\u001a\u00020#2\u000e\b\u0001\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000bH\u0007J\u001c\u0010\'\u001a\u00020#2\u0012\b\u0001\u0010\u0018\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010)H\u0007J\u0018\u0010*\u001a\u00020\u001b2\u000e\b\u0001\u0010(\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017H\u0007J\u0018\u0010*\u001a\u00020\u001b2\u000e\b\u0001\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000bH\u0007J\u001c\u0010*\u001a\u00020\u001b2\u0012\b\u0001\u0010\u0018\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010)H\u0007J/\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00050,\"\u0004\b\u0000\u0010\u00052\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00050\b\"\u0002H\u0005H\u0007\u00a2\u0006\u0002\u0010-J(\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00050,\"\u0004\b\u0000\u0010\u00052\u0010\u0010\u0013\u001a\f\u0012\u0006\u0012\u0004\u0018\u0001H\u0005\u0018\u00010\u000bH\u0007J3\u0010.\u001a\u0004\u0018\u0001H\u0005\"\u0004\b\u0000\u0010\u00052\u0014\b\u0001\u0010 \u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u0001H\u0005\u0018\u00010\u00122\u0006\u0010\"\u001a\u00020#H\u0007\u00a2\u0006\u0002\u0010$J)\u0010/\u001a\u0004\u0018\u0001H\u0005\"\u0004\b\u0000\u0010\u00052\u0012\b\u0001\u0010 \u001a\f\u0012\u0006\b\u0001\u0012\u0002H\u0005\u0018\u00010\u0012H\u0007\u00a2\u0006\u0002\u0010&J0\u00100\u001a\u00020\n\"\u0004\b\u0000\u0010\u00052\u0010\b\u0001\u0010 \u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u00122\u0006\u00101\u001a\u00020#2\u0006\u00102\u001a\u00020#H\u0007J7\u00103\u001a\u00020\n\"\u0004\b\u0000\u0010\u00052\u0016\b\u0001\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u000e\u0018\u00010\u00042\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u0001H\u0005H\u0007\u00a2\u0006\u0002\u0010\u0010J6\u00104\u001a\u00020\n\"\u0004\b\u0000\u0010\u00052\u0010\b\u0001\u0010\r\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u00042\u0014\u00105\u001a\u0010\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u00020\u001b\u0018\u000106H\u0007JF\u00104\u001a\u00020\n\"\u0004\b\u0000\u00107\"\u0004\b\u0001\u001082\u0016\b\u0001\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u0002H7\u0012\u0004\u0012\u0002H8\u0018\u00010\u00192\u0018\u00105\u001a\u0014\u0012\u0004\u0012\u0002H7\u0012\u0004\u0012\u0002H8\u0012\u0004\u0012\u00020\u001b09H\u0007JE\u0010:\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\b\"\b\b\u0000\u0010\u0005*\u00020\u00012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\u000b2\f\u0010;\u001a\b\u0012\u0004\u0012\u0002H\u00050<2\u0006\u0010=\u001a\u00020\u001bH\u0007\u00a2\u0006\u0002\u0010>J\u0018\u0010?\u001a\u00020@2\u000e\b\u0001\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000bH\u0007J\"\u0010?\u001a\u00020@2\u000e\b\u0001\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b2\b\b\u0001\u0010A\u001a\u00020@H\u0007\u00a8\u0006B"}, d2 = {"Lpub/gll/onepeas/libbase/util/CollectionUtils;", "", "()V", "addAll", "", "T", "to", "from", "", "(Ljava/util/Collection;[Ljava/lang/Object;)Ljava/util/Collection;", "", "", "addWeakReference", "collection", "Ljava/lang/ref/WeakReference;", "obj", "(Ljava/util/Collection;Ljava/lang/Object;)V", "arrayToList", "", "elements", "([Ljava/lang/Object;)Ljava/util/List;", "clear", "sparseArray", "Landroid/util/SparseArray;", "map", "", "contains", "", "equals", "collection1", "collection2", "getElement", "list", "", "pos", "", "(Ljava/util/List;I)Ljava/lang/Object;", "getFirstElement", "(Ljava/util/List;)Ljava/lang/Object;", "getSize", "sparse", "", "isEmpty", "newArrayList", "Ljava/util/ArrayList;", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "removeElement", "removeFirstElement", "removeRange", "fromIndex", "toIndex", "removeWeakReference", "removeWhen", "predicate", "Lkotlin/Function1;", "K", "V", "Lkotlin/Function2;", "toArray", "clazz", "Ljava/lang/Class;", "includeNull", "(Ljava/util/Collection;Ljava/lang/Class;Z)[Ljava/lang/Object;", "toString", "", "delimiter", "LibBase_debug"})
public final class CollectionUtils {
    @org.jetbrains.annotations.NotNull()
    public static final pub.gll.onepeas.libbase.util.CollectionUtils INSTANCE = null;
    
    private CollectionUtils() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean isEmpty(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    java.util.Collection<?> collection) {
        return false;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean isEmpty(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    java.util.Map<?, ?> map) {
        return false;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean isEmpty(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    android.util.SparseArray<?> sparse) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final <T extends java.lang.Object>T getElement(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    java.util.List<? extends T> list, int pos) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final <T extends java.lang.Object>T getFirstElement(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    java.util.List<? extends T> list) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final <T extends java.lang.Object>T removeFirstElement(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    java.util.List<? extends T> list) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final <T extends java.lang.Object>T removeElement(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    java.util.List<? extends T> list, int pos) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean equals(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    java.util.Collection<?> collection1, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    java.util.Collection<?> collection2) {
        return false;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean contains(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    java.util.Collection<?> collection, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    java.lang.Object obj) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String toString(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    java.util.Collection<?> collection) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String toString(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    java.util.Collection<?> collection, @org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    java.lang.String delimiter) {
        return null;
    }
    
    @androidx.annotation.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final <T extends java.lang.Object>void addAll(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    java.util.Collection<T> to, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    java.util.Collection<? extends T> from) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final <T extends java.lang.Object>java.util.Collection<T> addAll(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    java.util.Collection<T> to, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    T[] from) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void clear(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    java.util.Collection<?> collection) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void clear(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    java.util.Map<?, ?> map) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void clear(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    android.util.SparseArray<?> sparseArray) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final int getSize(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    java.util.Collection<?> collection) {
        return 0;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final int getSize(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    java.util.Map<?, ?> map) {
        return 0;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final int getSize(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    android.util.SparseArray<?> sparse) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    @kotlin.jvm.JvmStatic()
    public static final <T extends java.lang.Object>T[] toArray(@org.jetbrains.annotations.Nullable()
    java.util.Collection<? extends T> list, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> clazz, boolean includeNull) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final <T extends java.lang.Object>void addWeakReference(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    java.util.Collection<java.lang.ref.WeakReference<T>> collection, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    T obj) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final <T extends java.lang.Object>void removeWeakReference(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    java.util.Collection<java.lang.ref.WeakReference<T>> collection, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    T obj) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final <T extends java.lang.Object>void removeWhen(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    java.util.Collection<T> collection, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> predicate) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final <K extends java.lang.Object, V extends java.lang.Object>void removeWhen(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    java.util.Map<K, V> map, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super K, ? super V, java.lang.Boolean> predicate) {
    }
    
    /**
     * remove all elements from fromIndex to toIndex, include fromIndex and toIndex
     */
    @kotlin.jvm.JvmStatic()
    public static final <T extends java.lang.Object>void removeRange(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    java.util.List<T> list, int fromIndex, int toIndex) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final <T extends java.lang.Object>java.util.ArrayList<T> newArrayList(@org.jetbrains.annotations.NotNull()
    T... elements) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final <T extends java.lang.Object>java.util.ArrayList<T> newArrayList(@org.jetbrains.annotations.Nullable()
    java.util.Collection<? extends T> elements) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final <T extends java.lang.Object>java.util.List<T> arrayToList(@org.jetbrains.annotations.Nullable()
    T[] elements) {
        return null;
    }
}