package c3;

import a3.w;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public static final String f2695a;

    /* renamed from: b  reason: collision with root package name */
    public static final long f2696b;

    /* renamed from: c  reason: collision with root package name */
    public static final int f2697c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f2698d;

    /* renamed from: e  reason: collision with root package name */
    public static final long f2699e;

    /* renamed from: f  reason: collision with root package name */
    public static final h f2700f;
    public static final k g;

    /* renamed from: h  reason: collision with root package name */
    public static final k f2701h;

    static {
        String str;
        int r12 = w.f1886a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f2695a = str;
        f2696b = a3.a.j("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int r02 = w.f1886a;
        if (r02 < 2) {
            r02 = 2;
        }
        f2697c = a3.a.k("kotlinx.coroutines.scheduler.core.pool.size", r02, 1, 0, 8);
        f2698d = a3.a.k("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);
        f2699e = TimeUnit.SECONDS.toNanos(a3.a.j("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f2700f = h.f2689a;
        g = new k(0);
        f2701h = new k(1);
    }
}
