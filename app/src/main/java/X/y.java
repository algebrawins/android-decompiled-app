package x;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;

/* loaded from: classes.dex */
public class y extends x {
    @Override // x.x, h2.J
    public final void A(String str, G.l lVar, CameraDevice.StateCallback stateCallback) {
        try {
            ((CameraManager) this.f3303K).openCamera(str, lVar, stateCallback);
        } catch (CameraAccessException e4) {
            throw new C0551f(e4);
        }
    }

    @Override // x.x, h2.J
    public final CameraCharacteristics v(String str) {
        try {
            return ((CameraManager) this.f3303K).getCameraCharacteristics(str);
        } catch (CameraAccessException e4) {
            throw new C0551f(e4);
        }
    }
}
