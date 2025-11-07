package k1;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import p1.C0427a;
import u1.HandlerC0477e;

/* loaded from: classes.dex */
public final class G {
    public static final Object g = new Object();

    /* renamed from: h  reason: collision with root package name */
    public static G f4008h;

    /* renamed from: i  reason: collision with root package name */
    public static HandlerThread f4009i;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f4010a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Context f4011b;

    /* renamed from: c  reason: collision with root package name */
    public volatile HandlerC0477e f4012c;

    /* renamed from: d  reason: collision with root package name */
    public final C0427a f4013d;

    /* renamed from: e  reason: collision with root package name */
    public final long f4014e;

    /* renamed from: f  reason: collision with root package name */
    public final long f4015f;

    /* JADX WARN: Type inference failed for: r2v2, types: [u1.e, android.os.Handler] */
    /* JADX WARN: Type inference failed for: r3v3, types: [p1.a, java.lang.Object] */
    public G(Context context, Looper looper) {
        F f2 = new F(this);
        this.f4011b = context.getApplicationContext();
        this.f4012c = new Handler(looper, f2);
        if (C0427a.f4788b == null) {
            synchronized (C0427a.f4787a) {
                try {
                    if (C0427a.f4788b == null) {
                        ?? obj = new Object();
                        new ConcurrentHashMap();
                        C0427a.f4788b = obj;
                    }
                } finally {
                }
            }
        }
        C0427a c0427a = C0427a.f4788b;
        w.e(c0427a);
        this.f4013d = c0427a;
        this.f4014e = 5000L;
        this.f4015f = 300000L;
    }

    public static HandlerThread a() {
        synchronized (g) {
            try {
                HandlerThread handlerThread = f4009i;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f4009i = handlerThread2;
                handlerThread2.start();
                return f4009i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(String str, ServiceConnection serviceConnection, boolean z3) {
        D d4 = new D(str, z3);
        w.f(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f4010a) {
            try {
                E e4 = (E) this.f4010a.get(d4);
                if (e4 != null) {
                    if (e4.f4001a.containsKey(serviceConnection)) {
                        e4.f4001a.remove(serviceConnection);
                        if (e4.f4001a.isEmpty()) {
                            this.f4012c.sendMessageDelayed(this.f4012c.obtainMessage(0, d4), this.f4014e);
                        }
                    } else {
                        throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(d4.toString()));
                    }
                } else {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(d4.toString()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(D d4, z zVar, String str) {
        boolean z3;
        synchronized (this.f4010a) {
            try {
                E e4 = (E) this.f4010a.get(d4);
                if (e4 == null) {
                    e4 = new E(this, d4);
                    e4.f4001a.put(zVar, zVar);
                    e4.a(str);
                    this.f4010a.put(d4, e4);
                } else {
                    this.f4012c.removeMessages(0, d4);
                    if (!e4.f4001a.containsKey(zVar)) {
                        e4.f4001a.put(zVar, zVar);
                        int r6 = e4.f4002b;
                        if (r6 != 1) {
                            if (r6 == 2) {
                                e4.a(str);
                            }
                        } else {
                            zVar.onServiceConnected(e4.f4006f, e4.f4004d);
                        }
                    } else {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(d4.toString()));
                    }
                }
                z3 = e4.f4003c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z3;
    }
}
