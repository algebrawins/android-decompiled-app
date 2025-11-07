package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: f  reason: collision with root package name */
    public static final p0 f2404f = new p0(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f2405a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f2406b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f2407c;

    /* renamed from: d  reason: collision with root package name */
    public int f2408d = -1;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2409e;

    public p0(int r22, int[] r3, Object[] objArr, boolean z3) {
        this.f2405a = r22;
        this.f2406b = r3;
        this.f2407c = objArr;
        this.f2409e = z3;
    }

    public final void a(int r4) {
        int[] r02 = this.f2406b;
        if (r4 > r02.length) {
            int r12 = this.f2405a;
            int r22 = (r12 / 2) + r12;
            if (r22 >= r4) {
                r4 = r22;
            }
            if (r4 < 8) {
                r4 = 8;
            }
            this.f2406b = Arrays.copyOf(r02, r4);
            this.f2407c = Arrays.copyOf(this.f2407c, r4);
        }
    }

    public final int b() {
        int A3;
        int r02 = this.f2408d;
        if (r02 != -1) {
            return r02;
        }
        int r12 = 0;
        for (int r03 = 0; r03 < this.f2405a; r03++) {
            int r22 = this.f2406b[r03];
            int r3 = r22 >>> 3;
            int r23 = r22 & 7;
            if (r23 != 0) {
                if (r23 != 1) {
                    if (r23 != 2) {
                        if (r23 != 3) {
                            if (r23 == 5) {
                                ((Integer) this.f2407c[r03]).getClass();
                                A3 = C0116n.l(r3);
                            } else {
                                throw new IllegalStateException(I.b());
                            }
                        } else {
                            r12 = ((p0) this.f2407c[r03]).b() + (C0116n.x(r3) * 2) + r12;
                        }
                    } else {
                        A3 = C0116n.h(r3, (C0111h) this.f2407c[r03]);
                    }
                } else {
                    ((Long) this.f2407c[r03]).getClass();
                    A3 = C0116n.m(r3);
                }
            } else {
                A3 = C0116n.A(((Long) this.f2407c[r03]).longValue(), r3);
            }
            r12 = A3 + r12;
        }
        this.f2408d = r12;
        return r12;
    }

    public final void c(int r3, Object obj) {
        if (this.f2409e) {
            a(this.f2405a + 1);
            int[] r02 = this.f2406b;
            int r12 = this.f2405a;
            r02[r12] = r3;
            this.f2407c[r12] = obj;
            this.f2405a = r12 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void d(Q q3) {
        if (this.f2405a == 0) {
            return;
        }
        q3.getClass();
        for (int r02 = 0; r02 < this.f2405a; r02++) {
            int r12 = this.f2406b[r02];
            Object obj = this.f2407c[r02];
            int r3 = r12 >>> 3;
            int r13 = r12 & 7;
            if (r13 != 0) {
                if (r13 != 1) {
                    if (r13 != 2) {
                        if (r13 != 3) {
                            if (r13 == 5) {
                                q3.e(r3, ((Integer) obj).intValue());
                            } else {
                                throw new RuntimeException(I.b());
                            }
                        } else {
                            C0116n c0116n = (C0116n) q3.f2306a;
                            c0116n.R(r3, 3);
                            ((p0) obj).d(q3);
                            c0116n.R(r3, 4);
                        }
                    } else {
                        q3.b(r3, (C0111h) obj);
                    }
                } else {
                    q3.f(((Long) obj).longValue(), r3);
                }
            } else {
                q3.j(((Long) obj).longValue(), r3);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        int r22 = this.f2405a;
        if (r22 == p0Var.f2405a) {
            int[] r3 = this.f2406b;
            int[] r4 = p0Var.f2406b;
            int r5 = 0;
            while (true) {
                if (r5 < r22) {
                    if (r3[r5] != r4[r5]) {
                        break;
                    }
                    r5++;
                } else {
                    Object[] objArr = this.f2407c;
                    Object[] objArr2 = p0Var.f2407c;
                    int r32 = this.f2405a;
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
        int r02 = this.f2405a;
        int r12 = (527 + r02) * 31;
        int[] r22 = this.f2406b;
        int r4 = 17;
        int r6 = 17;
        for (int r5 = 0; r5 < r02; r5++) {
            r6 = (r6 * 31) + r22[r5];
        }
        int r13 = (r12 + r6) * 31;
        Object[] objArr = this.f2407c;
        int r23 = this.f2405a;
        for (int r3 = 0; r3 < r23; r3++) {
            r4 = (r4 * 31) + objArr[r3].hashCode();
        }
        return r13 + r4;
    }
}
