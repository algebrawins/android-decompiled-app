package x1;

/* loaded from: classes.dex */
public final class D6 {

    /* renamed from: a  reason: collision with root package name */
    public final String f5531a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5532b;

    public D6(String str, int r22) {
        this.f5531a = str;
        this.f5532b = r22;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof D6) {
            D6 d6 = (D6) obj;
            if (this.f5531a.equals(d6.f5531a) && this.f5532b == d6.f5532b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f5531a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ this.f5532b;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=" + this.f5531a + ", enableFirelog=true, firelogEventType=" + this.f5532b + "}";
    }
}
