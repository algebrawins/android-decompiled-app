package x1;

import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import k0.AbstractC0325l;

/* loaded from: classes.dex */
public abstract class C4 {

    /* renamed from: a  reason: collision with root package name */
    public static Method f5513a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f5514b;

    /* renamed from: c  reason: collision with root package name */
    public static Field f5515c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f5516d;

    public static void a(p.r rVar, boolean z3) {
        if (Build.VERSION.SDK_INT >= 23) {
            AbstractC0325l.c(rVar, z3);
            return;
        }
        if (!f5516d) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f5515c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e4);
            }
            f5516d = true;
        }
        Field field = f5515c;
        if (field != null) {
            try {
                field.set(rVar, Boolean.valueOf(z3));
            } catch (IllegalAccessException e5) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e5);
            }
        }
    }
}
