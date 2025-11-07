package androidx.camera.core.impl;

/* renamed from: androidx.camera.core.impl.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0077d {

    /* renamed from: a  reason: collision with root package name */
    public final Object f2185a;

    public C0077d(Object obj) {
        this.f2185a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0077d) {
            return this.f2185a.equals(((C0077d) obj).f2185a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2185a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Identifier{value=" + this.f2185a + "}";
    }
}
