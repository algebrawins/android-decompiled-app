package D;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.impl.C0079f;
import d2.C0240h;
import java.util.concurrent.Executor;
import v.C0479a;
import x1.AbstractC0612g0;
import x1.AbstractC0636k0;

/* loaded from: classes.dex */
public final class H extends r0 {

    /* renamed from: r  reason: collision with root package name */
    public static final F f287r = new Object();

    /* renamed from: m  reason: collision with root package name */
    public final K f288m;

    /* renamed from: n  reason: collision with root package name */
    public final Object f289n;

    /* renamed from: o  reason: collision with root package name */
    public C0240h f290o;

    /* renamed from: p  reason: collision with root package name */
    public androidx.camera.core.impl.Z f291p;

    /* renamed from: q  reason: collision with root package name */
    public l0 f292q;

    public H(androidx.camera.core.impl.F f2) {
        super(f2);
        this.f289n = new Object();
        if (((Integer) ((androidx.camera.core.impl.S) ((androidx.camera.core.impl.F) this.f447f).V()).i0(androidx.camera.core.impl.F.f2121K, 0)).intValue() == 1) {
            this.f288m = new K();
        } else {
            this.f288m = new P((Executor) C.p(f2, I.m.f782d, AbstractC0636k0.b()));
        }
        this.f288m.f310M = C();
        K k3 = this.f288m;
        androidx.camera.core.impl.F f4 = (androidx.camera.core.impl.F) this.f447f;
        Boolean bool = Boolean.FALSE;
        f4.getClass();
        k3.f311N = ((Boolean) C.p(f4, androidx.camera.core.impl.F.f2126P, bool)).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0113, code lost:
        if (r13.equals((java.lang.Boolean) D.C.p(r14, androidx.camera.core.impl.F.f2125O, null)) != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0119 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.camera.core.impl.Z B(java.lang.String r17, androidx.camera.core.impl.F r18, androidx.camera.core.impl.C0079f r19) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: D.H.B(java.lang.String, androidx.camera.core.impl.F, androidx.camera.core.impl.f):androidx.camera.core.impl.Z");
    }

    public final int C() {
        androidx.camera.core.impl.F f2 = (androidx.camera.core.impl.F) this.f447f;
        f2.getClass();
        return ((Integer) C.p(f2, androidx.camera.core.impl.F.f2124N, 1)).intValue();
    }

    @Override // D.r0
    public final androidx.camera.core.impl.k0 e(boolean z3, androidx.camera.core.impl.n0 n0Var) {
        f287r.getClass();
        androidx.camera.core.impl.F f2 = F.f286a;
        f2.getClass();
        androidx.camera.core.impl.A a4 = n0Var.a(C.d(f2), 1);
        if (z3) {
            a4 = C.J(a4, f2);
        }
        if (a4 == null) {
            return null;
        }
        return new androidx.camera.core.impl.F(androidx.camera.core.impl.S.a(((E) i(a4)).f285b));
    }

    @Override // D.r0
    public final androidx.camera.core.impl.j0 i(androidx.camera.core.impl.A a4) {
        return new E(androidx.camera.core.impl.O.c(a4), 0);
    }

    @Override // D.r0
    public final void p() {
        this.f288m.f324b0 = true;
    }

    @Override // D.r0
    public final androidx.camera.core.impl.k0 r(androidx.camera.core.impl.r rVar, androidx.camera.core.impl.j0 j0Var) {
        androidx.camera.core.impl.F f2 = (androidx.camera.core.impl.F) this.f447f;
        f2.getClass();
        Boolean bool = (Boolean) C.p(f2, androidx.camera.core.impl.F.f2125O, null);
        boolean a4 = rVar.c().a(K.g.class);
        K k3 = this.f288m;
        if (bool != null) {
            a4 = bool.booleanValue();
        }
        k3.f312O = a4;
        synchronized (this.f289n) {
        }
        return j0Var.b();
    }

    public final String toString() {
        return "ImageAnalysis:".concat(f());
    }

    @Override // D.r0
    public final C0079f u(C0479a c0479a) {
        this.f291p.a(c0479a);
        A(this.f291p.c());
        a1.i a4 = this.g.a();
        a4.f1835M = c0479a;
        return a4.h();
    }

    @Override // D.r0
    public final C0079f v(C0079f c0079f) {
        androidx.camera.core.impl.Z B3 = B(d(), (androidx.camera.core.impl.F) this.f447f, c0079f);
        this.f291p = B3;
        A(B3.c());
        return c0079f;
    }

    @Override // D.r0
    public final void w() {
        AbstractC0612g0.a();
        l0 l0Var = this.f292q;
        if (l0Var != null) {
            l0Var.a();
            this.f292q = null;
        }
        K k3 = this.f288m;
        k3.f324b0 = false;
        k3.d();
    }

    @Override // D.r0
    public final void x(Matrix matrix) {
        super.x(matrix);
        K k3 = this.f288m;
        synchronized (k3.a0) {
            k3.f318U = matrix;
            k3.f319V = new Matrix(k3.f318U);
        }
    }

    @Override // D.r0
    public final void y(Rect rect) {
        this.f449i = rect;
        K k3 = this.f288m;
        synchronized (k3.a0) {
            k3.f316S = rect;
            k3.f317T = new Rect(k3.f316S);
        }
    }
}
