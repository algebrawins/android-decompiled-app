package k;

import android.animation.TimeInterpolator;

/* renamed from: k.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0311d implements TimeInterpolator {

    /* renamed from: a  reason: collision with root package name */
    public int[] f3934a;

    /* renamed from: b  reason: collision with root package name */
    public int f3935b;

    /* renamed from: c  reason: collision with root package name */
    public int f3936c;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f2) {
        float f4;
        int r5 = (int) ((f2 * this.f3936c) + 0.5f);
        int r02 = this.f3935b;
        int[] r12 = this.f3934a;
        int r22 = 0;
        while (r22 < r02) {
            int r3 = r12[r22];
            if (r5 < r3) {
                break;
            }
            r5 -= r3;
            r22++;
        }
        if (r22 < r02) {
            f4 = r5 / this.f3936c;
        } else {
            f4 = 0.0f;
        }
        return (r22 / r02) + f4;
    }
}
