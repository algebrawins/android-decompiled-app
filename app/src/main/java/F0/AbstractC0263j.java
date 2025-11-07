package f0;

import android.view.VelocityTracker;

/* renamed from: f0.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0263j {
    public static float a(VelocityTracker velocityTracker, int r12) {
        return velocityTracker.getAxisVelocity(r12);
    }

    public static float b(VelocityTracker velocityTracker, int r12, int r22) {
        return velocityTracker.getAxisVelocity(r12, r22);
    }

    public static boolean c(VelocityTracker velocityTracker, int r12) {
        return velocityTracker.isAxisSupported(r12);
    }
}
