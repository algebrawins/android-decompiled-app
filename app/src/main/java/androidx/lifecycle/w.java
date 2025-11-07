package androidx.lifecycle;

import h2.AbstractActivityC0292d;

/* loaded from: classes.dex */
public final class w extends x implements p {

    /* renamed from: N  reason: collision with root package name */
    public final AbstractActivityC0292d f2475N;

    /* renamed from: O  reason: collision with root package name */
    public final /* synthetic */ z f2476O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(z zVar, AbstractActivityC0292d abstractActivityC0292d, d2.k kVar) {
        super(zVar, kVar);
        this.f2476O = zVar;
        this.f2475N = abstractActivityC0292d;
    }

    @Override // androidx.lifecycle.x
    public final void b() {
        this.f2475N.f3316L.b(this);
    }

    @Override // androidx.lifecycle.x
    public final boolean c(AbstractActivityC0292d abstractActivityC0292d) {
        if (this.f2475N == abstractActivityC0292d) {
            return true;
        }
        return false;
    }

    @Override // androidx.lifecycle.x
    public final boolean d() {
        return this.f2475N.f3316L.f2467c.a(l.STARTED);
    }

    @Override // androidx.lifecycle.p
    public final void h(r rVar, EnumC0137k enumC0137k) {
        AbstractActivityC0292d abstractActivityC0292d = this.f2475N;
        l lVar = abstractActivityC0292d.f3316L.f2467c;
        if (lVar == l.DESTROYED) {
            this.f2476O.i(this.f2477J);
            return;
        }
        l lVar2 = null;
        while (lVar2 != lVar) {
            a(d());
            lVar2 = lVar;
            lVar = abstractActivityC0292d.f3316L.f2467c;
        }
    }
}
