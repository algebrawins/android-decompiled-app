package f0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.example.catering_inventory.R;

/* renamed from: f0.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0268o {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static N b(View view, N n3, Rect rect) {
        WindowInsets windowInsets;
        M m3 = n3.f3171a;
        if (m3 instanceof H) {
            windowInsets = ((H) m3).f3164c;
        } else {
            windowInsets = null;
        }
        if (windowInsets != null) {
            return N.a(view.computeSystemWindowInsets(windowInsets, rect), view);
        }
        rect.setEmpty();
        return n3;
    }

    public static boolean c(View view, float f2, float f4, boolean z3) {
        return view.dispatchNestedFling(f2, f4, z3);
    }

    public static boolean d(View view, float f2, float f4) {
        return view.dispatchNestedPreFling(f2, f4);
    }

    public static boolean e(View view, int r12, int r22, int[] r3, int[] r4) {
        return view.dispatchNestedPreScroll(r12, r22, r3, r4);
    }

    public static boolean f(View view, int r12, int r22, int r3, int r4, int[] r5) {
        return view.dispatchNestedScroll(r12, r22, r3, r4, r5);
    }

    public static ColorStateList g(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode h(View view) {
        return view.getBackgroundTintMode();
    }

    public static float i(View view) {
        return view.getElevation();
    }

    public static N j(View view) {
        G d4;
        if (!AbstractC0254C.f3152d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = AbstractC0254C.f3149a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) AbstractC0254C.f3150b.get(obj);
            Rect rect2 = (Rect) AbstractC0254C.f3151c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            int r3 = Build.VERSION.SDK_INT;
            if (r3 >= 30) {
                d4 = new F();
            } else if (r3 >= 29) {
                d4 = new E();
            } else {
                d4 = new D();
            }
            d4.c(Y.c.a(rect.left, rect.top, rect.right, rect.bottom));
            d4.d(Y.c.a(rect2.left, rect2.top, rect2.right, rect2.bottom));
            N b3 = d4.b();
            b3.f3171a.k(b3);
            b3.f3171a.d(view.getRootView());
            return b3;
        } catch (IllegalAccessException e4) {
            Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e4.getMessage(), e4);
            return null;
        }
    }

    public static String k(View view) {
        return view.getTransitionName();
    }

    public static float l(View view) {
        return view.getTranslationZ();
    }

    public static float m(View view) {
        return view.getZ();
    }

    public static boolean n(View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean o(View view) {
        return view.isImportantForAccessibility();
    }

    public static boolean p(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void s(View view, float f2) {
        view.setElevation(f2);
    }

    public static void t(View view, boolean z3) {
        view.setNestedScrollingEnabled(z3);
    }

    public static void u(View view, i iVar) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, iVar);
        }
        if (iVar == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerC0267n(view, iVar));
        }
    }

    public static void v(View view, String str) {
        view.setTransitionName(str);
    }

    public static void w(View view, float f2) {
        view.setTranslationZ(f2);
    }

    public static void x(View view, float f2) {
        view.setZ(f2);
    }

    public static boolean y(View view, int r12) {
        return view.startNestedScroll(r12);
    }

    public static void z(View view) {
        view.stopNestedScroll();
    }
}
