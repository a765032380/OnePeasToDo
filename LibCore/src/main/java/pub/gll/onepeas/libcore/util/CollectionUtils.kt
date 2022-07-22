package pub.gll.onepeas.libcore.util

import androidx.annotation.NonNull
import androidx.annotation.Nullable
import android.util.SparseArray
import java.lang.ref.WeakReference
import java.util.*

//@TypeDesc("集合工具类")
object CollectionUtils {

    @JvmStatic
    //@MethodDesc("判断任意集合是否为空")
    fun isEmpty(@Nullable collection: Collection<*>?): Boolean {
        return collection == null || collection.isEmpty()
    }

    @JvmStatic
    //@MethodDesc("判断Map是否为空")
    fun isEmpty(@Nullable map: Map<*, *>?): Boolean {
        return map == null || map.isEmpty()
    }

    @JvmStatic
    //@MethodDesc("判断SparseArray是否为空")
    fun isEmpty(@Nullable sparse: SparseArray<*>?): Boolean {
        return sparse == null || sparse.size() == 0
    }

    @JvmStatic
    @Nullable
    //@MethodDesc("获取列表指定位置元素")
    fun <T> getElement(@Nullable list: List<out T>?, pos: Int): T? {
        if (list == null || pos < 0 || pos >= list.size) {
            return null
        }
        return list[pos]
    }

    @JvmStatic
    @Nullable
    //@MethodDesc("获取列表第一个元素")
    fun <T> getFirstElement(@Nullable list: List<out T>?): T? {
        return getElement(list, 0)
    }

    @JvmStatic
    @Nullable
    //@MethodDesc("移除列表第一个元素")
    fun <T> removeFirstElement(@Nullable list: MutableList<out T>?): T? {
        if (list.isNullOrEmpty()) {
            return null
        }
        return list.removeAt(0)
    }

    @JvmStatic
    @Nullable
    //@MethodDesc("移除列表指定位置的元素")
    fun <T> removeElement(@Nullable list: MutableList<out T?>?, pos: Int): T? {
        if (list == null || pos < 0 || pos >= list.size) {
            return null
        }
        return list.removeAt(pos)
    }

    @JvmStatic
    //@MethodDesc("判断两个集合是元素是否相同")
    fun equals(@Nullable collection1: Collection<*>?, @Nullable collection2: Collection<*>?): Boolean {
        return collection1 == collection2
    }

    @JvmStatic
    //@MethodDesc("判断集合是否包含指定元素")
    fun contains(@Nullable collection: Collection<*>?, @Nullable obj: Any?): Boolean {
        return collection != null && collection.contains(obj)
    }

    @JvmStatic
    @NonNull
    //@MethodDesc("拼接集合元素")
    fun toString(@Nullable collection: Collection<*>?): String {
        return toString(collection, ",")
    }

    @JvmStatic
    @NonNull
    //@MethodDesc("使用指定分隔符拼接集合元素")
    fun toString(@Nullable collection: Collection<*>?, @NonNull delimiter: String): String {
        if (collection.isNullOrEmpty()) {
            return ""
        }
        val sb = StringBuilder()
        for (element in collection) {
            if (element == null) {
                continue
            }
            if (sb.isNotEmpty()) {
                sb.append(delimiter)
            }
            sb.append(element)
        }
        return sb.toString()
    }

    @JvmStatic
    @Nullable
    //@MethodDesc("将一个集合的所有元素添加到另一个集合")
    fun <T> addAll(@Nullable to: MutableCollection<T>?, @Nullable from: Collection<T>?) {
        if (to == null || from.isNullOrEmpty()) {
            return
        }
        to.addAll(from)
    }

    @JvmStatic
    @Nullable
    //@MethodDesc("将一个数组的所有元素添加到另一个集合")
    fun <T> addAll(@Nullable to: MutableCollection<T>?, @Nullable from: Array<T>?): MutableCollection<T>? {
        if (to == null || from.isNullOrEmpty()) {
            return to
        }
        to.addAll(from)
        return to
    }

    @JvmStatic
    //@MethodDesc("清除集合元素")
    fun clear(@Nullable collection: MutableCollection<*>?) {
        collection?.clear()
    }

    @JvmStatic
    //@MethodDesc("清除Map所有元素")
    fun clear(@Nullable map: MutableMap<*, *>?) {
        map?.clear()
    }

    @JvmStatic
    //@MethodDesc("清除SparseArray所有元素")
    fun clear(@Nullable sparseArray: SparseArray<*>?) {
        sparseArray?.clear()
    }

    @JvmStatic
    //@MethodDesc("获取集合大小")
    fun getSize(@Nullable collection: Collection<*>?): Int {
        return collection?.size ?: 0
    }

