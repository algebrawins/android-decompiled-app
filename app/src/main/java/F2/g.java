package F2;

import N2.p;

/* loaded from: classes.dex */
public abstract class g extends b implements N2.e {

    /* renamed from: M  reason: collision with root package name */
    public final int f662M;

    public g(int r12, D2.d dVar) {
        super(dVar);
        this.f662M = r12;
    }

    @Override // N2.e
    public final int d() {
        return this.f662M;
    }

    @Override // F2.b
    public final String toString() {
        if (this.f654J == null) {
            p.f1008a.getClass();
            String obj = getClass().getGenericInterfaces()[0].toString();
            if (obj.startsWith("kotlin.jvm.functions.")) {
                obj = obj.substring(21);
            }
            N2.g.d(obj, "renderLambdaToString(...)");
            return obj;
        }
        return super.toString();
    }
}
