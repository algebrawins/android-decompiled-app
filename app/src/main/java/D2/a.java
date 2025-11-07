package D2;

import M2.p;
import x1.Z;

/* loaded from: classes.dex */
public abstract class a implements g {

    /* renamed from: J  reason: collision with root package name */
    public final h f487J;

    public a(h hVar) {
        this.f487J = hVar;
    }

    @Override // D2.i
    public g f(h hVar) {
        return Z.a(this, hVar);
    }

    @Override // D2.g
    public final h getKey() {
        return this.f487J;
    }

    @Override // D2.i
    public final Object j(Object obj, p pVar) {
        return pVar.g(obj, this);
    }

    @Override // D2.i
    public final i k(i iVar) {
        N2.g.e(iVar, "context");
        if (iVar == j.f492J) {
            return this;
        }
        return (i) iVar.j(this, new b(1));
    }

    @Override // D2.i
    public i n(h hVar) {
        return Z.b(this, hVar);
    }
}
