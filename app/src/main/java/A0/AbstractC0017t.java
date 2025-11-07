package A0;

import android.graphics.Rect;
import android.view.View;
import androidx.camera.core.impl.InterfaceC0089q;
import androidx.camera.core.impl.Z;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* renamed from: A0.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0017t implements InterfaceC0089q {

    /* renamed from: J  reason: collision with root package name */
    public final Object f157J;

    public AbstractC0017t(int r12) {
        switch (r12) {
            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                this.f157J = new LinkedHashMap();
                return;
            default:
                this.f157J = new HashMap();
                return;
        }
    }

    public static AbstractC0017t e(z zVar, int r22) {
        if (r22 != 0) {
            if (r22 == 1) {
                return new C0016s(zVar, 1);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return new C0016s(zVar, 0);
    }

    public abstract Object a(Object obj);

    @Override // androidx.camera.core.impl.InterfaceC0089q
    public void b(Z z3) {
        ((InterfaceC0089q) this.f157J).b(z3);
    }

    @Override // androidx.camera.core.impl.InterfaceC0089q
    public void c(androidx.camera.core.impl.A a4) {
        ((InterfaceC0089q) this.f157J).c(a4);
    }

    @Override // androidx.camera.core.impl.InterfaceC0089q
    public androidx.camera.core.impl.A d() {
        return ((InterfaceC0089q) this.f157J).d();
    }

    @Override // androidx.camera.core.impl.InterfaceC0089q
    public Rect f() {
        return ((InterfaceC0089q) this.f157J).f();
    }

    public Object g(Object obj) {
        synchronized (((HashMap) this.f157J)) {
            try {
                if (((HashMap) this.f157J).containsKey(obj)) {
                    return ((HashMap) this.f157J).get(obj);
                }
                Object a4 = a(obj);
                ((HashMap) this.f157J).put(obj, a4);
                return a4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0089q
    public void h(int r22) {
        ((InterfaceC0089q) this.f157J).h(r22);
    }

    public abstract int i(View view);

    @Override // androidx.camera.core.impl.InterfaceC0089q
    public E1.a j(float f2) {
        return ((InterfaceC0089q) this.f157J).j(f2);
    }

    @Override // androidx.camera.core.impl.InterfaceC0089q
    public E1.a k() {
        return ((InterfaceC0089q) this.f157J).k();
    }

    @Override // androidx.camera.core.impl.InterfaceC0089q
    public E1.a l(boolean z3) {
        return ((InterfaceC0089q) this.f157J).l(z3);
    }

    @Override // androidx.camera.core.impl.InterfaceC0089q
    public void m() {
        ((InterfaceC0089q) this.f157J).m();
    }

    public abstract int n(View view);

    public abstract int o();

    public abstract int p();

    public abstract int q();

    public AbstractC0017t(InterfaceC0089q interfaceC0089q) {
        this.f157J = interfaceC0089q;
    }

    public AbstractC0017t(z zVar) {
        new Rect();
        this.f157J = zVar;
    }
}
