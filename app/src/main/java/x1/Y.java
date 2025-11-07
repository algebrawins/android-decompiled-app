package x1;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class Y {

    /* renamed from: a  reason: collision with root package name */
    public static long f5804a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f5805b;

    /* renamed from: c  reason: collision with root package name */
    public static Method f5806c;

    /* renamed from: d  reason: collision with root package name */
    public static Method f5807d;

    public static void a(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static String b(String str) {
        if (str.length() <= 127) {
            return str;
        }
        return str.substring(0, 127);
    }
}
