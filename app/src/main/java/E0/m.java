package E0;

import x1.AbstractC0739x0;

/* loaded from: classes.dex */
public abstract class m extends l {

    /* renamed from: a  reason: collision with root package name */
    public Y.d[] f556a;

    /* renamed from: b  reason: collision with root package name */
    public String f557b;

    /* renamed from: c  reason: collision with root package name */
    public int f558c;

    public m() {
        this.f556a = null;
        this.f558c = 0;
    }

    public Y.d[] getPathData() {
        return this.f556a;
    }

    public String getPathName() {
        return this.f557b;
    }

    public void setPathData(Y.d[] dVarArr) {
        if (!AbstractC0739x0.a(this.f556a, dVarArr)) {
            this.f556a = AbstractC0739x0.d(dVarArr);
            return;
        }
        Y.d[] dVarArr2 = this.f556a;
        for (int r22 = 0; r22 < dVarArr.length; r22++) {
            dVarArr2[r22].f1641a = dVarArr[r22].f1641a;
            int r3 = 0;
            while (true) {
                float[] fArr = dVarArr[r22].f1642b;
                if (r3 < fArr.length) {
                    dVarArr2[r22].f1642b[r3] = fArr[r3];
                    r3++;
                }
            }
        }
    }

    public m(m mVar) {
        this.f556a = null;
        this.f558c = 0;
        this.f557b = mVar.f557b;
        this.f556a = AbstractC0739x0.d(mVar.f556a);
    }
}
