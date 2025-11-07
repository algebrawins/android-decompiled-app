package w1;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class n implements ExecutorService {
    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j3, TimeUnit timeUnit) {
        return ((Q1.h) this).f1076J.awaitTermination(j3, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        return ((Q1.h) this).f1076J.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        return ((Q1.h) this).f1076J.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return ((Q1.h) this).f1076J.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return ((Q1.h) this).f1076J.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        ((Q1.h) this).f1076J.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return ((Q1.h) this).f1076J.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return ((Q1.h) this).f1076J.submit(runnable);
    }

    public final String toString() {
        return ((Q1.h) this).f1076J.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j3, TimeUnit timeUnit) {
        return ((Q1.h) this).f1076J.invokeAll(collection, j3, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j3, TimeUnit timeUnit) {
        return ((Q1.h) this).f1076J.invokeAny(collection, j3, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return ((Q1.h) this).f1076J.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return ((Q1.h) this).f1076J.submit(callable);
    }
}
