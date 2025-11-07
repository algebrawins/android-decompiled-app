package C2;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class e implements List, Collection {
    @Override // java.util.List
    public final void add(int r12, Object obj) {
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
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        for (Object obj2 : this) {
            if (N2.g.a(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        N2.g.e(collection, "elements");
        Collection<Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    public abstract int e();

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        N2.g.e(collection, "other");
        if (size() != collection.size()) {
            return false;
        }
        Iterator it = collection.iterator();
        for (Object obj2 : this) {
            if (!N2.g.a(obj2, it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        int r22;
        int r12 = 1;
        for (Object obj : this) {
            int r13 = r12 * 31;
            if (obj != null) {
                r22 = obj.hashCode();
            } else {
                r22 = 0;
            }
            r12 = r13 + r22;
        }
        return r12;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        int r12 = 0;
        for (Object obj2 : this) {
            if (!N2.g.a(obj2, obj)) {
                r12++;
            } else {
                return r12;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (e() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new b(0, this);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (N2.g.a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new c(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int r22) {
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
    public final Object set(int r12, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return e();
    }

    @Override // java.util.List
    public final List subList(int r22, int r3) {
        return new d(this, r22, r3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return N2.g.h(this);
    }

    public final String toString() {
        return i.j(this, ", ", "[", "]", new a(0, this), 24);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int r22) {
        return new c(this, r22);
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
