package x1;

import java.util.Arrays;
import k0.C0322i;

/* loaded from: classes.dex */
public final class B6 {

    /* renamed from: a  reason: collision with root package name */
    public final G f5508a;

    public /* synthetic */ B6(C0322i c0322i) {
        this.f5508a = (G) c0322i.f3983K;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B6)) {
            return false;
        }
        return k1.w.h(this.f5508a, ((B6) obj).f5508a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5508a});
    }
}
