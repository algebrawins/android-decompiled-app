package w;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import d2.C0235c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import k0.C0322i;
import x1.AbstractC0624h4;
import x1.AbstractC0636k0;
import x1.AbstractC0699s0;

/* loaded from: classes.dex */
public class d0 extends b0 {

    /* renamed from: b  reason: collision with root package name */
    public final V0.a f5135b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f5136c;

    /* renamed from: d  reason: collision with root package name */
    public final G.l f5137d;

    /* renamed from: e  reason: collision with root package name */
    public final G.e f5138e;

    /* renamed from: f  reason: collision with root package name */
    public P f5139f;
    public C0235c g;

    /* renamed from: h  reason: collision with root package name */
    public S.l f5140h;

    /* renamed from: i  reason: collision with root package name */
    public S.i f5141i;

    /* renamed from: j  reason: collision with root package name */
    public H.d f5142j;

    /* renamed from: a  reason: collision with root package name */
    public final Object f5134a = new Object();

    /* renamed from: k  reason: collision with root package name */
    public List f5143k = null;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5144l = false;

    /* renamed from: m  reason: collision with root package name */
    public boolean f5145m = false;

    /* renamed from: n  reason: collision with root package name */
    public boolean f5146n = false;

    public d0(V0.a aVar, G.l lVar, G.e eVar, Handler handler) {
        this.f5135b = aVar;
        this.f5136c = handler;
        this.f5137d = lVar;
        this.f5138e = eVar;
    }

    @Override // w.b0
    public final void a(d0 d0Var) {
        Objects.requireNonNull(this.f5139f);
        this.f5139f.a(d0Var);
    }

    @Override // w.b0
    public final void b(d0 d0Var) {
        Objects.requireNonNull(this.f5139f);
        this.f5139f.b(d0Var);
    }

