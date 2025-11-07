package N2;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class h implements e, Serializable {

    /* renamed from: J  reason: collision with root package name */
    public final int f1001J;

    public h(int r12) {
        this.f1001J = r12;
    }

    @Override // N2.e
    public final int d() {
        return this.f1001J;
    }

    public final String toString() {
        p.f1008a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        g.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
