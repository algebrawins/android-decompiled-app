package x1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class C extends AbstractC0738x implements List, RandomAccess {

    /* renamed from: K  reason: collision with root package name */
    public static final C0562A f5509K = new C0562A(G.f5558N, 0);

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

    @Override // x1.AbstractC0738x
    public int e(int r5, Object[] objArr) {
        int size = size();
        for (int r12 = 0; r12 < size; r12++) {
            objArr[r5 + r12] = get(r12);
        }
        return r5 + size;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int r3 = 0; r3 < size; r3++) {
                        if (AbstractC0617g5.a(get(r3), list.get(r3))) {
                        }
                    }
                    return true;
                }
                C0562A listIterator = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (listIterator.hasNext()) {
                        if (it.hasNext()) {
                            if (!AbstractC0617g5.a(listIterator.next(), it.next())) {
                                break;
                            }
                        } else {
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
    public C subList(int r22, int r3) {
        AbstractC0625h5.b(r22, r3, size());
        int r32 = r3 - r22;
        if (r32 == size()) {
            return this;
        }
        if (r32 == 0) {
            return G.f5558N;
        }
        return new B(this, r22, r32);
    }

    @Override // java.util.List
    /* renamed from: l */
    public final C0562A listIterator(int r4) {
        int size = size();
        if (r4 >= 0 && r4 <= size) {
            if (isEmpty()) {
                return f5509K;
            }
            return new C0562A(this, r4);
        }
        throw new IndexOutOfBoundsException(AbstractC0625h5.d(r4, size, "index"));
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
