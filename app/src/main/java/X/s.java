package x;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;

/* loaded from: classes.dex */
public final class s extends r {
    @Override // x.r, x.q, h2.J
    public final void s(y.v vVar) {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) vVar.f6193a.a();
        sessionConfiguration.getClass();
        try {
            ((CameraDevice) this.f3303K).createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e4) {
            throw new C0551f(e4);
        }
    }
}
