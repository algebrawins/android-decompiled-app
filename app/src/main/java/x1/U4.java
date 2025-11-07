package x1;

import android.hardware.camera2.CameraCharacteristics;
import java.util.List;

/* loaded from: classes.dex */
public abstract class U4 {
    public static String a(x.w wVar, Integer num, List list) {
        if (num == null || !list.contains("0") || !list.contains("1")) {
            return null;
        }
        if (num.intValue() == 1) {
            if (((Integer) wVar.b("0").a(CameraCharacteristics.LENS_FACING)).intValue() != 1) {
                return null;
            }
            return "1";
        } else if (num.intValue() != 0 || ((Integer) wVar.b("1").a(CameraCharacteristics.LENS_FACING)).intValue() != 0) {
            return null;
        } else {
            return "0";
        }
    }
}
