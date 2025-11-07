package N;

import D.C0042x;
import D.N;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import x1.AbstractC0604f0;
import x1.AbstractC0624h4;
import x1.AbstractC0699s0;
import x1.X;

/* loaded from: classes.dex */
public final class f implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a  reason: collision with root package name */
    public final h f888a;

    /* renamed from: b  reason: collision with root package name */
    public final HandlerThread f889b;

    /* renamed from: c  reason: collision with root package name */
    public final G.e f890c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f891d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f892e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    public final float[] f893f = new float[16];
    public final float[] g = new float[16];

    /* renamed from: h  reason: collision with root package name */
    public final LinkedHashMap f894h = new LinkedHashMap();

    /* renamed from: i  reason: collision with root package name */
    public int f895i = 0;

    /* renamed from: j  reason: collision with root package name */
    public boolean f896j = false;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f897k = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.lang.Runnable] */
    public f(C0042x c0042x) {
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f889b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f891d = handler;
        this.f890c = new G.e(handler);
        this.f888a = new h();
        try {
            try {
                AbstractC0699s0.a(new C.f(5, this, c0042x)).get();
            } catch (InterruptedException | ExecutionException e4) {
                e = e4;
                e = e instanceof ExecutionException ? e.getCause() : e;
                if (e instanceof RuntimeException) {
                    throw ((RuntimeException) e);
                }
                throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
            }
        } catch (RuntimeException e5) {
            if (!this.f892e.getAndSet(true)) {
                b(new N(4, this), new Object());
            }
            throw e5;
        }
    }

    public final void a() {
        if (this.f896j && this.f895i == 0) {
            LinkedHashMap linkedHashMap = this.f894h;
            for (n nVar : linkedHashMap.keySet()) {
                nVar.close();
            }
            Iterator it = this.f897k.iterator();
            if (!it.hasNext()) {
                linkedHashMap.clear();
                h hVar = this.f888a;
                if (hVar.f907a.getAndSet(false)) {
                    hVar.c();
                    hVar.p();
                }
                this.f889b.quit();
                return;
            }
            ((a) it.next()).getClass();
            new Exception("Failed to snapshot: DefaultSurfaceProcessor is released.");
            throw null;
        }
    }

    public final void b(Runnable runnable, Runnable runnable2) {
        try {
            this.f890c.execute(new d(this, runnable2, runnable, 0));
        } catch (RejectedExecutionException e4) {
            X.h("DefaultSurfaceProcessor", "Unable to executor runnable", e4);
            runnable2.run();
        }
    }

    public final void c(Exception exc) {
        ArrayList arrayList = this.f897k;
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            arrayList.clear();
        } else {
            ((a) it.next()).getClass();
            throw null;
        }
    }

    public final Bitmap d(Size size, float[] fArr, int r24) {
        boolean z3;
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        AbstractC0604f0.b(fArr2);
        AbstractC0604f0.a(fArr2, r24);
        Matrix.multiplyMM(fArr2, 0, fArr2, 0, fArr, 0);
        Size b3 = F.f.b(size, r24);
        h hVar = this.f888a;
        hVar.getClass();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(b3.getHeight() * b3.getWidth() * 4);
        if (allocateDirect.capacity() == b3.getHeight() * b3.getWidth() * 4) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0624h4.a("ByteBuffer capacity is not equal to width * height * 4.", z3);
        AbstractC0624h4.a("ByteBuffer is not direct.", allocateDirect.isDirect());
        int[] r6 = new int[1];
        GLES20.glGenTextures(1, r6, 0);
        h.b("glGenTextures");
        int r62 = r6[0];
        GLES20.glActiveTexture(33985);
        h.b("glActiveTexture");
        GLES20.glBindTexture(3553, r62);
        h.b("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, b3.getWidth(), b3.getHeight(), 0, 6407, 5121, null);
        h.b("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] r12 = new int[1];
        GLES20.glGenFramebuffers(1, r12, 0);
        h.b("glGenFramebuffers");
        int r15 = r12[0];
        GLES20.glBindFramebuffer(36160, r15);
        h.b("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, r62, 0);
        h.b("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        h.b("glActiveTexture");
        GLES20.glBindTexture(36197, hVar.f914i);
        h.b("glBindTexture");
        hVar.f913h = null;
        GLES20.glViewport(0, 0, b3.getWidth(), b3.getHeight());
        GLES20.glScissor(0, 0, b3.getWidth(), b3.getHeight());
        GLES20.glUniformMatrix4fv(hVar.f916k, 1, false, fArr2, 0);
        h.b("glUniformMatrix4fv");
        GLES20.glDrawArrays(5, 0, 4);
        h.b("glDrawArrays");
        GLES20.glReadPixels(0, 0, b3.getWidth(), b3.getHeight(), 6408, 5121, allocateDirect);
        h.b("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{r62}, 0);
        h.b("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{r15}, 0);
        h.b("glDeleteFramebuffers");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, hVar.f914i);
        Bitmap createBitmap = Bitmap.createBitmap(b3.getWidth(), b3.getHeight(), Bitmap.Config.ARGB_8888);
        allocateDirect.rewind();
        ImageProcessingUtil.c(createBitmap, allocateDirect, b3.getWidth() * 4);
        return createBitmap;
    }

    public final void e(B2.g gVar) {
        ArrayList arrayList = this.f897k;
        if (arrayList.isEmpty()) {
            return;
        }
        if (gVar == null) {
            c(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                byteArrayOutputStream.close();
                return;
            }
            ((a) it.next()).getClass();
            Bitmap d4 = d(gVar.f207K, gVar.f208L, 0);
            byteArrayOutputStream.reset();
            d4.compress(Bitmap.CompressFormat.JPEG, 0, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Surface surface = gVar.f206J;
            Objects.requireNonNull(byteArray);
            ImageProcessingUtil.f(byteArray, surface);
            throw null;
        } catch (IOException e4) {
            c(e4);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        boolean z3;
        if (this.f892e.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        surfaceTexture.getTransformMatrix(this.f893f);
        B2.g gVar = null;
        for (Map.Entry entry : this.f894h.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            n nVar = (n) entry.getKey();
            float[] fArr = nVar.f952N;
            Matrix.multiplyMM(this.g, 0, this.f893f, 0, fArr, 0);
            float[] fArr2 = this.g;
            int r6 = nVar.f950L;
            if (r6 == 34) {
                try {
                    this.f888a.r(surfaceTexture.getTimestamp(), fArr2, surface);
                } catch (RuntimeException e4) {
                    X.c("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e4);
                }
            } else {
                boolean z4 = false;
                if (r6 == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                AbstractC0624h4.f("Unsupported format: " + r6, z3);
                if (gVar == null) {
                    z4 = true;
                }
                AbstractC0624h4.f("Only one JPEG output is supported.", z4);
                gVar = new B2.g(surface, nVar.f951M, (float[]) fArr2.clone());
            }
        }
        try {
            e(gVar);
        } catch (RuntimeException e5) {
            c(e5);
        }
    }
}
