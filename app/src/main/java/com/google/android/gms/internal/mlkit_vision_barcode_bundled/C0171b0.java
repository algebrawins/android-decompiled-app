package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.b0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0171b0 extends E implements RandomAccess, InterfaceC0186g0, G0 {

    /* renamed from: M  reason: collision with root package name */
    public static final C0171b0 f2871M = new C0171b0(new int[0], 0, false);

    /* renamed from: K  reason: collision with root package name */
    public int[] f2872K;

    /* renamed from: L  reason: collision with root package name */
    public int f2873L;

    public C0171b0(int[] r12, int r22, boolean z3) {
        super(z3);
        this.f2872K = r12;
        this.f2873L = r22;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r5, Object obj) {
        int r02;
        int intValue = ((Integer) obj).intValue();
        e();
        if (r5 >= 0 && r5 <= (r02 = this.f2873L)) {
            int[] r12 = this.f2872K;
            if (r02 < r12.length) {
                System.arraycopy(r12, r5, r12, r5 + 1, r02 - r5);
            } else {
                int[] r03 = new int[((r02 * 3) / 2) + 1];
                System.arraycopy(r12, 0, r03, 0, r5);
                System.arraycopy(this.f2872K, r5, r03, r5 + 1, this.f2873L - r5);
                this.f2872K = r03;
            }
            this.f2872K[r5] = intValue;
            this.f2873L++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(D.C.x("Index:", r5, ", Size:", this.f2873L));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        Charset charset = AbstractC0192j0.f2920a;
        collection.getClass();
        if (!(collection instanceof C0171b0)) {
            return super.addAll(collection);
        }
        C0171b0 c0171b0 = (C0171b0) collection;
        int r02 = c0171b0.f2873L;
        if (r02 == 0) {
            return false;
        }
        int r22 = this.f2873L;
        if (Integer.MAX_VALUE - r22 >= r02) {
            int r23 = r22 + r02;
            int[] r03 = this.f2872K;
            if (r23 > r03.length) {
                this.f2872K = Arrays.copyOf(r03, r23);
            }
            System.arraycopy(c0171b0.f2872K, 0, this.f2872K, this.f2873L, c0171b0.f2873L);
            this.f2873L = r23;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.i0
    public final /* bridge */ /* synthetic */ i0 b(int r4) {
        if (r4 >= this.f2873L) {
            return new C0171b0(Arrays.copyOf(this.f2872K, r4), this.f2873L, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0171b0)) {
            return super.equals(obj);
        }
        C0171b0 c0171b0 = (C0171b0) obj;
        if (this.f2873L != c0171b0.f2873L) {
            return false;
        }
        int[] r6 = c0171b0.f2872K;
        for (int r12 = 0; r12 < this.f2873L; r12++) {
            if (this.f2872K[r12] != r6[r12]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int r22) {
        j(r22);
        return Integer.valueOf(this.f2872K[r22]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int r12 = 1;
        for (int r02 = 0; r02 < this.f2873L; r02++) {
            r12 = (r12 * 31) + this.f2872K[r02];
        }
        return r12;
    }

    public final void i(int r5) {
        e();
        int r02 = this.f2873L;
        int[] r12 = this.f2872K;
        if (r02 == r12.length) {
            int[] r22 = new int[((r02 * 3) / 2) + 1];
            System.arraycopy(r12, 0, r22, 0, r02);
            this.f2872K = r22;
        }
        int[] r03 = this.f2872K;
        int r13 = this.f2873L;
        this.f2873L = r13 + 1;
        r03[r13] = r5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int r02 = this.f2873L;
        for (int r22 = 0; r22 < r02; r22++) {
            if (this.f2872K[r22] == intValue) {
                return r22;
            }
        }
        return -1;
    }

    public final void j(int r5) {
        if (r5 >= 0 && r5 < this.f2873L) {
            return;
        }
        throw new IndexOutOfBoundsException(D.C.x("Index:", r5, ", Size:", this.f2873L));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int r5) {
        int r22;
        e();
        j(r5);
        int[] r02 = this.f2872K;
        int r12 = r02[r5];
        if (r5 < this.f2873L - 1) {
            System.arraycopy(r02, r5 + 1, r02, r5, (r22 - r5) - 1);
        }
        this.f2873L--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(r12);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int r3, int r4) {
        e();
        if (r4 >= r3) {
            int[] r02 = this.f2872K;
            System.arraycopy(r02, r4, r02, r3, this.f2873L - r4);
            this.f2873L -= r4 - r3;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int r3, Object obj) {
        int intValue = ((Integer) obj).intValue();
        e();
        j(r3);
        int[] r02 = this.f2872K;
        int r12 = r02[r3];
        r02[r3] = intValue;
        return Integer.valueOf(r12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2873L;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        i(((Integer) obj).intValue());
        return true;
    }
}
