package y1;

import x1.AbstractC0665n5;

/* loaded from: classes.dex */
public final class b5 extends V4 {

    /* renamed from: L  reason: collision with root package name */
    public final transient Object[] f6349L;

    /* renamed from: M  reason: collision with root package name */
    public final transient int f6350M;

    /* renamed from: N  reason: collision with root package name */
    public final transient int f6351N = 1;

    public b5(int r12, Object[] objArr) {
        this.f6349L = objArr;
        this.f6350M = r12;
    }

    @Override // java.util.List
    public final Object get(int r22) {
        AbstractC0665n5.a(r22, this.f6351N);
        Object obj = this.f6349L[r22 + r22 + this.f6350M];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6351N;
    }
}
