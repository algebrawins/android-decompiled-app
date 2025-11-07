package Z2;

/* loaded from: classes.dex */
public final class t extends F2.g implements M2.p {

    /* renamed from: N  reason: collision with root package name */
    public int f1806N;

    /* renamed from: O  reason: collision with root package name */
    public /* synthetic */ Object f1807O;

    /* renamed from: P  reason: collision with root package name */
    public final /* synthetic */ Y2.e f1808P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Y2.e eVar, D2.d dVar) {
        super(2, dVar);
        this.f1808P = eVar;
    }

    @Override // F2.b
    public final D2.d f(D2.d dVar, Object obj) {
        t tVar = new t(this.f1808P, dVar);
        tVar.f1807O = obj;
        return tVar;
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        return ((t) f((D2.d) obj2, obj)).k(B2.i.f210a);
    }

    @Override // F2.b
    public final Object k(Object obj) {
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        int r12 = this.f1806N;
        if (r12 != 0) {
            if (r12 == 1) {
                P1.a.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            P1.a.b(obj);
            Object obj2 = this.f1807O;
            this.f1806N = 1;
            if (this.f1808P.b(obj2, this) == aVar) {
                return aVar;
            }
        }
        return B2.i.f210a;
    }
}
