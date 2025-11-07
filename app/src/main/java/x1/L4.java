package x1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class L4 {

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f5663a;

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f5664b;

    /* renamed from: c  reason: collision with root package name */
    public static Boolean f5665c;

    /* renamed from: d  reason: collision with root package name */
    public static Boolean f5666d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f5663a == null) {
            f5663a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (!f5663a.booleanValue() || Build.VERSION.SDK_INT >= 24) {
            if (f5664b == null) {
                f5664b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
            }
            if (f5664b.booleanValue()) {
                int r22 = Build.VERSION.SDK_INT;
                if (r22 < 26 || r22 >= 30) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
