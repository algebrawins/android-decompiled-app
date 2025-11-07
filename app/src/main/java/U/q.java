package U;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1248a;

    /* renamed from: b  reason: collision with root package name */
    public final NotificationManager f1249b;

    static {
        new HashSet();
    }

    public q(Context context) {
        this.f1248a = context;
        this.f1249b = (NotificationManager) context.getSystemService("notification");
    }

    public final boolean a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return p.a(this.f1249b);
        }
        Context context = this.f1248a;
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int r6 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.intValue();
            if (((Integer) method.invoke(appOpsManager, num, Integer.valueOf(r6), packageName)).intValue() != 0) {
                return false;
            }
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }
}
