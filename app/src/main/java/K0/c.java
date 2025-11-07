package K0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final H0.b f822a;

    /* renamed from: b  reason: collision with root package name */
    public final b f823b;

    /* renamed from: c  reason: collision with root package name */
    public final b f824c;

    public c(H0.b bVar, b bVar2, b bVar3) {
        this.f822a = bVar;
        this.f823b = bVar2;
        this.f824c = bVar3;
        if (bVar.b() == 0 && bVar.a() == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (bVar.f714a != 0 && bVar.f715b != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!c.class.equals(cls)) {
            return false;
        }
        N2.g.c(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        c cVar = (c) obj;
        if (N2.g.a(this.f822a, cVar.f822a) && N2.g.a(this.f823b, cVar.f823b) && N2.g.a(this.f824c, cVar.f824c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f823b.hashCode();
        return this.f824c.hashCode() + ((hashCode + (this.f822a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return c.class.getSimpleName() + " { " + this.f822a + ", type=" + this.f823b + ", state=" + this.f824c + " }";
    }
}
