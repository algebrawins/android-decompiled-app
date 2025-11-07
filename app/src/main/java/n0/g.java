package N0;

import H0.l;
import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;

/* loaded from: classes.dex */
public abstract class g {
    public static IBinder a(Activity activity) {
        Window window;
        WindowManager.LayoutParams attributes;
        if (activity != null && (window = activity.getWindow()) != null && (attributes = window.getAttributes()) != null) {
            return attributes.token;
        }
        return null;
    }

    public static SidecarInterface b(Context context) {
        N2.g.e(context, "context");
        return SidecarProvider.getSidecarImpl(context.getApplicationContext());
    }

    public static l c() {
        try {
            String apiVersion = SidecarProvider.getApiVersion();
            if (TextUtils.isEmpty(apiVersion)) {
                return null;
            }
            l lVar = l.f733O;
            return H0.i.c(apiVersion);
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return null;
        }
    }
}
