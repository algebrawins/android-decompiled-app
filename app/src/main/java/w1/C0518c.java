package w1;

import x1.V4;

/* renamed from: w1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0518c extends AbstractC0519d {

    /* renamed from: L  reason: collision with root package name */
    public final transient int f5284L;

    /* renamed from: M  reason: collision with root package name */
    public final transient int f5285M;

    /* renamed from: N  reason: collision with root package name */
    public final /* synthetic */ AbstractC0519d f5286N;

    public C0518c(AbstractC0519d abstractC0519d, int r22, int r3) {
        this.f5286N = abstractC0519d;
        this.f5284L = r22;
        this.f5285M = r3;
    }

    @Override // java.util.List
    public final Object get(int r22) {
        V4.a(r22, this.f5285M);
        return this.f5286N.get(r22 + this.f5284L);
    }

    @Override // w1.AbstractC0516a
    public final int h() {
        return this.f5286N.i() + this.f5284L + this.f5285M;
    }

    @Override // w1.AbstractC0516a
    public final int i() {
        return this.f5286N.i() + this.f5284L;
    }

    @Override // w1.AbstractC0516a
    public final Object[] j() {
        return this.f5286N.j();
    }

    @Override // w1.AbstractC0519d, java.util.List
    /* renamed from: k */
    public final AbstractC0519d subList(int r22, int r3) {
        V4.c(r22, r3, this.f5285M);
        int r02 = this.f5284L;
        return this.f5286N.subList(r22 + r02, r3 + r02);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5285M;
    }
}
