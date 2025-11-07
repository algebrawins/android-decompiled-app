package G;

import android.os.Handler;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class e extends AbstractExecutorService implements ScheduledExecutorService {

    /* renamed from: J  reason: collision with root package name */
    public final Handler f672J;

    static {
        new b(0);
    }

    public e(Handler handler) {
        this.f672J = handler;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j3, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(e.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Handler handler = this.f672J;
        if (handler.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(handler + " is shutting down");
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j3, TimeUnit timeUnit) {
        return schedule(new c(0, runnable), j3, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j3, long j4, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(e.class.getSimpleName().concat(" does not yet support fixed-rate scheduling."));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j3, long j4, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(e.class.getSimpleName().concat(" does not yet support fixed-delay scheduling."));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException(e.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException(e.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [H.h, java.util.concurrent.ScheduledFuture] */
    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j3, TimeUnit timeUnit) {
        long convert = TimeUnit.MILLISECONDS.convert(j3, timeUnit) + SystemClock.uptimeMillis();
        Handler handler = this.f672J;
        d dVar = new d(handler, convert, callable);
        if (handler.postAtTime(dVar, convert)) {
            return dVar;
        }
        return new H.h(1, new RejectedExecutionException(handler + " is shutting down"));
    }
}
