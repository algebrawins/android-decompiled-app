package j1;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import h1.C0283c;
import h2.D;
import h2.J;
import java.util.Map;

/* loaded from: classes.dex */
public final class x extends s {

    /* renamed from: b  reason: collision with root package name */
    public final D f3851b;

    /* renamed from: c  reason: collision with root package name */
    public final C1.g f3852c;

    /* renamed from: d  reason: collision with root package name */
    public final O1.a f3853d;

    public x(int r12, D d4, C1.g gVar, O1.a aVar) {
        super(r12);
        this.f3852c = gVar;
        this.f3851b = d4;
        this.f3853d = aVar;
        if (r12 == 2 && d4.f3290b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // j1.s
    public final boolean a(m mVar) {
        return this.f3851b.f3290b;
    }

    @Override // j1.s
    public final C0283c[] b(m mVar) {
        return (C0283c[]) this.f3851b.f3292d;
    }

    @Override // j1.s
    public final void c(Status status) {
        i1.d dVar;
        this.f3853d.getClass();
        if (status.f2729d != null) {
            dVar = new i1.d(status);
        } else {
            dVar = new i1.d(status);
        }
        this.f3852c.a(dVar);
    }

    @Override // j1.s
    public final void d(RuntimeException runtimeException) {
        this.f3852c.a(runtimeException);
    }

    @Override // j1.s
    public final void e(m mVar) {
        C1.g gVar = this.f3852c;
        try {
            D d4 = this.f3851b;
            ((i) ((D) d4.f3293e).f3292d).j(mVar.f3816m, gVar);
        } catch (DeadObjectException e4) {
            throw e4;
        } catch (RemoteException e5) {
            c(s.g(e5));
        } catch (RuntimeException e6) {
            gVar.a(e6);
        }
    }

    @Override // j1.s
    public final void f(J j3, boolean z3) {
        Boolean valueOf = Boolean.valueOf(z3);
        C1.g gVar = this.f3852c;
        ((Map) j3.f3304L).put(gVar, valueOf);
        J j4 = new J(3, j3, gVar);
        C1.j jVar = gVar.f239a;
        jVar.getClass();
        jVar.f247b.g(new C1.i(C1.h.f240a, j4));
        jVar.l();
    }
}
