package D;

/* renamed from: D.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0026f {

    /* renamed from: a  reason: collision with root package name */
    public final int f381a;

    /* renamed from: b  reason: collision with root package name */
    public final Throwable f382b;

    public C0026f(int r12, Throwable th) {
        this.f381a = r12;
        this.f382b = th;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0026f)) {
            return false;
        }
        C0026f c0026f = (C0026f) obj;
        if (this.f381a == c0026f.f381a) {
            Throwable th = c0026f.f382b;
            Throwable th2 = this.f382b;
            if (th2 == null) {
                if (th == null) {
                    return true;
                }
            } else if (th2.equals(th)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int r02 = (this.f381a ^ 1000003) * 1000003;
        Throwable th = this.f382b;
        if (th == null) {
            hashCode = 0;
        } else {
            hashCode = th.hashCode();
        }
        return r02 ^ hashCode;
    }

    public final String toString() {
        return "StateError{code=" + this.f381a + ", cause=" + this.f382b + "}";
    }
}
