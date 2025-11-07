package w2;

import V2.InterfaceC0063u;

/* loaded from: classes.dex */
public final class F extends F2.g implements M2.p {

    /* renamed from: N  reason: collision with root package name */
    public int f5338N;

    /* renamed from: O  reason: collision with root package name */
    public final /* synthetic */ J f5339O;

    /* renamed from: P  reason: collision with root package name */
    public final /* synthetic */ String f5340P;

    /* renamed from: Q  reason: collision with root package name */
    public final /* synthetic */ String f5341Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(J j3, String str, String str2, D2.d dVar) {
        super(2, dVar);
        this.f5339O = j3;
        this.f5340P = str;
        this.f5341Q = str2;
    }

    @Override // F2.b
    public final D2.d f(D2.d dVar, Object obj) {
        return new F(this.f5339O, this.f5340P, this.f5341Q, dVar);
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        return ((F) f((D2.d) obj2, (InterfaceC0063u) obj)).k(B2.i.f210a);
    }

    @Override // F2.b
    public final Object k(Object obj) {
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        int r12 = this.f5338N;
        if (r12 != 0) {
            if (r12 == 1) {
                P1.a.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            P1.a.b(obj);
            this.f5338N = 1;
            if (J.b(this.f5339O, this.f5340P, this.f5341Q, this) == aVar) {
                return aVar;
            }
        }
        return B2.i.f210a;
    }
}
