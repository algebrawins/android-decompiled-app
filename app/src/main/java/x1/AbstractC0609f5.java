package x1;

import android.util.Log;
import java.util.List;

/* renamed from: x1.f5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0609f5 {
    public static final List a(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        String th2 = th.toString();
        Throwable cause = th.getCause();
        String stackTraceString = Log.getStackTraceString(th);
        return C2.j.c(simpleName, th2, "Cause: " + cause + ", Stacktrace: " + stackTraceString);
    }
}
