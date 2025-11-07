package k0;

import android.widget.PopupWindow;

/* renamed from: k0.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0325l {
    public static boolean a(PopupWindow popupWindow) {
        return popupWindow.getOverlapAnchor();
    }

    public static int b(PopupWindow popupWindow) {
        return popupWindow.getWindowLayoutType();
    }

    public static void c(PopupWindow popupWindow, boolean z3) {
        popupWindow.setOverlapAnchor(z3);
    }

    public static void d(PopupWindow popupWindow, int r12) {
        popupWindow.setWindowLayoutType(r12);
    }
}
