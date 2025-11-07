package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* loaded from: classes.dex */
public final class l0 implements Map.Entry, Comparable {

    /* renamed from: J  reason: collision with root package name */
    public final Comparable f2383J;

    /* renamed from: K  reason: collision with root package name */
    public Object f2384K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ k0 f2385L;

    public l0(k0 k0Var, Comparable comparable, Object obj) {
        this.f2385L = k0Var;
        this.f2383J = comparable;
        this.f2384K = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f2383J.compareTo(((l0) obj).f2383J);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.f2383J;
        if (comparable == null) {
            if (key == null) {
                equals = true;
            } else {
                equals = false;
            }
        } else {
            equals = comparable.equals(key);
        }
        if (equals) {
            Object obj2 = this.f2384K;
            Object value = entry.getValue();
            if (obj2 == null) {
                if (value == null) {
                    equals2 = true;
                } else {
                    equals2 = false;
                }
            } else {
                equals2 = obj2.equals(value);
            }
            if (equals2) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2383J;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f2384K;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int r02 = 0;
        Comparable comparable = this.f2383J;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.f2384K;
        if (obj != null) {
            r02 = obj.hashCode();
        }
        return r02 ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f2385L.b();
        Object obj2 = this.f2384K;
        this.f2384K = obj;
        return obj2;
    }

    public final String toString() {
        return this.f2383J + "=" + this.f2384K;
    }
}
