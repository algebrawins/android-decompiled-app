package w2;

/* loaded from: classes.dex */
public final class p extends F2.b {

    /* renamed from: M  reason: collision with root package name */
    public /* synthetic */ Object f5398M;

    /* renamed from: N  reason: collision with root package name */
    public int f5399N;

    /* renamed from: O  reason: collision with root package name */
    public final /* synthetic */ Y2.l f5400O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Y2.l lVar, D2.d dVar) {
        super(dVar);
        this.f5400O = lVar;
    }

    @Override // F2.b
    public final Object k(Object obj) {
        this.f5398M = obj;
        this.f5399N |= Integer.MIN_VALUE;
        return this.f5400O.b(null, this);
    }
}
