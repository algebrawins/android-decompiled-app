package Z2;

/* loaded from: classes.dex */
public final class s implements D2.d, F2.c {

    /* renamed from: J  reason: collision with root package name */
    public final D2.d f1804J;

    /* renamed from: K  reason: collision with root package name */
    public final D2.i f1805K;

    public s(D2.d dVar, D2.i iVar) {
        this.f1804J = dVar;
        this.f1805K = iVar;
    }

    @Override // F2.c
    public final F2.c c() {
        D2.d dVar = this.f1804J;
        if (dVar instanceof F2.c) {
            return (F2.c) dVar;
        }
        return null;
    }

    @Override // D2.d
    public final D2.i e() {
        return this.f1805K;
    }

    @Override // D2.d
    public final void i(Object obj) {
        this.f1804J.i(obj);
    }
}
