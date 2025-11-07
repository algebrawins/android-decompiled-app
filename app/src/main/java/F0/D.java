package f0;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class D extends G {

    /* renamed from: c  reason: collision with root package name */
    public static Field f3153c = null;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f3154d = false;

    /* renamed from: e  reason: collision with root package name */
    public static Constructor f3155e = null;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f3156f = false;

    /* renamed from: a  reason: collision with root package name */
    public WindowInsets f3157a = e();

    /* renamed from: b  reason: collision with root package name */
    public Y.c f3158b;

    private static WindowInsets e() {
        if (!f3154d) {
            try {
                f3153c = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e4);
            }
            f3154d = true;
        }
        Field field = f3153c;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e5);
            }
        }
        if (!f3156f) {
            try {
                f3155e = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e6) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e6);
            }
            f3156f = true;
        }
        Constructor constructor = f3155e;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e7);
            }
        }
        return null;
    }

    @Override // f0.G
    public N b() {
        a();
        N a4 = N.a(this.f3157a, null);
        M m3 = a4.f3171a;
        m3.j(null);
        m3.l(this.f3158b);
        return a4;
    }

    @Override // f0.G
    public void c(Y.c cVar) {
        this.f3158b = cVar;
    }

    @Override // f0.G
    public void d(Y.c cVar) {
        WindowInsets windowInsets = this.f3157a;
        if (windowInsets != null) {
            this.f3157a = windowInsets.replaceSystemWindowInsets(cVar.f1637a, cVar.f1638b, cVar.f1639c, cVar.f1640d);
        }
    }
}
