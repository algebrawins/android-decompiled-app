package f0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.util.Objects;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a  reason: collision with root package name */
    public final M f3171a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            int r02 = L.f3168l;
        } else {
            int r03 = M.f3169b;
        }
    }

    public N(WindowInsets windowInsets) {
        int r02 = Build.VERSION.SDK_INT;
        if (r02 >= 30) {
            this.f3171a = new L(this, windowInsets);
        } else if (r02 >= 29) {
            this.f3171a = new K(this, windowInsets);
        } else if (r02 >= 28) {
            this.f3171a = new J(this, windowInsets);
        } else {
            this.f3171a = new I(this, windowInsets);
        }
    }

    public static N a(WindowInsets windowInsets, View view) {
        N j3;
        windowInsets.getClass();
        N n3 = new N(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = w.f3200a;
            if (Build.VERSION.SDK_INT >= 23) {
                j3 = AbstractC0269p.a(view);
            } else {
                j3 = AbstractC0268o.j(view);
            }
            M m3 = n3.f3171a;
            m3.k(j3);
            m3.d(view.getRootView());
        }
        return n3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        return Objects.equals(this.f3171a, ((N) obj).f3171a);
    }

    public final int hashCode() {
        M m3 = this.f3171a;
        if (m3 == null) {
            return 0;
        }
        return m3.hashCode();
    }

    public N() {
        this.f3171a = new M(this);
    }
}
