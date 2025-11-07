package O0;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;

/* loaded from: classes.dex */
public abstract /* synthetic */ class b {
    public static /* bridge */ /* synthetic */ int a() {
        return Build.VERSION.PREVIEW_SDK_INT;
    }

    public static /* bridge */ /* synthetic */ String m() {
        return Build.VERSION.BASE_OS;
    }

    public static /* bridge */ /* synthetic */ Object x(Context context) {
        return context.getSystemService(LocationManager.class);
    }

    public static /* bridge */ /* synthetic */ String y() {
        return Build.VERSION.SECURITY_PATCH;
    }
}
