package V2;

import x1.AbstractC0564a0;

/* loaded from: classes.dex */
public final class c0 extends h0 {

    /* renamed from: M  reason: collision with root package name */
    public final D2.d f1430M;

    public c0(D2.i iVar, M2.p pVar) {
        super(iVar, false);
        this.f1430M = ((F2.b) pVar).f(this, this);
    }

    @Override // V2.b0
    public final void P() {
        try {
            a3.a.h(AbstractC0564a0.a(this.f1430M), B2.i.f210a, null);
        } catch (Throwable th) {
            i(P1.a.a(th));
            throw th;
        }
    }
}
