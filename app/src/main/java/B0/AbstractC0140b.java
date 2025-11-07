package b0;

import android.os.Handler;
import android.os.Looper;
import h2.RunnableC0288A;

/* renamed from: b0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0140b {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler b(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static boolean c(Handler handler, RunnableC0288A runnableC0288A) {
        return handler.postDelayed(runnableC0288A, "retry_token", 500L);
    }
}
