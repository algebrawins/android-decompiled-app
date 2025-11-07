package Q1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final U1.g f1064a = new U1.g("CommonUtils", "");

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e4) {
            String concat = "Exception thrown when trying to get app version ".concat(e4.toString());
            U1.g gVar = f1064a;
            if (Log.isLoggable(gVar.f1338a, 6)) {
                Log.e("CommonUtils", gVar.b(concat));
            }
            return "";
        }
    }
}
