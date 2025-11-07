package V2;

/* loaded from: classes.dex */
public final class Y extends W {

    /* renamed from: N  reason: collision with root package name */
    public final b0 f1412N;

    /* renamed from: O  reason: collision with root package name */
    public final Z f1413O;

    /* renamed from: P  reason: collision with root package name */
    public final C0053j f1414P;

    /* renamed from: Q  reason: collision with root package name */
    public final Object f1415Q;

    public Y(b0 b0Var, Z z3, C0053j c0053j, Object obj) {
        this.f1412N = b0Var;
        this.f1413O = z3;
        this.f1414P = c0053j;
        this.f1415Q = obj;
    }

    @Override // M2.l
    public final /* bridge */ /* synthetic */ Object h(Object obj) {
        o((Throwable) obj);
        return B2.i.f210a;
    }

    @Override // V2.W
    public final void o(Throwable th) {
        C0053j c0053j = this.f1414P;
        b0 b0Var = this.f1412N;
        b0Var.getClass();
        C0053j M3 = b0.M(c0053j);
        Z z3 = this.f1413O;
        Object obj = this.f1415Q;
        if (M3 != null) {
            while (AbstractC0066x.e(M3.f1440N, false, new Y(b0Var, z3, M3, obj), 1) == e0.f1432J) {
                M3 = b0.M(M3);
                if (M3 == null) {
                    b0Var.q(b0Var.z(z3, obj));
                }
            }
            return;
        }
        b0Var.q(b0Var.z(z3, obj));
    }
}
