package U;

import android.app.Activity;
import android.app.SharedElementCallback;

/* loaded from: classes.dex */
public abstract class a {
    public static void a(Object obj) {
        ((SharedElementCallback.OnSharedElementsReadyListener) obj).onSharedElementsReady();
    }

    public static void b(Activity activity, String[] strArr, int r22) {
        activity.requestPermissions(strArr, r22);
    }

    public static boolean c(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }
}
