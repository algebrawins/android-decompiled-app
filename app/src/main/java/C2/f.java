package C2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class f implements Collection {

    /* renamed from: J  reason: collision with root package name */
    public final Object[] f261J;

    /* renamed from: K  reason: collision with root package name */
    public final boolean f262K;

    public f(Object[] objArr, boolean z3) {
        this.f261J = objArr;
        this.f262K = z3;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        int r22;
        Object[] objArr = this.f261J;
        N2.g.e(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length;
            r22 = 0;
            while (r22 < length) {
                if (objArr[r22] == null) {
                    break;
                }
                r22++;
            }
            r22 = -1;
        } else {
            int length2 = objArr.length;
            for (int r3 = 0; r3 < length2; r3++) {
                if (obj.equals(objArr[r3])) {
                    r22 = r3;
                    break;
                }
            }
            r22 = -1;
        }
        if (r22 < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
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

    @Override // java.util.Collection
    public final boolean isEmpty() {
        if (this.f261J.length == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new b(1, this.f261J);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f261J.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.f261J;
        if (this.f262K && objArr.getClass().equals(Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        N2.g.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        N2.g.e(objArr, "array");
        return N2.g.i(this, objArr);
    }
}
