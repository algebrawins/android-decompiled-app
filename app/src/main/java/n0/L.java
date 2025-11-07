package n0;

/* loaded from: classes.dex */
public final class L extends F2.b {

    /* renamed from: M  reason: collision with root package name */
    public N2.m f4205M;

    /* renamed from: N  reason: collision with root package name */
    public /* synthetic */ Object f4206N;

    /* renamed from: O  reason: collision with root package name */
    public final /* synthetic */ N f4207O;

    /* renamed from: P  reason: collision with root package name */
    public int f4208P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(N n3, F2.b bVar) {
        super(bVar);
        this.f4207O = n3;
    }

    @Override // F2.b
    public final Object k(Object obj) {
        this.f4206N = obj;
        this.f4208P |= Integer.MIN_VALUE;
        return this.f4207O.k(null, false, this);
    }
}
