package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class V0 {

    /* renamed from: f  reason: collision with root package name */
    public static final V0 f2856f = new V0(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f2857a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f2858b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f2859c;

    /* renamed from: d  reason: collision with root package name */
    public int f2860d = -1;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2861e;

    public V0(int r22, int[] r3, Object[] objArr, boolean z3) {
        this.f2857a = r22;
        this.f2858b = r3;
        this.f2859c = objArr;
        this.f2861e = z3;
    }

    public static V0 b() {
        return new V0(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int r22 = this.f2860d;
        if (r22 == -1) {
            int r3 = 0;
            for (int r23 = 0; r23 < this.f2857a; r23++) {
                int r4 = this.f2858b[r23];
                int r5 = r4 >>> 3;
                int r42 = r4 & 7;
                if (r42 != 0) {
                    if (r42 != 1) {
                        if (r42 != 2) {
                            if (r42 != 3) {
                                if (r42 == 5) {
                                    ((Integer) this.f2859c[r23]).getClass();
                                    r3 = D.C.r(r5 << 3, 4, r3);
                                } else {
                                    int r12 = C0198l0.f2941J;
                                    throw new IllegalStateException(new IOException("Protocol message tag had invalid wire type."));
                                }
                            } else {
                                int r43 = r5 << 3;
                                Logger logger = M.g;
                                int a4 = ((V0) this.f2859c[r23]).a();
                                int L3 = M.L(r43);
                                r3 = L3 + L3 + a4 + r3;
                            }
                        } else {
                            Logger logger2 = M.g;
                            int j3 = ((L) this.f2859c[r23]).j();
                            r3 = D.C.r(r5 << 3, M.L(j3) + j3, r3);
                        }
                    } else {
                        ((Long) this.f2859c[r23]).getClass();
                        r3 = D.C.r(r5 << 3, 8, r3);
                    }
                } else {
                    r3 = D.C.r(r5 << 3, M.M(((Long) this.f2859c[r23]).longValue()), r3);
                }
            }
            this.f2860d = r3;
            return r3;
        }
        return r22;
    }

    public final void c(int r3, Object obj) {
        if (this.f2861e) {
            e(this.f2857a + 1);
            int[] r02 = this.f2858b;
            int r12 = this.f2857a;
            r02[r12] = r3;
            this.f2859c[r12] = obj;
            this.f2857a = r12 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void d(C0220v0 c0220v0) {
        if (this.f2857a != 0) {
            for (int r12 = 0; r12 < this.f2857a; r12++) {
                int r22 = this.f2858b[r12];
                Object obj = this.f2859c[r12];
                int r4 = r22 & 7;
                int r23 = r22 >>> 3;
                if (r4 != 0) {
                    if (r4 != 1) {
                        if (r4 != 2) {
                            if (r4 != 3) {
                                if (r4 == 5) {
                                    c0220v0.j(r23, ((Integer) obj).intValue());
                                } else {
                                    int r02 = C0198l0.f2941J;
                                    throw new RuntimeException(new IOException("Protocol message tag had invalid wire type."));
                                }
                            } else {
                                ((M) c0220v0.f2985a).D(r23, 3);
                                ((V0) obj).d(c0220v0);
                                ((M) c0220v0.f2985a).D(r23, 4);
                            }
                        } else {
                            c0220v0.g(r23, (L) obj);
                        }
                    } else {
                        c0220v0.k(((Long) obj).longValue(), r23);
                    }
                } else {
                    c0220v0.o(((Long) obj).longValue(), r23);
                }
            }
        }
    }

    public final void e(int r4) {
        int[] r02 = this.f2858b;
        if (r4 > r02.length) {
            int r12 = this.f2857a;
            int r22 = (r12 / 2) + r12;
            if (r22 >= r4) {
                r4 = r22;
            }
            if (r4 < 8) {
                r4 = 8;
            }
            this.f2858b = Arrays.copyOf(r02, r4);
            this.f2859c = Arrays.copyOf(this.f2859c, r4);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof V0)) {
            return false;
        }
        V0 v02 = (V0) obj;
        int r22 = this.f2857a;
        if (r22 == v02.f2857a) {
            int[] r3 = this.f2858b;
            int[] r4 = v02.f2858b;
            int r5 = 0;
            while (true) {
                if (r5 < r22) {
                    if (r3[r5] != r4[r5]) {
                        break;
                    }
                    r5++;
                } else {
                    Object[] objArr = this.f2859c;
                    Object[] objArr2 = v02.f2859c;
                    int r32 = this.f2857a;
                    for (int r42 = 0; r42 < r32; r42++) {
                        if (objArr[r42].equals(objArr2[r42])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int r02 = this.f2857a;
        int r12 = r02 + 527;
        int[] r22 = this.f2858b;
        int r4 = 17;
        int r6 = 17;
        for (int r5 = 0; r5 < r02; r5++) {
            r6 = (r6 * 31) + r22[r5];
        }
        int r13 = (r12 * 31) + r6;
        Object[] objArr = this.f2859c;
        int r23 = this.f2857a;
        for (int r3 = 0; r3 < r23; r3++) {
            r4 = (r4 * 31) + objArr[r3].hashCode();
        }
        return (r13 * 31) + r4;
    }
}
