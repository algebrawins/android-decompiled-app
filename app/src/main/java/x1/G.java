package x1;

/* loaded from: classes.dex */
public final class G extends C {

    /* renamed from: N  reason: collision with root package name */
    public static final G f5558N = new G(0, new Object[0]);

    /* renamed from: L  reason: collision with root package name */
    public final transient Object[] f5559L;

    /* renamed from: M  reason: collision with root package name */
    public final transient int f5560M;

    public G(int r12, Object[] objArr) {
        this.f5559L = objArr;
        this.f5560M = r12;
    }

    @Override // x1.C, x1.AbstractC0738x
    public final int e(int r4, Object[] objArr) {
        Object[] objArr2 = this.f5559L;
        int r22 = this.f5560M;
        System.arraycopy(objArr2, 0, objArr, r4, r22);
        return r4 + r22;
    }

    @Override // java.util.List
    public final Object get(int r22) {
        AbstractC0625h5.a(r22, this.f5560M);
        Object obj = this.f5559L[r22];
        obj.getClass();
        return obj;
    }

    @Override // x1.AbstractC0738x
    public final int h() {
        return this.f5560M;
    }

    @Override // x1.AbstractC0738x
    public final int i() {
        return 0;
    }

    @Override // x1.AbstractC0738x
    public final Object[] j() {
        return this.f5559L;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5560M;
    }
}
