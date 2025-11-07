package x1;

/* loaded from: classes.dex */
public abstract class B0 {
    public static int a(int r22) {
        if (r22 != 0) {
            if (r22 != 90) {
                if (r22 != 180) {
                    if (r22 == 270) {
                        return 3;
                    }
                    throw new IllegalArgumentException(D.C.w("Invalid rotation: ", r22));
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }
}
