package Y2;

/* loaded from: classes.dex */
public final class b extends F2.b {

    /* renamed from: M  reason: collision with root package name */
    public X2.q f1680M;

    /* renamed from: N  reason: collision with root package name */
    public /* synthetic */ Object f1681N;

    /* renamed from: O  reason: collision with root package name */
    public final /* synthetic */ c f1682O;

    /* renamed from: P  reason: collision with root package name */
    public int f1683P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, F2.b bVar) {
        super(bVar);
        this.f1682O = cVar;
    }

    @Override // F2.b
    public final Object k(Object obj) {
        this.f1681N = obj;
        this.f1683P |= Integer.MIN_VALUE;
        return this.f1682O.a(null, this);
    }
}
