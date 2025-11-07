package D;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.C0079f;
import androidx.camera.core.impl.C0095x;
import androidx.camera.core.impl.InterfaceC0091t;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import v.C0479a;
import x1.AbstractC0612g0;
import x1.AbstractC0624h4;
import x1.AbstractC0636k0;

/* loaded from: classes.dex */
public final class e0 extends r0 {

    /* renamed from: s  reason: collision with root package name */
    public static final c0 f373s = new Object();

    /* renamed from: t  reason: collision with root package name */
    public static final G.e f374t = AbstractC0636k0.d();

    /* renamed from: m  reason: collision with root package name */
    public d0 f375m;

    /* renamed from: n  reason: collision with root package name */
    public G.e f376n;

    /* renamed from: o  reason: collision with root package name */
    public androidx.camera.core.impl.Z f377o;

    /* renamed from: p  reason: collision with root package name */
    public l0 f378p;

    /* renamed from: q  reason: collision with root package name */
    public N.m f379q;

    /* renamed from: r  reason: collision with root package name */
    public n0 f380r;

    public final void B() {
        l0 l0Var = this.f378p;
        if (l0Var != null) {
            l0Var.a();
            this.f378p = null;
        }
        N.m mVar = this.f379q;
        if (mVar != null) {
            AbstractC0612g0.a();
            mVar.c();
            mVar.f947n = true;
            this.f379q = null;
        }
        this.f380r = null;
    }

    public final androidx.camera.core.impl.Z C(String str, androidx.camera.core.impl.T t3, C0079f c0079f) {
        boolean z3;
        Rect rect;
        boolean z4;
        AbstractC0612g0.a();
        InterfaceC0091t b3 = b();
        Objects.requireNonNull(b3);
        B();
        if (this.f379q == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        Rect rect2 = null;
        AbstractC0624h4.f(null, z3);
        Matrix matrix = this.f450j;
        boolean d4 = b3.d();
        Size size = c0079f.f2192a;
        Rect rect3 = this.f449i;
        if (rect3 != null) {
            rect = rect3;
        } else {
            if (size != null) {
                rect2 = new Rect(0, 0, size.getWidth(), size.getHeight());
            }
            rect = rect2;
        }
        Objects.requireNonNull(rect);
        int g = g(b3, k(b3));
        int f02 = ((androidx.camera.core.impl.J) this.f447f).f0();
        if (b3.d() && k(b3)) {
            z4 = true;
        } else {
            z4 = false;
        }
        N.m mVar = new N.m(1, 34, c0079f, matrix, d4, rect, g, f02, z4);
        this.f379q = mVar;
        N n3 = new N(1, this);
        AbstractC0612g0.a();
        mVar.a();
        mVar.f946m.add(n3);
        n0 b4 = this.f379q.b();
        this.f380r = b4;
        this.f378p = b4.f429h;
        if (this.f375m != null) {
            InterfaceC0091t b5 = b();
            N.m mVar2 = this.f379q;
            if (b5 != null && mVar2 != null) {
                mVar2.f(g(b5, k(b5)), ((androidx.camera.core.impl.J) this.f447f).f0());
            }
            d0 d0Var = this.f375m;
            d0Var.getClass();
            n0 n0Var = this.f380r;
            n0Var.getClass();
            this.f376n.execute(new RunnableC0023c(3, d0Var, n0Var));
        }
        androidx.camera.core.impl.Z d5 = androidx.camera.core.impl.Z.d(t3, c0079f.f2192a);
        Range range = c0079f.f2194c;
        C0095x c0095x = d5.f2159b;
        c0095x.f2240d = range;
        C0479a c0479a = c0079f.f2195d;
        if (c0479a != null) {
            c0095x.c(c0479a);
        }
        if (this.f375m != null) {
            d5.b(this.f378p, c0079f.f2193b);
        }
        d5.f2162e.add(new B(this, str, t3, c0079f, 2));
        return d5;
    }

    public final void D(d0 d0Var) {
        Size size;
        AbstractC0612g0.a();
        this.f375m = d0Var;
        this.f376n = f374t;
        C0079f c0079f = this.g;
        if (c0079f != null) {
            size = c0079f.f2192a;
        } else {
            size = null;
        }
        if (size != null) {
            androidx.camera.core.impl.Z C3 = C(d(), (androidx.camera.core.impl.T) this.f447f, this.g);
            this.f377o = C3;
            A(C3.c());
            n();
        }
        m();
    }

    @Override // D.r0
    public final androidx.camera.core.impl.k0 e(boolean z3, androidx.camera.core.impl.n0 n0Var) {
        f373s.getClass();
        androidx.camera.core.impl.T t3 = c0.f370a;
        t3.getClass();
        androidx.camera.core.impl.A a4 = n0Var.a(C.d(t3), 1);
        if (z3) {
            a4 = C.J(a4, t3);
        }
        if (a4 == null) {
            return null;
        }
        return new androidx.camera.core.impl.T(androidx.camera.core.impl.S.a(((E) i(a4)).f285b));
    }

    @Override // D.r0
    public final int g(InterfaceC0091t interfaceC0091t, boolean z3) {
        if (interfaceC0091t.d()) {
            return super.g(interfaceC0091t, z3);
        }
        return 0;
    }

    @Override // D.r0
    public final Set h() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // D.r0
    public final androidx.camera.core.impl.j0 i(androidx.camera.core.impl.A a4) {
        return new E(androidx.camera.core.impl.O.c(a4), 1);
    }

    @Override // D.r0
    public final androidx.camera.core.impl.k0 r(androidx.camera.core.impl.r rVar, androidx.camera.core.impl.j0 j0Var) {
        ((androidx.camera.core.impl.O) j0Var.a()).g(androidx.camera.core.impl.H.f2135l, 34);
        return j0Var.b();
    }

    public final String toString() {
        return "Preview:".concat(f());
    }

    @Override // D.r0
    public final C0079f u(C0479a c0479a) {
        this.f377o.a(c0479a);
        A(this.f377o.c());
        a1.i a4 = this.g.a();
        a4.f1835M = c0479a;
        return a4.h();
    }

    @Override // D.r0
    public final C0079f v(C0079f c0079f) {
        androidx.camera.core.impl.Z C3 = C(d(), (androidx.camera.core.impl.T) this.f447f, c0079f);
        this.f377o = C3;
        A(C3.c());
        return c0079f;
    }

    @Override // D.r0
    public final void w() {
        B();
    }

    @Override // D.r0
    public final void y(Rect rect) {
        this.f449i = rect;
        InterfaceC0091t b3 = b();
        N.m mVar = this.f379q;
        if (b3 != null && mVar != null) {
            mVar.f(g(b3, k(b3)), ((androidx.camera.core.impl.J) this.f447f).f0());
        }
    }
}
