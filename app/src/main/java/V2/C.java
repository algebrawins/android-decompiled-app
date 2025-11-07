package V2;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public abstract class C extends c3.j {

    /* renamed from: L  reason: collision with root package name */
    public int f1389L;

    public C(int r4) {
        super(0L, c3.m.g);
        this.f1389L = r4;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract D2.d d();

    public Throwable f(Object obj) {
        C0057n c0057n;
        if (obj instanceof C0057n) {
            c0057n = (C0057n) obj;
        } else {
            c0057n = null;
        }
        if (c0057n == null) {
            return null;
        }
        return c0057n.f1450a;
    }

    public final void h(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            G.i.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        N2.g.b(th);
        AbstractC0066x.d(d().e(), new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() {
        m0 m0Var;
        S s3;
        Object obj = B2.i.f210a;
        c3.k kVar = this.f2692K;
        try {
            D2.d d4 = d();
            N2.g.c(d4, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            a3.h hVar = (a3.h) d4;
            F2.b bVar = hVar.f1858N;
            Object obj2 = hVar.f1860P;
            D2.i e4 = bVar.e();
            Object m3 = a3.a.m(e4, obj2);
            if (m3 != a3.a.f1848f) {
                m0Var = AbstractC0066x.m(bVar, e4, m3);
            } else {
                m0Var = null;
            }
            D2.i e5 = bVar.e();
            Object j3 = j();
            Throwable f2 = f(j3);
            if (f2 == null && AbstractC0066x.f(this.f1389L)) {
                s3 = (S) e5.f(C0062t.f1462K);
            } else {
                s3 = null;
            }
            if (s3 != null && !s3.b()) {
                CancellationException A3 = ((b0) s3).A();
                b(j3, A3);
                bVar.i(P1.a.a(A3));
            } else if (f2 != null) {
                bVar.i(P1.a.a(f2));
            } else {
                bVar.i(g(j3));
            }
            if (m0Var == null || m0Var.X()) {
                a3.a.g(e4, m3);
            }
            try {
                kVar.getClass();
            } catch (Throwable th) {
                obj = P1.a.a(th);
            }
            h(null, B2.e.a(obj));
        } catch (Throwable th2) {
            try {
                kVar.getClass();
            } catch (Throwable th3) {
                obj = P1.a.a(th3);
            }
            h(th2, B2.e.a(obj));
        }
    }

    public Object g(Object obj) {
        return obj;
    }
}
