package x;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import x1.AbstractC0624h4;
import y.C0774c;
import y.C0775d;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final Object f5471a;

    public /* synthetic */ t(Object obj) {
        this.f5471a = obj;
    }

    public static t a(C0559n c0559n) {
        CameraCharacteristics.Key key;
        boolean z3;
        int r02 = Build.VERSION.SDK_INT;
        t tVar = null;
        if (r02 >= 33) {
            key = CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES;
            DynamicRangeProfiles g = Q0.e.g(c0559n.a(key));
            if (g != null) {
                if (r02 >= 33) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                AbstractC0624h4.f("DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.", z3);
                tVar = new t(new C0774c(g));
            }
        }
        if (tVar == null) {
            return C0775d.f6166a;
        }
        return tVar;
    }
}
