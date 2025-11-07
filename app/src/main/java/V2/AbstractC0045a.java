package V2;

import x1.AbstractC0564a0;
import x1.AbstractC0592d4;

/* renamed from: V2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0045a extends b0 implements D2.d, InterfaceC0063u {

    /* renamed from: L  reason: collision with root package name */
    public final D2.i f1420L;

    public AbstractC0045a(D2.i iVar, boolean z3) {
        super(z3);
        H((S) iVar.f(C0062t.f1462K));
        this.f1420L = iVar.k(this);
    }

    @Override // V2.b0
    public final void G(B2.b bVar) {
        AbstractC0066x.d(this.f1420L, bVar);
    }

    @Override // V2.b0
    public final void O(Object obj) {
        boolean z3;
        if (obj instanceof C0057n) {
            C0057n c0057n = (C0057n) obj;
            Throwable th = c0057n.f1450a;
            if (C0057n.f1449b.get(c0057n) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            U(th, z3);
            return;
        }
        V(obj);
    }

    public final void W(EnumC0065w enumC0065w, AbstractC0045a abstractC0045a, M2.p pVar) {
        enumC0065w.getClass();
        int r3 = AbstractC0064v.f1463a[enumC0065w.ordinal()];
        if (r3 != 1) {
            if (r3 != 2) {
                if (r3 != 3) {
                    if (r3 != 4) {
                        throw new RuntimeException();
                    }
                    return;
                }
                try {
                    D2.i iVar = this.f1420L;
                    Object m3 = a3.a.m(iVar, null);
                    N2.r.a(2, pVar);
                    Object g = pVar.g(abstractC0045a, this);
                    a3.a.g(iVar, m3);
                    if (g != E2.a.COROUTINE_SUSPENDED) {
                        i(g);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    i(P1.a.a(th));
                    return;
                }
            }
            AbstractC0564a0.a(((F2.b) pVar).f(this, abstractC0045a)).i(B2.i.f210a);
            return;
        }
        AbstractC0592d4.a(pVar, abstractC0045a, this);
    }

    @Override // D2.d
    public final D2.i e() {
        return this.f1420L;
    }

    @Override // V2.InterfaceC0063u
    public final D2.i h() {
        return this.f1420L;
    }

    @Override // D2.d
    public final void i(Object obj) {
        Throwable a4 = B2.e.a(obj);
        if (a4 != null) {
            obj = new C0057n(a4, false);
        }
        Object L3 = L(obj);
        if (L3 == AbstractC0066x.f1467d) {
            return;
        }
        r(L3);
    }

    @Override // V2.b0
    public final String v() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void V(Object obj) {
    }

    public void U(Throwable th, boolean z3) {
    }
}
