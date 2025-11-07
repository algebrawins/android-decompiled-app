package x1;

import android.os.Looper;

/* renamed from: x1.g0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0612g0 {
    public static void a() {
        boolean z3;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0624h4.f("Not in application's main thread", z3);
    }
}
