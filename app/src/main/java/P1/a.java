package P1;

import B2.d;
import N2.g;

/* loaded from: classes.dex */
public abstract class a {
    public static final d a(Throwable th) {
        g.e(th, "exception");
        return new d(th);
    }

    public static final void b(Object obj) {
        if (!(obj instanceof d)) {
            return;
        }
        throw ((d) obj).f202J;
    }
}
