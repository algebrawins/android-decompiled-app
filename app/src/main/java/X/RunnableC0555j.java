package x;

import android.hardware.camera2.CameraCaptureSession;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* renamed from: x.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0555j implements Runnable {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f5457J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ C0556k f5458K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ CameraCaptureSession f5459L;

    public /* synthetic */ RunnableC0555j(C0556k c0556k, CameraCaptureSession cameraCaptureSession, int r3) {
        this.f5457J = r3;
        this.f5458K = c0556k;
        this.f5459L = cameraCaptureSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5457J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                this.f5458K.f5460a.onActive(this.f5459L);
                return;
            case 1:
                this.f5458K.f5460a.onClosed(this.f5459L);
                return;
            case 2:
                AbstractC0549d.b(this.f5458K.f5460a, this.f5459L);
                return;
            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                this.f5458K.f5460a.onConfigured(this.f5459L);
                return;
            case 4:
                this.f5458K.f5460a.onReady(this.f5459L);
                return;
            default:
                this.f5458K.f5460a.onConfigureFailed(this.f5459L);
                return;
        }
    }
}
