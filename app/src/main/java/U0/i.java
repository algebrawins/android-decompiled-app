package U0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i extends o {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f1295a;

    public i(ArrayList arrayList) {
        this.f1295a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            return this.f1295a.equals(((i) ((o) obj)).f1295a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1295a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f1295a + "}";
    }
}
