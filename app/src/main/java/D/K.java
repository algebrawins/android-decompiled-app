package D;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageReader;
import android.media.ImageWriter;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import x1.AbstractC0644l0;

/* loaded from: classes.dex */
public abstract class K implements androidx.camera.core.impl.K {

    /* renamed from: J  reason: collision with root package name */
    public A.k f307J;

    /* renamed from: K  reason: collision with root package name */
    public volatile int f308K;

    /* renamed from: L  reason: collision with root package name */
    public volatile int f309L;

    /* renamed from: N  reason: collision with root package name */
    public volatile boolean f311N;

    /* renamed from: O  reason: collision with root package name */
    public volatile boolean f312O;

    /* renamed from: P  reason: collision with root package name */
    public Executor f313P;

    /* renamed from: Q  reason: collision with root package name */
    public f0 f314Q;

    /* renamed from: R  reason: collision with root package name */
    public ImageWriter f315R;

    /* renamed from: W  reason: collision with root package name */
    public ByteBuffer f320W;

    /* renamed from: X  reason: collision with root package name */
    public ByteBuffer f321X;

    /* renamed from: Y  reason: collision with root package name */
    public ByteBuffer f322Y;

    /* renamed from: Z  reason: collision with root package name */
    public ByteBuffer f323Z;

    /* renamed from: M  reason: collision with root package name */
    public volatile int f310M = 1;

    /* renamed from: S  reason: collision with root package name */
    public Rect f316S = new Rect();

    /* renamed from: T  reason: collision with root package name */
    public Rect f317T = new Rect();

    /* renamed from: U  reason: collision with root package name */
    public Matrix f318U = new Matrix();

    /* renamed from: V  reason: collision with root package name */
    public Matrix f319V = new Matrix();
    public final Object a0 = new Object();

    /* renamed from: b0  reason: collision with root package name */
    public boolean f324b0 = true;

    @Override // androidx.camera.core.impl.K
    public final void a(androidx.camera.core.impl.L l3) {
        try {
            X b3 = b(l3);
            if (b3 != null) {
                f(b3);
            }
        } catch (IllegalStateException e4) {
            x1.X.c("ImageAnalysisAnalyzer", "Failed to acquire image.", e4);
        }
    }

    public abstract X b(androidx.camera.core.impl.L l3);

    /* JADX WARN: Removed duplicated region for block: B:43:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final E1.a c(final D.X r15) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: D.K.c(D.X):E1.a");
    }

    public abstract void d();

    public final void e(X x3) {
        if (this.f310M == 1) {
            if (this.f321X == null) {
                this.f321X = ByteBuffer.allocateDirect(x3.getHeight() * x3.getWidth());
            }
            this.f321X.position(0);
            if (this.f322Y == null) {
                this.f322Y = ByteBuffer.allocateDirect((x3.getHeight() * x3.getWidth()) / 4);
            }
            this.f322Y.position(0);
            if (this.f323Z == null) {
                this.f323Z = ByteBuffer.allocateDirect((x3.getHeight() * x3.getWidth()) / 4);
            }
            this.f323Z.position(0);
        } else if (this.f310M == 2 && this.f320W == null) {
            this.f320W = ByteBuffer.allocateDirect(x3.getHeight() * x3.getWidth() * 4);
        }
    }

    public abstract void f(X x3);

    public final void g(int r5, int r6, int r7, int r8) {
        int r02 = this.f308K;
        Matrix matrix = new Matrix();
        if (r02 > 0) {
            RectF rectF = new RectF(0.0f, 0.0f, r5, r6);
            RectF rectF2 = F.f.f603a;
            Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
            matrix.postRotate(r02);
            RectF rectF3 = new RectF(0.0f, 0.0f, r7, r8);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(rectF2, rectF3, scaleToFit);
            matrix.postConcat(matrix2);
        }
        RectF rectF4 = new RectF(this.f316S);
        matrix.mapRect(rectF4);
        Rect rect = new Rect();
        rectF4.round(rect);
        this.f317T = rect;
        this.f319V.setConcat(this.f318U, matrix);
    }

    public final void h(X x3, int r7) {
        boolean z3;
        int r3;
        f0 f0Var = this.f314Q;
        if (f0Var == null) {
            return;
        }
        f0Var.a();
        int width = x3.getWidth();
        int height = x3.getHeight();
        int m3 = this.f314Q.m();
        int k3 = this.f314Q.k();
        if (r7 != 90 && r7 != 270) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            r3 = height;
        } else {
            r3 = width;
        }
        if (!z3) {
            width = height;
        }
        this.f314Q = new f0(new B0.e(ImageReader.newInstance(r3, width, m3, k3)));
        int r6 = Build.VERSION.SDK_INT;
        if (r6 >= 23 && this.f310M == 1) {
            ImageWriter imageWriter = this.f315R;
            if (imageWriter != null) {
                if (r6 >= 23) {
                    J.a.a(imageWriter);
                } else {
                    throw new RuntimeException(C.v(r6, "Unable to call close() on API ", ". Version 23 or higher required."));
                }
            }
            this.f315R = AbstractC0644l0.a(this.f314Q.k(), this.f314Q.getSurface());
        }
    }

    public final void i(Executor executor, A.k kVar) {
        synchronized (this.a0) {
            this.f307J = kVar;
            this.f313P = executor;
        }
    }
}
