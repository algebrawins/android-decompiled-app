package z;

import android.os.Build;
import androidx.camera.core.impl.U;

/* loaded from: classes.dex */
public class k implements U {
    public static boolean a() {
        if ("SAMSUNG".equalsIgnoreCase(Build.BRAND) && "J7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27) {
            return true;
        }
        return false;
    }

    public static boolean b() {
        if ("SAMSUNG".equalsIgnoreCase(Build.BRAND) && "ON7XELTE".equalsIgnoreCase(Build.DEVICE) && Build.VERSION.SDK_INT >= 27) {
            return true;
        }
        return false;
    }
}
