package x;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import h2.J;

/* loaded from: classes.dex */
public class x extends J {
    public static boolean H(RuntimeException runtimeException) {
        boolean z3;
        StackTraceElement[] stackTrace;
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        if (runtimeException.getClass().equals(RuntimeException.class) && (stackTrace = runtimeException.getStackTrace()) != null && stackTrace.length >= 0) {
            z3 = "_enableShutterSound".equals(stackTrace[0].getMethodName());
        } else {
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        return true;
    }

    @Override // h2.J
    public void A(String str, G.l lVar, CameraDevice.StateCallback stateCallback) {
        try {
            ((CameraManager) this.f3303K).openCamera(str, lVar, stateCallback);
        } catch (CameraAccessException e4) {
            throw new C0551f(e4);
        } catch (IllegalArgumentException e5) {
        } catch (SecurityException e6) {
            throw e6;
        } catch (RuntimeException e7) {
            if (H(e7)) {
                throw new C0551f(e7);
            }
            throw e7;
        }
    }

    @Override // h2.J
    public final void B(G.l lVar, w.r rVar) {
        ((CameraManager) this.f3303K).registerAvailabilityCallback(lVar, rVar);
    }

    @Override // h2.J
    public final void E(CameraManager.AvailabilityCallback availabilityCallback) {
        ((CameraManager) this.f3303K).unregisterAvailabilityCallback(availabilityCallback);
    }

    @Override // h2.J
    public CameraCharacteristics v(String str) {
        try {
            return super.v(str);
        } catch (RuntimeException e4) {
            if (H(e4)) {
                throw new C0551f(e4);
            }
            throw e4;
        }
    }
}
