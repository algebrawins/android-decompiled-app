package f0;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.example.catering_inventory.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: f0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0256b {

    /* renamed from: c  reason: collision with root package name */
    public static final View.AccessibilityDelegate f3176c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    public final View.AccessibilityDelegate f3177a = f3176c;

    /* renamed from: b  reason: collision with root package name */
    public final C0255a f3178b = new C0255a(this);

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        this.f3177a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void b(View view, g0.h hVar) {
        this.f3177a.onInitializeAccessibilityNodeInfo(view, hVar.f3238a);
    }

    public boolean c(View view, int r6, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        ClickableSpan[] clickableSpanArr;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z3 = false;
        for (int r22 = 0; r22 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((g0.c) list.get(r22)).f3235a).getId() != r6; r22++) {
        }
        boolean performAccessibilityAction = this.f3177a.performAccessibilityAction(view, r6, bundle);
        if (!performAccessibilityAction && r6 == R.id.accessibility_action_clickable_span && bundle != null) {
            int r62 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(r62)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
                CharSequence text = view.createAccessibilityNodeInfo().getText();
                if (text instanceof Spanned) {
                    clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                } else {
                    clickableSpanArr = null;
                }
                int r02 = 0;
                while (true) {
                    if (clickableSpanArr == null || r02 >= clickableSpanArr.length) {
                        break;
                    } else if (clickableSpan.equals(clickableSpanArr[r02])) {
                        clickableSpan.onClick(view);
                        z3 = true;
                        break;
                    } else {
                        r02++;
                    }
                }
            }
            return z3;
        }
        return performAccessibilityAction;
    }
}
