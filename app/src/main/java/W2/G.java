package w2;

/* loaded from: classes.dex */
public final class G extends F2.g implements M2.p {

    /* renamed from: N  reason: collision with root package name */
    public /* synthetic */ Object f5342N;

    /* renamed from: O  reason: collision with root package name */
    public final /* synthetic */ r0.d f5343O;

    /* renamed from: P  reason: collision with root package name */
    public final /* synthetic */ long f5344P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(r0.d dVar, long j3, D2.d dVar2) {
        super(2, dVar2);
        this.f5343O = dVar;
        this.f5344P = j3;
    }

    @Override // F2.b
    public final D2.d f(D2.d dVar, Object obj) {
        G g = new G(this.f5343O, this.f5344P, dVar);
        g.f5342N = obj;
        return g;
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        D2.d dVar = (D2.d) obj2;
        B2.i iVar = B2.i.f210a;
        ((G) f(dVar, (r0.b) obj)).k(iVar);
        return iVar;
    }

    @Override // F2.b
    public final Object k(Object obj) {
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        P1.a.b(obj);
        ((r0.b) this.f5342N).d(this.f5343O, new Long(this.f5344P));
        return B2.i.f210a;
    }
}
