package w;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import x.AbstractC0547b;
import x.AbstractC0549d;
import x1.AbstractC0624h4;
import x1.AbstractC0644l0;

/* renamed from: w.F  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0490F extends CameraCaptureSession.StateCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5050a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f5051b;

    public /* synthetic */ C0490F(int r12, Object obj) {
        this.f5050a = r12;
        this.f5051b = obj;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onActive(CameraCaptureSession cameraCaptureSession) {
        switch (this.f5050a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                Iterator it = ((ArrayList) this.f5051b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onActive(cameraCaptureSession);
                }
                return;
            case 1:
                d0 d0Var = (d0) this.f5051b;
                d0Var.j(cameraCaptureSession);
                d0Var.a(d0Var);
                return;
            default:
                super.onActive(cameraCaptureSession);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        switch (this.f5050a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                Iterator it = ((ArrayList) this.f5051b).iterator();
                while (it.hasNext()) {
                    AbstractC0549d.b((CameraCaptureSession.StateCallback) it.next(), cameraCaptureSession);
                }
                return;
            case 1:
                d0 d0Var = (d0) this.f5051b;
                d0Var.j(cameraCaptureSession);
                d0Var.b(d0Var);
                return;
            default:
                super.onCaptureQueueEmpty(cameraCaptureSession);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onClosed(CameraCaptureSession cameraCaptureSession) {
        switch (this.f5050a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                Iterator it = ((ArrayList) this.f5051b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onClosed(cameraCaptureSession);
                }
                return;
            case 1:
                d0 d0Var = (d0) this.f5051b;
                d0Var.j(cameraCaptureSession);
                d0Var.c(d0Var);
                return;
            default:
                super.onClosed(cameraCaptureSession);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        S.i iVar;
        switch (this.f5050a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                Iterator it = ((ArrayList) this.f5051b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed(cameraCaptureSession);
                }
                return;
            case 1:
                try {
                    ((d0) this.f5051b).j(cameraCaptureSession);
                    d0 d0Var = (d0) this.f5051b;
                    d0Var.d(d0Var);
                    synchronized (((d0) this.f5051b).f5134a) {
                        AbstractC0624h4.e(((d0) this.f5051b).f5141i, "OpenCaptureSession completer should not null");
                        d0 d0Var2 = (d0) this.f5051b;
                        iVar = d0Var2.f5141i;
                        d0Var2.f5141i = null;
                    }
                    iVar.b(new IllegalStateException("onConfigureFailed"));
                    return;
                } catch (Throwable th) {
                    synchronized (((d0) this.f5051b).f5134a) {
                        AbstractC0624h4.e(((d0) this.f5051b).f5141i, "OpenCaptureSession completer should not null");
                        d0 d0Var3 = (d0) this.f5051b;
                        S.i iVar2 = d0Var3.f5141i;
                        d0Var3.f5141i = null;
                        iVar2.b(new IllegalStateException("onConfigureFailed"));
                        throw th;
                    }
                }
            default:
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        S.i iVar;
        Surface inputSurface;
        switch (this.f5050a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                Iterator it = ((ArrayList) this.f5051b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onConfigured(cameraCaptureSession);
                }
                return;
            case 1:
                try {
                    ((d0) this.f5051b).j(cameraCaptureSession);
                    d0 d0Var = (d0) this.f5051b;
                    d0Var.e(d0Var);
                    synchronized (((d0) this.f5051b).f5134a) {
                        AbstractC0624h4.e(((d0) this.f5051b).f5141i, "OpenCaptureSession completer should not null");
                        d0 d0Var2 = (d0) this.f5051b;
                        iVar = d0Var2.f5141i;
                        d0Var2.f5141i = null;
                    }
                    iVar.a(null);
                    return;
                } catch (Throwable th) {
                    synchronized (((d0) this.f5051b).f5134a) {
                        AbstractC0624h4.e(((d0) this.f5051b).f5141i, "OpenCaptureSession completer should not null");
                        d0 d0Var3 = (d0) this.f5051b;
                        S.i iVar2 = d0Var3.f5141i;
                        d0Var3.f5141i = null;
                        iVar2.a(null);
                        throw th;
                    }
                }
            default:
                inputSurface = cameraCaptureSession.getInputSurface();
                if (inputSurface != null) {
                    ((p0) this.f5051b).f5229R = AbstractC0644l0.a(1, inputSurface);
                    return;
                }
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onReady(CameraCaptureSession cameraCaptureSession) {
        switch (this.f5050a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                Iterator it = ((ArrayList) this.f5051b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onReady(cameraCaptureSession);
                }
                return;
            case 1:
                d0 d0Var = (d0) this.f5051b;
                d0Var.j(cameraCaptureSession);
                d0Var.f(d0Var);
                return;
            default:
                super.onReady(cameraCaptureSession);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        switch (this.f5050a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                Iterator it = ((ArrayList) this.f5051b).iterator();
                while (it.hasNext()) {
                    AbstractC0547b.a((CameraCaptureSession.StateCallback) it.next(), cameraCaptureSession, surface);
                }
                return;
            case 1:
                d0 d0Var = (d0) this.f5051b;
                d0Var.j(cameraCaptureSession);
                d0Var.h(d0Var, surface);
                return;
            default:
                super.onSurfacePrepared(cameraCaptureSession, surface);
                return;
        }
    }

    public C0490F(List list) {
        this.f5050a = 0;
        this.f5051b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraCaptureSession.StateCallback stateCallback = (CameraCaptureSession.StateCallback) it.next();
            if (!(stateCallback instanceof C0491G)) {
                ((ArrayList) this.f5051b).add(stateCallback);
            }
        }
    }

    private final void a(CameraCaptureSession cameraCaptureSession) {
    }
}
