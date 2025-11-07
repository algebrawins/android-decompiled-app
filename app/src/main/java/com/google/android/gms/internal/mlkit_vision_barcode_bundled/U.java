package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class U extends E implements RandomAccess, InterfaceC0183f0, G0 {

    /* renamed from: M  reason: collision with root package name */
    public static final U f2851M = new U(new float[0], 0, false);

    /* renamed from: K  reason: collision with root package name */
    public float[] f2852K;

    /* renamed from: L  reason: collision with root package name */
    public int f2853L;

    public U(float[] fArr, int r22, boolean z3) {
        super(z3);
        this.f2852K = fArr;
        this.f2853L = r22;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r5, Object obj) {
        int r02;
        float floatValue = ((Float) obj).floatValue();
        e();
        if (r5 >= 0 && r5 <= (r02 = this.f2853L)) {
            float[] fArr = this.f2852K;
            if (r02 < fArr.length) {
                System.arraycopy(fArr, r5, fArr, r5 + 1, r02 - r5);
            } else {
                float[] fArr2 = new float[((r02 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, r5);
                System.arraycopy(this.f2852K, r5, fArr2, r5 + 1, this.f2853L - r5);
                this.f2852K = fArr2;
            }
            this.f2852K[r5] = floatValue;
            this.f2853L++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(D.C.x("Index:", r5, ", Size:", this.f2853L));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        Charset charset = AbstractC0192j0.f2920a;
        collection.getClass();
        if (!(collection instanceof U)) {
            return super.addAll(collection);
        }
        U u3 = (U) collection;
        int r02 = u3.f2853L;
        if (r02 == 0) {
            return false;
        }
        int r22 = this.f2853L;
        if (Integer.MAX_VALUE - r22 >= r02) {
            int r23 = r22 + r02;
            float[] fArr = this.f2852K;
            if (r23 > fArr.length) {
                this.f2852K = Arrays.copyOf(fArr, r23);
            }
            System.arraycopy(u3.f2852K, 0, this.f2852K, this.f2853L, u3.f2853L);
            this.f2853L = r23;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.i0
    public final i0 b(int r4) {
        if (r4 >= this.f2853L) {
            return new U(Arrays.copyOf(this.f2852K, r4), this.f2853L, true);
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
        if (!(obj instanceof U)) {
            return super.equals(obj);
        }
        U u3 = (U) obj;
        if (this.f2853L != u3.f2853L) {
            return false;
        }
        float[] fArr = u3.f2852K;
        for (int r12 = 0; r12 < this.f2853L; r12++) {
            if (Float.floatToIntBits(this.f2852K[r12]) != Float.floatToIntBits(fArr[r12])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int r22) {
        j(r22);
        return Float.valueOf(this.f2852K[r22]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int r12 = 1;
        for (int r02 = 0; r02 < this.f2853L; r02++) {
            r12 = (r12 * 31) + Float.floatToIntBits(this.f2852K[r02]);
        }
        return r12;
    }

    public final void i(float f2) {
        e();
        int r02 = this.f2853L;
        float[] fArr = this.f2852K;
        if (r02 == fArr.length) {
            float[] fArr2 = new float[((r02 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, r02);
            this.f2852K = fArr2;
        }
        float[] fArr3 = this.f2852K;
        int r12 = this.f2853L;
        this.f2853L = r12 + 1;
        fArr3[r12] = f2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int r02 = this.f2853L;
        for (int r22 = 0; r22 < r02; r22++) {
            if (this.f2852K[r22] == floatValue) {
                return r22;
            }
        }
        return -1;
    }

    public final void j(int r5) {
        if (r5 >= 0 && r5 < this.f2853L) {
            return;
        }
        throw new IndexOutOfBoundsException(D.C.x("Index:", r5, ", Size:", this.f2853L));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int r5) {
        int r22;
        e();
        j(r5);
        float[] fArr = this.f2852K;
        float f2 = fArr[r5];
        if (r5 < this.f2853L - 1) {
            System.arraycopy(fArr, r5 + 1, fArr, r5, (r22 - r5) - 1);
        }
        this.f2853L--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int r3, int r4) {
        e();
        if (r4 >= r3) {
            float[] fArr = this.f2852K;
            System.arraycopy(fArr, r4, fArr, r3, this.f2853L - r4);
            this.f2853L -= r4 - r3;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int r3, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        e();
        j(r3);
        float[] fArr = this.f2852K;
        float f2 = fArr[r3];
        fArr[r3] = floatValue;
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2853L;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.E, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        i(((Float) obj).floatValue());
        return true;
    }
}
