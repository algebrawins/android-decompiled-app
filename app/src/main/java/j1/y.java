package j1;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import h1.C0283c;
import h2.J;

/* loaded from: classes.dex */
public final class y extends s {

    /* renamed from: b  reason: collision with root package name */
    public final C1.g f3854b;

    public y(g gVar, C1.g gVar2) {
        super(4);
        this.f3854b = gVar2;
    }

    @Override // j1.s
    public final boolean a(m mVar) {
        w wVar = (w) mVar.f3820q.get(null);
        return false;
    }

    @Override // j1.s
    public final C0283c[] b(m mVar) {
        w wVar = (w) mVar.f3820q.get(null);
        return null;
    }

    @Override // j1.s
    public final void c(Status status) {
        this.f3854b.a(new i1.d(status));
    }

    @Override // j1.s
    public final void d(RuntimeException runtimeException) {
        this.f3854b.a(runtimeException);
    }

    @Override // j1.s
    public final void e(m mVar) {
        try {
            h(mVar);
        } catch (DeadObjectException e4) {
            c(s.g(e4));
            throw e4;
        } catch (RemoteException e5) {
            c(s.g(e5));
        } catch (RuntimeException e6) {
            this.f3854b.a(e6);
        }
    }

    public final void h(m mVar) {
        w wVar = (w) mVar.f3820q.remove(null);
        C1.g gVar = this.f3854b;
        gVar.f239a.j(Boolean.FALSE);
    }

    @Override // j1.s
    public final /* bridge */ /* synthetic */ void f(J j3, boolean z3) {
    }
}
