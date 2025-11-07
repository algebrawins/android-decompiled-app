package q;

import android.os.Looper;
import x1.K4;

/* renamed from: q.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0428a extends K4 {

    /* renamed from: b  reason: collision with root package name */
    public static volatile C0428a f4789b;

    /* renamed from: a  reason: collision with root package name */
    public final C0429b f4790a = new C0429b();

    public static C0428a a() {
        if (f4789b != null) {
            return f4789b;
        }
        synchronized (C0428a.class) {
            try {
                if (f4789b == null) {
                    f4789b = new C0428a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f4789b;
    }

    public final void b(Runnable runnable) {
        C0429b c0429b = this.f4790a;
        if (c0429b.f4792b == null) {
            synchronized (c0429b.f4791a) {
                try {
                    if (c0429b.f4792b == null) {
                        c0429b.f4792b = C0429b.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        c0429b.f4792b.post(runnable);
    }
}
