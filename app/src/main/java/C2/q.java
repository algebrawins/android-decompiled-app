package C2;

import D.C;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class q implements List, Serializable, RandomAccess {

    /* renamed from: J  reason: collision with root package name */
    public static final q f272J = new Object();

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int r12, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int r12, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        N2.g.e((Void) obj, "element");
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        N2.g.e(collection, "elements");
        return collection.isEmpty();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        if ((obj instanceof List) && ((List) obj).isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int r4) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + r4 + '.');
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return 1;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        N2.g.e((Void) obj, "element");
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return p.f271J;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Void)) {
            return -1;
        }
        N2.g.e((Void) obj, "element");
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return p.f271J;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int r22) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int r12, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return 0;
    }

    @Override // java.util.List
    public final List subList(int r4, int r5) {
        if (r4 == 0 && r5 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException(C.x("fromIndex: ", r4, ", toIndex: ", r5));
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return N2.g.h(this);
    }

    public final String toString() {
        return "[]";
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int r3) {
        if (r3 == 0) {
            return p.f271J;
        }
        throw new IndexOutOfBoundsException(C.w("Index: ", r3));
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        N2.g.e(objArr, "array");
        return N2.g.i(this, objArr);
    }
}
