package n0;

/* renamed from: n0.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0373f extends F2.g implements M2.l {

    /* renamed from: N  reason: collision with root package name */
    public int f4269N;

    @Override // M2.l
    public final Object h(Object obj) {
        F2.g gVar = new F2.g(1, (D2.d) obj);
        B2.i iVar = B2.i.f210a;
        gVar.k(iVar);
        return iVar;
    }

    @Override // F2.b
    public final Object k(Object obj) {
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        int r02 = this.f4269N;
        if (r02 != 0) {
            if (r02 == 1) {
                P1.a.b(obj);
                return B2.i.f210a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        P1.a.b(obj);
        this.f4269N = 1;
        throw null;
    }
}
