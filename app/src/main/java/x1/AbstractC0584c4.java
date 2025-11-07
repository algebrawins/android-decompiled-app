package x1;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import b0.AbstractC0140b;
import java.lang.reflect.InvocationTargetException;

/* renamed from: x1.c4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0584c4 {
    public static Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC0140b.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e4) {
            e = e4;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e5) {
            e = e5;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e6) {
            e = e6;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e7) {
            Throwable cause = e7.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
    }
}
