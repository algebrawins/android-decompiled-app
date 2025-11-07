package C;

import A.k;
import D.C0040v;
import D.C0042x;
import D.RunnableC0038t;
import D.d0;
import D.f0;
import D.n0;
import H.h;
import S.i;
import S.j;
import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.C;
import androidx.camera.core.impl.D;
import androidx.camera.core.impl.K;
import androidx.camera.core.impl.L;
import d2.m;
import h2.AbstractActivityC0292d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import x1.AbstractC0636k0;
import x1.X;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements j, K, d0, H.a {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f228J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ Object f229K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ Object f230L;

    public /* synthetic */ f(int r12, Object obj, Object obj2) {
        this.f228J = r12;
        this.f229K = obj;
        this.f230L = obj2;
    }

    @Override // androidx.camera.core.impl.K
    public void a(L l3) {
        switch (this.f228J) {
            case 2:
                f0 f0Var = (f0) this.f229K;
                f0Var.getClass();
                ((K) this.f230L).a(f0Var);
                return;
            default:
                A.c cVar = (A.c) this.f229K;
                cVar.getClass();
                ((K) this.f230L).a(cVar);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, java.lang.Runnable] */
    @Override // S.j
    public Object a0(i iVar) {
        switch (this.f228J) {
            case 1:
                C0040v c0040v = (C0040v) this.f229K;
                Executor executor = c0040v.f464d;
                executor.execute(new RunnableC0038t(c0040v, (AbstractActivityC0292d) this.f230L, executor, iVar, SystemClock.elapsedRealtime(), 0));
                return "CameraX initInternal";
            case 2:
            case 4:
            default:
                C0040v c0040v2 = (C0040v) this.f230L;
                synchronized (((Q.d) this.f229K).f1046a) {
                    H.d b3 = H.d.b(h.f701L);
                    k kVar = new k(9, c0040v2);
                    G.a a4 = AbstractC0636k0.a();
                    b3.getClass();
                    H.b f2 = H.f.f(b3, kVar, a4);
                    A.f fVar = new A.f(9, iVar, c0040v2);
                    f2.a(new H.e(0, f2, fVar), AbstractC0636k0.a());
                }
                return "ProcessCameraProvider-initializeCameraX";
            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                n0 n0Var = (n0) this.f229K;
                n0Var.getClass();
                ((AtomicReference) this.f230L).set(iVar);
                return "SurfaceRequest-surface-recreation(" + n0Var.hashCode() + ")";
            case q0.k.STRING_FIELD_NUMBER /* 5 */:
                N.f fVar2 = (N.f) this.f229K;
                fVar2.getClass();
                fVar2.b(new N.d(fVar2, (C0042x) this.f230L, iVar, 1), new Object());
                return "Init GlRenderer";
        }
    }

    @Override // H.a
    public E1.a apply(Object obj) {
        List list = (List) obj;
        w.d0 d0Var = (w.d0) this.f229K;
        d0Var.getClass();
        X.a("SyncCaptureSessionBase", "[" + d0Var + "] getSurface...done");
        if (list.contains(null)) {
            return new h(1, new C("Surface closed", (D) ((ArrayList) this.f230L).get(list.indexOf(null))));
        } else if (list.isEmpty()) {
            return new h(1, new IllegalArgumentException("Unable to open capture session without surfaces"));
        } else {
            return H.f.c(list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [e0.a, java.lang.Object] */
    @Override // D.d0
    public void b(n0 n0Var) {
        N2.g.e(n0Var, "request");
        m mVar = (m) this.f229K;
        if (mVar.g != null || mVar.f3032h != null) {
            io.flutter.embedding.engine.renderer.k kVar = mVar.f3033i;
            N2.g.b(kVar);
            SurfaceTexture surfaceTexture = kVar.f3475b.surfaceTexture();
            N2.g.d(surfaceTexture, "surfaceTexture(...)");
            Size size = n0Var.f424b;
            surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
            n0Var.a(new Surface(surfaceTexture), (Executor) this.f230L, new Object());
        }
    }
}
