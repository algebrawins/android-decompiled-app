package n0;

import V2.InterfaceC0063u;

/* renamed from: n0.H  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0365H extends F2.g implements M2.p {

    /* renamed from: N  reason: collision with root package name */
    public int f4194N;

    /* renamed from: O  reason: collision with root package name */
    public final /* synthetic */ F2.g f4195O;

    /* renamed from: P  reason: collision with root package name */
    public final /* synthetic */ C0370c f4196P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0365H(M2.p pVar, C0370c c0370c, D2.d dVar) {
        super(2, dVar);
        this.f4195O = (F2.g) pVar;
        this.f4196P = c0370c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [M2.p, F2.g] */
    @Override // F2.b
    public final D2.d f(D2.d dVar, Object obj) {
        return new C0365H(this.f4195O, this.f4196P, dVar);
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        return ((C0365H) f((D2.d) obj2, (InterfaceC0063u) obj)).k(B2.i.f210a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [M2.p, F2.g] */
    @Override // F2.b
    public final Object k(Object obj) {
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        int r12 = this.f4194N;
        if (r12 != 0) {
            if (r12 == 1) {
                P1.a.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            P1.a.b(obj);
            Object obj2 = this.f4196P.f4260b;
            this.f4194N = 1;
            obj = this.f4195O.g(obj2, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
