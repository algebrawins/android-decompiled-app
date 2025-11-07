package r0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f4876a;

    public d(String str) {
        N2.g.e(str, "name");
        this.f4876a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return N2.g.a(this.f4876a, ((d) obj).f4876a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4876a.hashCode();
    }

    public final String toString() {
        return this.f4876a;
    }
}
