package D;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.nio.BufferUnderflowException;
import x.C0559n;
import z.AbstractC0957j;

/* renamed from: D.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0024d {
    public static boolean a(A.k kVar) {
        Boolean bool;
        try {
            bool = (Boolean) ((C0559n) kVar.f22K).a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        } catch (BufferUnderflowException e4) {
            if (AbstractC0957j.f6565a.b(z.p.class) != null) {
                x1.X.a("FlashAvailability", String.format("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)));
            } else {
                x1.X.c("FlashAvailability", String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)), e4);
            }
            bool = Boolean.FALSE;
        }
        if (bool == null) {
            x1.X.g("FlashAvailability", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
        }
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
