package F;

import android.graphics.RectF;
import android.util.Rational;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class a implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final RectF f595a;

    /* renamed from: b  reason: collision with root package name */
    public final Rational f596b;

    public a(Rational rational, Rational rational2) {
        this.f596b = rational2 == null ? new Rational(4, 3) : rational2;
        this.f595a = b(rational);
    }

    public static float a(RectF rectF, RectF rectF2) {
        float width;
        float height;
        if (rectF.width() < rectF2.width()) {
            width = rectF.width();
        } else {
            width = rectF2.width();
        }
        if (rectF.height() < rectF2.height()) {
            height = rectF.height();
        } else {
            height = rectF2.height();
        }
        return width * height;
    }

    public final RectF b(Rational rational) {
        float floatValue = rational.floatValue();
        Rational rational2 = this.f596b;
        if (floatValue == rational2.floatValue()) {
            return new RectF(0.0f, 0.0f, rational2.getNumerator(), rational2.getDenominator());
        }
        if (rational.floatValue() > rational2.floatValue()) {
            return new RectF(0.0f, 0.0f, rational2.getNumerator(), (rational.getDenominator() * rational2.getNumerator()) / rational.getNumerator());
        }
        return new RectF(0.0f, 0.0f, (rational.getNumerator() * rational2.getDenominator()) / rational.getDenominator(), rational2.getDenominator());
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        boolean z3;
        Rational rational = (Rational) obj;
        Rational rational2 = (Rational) obj2;
        boolean z4 = false;
        if (rational.equals(rational2)) {
            return 0;
        }
        RectF b3 = b(rational);
        RectF b4 = b(rational2);
        RectF rectF = this.f595a;
        if (b3.width() >= rectF.width() && b3.height() >= rectF.height()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (b4.width() >= rectF.width() && b4.height() >= rectF.height()) {
            z4 = true;
        }
        if (z3 && z4) {
            return (int) Math.signum((b3.height() * b3.width()) - (b4.height() * b4.width()));
        } else if (z3) {
            return -1;
        } else {
            if (z4) {
                return 1;
            }
            return -((int) Math.signum(a(b3, rectF) - a(b4, rectF)));
        }
    }
}
