package K0;

import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final Object f844a;

    public l(List list) {
        this.f844a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class.equals(obj.getClass())) {
            return this.f844a.equals(((l) obj).f844a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f844a.hashCode();
    }

    public final String toString() {
        return C2.i.j((Collection) ((Iterable) this.f844a), ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
