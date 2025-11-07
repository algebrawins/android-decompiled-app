package A0;

import android.view.animation.Interpolator;

/* renamed from: A0.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class animation.InterpolatorC0018u implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f2) {
        float f4 = f2 - 1.0f;
        return (f4 * f4 * f4 * f4 * f4) + 1.0f;
    }
}
