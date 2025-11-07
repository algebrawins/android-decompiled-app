package w;

import D.s0;

/* loaded from: classes.dex */
public final class n0 implements s0 {

    /* renamed from: a  reason: collision with root package name */
    public float f5211a;

    /* renamed from: b  reason: collision with root package name */
    public final float f5212b;

    /* renamed from: c  reason: collision with root package name */
    public final float f5213c;

    /* renamed from: d  reason: collision with root package name */
    public float f5214d;

    public n0(float f2, float f4) {
        this.f5212b = f2;
        this.f5213c = f4;
    }

    @Override // D.s0
    public final float a() {
        return this.f5212b;
    }

    @Override // D.s0
    public final float b() {
        return this.f5211a;
    }

    @Override // D.s0
    public final float c() {
        return this.f5214d;
    }

    @Override // D.s0
    public final float d() {
        return this.f5213c;
    }

    public final void e(float f2) {
        if (f2 <= 1.0f && f2 >= 0.0f) {
            this.f5214d = f2;
            float f4 = this.f5212b;
            if (f2 != 1.0f) {
                float f5 = this.f5213c;
                if (f2 == 0.0f) {
                    f4 = f5;
                } else {
                    double d4 = 1.0f / f5;
                    double d5 = 1.0d / ((((1.0f / f4) - d4) * f2) + d4);
                    double d6 = f5;
                    double d7 = f4;
                    if (d5 < d6) {
                        d5 = d6;
                    } else if (d5 > d7) {
                        d5 = d7;
                    }
                    f4 = (float) d5;
                }
            }
            this.f5211a = f4;
            return;
        }
        throw new IllegalArgumentException("Requested linearZoom " + f2 + " is not within valid range [0..1]");
    }

    public final void f() {
        float f2 = 1.0f;
        float f4 = this.f5213c;
        float f5 = this.f5212b;
        int r3 = (1.0f > f5 ? 1 : (1.0f == f5 ? 0 : -1));
        if (r3 <= 0 && 1.0f >= f4) {
            this.f5211a = 1.0f;
            if (f5 != f4) {
                if (r3 != 0) {
                    if (1.0f != f4) {
                        float f6 = 1.0f / f4;
                        f2 = (1.0f - f6) / ((1.0f / f5) - f6);
                    }
                }
                this.f5214d = f2;
                return;
            }
            f2 = 0.0f;
            this.f5214d = f2;
            return;
        }
        throw new IllegalArgumentException("Requested zoomRatio 1.0 is not within valid range [" + f4 + " , " + f5 + "]");
    }
}
