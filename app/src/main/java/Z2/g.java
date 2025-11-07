package Z2;

/* loaded from: classes.dex */
public final class g extends F2.g implements M2.p {

    /* renamed from: N  reason: collision with root package name */
    public int f1786N;

    /* renamed from: O  reason: collision with root package name */
    public /* synthetic */ Object f1787O;

    /* renamed from: P  reason: collision with root package name */
    public final /* synthetic */ h f1788P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, D2.d dVar) {
        super(2, dVar);
        this.f1788P = hVar;
    }

    @Override // F2.b
    public final D2.d f(D2.d dVar, Object obj) {
        g gVar = new g(this.f1788P, dVar);
        gVar.f1787O = obj;
        return gVar;
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        return ((g) f((D2.d) obj2, (Y2.e) obj)).k(B2.i.f210a);
    }

    @Override // F2.b
    public final Object k(Object obj) {
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        int r12 = this.f1786N;
        B2.i iVar = B2.i.f210a;
        if (r12 != 0) {
            if (r12 == 1) {
                P1.a.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            P1.a.b(obj);
            this.f1786N = 1;
            Object h3 = this.f1788P.f1789M.h((Y2.e) this.f1787O, this);
            if (h3 != aVar) {
                h3 = iVar;
            }
            if (h3 == aVar) {
                return aVar;
            }
        }
        return iVar;
    }
}
