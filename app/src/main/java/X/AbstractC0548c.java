package x;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;

/* renamed from: x.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0548c {
    public static void a(CameraCaptureSession.CaptureCallback captureCallback, CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j3) {
        captureCallback.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j3);
    }
}
