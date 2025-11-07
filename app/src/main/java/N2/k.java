package N2;

import D.C;

/* loaded from: classes.dex */
public abstract class k extends b implements S2.c {

    /* renamed from: P  reason: collision with root package name */
    public final boolean f1003P;

    public k(Object obj, Class cls, String str, String str2) {
        super(obj, cls, str, str2, true);
        this.f1003P = false;
    }

    public final S2.a e() {
        if (this.f1003P) {
            return this;
        }
        S2.a aVar = this.f988J;
        if (aVar == null) {
            S2.a b3 = b();
            this.f988J = b3;
            return b3;
        }
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (c().equals(kVar.c()) && this.f991M.equals(kVar.f991M) && this.f992N.equals(kVar.f992N) && g.a(this.f989K, kVar.f989K)) {
                return true;
            }
            return false;
        } else if (!(obj instanceof S2.c)) {
            return false;
        } else {
            return obj.equals(e());
        }
    }

    public final int hashCode() {
        int hashCode = this.f991M.hashCode();
        return this.f992N.hashCode() + ((hashCode + (c().hashCode() * 31)) * 31);
    }

    public final String toString() {
        S2.a e4 = e();
        if (e4 != this) {
            return e4.toString();
        }
        return C.z(new StringBuilder("property "), this.f991M, " (Kotlin reflection is not available)");
    }
}