    @Override // w.b0
    public void c(d0 d0Var) {
        S.l lVar;
        synchronized (this.f5134a) {
            try {
                if (!this.f5144l) {
                    this.f5144l = true;
                    AbstractC0624h4.e(this.f5140h, "Need to call openCaptureSession before using this API.");
                    lVar = this.f5140h;
                } else {
                    lVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        o();
        if (lVar != null) {
            lVar.f1193K.a(new c0(this, d0Var, 0), AbstractC0636k0.a());
        }
    }

    @Override // w.b0
    public final void d(d0 d0Var) {
        d0 d0Var2;
        Objects.requireNonNull(this.f5139f);
        o();
        V0.a aVar = this.f5135b;
        Iterator it = aVar.h().iterator();
        while (it.hasNext() && (d0Var2 = (d0) it.next()) != this) {
            d0Var2.o();
        }
        synchronized (aVar.f1357K) {
            ((LinkedHashSet) aVar.f1360N).remove(this);
        }
        this.f5139f.d(d0Var);
    }

    @Override // w.b0
    public void e(d0 d0Var) {
        d0 d0Var2;
        Objects.requireNonNull(this.f5139f);
        V0.a aVar = this.f5135b;
        synchronized (aVar.f1357K) {
            ((LinkedHashSet) aVar.f1358L).add(this);
            ((LinkedHashSet) aVar.f1360N).remove(this);
        }
        Iterator it = aVar.h().iterator();
        while (it.hasNext() && (d0Var2 = (d0) it.next()) != this) {
            d0Var2.o();
        }
        this.f5139f.e(d0Var);
    }

    @Override // w.b0
    public final void f(d0 d0Var) {
        Objects.requireNonNull(this.f5139f);
        this.f5139f.f(d0Var);
    }

    @Override // w.b0
    public final void g(d0 d0Var) {
        S.l lVar;
        synchronized (this.f5134a) {
            try {
                if (!this.f5146n) {
                    this.f5146n = true;
                    AbstractC0624h4.e(this.f5140h, "Need to call openCaptureSession before using this API.");
                    lVar = this.f5140h;
                } else {
                    lVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (lVar != null) {
            lVar.f1193K.a(new c0(this, d0Var, 1), AbstractC0636k0.a());
        }
    }

    @Override // w.b0
    public final void h(d0 d0Var, Surface surface) {
        Objects.requireNonNull(this.f5139f);
        this.f5139f.h(d0Var, surface);
    }

    public void i() {
        AbstractC0624h4.e(this.g, "Need to call openCaptureSession before using this API.");
        V0.a aVar = this.f5135b;
        synchronized (aVar.f1357K) {
            ((LinkedHashSet) aVar.f1359M).add(this);
        }
        ((CameraCaptureSession) ((h2.J) this.g.f3003K).f3303K).close();
        this.f5137d.execute(new D.N(21, this));
    }

    public final void j(CameraCaptureSession cameraCaptureSession) {
        if (this.g == null) {
            this.g = new C0235c(cameraCaptureSession, this.f5136c);
        }
    }

    public E1.a k() {
        return H.h.f701L;
    }

    public final void l(List list) {
        synchronized (this.f5134a) {
            o();
            if (!list.isEmpty()) {
                int r12 = 0;
                do {
                    try {
                        ((androidx.camera.core.impl.D) list.get(r12)).d();
                        r12++;
                    } catch (androidx.camera.core.impl.C e4) {
                        for (int r13 = r12 - 1; r13 >= 0; r13--) {
                            ((androidx.camera.core.impl.D) list.get(r13)).b();
                        }
                        throw e4;
                    }
                } while (r12 < list.size());
                this.f5143k = list;
            } else {
                this.f5143k = list;
            }
        }
    }

    public final boolean m() {
        boolean z3;
        synchronized (this.f5134a) {
            if (this.f5140h != null) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        return z3;
    }

    public E1.a n(CameraDevice cameraDevice, y.v vVar, List list) {
        synchronized (this.f5134a) {
            try {
                if (this.f5145m) {
                    return new H.h(1, new CancellationException("Opener is disabled"));
                }
                this.f5135b.j(this);
                S.l a4 = AbstractC0699s0.a(new A.j(this, list, new C0322i(cameraDevice, this.f5136c), vVar));
                this.f5140h = a4;
                C0322i c0322i = new C0322i(21, this);
                a4.a(new H.e(0, a4, c0322i), AbstractC0636k0.a());
                return H.f.d(this.f5140h);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o() {
        synchronized (this.f5134a) {
            try {
                List<androidx.camera.core.impl.D> list = this.f5143k;
                if (list != null) {
                    for (androidx.camera.core.impl.D d4 : list) {
                        d4.b();
                    }
                    this.f5143k = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int p(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        AbstractC0624h4.e(this.g, "Need to call openCaptureSession before using this API.");
        return ((h2.J) this.g.f3003K).C(captureRequest, this.f5137d, captureCallback);
    }

    public E1.a q(ArrayList arrayList) {
        synchronized (this.f5134a) {
            try {
                if (this.f5145m) {
                    return new H.h(1, new CancellationException("Opener is disabled"));
                }
                G.l lVar = this.f5137d;
                G.e eVar = this.f5138e;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(H.f.d(((androidx.camera.core.impl.D) it.next()).c()));
                }
                H.d b3 = H.d.b(AbstractC0699s0.a(new androidx.camera.core.impl.E(arrayList2, eVar, lVar)));
                C.f fVar = new C.f(8, this, arrayList);
                G.l lVar2 = this.f5137d;
                b3.getClass();
                H.b f2 = H.f.f(b3, fVar, lVar2);
                this.f5142j = f2;
                return H.f.d(f2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean r() {
        boolean z3;
        H.d dVar = null;
        try {
            synchronized (this.f5134a) {
                if (!this.f5145m) {
                    H.d dVar2 = this.f5142j;
                    if (dVar2 != null) {
                        dVar = dVar2;
                    }
                    this.f5145m = true;
                }
                z3 = !m();
            }
            return z3;
        } finally {
            if (dVar != null) {
                dVar.cancel(true);
            }
        }
    }

    public final C0235c s() {
        this.g.getClass();
        return this.g;
    }
}
