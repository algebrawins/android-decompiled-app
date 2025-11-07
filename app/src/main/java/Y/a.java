package Y;

import android.graphics.Color;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f1635a = 0;

    static {
        new ThreadLocal();
    }

    public static int a(double d4, double d5, double d6) {
        double d7;
        double d8;
        double d9;
        int min;
        int min2;
        double d10 = (((-0.4986d) * d6) + (((-1.5372d) * d5) + (3.2406d * d4))) / 100.0d;
        double d11 = ((0.0415d * d6) + ((1.8758d * d5) + ((-0.9689d) * d4))) / 100.0d;
        double d12 = ((1.057d * d6) + (((-0.204d) * d5) + (0.0557d * d4))) / 100.0d;
        if (d10 > 0.0031308d) {
            d7 = (Math.pow(d10, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d7 = d10 * 12.92d;
        }
        if (d11 > 0.0031308d) {
            d8 = (Math.pow(d11, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d8 = d11 * 12.92d;
        }
        if (d12 > 0.0031308d) {
            d9 = (Math.pow(d12, 0.4166666666666667d) * 1.055d) - 0.055d;
        } else {
            d9 = 12.92d * d12;
        }
        int round = (int) Math.round(d7 * 255.0d);
        int r8 = 0;
        if (round < 0) {
            min = 0;
        } else {
            min = Math.min(round, 255);
        }
        int round2 = (int) Math.round(d8 * 255.0d);
        if (round2 < 0) {
            min2 = 0;
        } else {
            min2 = Math.min(round2, 255);
        }
        int round3 = (int) Math.round(d9 * 255.0d);
        if (round3 >= 0) {
            r8 = Math.min(round3, 255);
        }
        return Color.rgb(min, min2, r8);
    }

    public static int b(int r6, int r7) {
        int alpha = Color.alpha(r7);
        int alpha2 = Color.alpha(r6);
        int r22 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(r22, c(Color.red(r6), alpha2, Color.red(r7), alpha, r22), c(Color.green(r6), alpha2, Color.green(r7), alpha, r22), c(Color.blue(r6), alpha2, Color.blue(r7), alpha, r22));
    }

    public static int c(int r02, int r12, int r22, int r3, int r4) {
        if (r4 == 0) {
            return 0;
        }
        return (((255 - r12) * (r22 * r3)) + ((r02 * 255) * r12)) / (r4 * 255);
    }
}
