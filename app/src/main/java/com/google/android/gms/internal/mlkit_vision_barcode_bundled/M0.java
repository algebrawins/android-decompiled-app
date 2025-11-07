package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class M0 extends L {

    /* renamed from: Q  reason: collision with root package name */
    public static final int[] f2821Q = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: L  reason: collision with root package name */
    public final int f2822L;

    /* renamed from: M  reason: collision with root package name */
    public final L f2823M;

    /* renamed from: N  reason: collision with root package name */
    public final L f2824N;

    /* renamed from: O  reason: collision with root package name */
    public final int f2825O;

    /* renamed from: P  reason: collision with root package name */
    public final int f2826P;

    public M0(L l3, L l4) {
        this.f2823M = l3;
        this.f2824N = l4;
        int j3 = l3.j();
        this.f2825O = j3;
        this.f2822L = l4.j() + j3;
        this.f2826P = Math.max(l3.l(), l4.l()) + 1;
    }

    public static int z(int r22) {
        int[] r02 = f2821Q;
        if (r22 >= 47) {
            return Integer.MAX_VALUE;
        }
        return r02[r22];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.L
    public final byte e(int r22) {
        L.y(r22, this.f2822L);
        return h(r22);
    }

    public final boolean equals(Object obj) {
        boolean A3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l3 = (L) obj;
        int j3 = l3.j();
        int r3 = this.f2822L;
        if (r3 != j3) {
            return false;
        }
        if (r3 == 0) {
            return true;
        }
        int r12 = this.f2813J;
        int r4 = l3.f2813J;
        if (r12 != 0 && r4 != 0 && r12 != r4) {
            return false;
        }
        L0 l02 = new L0(this);
        K next = l02.next();
        L0 l03 = new L0(l3);
        K next2 = l03.next();
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        while (true) {
            int j4 = next.j() - r6;
            int j5 = next2.j() - r7;
            int min = Math.min(j4, j5);
            if (r6 == 0) {
                A3 = next.A(next2, r7, min);
            } else {
                A3 = next2.A(next, r6, min);
            }
            if (!A3) {
                return false;
            }
            r8 += min;
            if (r8 >= r3) {
                if (r8 == r3) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == j4) {
                next = l02.next();
                r6 = 0;
            } else {
                r6 += min;
            }
            if (min == j5) {
                next2 = l03.next();
                r7 = 0;
            } else {
                r7 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.L
    public final byte h(int r3) {
        int r02 = this.f2825O;
        if (r3 < r02) {
            return this.f2823M.h(r3);
        }
        return this.f2824N.h(r3 - r02);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.L, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new K0(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.L
    public final int j() {
        return this.f2822L;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.L
    public final void k(int r4, int r5, int r6, byte[] bArr) {
        int r02 = r4 + r6;
        L l3 = this.f2823M;
        int r22 = this.f2825O;
        if (r02 <= r22) {
            l3.k(r4, r5, r6, bArr);
            return;
        }
        L l4 = this.f2824N;
        if (r4 >= r22) {
            l4.k(r4 - r22, r5, r6, bArr);
            return;
        }
        int r23 = r22 - r4;
        l3.k(r4, r5, r23, bArr);
        l4.k(0, r5 + r23, r6 - r23, bArr);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.L
    public final int l() {
        return this.f2826P;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.L
    public final boolean m() {
        if (this.f2822L >= z(this.f2826P)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.L
    public final int n(int r4, int r5, int r6) {
        int r02 = r5 + r6;
        L l3 = this.f2823M;
        int r22 = this.f2825O;
        if (r02 <= r22) {
            return l3.n(r4, r5, r6);
        }
        L l4 = this.f2824N;
        if (r5 >= r22) {
            return l4.n(r4, r5 - r22, r6);
        }
        int r23 = r22 - r5;
        return l4.n(l3.n(r4, r5, r23), 0, r6 - r23);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.L
    public final int o(int r4, int r5, int r6) {
        int r02 = r5 + r6;
        L l3 = this.f2823M;
        int r22 = this.f2825O;
        if (r02 <= r22) {
            return l3.o(r4, r5, r6);
        }
        L l4 = this.f2824N;
        if (r5 >= r22) {
            return l4.o(r4, r5 - r22, r6);
        }
        int r23 = r22 - r5;
        return l4.o(l3.o(r4, r5, r23), 0, r6 - r23);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.L
    public final L p(int r5, int r6) {
        int r02 = this.f2822L;
        int t3 = L.t(r5, r6, r02);
        if (t3 == 0) {
            return L.f2812K;
        }
        if (t3 == r02) {
            return this;
        }
        L l3 = this.f2823M;
        int r12 = this.f2825O;
        if (r6 <= r12) {
            return l3.p(r5, r6);
        }
        L l4 = this.f2824N;
        if (r5 >= r12) {
            return l4.p(r5 - r12, r6 - r12);
        }
        return new M0(l3.p(r5, l3.j()), l4.p(0, r6 - r12));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.L
    public final String q(Charset charset) {
        byte[] bArr;
        int j3 = j();
        if (j3 == 0) {
            bArr = AbstractC0192j0.f2921b;
        } else {
            byte[] bArr2 = new byte[j3];
            k(0, 0, j3, bArr2);
            bArr = bArr2;
        }
        return new String(bArr, charset);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.L
    public final void r(M m3) {
        this.f2823M.r(m3);
        this.f2824N.r(m3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.L
    public final boolean s() {
        int o3 = this.f2823M.o(0, 0, this.f2825O);
        L l3 = this.f2824N;
        if (l3.o(o3, 0, l3.j()) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.L
    public final I u() {
        return new K0(this);
    }
}
