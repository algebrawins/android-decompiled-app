package x;

import android.hardware.camera2.CameraManager;

/* renamed from: x.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0550e {
    public static void a(CameraManager.AvailabilityCallback availabilityCallback) {
        availabilityCallback.onCameraAccessPrioritiesChanged();
    }
}
