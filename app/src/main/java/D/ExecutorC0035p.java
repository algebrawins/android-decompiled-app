package D;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p.t0;

/* renamed from: D.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0035p implements Executor {

    /* renamed from: L  reason: collision with root package name */
    public static final ThreadFactoryC0034o f436L = new ThreadFactoryC0034o(0);

    /* renamed from: J  reason: collision with root package name */
    public final Object f437J = new Object();

    /* renamed from: K  reason: collision with root package name */
    public ThreadPoolExecutor f438K;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.concurrent.RejectedExecutionHandler, java.lang.Object] */
    public ExecutorC0035p() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f436L);
        threadPoolExecutor.setRejectedExecutionHandler(new Object());
        this.f438K = threadPoolExecutor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.concurrent.RejectedExecutionHandler, java.lang.Object] */
    public final void a(t0 t0Var) {
        ThreadPoolExecutor threadPoolExecutor;
        t0Var.getClass();
        synchronized (this.f437J) {
            try {
                if (this.f438K.isShutdown()) {
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f436L);
                    threadPoolExecutor2.setRejectedExecutionHandler(new Object());
                    this.f438K = threadPoolExecutor2;
                }
                threadPoolExecutor = this.f438K;
            } catch (Throwable th) {
                throw th;
            }
        }
        int max = Math.max(1, new LinkedHashSet((ArrayList) t0Var.f4722e).size());
        threadPoolExecutor.setMaximumPoolSize(max);
        threadPoolExecutor.setCorePoolSize(max);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f437J) {
            this.f438K.execute(runnable);
        }
    }
}
