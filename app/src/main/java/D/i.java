package D;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final N.n f404a;

    public i(N.n nVar) {
        if (nVar != null) {
            this.f404a = nVar;
            return;
        }
        throw new NullPointerException("Null surfaceOutput");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            iVar.getClass();
            return this.f404a.equals(iVar.f404a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f404a.hashCode() ^ (-721379959);
    }

    public final String toString() {
        return "Event{eventCode=0, surfaceOutput=" + this.f404a + "}";
    }
}
