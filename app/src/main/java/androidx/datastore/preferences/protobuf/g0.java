package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class g0 extends AbstractC0100b implements RandomAccess {

    /* renamed from: M  reason: collision with root package name */
    public static final g0 f2347M = new g0(new Object[0], 0, false);

    /* renamed from: K  reason: collision with root package name */
    public Object[] f2348K;

    /* renamed from: L  reason: collision with root package name */
    public int f2349L;

    public g0(Object[] objArr, int r22, boolean z3) {
        this.f2333J = z3;
        this.f2348K = objArr;
        this.f2349L = r22;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        e();
        int r02 = this.f2349L;
        Object[] objArr = this.f2348K;
        if (r02 == objArr.length) {
            this.f2348K = Arrays.copyOf(objArr, ((r02 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f2348K;
        int r12 = this.f2349L;
        this.f2349L = r12 + 1;
        objArr2[r12] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int r22) {
        h(r22);
        return this.f2348K[r22];
    }

    public final void h(int r4) {
        if (r4 >= 0 && r4 < this.f2349L) {
            return;
        }
        throw new IndexOutOfBoundsException("Index:" + r4 + ", Size:" + this.f2349L);
    }

    public final g0 i(int r4) {
        if (r4 >= this.f2349L) {
            return new g0(Arrays.copyOf(this.f2348K, r4), this.f2349L, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0100b, java.util.AbstractList, java.util.List
    public final Object remove(int r5) {
        int r22;
        e();
        h(r5);
        Object[] objArr = this.f2348K;
        Object obj = objArr[r5];
        if (r5 < this.f2349L - 1) {
            System.arraycopy(objArr, r5 + 1, objArr, r5, (r22 - r5) - 1);
        }
        this.f2349L--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int r3, Object obj) {
        e();
        h(r3);
        Object[] objArr = this.f2348K;
        Object obj2 = objArr[r3];
        objArr[r3] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2349L;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r5, Object obj) {
        int r02;
        e();
        if (r5 >= 0 && r5 <= (r02 = this.f2349L)) {
            Object[] objArr = this.f2348K;
            if (r02 < objArr.length) {
                System.arraycopy(objArr, r5, objArr, r5 + 1, r02 - r5);
            } else {
                Object[] objArr2 = new Object[((r02 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, r5);
                System.arraycopy(this.f2348K, r5, objArr2, r5 + 1, this.f2349L - r5);
                this.f2348K = objArr2;
            }
            this.f2348K[r5] = obj;
            this.f2349L++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("Index:" + r5 + ", Size:" + this.f2349L);
    }
}
