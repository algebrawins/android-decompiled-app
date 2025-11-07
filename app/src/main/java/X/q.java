package x;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import h2.J;
import java.util.ArrayList;
import y.C0779h;

/* loaded from: classes.dex */
public class q extends J {
    @Override // h2.J
    public void s(y.v vVar) {
        CameraDevice cameraDevice = (CameraDevice) this.f3303K;
        J.r(cameraDevice, vVar);
        y.u uVar = vVar.f6193a;
        C0556k c0556k = new C0556k(uVar.d(), uVar.f());
        ArrayList D3 = J.D(uVar.g());
        t tVar = (t) this.f3304L;
        tVar.getClass();
        C0779h b3 = uVar.b();
        Handler handler = (Handler) tVar.f5471a;
        try {
            if (b3 != null) {
                InputConfiguration inputConfiguration = b3.f6169a.f6168a;
                inputConfiguration.getClass();
                cameraDevice.createReprocessableCaptureSession(inputConfiguration, D3, c0556k, handler);
            } else if (uVar.c() == 1) {
                cameraDevice.createConstrainedHighSpeedCaptureSession(D3, c0556k, handler);
            } else {
                try {
                    cameraDevice.createCaptureSession(D3, c0556k, handler);
                } catch (CameraAccessException e4) {
                    throw new C0551f(e4);
                }
            }
        } catch (CameraAccessException e5) {
            throw new C0551f(e5);
        }
    }
}
