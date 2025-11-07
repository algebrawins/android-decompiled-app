package g0;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c  reason: collision with root package name */
    public static final c f3231c;

    /* renamed from: d  reason: collision with root package name */
    public static final c f3232d;

    /* renamed from: e  reason: collision with root package name */
    public static final c f3233e;

    /* renamed from: f  reason: collision with root package name */
    public static final c f3234f;

    /* renamed from: a  reason: collision with root package name */
    public final Object f3235a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3236b;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction22;
        new c(null, 1, null);
        new c(null, 2, null);
        new c(null, 4, null);
        new c(null, 8, null);
        new c(null, 16, null);
        new c(null, 32, null);
        new c(null, 64, null);
        new c(null, RecognitionOptions.ITF, null);
        new c(null, RecognitionOptions.QR_CODE, i.class);
        new c(null, RecognitionOptions.UPC_A, i.class);
        new c(null, RecognitionOptions.UPC_E, j.class);
        new c(null, RecognitionOptions.PDF417, j.class);
        f3231c = new c(null, RecognitionOptions.AZTEC, null);
        f3232d = new c(null, 8192, null);
        new c(null, 16384, null);
        new c(null, RecognitionOptions.TEZ_CODE, null);
        new c(null, 65536, null);
        new c(null, 131072, n.class);
        new c(null, 262144, null);
        new c(null, 524288, null);
        new c(null, 1048576, null);
        new c(null, 2097152, o.class);
        int r3 = Build.VERSION.SDK_INT;
        if (r3 >= 23) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
        } else {
            accessibilityAction = null;
        }
        new c(accessibilityAction, 16908342, null);
        if (r3 >= 23) {
            accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
        } else {
            accessibilityAction2 = null;
        }
        new c(accessibilityAction2, 16908343, l.class);
        if (r3 >= 23) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
        } else {
            accessibilityAction3 = null;
        }
        f3233e = new c(accessibilityAction3, 16908344, null);
        if (r3 >= 23) {
            accessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
        } else {
            accessibilityAction4 = null;
        }
        new c(accessibilityAction4, 16908345, null);
        if (r3 >= 23) {
            accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
        } else {
            accessibilityAction5 = null;
        }
        f3234f = new c(accessibilityAction5, 16908346, null);
        if (r3 >= 23) {
            accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
        } else {
            accessibilityAction6 = null;
        }
        new c(accessibilityAction6, 16908347, null);
        if (r3 >= 29) {
            accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
        } else {
            accessibilityAction7 = null;
        }
        new c(accessibilityAction7, 16908358, null);
        if (r3 >= 29) {
            accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
        } else {
            accessibilityAction8 = null;
        }
        new c(accessibilityAction8, 16908359, null);
        if (r3 >= 29) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        } else {
            accessibilityAction9 = null;
        }
        new c(accessibilityAction9, 16908360, null);
        if (r3 >= 29) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
        } else {
            accessibilityAction10 = null;
        }
        new c(accessibilityAction10, 16908361, null);
        if (r3 >= 23) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
        } else {
            accessibilityAction11 = null;
        }
        new c(accessibilityAction11, 16908348, null);
        if (r3 >= 24) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
        } else {
            accessibilityAction12 = null;
        }
        new c(accessibilityAction12, 16908349, m.class);
        if (r3 >= 26) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        } else {
            accessibilityAction13 = null;
        }
        new c(accessibilityAction13, 16908354, k.class);
        if (r3 >= 28) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
        } else {
            accessibilityAction14 = null;
        }
        new c(accessibilityAction14, 16908356, null);
        if (r3 >= 28) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
        } else {
            accessibilityAction15 = null;
        }
        new c(accessibilityAction15, 16908357, null);
        if (r3 >= 30) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
        } else {
            accessibilityAction16 = null;
        }
        new c(accessibilityAction16, 16908362, null);
        if (r3 >= 30) {
            accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
        } else {
            accessibilityAction17 = null;
        }
        new c(accessibilityAction17, 16908372, null);
        if (r3 >= 32) {
            accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        } else {
            accessibilityAction18 = null;
        }
        new c(accessibilityAction18, 16908373, null);
        if (r3 >= 32) {
            accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
        } else {
            accessibilityAction19 = null;
        }
        new c(accessibilityAction19, 16908374, null);
        if (r3 >= 32) {
            accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
        } else {
            accessibilityAction20 = null;
        }
        new c(accessibilityAction20, 16908375, null);
        if (r3 >= 33) {
            accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
        } else {
            accessibilityAction21 = null;
        }
        new c(accessibilityAction21, 16908376, null);
        if (r3 >= 34) {
            accessibilityAction22 = f.a();
        } else {
            accessibilityAction22 = null;
        }
        new c(accessibilityAction22, 16908382, null);
    }

    public c(Object obj, int r22, Class cls) {
        this.f3236b = r22;
        if (obj == null) {
            this.f3235a = new AccessibilityNodeInfo.AccessibilityAction(r22, null);
        } else {
            this.f3235a = obj;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        Object obj2 = ((c) obj).f3235a;
        Object obj3 = this.f3235a;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        } else if (!obj3.equals(obj2)) {
            return false;
        } else {
            return true;
        }
    }

    public final int hashCode() {
        Object obj = this.f3235a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String b3 = h.b(this.f3236b);
        if (b3.equals("ACTION_UNKNOWN")) {
            Object obj = this.f3235a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                b3 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(b3);
        return sb.toString();
    }
}
