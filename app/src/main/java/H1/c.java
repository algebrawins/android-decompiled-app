package H1;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f739a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f740b;

    public c(String str, Map map) {
        this.f739a = str;
        this.f740b = map;
    }

    public static c a(String str) {
        return new c(str, Collections.emptyMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f739a.equals(cVar.f739a) && this.f740b.equals(cVar.f740b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f740b.hashCode() + (this.f739a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f739a + ", properties=" + this.f740b.values() + "}";
    }
}
