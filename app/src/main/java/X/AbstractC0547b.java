package x;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;

/* renamed from: x.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0547b {
    public static void a(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession, Surface surface) {
        stateCallback.onSurfacePrepared(cameraCaptureSession, surface);
    }
}
