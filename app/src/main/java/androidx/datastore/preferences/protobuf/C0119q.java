package androidx.datastore.preferences.protobuf;

import java.util.Collections;

/* renamed from: androidx.datastore.preferences.protobuf.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0119q {

    /* renamed from: a  reason: collision with root package name */
    public static volatile C0119q f2410a;

    /* renamed from: b  reason: collision with root package name */
    public static final C0119q f2411b;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.q, java.lang.Object] */
    static {
        ?? obj = new Object();
        Collections.emptyMap();
        f2411b = obj;
    }

    public static C0119q a() {
        C0109f0 c0109f0 = C0109f0.f2342c;
        C0119q c0119q = f2410a;
        if (c0119q == null) {
            synchronized (C0119q.class) {
                try {
                    c0119q = f2410a;
                    if (c0119q == null) {
                        Class cls = AbstractC0118p.f2403a;
                        C0119q c0119q2 = null;
                        if (cls != null) {
                            try {
                                c0119q2 = (C0119q) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c0119q2 == null) {
                            c0119q2 = f2411b;
                        }
                        f2410a = c0119q2;
                        c0119q = c0119q2;
                    }
                } finally {
                }
            }
        }
        return c0119q;
    }
}
