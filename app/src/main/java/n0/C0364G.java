package n0;

import V2.InterfaceC0063u;

/* renamed from: n0.G  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0364G extends F2.g implements M2.p {

    /* renamed from: N  reason: collision with root package name */
    public int f4192N;

    /* renamed from: O  reason: collision with root package name */
    public final /* synthetic */ N f4193O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0364G(N n3, D2.d dVar) {
        super(2, dVar);
        this.f4193O = n3;
    }

    @Override // F2.b
    public final D2.d f(D2.d dVar, Object obj) {
        return new C0364G(this.f4193O, dVar);
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        return ((C0364G) f((D2.d) obj2, (InterfaceC0063u) obj)).k(B2.i.f210a);
    }

    @Override // F2.b
    public final Object k(Object obj) {
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        int r12 = this.f4192N;
        N n3 = this.f4193O;
        try {
            if (r12 != 0) {
                if (r12 != 1) {
                    if (r12 == 2) {
                        P1.a.b(obj);
                        return (Y) obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P1.a.b(obj);
            } else {
                P1.a.b(obj);
                if (n3.f4223Q.d() instanceof O) {
                    return n3.f4223Q.d();
                }
                this.f4192N = 1;
                if (n3.i(this) == aVar) {
                    return aVar;
                }
            }
            this.f4192N = 2;
            obj = N.e(n3, false, this);
            if (obj == aVar) {
                return aVar;
            }
            return (Y) obj;
        } catch (Throwable th) {
            return new Q(-1, th);
        }
    }
}
