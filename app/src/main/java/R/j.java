package R;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class j implements Collection {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ Q1.e f1142J;

    public j(Q1.e eVar) {
        this.f1142J = eVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f1142J.b();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (this.f1142J.g(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        if (this.f1142J.e() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new g(this.f1142J, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        Q1.e eVar = this.f1142J;
        int g = eVar.g(obj);
        if (g >= 0) {
            eVar.i(g);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        Q1.e eVar = this.f1142J;
        int e4 = eVar.e();
        int r22 = 0;
        boolean z3 = false;
        while (r22 < e4) {
            if (collection.contains(eVar.c(r22, 1))) {
                eVar.i(r22);
                r22--;
                e4--;
                z3 = true;
            }
            r22++;
        }
        return z3;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        Q1.e eVar = this.f1142J;
        int e4 = eVar.e();
        int r22 = 0;
        boolean z3 = false;
        while (r22 < e4) {
            if (!collection.contains(eVar.c(r22, 1))) {
                eVar.i(r22);
                r22--;
                e4--;
                z3 = true;
            }
            r22++;
        }
        return z3;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f1142J.e();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Q1.e eVar = this.f1142J;
        int e4 = eVar.e();
        Object[] objArr = new Object[e4];
        for (int r3 = 0; r3 < e4; r3++) {
            objArr[r3] = eVar.c(r3, 1);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f1142J.l(1, objArr);
    }
}
