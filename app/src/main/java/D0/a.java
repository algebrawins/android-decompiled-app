package D0;

import android.os.Trace;

/* loaded from: classes.dex */
public abstract class a {
    public static void a(String str, int r12) {
        Trace.beginAsyncSection(str, r12);
    }

    public static void b(String str, int r12) {
        Trace.endAsyncSection(str, r12);
    }

    public static boolean c() {
        return Trace.isEnabled();
    }
}
