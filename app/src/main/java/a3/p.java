package a3;

import V2.AbstractC0066x;

/* loaded from: classes.dex */
public final class p extends N2.h implements M2.l {

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ M2.l f1878K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ Object f1879L;

    /* renamed from: M  reason: collision with root package name */
    public final /* synthetic */ D2.i f1880M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(M2.l lVar, Object obj, D2.i iVar) {
        super(1);
        this.f1878K = lVar;
        this.f1879L = obj;
        this.f1880M = iVar;
    }

    @Override // M2.l
    public final Object h(Object obj) {
        Throwable th = (Throwable) obj;
        B2.b a4 = a.a(this.f1878K, this.f1879L, null);
        if (a4 != null) {
            AbstractC0066x.d(this.f1880M, a4);
        }
        return B2.i.f210a;
    }
}
