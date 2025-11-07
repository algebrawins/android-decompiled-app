package x1;

/* loaded from: classes.dex */
public final class K extends C {

    /* renamed from: L  reason: collision with root package name */
    public final transient Object[] f5636L;

    /* renamed from: M  reason: collision with root package name */
    public final transient int f5637M;

    /* renamed from: N  reason: collision with root package name */
    public final transient int f5638N = 1;

    public K(int r12, Object[] objArr) {
        this.f5636L = objArr;
        this.f5637M = r12;
    }

    @Override // java.util.List
    public final Object get(int r22) {
        AbstractC0625h5.a(r22, this.f5638N);
        Object obj = this.f5636L[r22 + r22 + this.f5637M];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5638N;
    }
}
