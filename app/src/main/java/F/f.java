package F;

import D.C;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Size;
import x1.AbstractC0624h4;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final RectF f603a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    public static Matrix a(RectF rectF, RectF rectF2, int r5, boolean z3) {
        Matrix matrix = new Matrix();
        RectF rectF3 = f603a;
        Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
        matrix.setRectToRect(rectF, rectF3, scaleToFit);
        matrix.postRotate(r5);
        if (z3) {
            matrix.postScale(-1.0f, 1.0f);
        }
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF3, rectF2, scaleToFit);
        matrix.postConcat(matrix2);
        return matrix;
    }

    public static Size b(Size size, int r4) {
        boolean z3;
        if (r4 % 90 == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0624h4.a("Invalid rotation degrees: " + r4, z3);
        int r42 = ((r4 % 360) + 360) % 360;
        if (r42 != 90 && r42 != 270) {
            if (r42 != 0 && r42 != 180) {
                throw new IllegalArgumentException(C.w("Invalid rotation degrees: ", r42));
            }
            return size;
        }
        return new Size(size.getHeight(), size.getWidth());
    }
}
