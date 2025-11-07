package U0;

/* loaded from: classes.dex */
public final class n extends v {

    /* renamed from: a  reason: collision with root package name */
    public final u f1311a;

    /* renamed from: b  reason: collision with root package name */
    public final t f1312b;

    public n(u uVar, t tVar) {
        this.f1311a = uVar;
        this.f1312b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        u uVar = this.f1311a;
        if (uVar != null ? uVar.equals(((n) vVar).f1311a) : ((n) vVar).f1311a == null) {
            t tVar = this.f1312b;
            if (tVar == null) {
                if (((n) vVar).f1312b == null) {
                    return true;
                }
            } else if (tVar.equals(((n) vVar).f1312b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int r02 = 0;
        u uVar = this.f1311a;
        if (uVar == null) {
            hashCode = 0;
        } else {
            hashCode = uVar.hashCode();
        }
        int r12 = (hashCode ^ 1000003) * 1000003;
        t tVar = this.f1312b;
        if (tVar != null) {
            r02 = tVar.hashCode();
        }
        return r02 ^ r12;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f1311a + ", mobileSubtype=" + this.f1312b + "}";
    }
}
