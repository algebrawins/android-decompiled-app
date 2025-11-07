package x1;

import java.util.Set;

/* renamed from: x1.h0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0620h0 {
    public Object a(Class cls) {
        L1.a b3 = b(cls);
        if (b3 == null) {
            return null;
        }
        return b3.get();
    }

    public abstract L1.a b(Class cls);

    public Set c(Class cls) {
        return (Set) d(cls).get();
    }

    public abstract L1.a d(Class cls);
}
