package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* loaded from: classes.dex */
public final class V {
    public static int a(int r5, Object obj, Object obj2) {
        U u3 = (U) obj;
        T t3 = (T) obj2;
        int r12 = 0;
        if (!u3.isEmpty()) {
            for (Map.Entry entry : u3.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                t3.getClass();
                int x3 = C0116n.x(r5);
                int a4 = T.a(t3.f2310a, key, value);
                r12 += C0116n.z(a4) + a4 + x3;
            }
        }
        return r12;
    }

    public static U b(Object obj, Object obj2) {
        U u3 = (U) obj;
        U u4 = (U) obj2;
        if (!u4.isEmpty()) {
            if (!u3.f2312J) {
                u3 = u3.b();
            }
            u3.a();
            if (!u4.isEmpty()) {
                u3.putAll(u4);
            }
        }
        return u3;
    }

    public static void c(Object obj) {
        ((U) obj).f2312J = false;
    }
}
