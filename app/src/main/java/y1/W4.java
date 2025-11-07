package y1;

import java.util.Set;

/* loaded from: classes.dex */
public abstract class W4 extends AbstractC0866n4 implements Set {

    /* renamed from: K  reason: collision with root package name */
    public transient V4 f6322K;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int r3;
        int r22 = 0;
        for (Object obj : this) {
            if (obj != null) {
                r3 = obj.hashCode();
            } else {
                r3 = 0;
            }
            r22 += r3;
        }
        return r22;
    }
}
