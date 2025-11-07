package x1;

/* renamed from: x1.b0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0572b0 {
    public static int a(int r4, int r5, boolean z3) {
        int r02;
        if (z3) {
            r02 = ((r5 - r4) + 360) % 360;
        } else {
            r02 = (r5 + r4) % 360;
        }
        if (X.d("CameraOrientationUtil")) {
            X.a("CameraOrientationUtil", "getRelativeImageRotation: destRotationDegrees=" + r4 + ", sourceRotationDegrees=" + r5 + ", isOppositeFacing=" + z3 + ", result=" + r02);
        }
        return r02;
    }

    public static int b(int r22) {
        if (r22 != 0) {
            if (r22 != 1) {
                if (r22 != 2) {
                    if (r22 == 3) {
                        return 270;
                    }
                    throw new IllegalArgumentException(D.C.w("Unsupported surface rotation: ", r22));
                }
                return 180;
            }
            return 90;
        }
        return 0;
    }
}
