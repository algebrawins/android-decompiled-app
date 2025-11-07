package V2;

import x1.AbstractC0564a0;

/* renamed from: V2.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0055l extends b0 implements InterfaceC0054k {
    public final Object U(F2.g gVar) {
        Object l3;
        while (true) {
            Object E3 = E();
            if (!(E3 instanceof N)) {
                if (!(E3 instanceof C0057n)) {
                    l3 = AbstractC0066x.l(E3);
                } else {
                    throw ((C0057n) E3).f1450a;
                }
            } else if (R(E3) >= 0) {
                X x3 = new X(AbstractC0564a0.a(gVar), this);
                x3.v();
                x3.x(new F(I(false, true, new Q(1, x3))));
                l3 = x3.u();
                E2.a aVar = E2.a.COROUTINE_SUSPENDED;
                break;
            }
        }
        E2.a aVar2 = E2.a.COROUTINE_SUSPENDED;
        return l3;
    }
}
