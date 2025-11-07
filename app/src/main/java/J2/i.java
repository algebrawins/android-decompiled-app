package j2;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class i implements e {

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f3881a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentLinkedQueue f3882b = new ConcurrentLinkedQueue();

    /* renamed from: c  reason: collision with root package name */
    public final AtomicBoolean f3883c = new AtomicBoolean(false);

    public i(ExecutorService executorService) {
        this.f3881a = executorService;
    }

    @Override // j2.e
    public final void a(c cVar) {
        this.f3882b.add(cVar);
        this.f3881a.execute(new h(this, 0));
    }

    public final void b() {
        ExecutorService executorService = this.f3881a;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f3882b;
        AtomicBoolean atomicBoolean = this.f3883c;
        if (atomicBoolean.compareAndSet(false, true)) {
            try {
                Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                if (runnable != null) {
                    runnable.run();
                }
            } finally {
                atomicBoolean.set(false);
                if (!concurrentLinkedQueue.isEmpty()) {
                    executorService.execute(new h(this, 1));
                }
            }
        }
    }
}
