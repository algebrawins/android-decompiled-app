package F1;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final Class f634a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f635b;

    public j(Class cls, boolean z3) {
        this.f634a = cls;
        this.f635b = z3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!jVar.f634a.equals(this.f634a) || jVar.f635b != this.f635b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f634a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f635b).hashCode();
    }
}
