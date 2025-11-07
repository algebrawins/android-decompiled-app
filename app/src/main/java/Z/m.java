package z;

import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.U;
import androidx.camera.core.impl.g0;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public class m implements U {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f6567a;

    static {
        HashMap hashMap = new HashMap();
        f6567a = hashMap;
        hashMap.put("SM-T580", null);
        hashMap.put("SM-J710MN", new Range(21, 26));
        hashMap.put("SM-A320FL", null);
        hashMap.put("SM-G570M", null);
        hashMap.put("SM-G610F", null);
        hashMap.put("SM-G610M", new Range(21, 26));
    }

    public static Size a(g0 g0Var) {
        if (!b()) {
            return null;
        }
        int r22 = l.f6566a[g0Var.ordinal()];
        if (r22 != 1) {
            if (r22 != 2) {
                if (r22 != 3) {
                    return null;
                }
                return new Size(3264, 1836);
            }
            return new Size(1280, 720);
        }
        return new Size(1920, 1080);
    }

    public static boolean b() {
        if ("samsung".equalsIgnoreCase(Build.BRAND)) {
            HashMap hashMap = f6567a;
            String str = Build.MODEL;
            Locale locale = Locale.US;
            if (hashMap.containsKey(str.toUpperCase(locale))) {
                Range range = (Range) hashMap.get(str.toUpperCase(locale));
                if (range == null) {
                    return true;
                }
                return range.contains((Range) Integer.valueOf(Build.VERSION.SDK_INT));
            }
            return false;
        }
        return false;
    }
}
