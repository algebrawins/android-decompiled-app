package S0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f1194a;

    /* renamed from: b  reason: collision with root package name */
    public final c f1195b;

    public a(Object obj, c cVar) {
        if (obj != null) {
            this.f1194a = (byte[]) obj;
            if (cVar != null) {
                this.f1195b = cVar;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        if (this.f1194a.equals(aVar.f1194a) && this.f1195b.equals(aVar.f1195b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1195b.hashCode() ^ (((1000003 * 1000003) ^ this.f1194a.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f1194a + ", priority=" + this.f1195b + "}";
    }
}
