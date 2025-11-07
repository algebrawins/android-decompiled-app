package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class P0 extends AbstractMap {

    /* renamed from: P  reason: collision with root package name */
    public static final /* synthetic */ int f2834P = 0;

    /* renamed from: J  reason: collision with root package name */
    public final int f2835J;

    /* renamed from: M  reason: collision with root package name */
    public boolean f2838M;

    /* renamed from: N  reason: collision with root package name */
    public volatile androidx.datastore.preferences.protobuf.n0 f2839N;

    /* renamed from: K  reason: collision with root package name */
    public List f2836K = Collections.emptyList();

    /* renamed from: L  reason: collision with root package name */
    public Map f2837L = Collections.emptyMap();

    /* renamed from: O  reason: collision with root package name */
    public Map f2840O = Collections.emptyMap();

    public P0(int r12) {
        this.f2835J = r12;
    }

    public final int a() {
        return this.f2836K.size();
    }

    public final Iterable b() {
        if (this.f2837L.isEmpty()) {
            return S0.f2847b;
        }
        return this.f2837L.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: c */
    public final Object put(Comparable comparable, Object obj) {
        h();
        int e4 = e(comparable);
        if (e4 >= 0) {
            return ((T0) this.f2836K.get(e4)).setValue(obj);
        }
        h();
        boolean isEmpty = this.f2836K.isEmpty();
        int r22 = this.f2835J;
        if (isEmpty && !(this.f2836K instanceof ArrayList)) {
            this.f2836K = new ArrayList(r22);
        }
        int r02 = -(e4 + 1);
        if (r02 >= r22) {
            return g().put(comparable, obj);
        }
        if (this.f2836K.size() == r22) {
            T0 t02 = (T0) this.f2836K.remove(r22 - 1);
            g().put(t02.f2848J, t02.f2849K);
        }
        this.f2836K.add(r02, new T0(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        h();
        if (!this.f2836K.isEmpty()) {
            this.f2836K.clear();
        }
        if (!this.f2837L.isEmpty()) {
            this.f2837L.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (e(comparable) < 0 && !this.f2837L.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final Map.Entry d(int r22) {
        return (Map.Entry) this.f2836K.get(r22);
    }

    public final int e(Comparable comparable) {
        int size = this.f2836K.size();
        int r12 = size - 1;
        int r22 = 0;
        if (r12 >= 0) {
            int compareTo = comparable.compareTo(((T0) this.f2836K.get(r12)).f2848J);
            if (compareTo > 0) {
                return -(size + 1);
            }
            if (compareTo == 0) {
                return r12;
            }
        }
        while (r22 <= r12) {
            int r02 = (r22 + r12) / 2;
            int compareTo2 = comparable.compareTo(((T0) this.f2836K.get(r02)).f2848J);
            if (compareTo2 < 0) {
                r12 = r02 - 1;
            } else if (compareTo2 > 0) {
                r22 = r02 + 1;
            } else {
                return r02;
            }
        }
        return -(r22 + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f2839N == null) {
            this.f2839N = new androidx.datastore.preferences.protobuf.n0(this, 1);
        }
        return this.f2839N;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P0)) {
            return super.equals(obj);
        }
        P0 p02 = (P0) obj;
        int size = size();
        if (size != p02.size()) {
            return false;
        }
        int size2 = this.f2836K.size();
        if (size2 == p02.f2836K.size()) {
            for (int r4 = 0; r4 < size2; r4++) {
                if (!d(r4).equals(p02.d(r4))) {
                    return false;
                }
            }
            if (size2 == size) {
                return true;
            }
            return this.f2837L.equals(p02.f2837L);
        }
        return entrySet().equals(p02.entrySet());
    }

    public final Object f(int r6) {
        h();
        Object obj = ((T0) this.f2836K.remove(r6)).f2849K;
        if (!this.f2837L.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            List list = this.f2836K;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new T0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    public final SortedMap g() {
        h();
        if (this.f2837L.isEmpty() && !(this.f2837L instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f2837L = treeMap;
            this.f2840O = treeMap.descendingMap();
        }
        return (SortedMap) this.f2837L;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int e4 = e(comparable);
        if (e4 >= 0) {
            return ((T0) this.f2836K.get(e4)).f2849K;
        }
        return this.f2837L.get(comparable);
    }

    public final void h() {
        if (!this.f2838M) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f2836K.size();
        int r22 = 0;
        for (int r12 = 0; r12 < size; r12++) {
            r22 += ((T0) this.f2836K.get(r12)).hashCode();
        }
        if (this.f2837L.size() > 0) {
            return this.f2837L.hashCode() + r22;
        }
        return r22;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int e4 = e(comparable);
        if (e4 >= 0) {
            return f(e4);
        }
        if (this.f2837L.isEmpty()) {
            return null;
        }
        return this.f2837L.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f2837L.size() + this.f2836K.size();
    }
}
