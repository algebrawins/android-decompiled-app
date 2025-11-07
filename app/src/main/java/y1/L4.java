package y1;

/* loaded from: classes.dex */
public final class L4 {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof L4) {
            ((L4) obj).getClass();
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 1269983555;
    }

    public final String toString() {
        return "MLKitLoggingOptions{libraryName=vision-common, enableFirelog=true, firelogEventType=1}";
    }
}
