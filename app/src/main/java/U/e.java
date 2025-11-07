package U;

import android.app.AppOpsManager;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class e {
    public static int a(AppOpsManager appOpsManager, String str, int r22, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, r22, str2);
    }

    public static String b(Context context) {
        return context.getOpPackageName();
    }

    public static AppOpsManager c(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }
}
