package V2;

/* loaded from: classes.dex */
public final class X extends C0050f {

    /* renamed from: R  reason: collision with root package name */
    public final C0055l f1411R;

    public X(D2.d dVar, C0055l c0055l) {
        super(1, dVar);
        this.f1411R = c0055l;
    }

    @Override // V2.C0050f
    public final String A() {
        return "AwaitContinuation";
    }

    @Override // V2.C0050f
    public final Throwable t(b0 b0Var) {
        Throwable c4;
        Object E3 = this.f1411R.E();
        if ((E3 instanceof Z) && (c4 = ((Z) E3).c()) != null) {
            return c4;
        }
        if (E3 instanceof C0057n) {
            return ((C0057n) E3).f1450a;
        }
        return b0Var.A();
    }
}
