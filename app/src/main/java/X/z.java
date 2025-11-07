package x;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import java.util.Set;

/* loaded from: classes.dex */
public final class z extends y {
    @Override // h2.J
    public final Set w() {
        try {
            return ((CameraManager) this.f3303K).getConcurrentCameraIds();
        } catch (CameraAccessException e4) {
            throw new C0551f(e4);
        }
    }
}
