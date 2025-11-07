package k0;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import f0.C0256b;

/* renamed from: k0.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0320g extends C0256b {
    @Override // f0.C0256b
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        boolean z3;
        super.a(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        if (nestedScrollView.getScrollRange() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        accessibilityEvent.setScrollable(z3);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
    }

    @Override // f0.C0256b
    public final void b(View view, g0.h hVar) {
        int scrollRange;
        View.AccessibilityDelegate accessibilityDelegate = this.f3177a;
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.f3238a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityNodeInfo.setClassName("android.widget.ScrollView");
        if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
            accessibilityNodeInfo.setScrollable(true);
            if (nestedScrollView.getScrollY() > 0) {
                accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) g0.c.f3232d.f3235a);
                accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) g0.c.f3233e.f3235a);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) g0.c.f3231c.f3235a);
                accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) g0.c.f3234f.f3235a);
            }
        }
    }

    @Override // f0.C0256b
    public final boolean c(View view, int r6, Bundle bundle) {
        if (super.c(view, r6, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        int height = nestedScrollView.getHeight();
        Rect rect = new Rect();
        if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
            height = rect.height();
        }
        if (r6 != 4096) {
            if (r6 != 8192 && r6 != 16908344) {
                if (r6 != 16908346) {
                    return false;
                }
            } else {
                int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.t(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                return true;
            }
        }
        int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
        if (min == nestedScrollView.getScrollY()) {
            return false;
        }
        nestedScrollView.t(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
        return true;
    }
}
