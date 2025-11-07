package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class k0 extends AbstractMap {

    /* renamed from: O  reason: collision with root package name */
    public static final /* synthetic */ int f2376O = 0;

    /* renamed from: J  reason: collision with root package name */
    public List f2377J;

    /* renamed from: K  reason: collision with root package name */
    public Map f2378K;

    /* renamed from: L  reason: collision with root package name */
    public boolean f2379L;

    /* renamed from: M  reason: collision with root package name */
    public volatile n0 f2380M;

    /* renamed from: N  reason: collision with root package name */
    public Map f2381N;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, androidx.datastore.preferences.protobuf.k0] */
    public static k0 f() {
        ?? abstractMap = new AbstractMap();
        abstractMap.f2377J = Collections.emptyList();
        abstractMap.f2378K = Collections.emptyMap();
        abstractMap.f2381N = Collections.emptyMap();
        return abstractMap;
    }

    public final int a(Comparable comparable) {
        int r02;
        int size = this.f2377J.size();
        int r12 = size - 1;
        if (r12 >= 0) {
            int compareTo = comparable.compareTo(((l0) this.f2377J.get(r12)).f2383J);
            if (compareTo > 0) {
                r02 = size + 1;
                return -r02;
            } else if (compareTo == 0) {
                return r12;
            }
        }
        int r03 = 0;
        while (r03 <= r12) {
            int r22 = (r03 + r12) / 2;
            int compareTo2 = comparable.compareTo(((l0) this.f2377J.get(r22)).f2383J);
            if (compareTo2 < 0) {
                r12 = r22 - 1;
            } else if (compareTo2 > 0) {
                r03 = r22 + 1;
            } else {
                return r22;
            }
        }
        r02 = r03 + 1;
        return -r02;
    }

    public final void b() {
        if (!this.f2379L) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final Map.Entry c(int r22) {
        return (Map.Entry) this.f2377J.get(r22);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f2377J.isEmpty()) {
            this.f2377J.clear();
        }
        if (!this.f2378K.isEmpty()) {
            this.f2378K.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (a(comparable) < 0 && !this.f2378K.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final Set d() {
        if (this.f2378K.isEmpty()) {
            return Collections.emptySet();
        }
        return this.f2378K.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.f2378K.isEmpty() && !(this.f2378K instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f2378K = treeMap;
            this.f2381N = treeMap.descendingMap();
        }
        return (SortedMap) this.f2378K;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f2380M == null) {
            this.f2380M = new n0(this, 0);
        }
        return this.f2380M;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return super.equals(obj);
        }
        k0 k0Var = (k0) obj;
        int size = size();
        if (size != k0Var.size()) {
            return false;
        }
        int size2 = this.f2377J.size();
        if (size2 != k0Var.f2377J.size()) {
            return ((AbstractSet) entrySet()).equals(k0Var.entrySet());
        }
        for (int r4 = 0; r4 < size2; r4++) {
            if (!c(r4).equals(k0Var.c(r4))) {
                return false;
            }
        }
        if (size2 == size) {
            return true;
        }
        return this.f2378K.equals(k0Var.f2378K);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a4 = a(comparable);
        if (a4 >= 0) {
            return ((l0) this.f2377J.get(a4)).setValue(obj);
        }
        b();
        if (this.f2377J.isEmpty() && !(this.f2377J instanceof ArrayList)) {
            this.f2377J = new ArrayList(16);
        }
        int r02 = -(a4 + 1);
        if (r02 >= 16) {
            return e().put(comparable, obj);
        }
        if (this.f2377J.size() == 16) {
            l0 l0Var = (l0) this.f2377J.remove(15);
            e().put(l0Var.f2383J, l0Var.f2384K);
        }
        this.f2377J.add(r02, new l0(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a4 = a(comparable);
        if (a4 >= 0) {
            return ((l0) this.f2377J.get(a4)).f2384K;
        }
        return this.f2378K.get(comparable);
    }

    public final Object h(int r6) {
        b();
        Object obj = ((l0) this.f2377J.remove(r6)).f2384K;
        if (!this.f2378K.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.f2377J;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new l0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f2377J.size();
        int r22 = 0;
        for (int r12 = 0; r12 < size; r12++) {
            r22 += ((l0) this.f2377J.get(r12)).hashCode();
        }
        if (this.f2378K.size() > 0) {
            return r22 + this.f2378K.hashCode();
        }
        return r22;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a4 = a(comparable);
        if (a4 >= 0) {
            return h(a4);
        }
        if (this.f2378K.isEmpty()) {
            return null;
        }
        return this.f2378K.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f2378K.size() + this.f2377J.size();
    }
}
