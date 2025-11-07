package X2;

/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f1623a;

    public h(Throwable th) {
        this.f1623a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            if (N2.g.a(this.f1623a, ((h) obj).f1623a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f1623a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // X2.i
    public final String toString() {
        return "Closed(" + this.f1623a + ')';
    }
}
