package W0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final c f1483a;

    /* renamed from: b  reason: collision with root package name */
    public final long f1484b;

    public a(c cVar, long j3) {
        if (cVar != null) {
            this.f1483a = cVar;
            this.f1484b = j3;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f1483a.equals(aVar.f1483a) && this.f1484b == aVar.f1484b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f1484b;
        return ((this.f1483a.hashCode() ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3));
    }

    public final String toString() {
        return "BackendResponse{status=" + this.f1483a + ", nextRequestWaitMillis=" + this.f1484b + "}";
    }
}
