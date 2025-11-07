package p;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class w0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Method f4740a;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f4740a = declaredMethod;
            if (!declaredMethod.isAccessible()) {
                declaredMethod.setAccessible(true);
            }
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    public static boolean a(View view) {
        Field field = f0.w.f3200a;
        if (view.getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }
}
