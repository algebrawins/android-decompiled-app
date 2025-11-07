package x1;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: x1.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0619h extends M {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ C0627j f5910J;

    public C0619h(C0627j c0627j) {
        this.f5910J = c0627j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f5910J.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        try {
            return this.f5910J.f5937L.entrySet().contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f5910J.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new i(this.f5910J);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        C0683q c0683q = this.f5910J.f5938M;
        try {
            obj2 = c0683q.f6069L.remove(entry.getKey());
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            collection.size();
            collection.clear();
            return true;
        }
        return true;
    }

    @Override // x1.M, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            if (collection != null) {
                return AbstractC0649l5.b(this, collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            boolean z3 = false;
            for (Object obj : collection) {
                z3 |= remove(obj);
            }
            return z3;
        }
    }

    @Override // x1.M, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int r02;
        try {
            if (collection != null) {
                return super.retainAll(collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                if (size >= 0) {
                    r02 = size + 1;
                } else {
                    throw new IllegalArgumentException(D.C.w("expectedSize cannot be negative but was: ", size));
                }
            } else if (size < 1073741824) {
                r02 = (int) Math.ceil(size / 0.75d);
            } else {
                r02 = Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(r02);
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return ((M) this.f5910J.f5938M.b()).retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5910J.f5937L.size();
    }
}
