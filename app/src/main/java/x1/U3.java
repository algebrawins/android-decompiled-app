package x1;

import D.C0036q;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.camera.core.impl.InterfaceC0091t;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class U3 {
    public static void a(Context context, A.f fVar, C0036q c0036q) {
        Integer c4;
        if (c0036q != null) {
            try {
                c4 = c0036q.c();
                if (c4 == null) {
                    X.g("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e4) {
                X.c("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e4);
                return;
            }
        } else {
            c4 = null;
        }
        X.a("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + c4);
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera")) {
                if (c0036q != null) {
                    if (c4.intValue() == 1) {
                    }
                }
                Iterator it = C0036q.f440c.b(fVar.q()).iterator();
                if (it.hasNext()) {
                    InterfaceC0091t interfaceC0091t = (InterfaceC0091t) it.next();
                } else {
                    throw new IllegalArgumentException("No available camera can be found");
                }
            }
            if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
                if (c0036q == null || c4.intValue() == 0) {
                    Iterator it2 = C0036q.f439b.b(fVar.q()).iterator();
                    if (it2.hasNext()) {
                        InterfaceC0091t interfaceC0091t2 = (InterfaceC0091t) it2.next();
                        return;
                    }
                    throw new IllegalArgumentException("No available camera can be found");
                }
            }
        } catch (IllegalArgumentException e5) {
            X.b("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + fVar.q());
            throw new Exception("Expected camera missing from device.", e5);
        }
    }
}
