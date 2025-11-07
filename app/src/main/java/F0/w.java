package f0;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    public static Field f3200a = null;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f3201b = false;

    static {
        new WeakHashMap();
    }

    public static void a(ViewGroup viewGroup, C0256b c0256b) {
        View.AccessibilityDelegate accessibilityDelegate;
        C0255a c0255a = null;
        if (c0256b == null) {
            if (Build.VERSION.SDK_INT >= 29) {
                accessibilityDelegate = t.a(viewGroup);
            } else {
                if (!f3201b) {
                    if (f3200a == null) {
                        try {
                            Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                            f3200a = declaredField;
                            declaredField.setAccessible(true);
                        } catch (Throwable unused) {
                            f3201b = true;
                        }
                    }
                    try {
                        Object obj = f3200a.get(viewGroup);
                        if (obj instanceof View.AccessibilityDelegate) {
                            accessibilityDelegate = (View.AccessibilityDelegate) obj;
                        }
                    } catch (Throwable unused2) {
                        f3201b = true;
                    }
                }
                accessibilityDelegate = null;
            }
            if (accessibilityDelegate instanceof C0255a) {
                c0256b = new C0256b();
            }
        }
        if (viewGroup.getImportantForAccessibility() == 0) {
            viewGroup.setImportantForAccessibility(1);
        }
        if (c0256b != null) {
            c0255a = c0256b.f3178b;
        }
        viewGroup.setAccessibilityDelegate(c0255a);
    }
}
