package y1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import x1.AbstractC0665n5;

/* loaded from: classes.dex */
public abstract class V4 extends AbstractC0866n4 implements List, RandomAccess {

    /* renamed from: K  reason: collision with root package name */
    public static final T4 f6318K = new T4(X4.f6326N, 0);

    @Override // java.util.List
    public final void add(int r12, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int r12, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // y1.AbstractC0866n4
    public int e(Object[] objArr) {
        int size = size();
        for (int r12 = 0; r12 < size; r12++) {
            objArr[r12] = get(r12);
        }
        return size;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int r3 = 0; r3 < size; r3++) {
                        Object obj2 = get(r3);
                        Object obj3 = list.get(r3);
                        if (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) {
                        }
                    }
                    return true;
                }
                T4 listIterator = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (listIterator.hasNext()) {
                        if (!it.hasNext() || ((next = listIterator.next()) != (next2 = it.next()) && (next == null || !next.equals(next2)))) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int r22 = 1;
        for (int r12 = 0; r12 < size; r12++) {
            r22 = (r22 * 31) + get(r12).hashCode();
        }
        return r22;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int r22 = 0; r22 < size; r22++) {
            if (obj.equals(get(r22))) {
                return r22;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: k */
    public V4 subList(int r22, int r3) {
        AbstractC0665n5.b(r22, r3, size());
        int r32 = r3 - r22;
        if (r32 == size()) {
            return this;
        }
        if (r32 == 0) {
            return X4.f6326N;
        }
        return new U4(this, r22, r32);
    }

    @Override // java.util.List
    /* renamed from: l */
    public final T4 listIterator(int r4) {
        int size = size();
        if (r4 >= 0 && r4 <= size) {
            if (isEmpty()) {
                return f6318K;
            }
            return new T4(this, r4);
        }
        throw new IndexOutOfBoundsException(AbstractC0665n5.c(r4, size, "index"));
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int r12) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int r12, Object obj) {
        throw new UnsupportedOperationException();
    }
}
