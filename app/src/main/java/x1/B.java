package x1;

/* loaded from: classes.dex */
public final class B extends C {

    /* renamed from: L  reason: collision with root package name */
    public final transient int f5497L;

    /* renamed from: M  reason: collision with root package name */
    public final transient int f5498M;

    /* renamed from: N  reason: collision with root package name */
    public final /* synthetic */ C f5499N;

    public B(C c4, int r22, int r3) {
        this.f5499N = c4;
        this.f5497L = r22;
        this.f5498M = r3;
    }

    @Override // java.util.List
    public final Object get(int r22) {
        AbstractC0625h5.a(r22, this.f5498M);
        return this.f5499N.get(r22 + this.f5497L);
    }

    @Override // x1.AbstractC0738x
    public final int h() {
        return this.f5499N.i() + this.f5497L + this.f5498M;
    }

    @Override // x1.AbstractC0738x
    public final int i() {
        return this.f5499N.i() + this.f5497L;
    }

    @Override // x1.AbstractC0738x
    public final Object[] j() {
        return this.f5499N.j();
    }

    @Override // x1.C, java.util.List
    /* renamed from: k */
    public final C subList(int r22, int r3) {
        AbstractC0625h5.b(r22, r3, this.f5498M);
        int r02 = this.f5497L;
        return this.f5499N.subList(r22 + r02, r3 + r02);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5498M;
    }
}
