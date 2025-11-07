package w1;

/* loaded from: classes.dex */
public final class p {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            ((p) obj).getClass();
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return -228219804;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=common, enableFirelog=true, firelogEventType=1}";
    }
}
