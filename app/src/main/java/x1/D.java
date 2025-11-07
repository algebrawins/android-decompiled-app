package x1;

import java.util.Set;

/* loaded from: classes.dex */
public abstract class D extends AbstractC0738x implements Set {

    /* renamed from: K  reason: collision with root package name */
    public transient C f5517K;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || this == obj) {
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
        return AbstractC0649l5.a(this);
    }
}
