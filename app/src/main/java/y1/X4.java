package y1;

import x1.AbstractC0665n5;

/* loaded from: classes.dex */
public final class X4 extends V4 {

    /* renamed from: N  reason: collision with root package name */
    public static final X4 f6326N = new X4(0, new Object[0]);

    /* renamed from: L  reason: collision with root package name */
    public final transient Object[] f6327L;

    /* renamed from: M  reason: collision with root package name */
    public final transient int f6328M;

    public X4(int r12, Object[] objArr) {
        this.f6327L = objArr;
        this.f6328M = r12;
    }

    @Override // y1.V4, y1.AbstractC0866n4
    public final int e(Object[] objArr) {
        Object[] objArr2 = this.f6327L;
        int r22 = this.f6328M;
        System.arraycopy(objArr2, 0, objArr, 0, r22);
        return r22;
    }

    @Override // java.util.List
    public final Object get(int r22) {
        AbstractC0665n5.a(r22, this.f6328M);
        Object obj = this.f6327L[r22];
        obj.getClass();
        return obj;
    }

    @Override // y1.AbstractC0866n4
    public final int h() {
        return this.f6328M;
    }

    @Override // y1.AbstractC0866n4
    public final int i() {
        return 0;
    }

    @Override // y1.AbstractC0866n4
    public final Object[] j() {
        return this.f6327L;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6328M;
    }
}
