package c3;

import D.C;
import V2.AbstractC0066x;
import a3.s;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class d implements Executor, Closeable {

    /* renamed from: Q  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f2675Q = AtomicLongFieldUpdater.newUpdater(d.class, "parkedWorkersStack");

    /* renamed from: R  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f2676R = AtomicLongFieldUpdater.newUpdater(d.class, "controlState");

    /* renamed from: S  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f2677S = AtomicIntegerFieldUpdater.newUpdater(d.class, "_isTerminated");

    /* renamed from: T  reason: collision with root package name */
    public static final U1.b f2678T = new U1.b("NOT_IN_STACK", 1);

    /* renamed from: J  reason: collision with root package name */
    public final int f2679J;

    /* renamed from: K  reason: collision with root package name */
    public final int f2680K;

    /* renamed from: L  reason: collision with root package name */
    public final long f2681L;

    /* renamed from: M  reason: collision with root package name */
    public final String f2682M;

    /* renamed from: N  reason: collision with root package name */
    public final g f2683N;

    /* renamed from: O  reason: collision with root package name */
    public final g f2684O;

    /* renamed from: P  reason: collision with root package name */
    public final s f2685P;
    private volatile int _isTerminated;
    private volatile long controlState;
    private volatile long parkedWorkersStack;

    /* JADX WARN: Type inference failed for: r4v10, types: [c3.g, a3.l] */
    /* JADX WARN: Type inference failed for: r4v9, types: [c3.g, a3.l] */
    public d(int r3, int r4, long j3, String str) {
        this.f2679J = r3;
        this.f2680K = r4;
        this.f2681L = j3;
        this.f2682M = str;
        if (r3 >= 1) {
            if (r4 >= r3) {
                if (r4 <= 2097150) {
                    if (j3 > 0) {
                        this.f2683N = new a3.l();
                        this.f2684O = new a3.l();
                        this.f2685P = new s((r3 + 1) * 2);
                        this.controlState = r3 << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j3 + " must be positive").toString());
                }
                throw new IllegalArgumentException(C.v(r4, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(C.x("Max pool size ", r4, " should be greater than or equals to core pool size ", r3).toString());
        }
        throw new IllegalArgumentException(C.v(r3, "Core pool size ", " should be at least 1").toString());
    }

    public final int a() {
        boolean z3;
        synchronized (this.f2685P) {
            try {
                if (f2677S.get(this) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f2676R;
                long j3 = atomicLongFieldUpdater.get(this);
                int r9 = (int) (j3 & 2097151);
                int r4 = r9 - ((int) ((j3 & 4398044413952L) >> 21));
                if (r4 < 0) {
                    r4 = 0;
                }
                if (r4 >= this.f2679J) {
                    return 0;
                }
                if (r9 >= this.f2680K) {
                    return 0;
                }
                int r22 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (r22 > 0 && this.f2685P.b(r22) == null) {
                    b bVar = new b(this, r22);
                    this.f2685P.c(r22, bVar);
                    if (r22 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                        int r42 = r4 + 1;
                        bVar.start();
                        return r42;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalArgumentException("Failed requirement.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, k kVar, boolean z3) {
        j lVar;
        boolean z4;
        long j3;
        b bVar;
        boolean a4;
        c cVar;
        m.f2700f.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof j) {
            lVar = (j) runnable;
            lVar.f2691J = nanoTime;
            lVar.f2692K = kVar;
        } else {
            lVar = new l(runnable, nanoTime, kVar);
        }
        boolean z5 = false;
        if (lVar.f2692K.f2693J == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f2676R;
        if (z4) {
            j3 = atomicLongFieldUpdater.addAndGet(this, 2097152L);
        } else {
            j3 = 0;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof b) {
            bVar = (b) currentThread;
        } else {
            bVar = null;
        }
        if (bVar == null || !N2.g.a(bVar.f2674Q, this)) {
            bVar = null;
        }
        if (bVar != null && (cVar = bVar.f2669L) != c.TERMINATED && (lVar.f2692K.f2693J != 0 || cVar != c.BLOCKING)) {
            bVar.f2673P = true;
            o oVar = bVar.f2667J;
            if (z3) {
                lVar = oVar.a(lVar);
            } else {
                oVar.getClass();
                j jVar = (j) o.f2703b.getAndSet(oVar, lVar);
                if (jVar == null) {
                    lVar = null;
                } else {
                    lVar = oVar.a(jVar);
                }
            }
        }
        if (lVar != null) {
            if (lVar.f2692K.f2693J == 1) {
                a4 = this.f2684O.a(lVar);
            } else {
                a4 = this.f2683N.a(lVar);
            }
            if (!a4) {
                throw new RejectedExecutionException(C.z(new StringBuilder(), this.f2682M, " was terminated"));
            }
        }
        if (z3 && bVar != null) {
            z5 = true;
        }
        if (z4) {
            if (!z5 && !j() && !h(j3)) {
                j();
            }
        } else if (!z5 && !j() && !h(atomicLongFieldUpdater.get(this))) {
            j();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0087, code lost:
        if (r1 == null) goto L46;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = c3.d.f2677S
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lc
            goto Lb0
        Lc:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof c3.b
            r3 = 0
            if (r1 == 0) goto L18
            c3.b r0 = (c3.b) r0
            goto L19
        L18:
            r0 = r3
        L19:
            if (r0 == 0) goto L24
            c3.d r1 = r0.f2674Q
            boolean r1 = N2.g.a(r1, r8)
            if (r1 == 0) goto L24
            goto L25
        L24:
            r0 = r3
        L25:
            a3.s r1 = r8.f2685P
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = c3.d.f2676R     // Catch: java.lang.Throwable -> Lc2
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc2
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r5 = (int) r4
            monitor-exit(r1)
            if (r2 > r5) goto L77
            r1 = 1
        L37:
            a3.s r4 = r8.f2685P
            java.lang.Object r4 = r4.b(r1)
            N2.g.b(r4)
            c3.b r4 = (c3.b) r4
            if (r4 == r0) goto L72
        L44:
            boolean r6 = r4.isAlive()
            if (r6 == 0) goto L53
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r6 = 10000(0x2710, double:4.9407E-320)
            r4.join(r6)
            goto L44
        L53:
            c3.o r4 = r4.f2667J
            c3.g r6 = r8.f2684O
            r4.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = c3.o.f2703b
            java.lang.Object r7 = r7.getAndSet(r4, r3)
            c3.j r7 = (c3.j) r7
            if (r7 == 0) goto L67
            r6.a(r7)
        L67:
            c3.j r7 = r4.b()
            if (r7 != 0) goto L6e
            goto L72
        L6e:
            r6.a(r7)
            goto L67
        L72:
            if (r1 == r5) goto L77
            int r1 = r1 + 1
            goto L37
        L77:
            c3.g r1 = r8.f2684O
            r1.b()
            c3.g r1 = r8.f2683N
            r1.b()
        L81:
            if (r0 == 0) goto L89
            c3.j r1 = r0.a(r2)
            if (r1 != 0) goto Lb1
        L89:
            c3.g r1 = r8.f2683N
            java.lang.Object r1 = r1.d()
            c3.j r1 = (c3.j) r1
            if (r1 != 0) goto Lb1
            c3.g r1 = r8.f2684O
            java.lang.Object r1 = r1.d()
            c3.j r1 = (c3.j) r1
            if (r1 != 0) goto Lb1
            if (r0 == 0) goto La4
            c3.c r1 = c3.c.TERMINATED
            r0.h(r1)
        La4:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = c3.d.f2675Q
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = c3.d.f2676R
            r0.set(r8, r1)
        Lb0:
            return
        Lb1:
            r1.run()     // Catch: java.lang.Throwable -> Lb5
            goto L81
        Lb5:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L81
        Lc2:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.d.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable, m.g, false);
    }

    public final void f(b bVar, int r11, int r12) {
        while (true) {
            long j3 = f2675Q.get(this);
            int r13 = (int) (2097151 & j3);
            long j4 = (2097152 + j3) & (-2097152);
            if (r13 == r11) {
                if (r12 == 0) {
                    Object c4 = bVar.c();
                    while (true) {
                        if (c4 == f2678T) {
                            r13 = -1;
                            break;
                        } else if (c4 == null) {
                            r13 = 0;
                            break;
                        } else {
                            b bVar2 = (b) c4;
                            r13 = bVar2.b();
                            if (r13 != 0) {
                                break;
                            }
                            c4 = bVar2.c();
                        }
                    }
                } else {
                    r13 = r12;
                }
            }
            if (r13 >= 0) {
                if (f2675Q.compareAndSet(this, j3, j4 | r13)) {
                    return;
                }
            }
        }
    }

    public final boolean h(long j3) {
        int r12 = ((int) (2097151 & j3)) - ((int) ((j3 & 4398044413952L) >> 21));
        if (r12 < 0) {
            r12 = 0;
        }
        int r6 = this.f2679J;
        if (r12 < r6) {
            int a4 = a();
            if (a4 == 1 && r6 > 1) {
                a();
            }
            if (a4 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean j() {
        U1.b bVar;
        int r10;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f2675Q;
            long j3 = atomicLongFieldUpdater.get(this);
            b bVar2 = (b) this.f2685P.b((int) (2097151 & j3));
            if (bVar2 == null) {
                bVar2 = null;
            } else {
                long j4 = (2097152 + j3) & (-2097152);
                Object c4 = bVar2.c();
                while (true) {
                    bVar = f2678T;
                    if (c4 == bVar) {
                        r10 = -1;
                        break;
                    } else if (c4 == null) {
                        r10 = 0;
                        break;
                    } else {
                        b bVar3 = (b) c4;
                        r10 = bVar3.b();
                        if (r10 != 0) {
                            break;
                        }
                        c4 = bVar3.c();
                    }
                }
                if (r10 >= 0 && atomicLongFieldUpdater.compareAndSet(this, j3, j4 | r10)) {
                    bVar2.g(bVar);
                }
            }
            if (bVar2 == null) {
                return false;
            }
            if (b.f2666R.compareAndSet(bVar2, -1, 0)) {
                LockSupport.unpark(bVar2);
                return true;
            }
        }
    }

    public final String toString() {
        int r12;
        ArrayList arrayList = new ArrayList();
        s sVar = this.f2685P;
        int a4 = sVar.a();
        int r3 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        for (int r9 = 1; r9 < a4; r9++) {
            b bVar = (b) sVar.b(r9);
            if (bVar != null) {
                o oVar = bVar.f2667J;
                oVar.getClass();
                if (o.f2703b.get(oVar) != null) {
                    r12 = (o.f2704c.get(oVar) - o.f2705d.get(oVar)) + 1;
                } else {
                    r12 = o.f2704c.get(oVar) - o.f2705d.get(oVar);
                }
                int r10 = a.f2665a[bVar.f2669L.ordinal()];
                if (r10 != 1) {
                    if (r10 != 2) {
                        if (r10 != 3) {
                            if (r10 != 4) {
                                if (r10 == 5) {
                                    r8++;
                                }
                            } else {
                                r7++;
                                if (r12 > 0) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(r12);
                                    sb.append('d');
                                    arrayList.add(sb.toString());
                                }
                            }
                        } else {
                            r3++;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(r12);
                            sb2.append('c');
                            arrayList.add(sb2.toString());
                        }
                    } else {
                        r5++;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(r12);
                        sb3.append('b');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    r6++;
                }
            }
        }
        long j3 = f2676R.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f2682M);
        sb4.append('@');
        sb4.append(AbstractC0066x.b(this));
        sb4.append("[Pool Size {core = ");
        int r92 = this.f2679J;
        sb4.append(r92);
        sb4.append(", max = ");
        sb4.append(this.f2680K);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(r3);
        sb4.append(", blocking = ");
        sb4.append(r5);
        sb4.append(", parked = ");
        sb4.append(r6);
        sb4.append(", dormant = ");
        sb4.append(r7);
        sb4.append(", terminated = ");
        sb4.append(r8);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f2683N.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f2684O.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j3));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j3) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(r92 - ((int) ((j3 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
