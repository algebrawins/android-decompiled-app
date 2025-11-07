package x;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.params.OutputConfiguration;
import android.util.Size;

/* renamed from: x.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0549d {
    public static <T> OutputConfiguration a(Size size, Class<T> cls) {
        return io.flutter.view.a.c(size, cls);
    }

    public static void b(CameraCaptureSession.StateCallback stateCallback, CameraCaptureSession cameraCaptureSession) {
        stateCallback.onCaptureQueueEmpty(cameraCaptureSession);
    }
}
