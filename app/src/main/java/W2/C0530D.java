package w2;

/* renamed from: w2.D  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0530D extends F2.g implements M2.p {

    /* renamed from: N  reason: collision with root package name */
    public /* synthetic */ Object f5331N;

    /* renamed from: O  reason: collision with root package name */
    public final /* synthetic */ r0.d f5332O;

    /* renamed from: P  reason: collision with root package name */
    public final /* synthetic */ double f5333P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0530D(r0.d dVar, double d4, D2.d dVar2) {
        super(2, dVar2);
        this.f5332O = dVar;
        this.f5333P = d4;
    }

    @Override // F2.b
    public final D2.d f(D2.d dVar, Object obj) {
        C0530D c0530d = new C0530D(this.f5332O, this.f5333P, dVar);
        c0530d.f5331N = obj;
        return c0530d;
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        D2.d dVar = (D2.d) obj2;
        B2.i iVar = B2.i.f210a;
        ((C0530D) f(dVar, (r0.b) obj)).k(iVar);
        return iVar;
    }

    @Override // F2.b
    public final Object k(Object obj) {
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        P1.a.b(obj);
        ((r0.b) this.f5331N).d(this.f5332O, new Double(this.f5333P));
        return B2.i.f210a;
    }
}
