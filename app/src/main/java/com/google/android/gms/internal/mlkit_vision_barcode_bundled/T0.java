package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Map;

/* loaded from: classes.dex */
public final class T0 implements Map.Entry, Comparable {

    /* renamed from: J  reason: collision with root package name */
    public final Comparable f2848J;

    /* renamed from: K  reason: collision with root package name */
    public Object f2849K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ P0 f2850L;

    public T0(P0 p02, Comparable comparable, Object obj) {
        this.f2850L = p02;
        this.f2848J = comparable;
        this.f2849K = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f2848J.compareTo(((T0) obj).f2848J);
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
        Comparable comparable = this.f2848J;
        if (comparable == null) {
            if (key != null) {
                equals = false;
            } else {
                equals = true;
            }
        } else {
            equals = comparable.equals(key);
        }
        if (equals) {
            Object obj2 = this.f2849K;
            Object value = entry.getValue();
            if (obj2 == null) {
                if (value != null) {
                    equals2 = false;
                } else {
                    equals2 = true;
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
    public final /* synthetic */ Object getKey() {
        return this.f2848J;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f2849K;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int r02 = 0;
        Comparable comparable = this.f2848J;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.f2849K;
        if (obj != null) {
            r02 = obj.hashCode();
        }
        return r02 ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f2850L.h();
        Object obj2 = this.f2849K;
        this.f2849K = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f2848J);
        String valueOf2 = String.valueOf(this.f2849K);
        return valueOf + "=" + valueOf2;
    }
}
