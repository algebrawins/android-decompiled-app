package R;

/* loaded from: classes.dex */
public final class l implements Cloneable {

    /* renamed from: M  reason: collision with root package name */
    public static final Object f1150M = new Object();

    /* renamed from: J  reason: collision with root package name */
    public int[] f1151J;

    /* renamed from: K  reason: collision with root package name */
    public Object[] f1152K;

    /* renamed from: L  reason: collision with root package name */
    public int f1153L;

    public l() {
        int r3;
        int r12 = 4;
        while (true) {
            r3 = 40;
            if (r12 >= 32) {
                break;
            }
            int r22 = (1 << r12) - 12;
            if (40 <= r22) {
                r3 = r22;
                break;
            }
            r12++;
        }
        int r32 = r3 / 4;
        this.f1151J = new int[r32];
        this.f1152K = new Object[r32];
    }

    public final void a(int r8, Object obj) {
        int r02 = this.f1153L;
        if (r02 != 0 && r8 <= this.f1151J[r02 - 1]) {
            d(r8, obj);
            return;
        }
        if (r02 >= this.f1151J.length) {
            int r12 = (r02 + 1) * 4;
            int r4 = 4;
            while (true) {
                if (r4 >= 32) {
                    break;
                }
                int r5 = (1 << r4) - 12;
                if (r12 <= r5) {
                    r12 = r5;
                    break;
                }
                r4++;
            }
            int r13 = r12 / 4;
            int[] r3 = new int[r13];
            Object[] objArr = new Object[r13];
            int[] r42 = this.f1151J;
            System.arraycopy(r42, 0, r3, 0, r42.length);
            Object[] objArr2 = this.f1152K;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f1151J = r3;
            this.f1152K = objArr;
        }
        this.f1151J[r02] = r8;
        this.f1152K[r02] = obj;
        this.f1153L = r02 + 1;
    }

    /* renamed from: b */
    public final l clone() {
        try {
            l lVar = (l) super.clone();
            lVar.f1151J = (int[]) this.f1151J.clone();
            lVar.f1152K = (Object[]) this.f1152K.clone();
            return lVar;
        } catch (CloneNotSupportedException e4) {
            throw new AssertionError(e4);
        }
    }

    public final Object c(int r3, Integer num) {
        Object obj;
        int a4 = d.a(this.f1153L, r3, this.f1151J);
        if (a4 >= 0 && (obj = this.f1152K[a4]) != f1150M) {
            return obj;
        }
        return num;
    }

    public final void d(int r8, Object obj) {
        int a4 = d.a(this.f1153L, r8, this.f1151J);
        if (a4 >= 0) {
            this.f1152K[a4] = obj;
            return;
        }
        int r02 = ~a4;
        int r12 = this.f1153L;
        if (r02 < r12) {
            Object[] objArr = this.f1152K;
            if (objArr[r02] == f1150M) {
                this.f1151J[r02] = r8;
                objArr[r02] = obj;
                return;
            }
        }
        if (r12 >= this.f1151J.length) {
            int r13 = (r12 + 1) * 4;
            int r4 = 4;
            while (true) {
                if (r4 >= 32) {
                    break;
                }
                int r5 = (1 << r4) - 12;
                if (r13 <= r5) {
                    r13 = r5;
                    break;
                }
                r4++;
            }
            int r14 = r13 / 4;
            int[] r22 = new int[r14];
            Object[] objArr2 = new Object[r14];
            int[] r42 = this.f1151J;
            System.arraycopy(r42, 0, r22, 0, r42.length);
            Object[] objArr3 = this.f1152K;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f1151J = r22;
            this.f1152K = objArr2;
        }
        int r15 = this.f1153L - r02;
        if (r15 != 0) {
            int[] r23 = this.f1151J;
            int r43 = r02 + 1;
            System.arraycopy(r23, r02, r23, r43, r15);
            Object[] objArr4 = this.f1152K;
            System.arraycopy(objArr4, r02, objArr4, r43, this.f1153L - r02);
        }
        this.f1151J[r02] = r8;
        this.f1152K[r02] = obj;
        this.f1153L++;
    }

    public final String toString() {
        int r02 = this.f1153L;
        if (r02 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(r02 * 28);
        sb.append('{');
        for (int r03 = 0; r03 < this.f1153L; r03++) {
            if (r03 > 0) {
                sb.append(", ");
            }
            sb.append(this.f1151J[r03]);
            sb.append('=');
            Object obj = this.f1152K[r03];
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