    @JvmStatic
    //@MethodDesc("获取Map大小")
    fun getSize(@Nullable map: Map<*, *>?): Int {
        return map?.size ?: 0
    }

    @JvmStatic
    //@MethodDesc("获取SparseArray大小")
    fun getSize(@Nullable sparse: SparseArray<*>?): Int {
        return sparse?.size() ?: 0
    }

    @JvmStatic
    @Nullable
    //@MethodDesc("将集合转换为数组")
    fun <T : Any> toArray(list: Collection<T>?, clazz: Class<T>, includeNull: Boolean): Array<T>? {
        if (list == null || list.isEmpty()) {
            return null
        }
        var len = 0
        for (element in list) {
            if (element != null || includeNull) {
                len++
            }
        }
        val array = java.lang.reflect.Array.newInstance(clazz, len) as Array<T>
        var index = 0
        for(element in list) {
            if (element != null || includeNull) {
                array[index++] = element
            }
        }
        return array
    }

    @JvmStatic
    //@MethodDesc("弱引用集合中添加一个元素")
    fun <T> addWeakReference(@Nullable collection: MutableCollection<WeakReference<T>>?, @Nullable obj: T?) {
        if (collection == null || obj == null) {
            return
        }
        var found = false
        val itr = collection.iterator()
        while (itr.hasNext()) {
            if (itr.next().get() === obj) {
                found = true
                break
            }
        }
        if (!found) {
            collection.add(WeakReference(obj))
        }
    }

    @JvmStatic
    //@MethodDesc("从弱引用集合中移除一个元素")
    fun <T> removeWeakReference(@Nullable collection: MutableCollection<WeakReference<T>>?, @Nullable obj: T?) {
        if (collection == null || obj == null) {
            return
        }
        val iterator = collection.iterator()
        var objWeakReference: WeakReference<T>? = null
        var found = false
        while (iterator.hasNext()) {
            objWeakReference = iterator.next()
            if (obj === objWeakReference.get()) {
                found = true
                break
            }
        }
        if (found) {
            collection.remove(objWeakReference)
        }
    }

    @JvmStatic
    //@MethodDesc("从集合中移除满足条件的元素")
    fun <T> removeWhen(@Nullable collection: MutableCollection<T>?, predicate: ((T) -> Boolean)?) {
        if (collection.isNullOrEmpty() || predicate == null) {
            return
        }
        val iterator = collection.iterator()
        while(iterator.hasNext()) {
            val next = iterator.next()
            if (predicate(next)) {
                iterator.remove()
            }
        }
    }

    @JvmStatic
    //@MethodDesc("从Map中移除满足条件的元素")
    fun <K, V> removeWhen(@Nullable map: MutableMap<K, V>?, predicate: (K, V) -> Boolean) {
        if (map.isNullOrEmpty()) {
            return
        }
        val iterator = map.iterator()
        while(iterator.hasNext()) {
            val entry = iterator.next()
            if (predicate(entry.key, entry.value)) {
                iterator.remove()
            }
        }
    }

    /**
     * remove all elements from fromIndex to toIndex, include fromIndex and toIndex
     */
    @JvmStatic
    //@MethodDesc("从列表中移除一个范围的元素")
    fun <T> removeRange(@Nullable list: MutableList<T>?, fromIndex: Int, toIndex: Int) {
        if (list.isNullOrEmpty()) {
            return
        }
        val startIndex = if (fromIndex < 0) 0 else fromIndex
        val endIndex = if (toIndex >= list.size) list.size - 1 else toIndex
        if (startIndex > endIndex) {
            return
        }
        for (i in endIndex downTo startIndex) {
            list.removeAt(i)
        }
    }

    @JvmStatic
    //@MethodDesc("创建包含指定元素的ArrayList")
    fun <T> newArrayList(vararg elements: T): ArrayList<T?> {
        val list = ArrayList<T?>()
        if (!elements.isNullOrEmpty()) {
            for (e in elements) {
                list.add(e)
            }
        }
        return list
    }

    @JvmStatic
    //@MethodDesc("创建包含指定元素的ArrayList")
    fun <T> newArrayList(elements: Collection<T?>?): ArrayList<T?> {
        val list = ArrayList<T?>()
        if (elements != null) {
            list.addAll(elements)
        }
        return list
    }

    @JvmStatic
    //@MethodDesc("创建包含指定元素的ArrayList")
    fun <T> arrayToList(elements: Array<T?>?): MutableList<T?> {
        if (elements == null)
            return mutableListOf()

        return elements.toMutableList()
    }
}