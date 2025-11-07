package n0;

/* renamed from: n0.K  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0367K extends F2.g implements M2.p {

    /* renamed from: N  reason: collision with root package name */
    public int f4202N;

    /* renamed from: O  reason: collision with root package name */
    public /* synthetic */ Object f4203O;

    /* renamed from: P  reason: collision with root package name */
    public final /* synthetic */ N f4204P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0367K(N n3, D2.d dVar) {
        super(2, dVar);
        this.f4204P = n3;
    }

    @Override // F2.b
    public final D2.d f(D2.d dVar, Object obj) {
        C0367K c0367k = new C0367K(this.f4204P, dVar);
        c0367k.f4203O = obj;
        return c0367k;
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        return ((C0367K) f((D2.d) obj2, (P) obj)).k(B2.i.f210a);
    }

    @Override // F2.b
    public final Object k(Object obj) {
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        int r12 = this.f4202N;
        if (r12 != 0) {
            if (r12 == 1) {
                P1.a.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            P1.a.b(obj);
            this.f4202N = 1;
            if (N.b(this.f4204P, (P) this.f4203O, this) == aVar) {
                return aVar;
            }
        }
        return B2.i.f210a;
    }
}
