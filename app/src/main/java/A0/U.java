package A0;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a  reason: collision with root package name */
    public int f76a;

    /* renamed from: b  reason: collision with root package name */
    public int f77b;

    /* renamed from: c  reason: collision with root package name */
    public int f78c;

    /* renamed from: d  reason: collision with root package name */
    public int f79d;

    /* renamed from: e  reason: collision with root package name */
    public int f80e;

    public final boolean a() {
        int r12;
        int r13;
        int r14;
        int r02 = this.f76a;
        int r22 = 2;
        if ((r02 & 7) != 0) {
            int r15 = this.f79d;
            int r6 = this.f77b;
            if (r15 > r6) {
                r14 = 1;
            } else if (r15 == r6) {
                r14 = 2;
            } else {
                r14 = 4;
            }
            if ((r14 & r02) == 0) {
                return false;
            }
        }
        if ((r02 & 112) != 0) {
            int r16 = this.f79d;
            int r62 = this.f78c;
            if (r16 > r62) {
                r13 = 1;
            } else if (r16 == r62) {
                r13 = 2;
            } else {
                r13 = 4;
            }
            if (((r13 << 4) & r02) == 0) {
                return false;
            }
        }
        if ((r02 & 1792) != 0) {
            int r17 = this.f80e;
            int r63 = this.f77b;
            if (r17 > r63) {
                r12 = 1;
            } else if (r17 == r63) {
                r12 = 2;
            } else {
                r12 = 4;
            }
            if (((r12 << 8) & r02) == 0) {
                return false;
            }
        }
        if ((r02 & 28672) != 0) {
            int r18 = this.f80e;
            int r64 = this.f78c;
            if (r18 > r64) {
                r22 = 1;
            } else if (r18 != r64) {
                r22 = 4;
            }
            if ((r02 & (r22 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
