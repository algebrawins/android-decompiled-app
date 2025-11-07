package a3;

import V2.AbstractC0045a;
import V2.AbstractC0066x;
import x1.AbstractC0564a0;

/* loaded from: classes.dex */
public class t extends AbstractC0045a implements F2.c {

    /* renamed from: M  reason: collision with root package name */
    public final D2.d f1882M;

    public t(D2.d dVar, D2.i iVar) {
        super(iVar, true);
        this.f1882M = dVar;
    }

    @Override // V2.b0
    public final boolean J() {
        return true;
    }

    @Override // F2.c
    public final F2.c c() {
        D2.d dVar = this.f1882M;
        if (dVar instanceof F2.c) {
            return (F2.c) dVar;
        }
        return null;
    }

    @Override // V2.b0
    public void q(Object obj) {
        a.h(AbstractC0564a0.a(this.f1882M), AbstractC0066x.h(obj), null);
    }

    @Override // V2.b0
    public void r(Object obj) {
        this.f1882M.i(AbstractC0066x.h(obj));
    }
}
