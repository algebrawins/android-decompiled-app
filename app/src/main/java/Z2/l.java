package Z2;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a */
    public static final U1.b f1793a = new U1.b("NULL", 1);

    public static /* synthetic */ Y2.d a(j jVar, W2.c cVar, int r3, X2.a aVar, int r5) {
        D2.j jVar2 = cVar;
        if ((r5 & 1) != 0) {
            jVar2 = D2.j.f492J;
        }
        if ((r5 & 2) != 0) {
            r3 = -3;
        }
        if ((r5 & 4) != 0) {
            aVar = X2.a.SUSPEND;
        }
        return jVar.s(jVar2, r3, aVar);
    }

    public static final Object b(D2.i iVar, Object obj, Object obj2, M2.p pVar, D2.d dVar) {
        Object m3 = a3.a.m(iVar, obj2);
        try {
            s sVar = new s(dVar, iVar);
            N2.r.a(2, pVar);
            Object g = pVar.g(obj, sVar);
            a3.a.g(iVar, m3);
            if (g == E2.a.COROUTINE_SUSPENDED) {
                N2.g.e(dVar, "frame");
            }
            return g;
        } catch (Throwable th) {
            a3.a.g(iVar, m3);
            throw th;
        }
    }
}
