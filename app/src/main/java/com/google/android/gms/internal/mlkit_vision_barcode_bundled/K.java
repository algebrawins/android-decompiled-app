package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class K extends L {

    /* renamed from: L  reason: collision with root package name */
    public final byte[] f2809L;

    public K(byte[] bArr) {
        bArr.getClass();
        this.f2809L = bArr;
    }

    public final boolean A(K k3, int r5, int r6) {
        if (r6 <= k3.j()) {
            if (r5 + r6 <= k3.j()) {
                int z3 = z() + r6;
                int z4 = z();
                int z5 = k3.z() + r5;
                while (z4 < z3) {
                    if (this.f2809L[z4] != k3.f2809L[z5]) {
                        return false;
                    }
                    z4++;
                    z5++;
                }
                return true;
            }
            int j3 = k3.j();
            throw new IllegalArgumentException("Ran off end of other: " + r5 + ", " + r6 + ", " + j3);
        }
        int j4 = j();
        throw new IllegalArgumentException("Length too large: " + r6 + j4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.L
    public byte e(int r22) {
        return this.f2809L[r22];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof L) || j() != ((L) obj).j()) {
            return false;
        }
        if (j() == 0) {
            return true;
        }
        if (obj instanceof K) {
            K k3 = (K) obj;
            int r02 = this.f2813J;
            int r12 = k3.f2813J;
            if (r02 != 0 && r12 != 0 && r02 != r12) {
                return false;
            }
            return A(k3, 0, j());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.L
    public byte h(int r22) {
        return this.f2809L[r22];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.L
    public int j() {
        return this.f2809L.length;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.L
    public void k(int r22, int r3, int r4, byte[] bArr) {
        System.arraycopy(this.f2809L, r22, bArr, r3, r4);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.L
    public final int l() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.L
    public final boolean m() {
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.L
    public final int n(int r3, int r4, int r5) {
        int z3 = z() + r4;
        Charset charset = AbstractC0192j0.f2920a;
        for (int r42 = z3; r42 < z3 + r5; r42++) {
            r3 = (r3 * 31) + this.f2809L[r42];
        }
        return r3;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.L
    public final int o(int r22, int r3, int r4) {
        int z3 = z() + r3;
        AbstractC0187g1.f2904a.getClass();
        return C0173c.a(r22, z3, r4 + z3, this.f2809L);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.L
    public final L p(int r3, int r4) {
        int t3 = L.t(r3, r4, j());
        if (t3 == 0) {
            return L.f2812K;
        }
        return new J(this.f2809L, z() + r3, t3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.L
    public final String q(Charset charset) {
        return new String(this.f2809L, z(), j(), charset);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.L
    public final void r(M m3) {
        m3.w(this.f2809L, z(), j());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.L
    public final boolean s() {
        int z3 = z();
        AbstractC0187g1.f2904a.getClass();
        if (C0173c.a(0, z3, j() + z3, this.f2809L) != 0) {
            return false;
        }
        return true;
    }

    public int z() {
        return 0;
    }
}
