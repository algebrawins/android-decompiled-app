package p;

import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import d2.C0235c;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class N extends K implements L {
    public static final Method j0;

    /* renamed from: i0  reason: collision with root package name */
    public C0235c f4560i0;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                j0 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // p.L
    public final void a(o.j jVar, o.k kVar) {
        C0235c c0235c = this.f4560i0;
        if (c0235c != null) {
            c0235c.a(jVar, kVar);
        }
    }

    @Override // p.L
    public final void c(o.j jVar, o.k kVar) {
        C0235c c0235c = this.f4560i0;
        if (c0235c != null) {
            c0235c.c(jVar, kVar);
        }
    }
}
