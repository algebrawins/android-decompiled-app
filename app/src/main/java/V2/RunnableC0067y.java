package V2;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: V2.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0067y extends I implements Runnable {

    /* renamed from: S  reason: collision with root package name */
    public static final RunnableC0067y f1472S;

    /* renamed from: T  reason: collision with root package name */
    public static final long f1473T;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX WARN: Type inference failed for: r0v0, types: [V2.I, V2.y, V2.J] */
    static {
        Long l3;
        ?? r02 = new I();
        f1472S = r02;
        r02.p(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l3 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l3 = 1000L;
        }
        f1473T = timeUnit.toNanos(l3.longValue());
    }

    @Override // V2.J
    public final Thread o() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        boolean z4;
        boolean u3;
        k0.f1441a.set(this);
        try {
            synchronized (this) {
                int r02 = debugStatus;
                if (r02 != 2 && r02 != 3) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    if (!u3) {
                        return;
                    }
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j3 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long q3 = q();
                    if (q3 == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j3 == Long.MAX_VALUE) {
                            j3 = f1473T + nanoTime;
                        }
                        long j4 = j3 - nanoTime;
                        if (j4 <= 0) {
                            _thread = null;
                            v();
                            if (!u()) {
                                o();
                                return;
                            }
                            return;
                        } else if (q3 > j4) {
                            q3 = j4;
                        }
                    } else {
                        j3 = Long.MAX_VALUE;
                    }
                    if (q3 > 0) {
                        int r03 = debugStatus;
                        if (r03 != 2 && r03 != 3) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (z4) {
                            _thread = null;
                            v();
                            if (!u()) {
                                o();
                                return;
                            }
                            return;
                        }
                        LockSupport.parkNanos(this, q3);
                    }
                }
            }
        } finally {
            _thread = null;
            v();
            if (!u()) {
                o();
            }
        }
    }

    @Override // V2.I
    public final void s(Runnable runnable) {
        if (debugStatus != 4) {
            super.s(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // V2.I, V2.J
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    public final synchronized void v() {
        boolean z3;
        int r02 = debugStatus;
        if (r02 != 2 && r02 != 3) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z3) {
            return;
        }
        debugStatus = 3;
        I.f1394P.set(this, null);
        I.f1395Q.set(this, null);
        notifyAll();
    }
}
