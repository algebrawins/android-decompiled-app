package w;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;

/* renamed from: w.C  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0487C {
    public static CaptureRequest.Builder a(CameraDevice cameraDevice, TotalCaptureResult totalCaptureResult) {
        return cameraDevice.createReprocessCaptureRequest(totalCaptureResult);
    }
}
