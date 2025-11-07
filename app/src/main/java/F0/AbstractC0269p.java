package f0;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: f0.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0269p {
    public static N a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        N a4 = N.a(rootWindowInsets, null);
        M m3 = a4.f3171a;
        m3.k(a4);
        m3.d(view.getRootView());
        return a4;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int r12) {
        view.setScrollIndicators(r12);
    }

    public static void d(View view, int r12, int r22) {
        view.setScrollIndicators(r12, r22);
    }
}
