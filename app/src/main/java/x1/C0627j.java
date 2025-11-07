package x1;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: x1.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0627j extends AbstractMap {

    /* renamed from: J  reason: collision with root package name */
    public transient C0619h f5935J;

    /* renamed from: K  reason: collision with root package name */
    public transient C0722v f5936K;

    /* renamed from: L  reason: collision with root package name */
    public final transient C0730w f5937L;

    /* renamed from: M  reason: collision with root package name */
    public final /* synthetic */ C0683q f5938M;

    public C0627j(C0683q c0683q, C0730w c0730w) {
        this.f5938M = c0683q;
        this.f5937L = c0730w;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        C0683q c0683q = this.f5938M;
        if (this.f5937L == c0683q.f6069L) {
            C0730w c0730w = c0683q.f6069L;
            for (Collection collection : c0730w.values()) {
                collection.clear();
            }
            c0730w.clear();
            return;
        }
        i iVar = new i(this);
        while (iVar.hasNext()) {
            iVar.next();
            iVar.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        C0730w c0730w = this.f5937L;
        c0730w.getClass();
        try {
            return c0730w.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C0619h c0619h = this.f5935J;
        if (c0619h == null) {
            C0619h c0619h2 = new C0619h(this);
            this.f5935J = c0619h2;
            return c0619h2;
        }
        return c0619h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj && !this.f5937L.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        C0659n c0659n;
        C0730w c0730w = this.f5937L;
        c0730w.getClass();
        try {
            obj2 = c0730w.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        C0683q c0683q = this.f5938M;
        List list = (List) collection;
        if (list instanceof RandomAccess) {
            c0659n = new C0659n(c0683q, obj, list, null);
        } else {
            c0659n = new C0659n(c0683q, obj, list, null);
        }
        return c0659n;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f5937L.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.f5938M.b();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f5937L.remove(obj);
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(3);
        arrayList.addAll(collection);
        collection.size();
        collection.clear();
        return arrayList;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f5937L.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f5937L.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C0722v c0722v = this.f5936K;
        if (c0722v == null) {
            C0722v c0722v2 = new C0722v(this);
            this.f5936K = c0722v2;
            return c0722v2;
        }
        return c0722v;
    }
}
