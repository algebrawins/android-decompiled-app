package w;

import android.hardware.camera2.CameraCaptureSession;

/* loaded from: classes.dex */
public final class K extends androidx.camera.core.impl.i {

    /* renamed from: a  reason: collision with root package name */
    public final CameraCaptureSession.CaptureCallback f5055a;

    public K(CameraCaptureSession.CaptureCallback captureCallback) {
        if (captureCallback != null) {
            this.f5055a = captureCallback;
            return;
        }
        throw new NullPointerException("captureCallback is null");
    }
}
