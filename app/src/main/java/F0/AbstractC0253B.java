package f0;

import android.view.View;
import android.view.ViewParent;

/* renamed from: f0.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0253B {
    public static boolean a(ViewParent viewParent, View view, float f2, float f4, boolean z3) {
        return viewParent.onNestedFling(view, f2, f4, z3);
    }

    public static boolean b(ViewParent viewParent, View view, float f2, float f4) {
        return viewParent.onNestedPreFling(view, f2, f4);
    }

    public static void c(ViewParent viewParent, View view, int r22, int r3, int[] r4) {
        viewParent.onNestedPreScroll(view, r22, r3, r4);
    }

    public static void d(ViewParent viewParent, View view, int r22, int r3, int r4, int r5) {
        viewParent.onNestedScroll(view, r22, r3, r4, r5);
    }

    public static void e(ViewParent viewParent, View view, View view2, int r3) {
        viewParent.onNestedScrollAccepted(view, view2, r3);
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int r3) {
        return viewParent.onStartNestedScroll(view, view2, r3);
    }

    public static void g(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }
}
