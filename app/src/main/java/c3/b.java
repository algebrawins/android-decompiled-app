package c3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class b extends Thread {

    /* renamed from: R  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f2666R = AtomicIntegerFieldUpdater.newUpdater(b.class, "workerCtl");

    /* renamed from: J  reason: collision with root package name */
    public final o f2667J;

    /* renamed from: K  reason: collision with root package name */
    public final N2.o f2668K;

    /* renamed from: L  reason: collision with root package name */
    public c f2669L;

    /* renamed from: M  reason: collision with root package name */
    public long f2670M;

    /* renamed from: N  reason: collision with root package name */
    public long f2671N;

    /* renamed from: O  reason: collision with root package name */
    public int f2672O;

    /* renamed from: P  reason: collision with root package name */
    public boolean f2673P;

    /* renamed from: Q  reason: collision with root package name */
    public final /* synthetic */ d f2674Q;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl;

    /* JADX WARN: Type inference failed for: r1v3, types: [N2.o, java.lang.Object] */
    public b(d dVar, int r22) {
        this.f2674Q = dVar;
        setDaemon(true);
        this.f2667J = new o();
        this.f2668K = new Object();
        this.f2669L = c.DORMANT;
        this.nextParkedWorker = d.f2678T;
        P2.d.f1035J.getClass();
        this.f2672O = P2.d.f1036K.a().nextInt();
        f(r22);
    }

    public final j a(boolean z3) {
        j e4;
        j e5;
        d dVar;
        long j3;
        c cVar = this.f2669L;
        c cVar2 = c.CPU_ACQUIRED;
        j jVar = null;
        o oVar = this.f2667J;
        boolean z4 = true;
        d dVar2 = this.f2674Q;
        if (cVar != cVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = d.f2676R;
            do {
                dVar = this.f2674Q;
                j3 = atomicLongFieldUpdater.get(dVar);
                if (((int) ((9223367638808264704L & j3) >> 42)) == 0) {
                    oVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o.f2703b;
                        j jVar2 = (j) atomicReferenceFieldUpdater.get(oVar);
                        if (jVar2 != null && jVar2.f2692K.f2693J == 1) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(oVar, jVar2, null)) {
                                if (atomicReferenceFieldUpdater.get(oVar) != jVar2) {
                                    break;
                                }
                            }
                            jVar = jVar2;
                            break loop1;
                        }
                    }
                    int r13 = o.f2705d.get(oVar);
                    int r02 = o.f2704c.get(oVar);
                    while (true) {
                        if (r13 != r02 && o.f2706e.get(oVar) != 0) {
                            r02--;
                            j c4 = oVar.c(r02, true);
                            if (c4 != null) {
                                jVar = c4;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (jVar == null) {
                        j jVar3 = (j) dVar2.f2684O.d();
                        if (jVar3 == null) {
                            return i(1);
                        }
                        return jVar3;
                    }
                    return jVar;
                }
            } while (!d.f2676R.compareAndSet(dVar, j3, j3 - 4398046511104L));
            this.f2669L = c.CPU_ACQUIRED;
        }
        if (z3) {
            if (d(dVar2.f2679J * 2) != 0) {
                z4 = false;
            }
            if (!z4 || (e5 = e()) == null) {
                oVar.getClass();
                j jVar4 = (j) o.f2703b.getAndSet(oVar, null);
                if (jVar4 == null) {
                    jVar4 = oVar.b();
                }
                if (jVar4 == null) {
                    if (!z4 && (e4 = e()) != null) {
                        return e4;
                    }
                } else {
                    return jVar4;
                }
            } else {
                return e5;
            }
        } else {
            j e6 = e();
            if (e6 != null) {
                return e6;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int r4) {
        int r02 = this.f2672O;
        int r03 = r02 ^ (r02 << 13);
        int r04 = r03 ^ (r03 >> 17);
        int r05 = r04 ^ (r04 << 5);
        this.f2672O = r05;
        int r12 = r4 - 1;
        if ((r12 & r4) == 0) {
            return r05 & r12;
        }
        return (r05 & Integer.MAX_VALUE) % r4;
    }

    public final j e() {
        int d4 = d(2);
        d dVar = this.f2674Q;
        if (d4 == 0) {
            j jVar = (j) dVar.f2683N.d();
            if (jVar != null) {
                return jVar;
            }
            return (j) dVar.f2684O.d();
        }
        j jVar2 = (j) dVar.f2684O.d();
        if (jVar2 != null) {
            return jVar2;
        }
        return (j) dVar.f2683N.d();
    }

    public final void f(int r3) {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2674Q.f2682M);
        sb.append("-worker-");
        if (r3 == 0) {
            valueOf = "TERMINATED";
        } else {
            valueOf = String.valueOf(r3);
        }
        sb.append(valueOf);
        setName(sb.toString());
        this.indexInArray = r3;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(c cVar) {
        boolean z3;
        c cVar2 = this.f2669L;
        if (cVar2 == c.CPU_ACQUIRED) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            d.f2676R.addAndGet(this.f2674Q, 4398046511104L);
        }
        if (cVar2 != cVar) {
            this.f2669L = cVar;
        }
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
        r19 = r6;
        r6 = -2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final c3.j i(int r24) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.b.i(int):c3.j");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z3;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        boolean z4;
        boolean z5 = false;
        loop0: while (true) {
            boolean z6 = false;
            while (true) {
                d dVar = this.f2674Q;
                dVar.getClass();
                if (d.f2677S.get(dVar) == 0) {
                    c cVar = this.f2669L;
                    c cVar2 = c.TERMINATED;
                    if (cVar == cVar2) {
                        break loop0;
                    }
                    j a4 = a(this.f2673P);
                    long j3 = -2097152;
                    if (a4 != null) {
                        this.f2671N = 0L;
                        int r9 = a4.f2692K.f2693J;
                        this.f2670M = 0L;
                        if (this.f2669L == c.PARKING) {
                            this.f2669L = c.BLOCKING;
                        }
                        d dVar2 = this.f2674Q;
                        if (r9 != 0 && h(c.BLOCKING) && !dVar2.j() && !dVar2.h(d.f2676R.get(dVar2))) {
                            dVar2.j();
                        }
                        dVar2.getClass();
                        try {
                            a4.run();
                        } catch (Throwable th) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                        }
                        if (r9 != 0) {
                            d.f2676R.addAndGet(dVar2, -2097152L);
                            if (this.f2669L != cVar2) {
                                this.f2669L = c.DORMANT;
                            }
                        }
                    } else {
                        this.f2673P = z5;
                        if (this.f2671N != 0) {
                            if (!z6) {
                                z6 = true;
                            } else {
                                h(c.PARKING);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f2671N);
                                this.f2671N = 0L;
                                break;
                            }
                        } else {
                            Object obj = this.nextParkedWorker;
                            U1.b bVar = d.f2678T;
                            if (obj != bVar) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (!z3) {
                                d dVar3 = this.f2674Q;
                                dVar3.getClass();
                                if (this.nextParkedWorker == bVar) {
                                    while (true) {
                                        AtomicLongFieldUpdater atomicLongFieldUpdater = d.f2675Q;
                                        long j4 = atomicLongFieldUpdater.get(dVar3);
                                        int r92 = this.indexInArray;
                                        this.nextParkedWorker = dVar3.f2685P.b((int) (j4 & 2097151));
                                        if (atomicLongFieldUpdater.compareAndSet(dVar3, j4, ((2097152 + j4) & j3) | r92)) {
                                            break;
                                        }
                                        j3 = -2097152;
                                    }
                                }
                            } else {
                                f2666R.set(this, -1);
                                while (this.nextParkedWorker != d.f2678T) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = f2666R;
                                    if (atomicIntegerFieldUpdater2.get(this) != -1) {
                                        break;
                                    }
                                    d dVar4 = this.f2674Q;
                                    dVar4.getClass();
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater3 = d.f2677S;
                                    if (atomicIntegerFieldUpdater3.get(dVar4) != 0) {
                                        break;
                                    }
                                    c cVar3 = this.f2669L;
                                    c cVar4 = c.TERMINATED;
                                    if (cVar3 == cVar4) {
                                        break;
                                    }
                                    h(c.PARKING);
                                    Thread.interrupted();
                                    if (this.f2670M == 0) {
                                        atomicIntegerFieldUpdater = atomicIntegerFieldUpdater2;
                                        this.f2670M = System.nanoTime() + this.f2674Q.f2681L;
                                    } else {
                                        atomicIntegerFieldUpdater = atomicIntegerFieldUpdater2;
                                    }
                                    LockSupport.parkNanos(this.f2674Q.f2681L);
                                    if (System.nanoTime() - this.f2670M >= 0) {
                                        this.f2670M = 0L;
                                        d dVar5 = this.f2674Q;
                                        synchronized (dVar5.f2685P) {
                                            try {
                                                if (atomicIntegerFieldUpdater3.get(dVar5) != 0) {
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                                if (!z4) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = d.f2676R;
                                                    if (((int) (atomicLongFieldUpdater2.get(dVar5) & 2097151)) > dVar5.f2679J) {
                                                        if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                            int r6 = this.indexInArray;
                                                            f(0);
                                                            dVar5.f(this, r6, 0);
                                                            int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(dVar5) & 2097151);
                                                            if (andDecrement != r6) {
                                                                Object b3 = dVar5.f2685P.b(andDecrement);
                                                                N2.g.b(b3);
                                                                b bVar2 = (b) b3;
                                                                dVar5.f2685P.c(r6, bVar2);
                                                                bVar2.f(r6);
                                                                dVar5.f(bVar2, andDecrement, r6);
                                                            }
                                                            dVar5.f2685P.c(andDecrement, null);
                                                            this.f2669L = cVar4;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                    }
                                }
                            }
                            z5 = false;
                        }
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(c.TERMINATED);
    }
}
