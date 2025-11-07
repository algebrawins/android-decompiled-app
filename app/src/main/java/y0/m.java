package y0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import h1.C0287g;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public static final S.m f6225a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f6226b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static C0287g f6227c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return k.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [h1.g, java.lang.Object] */
    public static C0287g b() {
        ?? obj = new Object();
        f6227c = obj;
        f6225a.j(obj);
        return f6227c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:24|25|26|(2:64|65)(1:28)|29|(8:36|(1:40)|(1:59)(1:47)|48|(2:55|56)|52|53|54)|(1:63)|(1:40)|(1:42)|59|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009d, code lost:
        r4 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(android.content.Context r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.m.c(android.content.Context, boolean):void");
    }
}
