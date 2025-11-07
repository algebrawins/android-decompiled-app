package S;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class l implements E1.a {

    /* renamed from: J  reason: collision with root package name */
    public final WeakReference f1192J;

    /* renamed from: K  reason: collision with root package name */
    public final k f1193K = new k(this);

    public l(i iVar) {
        this.f1192J = new WeakReference(iVar);
    }

    @Override // E1.a
    public final void a(Runnable runnable, Executor executor) {
        this.f1193K.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        i iVar = (i) this.f1192J.get();
        boolean cancel = this.f1193K.cancel(z3);
        if (cancel && iVar != null) {
            iVar.f1187a = null;
            iVar.f1188b = null;
            iVar.f1189c.j(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f1193K.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f1193K.f1184J instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f1193K.isDone();
    }

    public final String toString() {
        return this.f1193K.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) {
        return this.f1193K.get(j3, timeUnit);
    }
}
