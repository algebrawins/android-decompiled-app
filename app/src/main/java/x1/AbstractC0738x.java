package x1;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: x1.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0738x extends AbstractCollection implements Serializable {

    /* renamed from: J  reason: collision with root package name */
    public static final Object[] f6126J = new Object[0];

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract int e(int r12, Object[] objArr);

    public int h() {
        throw new UnsupportedOperationException();
    }

    public int i() {
        throw new UnsupportedOperationException();
    }

    public Object[] j() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f6126J);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] j3 = j();
            if (j3 == null) {
                if (length != 0) {
                    objArr = Arrays.copyOf(objArr, 0);
                }
                objArr = Arrays.copyOf(objArr, size);
            } else {
                return Arrays.copyOfRange(j3, i(), h(), objArr.getClass());
            }
        } else if (length > size) {
            objArr[size] = null;
        }
        e(0, objArr);
        return objArr;
    }
}
