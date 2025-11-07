package x1;

import java.util.Map;

/* renamed from: x1.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0667o implements Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (AbstractC0617g5.a(getKey(), entry.getKey()) && AbstractC0617g5.a(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        Object key = getKey();
        Object value = getValue();
        int r22 = 0;
        if (key == null) {
            hashCode = 0;
        } else {
            hashCode = key.hashCode();
        }
        if (value != null) {
            r22 = value.hashCode();
        }
        return hashCode ^ r22;
    }

    public final String toString() {
        String valueOf = String.valueOf(getKey());
        String valueOf2 = String.valueOf(getValue());
        return valueOf + "=" + valueOf2;
    }
}
