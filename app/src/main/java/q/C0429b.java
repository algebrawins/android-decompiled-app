package q;

import D.ThreadFactoryC0034o;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import b0.AbstractC0140b;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executors;
import x1.K4;

/* renamed from: q.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0429b extends K4 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f4791a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public volatile Handler f4792b;

    public C0429b() {
        Executors.newFixedThreadPool(4, new ThreadFactoryC0034o(2));
    }

    public static Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC0140b.b(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
