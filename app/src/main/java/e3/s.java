package e3;

import D.C;
import java.util.Arrays;
import x1.AbstractC0632j4;

/* loaded from: classes.dex */
public final class s extends b {

    /* renamed from: N  reason: collision with root package name */
    public final transient byte[][] f3142N;

    /* renamed from: O  reason: collision with root package name */
    public final transient int[] f3143O;

    public s(byte[][] bArr, int[] r3) {
        super(b.f3099M.f3100J);
        this.f3142N = bArr;
        this.f3143O = r3;
    }

    @Override // e3.b
    public final int b() {
        return this.f3143O[this.f3142N.length - 1];
    }

    @Override // e3.b
    public final String c() {
        return new b(p()).c();
    }

    @Override // e3.b
    public final int d(byte[] bArr, int r4) {
        N2.g.e(bArr, "other");
        return new b(p()).d(bArr, r4);
    }

    @Override // e3.b
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (bVar.b() == b() && k(0, bVar, b())) {
                return true;
            }
        }
        return false;
    }

    @Override // e3.b
    public final byte[] f() {
        return p();
    }

    @Override // e3.b
    public final byte g(int r10) {
        int r3;
        byte[][] bArr = this.f3142N;
        int[] r22 = this.f3143O;
        AbstractC0632j4.b(r22[bArr.length - 1], r10, 1L);
        int e4 = f3.a.e(this, r10);
        if (e4 == 0) {
            r3 = 0;
        } else {
            r3 = r22[e4 - 1];
        }
        return bArr[e4][(r10 - r3) + r22[bArr.length + e4]];
    }

    @Override // e3.b
    public final int h(byte[] bArr, int r4) {
        N2.g.e(bArr, "other");
        return new b(p()).h(bArr, r4);
    }

    @Override // e3.b
    public final int hashCode() {
        int r02 = this.f3101K;
        if (r02 == 0) {
            byte[][] bArr = this.f3142N;
            int length = bArr.length;
            int r22 = 0;
            int r3 = 1;
            int r4 = 0;
            while (r22 < length) {
                int[] r6 = this.f3143O;
                int r5 = r6[length + r22];
                int r62 = r6[r22];
                byte[] bArr2 = bArr[r22];
                int r42 = (r62 - r4) + r5;
                while (r5 < r42) {
                    r3 = (r3 * 31) + bArr2[r5];
                    r5++;
                }
                r22++;
                r4 = r62;
            }
            this.f3101K = r3;
            return r3;
        }
        return r02;
    }

    @Override // e3.b
    public final boolean j(int r8, int r9, int r10, byte[] bArr) {
        int r3;
        N2.g.e(bArr, "other");
        if (r8 < 0 || r8 > b() - r10 || r9 < 0 || r9 > bArr.length - r10) {
            return false;
        }
        int r102 = r10 + r8;
        int e4 = f3.a.e(this, r8);
        while (r8 < r102) {
            int[] r22 = this.f3143O;
            if (e4 == 0) {
                r3 = 0;
            } else {
                r3 = r22[e4 - 1];
            }
            byte[][] bArr2 = this.f3142N;
            int r23 = r22[bArr2.length + e4];
            int min = Math.min(r102, (r22[e4] - r3) + r3) - r8;
            if (!AbstractC0632j4.a((r8 - r3) + r23, r9, min, bArr2[e4], bArr)) {
                return false;
            }
            r9 += min;
            r8 += min;
            e4++;
        }
        return true;
    }

    @Override // e3.b
    public final boolean k(int r9, b bVar, int r11) {
        int r4;
        N2.g.e(bVar, "other");
        if (r9 < 0 || r9 > b() - r11) {
            return false;
        }
        int r112 = r11 + r9;
        int e4 = f3.a.e(this, r9);
        int r22 = 0;
        while (r9 < r112) {
            int[] r3 = this.f3143O;
            if (e4 == 0) {
                r4 = 0;
            } else {
                r4 = r3[e4 - 1];
            }
            byte[][] bArr = this.f3142N;
            int r32 = r3[bArr.length + e4];
            int min = Math.min(r112, (r3[e4] - r4) + r4) - r9;
            if (!bVar.j(r22, (r9 - r4) + r32, min, bArr[e4])) {
                return false;
            }
            r22 += min;
            r9 += min;
            e4++;
        }
        return true;
    }

    @Override // e3.b
    public final b l(int r12, int r13) {
        if (r13 == -1234567890) {
            r13 = b();
        }
        if (r12 >= 0) {
            if (r13 <= b()) {
                int r02 = r13 - r12;
                if (r02 >= 0) {
                    if (r12 == 0 && r13 == b()) {
                        return this;
                    }
                    if (r12 == r13) {
                        return b.f3099M;
                    }
                    int e4 = f3.a.e(this, r12);
                    int e5 = f3.a.e(this, r13 - 1);
                    int r22 = e5 + 1;
                    byte[][] bArr = this.f3142N;
                    N2.g.e(bArr, "<this>");
                    C2.h.c(r22, bArr.length);
                    Object[] copyOfRange = Arrays.copyOfRange(bArr, e4, r22);
                    N2.g.d(copyOfRange, "copyOfRange(...)");
                    byte[][] bArr2 = (byte[][]) copyOfRange;
                    int[] r4 = new int[bArr2.length * 2];
                    int r5 = 0;
                    int[] r6 = this.f3143O;
                    if (e4 <= e5) {
                        int r8 = e4;
                        int r7 = 0;
                        while (true) {
                            r4[r7] = Math.min(r6[r8] - r12, r02);
                            int r9 = r7 + 1;
                            r4[r7 + bArr2.length] = r6[bArr.length + r8];
                            if (r8 == e5) {
                                break;
                            }
                            r8++;
                            r7 = r9;
                        }
                    }
                    if (e4 != 0) {
                        r5 = r6[e4 - 1];
                    }
                    int length = bArr2.length;
                    r4[length] = (r12 - r5) + r4[length];
                    return new s(bArr2, r4);
                }
                throw new IllegalArgumentException(C.x("endIndex=", r13, " < beginIndex=", r12).toString());
            }
            throw new IllegalArgumentException(("endIndex=" + r13 + " > length(" + b() + ')').toString());
        }
        throw new IllegalArgumentException(C.v(r12, "beginIndex=", " < 0").toString());
    }

    @Override // e3.b
    public final void o(a aVar, int r11) {
        int r4;
        N2.g.e(aVar, "buffer");
        int e4 = f3.a.e(this, 0);
        int r22 = 0;
        while (r22 < r11) {
            int[] r3 = this.f3143O;
            if (e4 == 0) {
                r4 = 0;
            } else {
                r4 = r3[e4 - 1];
            }
            byte[][] bArr = this.f3142N;
            int r32 = r3[bArr.length + e4];
            int min = Math.min(r11, (r3[e4] - r4) + r4) - r22;
            int r42 = (r22 - r4) + r32;
            q qVar = new q(bArr[e4], r42, r42 + min, true);
            q qVar2 = aVar.f3097J;
            if (qVar2 == null) {
                qVar.g = qVar;
                qVar.f3138f = qVar;
                aVar.f3097J = qVar;
            } else {
                q qVar3 = qVar2.g;
                N2.g.b(qVar3);
                qVar3.b(qVar);
            }
            r22 += min;
            e4++;
        }
        aVar.f3098K += r11;
    }

    public final byte[] p() {
        byte[] bArr = new byte[b()];
        byte[][] bArr2 = this.f3142N;
        int length = bArr2.length;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        while (r3 < length) {
            int[] r7 = this.f3143O;
            int r6 = r7[length + r3];
            int r72 = r7[r3];
            int r42 = r72 - r4;
            C2.h.a(r5, r6, r6 + r42, bArr2[r3], bArr);
            r5 += r42;
            r3++;
            r4 = r72;
        }
        return bArr;
    }

    @Override // e3.b
    public final String toString() {
        return new b(p()).toString();
    }
}
