package x1;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: x1.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0659n extends AbstractCollection implements List {

    /* renamed from: J  reason: collision with root package name */
    public final Object f5954J;

    /* renamed from: K  reason: collision with root package name */
    public Collection f5955K;

    /* renamed from: L  reason: collision with root package name */
    public final C0659n f5956L;

    /* renamed from: M  reason: collision with root package name */
    public final Collection f5957M;

    /* renamed from: N  reason: collision with root package name */
    public final /* synthetic */ C0683q f5958N;

    /* renamed from: O  reason: collision with root package name */
    public final /* synthetic */ C0683q f5959O;

    public C0659n(C0683q c0683q, Object obj, List list, C0659n c0659n) {
        Collection collection;
        this.f5959O = c0683q;
        this.f5958N = c0683q;
        this.f5954J = obj;
        this.f5955K = list;
        this.f5956L = c0659n;
        if (c0659n == null) {
            collection = null;
        } else {
            collection = c0659n.f5955K;
        }
        this.f5957M = collection;
    }

    @Override // java.util.List
    public final void add(int r3, Object obj) {
        h();
        boolean isEmpty = this.f5955K.isEmpty();
        ((List) this.f5955K).add(r3, obj);
        this.f5959O.getClass();
        if (isEmpty) {
            e();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int r3, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f5955K).addAll(r3, collection);
        if (addAll) {
            this.f5955K.size();
            this.f5959O.getClass();
            if (size == 0) {
                e();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (size() == 0) {
            return;
        }
        this.f5955K.clear();
        this.f5958N.getClass();
        i();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        h();
        return this.f5955K.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        h();
        return this.f5955K.containsAll(collection);
    }

    public final void e() {
        C0659n c0659n = this.f5956L;
        if (c0659n != null) {
            c0659n.e();
        } else {
            this.f5958N.f6069L.put(this.f5954J, this.f5955K);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        h();
        return this.f5955K.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int r22) {
        h();
        return ((List) this.f5955K).get(r22);
    }

    public final void h() {
        Collection collection;
        C0659n c0659n = this.f5956L;
        if (c0659n != null) {
            c0659n.h();
            if (c0659n.f5955K != this.f5957M) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f5955K.isEmpty() && (collection = (Collection) this.f5958N.f6069L.get(this.f5954J)) != null) {
            this.f5955K = collection;
        }
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        h();
        return this.f5955K.hashCode();
    }

    public final void i() {
        C0659n c0659n = this.f5956L;
        if (c0659n != null) {
            c0659n.i();
        } else if (this.f5955K.isEmpty()) {
            this.f5958N.f6069L.remove(this.f5954J);
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        h();
        return ((List) this.f5955K).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        h();
        return new i(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        h();
        return ((List) this.f5955K).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        h();
        return new C0651m(this);
    }

    @Override // java.util.List
    public final Object remove(int r22) {
        h();
        Object remove = ((List) this.f5955K).remove(r22);
        this.f5959O.getClass();
        i();
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        size();
        boolean removeAll = this.f5955K.removeAll(collection);
        if (removeAll) {
            this.f5955K.size();
            this.f5958N.getClass();
            i();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        size();
        boolean retainAll = this.f5955K.retainAll(collection);
        if (retainAll) {
            this.f5955K.size();
            this.f5958N.getClass();
            i();
        }
        return retainAll;
    }

    @Override // java.util.List
    public final Object set(int r22, Object obj) {
        h();
        return ((List) this.f5955K).set(r22, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        h();
        return this.f5955K.size();
    }

    @Override // java.util.List
    public final List subList(int r4, int r5) {
        h();
        List subList = ((List) this.f5955K).subList(r4, r5);
        C0659n c0659n = this.f5956L;
        if (c0659n == null) {
            c0659n = this;
        }
        C0683q c0683q = this.f5959O;
        c0683q.getClass();
        boolean z3 = subList instanceof RandomAccess;
        Object obj = this.f5954J;
        if (z3) {
            return new C0659n(c0683q, obj, subList, c0659n);
        }
        return new C0659n(c0683q, obj, subList, c0659n);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        h();
        return this.f5955K.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int r22) {
        h();
        return new C0651m(this, r22);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        h();
        boolean remove = this.f5955K.remove(obj);
        if (remove) {
            this.f5958N.getClass();
            i();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h();
        boolean isEmpty = this.f5955K.isEmpty();
        boolean add = this.f5955K.add(obj);
        if (add) {
            this.f5958N.getClass();
            if (isEmpty) {
                e();
                return true;
            }
            return add;
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f5955K.addAll(collection);
        if (addAll) {
            this.f5955K.size();
            this.f5958N.getClass();
            if (size == 0) {
                e();
                return true;
            }
            return addAll;
        }
        return addAll;
    }
}
