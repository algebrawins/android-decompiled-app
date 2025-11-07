package r1;

import F1.c;
import android.content.Context;

/* renamed from: r1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0443a {

    /* renamed from: b  reason: collision with root package name */
    public static final C0443a f4882b;

    /* renamed from: a  reason: collision with root package name */
    public c f4883a;

    /* JADX WARN: Type inference failed for: r0v0, types: [r1.a, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.f4883a = null;
        f4882b = obj;
    }

    public static c a(Context context) {
        c cVar;
        C0443a c0443a = f4882b;
        synchronized (c0443a) {
            try {
                if (c0443a.f4883a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    c0443a.f4883a = new c(context);
                }
                cVar = c0443a.f4883a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }
}
