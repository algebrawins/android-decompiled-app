package S1;

import java.util.Arrays;
import k1.w;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f1197a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        if (this.f1197a == ((b) obj).f1197a && w.h(null, null) && w.h(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1197a), Boolean.FALSE, null, null});
    }
}
