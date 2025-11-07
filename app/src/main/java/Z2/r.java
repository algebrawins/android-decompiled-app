package Z2;

/* loaded from: classes.dex */
public final class r implements Y2.e {

    /* renamed from: J  reason: collision with root package name */
    public final X2.q f1803J;

    public r(X2.q qVar) {
        this.f1803J = qVar;
    }

    @Override // Y2.e
    public final Object b(Object obj, D2.d dVar) {
        Object d4 = ((X2.p) this.f1803J).f1633M.d(dVar, obj);
        if (d4 == E2.a.COROUTINE_SUSPENDED) {
            return d4;
        }
        return B2.i.f210a;
    }
}
