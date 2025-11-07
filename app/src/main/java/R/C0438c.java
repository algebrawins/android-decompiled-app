package r;

import java.util.Map;

/* renamed from: r.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0438c implements Map.Entry {

    /* renamed from: J  reason: collision with root package name */
    public final Object f4859J;

    /* renamed from: K  reason: collision with root package name */
    public final Object f4860K;

    /* renamed from: L  reason: collision with root package name */
    public C0438c f4861L;

    /* renamed from: M  reason: collision with root package name */
    public C0438c f4862M;

    public C0438c(Object obj, Object obj2) {
        this.f4859J = obj;
        this.f4860K = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0438c)) {
            return false;
        }
        C0438c c0438c = (C0438c) obj;
        if (this.f4859J.equals(c0438c.f4859J) && this.f4860K.equals(c0438c.f4860K)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4859J;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4860K;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f4859J.hashCode() ^ this.f4860K.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f4859J + "=" + this.f4860K;
    }
}
