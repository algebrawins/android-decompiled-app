package Z2;

/* loaded from: classes.dex */
public final class e extends F2.g implements M2.p {

    /* renamed from: N  reason: collision with root package name */
    public int f1780N;

    /* renamed from: O  reason: collision with root package name */
    public /* synthetic */ Object f1781O;

    /* renamed from: P  reason: collision with root package name */
    public final /* synthetic */ f f1782P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, D2.d dVar) {
        super(2, dVar);
        this.f1782P = fVar;
    }

    @Override // F2.b
    public final D2.d f(D2.d dVar, Object obj) {
        e eVar = new e(this.f1782P, dVar);
        eVar.f1781O = obj;
        return eVar;
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        return ((e) f((D2.d) obj2, (X2.q) obj)).k(B2.i.f210a);
    }

    @Override // F2.b
    public final Object k(Object obj) {
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        int r12 = this.f1780N;
        if (r12 != 0) {
            if (r12 == 1) {
                P1.a.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            P1.a.b(obj);
            this.f1780N = 1;
            if (this.f1782P.a((X2.q) this.f1781O, this) == aVar) {
                return aVar;
            }
        }
        return B2.i.f210a;
    }
}
