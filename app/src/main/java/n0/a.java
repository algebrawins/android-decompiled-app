package N0;

import C2.q;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a {
    public static int a(SidecarDeviceState sidecarDeviceState) {
        N2.g.e(sidecarDeviceState, "sidecarDeviceState");
        try {
            try {
                return sidecarDeviceState.posture;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return 0;
            }
        } catch (NoSuchFieldError unused2) {
            Object invoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
            N2.g.c(invoke, "null cannot be cast to non-null type kotlin.Int");
            return ((Integer) invoke).intValue();
        }
    }

    public static int b(SidecarDeviceState sidecarDeviceState) {
        N2.g.e(sidecarDeviceState, "sidecarDeviceState");
        int a4 = a(sidecarDeviceState);
        if (a4 < 0 || a4 > 4) {
            return 0;
        }
        return a4;
    }

    public static List c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        q qVar = q.f272J;
        N2.g.e(sidecarWindowLayoutInfo, "info");
        try {
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                if (list != null) {
                    return list;
                }
                return qVar;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return qVar;
            }
        } catch (NoSuchFieldError unused2) {
            Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
            N2.g.c(invoke, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
            return (List) invoke;
        }
    }

    public static void d(SidecarDeviceState sidecarDeviceState, int r7) {
        try {
            try {
                sidecarDeviceState.posture = r7;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(r7));
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
    }
}
