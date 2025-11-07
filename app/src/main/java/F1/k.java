package F1;

import D.C;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final Class f636a;

    /* renamed from: b  reason: collision with root package name */
    public final int f637b;

    /* renamed from: c  reason: collision with root package name */
    public final int f638c;

    public k(Class cls, int r22, int r3) {
        this.f636a = cls;
        this.f637b = r22;
        this.f638c = r3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f636a != kVar.f636a || this.f637b != kVar.f637b || this.f638c != kVar.f638c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f636a.hashCode() ^ 1000003) * 1000003) ^ this.f637b) * 1000003) ^ this.f638c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f636a);
        sb.append(", type=");
        int r12 = this.f637b;
        if (r12 == 1) {
            str = "required";
        } else if (r12 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int r13 = this.f638c;
        if (r13 != 0) {
            if (r13 != 1) {
                if (r13 == 2) {
                    str2 = "deferred";
                } else {
                    throw new AssertionError(C.w("Unsupported injection: ", r13));
                }
            } else {
                str2 = "provider";
            }
        } else {
            str2 = "direct";
        }
        return C.z(sb, str2, "}");
    }
}
