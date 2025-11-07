package w2;

/* renamed from: w2.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0539j extends F2.g implements M2.p {

    /* renamed from: N  reason: collision with root package name */
    public /* synthetic */ Object f5378N;

    /* renamed from: O  reason: collision with root package name */
    public final /* synthetic */ r0.d f5379O;

    /* renamed from: P  reason: collision with root package name */
    public final /* synthetic */ String f5380P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0539j(r0.d dVar, String str, D2.d dVar2) {
        super(2, dVar2);
        this.f5379O = dVar;
        this.f5380P = str;
    }

    @Override // F2.b
    public final D2.d f(D2.d dVar, Object obj) {
        C0539j c0539j = new C0539j(this.f5379O, this.f5380P, dVar);
        c0539j.f5378N = obj;
        return c0539j;
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        D2.d dVar = (D2.d) obj2;
        B2.i iVar = B2.i.f210a;
        ((C0539j) f(dVar, (r0.b) obj)).k(iVar);
        return iVar;
    }

    @Override // F2.b
    public final Object k(Object obj) {
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        P1.a.b(obj);
        ((r0.b) this.f5378N).d(this.f5379O, this.f5380P);
        return B2.i.f210a;
    }
}
