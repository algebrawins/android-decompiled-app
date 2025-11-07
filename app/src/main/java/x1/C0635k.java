package x1;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: x1.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0635k extends M {

    /* renamed from: J  reason: collision with root package name */
    public final C0730w f5942J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ C0683q f5943K;

    public C0635k(C0683q c0683q, C0730w c0730w) {
        this.f5943K = c0683q;
        this.f5942J = c0730w;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            i iVar = (i) it;
            if (iVar.hasNext()) {
                iVar.next();
                iVar.remove();
            } else {
                return;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f5942J.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f5942J.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this != obj && !this.f5942J.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f5942J.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f5942J.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new i(this, this.f5942J.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Collection collection = (Collection) this.f5942J.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            if (size > 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5942J.size();
    }
}
