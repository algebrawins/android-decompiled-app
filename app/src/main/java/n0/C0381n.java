package n0;

/* renamed from: n0.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0381n extends F2.g implements M2.p {

    /* renamed from: N  reason: collision with root package name */
    public int f4303N;

    /* renamed from: O  reason: collision with root package name */
    public final /* synthetic */ N f4304O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0381n(N n3, D2.d dVar) {
        super(2, dVar);
        this.f4304O = n3;
    }

    @Override // F2.b
    public final D2.d f(D2.d dVar, Object obj) {
        return new C0381n(this.f4304O, dVar);
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        return ((C0381n) f((D2.d) obj2, (Y2.e) obj)).k(B2.i.f210a);
    }

    @Override // F2.b
    public final Object k(Object obj) {
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        int r12 = this.f4303N;
        if (r12 != 0) {
            if (r12 == 1) {
                P1.a.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            P1.a.b(obj);
            this.f4303N = 1;
            if (N.c(this.f4304O, this) == aVar) {
                return aVar;
            }
        }
        return B2.i.f210a;
    }
}
