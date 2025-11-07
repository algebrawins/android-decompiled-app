package F;

import android.util.Rational;
import android.util.Size;
import x1.AbstractC0624h4;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Rational f597a = new Rational(4, 3);

    /* renamed from: b  reason: collision with root package name */
    public static final Rational f598b = new Rational(3, 4);

    /* renamed from: c  reason: collision with root package name */
    public static final Rational f599c = new Rational(16, 9);

    /* renamed from: d  reason: collision with root package name */
    public static final Rational f600d = new Rational(9, 16);

    public static boolean a(Size size, Rational rational) {
        Size size2 = M.a.f852b;
        if (rational == null) {
            return false;
        }
        if (!rational.equals(new Rational(size.getWidth(), size.getHeight()))) {
            if (size.getHeight() * size.getWidth() < M.a.a(size2)) {
                return false;
            }
            int width = size.getWidth();
            int height = size.getHeight();
            Rational rational2 = new Rational(rational.getDenominator(), rational.getNumerator());
            int r4 = width % 16;
            if (r4 == 0 && height % 16 == 0) {
                if (!b(Math.max(0, height - 16), width, rational) && !b(Math.max(0, width - 16), height, rational2)) {
                    return false;
                }
            } else if (r4 == 0) {
                return b(height, width, rational);
            } else {
                if (height % 16 != 0) {
                    return false;
                }
                return b(width, height, rational2);
            }
        }
        return true;
    }

    public static boolean b(int r7, int r8, Rational rational) {
        boolean z3;
        if (r8 % 16 == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0624h4.b(z3);
        double numerator = (rational.getNumerator() * r7) / rational.getDenominator();
        if (numerator > Math.max(0, r8 - 16) && numerator < r8 + 16) {
            return true;
        }
        return false;
    }
}
