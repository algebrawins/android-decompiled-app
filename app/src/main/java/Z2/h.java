package Z2;

import V2.AbstractC0066x;
import V2.C0059p;

/* loaded from: classes.dex */
public final class h extends f {

    /* renamed from: M  reason: collision with root package name */
    public final Y2.d f1789M;

    public h(Y2.d dVar, D2.i iVar, int r3, X2.a aVar) {
        super(iVar, r3, aVar);
        this.f1789M = dVar;
    }

    @Override // Z2.f
    public final Object a(X2.q qVar, D2.d dVar) {
        Object h3 = this.f1789M.h(new r(qVar), dVar);
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        B2.i iVar = B2.i.f210a;
        if (h3 != aVar) {
            h3 = iVar;
        }
        if (h3 == aVar) {
            return h3;
        }
        return iVar;
    }

    @Override // Z2.f
    public final f b(D2.i iVar, int r4, X2.a aVar) {
        return new h(this.f1789M, iVar, r4, aVar);
    }

    @Override // Z2.f, Y2.d
    public final Object h(Y2.e eVar, D2.d dVar) {
        Object h3;
        D2.i a4;
        B2.i iVar = B2.i.f210a;
        if (this.f1784K == -3) {
            D2.i e4 = dVar.e();
            Boolean bool = Boolean.FALSE;
            C0059p c0059p = C0059p.f1455M;
            D2.i iVar2 = this.f1783J;
            if (!((Boolean) iVar2.j(bool, c0059p)).booleanValue()) {
                a4 = e4.k(iVar2);
            } else {
                a4 = AbstractC0066x.a(e4, iVar2, false);
            }
            if (N2.g.a(a4, e4)) {
                h3 = this.f1789M.h(eVar, dVar);
                E2.a aVar = E2.a.COROUTINE_SUSPENDED;
                if (h3 != aVar) {
                    h3 = iVar;
                }
                if (h3 != aVar) {
                    return iVar;
                }
            } else {
                D2.e eVar2 = D2.e.f491J;
                if (N2.g.a(a4.f(eVar2), e4.f(eVar2))) {
                    D2.i e5 = dVar.e();
                    if (!(eVar instanceof r)) {
                        eVar = new Y2.l(eVar, e5);
                    }
                    h3 = l.b(a4, eVar, a3.a.l(a4), new g(this, null), dVar);
                    E2.a aVar2 = E2.a.COROUTINE_SUSPENDED;
                    if (h3 != aVar2) {
                        h3 = iVar;
                    }
                    if (h3 != aVar2) {
                        return iVar;
                    }
                }
            }
            return h3;
        }
        h3 = super.h(eVar, dVar);
        if (h3 != E2.a.COROUTINE_SUSPENDED) {
            return iVar;
        }
        return h3;
    }

    @Override // Z2.f
    public final String toString() {
        return this.f1789M + " -> " + super.toString();
    }
}
