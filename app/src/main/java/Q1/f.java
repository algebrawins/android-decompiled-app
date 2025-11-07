package Q1;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Callable;
import u1.HandlerC0477e;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f1069b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static f f1070c;

    /* renamed from: a  reason: collision with root package name */
    public final HandlerC0477e f1071a;

    /* JADX WARN: Type inference failed for: r0v0, types: [u1.e, android.os.Handler] */
    public f(Looper looper) {
        ?? handler = new Handler(looper);
        Looper.getMainLooper();
        this.f1071a = handler;
    }

    public static f a() {
        f fVar;
        synchronized (f1069b) {
            try {
                if (f1070c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f1070c = new f(handlerThread.getLooper());
                }
                fVar = f1070c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public static C1.j b(Callable callable) {
        C1.g gVar = new C1.g();
        n.zza.execute(new H.e(9, callable, gVar));
        return gVar.f239a;
    }
}
