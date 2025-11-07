package Y2;

/* loaded from: classes.dex */
public final class k extends F2.b {

    /* renamed from: M  reason: collision with root package name */
    public l f1708M;

    /* renamed from: N  reason: collision with root package name */
    public Object f1709N;

    /* renamed from: O  reason: collision with root package name */
    public /* synthetic */ Object f1710O;

    /* renamed from: P  reason: collision with root package name */
    public final /* synthetic */ l f1711P;

    /* renamed from: Q  reason: collision with root package name */
    public int f1712Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, D2.d dVar) {
        super(dVar);
        this.f1711P = lVar;
    }

    @Override // F2.b
    public final Object k(Object obj) {
        this.f1710O = obj;
        this.f1712Q |= Integer.MIN_VALUE;
        return this.f1711P.b(null, this);
    }
}
