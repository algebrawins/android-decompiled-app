package c0;

import R.k;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final R.f f2646a = new R.f(16);

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadPoolExecutor f2647b;

    /* renamed from: c  reason: collision with root package name */
    public static final Object f2648c;

    /* renamed from: d  reason: collision with root package name */
    public static final k f2649d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) ModuleDescriptor.MODULE_VERSION, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new G.f(1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f2647b = threadPoolExecutor;
        f2648c = new Object();
        f2649d = new k();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static c0.d a(java.lang.String r6, android.content.Context r7, E.c r8, int r9) {
        /*
            R.f r0 = c0.e.f2646a
            java.lang.Object r1 = r0.a(r6)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L10
            c0.d r6 = new c0.d
            r6.<init>(r1)
            return r6
        L10:
            c0.f r8 = c0.AbstractC0158b.a(r7, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5c
            r1 = 1
            r2 = -3
            java.lang.Object r3 = r8.f2651b
            c0.g[] r3 = (c0.g[]) r3
            int r8 = r8.f2650a
            if (r8 == 0) goto L24
            if (r8 == r1) goto L22
        L20:
            r1 = -3
            goto L3d
        L22:
            r1 = -2
            goto L3d
        L24:
            if (r3 == 0) goto L3d
            int r8 = r3.length
            if (r8 != 0) goto L2a
            goto L3d
        L2a:
            int r8 = r3.length
            r1 = 0
            r4 = 0
        L2d:
            if (r4 >= r8) goto L3d
            r5 = r3[r4]
            int r5 = r5.f2656e
            if (r5 == 0) goto L3a
            if (r5 >= 0) goto L38
            goto L20
        L38:
            r1 = r5
            goto L3d
        L3a:
            int r4 = r4 + 1
            goto L2d
        L3d:
            if (r1 == 0) goto L45
            c0.d r6 = new c0.d
            r6.<init>(r1)
            return r6
        L45:
            x1.y0 r8 = Y.e.f1643a
            android.graphics.Typeface r7 = r8.b(r7, r3, r9)
            if (r7 == 0) goto L56
            r0.b(r6, r7)
            c0.d r6 = new c0.d
            r6.<init>(r7)
            return r6
        L56:
            c0.d r6 = new c0.d
            r6.<init>(r2)
            return r6
        L5c:
            c0.d r6 = new c0.d
            r7 = -1
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.e.a(java.lang.String, android.content.Context, E.c, int):c0.d");
    }
}
