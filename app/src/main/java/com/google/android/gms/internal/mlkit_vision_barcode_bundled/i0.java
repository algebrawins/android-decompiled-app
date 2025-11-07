package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class I0 extends E implements RandomAccess {

    /* renamed from: M  reason: collision with root package name */
    public static final I0 f2800M = new I0(new Object[0], 0, false);

    /* renamed from: K  reason: collision with root package name */
    public Object[] f2801K;

    /* renamed from: L  reason: collision with root package name */
    public int f2802L;

    public I0(Object[] objArr, int r22, boolean z3) {
        super(z3);
        this.f2801K = objArr;
        this.f2802L = r22;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r5, Object obj) {
        int r02;
        e();
        if (r5 >= 0 && r5 <= (r02 = this.f2802L)) {
            Object[] objArr = this.f2801K;
            if (r02 < objArr.length) {
                System.arraycopy(objArr, r5, objArr, r5 + 1, r02 - r5);
            } else {
                Object[] objArr2 = new Object[((r02 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, r5);
                System.arraycopy(this.f2801K, r5, objArr2, r5 + 1, this.f2802L - r5);
                this.f2801K = objArr2;
            }
            this.f2801K[r5] = obj;
            this.f2802L++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(D.C.x("Index:", r5, ", Size:", this.f2802L));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.i0
    public final /* bridge */ /* synthetic */ i0 b(int r4) {
        if (r4 >= this.f2802L) {
            return new I0(Arrays.copyOf(this.f2801K, r4), this.f2802L, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int r22) {
        i(r22);
        return this.f2801K[r22];
    }

    public final void i(int r5) {
        if (r5 >= 0 && r5 < this.f2802L) {
            return;
        }
        throw new IndexOutOfBoundsException(D.C.x("Index:", r5, ", Size:", this.f2802L));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E, java.util.AbstractList, java.util.List
    public final Object remove(int r5) {
        int r22;
        e();
        i(r5);
        Object[] objArr = this.f2801K;
        Object obj = objArr[r5];
        if (r5 < this.f2802L - 1) {
            System.arraycopy(objArr, r5 + 1, objArr, r5, (r22 - r5) - 1);
        }
        this.f2802L--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int r3, Object obj) {
        e();
        i(r3);
        Object[] objArr = this.f2801K;
        Object obj2 = objArr[r3];
        objArr[r3] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2802L;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        e();
        int r02 = this.f2802L;
        Object[] objArr = this.f2801K;
        if (r02 == objArr.length) {
            this.f2801K = Arrays.copyOf(objArr, ((r02 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f2801K;
        int r12 = this.f2802L;
        this.f2802L = r12 + 1;
        objArr2[r12] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
