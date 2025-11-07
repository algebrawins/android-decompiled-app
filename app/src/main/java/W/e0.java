package w;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import z.C0953f;

/* loaded from: classes.dex */
public final class e0 extends d0 {

    /* renamed from: o */
    public final Object f5149o;

    /* renamed from: p */
    public ArrayList f5150p;

    /* renamed from: q */
    public H.d f5151q;

    /* renamed from: r */
    public final A.d f5152r;

    /* renamed from: s */
    public final A.m f5153s;

    /* renamed from: t */
    public final A.a f5154t;

    public e0(A0.Q q3, A0.Q q4, G.e eVar, G.l lVar, V0.a aVar, Handler handler) {
        super(aVar, lVar, eVar, handler);
        this.f5149o = new Object();
        this.f5152r = new A.d(q3, q4);
        this.f5153s = new A.m(q3);
        this.f5154t = new A.a(q4, 2);
    }

    public static /* synthetic */ void t(e0 e0Var) {
        e0Var.v("Session call super.close()");
        super.i();
    }

    public static /* synthetic */ E1.a u(e0 e0Var, CameraDevice cameraDevice, y.v vVar, List list) {
        return super.n(cameraDevice, vVar, list);
    }

    @Override // w.d0, w.b0
    public final void c(d0 d0Var) {
        synchronized (this.f5149o) {
            this.f5152r.a(this.f5150p);
        }
        v("onClosed()");
        super.c(d0Var);
    }

    @Override // w.d0, w.b0
    public final void e(d0 d0Var) {
        d0 d0Var2;
        d0 d0Var3;
        v("Session onConfigured()");
        V0.a aVar = this.f5135b;
        ArrayList g = aVar.g();
        ArrayList e4 = aVar.e();
        A.a aVar2 = this.f5154t;
        if (((C0953f) aVar2.f1K) != null) {
            LinkedHashSet<d0> linkedHashSet = new LinkedHashSet();
            Iterator it = g.iterator();
            while (it.hasNext() && (d0Var3 = (d0) it.next()) != d0Var) {
                linkedHashSet.add(d0Var3);
            }
            for (d0 d0Var4 : linkedHashSet) {
                d0Var4.getClass();
                d0Var4.d(d0Var4);
            }
        }
        super.e(d0Var);
        if (((C0953f) aVar2.f1K) != null) {
            LinkedHashSet<d0> linkedHashSet2 = new LinkedHashSet();
            Iterator it2 = e4.iterator();
            while (it2.hasNext() && (d0Var2 = (d0) it2.next()) != d0Var) {
                linkedHashSet2.add(d0Var2);
            }
            for (d0 d0Var5 : linkedHashSet2) {
                d0Var5.getClass();
                d0Var5.c(d0Var5);
            }
        }
    }

    @Override // w.d0
    public final void i() {
        v("Session call close()");
        A.m mVar = this.f5153s;
        synchronized (mVar.f27c) {
            try {
                if (mVar.f25a && !mVar.f26b) {
                    ((E1.a) mVar.f28d).cancel(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        H.f.d((E1.a) this.f5153s.f28d).a(new D.N(22, this), this.f5137d);
    }

    @Override // w.d0
    public final E1.a k() {
        return H.f.d((E1.a) this.f5153s.f28d);
    }

    @Override // w.d0
    public final E1.a n(CameraDevice cameraDevice, y.v vVar, List list) {
        E1.a d4;
        synchronized (this.f5149o) {
            A.m mVar = this.f5153s;
            ArrayList f2 = this.f5135b.f();
            A.k kVar = new A.k(20, this);
            mVar.getClass();
            H.d a4 = A.m.a(cameraDevice, vVar, list, f2, kVar);
            this.f5151q = a4;
            d4 = H.f.d(a4);
        }
        return d4;
    }

    @Override // w.d0
    public final int p(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        int p2;
        A.m mVar = this.f5153s;
        synchronized (mVar.f27c) {
            try {
                if (mVar.f25a) {
                    A.l lVar = new A.l(Arrays.asList((A.l) mVar.f30f, captureCallback));
                    mVar.f26b = true;
                    captureCallback = lVar;
                }
                p2 = super.p(captureRequest, captureCallback);
            } catch (Throwable th) {
                throw th;
            }
        }
        return p2;
    }

    @Override // w.d0
    public final E1.a q(ArrayList arrayList) {
        E1.a q3;
        synchronized (this.f5149o) {
            this.f5150p = arrayList;
            q3 = super.q(arrayList);
        }
        return q3;
    }

    @Override // w.d0
    public final boolean r() {
        boolean r3;
        synchronized (this.f5149o) {
            try {
                if (m()) {
                    this.f5152r.a(this.f5150p);
                } else {
                    H.d dVar = this.f5151q;
                    if (dVar != null) {
                        dVar.cancel(true);
                    }
                }
                r3 = super.r();
            } catch (Throwable th) {
                throw th;
            }
        }
        return r3;
    }

    public final void v(String str) {
        x1.X.a("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }
}
