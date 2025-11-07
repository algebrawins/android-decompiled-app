package a3;

import V2.A;
import V2.AbstractC0061s;
import V2.AbstractC0068z;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class i extends AbstractC0061s implements A {

    /* renamed from: P  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1861P = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers");

    /* renamed from: L  reason: collision with root package name */
    public final c3.n f1862L;

    /* renamed from: M  reason: collision with root package name */
    public final int f1863M;

    /* renamed from: N  reason: collision with root package name */
    public final l f1864N;

    /* renamed from: O  reason: collision with root package name */
    public final Object f1865O;
    private volatile int runningWorkers;

    public i(c3.n nVar, int r22) {
        A a4;
        this.f1862L = nVar;
        this.f1863M = r22;
        if (nVar instanceof A) {
            a4 = (A) nVar;
        } else {
            a4 = null;
        }
        if (a4 == null) {
            int r12 = AbstractC0068z.f1474a;
        }
        this.f1864N = new l();
        this.f1865O = new Object();
    }

    @Override // V2.AbstractC0061s
    public final void h(D2.i iVar, Runnable runnable) {
        this.f1864N.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1861P;
        if (atomicIntegerFieldUpdater.get(this) < this.f1863M) {
            synchronized (this.f1865O) {
                if (atomicIntegerFieldUpdater.get(this) < this.f1863M) {
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                    Runnable m3 = m();
                    if (m3 != null) {
                        this.f1862L.h(this, new H.e(this, m3, 13, false));
                    }
                }
            }
        }
    }

    public final Runnable m() {
        while (true) {
            Runnable runnable = (Runnable) this.f1864N.d();
            if (runnable == null) {
                synchronized (this.f1865O) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1861P;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.f1864N.c() == 0) {
                        return null;
                    }
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                }
            } else {
                return runnable;
            }
        }
    }
}
