
import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0011H\u00c6\u0003J\t\u0010$\u001a\u00020\u0006H\u00c6\u0003J\t\u0010%\u001a\u00020\bH\u00c6\u0003J\t\u0010&\u001a\u00020\bH\u00c6\u0003J\t\u0010\'\u001a\u00020\u000bH\u00c6\u0003J\t\u0010(\u001a\u00020\bH\u00c6\u0003J\t\u0010)\u001a\u00020\bH\u00c6\u0003J\t\u0010*\u001a\u00020\bH\u00c6\u0003J\t\u0010+\u001a\u00020\u000bH\u00c6\u0003Js\u0010,\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u00c6\u0001J\u0013\u0010-\u001a\u00020\u000b2\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u00020\bH\u00d6\u0001J\t\u00100\u001a\u000201H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\r\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019\u00a8\u00062"}, d2 = {"LJson4Kotlin_Base;", "", "content", "", "Lpub/gll/modulevideo/model/VideoItemModel;", "pageable", "LPageable;", "totalPages", "", "totalElements", "last", "", "size", "number", "numberOfElements", "first", "sort", "LSort;", "(Ljava/util/List;LPageable;IIZIIIZLSort;)V", "getContent", "()Ljava/util/List;", "getFirst", "()Z", "getLast", "getNumber", "()I", "getNumberOfElements", "getPageable", "()LPageable;", "getSize", "getSort", "()LSort;", "getTotalElements", "getTotalPages", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "ModuleVideo_debug"})
public final class Json4Kotlin_Base {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<pub.gll.modulevideo.model.VideoItemModel> content = null;
    @org.jetbrains.annotations.NotNull()
    private final Pageable pageable = null;
    private final int totalPages = 0;
    private final int totalElements = 0;
    private final boolean last = false;
    private final int size = 0;
    private final int number = 0;
    private final int numberOfElements = 0;
    private final boolean first = false;
    @org.jetbrains.annotations.NotNull()
    private final Sort sort = null;
    
    @org.jetbrains.annotations.NotNull()
    public final Json4Kotlin_Base copy(@org.jetbrains.annotations.NotNull()
    java.util.List<pub.gll.modulevideo.model.VideoItemModel> content, @org.jetbrains.annotations.NotNull()
    Pageable pageable, int totalPages, int totalElements, boolean last, int size, int number, int numberOfElements, boolean first, @org.jetbrains.annotations.NotNull()
    Sort sort) {
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
    
    public Json4Kotlin_Base(@org.jetbrains.annotations.NotNull()
    java.util.List<pub.gll.modulevideo.model.VideoItemModel> content, @org.jetbrains.annotations.NotNull()
    Pageable pageable, int totalPages, int totalElements, boolean last, int size, int number, int numberOfElements, boolean first, @org.jetbrains.annotations.NotNull()
    Sort sort) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<pub.gll.modulevideo.model.VideoItemModel> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<pub.gll.modulevideo.model.VideoItemModel> getContent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final Pageable component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final Pageable getPageable() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getTotalPages() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getTotalElements() {
        return 0;
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean getLast() {
        return false;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getSize() {
        return 0;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getNumber() {
        return 0;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getNumberOfElements() {
        return 0;
    }
    
    public final boolean component9() {
        return false;
    }
    
    public final boolean getFirst() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final Sort component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final Sort getSort() {
        return null;
    }
}