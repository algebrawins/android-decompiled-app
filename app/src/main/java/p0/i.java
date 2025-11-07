package p0;

import e3.n;

/* loaded from: classes.dex */
public final class i extends F2.b {

    /* renamed from: M  reason: collision with root package name */
    public e3.h f4781M;

    /* renamed from: N  reason: collision with root package name */
    public e3.h f4782N;

    /* renamed from: O  reason: collision with root package name */
    public n f4783O;

    /* renamed from: P  reason: collision with root package name */
    public /* synthetic */ Object f4784P;

    /* renamed from: Q  reason: collision with root package name */
    public final /* synthetic */ j f4785Q;

    /* renamed from: R  reason: collision with root package name */
    public int f4786R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, F2.b bVar) {
        super(bVar);
        this.f4785Q = jVar;
    }

    @Override // F2.b
    public final Object k(Object obj) {
        this.f4784P = obj;
        this.f4786R |= Integer.MIN_VALUE;
        return this.f4785Q.b(null, this);
    }
}
