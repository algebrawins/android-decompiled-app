package H;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import x1.AbstractC0699s0;

/* loaded from: classes.dex */
public class d implements E1.a {

    /* renamed from: J  reason: collision with root package name */
    public final E1.a f696J;

    /* renamed from: K  reason: collision with root package name */
    public S.i f697K;

    public d(E1.a aVar) {
        aVar.getClass();
        this.f696J = aVar;
    }

    public static d b(E1.a aVar) {
        if (aVar instanceof d) {
            return (d) aVar;
        }
        return new d(aVar);
    }

    @Override // E1.a
    public final void a(Runnable runnable, Executor executor) {
        this.f696J.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z3) {
        return this.f696J.cancel(z3);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f696J.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f696J.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f696J.isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j3, TimeUnit timeUnit) {
        return this.f696J.get(j3, timeUnit);
    }

    public d() {
        this.f696J = AbstractC0699s0.a(new A.c(11, this));
    }
}
