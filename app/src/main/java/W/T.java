package w;

import D.C0042x;
import android.hardware.camera2.CameraCharacteristics;
import x.C0559n;
import y.AbstractC0772a;

/* loaded from: classes.dex */
public abstract class T {
    public static C0042x a(C0559n c0559n) {
        Long l3 = (Long) c0559n.a(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
        if (l3 != null) {
            return AbstractC0772a.b(l3.longValue());
        }
        return null;
    }
}
