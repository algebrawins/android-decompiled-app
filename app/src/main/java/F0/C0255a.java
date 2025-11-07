package f0;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.example.catering_inventory.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: f0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0255a extends View.AccessibilityDelegate {

    /* renamed from: a  reason: collision with root package name */
    public final C0256b f3175a;

    public C0255a(C0256b c0256b) {
        this.f3175a = c0256b;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f3175a.f3177a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        A.c cVar;
        AccessibilityNodeProvider accessibilityNodeProvider = this.f3175a.f3177a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            cVar = new A.c(23, accessibilityNodeProvider);
        } else {
            cVar = null;
        }
        if (cVar == null) {
            return null;
        }
        return (AccessibilityNodeProvider) cVar.f5K;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f3175a.a(view, accessibilityEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        boolean z3;
        Object obj;
        boolean z4;
        int r7;
        Object tag2;
        Object obj2;
        ClickableSpan[] clickableSpanArr;
        int r13;
        int r22 = 1;
        g0.h hVar = new g0.h(accessibilityNodeInfo);
        Field field = w.f3200a;
        int r4 = Build.VERSION.SDK_INT;
        if (r4 >= 28) {
            tag = Boolean.valueOf(AbstractC0271s.d(view));
        } else {
            tag = view.getTag(R.id.tag_screen_reader_focusable);
            if (!Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        Boolean bool = (Boolean) tag;
        if (bool != null && bool.booleanValue()) {
            z3 = 1;
        } else {
            z3 = 0;
        }
        if (r4 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z3);
        } else {
            Bundle extras = accessibilityNodeInfo.getExtras();
            if (extras != null) {
                extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", z3 | (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-2)));
            }
        }
        if (r4 >= 28) {
            obj = Boolean.valueOf(AbstractC0271s.c(view));
        } else {
            Object tag3 = view.getTag(R.id.tag_accessibility_heading);
            if (Boolean.class.isInstance(tag3)) {
                obj = tag3;
            } else {
                obj = null;
            }
        }
        Boolean bool2 = (Boolean) obj;
        if (bool2 != null && bool2.booleanValue()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (r4 >= 28) {
            accessibilityNodeInfo.setHeading(z4);
        } else {
            Bundle extras2 = accessibilityNodeInfo.getExtras();
            if (extras2 != null) {
                int r11 = extras2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-3);
                if (z4) {
                    r7 = 2;
                } else {
                    r7 = 0;
                }
                extras2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", r7 | r11);
            }
        }
        if (r4 >= 28) {
            tag2 = AbstractC0271s.b(view);
        } else {
            tag2 = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag2)) {
                tag2 = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag2;
        if (r4 >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
        if (r4 >= 30) {
            obj2 = u.b(view);
        } else {
            Object tag4 = view.getTag(R.id.tag_state_description);
            if (CharSequence.class.isInstance(tag4)) {
                obj2 = tag4;
            } else {
                obj2 = null;
            }
        }
        CharSequence charSequence2 = (CharSequence) obj2;
        if (r4 >= 30) {
            g0.d.c(accessibilityNodeInfo, charSequence2);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence2);
        }
        this.f3175a.b(view, hVar);
        CharSequence text = accessibilityNodeInfo.getText();
        if (r4 < 26) {
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int r15 = 0; r15 < sparseArray.size(); r15++) {
                    if (((WeakReference) sparseArray.valueAt(r15)).get() == null) {
                        arrayList.add(Integer.valueOf(r15));
                    }
                }
                for (int r6 = 0; r6 < arrayList.size(); r6++) {
                    sparseArray.remove(((Integer) arrayList.get(r6)).intValue());
                }
            }
            if (text instanceof Spanned) {
                clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
            } else {
                clickableSpanArr = null;
            }
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                }
                for (int r42 = 0; r42 < clickableSpanArr.length; r42++) {
                    ClickableSpan clickableSpan = clickableSpanArr[r42];
                    int r14 = 0;
                    while (true) {
                        if (r14 < sparseArray2.size()) {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(r14)).get())) {
                                r13 = sparseArray2.keyAt(r14);
                                break;
                            }
                            r14 += r22;
                        } else {
                            r13 = g0.h.f3237b;
                            g0.h.f3237b = r13 + 1;
                            break;
                        }
                    }
                    sparseArray2.put(r13, new WeakReference(clickableSpanArr[r42]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[r42];
                    Spanned spanned = (Spanned) text;
                    hVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    hVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    hVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    hVar.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(r13));
                    r22 = 1;
                }
            }
        }
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        for (int r9 = 0; r9 < list.size(); r9++) {
            hVar.f3238a.addAction((AccessibilityNodeInfo.AccessibilityAction) ((g0.c) list.get(r9)).f3235a);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f3175a.f3177a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f3175a.f3177a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int r3, Bundle bundle) {
        return this.f3175a.c(view, r3, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int r3) {
        this.f3175a.f3177a.sendAccessibilityEvent(view, r3);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f3175a.f3177a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
