package x1;

import V2.AbstractC0066x;
import V2.C0057n;

/* renamed from: x1.e4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0600e4 {
    public static final Object a(a3.t tVar, a3.t tVar2, M2.p pVar) {
        Object c0057n;
        Object L3;
        try {
            N2.r.a(2, pVar);
            c0057n = pVar.g(tVar2, tVar);
        } catch (Throwable th) {
            c0057n = new C0057n(th, false);
        }
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        if (c0057n != aVar && (L3 = tVar.L(c0057n)) != AbstractC0066x.f1467d) {
            if (!(L3 instanceof C0057n)) {
                return AbstractC0066x.l(L3);
            }
            throw ((C0057n) L3).f1450a;
        }
        return aVar;
    }
}
