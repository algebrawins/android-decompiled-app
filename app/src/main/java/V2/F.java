package V2;

/* loaded from: classes.dex */
public final class F implements f0, M2.l {

    /* renamed from: J  reason: collision with root package name */
    public final E f1392J;

    public F(E e4) {
        this.f1392J = e4;
    }

    public final void b(Throwable th) {
        this.f1392J.c();
    }

    @Override // M2.l
    public final /* bridge */ /* synthetic */ Object h(Object obj) {
        b((Throwable) obj);
        return B2.i.f210a;
    }

    public final String toString() {
        return "DisposeOnCancel[" + this.f1392J + ']';
    }
}
