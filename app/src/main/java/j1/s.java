package j1;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import h1.C0283c;
import h2.J;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    public final int f3838a;

    public s(int r12) {
        this.f3838a = r12;
    }

    public static /* bridge */ /* synthetic */ Status g(RemoteException remoteException) {
        return new Status(remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), 19);
    }

    public abstract boolean a(m mVar);

    public abstract C0283c[] b(m mVar);

    public abstract void c(Status status);

    public abstract void d(RuntimeException runtimeException);

    public abstract void e(m mVar);

    public abstract void f(J j3, boolean z3);
}
