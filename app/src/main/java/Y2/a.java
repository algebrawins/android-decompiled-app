package Y2;

/* loaded from: classes.dex */
public final class a extends F2.b {

    /* renamed from: M  reason: collision with root package name */
    public Z2.n f1676M;

    /* renamed from: N  reason: collision with root package name */
    public /* synthetic */ Object f1677N;

    /* renamed from: O  reason: collision with root package name */
    public final /* synthetic */ A.a f1678O;

    /* renamed from: P  reason: collision with root package name */
    public int f1679P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(A.a aVar, D2.d dVar) {
        super(dVar);
        this.f1678O = aVar;
    }

    @Override // F2.b
    public final Object k(Object obj) {
        this.f1677N = obj;
        this.f1679P |= Integer.MIN_VALUE;
        return this.f1678O.h(null, this);
    }
}
