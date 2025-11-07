package D;

/* renamed from: D.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0025e {

    /* renamed from: a  reason: collision with root package name */
    public final r f371a;

    /* renamed from: b  reason: collision with root package name */
    public final C0026f f372b;

    public C0025e(r rVar, C0026f c0026f) {
        if (rVar != null) {
            this.f371a = rVar;
            this.f372b = c0026f;
            return;
        }
        throw new NullPointerException("Null type");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0025e)) {
            return false;
        }
        C0025e c0025e = (C0025e) obj;
        if (this.f371a.equals(c0025e.f371a)) {
            C0026f c0026f = c0025e.f372b;
            C0026f c0026f2 = this.f372b;
            if (c0026f2 == null) {
                if (c0026f == null) {
                    return true;
                }
            } else if (c0026f2.equals(c0026f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f371a.hashCode() ^ 1000003) * 1000003;
        C0026f c0026f = this.f372b;
        if (c0026f == null) {
            hashCode = 0;
        } else {
            hashCode = c0026f.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        return "CameraState{type=" + this.f371a + ", error=" + this.f372b + "}";
    }
}
