package g0;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public abstract class e {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, g0.g] */
    public static g a(boolean z3, int r3, int r4, int r5, int r6, boolean z4, String str, String str2) {
        new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z3).setColumnIndex(r3).setRowIndex(r4).setColumnSpan(r5).setRowSpan(r6).setSelected(z4).setRowTitle(str).setColumnTitle(str2).build();
        return new Object();
    }

    public static h b(AccessibilityNodeInfo accessibilityNodeInfo, int r12, int r22) {
        AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(r12, r22);
        if (child != null) {
            return new h(child, 0);
        }
        return null;
    }

    public static String c(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
    }

    public static String d(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
    }

    public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtraRenderingInfo();
    }

    public static h f(AccessibilityNodeInfo accessibilityNodeInfo, int r22) {
        AccessibilityNodeInfo parent = accessibilityNodeInfo.getParent(r22);
        if (parent != null) {
            return new h(parent, 0);
        }
        return null;
    }

    public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z3) {
        accessibilityNodeInfo.setTextSelectable(z3);
    }

    public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        accessibilityNodeInfo.setUniqueId(str);
    }
}
