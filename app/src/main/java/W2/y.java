package w2;

/* loaded from: classes.dex */
public final class y extends F2.b {

    /* renamed from: M  reason: collision with root package name */
    public /* synthetic */ Object f5436M;

    /* renamed from: N  reason: collision with root package name */
    public int f5437N;

    /* renamed from: O  reason: collision with root package name */
    public final /* synthetic */ C0542m f5438O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(C0542m c0542m, D2.d dVar) {
        super(dVar);
        this.f5438O = c0542m;
    }

    @Override // F2.b
    public final Object k(Object obj) {
        this.f5436M = obj;
        this.f5437N |= Integer.MIN_VALUE;
        return this.f5438O.b(null, this);
    }
}
