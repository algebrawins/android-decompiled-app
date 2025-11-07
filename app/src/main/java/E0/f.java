package E0;

import android.animation.TypeEvaluator;
import x1.AbstractC0739x0;

/* loaded from: classes.dex */
public final class f implements TypeEvaluator {

    /* renamed from: a  reason: collision with root package name */
    public Y.d[] f533a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f2, Object obj, Object obj2) {
        Y.d[] dVarArr = (Y.d[]) obj;
        Y.d[] dVarArr2 = (Y.d[]) obj2;
        if (AbstractC0739x0.a(dVarArr, dVarArr2)) {
            if (!AbstractC0739x0.a(this.f533a, dVarArr)) {
                this.f533a = AbstractC0739x0.d(dVarArr);
            }
            for (int r12 = 0; r12 < dVarArr.length; r12++) {
                Y.d dVar = this.f533a[r12];
                Y.d dVar2 = dVarArr[r12];
                Y.d dVar3 = dVarArr2[r12];
                dVar.getClass();
                dVar.f1641a = dVar2.f1641a;
                int r5 = 0;
                while (true) {
                    float[] fArr = dVar2.f1642b;
                    if (r5 < fArr.length) {
                        dVar.f1642b[r5] = (dVar3.f1642b[r5] * f2) + ((1.0f - f2) * fArr[r5]);
                        r5++;
                    }
                }
            }
            return this.f533a;
        }
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
}
