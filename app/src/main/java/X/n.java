package X;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: k  reason: collision with root package name */
    public static final n f1569k;

    /* renamed from: a  reason: collision with root package name */
    public final float f1570a;

    /* renamed from: b  reason: collision with root package name */
    public final float f1571b;

    /* renamed from: c  reason: collision with root package name */
    public final float f1572c;

    /* renamed from: d  reason: collision with root package name */
    public final float f1573d;

    /* renamed from: e  reason: collision with root package name */
    public final float f1574e;

    /* renamed from: f  reason: collision with root package name */
    public final float f1575f;
    public final float[] g;

    /* renamed from: h  reason: collision with root package name */
    public final float f1576h;

    /* renamed from: i  reason: collision with root package name */
    public final float f1577i;

    /* renamed from: j  reason: collision with root package name */
    public final float f1578j;

    static {
        float f2;
        float[] fArr = b.f1547c;
        float l3 = (float) ((b.l() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f1545a;
        float f4 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f5 = fArr[1];
        float f6 = (fArr3[1] * f5) + (fArr3[0] * f4);
        float f7 = fArr[2];
        float f8 = (fArr3[2] * f7) + f6;
        float[] fArr4 = fArr2[1];
        float f9 = (fArr4[2] * f7) + (fArr4[1] * f5) + (fArr4[0] * f4);
        float[] fArr5 = fArr2[2];
        float f10 = (f7 * fArr5[2]) + (f5 * fArr5[1]) + (f4 * fArr5[0]);
        if (1.0f >= 0.9d) {
            f2 = 0.69f;
        } else {
            f2 = 0.655f;
        }
        float exp = (1.0f - (((float) Math.exp(((-l3) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d4 = exp;
        if (d4 > 1.0d) {
            exp = 1.0f;
        } else if (d4 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f8) * exp) + 1.0f) - exp, (((100.0f / f9) * exp) + 1.0f) - exp, (((100.0f / f10) * exp) + 1.0f) - exp};
        float f11 = 1.0f / ((5.0f * l3) + 1.0f);
        float f12 = f11 * f11 * f11 * f11;
        float f13 = 1.0f - f12;
        float cbrt = (0.1f * f13 * f13 * ((float) Math.cbrt(l3 * 5.0d))) + (f12 * l3);
        float l4 = b.l() / fArr[1];
        double d5 = l4;
        float sqrt = ((float) Math.sqrt(d5)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d5, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f8) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f9) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * cbrt) * f10) / 100.0d, 0.42d)};
        float f14 = fArr7[0];
        float f15 = (f14 * 400.0f) / (f14 + 27.13f);
        float f16 = fArr7[1];
        float f17 = (f16 * 400.0f) / (f16 + 27.13f);
        float f18 = fArr7[2];
        float[] fArr8 = {f15, f17, (400.0f * f18) / (f18 + 27.13f)};
        f1569k = new n(l4, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * pow, pow, pow, f2, 1.0f, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public n(float f2, float f4, float f5, float f6, float f7, float f8, float[] fArr, float f9, float f10, float f11) {
        this.f1575f = f2;
        this.f1570a = f4;
        this.f1571b = f5;
        this.f1572c = f6;
        this.f1573d = f7;
        this.f1574e = f8;
        this.g = fArr;
        this.f1576h = f9;
        this.f1577i = f10;
        this.f1578j = f11;
    }
}
