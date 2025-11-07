package W2;

import N2.g;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* loaded from: classes.dex */
public abstract class d {
    private static volatile Choreographer choreographer;

    static {
        Object a4;
        try {
            a4 = new c(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            a4 = P1.a.a(th);
        }
        if (a4 instanceof B2.d) {
            a4 = null;
        }
        c cVar = (c) a4;
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            g.c(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
