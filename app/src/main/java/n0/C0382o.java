package n0;

/* renamed from: n0.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0382o extends F2.g implements M2.p {

    /* renamed from: N  reason: collision with root package name */
    public /* synthetic */ Object f4305N;

    /* JADX WARN: Type inference failed for: r0v0, types: [n0.o, F2.g, D2.d] */
    @Override // F2.b
    public final D2.d f(D2.d dVar, Object obj) {
        ?? gVar = new F2.g(2, dVar);
        gVar.f4305N = obj;
        return gVar;
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        return ((C0382o) f((D2.d) obj2, (Y) obj)).k(B2.i.f210a);
    }

    @Override // F2.b
    public final Object k(Object obj) {
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        P1.a.b(obj);
        return Boolean.valueOf(!(((Y) this.f4305N) instanceof O));
    }
}
