package n0;

/* renamed from: n0.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0383p extends F2.g implements M2.p {

    /* renamed from: N  reason: collision with root package name */
    public /* synthetic */ Object f4306N;

    /* renamed from: O  reason: collision with root package name */
    public final /* synthetic */ Y f4307O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0383p(Y y3, D2.d dVar) {
        super(2, dVar);
        this.f4307O = y3;
    }

    @Override // F2.b
    public final D2.d f(D2.d dVar, Object obj) {
        C0383p c0383p = new C0383p(this.f4307O, dVar);
        c0383p.f4306N = obj;
        return c0383p;
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        return ((C0383p) f((D2.d) obj2, (Y) obj)).k(B2.i.f210a);
    }

    @Override // F2.b
    public final Object k(Object obj) {
        boolean z3;
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        P1.a.b(obj);
        Y y3 = (Y) this.f4306N;
        if ((y3 instanceof C0370c) && y3.f4255a <= this.f4307O.f4255a) {
            z3 = true;
        } else {
            z3 = false;
        }
        return Boolean.valueOf(z3);
    }
}
