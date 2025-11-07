package n0;

/* loaded from: classes.dex */
public final class r extends F2.b {

    /* renamed from: M  reason: collision with root package name */
    public /* synthetic */ Object f4311M;

    /* renamed from: N  reason: collision with root package name */
    public int f4312N;

    /* renamed from: O  reason: collision with root package name */
    public final /* synthetic */ C0385s f4313O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C0385s c0385s, D2.d dVar) {
        super(dVar);
        this.f4313O = c0385s;
    }

    @Override // F2.b
    public final Object k(Object obj) {
        this.f4311M = obj;
        this.f4312N |= Integer.MIN_VALUE;
        return this.f4313O.b(null, this);
    }
}
