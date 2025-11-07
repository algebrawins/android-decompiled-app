package x1;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;

/* renamed from: x1.e0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0596e0 {
    public static Context a(Context context) {
        String b3;
        Context applicationContext = context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 30 && (b3 = F.d.b(context)) != null) {
            return F.d.a(applicationContext, b3);
        }
        return applicationContext;
    }

    public static Application b(Context context) {
        String b3;
        Context a4 = a(context);
        while (a4 instanceof ContextWrapper) {
            if (a4 instanceof Application) {
                return (Application) a4;
            }
            ContextWrapper contextWrapper = (ContextWrapper) a4;
            Context baseContext = contextWrapper.getBaseContext();
            if (Build.VERSION.SDK_INT >= 30 && (b3 = F.d.b(contextWrapper)) != null) {
                a4 = F.d.a(baseContext, b3);
            } else {
                a4 = baseContext;
            }
        }
        return null;
    }
}
