package N2;

/* loaded from: classes.dex */
public final class i implements c {

    /* renamed from: a  reason: collision with root package name */
    public final Class f1002a;

    public i(Class cls) {
        this.f1002a = cls;
    }

    @Override // N2.c
    public final Class a() {
        return this.f1002a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            if (g.a(this.f1002a, ((i) obj).f1002a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f1002a.hashCode();
    }

    public final String toString() {
        return this.f1002a + " (Kotlin reflection is not available)";
    }
}
