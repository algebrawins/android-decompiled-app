package j;

import X.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
import p.Q;
import x1.AbstractC0723v0;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f3783a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap f3784b = new WeakHashMap(0);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f3785c = new Object();

    public static void a(Context context, int r4, ColorStateList colorStateList) {
        synchronized (f3785c) {
            try {
                WeakHashMap weakHashMap = f3784b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(context);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(context, sparseArray);
                }
                sparseArray.append(r4, new C0301a(colorStateList, context.getResources().getConfiguration()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ColorStateList b(Context context, int r7) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0301a c0301a;
        ColorStateList colorStateList3;
        if (Build.VERSION.SDK_INT >= 23) {
            colorStateList3 = context.getColorStateList(r7);
            return colorStateList3;
        }
        synchronized (f3785c) {
            try {
                SparseArray sparseArray = (SparseArray) f3784b.get(context);
                colorStateList = null;
                if (sparseArray != null && sparseArray.size() > 0 && (c0301a = (C0301a) sparseArray.get(r7)) != null) {
                    if (c0301a.f3782b.equals(context.getResources().getConfiguration())) {
                        colorStateList2 = c0301a.f3781a;
                    } else {
                        sparseArray.remove(r7);
                    }
                }
                colorStateList2 = null;
            } finally {
            }
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        Resources resources = context.getResources();
        ThreadLocal threadLocal = f3783a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(r7, typedValue, true);
        int r02 = typedValue.type;
        if (r02 < 28 || r02 > 31) {
            Resources resources2 = context.getResources();
            try {
                colorStateList = c.a(resources2, resources2.getXml(r7), context.getTheme());
            } catch (Exception e4) {
                Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e4);
            }
        }
        if (colorStateList != null) {
            a(context, r7, colorStateList);
            return colorStateList;
        }
        return AbstractC0723v0.b(context, r7);
    }

    public static Drawable c(Context context, int r22) {
        return Q.d().f(context, r22);
    }
}
