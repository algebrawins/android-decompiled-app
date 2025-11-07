package N;

import D.RunnableC0023c;
import android.graphics.Rect;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.InterfaceC0091t;
import java.io.Closeable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import x1.AbstractC0604f0;
import x1.AbstractC0624h4;
import x1.AbstractC0699s0;
import x1.X;

/* loaded from: classes.dex */
public final class n implements Closeable {

    /* renamed from: K  reason: collision with root package name */
    public final Surface f949K;

    /* renamed from: L  reason: collision with root package name */
    public final int f950L;

    /* renamed from: M  reason: collision with root package name */
    public final Size f951M;

    /* renamed from: N  reason: collision with root package name */
    public final float[] f952N;

    /* renamed from: O  reason: collision with root package name */
    public I.d f953O;

    /* renamed from: P  reason: collision with root package name */
    public G.e f954P;

    /* renamed from: S  reason: collision with root package name */
    public final S.l f957S;

    /* renamed from: T  reason: collision with root package name */
    public S.i f958T;

    /* renamed from: J  reason: collision with root package name */
    public final Object f948J = new Object();

    /* renamed from: Q  reason: collision with root package name */
    public boolean f955Q = false;

    /* renamed from: R  reason: collision with root package name */
    public boolean f956R = false;

    public n(Surface surface, int r18, Size size, Size size2, Rect rect, int r22, boolean z3, InterfaceC0091t interfaceC0091t) {
        float[] fArr = new float[16];
        this.f952N = fArr;
        float[] fArr2 = new float[16];
        this.f949K = surface;
        this.f950L = r18;
        this.f951M = size;
        Rect rect2 = new Rect(rect);
        Matrix.setIdentityM(fArr, 0);
        AbstractC0604f0.b(fArr);
        AbstractC0604f0.a(fArr, r22);
        if (z3) {
            Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Size b3 = F.f.b(size2, r22);
        float f2 = 0;
        android.graphics.Matrix a4 = F.f.a(new RectF(f2, f2, size2.getWidth(), size2.getHeight()), new RectF(f2, f2, b3.getWidth(), b3.getHeight()), r22, z3);
        RectF rectF = new RectF(rect2);
        a4.mapRect(rectF);
        Matrix.translateM(fArr, 0, rectF.left / b3.getWidth(), ((b3.getHeight() - rectF.height()) - rectF.top) / b3.getHeight(), 0.0f);
        Matrix.scaleM(fArr, 0, rectF.width() / b3.getWidth(), rectF.height() / b3.getHeight(), 1.0f);
        Matrix.setIdentityM(fArr2, 0);
        AbstractC0604f0.b(fArr2);
        if (interfaceC0091t != null) {
            AbstractC0624h4.f("Camera has no transform.", interfaceC0091t.d());
            AbstractC0604f0.a(fArr2, interfaceC0091t.k().a());
            if (interfaceC0091t.m()) {
                Matrix.translateM(fArr2, 0, 1.0f, 0.0f, 0.0f);
                Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        Matrix.invertM(fArr2, 0, fArr2, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
        this.f957S = AbstractC0699s0.a(new A.k(6, this));
    }

    public final void a() {
        G.e eVar;
        I.d dVar;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f948J) {
            try {
                if (this.f954P != null && (dVar = this.f953O) != null) {
                    if (!this.f956R) {
                        atomicReference.set(dVar);
                        eVar = this.f954P;
                        this.f955Q = false;
                    }
                    eVar = null;
                }
                this.f955Q = true;
                eVar = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (eVar != null) {
            try {
                eVar.execute(new RunnableC0023c(6, this, atomicReference));
            } catch (RejectedExecutionException e4) {
                String f2 = X.f("SurfaceOutputImpl");
                if (X.e(f2, 3)) {
                    Log.d(f2, "Processor executor closed. Close request not posted.", e4);
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f948J) {
            try {
                if (!this.f956R) {
                    this.f956R = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f958T.a(null);
    }
}
