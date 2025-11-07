package f0;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class H extends M {

    /* renamed from: f  reason: collision with root package name */
    public static boolean f3160f = false;
    public static Method g;

    /* renamed from: h  reason: collision with root package name */
    public static Class f3161h;

    /* renamed from: i  reason: collision with root package name */
    public static Field f3162i;

    /* renamed from: j  reason: collision with root package name */
    public static Field f3163j;

    /* renamed from: c  reason: collision with root package name */
    public final WindowInsets f3164c;

    /* renamed from: d  reason: collision with root package name */
    public Y.c f3165d;

    /* renamed from: e  reason: collision with root package name */
    public Y.c f3166e;

    public H(N n3, WindowInsets windowInsets) {
        super(n3);
        this.f3165d = null;
        this.f3164c = windowInsets;
    }

    private Y.c m(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!f3160f) {
                n();
            }
            Method method = g;
            if (method != null && f3161h != null && f3162i != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f3162i.get(f3163j.get(invoke));
                    if (rect == null) {
                        return null;
                    }
                    return Y.c.a(rect.left, rect.top, rect.right, rect.bottom);
                } catch (ReflectiveOperationException e4) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    @SuppressLint({"PrivateApi"})
    private static void n() {
        try {
            g = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f3161h = cls;
            f3162i = cls.getDeclaredField("mVisibleInsets");
            f3163j = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f3162i.setAccessible(true);
            f3163j.setAccessible(true);
        } catch (ReflectiveOperationException e4) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
        }
        f3160f = true;
    }

    @Override // f0.M
    public void d(View view) {
        Y.c m3 = m(view);
        if (m3 == null) {
            m3 = Y.c.f1636e;
        }
        o(m3);
    }

    @Override // f0.M
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.f3166e, ((H) obj).f3166e);
    }

    @Override // f0.M
    public final Y.c g() {
        if (this.f3165d == null) {
            WindowInsets windowInsets = this.f3164c;
            this.f3165d = Y.c.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f3165d;
    }

    @Override // f0.M
    public boolean i() {
        return this.f3164c.isRound();
    }

    public void o(Y.c cVar) {
        this.f3166e = cVar;
    }

    @Override // f0.M
    public void j(Y.c[] cVarArr) {
    }

    @Override // f0.M
    public void k(N n3) {
    }
}
