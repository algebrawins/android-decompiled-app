package x1;

import android.os.Handler;
import android.os.Looper;

/* renamed from: x1.k0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0636k0 {
    public static G.a a() {
        if (G.a.f663K != null) {
            return G.a.f663K;
        }
        synchronized (G.a.class) {
            try {
                if (G.a.f663K == null) {
                    G.a.f663K = new G.a(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return G.a.f663K;
    }

    public static G.g b() {
        if (G.g.f674L != null) {
            return G.g.f674L;
        }
        synchronized (G.g.class) {
            try {
                if (G.g.f674L == null) {
                    G.g.f674L = new G.g(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return G.g.f674L;
    }

    public static G.h c() {
        if (G.h.f677L != null) {
            return G.h.f677L;
        }
        synchronized (G.h.class) {
            try {
                if (G.h.f677L == null) {
                    G.h.f677L = new G.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return G.h.f677L;
    }

    public static G.e d() {
        if (G.i.f680a != null) {
            return G.i.f680a;
        }
        synchronized (G.i.class) {
            try {
                if (G.i.f680a == null) {
                    G.i.f680a = new G.e(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return G.i.f680a;
    }
}
