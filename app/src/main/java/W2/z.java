package w2;

import n0.C0385s;

/* loaded from: classes.dex */
public final class z extends F2.b {

    /* renamed from: M  reason: collision with root package name */
    public /* synthetic */ Object f5439M;

    /* renamed from: N  reason: collision with root package name */
    public int f5440N;

    /* renamed from: O  reason: collision with root package name */
    public final /* synthetic */ C0385s f5441O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C0385s c0385s, D2.d dVar) {
        super(dVar);
        this.f5441O = c0385s;
    }

    @Override // F2.b
    public final Object k(Object obj) {
        this.f5439M = obj;
        this.f5440N |= Integer.MIN_VALUE;
        return this.f5441O.b(null, this);
    }
}
