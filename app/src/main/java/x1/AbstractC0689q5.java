package x1;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
import y2.InterfaceC0939b;

/* renamed from: x1.q5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0689q5 {
    public static void a(Context context, InterfaceC0939b interfaceC0939b) {
        Rect rect;
        f0.G d4;
        f0.N b3;
        Object systemService;
        WindowMetrics maximumWindowMetrics;
        Activity b4 = b(context);
        if (b4 != null) {
            int r12 = K0.n.f847a;
            K0.o.f848a.getClass();
            int r13 = K0.q.f849b;
            int r14 = Build.VERSION.SDK_INT;
            if (r14 >= 30) {
                systemService = b4.getSystemService(WindowManager.class);
                maximumWindowMetrics = ((WindowManager) systemService).getMaximumWindowMetrics();
                rect = maximumWindowMetrics.getBounds();
                N2.g.d(rect, "wm.maximumWindowMetrics.bounds");
            } else {
                Object systemService2 = b4.getSystemService("window");
                N2.g.c(systemService2, "null cannot be cast to non-null type android.view.WindowManager");
                Display defaultDisplay = ((WindowManager) systemService2).getDefaultDisplay();
                N2.g.d(defaultDisplay, "display");
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                rect = new Rect(0, 0, point.x, point.y);
            }
            if (r14 >= 30) {
                if (r14 >= 30) {
                    b3 = O0.d.f1015a.a(b4);
                } else {
                    throw new Exception("Incompatible SDK version");
                }
            } else {
                if (r14 >= 30) {
                    d4 = new f0.F();
                } else if (r14 >= 29) {
                    d4 = new f0.E();
                } else {
                    d4 = new f0.D();
                }
                b3 = d4.b();
                N2.g.d(b3, "{\n            WindowInse…ilder().build()\n        }");
            }
            int r15 = rect.left;
            int r22 = rect.top;
            int r5 = rect.right;
            int r4 = rect.bottom;
            if (r15 <= r5) {
                if (r22 <= r4) {
                    N2.g.e(b3, "_windowInsetsCompat");
                    float f2 = context.getResources().getDisplayMetrics().density;
                    ((i2.c) interfaceC0939b).f3420a.updateDisplayMetrics(0, new Rect(r15, r22, r5, r4).width(), new Rect(r15, r22, r5, r4).height(), f2);
                    return;
                }
                throw new IllegalArgumentException(D.C.x("top must be less than or equal to bottom, top: ", r22, ", bottom: ", r4).toString());
            }
            throw new IllegalArgumentException(D.C.x("Left must be less than or equal to right, left: ", r15, ", right: ", r5).toString());
        }
    }

    public static Activity b(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        return b(((ContextWrapper) context).getBaseContext());
    }
}
