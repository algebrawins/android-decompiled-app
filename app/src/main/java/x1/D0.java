package x1;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class D0 {

    /* renamed from: a  reason: collision with root package name */
    public static Method f5518a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f5519b;

    /* renamed from: c  reason: collision with root package name */
    public static Method f5520c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f5521d;

    public static int a(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Z.b.a(drawable);
        }
        if (!f5521d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", null);
                f5520c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e4) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e4);
            }
            f5521d = true;
        }
        Method method = f5520c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, null)).intValue();
            } catch (Exception e5) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e5);
                f5520c = null;
                return 0;
            }
        }
        return 0;
    }

    public static void b(Drawable drawable, int r12) {
        Z.a.g(drawable, r12);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Z.i, android.graphics.drawable.Drawable] */
    public static Drawable c(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable;
        }
        if (!(drawable instanceof Z.g)) {
            ?? drawable2 = new Drawable();
            drawable2.f1749M = drawable2.c();
            drawable2.h(drawable);
            Z.i.a();
            return drawable2;
        }
        return drawable;
    }
}
