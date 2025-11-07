package p0;

import e3.p;

/* loaded from: classes.dex */
public final class a extends F2.b {

    /* renamed from: M  reason: collision with root package name */
    public Object f4745M;

    /* renamed from: N  reason: collision with root package name */
    public p f4746N;

    /* renamed from: O  reason: collision with root package name */
    public /* synthetic */ Object f4747O;

    /* renamed from: P  reason: collision with root package name */
    public final /* synthetic */ b f4748P;

    /* renamed from: Q  reason: collision with root package name */
    public int f4749Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, F2.b bVar2) {
        super(bVar2);
        this.f4748P = bVar;
    }

    @Override // F2.b
    public final Object k(Object obj) {
        this.f4747O = obj;
        this.f4749Q |= Integer.MIN_VALUE;
        return b.a(this.f4748P, this);
    }
}
