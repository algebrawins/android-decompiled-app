package D;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.camera.core.impl.C0076c;
import androidx.camera.core.impl.C0079f;
import androidx.camera.core.impl.InterfaceC0089q;
import androidx.camera.core.impl.InterfaceC0091t;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import v.C0479a;
import x1.AbstractC0624h4;

/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: d  reason: collision with root package name */
    public androidx.camera.core.impl.k0 f445d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f446e;

    /* renamed from: f  reason: collision with root package name */
    public androidx.camera.core.impl.k0 f447f;
    public C0079f g;

    /* renamed from: h  reason: collision with root package name */
    public androidx.camera.core.impl.k0 f448h;

    /* renamed from: i  reason: collision with root package name */
    public Rect f449i;

    /* renamed from: k  reason: collision with root package name */
    public InterfaceC0091t f451k;

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f442a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public final Object f443b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public q0 f444c = q0.INACTIVE;

    /* renamed from: j  reason: collision with root package name */
    public Matrix f450j = new Matrix();

    /* renamed from: l  reason: collision with root package name */
    public androidx.camera.core.impl.c0 f452l = androidx.camera.core.impl.c0.a();

    public r0(androidx.camera.core.impl.k0 k0Var) {
        this.f446e = k0Var;
        this.f447f = k0Var;
    }

    public final void A(androidx.camera.core.impl.c0 c0Var) {
        this.f452l = c0Var;
        for (androidx.camera.core.impl.D d4 : c0Var.b()) {
            if (d4.f2117j == null) {
                d4.f2117j = getClass();
            }
        }
    }

    public final void a(InterfaceC0091t interfaceC0091t, androidx.camera.core.impl.k0 k0Var, androidx.camera.core.impl.k0 k0Var2) {
        synchronized (this.f443b) {
            this.f451k = interfaceC0091t;
            this.f442a.add(interfaceC0091t);
        }
        this.f445d = k0Var;
        this.f448h = k0Var2;
        androidx.camera.core.impl.k0 l3 = l(interfaceC0091t.e(), this.f445d, this.f448h);
        this.f447f = l3;
        l3.x();
        p();
    }

    public final InterfaceC0091t b() {
        InterfaceC0091t interfaceC0091t;
        synchronized (this.f443b) {
            interfaceC0091t = this.f451k;
        }
        return interfaceC0091t;
    }

    public final InterfaceC0089q c() {
        synchronized (this.f443b) {
            try {
                InterfaceC0091t interfaceC0091t = this.f451k;
                if (interfaceC0091t == null) {
                    return InterfaceC0089q.f2226k;
                }
                return interfaceC0091t.i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String d() {
        InterfaceC0091t b3 = b();
        AbstractC0624h4.e(b3, "No camera attached to use case: " + this);
        return b3.e().e();
    }

    public abstract androidx.camera.core.impl.k0 e(boolean z3, androidx.camera.core.impl.n0 n0Var);

    public final String f() {
        androidx.camera.core.impl.k0 k0Var = this.f447f;
        String N3 = k0Var.N("<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(N3);
        return N3;
    }

    public int g(InterfaceC0091t interfaceC0091t, boolean z3) {
        int h3 = interfaceC0091t.e().h(((androidx.camera.core.impl.J) this.f447f).j());
        if (!interfaceC0091t.d() && z3) {
            RectF rectF = F.f.f603a;
            return (((-h3) % 360) + 360) % 360;
        }
        return h3;
    }

    public Set h() {
        return Collections.emptySet();
    }

    public abstract androidx.camera.core.impl.j0 i(androidx.camera.core.impl.A a4);

    public final boolean j(String str) {
        if (b() == null) {
            return false;
        }
        return Objects.equals(str, d());
    }

    public final boolean k(InterfaceC0091t interfaceC0091t) {
        int d4 = ((androidx.camera.core.impl.J) this.f447f).d();
        if (d4 != 0) {
            if (d4 == 1) {
                return true;
            }
            if (d4 == 2) {
                return interfaceC0091t.m();
            }
            throw new AssertionError(C.w("Unknown mirrorMode: ", d4));
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.camera.core.impl.A, java.lang.Object] */
    public final androidx.camera.core.impl.k0 l(androidx.camera.core.impl.r rVar, androidx.camera.core.impl.k0 k0Var, androidx.camera.core.impl.k0 k0Var2) {
        androidx.camera.core.impl.O b3;
        if (k0Var2 != null) {
            b3 = androidx.camera.core.impl.O.c(k0Var2);
            b3.f2153J.remove(I.l.f780b);
        } else {
            b3 = androidx.camera.core.impl.O.b();
        }
        C0076c c0076c = androidx.camera.core.impl.J.f2138n;
        ?? r12 = this.f446e;
        boolean q3 = r12.q(c0076c);
        TreeMap treeMap = b3.f2153J;
        if (q3 || r12.q(androidx.camera.core.impl.J.f2142r)) {
            C0076c c0076c2 = androidx.camera.core.impl.J.f2146v;
            if (treeMap.containsKey(c0076c2)) {
                treeMap.remove(c0076c2);
            }
        }
        C0076c c0076c3 = androidx.camera.core.impl.J.f2146v;
        if (r12.q(c0076c3)) {
            C0076c c0076c4 = androidx.camera.core.impl.J.f2144t;
            if (treeMap.containsKey(c0076c4) && ((O.b) r12.e(c0076c3)).f1011b != null) {
                treeMap.remove(c0076c4);
            }
        }
        for (C0076c c0076c5 : r12.o()) {
            C.K(b3, b3, r12, c0076c5);
        }
        if (k0Var != null) {
            for (C0076c c0076c6 : k0Var.o()) {
                if (!c0076c6.f2176a.equals(I.l.f780b.f2176a)) {
                    C.K(b3, b3, k0Var, c0076c6);
                }
            }
        }
        if (treeMap.containsKey(androidx.camera.core.impl.J.f2142r)) {
            C0076c c0076c7 = androidx.camera.core.impl.J.f2138n;
            if (treeMap.containsKey(c0076c7)) {
                treeMap.remove(c0076c7);
            }
        }
        C0076c c0076c8 = androidx.camera.core.impl.J.f2146v;
        if (treeMap.containsKey(c0076c8)) {
            ((O.b) b3.e(c0076c8)).getClass();
        }
        return r(rVar, i(b3));
    }

    public final void m() {
        this.f444c = q0.ACTIVE;
        o();
    }

    public final void n() {
        Iterator it = this.f442a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0091t) it.next()).a(this);
        }
    }

    public final void o() {
        int r02 = o0.f435a[this.f444c.ordinal()];
        HashSet hashSet = this.f442a;
        if (r02 != 1) {
            if (r02 == 2) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0091t) it.next()).l(this);
                }
                return;
            }
            return;
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            ((InterfaceC0091t) it2.next()).b(this);
        }
    }

    public abstract androidx.camera.core.impl.k0 r(androidx.camera.core.impl.r rVar, androidx.camera.core.impl.j0 j0Var);

    public abstract C0079f u(C0479a c0479a);

    public abstract C0079f v(C0079f c0079f);

    public abstract void w();

    public void x(Matrix matrix) {
        this.f450j = new Matrix(matrix);
    }

    public void y(Rect rect) {
        this.f449i = rect;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.camera.core.impl.k0, java.lang.Object] */
    public final void z(InterfaceC0091t interfaceC0091t) {
        boolean z3;
        w();
        this.f447f.x();
        synchronized (this.f443b) {
            if (interfaceC0091t == this.f451k) {
                z3 = true;
            } else {
                z3 = false;
            }
            AbstractC0624h4.b(z3);
            this.f442a.remove(this.f451k);
            this.f451k = null;
        }
        this.g = null;
        this.f449i = null;
        this.f447f = this.f446e;
        this.f445d = null;
        this.f448h = null;
    }

    public void p() {
    }

    public void q() {
    }

    public void s() {
    }

    public void t() {
    }
}
