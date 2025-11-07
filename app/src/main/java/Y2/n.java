package Y2;

import w2.C0542m;

/* loaded from: classes.dex */
public final class n extends F2.b {

    /* renamed from: M  reason: collision with root package name */
    public C0542m f1721M;

    /* renamed from: N  reason: collision with root package name */
    public /* synthetic */ Object f1722N;

    /* renamed from: O  reason: collision with root package name */
    public int f1723O;

    /* renamed from: P  reason: collision with root package name */
    public final /* synthetic */ C0542m f1724P;

    /* renamed from: Q  reason: collision with root package name */
    public Object f1725Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(C0542m c0542m, D2.d dVar) {
        super(dVar);
        this.f1724P = c0542m;
    }

    @Override // F2.b
    public final Object k(Object obj) {
        this.f1722N = obj;
        this.f1723O |= Integer.MIN_VALUE;
        return this.f1724P.b(null, this);
    }
}
