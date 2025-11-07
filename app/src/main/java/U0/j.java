package U0;

/* loaded from: classes.dex */
public final class j extends q {

    /* renamed from: a  reason: collision with root package name */
    public final p f1296a;

    /* renamed from: b  reason: collision with root package name */
    public final h f1297b;

    public j(p pVar, h hVar) {
        this.f1296a = pVar;
        this.f1297b = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        p pVar = this.f1296a;
        if (pVar != null ? pVar.equals(((j) qVar).f1296a) : ((j) qVar).f1296a == null) {
            if (this.f1297b.equals(((j) qVar).f1297b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        p pVar = this.f1296a;
        if (pVar == null) {
            hashCode = 0;
        } else {
            hashCode = pVar.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ this.f1297b.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.f1296a + ", androidClientInfo=" + this.f1297b + "}";
    }
}
