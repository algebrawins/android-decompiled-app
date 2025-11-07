package n0;

/* loaded from: classes.dex */
public final class U extends F2.b {

    /* renamed from: M  reason: collision with root package name */
    public Object f4242M;

    /* renamed from: N  reason: collision with root package name */
    public d3.d f4243N;

    /* renamed from: O  reason: collision with root package name */
    public /* synthetic */ Object f4244O;

    /* renamed from: P  reason: collision with root package name */
    public final /* synthetic */ X f4245P;

    /* renamed from: Q  reason: collision with root package name */
    public int f4246Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(X x3, F2.b bVar) {
        super(bVar);
        this.f4245P = x3;
    }

    @Override // F2.b
    public final Object k(Object obj) {
        this.f4244O = obj;
        this.f4246Q |= Integer.MIN_VALUE;
        return this.f4245P.b(null, this);
    }
}
