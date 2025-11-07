package n0;

/* loaded from: classes.dex */
public final class S extends F2.b {

    /* renamed from: M  reason: collision with root package name */
    public a1.i f4234M;

    /* renamed from: N  reason: collision with root package name */
    public d3.a f4235N;

    /* renamed from: O  reason: collision with root package name */
    public /* synthetic */ Object f4236O;

    /* renamed from: P  reason: collision with root package name */
    public final /* synthetic */ a1.i f4237P;

    /* renamed from: Q  reason: collision with root package name */
    public int f4238Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(a1.i iVar, F2.b bVar) {
        super(bVar);
        this.f4237P = iVar;
    }

    @Override // F2.b
    public final Object k(Object obj) {
        this.f4236O = obj;
        this.f4238Q |= Integer.MIN_VALUE;
        return this.f4237P.j(this);
    }
}
