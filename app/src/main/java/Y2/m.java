package Y2;

import w2.C0542m;

/* loaded from: classes.dex */
public final class m extends F2.b {

    /* renamed from: M  reason: collision with root package name */
    public /* synthetic */ Object f1717M;

    /* renamed from: N  reason: collision with root package name */
    public int f1718N;

    /* renamed from: O  reason: collision with root package name */
    public final /* synthetic */ A.f f1719O;

    /* renamed from: P  reason: collision with root package name */
    public C0542m f1720P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(A.f fVar, D2.d dVar) {
        super(dVar);
        this.f1719O = fVar;
    }

    @Override // F2.b
    public final Object k(Object obj) {
        this.f1717M = obj;
        this.f1718N |= Integer.MIN_VALUE;
        return this.f1719O.h(null, this);
    }
}
