package x1;

/* loaded from: classes.dex */
public abstract class Z {
    public static D2.g a(D2.g gVar, D2.h hVar) {
        N2.g.e(hVar, "key");
        if (!N2.g.a(gVar.getKey(), hVar)) {
            return null;
        }
        return gVar;
    }

    public static D2.i b(D2.g gVar, D2.h hVar) {
        N2.g.e(hVar, "key");
        if (N2.g.a(gVar.getKey(), hVar)) {
            return D2.j.f492J;
        }
        return gVar;
    }
}
