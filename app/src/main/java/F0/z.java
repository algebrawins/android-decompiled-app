package f0;

import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public abstract class z {
    public static int a(ViewConfiguration viewConfiguration, int r12, int r22, int r3) {
        return viewConfiguration.getScaledMaximumFlingVelocity(r12, r22, r3);
    }

    public static int b(ViewConfiguration viewConfiguration, int r12, int r22, int r3) {
        return viewConfiguration.getScaledMinimumFlingVelocity(r12, r22, r3);
    }
}
