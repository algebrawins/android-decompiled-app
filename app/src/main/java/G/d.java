package G;

import A0.C0001b;
import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import x1.AbstractC0699s0;

/* loaded from: classes.dex */
public final class d implements RunnableScheduledFuture {

    /* renamed from: J  reason: collision with root package name */
    public final AtomicReference f668J = new AtomicReference(null);

    /* renamed from: K  reason: collision with root package name */
    public final long f669K;

    /* renamed from: L  reason: collision with root package name */
    public final Callable f670L;

    /* renamed from: M  reason: collision with root package name */
    public final S.l f671M;

    public d(Handler handler, long j3, Callable callable) {
        this.f669K = j3;
        this.f670L = callable;
        this.f671M = AbstractC0699s0.a(new C0001b(this, handler, callable));
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        return this.f671M.cancel(z3);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f671M.f1193K.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.f669K - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f671M.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f671M.f1193K.isDone();
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public final boolean isPeriodic() {
        return false;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        S.i iVar = (S.i) this.f668J.getAndSet(null);
        if (iVar != null) {
            try {
                iVar.a(this.f670L.call());
            } catch (Exception e4) {
                iVar.b(e4);
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) {
        return this.f671M.f1193K.get(j3, timeUnit);
    }
}
