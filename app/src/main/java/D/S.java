package D;

import android.os.Build;
import android.util.Log;
import android.util.Pair;
import android.util.Size;
import androidx.camera.core.impl.C0076c;
import androidx.camera.core.impl.C0078e;
import androidx.camera.core.impl.C0079f;
import androidx.camera.core.impl.InterfaceC0087o;
import androidx.camera.core.impl.InterfaceC0091t;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import v.C0479a;
import x1.AbstractC0612g0;
import x1.AbstractC0624h4;

/* loaded from: classes.dex */
public final class S extends r0 {

    /* renamed from: t  reason: collision with root package name */
    public static final Q f336t = new Object();

    /* renamed from: m  reason: collision with root package name */
    public final int f337m;

    /* renamed from: n  reason: collision with root package name */
    public final AtomicReference f338n;

    /* renamed from: o  reason: collision with root package name */
    public final int f339o;

    /* renamed from: p  reason: collision with root package name */
    public androidx.camera.core.impl.Z f340p;

    /* renamed from: q  reason: collision with root package name */
    public E.c f341q;

    /* renamed from: r  reason: collision with root package name */
    public E.e f342r;

    /* renamed from: s  reason: collision with root package name */
    public final R1.a f343s;

    public S(androidx.camera.core.impl.G g) {
        super(g);
        this.f338n = new AtomicReference(null);
        this.f339o = -1;
        this.f343s = new R1.a(this);
        androidx.camera.core.impl.G g3 = (androidx.camera.core.impl.G) this.f447f;
        C0076c c0076c = androidx.camera.core.impl.G.f2128K;
        if (g3.q(c0076c)) {
            this.f337m = ((Integer) C.o(g3, c0076c)).intValue();
        } else {
            this.f337m = 1;
        }
        ((Integer) ((androidx.camera.core.impl.S) g3.V()).i0(androidx.camera.core.impl.G.f2133P, 0)).getClass();
    }

