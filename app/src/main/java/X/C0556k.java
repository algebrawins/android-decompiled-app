package x;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.concurrent.Executor;

/* renamed from: x.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0556k extends CameraCaptureSession.StateCallback {

    /* renamed from: a  reason: collision with root package name */
    public final CameraCaptureSession.StateCallback f5460a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f5461b;

    public C0556k(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        this.f5461b = executor;
        this.f5460a = stateCallback;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        this.f5461b.execute(new RunnableC0555j(this, cameraCaptureSession, 0));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        this.f5461b.execute(new RunnableC0555j(this, cameraCaptureSession, 2));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        this.f5461b.execute(new RunnableC0555j(this, cameraCaptureSession, 1));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        this.f5461b.execute(new RunnableC0555j(this, cameraCaptureSession, 5));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        this.f5461b.execute(new RunnableC0555j(this, cameraCaptureSession, 3));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        this.f5461b.execute(new RunnableC0555j(this, cameraCaptureSession, 4));
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        this.f5461b.execute(new N.d(this, cameraCaptureSession, surface, 4));
    }
}
