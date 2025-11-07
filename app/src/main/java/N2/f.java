package N2;

/* loaded from: classes.dex */
public abstract class f extends b implements e, S2.a, B2.a {

    /* renamed from: P  reason: collision with root package name */
    public final int f998P;

    /* renamed from: Q  reason: collision with root package name */
    public final int f999Q;

    public f(int r8, Class cls, String str, String str2, int r12) {
        this(r8, a.f987J, cls, str, str2, r12);
    }

    @Override // N2.b
    public final S2.a b() {
        p.f1008a.getClass();
        return this;
    }

    @Override // N2.e
    public final int d() {
        return this.f998P;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f991M.equals(fVar.f991M) && this.f992N.equals(fVar.f992N) && this.f999Q == fVar.f999Q && this.f998P == fVar.f998P && g.a(this.f989K, fVar.f989K) && c().equals(fVar.c())) {
                return true;
            }
            return false;
        } else if (!(obj instanceof f)) {
            return false;
        } else {
            S2.a aVar = this.f988J;
            if (aVar == null) {
                b();
                this.f988J = this;
                aVar = this;
            }
            return obj.equals(aVar);
        }
    }

    public final int hashCode() {
        c();
        int hashCode = this.f991M.hashCode();
        return this.f992N.hashCode() + ((hashCode + (c().hashCode() * 31)) * 31);
    }

    public final String toString() {
        S2.a aVar = this.f988J;
        if (aVar == null) {
            b();
            this.f988J = this;
            aVar = this;
        }
        if (aVar != this) {
            return aVar.toString();
        }
        String str = this.f991M;
        if ("<init>".equals(str)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + str + " (Kotlin reflection is not available)";
    }

    public f(int r9, Object obj, Class cls, String str, String str2, int r14) {
        super(obj, cls, str, str2, (r14 & 1) == 1);
        this.f998P = r9;
        this.f999Q = 0;
    }
}
