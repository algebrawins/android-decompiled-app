package n0;

/* loaded from: classes.dex */
public final class W extends F2.g implements M2.p {
    @Override // F2.b
    public final D2.d f(D2.d dVar, Object obj) {
        return new F2.g(2, dVar);
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        D2.d dVar = (D2.d) obj2;
        B2.i iVar = B2.i.f210a;
        ((W) f(dVar, (Y2.e) obj)).k(iVar);
        return iVar;
    }

    @Override // F2.b
    public final Object k(Object obj) {
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        P1.a.b(obj);
        return B2.i.f210a;
    }
}
