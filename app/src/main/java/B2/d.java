package B2;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class d implements Serializable {

    /* renamed from: J  reason: collision with root package name */
    public final Throwable f202J;

    public d(Throwable th) {
        N2.g.e(th, "exception");
        this.f202J = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            if (N2.g.a(this.f202J, ((d) obj).f202J)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f202J.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f202J + ')';
    }
}
