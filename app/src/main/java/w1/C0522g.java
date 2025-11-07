package w1;

import x1.V4;

/* renamed from: w1.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0522g extends AbstractC0519d {

    /* renamed from: N  reason: collision with root package name */
    public static final C0522g f5292N = new C0522g(0, new Object[0]);

    /* renamed from: L  reason: collision with root package name */
    public final transient Object[] f5293L;

    /* renamed from: M  reason: collision with root package name */
    public final transient int f5294M;

    public C0522g(int r12, Object[] objArr) {
        this.f5293L = objArr;
        this.f5294M = r12;
    }

    @Override // w1.AbstractC0519d, w1.AbstractC0516a
    public final int e(Object[] objArr) {
        Object[] objArr2 = this.f5293L;
        int r22 = this.f5294M;
        System.arraycopy(objArr2, 0, objArr, 0, r22);
        return r22;
    }

    @Override // java.util.List
    public final Object get(int r22) {
        V4.a(r22, this.f5294M);
        Object obj = this.f5293L[r22];
        obj.getClass();
        return obj;
    }

    @Override // w1.AbstractC0516a
    public final int h() {
        return this.f5294M;
    }

    @Override // w1.AbstractC0516a
    public final int i() {
        return 0;
    }

    @Override // w1.AbstractC0516a
    public final Object[] j() {
        return this.f5293L;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5294M;
    }
}
