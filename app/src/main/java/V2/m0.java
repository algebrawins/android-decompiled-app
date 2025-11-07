package V2;

/* loaded from: classes.dex */
public final class m0 extends a3.t {

    /* renamed from: N  reason: collision with root package name */
    public final ThreadLocal f1448N;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public m0(D2.i r3, F2.g r4) {
        /*
            r2 = this;
            V2.n0 r0 = V2.n0.f1451J
            D2.g r1 = r3.f(r0)
            if (r1 != 0) goto Ld
            D2.i r0 = r3.k(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r4, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f1448N = r0
            D2.i r4 = r4.f655K
            N2.g.b(r4)
            D2.e r0 = D2.e.f491J
            D2.g r4 = r4.f(r0)
            boolean r4 = r4 instanceof V2.AbstractC0061s
            if (r4 != 0) goto L32
            r4 = 0
            java.lang.Object r4 = a3.a.m(r3, r4)
            a3.a.g(r3, r4)
            r2.Y(r3, r4)
        L32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V2.m0.<init>(D2.i, F2.g):void");
    }

    public final boolean X() {
        boolean z3;
        if (this.threadLocalIsSet && this.f1448N.get() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f1448N.remove();
        return !z3;
    }

    public final void Y(D2.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f1448N.set(new B2.c(iVar, obj));
    }

    @Override // a3.t, V2.b0
    public final void r(Object obj) {
        if (this.threadLocalIsSet) {
            B2.c cVar = (B2.c) this.f1448N.get();
            if (cVar != null) {
                a3.a.g((D2.i) cVar.f200J, cVar.f201K);
            }
            this.f1448N.remove();
        }
        Object h3 = AbstractC0066x.h(obj);
        D2.d dVar = this.f1882M;
        D2.i e4 = dVar.e();
        m0 m0Var = null;
        Object m3 = a3.a.m(e4, null);
        if (m3 != a3.a.f1848f) {
            m0Var = AbstractC0066x.m(dVar, e4, m3);
        }
        try {
            this.f1882M.i(h3);
        } finally {
            if (m0Var == null || m0Var.X()) {
                a3.a.g(e4, m3);
            }
        }
    }
}
