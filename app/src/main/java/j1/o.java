package j1;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import h1.C0281a;
import k1.InterfaceC0333a;
import w.C0492a;
import w.C0501k;
import w.l0;
import w.m0;
import w.n0;
import x.C0559n;
import x1.X;

/* loaded from: classes.dex */
public final class o implements InterfaceC0333a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f3830a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3831b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f3832c;

    /* renamed from: d  reason: collision with root package name */
    public Object f3833d;

    /* renamed from: e  reason: collision with root package name */
    public Object f3834e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f3835f;

    public o(C0304c c0304c, i1.c cVar, C0302a c0302a) {
        this.f3835f = c0304c;
        this.f3833d = null;
        this.f3834e = null;
        this.f3830a = false;
        this.f3831b = cVar;
        this.f3832c = c0302a;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [a1.i, java.lang.Object, w.m0] */
    public static m0 b(C0559n c0559n) {
        Range range;
        CameraCharacteristics.Key key;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
                range = (Range) c0559n.a(key);
            } catch (AssertionError e4) {
                X.h("ZoomControl", "AssertionError, fail to get camera characteristic.", e4);
                range = null;
            }
            if (range != null) {
                return new C0492a(c0559n);
            }
        }
        ?? obj = new Object();
        obj.f1833K = null;
        obj.f1835M = null;
        obj.f1832J = c0559n;
        return obj;
    }

    @Override // k1.InterfaceC0333a
    public void a(C0281a c0281a) {
        ((C0304c) this.f3835f).f3810m.post(new H.e(this, c0281a, 16, false));
    }

    public void c(S.i iVar, I.a aVar) {
        I.a e4;
        if (!this.f3830a) {
            synchronized (((n0) this.f3833d)) {
                ((n0) this.f3833d).f();
                e4 = I.a.e((n0) this.f3833d);
            }
            d(e4);
            iVar.b(new Exception("Camera is not active."));
            return;
        }
        d(aVar);
        ((m0) this.f3835f).f(aVar.f742a, iVar);
        ((C0501k) this.f3831b).r();
    }

    public void d(I.a aVar) {
        Looper myLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        androidx.lifecycle.z zVar = (androidx.lifecycle.z) this.f3834e;
        if (myLooper == mainLooper) {
            zVar.k(aVar);
        } else {
            zVar.h(aVar);
        }
    }

    public void e(C0281a c0281a) {
        m mVar = (m) ((C0304c) this.f3835f).f3807j.get((C0302a) this.f3832c);
        if (mVar != null) {
            k1.w.b(mVar.f3827x.f3810m);
            i1.c cVar = mVar.f3816m;
            String name = cVar.getClass().getName();
            String valueOf = String.valueOf(c0281a);
            cVar.j("onSignInFailed for " + name + " with " + valueOf);
            mVar.l(c0281a, null);
        }
    }

    public o(C0501k c0501k, C0559n c0559n, G.l lVar) {
        this.f3830a = false;
        l0 l0Var = new l0(this);
        this.f3831b = c0501k;
        this.f3832c = lVar;
        m0 b3 = b(c0559n);
        this.f3835f = b3;
        n0 n0Var = new n0(b3.d(), b3.c());
        this.f3833d = n0Var;
        n0Var.f();
        this.f3834e = new androidx.lifecycle.z(I.a.e(n0Var));
        c0501k.a(l0Var);
    }
}
