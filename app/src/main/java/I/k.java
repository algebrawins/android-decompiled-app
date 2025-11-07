package I;

import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.J;
import androidx.camera.core.impl.r;
import x1.AbstractC0572b0;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final int f776a;

    /* renamed from: b  reason: collision with root package name */
    public final int f777b;

    /* renamed from: c  reason: collision with root package name */
    public final Rational f778c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f779d;

    public k(r rVar, Rational rational) {
        this.f776a = rVar.a();
        this.f777b = rVar.b();
        this.f778c = rational;
        boolean z3 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z3 = false;
        }
        this.f779d = z3;
    }

    public final Size a(J j3) {
        int j4 = j3.j();
        Size k3 = j3.k();
        if (k3 != null) {
            int b3 = AbstractC0572b0.b(j4);
            boolean z3 = true;
            if (1 != this.f777b) {
                z3 = false;
            }
            int a4 = AbstractC0572b0.a(b3, this.f776a, z3);
            if (a4 == 90 || a4 == 270) {
                return new Size(k3.getHeight(), k3.getWidth());
            }
            return k3;
        }
        return k3;
    }
}
