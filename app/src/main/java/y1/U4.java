package y1;

import x1.AbstractC0665n5;

/* loaded from: classes.dex */
public final class U4 extends V4 {

    /* renamed from: L  reason: collision with root package name */
    public final transient int f6312L;

    /* renamed from: M  reason: collision with root package name */
    public final transient int f6313M;

    /* renamed from: N  reason: collision with root package name */
    public final /* synthetic */ V4 f6314N;

    public U4(V4 v4, int r22, int r3) {
        this.f6314N = v4;
        this.f6312L = r22;
        this.f6313M = r3;
    }

    @Override // java.util.List
    public final Object get(int r22) {
        AbstractC0665n5.a(r22, this.f6313M);
        return this.f6314N.get(r22 + this.f6312L);
    }

    @Override // y1.AbstractC0866n4
    public final int h() {
        return this.f6314N.i() + this.f6312L + this.f6313M;
    }

    @Override // y1.AbstractC0866n4
    public final int i() {
        return this.f6314N.i() + this.f6312L;
    }

    @Override // y1.AbstractC0866n4
    public final Object[] j() {
        return this.f6314N.j();
    }

    @Override // y1.V4, java.util.List
    /* renamed from: k */
    public final V4 subList(int r22, int r3) {
        AbstractC0665n5.b(r22, r3, this.f6313M);
        int r02 = this.f6312L;
        return this.f6314N.subList(r22 + r02, r3 + r02);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6313M;
    }
}
