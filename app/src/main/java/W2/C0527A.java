package w2;

/* renamed from: w2.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0527A extends F2.g implements M2.p {

    /* renamed from: N  reason: collision with root package name */
    public /* synthetic */ Object f5320N;

    /* renamed from: O  reason: collision with root package name */
    public final /* synthetic */ r0.d f5321O;

    /* renamed from: P  reason: collision with root package name */
    public final /* synthetic */ boolean f5322P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0527A(r0.d dVar, boolean z3, D2.d dVar2) {
        super(2, dVar2);
        this.f5321O = dVar;
        this.f5322P = z3;
    }

    @Override // F2.b
    public final D2.d f(D2.d dVar, Object obj) {
        C0527A c0527a = new C0527A(this.f5321O, this.f5322P, dVar);
        c0527a.f5320N = obj;
        return c0527a;
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        D2.d dVar = (D2.d) obj2;
        B2.i iVar = B2.i.f210a;
        ((C0527A) f(dVar, (r0.b) obj)).k(iVar);
        return iVar;
    }

    @Override // F2.b
    public final Object k(Object obj) {
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        P1.a.b(obj);
        ((r0.b) this.f5320N).d(this.f5321O, Boolean.valueOf(this.f5322P));
        return B2.i.f210a;
    }
}
