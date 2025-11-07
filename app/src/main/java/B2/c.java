package B2;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class c implements Serializable {

    /* renamed from: J  reason: collision with root package name */
    public final Object f200J;

    /* renamed from: K  reason: collision with root package name */
    public final Object f201K;

    public c(Object obj, Object obj2) {
        this.f200J = obj;
        this.f201K = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (N2.g.a(this.f200J, cVar.f200J) && N2.g.a(this.f201K, cVar.f201K)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int r02 = 0;
        Object obj = this.f200J;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int r12 = hashCode * 31;
        Object obj2 = this.f201K;
        if (obj2 != null) {
            r02 = obj2.hashCode();
        }
        return r12 + r02;
    }

    public final String toString() {
        return "(" + this.f200J + ", " + this.f201K + ')';
    }
}
