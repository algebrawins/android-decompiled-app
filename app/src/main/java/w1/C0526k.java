package w1;

import x1.V4;

/* renamed from: w1.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0526k extends AbstractC0519d {

    /* renamed from: L  reason: collision with root package name */
    public final transient Object[] f5301L;

    /* renamed from: M  reason: collision with root package name */
    public final transient int f5302M;

    /* renamed from: N  reason: collision with root package name */
    public final transient int f5303N;

    public C0526k(Object[] objArr, int r22, int r3) {
        this.f5301L = objArr;
        this.f5302M = r22;
        this.f5303N = r3;
    }

    @Override // java.util.List
    public final Object get(int r22) {
        V4.a(r22, this.f5303N);
        Object obj = this.f5301L[r22 + r22 + this.f5302M];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5303N;
    }
}
