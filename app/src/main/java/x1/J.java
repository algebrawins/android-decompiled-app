package x1;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class J extends D {

    /* renamed from: L  reason: collision with root package name */
    public final transient L f5611L;

    /* renamed from: M  reason: collision with root package name */
    public final transient K f5612M;

    public J(L l3, K k3) {
        this.f5611L = l3;
        this.f5612M = k3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (this.f5611L.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // x1.AbstractC0738x
    public final int e(int r22, Object[] objArr) {
        return this.f5612M.e(r22, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f5612M.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        this.f5611L.getClass();
        return 1;
    }
}
