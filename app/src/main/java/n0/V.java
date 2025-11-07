package n0;

/* loaded from: classes.dex */
public final class V extends F2.b {

    /* renamed from: M  reason: collision with root package name */
    public d3.d f4247M;

    /* renamed from: N  reason: collision with root package name */
    public boolean f4248N;

    /* renamed from: O  reason: collision with root package name */
    public /* synthetic */ Object f4249O;

    /* renamed from: P  reason: collision with root package name */
    public final /* synthetic */ X f4250P;

    /* renamed from: Q  reason: collision with root package name */
    public int f4251Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(X x3, F2.b bVar) {
        super(bVar);
        this.f4250P = x3;
    }

    @Override // F2.b
    public final Object k(Object obj) {
        this.f4249O = obj;
        this.f4251Q |= Integer.MIN_VALUE;
        return this.f4250P.c(null, this);
    }
}
