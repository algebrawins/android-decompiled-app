package V2;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public final class L extends K implements A {

    /* renamed from: L  reason: collision with root package name */
    public final Executor f1401L;

    public L(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        this.f1401L = executor;
        Method method2 = a3.c.f1850a;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor != null && (method = a3.c.f1850a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ExecutorService executorService;
        Executor executor = this.f1401L;
        if (executor instanceof ExecutorService) {
            executorService = (ExecutorService) executor;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof L) && ((L) obj).f1401L == this.f1401L) {
            return true;
        }
        return false;
    }

    @Override // V2.AbstractC0061s
    public final void h(D2.i iVar, Runnable runnable) {
        try {
            this.f1401L.execute(runnable);
        } catch (RejectedExecutionException e4) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e4);
            S s3 = (S) iVar.f(C0062t.f1462K);
            if (s3 != null) {
                s3.a(cancellationException);
            }
            D.f1391b.h(iVar, runnable);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f1401L);
    }

    @Override // V2.AbstractC0061s
    public final String toString() {
        return this.f1401L.toString();
    }
}
