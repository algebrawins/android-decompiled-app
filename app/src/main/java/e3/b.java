package e3;

import java.io.Serializable;
import java.util.Arrays;
import x1.AbstractC0632j4;

/* loaded from: classes.dex */
public class b implements Serializable, Comparable {

    /* renamed from: M  reason: collision with root package name */
    public static final b f3099M = new b(new byte[0]);

    /* renamed from: J  reason: collision with root package name */
    public final byte[] f3100J;

    /* renamed from: K  reason: collision with root package name */
    public transient int f3101K;

    /* renamed from: L  reason: collision with root package name */
    public transient String f3102L;

    public b(byte[] bArr) {
        N2.g.e(bArr, "data");
        this.f3100J = bArr;
    }

    public static int e(b bVar, b bVar2) {
        bVar.getClass();
        N2.g.e(bVar2, "other");
        return bVar.d(bVar2.f3100J, 0);
    }

    public static int i(b bVar, b bVar2) {
        bVar.getClass();
        N2.g.e(bVar2, "other");
        return bVar.h(bVar2.f3100J, -1234567890);
    }

    public static /* synthetic */ b m(b bVar, int r22, int r3, int r4) {
        if ((r4 & 1) != 0) {
            r22 = 0;
        }
        if ((r4 & 2) != 0) {
            r3 = -1234567890;
        }
        return bVar.l(r22, r3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compareTo(e3.b r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            N2.g.e(r10, r0)
            int r0 = r9.b()
            int r1 = r10.b()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2e
            byte r7 = r9.g(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.g(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L2c
        L2a:
            r3 = -1
            goto L34
        L2c:
            r3 = 1
            goto L34
        L2e:
            if (r0 != r1) goto L31
            goto L34
        L31:
            if (r0 >= r1) goto L2c
            goto L2a
        L34:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.b.compareTo(e3.b):int");
    }

    public int b() {
        return this.f3100J.length;
    }

    public String c() {
        byte[] bArr = this.f3100J;
        char[] cArr = new char[bArr.length * 2];
        int r4 = 0;
        for (byte b3 : bArr) {
            int r6 = r4 + 1;
            char[] cArr2 = f3.a.f3202a;
            cArr[r4] = cArr2[(b3 >> 4) & 15];
            r4 += 2;
            cArr[r6] = cArr2[b3 & 15];
        }
        return new String(cArr);
    }

    public int d(byte[] bArr, int r6) {
        N2.g.e(bArr, "other");
        byte[] bArr2 = this.f3100J;
        int length = bArr2.length - bArr.length;
        int max = Math.max(r6, 0);
        if (max <= length) {
            while (!AbstractC0632j4.a(max, 0, bArr.length, bArr2, bArr)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            int b3 = bVar.b();
            byte[] bArr = this.f3100J;
            if (b3 == bArr.length && bVar.j(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public byte[] f() {
        return this.f3100J;
    }

    public byte g(int r22) {
        return this.f3100J[r22];
    }

    public int h(byte[] bArr, int r5) {
        N2.g.e(bArr, "other");
        if (r5 == -1234567890) {
            r5 = b();
        }
        byte[] bArr2 = this.f3100J;
        for (int min = Math.min(r5, bArr2.length - bArr.length); -1 < min; min--) {
            if (AbstractC0632j4.a(min, 0, bArr.length, bArr2, bArr)) {
                return min;
            }
        }
        return -1;
    }

    public int hashCode() {
        int r02 = this.f3101K;
        if (r02 == 0) {
            int hashCode = Arrays.hashCode(this.f3100J);
            this.f3101K = hashCode;
            return hashCode;
        }
        return r02;
    }

    public boolean j(int r3, int r4, int r5, byte[] bArr) {
        N2.g.e(bArr, "other");
        if (r3 >= 0) {
            byte[] bArr2 = this.f3100J;
            if (r3 <= bArr2.length - r5 && r4 >= 0 && r4 <= bArr.length - r5 && AbstractC0632j4.a(r3, r4, r5, bArr2, bArr)) {
                return true;
            }
        }
        return false;
    }

    public boolean k(int r3, b bVar, int r5) {
        N2.g.e(bVar, "other");
        return bVar.j(0, r3, r5, this.f3100J);
    }

    public b l(int r4, int r5) {
        if (r5 == -1234567890) {
            r5 = b();
        }
        if (r4 >= 0) {
            byte[] bArr = this.f3100J;
            if (r5 <= bArr.length) {
                if (r5 - r4 >= 0) {
                    if (r4 == 0 && r5 == bArr.length) {
                        return this;
                    }
                    C2.h.c(r5, bArr.length);
                    byte[] copyOfRange = Arrays.copyOfRange(bArr, r4, r5);
                    N2.g.d(copyOfRange, "copyOfRange(...)");
                    return new b(copyOfRange);
                }
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public final String n() {
        String str = this.f3102L;
        if (str == null) {
            byte[] f2 = f();
            N2.g.e(f2, "<this>");
            String str2 = new String(f2, U2.a.f1346a);
            this.f3102L = str2;
            return str2;
        }
        return str;
    }

    public void o(a aVar, int r4) {
        N2.g.e(aVar, "buffer");
        aVar.r(this.f3100J, 0, r4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0120, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0124, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0130, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x015c, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0163, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x016a, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x019b, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x019e, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x01a1, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x01a4, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007a, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x008b, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00b6, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00c8, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00e8, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00f0, code lost:
        if (r6 == 64) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.b.toString():java.lang.String");
    }
}
