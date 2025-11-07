package V2;

/* loaded from: classes.dex */
public final class n0 implements D2.g, D2.h {

    /* renamed from: J  reason: collision with root package name */
    public static final n0 f1451J = new Object();

    @Override // D2.i
    public final D2.g f(D2.h hVar) {
        return x1.Z.a(this, hVar);
    }

    @Override // D2.i
    public final Object j(Object obj, M2.p pVar) {
        return pVar.g(obj, this);
    }

    @Override // D2.i
    public final D2.i k(D2.i iVar) {
        N2.g.e(iVar, "context");
        if (iVar == D2.j.f492J) {
            return this;
        }
        return (D2.i) iVar.j(this, new D2.b(1));
    }

    @Override // D2.i
    public final D2.i n(D2.h hVar) {
        return x1.Z.b(this, hVar);
    }

    @Override // D2.g
    public final D2.h getKey() {
        return this;
    }
}
