package w2;

/* renamed from: w2.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0541l extends F2.b {

    /* renamed from: M  reason: collision with root package name */
    public /* synthetic */ Object f5384M;

    /* renamed from: N  reason: collision with root package name */
    public int f5385N;

    /* renamed from: O  reason: collision with root package name */
    public final /* synthetic */ C0542m f5386O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0541l(C0542m c0542m, D2.d dVar) {
        super(dVar);
        this.f5386O = c0542m;
    }

    @Override // F2.b
    public final Object k(Object obj) {
        this.f5384M = obj;
        this.f5385N |= Integer.MIN_VALUE;
        return this.f5386O.b(null, this);
    }
}
