package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.C0076c;

/* renamed from: v.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0479a extends A.a {

    /* renamed from: L  reason: collision with root package name */
    public static final C0076c f5035L = new C0076c("camera2.captureRequest.templateType", Integer.TYPE, null);

    /* renamed from: M  reason: collision with root package name */
    public static final C0076c f5036M = new C0076c("camera2.cameraCaptureSession.streamUseCase", Long.TYPE, null);

    /* renamed from: N  reason: collision with root package name */
    public static final C0076c f5037N = new C0076c("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class, null);

    /* renamed from: O  reason: collision with root package name */
    public static final C0076c f5038O = new C0076c("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class, null);

    /* renamed from: P  reason: collision with root package name */
    public static final C0076c f5039P = new C0076c("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class, null);

    /* renamed from: Q  reason: collision with root package name */
    public static final C0076c f5040Q = new C0076c("camera2.cameraEvent.callback", C0480b.class, null);

    /* renamed from: R  reason: collision with root package name */
    public static final C0076c f5041R = new C0076c("camera2.captureRequest.tag", Object.class, null);

    /* renamed from: S  reason: collision with root package name */
    public static final C0076c f5042S = new C0076c("camera2.cameraCaptureSession.physicalCameraId", String.class, null);

    public static C0076c r0(CaptureRequest.Key key) {
        return new C0076c("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }
}
