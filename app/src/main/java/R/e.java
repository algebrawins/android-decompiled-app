package R;

/* loaded from: classes.dex */
public final class e implements Cloneable {

    /* renamed from: N  reason: collision with root package name */
    public static final Object f1121N = new Object();

    /* renamed from: J  reason: collision with root package name */
    public boolean f1122J = false;

    /* renamed from: K  reason: collision with root package name */
    public long[] f1123K;

    /* renamed from: L  reason: collision with root package name */
    public Object[] f1124L;

    /* renamed from: M  reason: collision with root package name */
    public int f1125M;

    public e() {
        int r22;
        int r02 = 4;
        while (true) {
            r22 = 80;
            if (r02 >= 32) {
                break;
            }
            int r12 = (1 << r02) - 12;
            if (80 <= r12) {
                r22 = r12;
                break;
            }
            r02++;
        }
        int r23 = r22 / 8;
        this.f1123K = new long[r23];
        this.f1124L = new Object[r23];
    }

    public final void a(long j3, Long l3) {
        int r02 = this.f1125M;
        if (r02 != 0 && j3 <= this.f1123K[r02 - 1]) {
            e(j3, l3);
            return;
        }
        if (this.f1122J && r02 >= this.f1123K.length) {
            c();
        }
        int r03 = this.f1125M;
        if (r03 >= this.f1123K.length) {
            int r12 = (r03 + 1) * 8;
            int r3 = 4;
            while (true) {
                if (r3 >= 32) {
                    break;
                }
                int r4 = (1 << r3) - 12;
                if (r12 <= r4) {
                    r12 = r4;
                    break;
                }
                r3++;
            }
            int r13 = r12 / 8;
            long[] jArr = new long[r13];
            Object[] objArr = new Object[r13];
            long[] jArr2 = this.f1123K;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f1124L;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f1123K = jArr;
            this.f1124L = objArr;
        }
        this.f1123K[r03] = j3;
        this.f1124L[r03] = l3;
        this.f1125M = r03 + 1;
    }

    /* renamed from: b */
    public final e clone() {
        try {
            e eVar = (e) super.clone();
            eVar.f1123K = (long[]) this.f1123K.clone();
            eVar.f1124L = (Object[]) this.f1124L.clone();
            return eVar;
        } catch (CloneNotSupportedException e4) {
            throw new AssertionError(e4);
        }
    }

    public final void c() {
        int r02 = this.f1125M;
        long[] jArr = this.f1123K;
        Object[] objArr = this.f1124L;
        int r5 = 0;
        for (int r4 = 0; r4 < r02; r4++) {
            Object obj = objArr[r4];
            if (obj != f1121N) {
                if (r4 != r5) {
                    jArr[r5] = jArr[r4];
                    objArr[r5] = obj;
                    objArr[r4] = null;
                }
                r5++;
            }
        }
        this.f1122J = false;
        this.f1125M = r5;
    }

    public final Object d(long j3, Long l3) {
        Object obj;
        int b3 = d.b(this.f1123K, this.f1125M, j3);
        if (b3 >= 0 && (obj = this.f1124L[b3]) != f1121N) {
            return obj;
        }
        return l3;
    }

    public final void e(long j3, Object obj) {
        int b3 = d.b(this.f1123K, this.f1125M, j3);
        if (b3 >= 0) {
            this.f1124L[b3] = obj;
            return;
        }
        int r02 = ~b3;
        int r12 = this.f1125M;
        if (r02 < r12) {
            Object[] objArr = this.f1124L;
            if (objArr[r02] == f1121N) {
                this.f1123K[r02] = j3;
                objArr[r02] = obj;
                return;
            }
        }
        if (this.f1122J && r12 >= this.f1123K.length) {
            c();
            r02 = ~d.b(this.f1123K, this.f1125M, j3);
        }
        int r13 = this.f1125M;
        if (r13 >= this.f1123K.length) {
            int r14 = (r13 + 1) * 8;
            int r22 = 4;
            while (true) {
                if (r22 >= 32) {
                    break;
                }
                int r4 = (1 << r22) - 12;
                if (r14 <= r4) {
                    r14 = r4;
                    break;
                }
                r22++;
            }
            int r15 = r14 / 8;
            long[] jArr = new long[r15];
            Object[] objArr2 = new Object[r15];
            long[] jArr2 = this.f1123K;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f1124L;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1123K = jArr;
            this.f1124L = objArr2;
        }
        int r16 = this.f1125M - r02;
        if (r16 != 0) {
            long[] jArr3 = this.f1123K;
            int r42 = r02 + 1;
            System.arraycopy(jArr3, r02, jArr3, r42, r16);
            Object[] objArr4 = this.f1124L;
            System.arraycopy(objArr4, r02, objArr4, r42, this.f1125M - r02);
        }
        this.f1123K[r02] = j3;
        this.f1124L[r02] = obj;
        this.f1125M++;
    }

    public final String toString() {
        if (this.f1122J) {
            c();
        }
        if (this.f1125M <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1125M * 28);
        sb.append('{');
        for (int r12 = 0; r12 < this.f1125M; r12++) {
            if (r12 > 0) {
                sb.append(", ");
            }
            if (this.f1122J) {
                c();
            }
            sb.append(this.f1123K[r12]);
            sb.append('=');
            if (this.f1122J) {
                c();
            }
            Object obj = this.f1124L[r12];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
