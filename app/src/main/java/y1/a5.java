package y1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class a5 extends W4 {

    /* renamed from: L  reason: collision with root package name */
    public final transient x1.L f6344L;

    /* renamed from: M  reason: collision with root package name */
    public final transient b5 f6345M;

    public a5(x1.L l3, b5 b5Var) {
        this.f6344L = l3;
        this.f6345M = b5Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (this.f6344L.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // y1.AbstractC0866n4
    public final int e(Object[] objArr) {
        return this.f6345M.e(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f6345M.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        this.f6344L.getClass();
        return 1;
    }
}
