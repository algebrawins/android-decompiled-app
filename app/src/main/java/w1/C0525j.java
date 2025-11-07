package w1;

import java.util.Iterator;

/* renamed from: w1.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0525j extends AbstractC0521f {

    /* renamed from: L  reason: collision with root package name */
    public final transient l f5299L;

    /* renamed from: M  reason: collision with root package name */
    public final transient C0526k f5300M;

    public C0525j(l lVar, C0526k c0526k) {
        this.f5299L = lVar;
        this.f5300M = c0526k;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (this.f5299L.get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // w1.AbstractC0516a
    public final int e(Object[] objArr) {
        return this.f5300M.e(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f5300M.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5299L.f5310O;
    }
}
