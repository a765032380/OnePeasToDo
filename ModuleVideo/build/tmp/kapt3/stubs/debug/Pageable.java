
import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\tH\u00c6\u0003J\t\u0010\u001a\u001a\u00020\tH\u00c6\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011\u00a8\u0006!"}, d2 = {"LPageable;", "", "sort", "LSort;", "pageSize", "", "pageNumber", "offset", "unpaged", "", "paged", "(LSort;IIIZZ)V", "getOffset", "()I", "getPageNumber", "getPageSize", "getPaged", "()Z", "getSort", "()LSort;", "getUnpaged", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "", "ModuleVideo_debug"})
public final class Pageable {
    @org.jetbrains.annotations.NotNull()
    private final Sort sort = null;
    private final int pageSize = 0;
    private final int pageNumber = 0;
    private final int offset = 0;
    private final boolean unpaged = false;
    private final boolean paged = false;
    
    @org.jetbrains.annotations.NotNull()
    public final Pageable copy(@org.jetbrains.annotations.NotNull()
    Sort sort, int pageSize, int pageNumber, int offset, boolean unpaged, boolean paged) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Pageable(@org.jetbrains.annotations.NotNull()
    Sort sort, int pageSize, int pageNumber, int offset, boolean unpaged, boolean paged) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final Sort component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final Sort getSort() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getPageSize() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getPageNumber() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getOffset() {
        return 0;
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean getUnpaged() {
        return false;
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final boolean getPaged() {
        return false;
    }
}