package f0;

import android.view.View;
import com.example.catering_inventory.R;
import h0.AbstractC0280a;
import java.util.Objects;

/* renamed from: f0.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0271s {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View$OnUnhandledKeyEventListener, java.lang.Object] */
    public static void a(View view, v vVar) {
        R.k kVar = (R.k) view.getTag(R.id.tag_unhandled_key_listeners);
        R.k kVar2 = kVar;
        if (kVar == null) {
            R.k kVar3 = new R.k();
            view.setTag(R.id.tag_unhandled_key_listeners, kVar3);
            kVar2 = kVar3;
        }
        Objects.requireNonNull(vVar);
        ?? obj = new Object();
        kVar2.put(vVar, obj);
        view.addOnUnhandledKeyEventListener(obj);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, v vVar) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        R.k kVar = (R.k) view.getTag(R.id.tag_unhandled_key_listeners);
        if (kVar != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) kVar.getOrDefault(vVar, null)) != null) {
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }
    }

    public static <T> T f(View view, int r12) {
        return (T) view.requireViewById(r12);
    }

    public static void g(View view, boolean z3) {
        view.setAccessibilityHeading(z3);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, AbstractC0280a abstractC0280a) {
        view.setAutofillId(null);
    }

    public static void j(View view, boolean z3) {
        view.setScreenReaderFocusable(z3);
    }
}
