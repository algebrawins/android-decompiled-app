package w2;

/* loaded from: classes.dex */
public final class w extends F2.b {

    /* renamed from: M  reason: collision with root package name */
    public /* synthetic */ Object f5428M;

    /* renamed from: N  reason: collision with root package name */
    public int f5429N;

    /* renamed from: O  reason: collision with root package name */
    public final /* synthetic */ C0542m f5430O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(C0542m c0542m, D2.d dVar) {
        super(dVar);
        this.f5430O = c0542m;
    }

    @Override // F2.b
    public final Object k(Object obj) {
        this.f5428M = obj;
        this.f5429N |= Integer.MIN_VALUE;
        return this.f5430O.b(null, this);
    }
}
