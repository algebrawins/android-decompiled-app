package u0;

import android.util.Log;

/* renamed from: u0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0467c {

    /* renamed from: a  reason: collision with root package name */
    public static final C0466b f5021a = C0466b.f5020a;

    public static C0466b a(t0.e eVar) {
        while (eVar != null) {
            eVar = null;
        }
        return f5021a;
    }

    public static void b(AbstractC0472h abstractC0472h) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(abstractC0472h.f5022J.getClass().getName()), abstractC0472h);
        }
    }
}