    public static boolean E(int r22, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(r22))) {
                return true;
            }
        }
        return false;
    }

    public final void B(boolean z3) {
        E.e eVar;
        Log.d("ImageCapture", "clearPipeline");
        AbstractC0612g0.a();
        E.c cVar = this.f341q;
        if (cVar != null) {
            cVar.b();
            this.f341q = null;
        }
        if (!z3 && (eVar = this.f342r) != null) {
            eVar.b();
            this.f342r = null;
        }
    }

    public final androidx.camera.core.impl.Z C(String str, androidx.camera.core.impl.G g, C0079f c0079f) {
        boolean z3;
        AbstractC0612g0.a();
        Log.d("ImageCapture", "createPipeline(cameraId: " + str + ", streamSpec: " + c0079f + ")");
        Size size = c0079f.f2192a;
        InterfaceC0091t b3 = b();
        Objects.requireNonNull(b3);
        boolean z4 = true;
        if (b3.d()) {
            F();
            z3 = false;
        } else {
            z3 = true;
        }
        if (this.f341q != null) {
            AbstractC0624h4.f(null, z3);
            this.f341q.b();
        }
        this.f341q = new E.c(g, size, z3);
        if (this.f342r == null) {
            this.f342r = new E.e(this.f343s);
        }
        E.e eVar = this.f342r;
        E.c cVar = this.f341q;
        eVar.getClass();
        AbstractC0612g0.a();
        eVar.f510K = cVar;
        cVar.getClass();
        AbstractC0612g0.a();
        A.f fVar = (A.f) cVar.f503L;
        fVar.getClass();
        AbstractC0612g0.a();
        if (((f0) fVar.f10K) == null) {
            z4 = false;
        }
        AbstractC0624h4.f("The ImageReader is not initialized.", z4);
        f0 f0Var = (f0) fVar.f10K;
        synchronized (f0Var.f383J) {
            f0Var.f388O = eVar;
        }
        E.c cVar2 = this.f341q;
        androidx.camera.core.impl.Z d4 = androidx.camera.core.impl.Z.d((androidx.camera.core.impl.G) cVar2.f502K, c0079f.f2192a);
        l0 l0Var = ((E.a) cVar2.f506O).f493a;
        Objects.requireNonNull(l0Var);
        C0042x c0042x = C0042x.f480d;
        a1.i a4 = C0078e.a(l0Var);
        a4.f1835M = c0042x;
        d4.f2158a.add(a4.g());
        if (Build.VERSION.SDK_INT >= 23 && this.f337m == 2) {
            c().b(d4);
        }
        C0479a c0479a = c0079f.f2195d;
        if (c0479a != null) {
            d4.f2159b.c(c0479a);
        }
        d4.f2162e.add(new B(this, str, g, c0079f, 1));
        return d4;
    }

    public final int D() {
        int r12;
        synchronized (this.f338n) {
            r12 = this.f339o;
            if (r12 == -1) {
                androidx.camera.core.impl.G g = (androidx.camera.core.impl.G) this.f447f;
                g.getClass();
                r12 = ((Integer) C.p(g, androidx.camera.core.impl.G.f2129L, 2)).intValue();
            }
        }
        return r12;
    }

    public final void F() {
        if (b() == null || ((androidx.camera.core.impl.S) ((A.a) b().j()).V()).i0(InterfaceC0087o.f2224j, null) == null) {
            return;
        }
        throw new ClassCastException();
    }

    @Override // D.r0
    public final androidx.camera.core.impl.k0 e(boolean z3, androidx.camera.core.impl.n0 n0Var) {
        f336t.getClass();
        androidx.camera.core.impl.G g = Q.f335a;
        g.getClass();
        androidx.camera.core.impl.A a4 = n0Var.a(C.d(g), this.f337m);
        if (z3) {
            a4 = C.J(a4, g);
        }
        if (a4 == null) {
            return null;
        }
        return new androidx.camera.core.impl.G(androidx.camera.core.impl.S.a(((C.g) i(a4)).f232b));
    }

    @Override // D.r0
    public final Set h() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    @Override // D.r0
    public final androidx.camera.core.impl.j0 i(androidx.camera.core.impl.A a4) {
        return new C.g(androidx.camera.core.impl.O.c(a4), 2);
    }

    @Override // D.r0
    public final void p() {
        AbstractC0624h4.e(b(), "Attached camera cannot be null");
    }

    @Override // D.r0
    public final void q() {
        synchronized (this.f338n) {
            try {
                if (this.f338n.get() == null) {
                    c().h(D());
                }
            } finally {
            }
        }
    }

    @Override // D.r0
    public final androidx.camera.core.impl.k0 r(androidx.camera.core.impl.r rVar, androidx.camera.core.impl.j0 j0Var) {
        Object obj;
        Object obj2;
        if (rVar.c().a(K.h.class)) {
            Boolean bool = Boolean.FALSE;
            androidx.camera.core.impl.N a4 = j0Var.a();
            C0076c c0076c = androidx.camera.core.impl.G.f2132O;
            Object obj3 = Boolean.TRUE;
            androidx.camera.core.impl.S s3 = (androidx.camera.core.impl.S) a4;
            s3.getClass();
            try {
                obj3 = s3.e(c0076c);
            } catch (IllegalArgumentException unused) {
            }
            if (bool.equals(obj3)) {
                x1.X.g("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                String f2 = x1.X.f("ImageCapture");
                if (x1.X.e(f2, 4)) {
                    Log.i(f2, "Requesting software JPEG due to device quirk.");
                }
                ((androidx.camera.core.impl.O) j0Var.a()).g(androidx.camera.core.impl.G.f2132O, Boolean.TRUE);
            }
        }
        androidx.camera.core.impl.N a5 = j0Var.a();
        Boolean bool2 = Boolean.TRUE;
        C0076c c0076c2 = androidx.camera.core.impl.G.f2132O;
        Object obj4 = Boolean.FALSE;
        androidx.camera.core.impl.S s4 = (androidx.camera.core.impl.S) a5;
        s4.getClass();
        try {
            obj4 = s4.e(c0076c2);
        } catch (IllegalArgumentException unused2) {
        }
        Object obj5 = null;
        boolean z3 = false;
        if (bool2.equals(obj4)) {
            F();
            try {
                obj2 = s4.e(androidx.camera.core.impl.G.f2130M);
            } catch (IllegalArgumentException unused3) {
                obj2 = null;
            }
            Integer num = (Integer) obj2;
            if (num != null && num.intValue() != 256) {
                x1.X.g("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            } else {
                z3 = true;
            }
            if (!z3) {
                x1.X.g("ImageCapture", "Unable to support software JPEG. Disabling.");
                ((androidx.camera.core.impl.O) a5).g(androidx.camera.core.impl.G.f2132O, Boolean.FALSE);
            }
        }
        androidx.camera.core.impl.N a6 = j0Var.a();
        C0076c c0076c3 = androidx.camera.core.impl.G.f2130M;
        androidx.camera.core.impl.S s5 = (androidx.camera.core.impl.S) a6;
        s5.getClass();
        try {
            obj = s5.e(c0076c3);
        } catch (IllegalArgumentException unused4) {
            obj = null;
        }
        Integer num2 = (Integer) obj;
        int r02 = 35;
        if (num2 != null) {
            F();
            androidx.camera.core.impl.N a7 = j0Var.a();
            C0076c c0076c4 = androidx.camera.core.impl.H.f2135l;
            if (!z3) {
                r02 = num2.intValue();
            }
            ((androidx.camera.core.impl.O) a7).g(c0076c4, Integer.valueOf(r02));
        } else if (z3) {
            ((androidx.camera.core.impl.O) j0Var.a()).g(androidx.camera.core.impl.H.f2135l, 35);
        } else {
            androidx.camera.core.impl.N a8 = j0Var.a();
            C0076c c0076c5 = androidx.camera.core.impl.J.f2145u;
            androidx.camera.core.impl.S s6 = (androidx.camera.core.impl.S) a8;
            s6.getClass();
            try {
                obj5 = s6.e(c0076c5);
            } catch (IllegalArgumentException unused5) {
            }
            List list = (List) obj5;
            if (list == null) {
                ((androidx.camera.core.impl.O) j0Var.a()).g(androidx.camera.core.impl.H.f2135l, Integer.valueOf((int) RecognitionOptions.QR_CODE));
            } else if (E(RecognitionOptions.QR_CODE, list)) {
                ((androidx.camera.core.impl.O) j0Var.a()).g(androidx.camera.core.impl.H.f2135l, Integer.valueOf((int) RecognitionOptions.QR_CODE));
            } else if (E(35, list)) {
                ((androidx.camera.core.impl.O) j0Var.a()).g(androidx.camera.core.impl.H.f2135l, 35);
            }
        }
        return j0Var.b();
    }

    @Override // D.r0
    public final void t() {
        E.e eVar = this.f342r;
        if (eVar != null) {
            eVar.b();
        }
    }

    public final String toString() {
        return "ImageCapture:".concat(f());
    }

    @Override // D.r0
    public final C0079f u(C0479a c0479a) {
        this.f340p.a(c0479a);
        A(this.f340p.c());
        a1.i a4 = this.g.a();
        a4.f1835M = c0479a;
        return a4.h();
    }

    @Override // D.r0
    public final C0079f v(C0079f c0079f) {
        androidx.camera.core.impl.Z C3 = C(d(), (androidx.camera.core.impl.G) this.f447f, c0079f);
        this.f340p = C3;
        A(C3.c());
        m();
        return c0079f;
    }

    @Override // D.r0
    public final void w() {
        E.e eVar = this.f342r;
        if (eVar != null) {
            eVar.b();
        }
        B(false);
    }
}
