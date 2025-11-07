package H;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import x1.AbstractC0636k0;

/* loaded from: classes.dex */
public final class b extends d implements Runnable {

    /* renamed from: L  reason: collision with root package name */
    public a f691L;

    /* renamed from: M  reason: collision with root package name */
    public final LinkedBlockingQueue f692M = new LinkedBlockingQueue(1);

    /* renamed from: N  reason: collision with root package name */
    public final CountDownLatch f693N = new CountDownLatch(1);

    /* renamed from: O  reason: collision with root package name */
    public E1.a f694O;

    /* renamed from: P  reason: collision with root package name */
    public volatile E1.a f695P;

    public b(a aVar, E1.a aVar2) {
        this.f691L = aVar;
        aVar2.getClass();
        this.f694O = aVar2;
    }

    public static Object c(LinkedBlockingQueue linkedBlockingQueue) {
        Object take;
        boolean z3 = false;
        while (true) {
            try {
                take = linkedBlockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z3 = true;
            } catch (Throwable th) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        return take;
    }

    @Override // H.d, java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        boolean z4 = false;
        if (!this.f696J.cancel(z3)) {
            return false;
        }
        while (true) {
            try {
                this.f692M.put(Boolean.valueOf(z3));
                break;
            } catch (InterruptedException unused) {
                z4 = true;
            } catch (Throwable th) {
                if (z4) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
        E1.a aVar = this.f694O;
        if (aVar != null) {
            aVar.cancel(z3);
        }
        E1.a aVar2 = this.f695P;
        if (aVar2 != null) {
            aVar2.cancel(z3);
        }
        return true;
    }

    @Override // H.d, java.util.concurrent.Future
    public final Object get() {
        if (!this.f696J.isDone()) {
            E1.a aVar = this.f694O;
            if (aVar != null) {
                aVar.get();
            }
            this.f693N.await();
            E1.a aVar2 = this.f695P;
            if (aVar2 != null) {
                aVar2.get();
            }
        }
        return this.f696J.get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [H.a, E1.a] */
    @Override // java.lang.Runnable
    public final void run() {
        E1.a apply;
        try {
        } catch (UndeclaredThrowableException e4) {
            Throwable cause = e4.getCause();
            S.i iVar = this.f697K;
            if (iVar != null) {
                iVar.b(cause);
            }
        }
        try {
            try {
                try {
                    try {
                        apply = this.f691L.apply(f.b(this.f694O));
                        this.f695P = apply;
                    } catch (CancellationException unused) {
                        cancel(false);
                    } catch (ExecutionException e5) {
                        Throwable cause2 = e5.getCause();
                        S.i iVar2 = this.f697K;
                        if (iVar2 != null) {
                            iVar2.b(cause2);
                        }
                    }
                } catch (Error e6) {
                    S.i iVar3 = this.f697K;
                    if (iVar3 != null) {
                        iVar3.b(e6);
                    }
                }
            } catch (Exception e7) {
                S.i iVar4 = this.f697K;
                if (iVar4 != null) {
                    iVar4.b(e7);
                }
            }
            if (this.f696J.isCancelled()) {
                apply.cancel(((Boolean) c(this.f692M)).booleanValue());
                this.f695P = null;
                return;
            }
            apply.a(new e(this, apply, 7, false), AbstractC0636k0.a());
        } finally {
            this.f691L = null;
            this.f694O = null;
            this.f693N.countDown();
        }
    }

    @Override // H.d, java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) {
        if (!this.f696J.isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j3 = timeUnit2.convert(j3, timeUnit);
                timeUnit = timeUnit2;
            }
            E1.a aVar = this.f694O;
            if (aVar != null) {
                long nanoTime = System.nanoTime();
                aVar.get(j3, timeUnit);
                j3 -= Math.max(0L, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (this.f693N.await(j3, timeUnit)) {
                j3 -= Math.max(0L, System.nanoTime() - nanoTime2);
                E1.a aVar2 = this.f695P;
                if (aVar2 != null) {
                    aVar2.get(j3, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return this.f696J.get(j3, timeUnit);
    }
}
