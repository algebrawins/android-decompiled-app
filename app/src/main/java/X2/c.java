package X2;

import D.C;
import V2.AbstractC0066x;
import V2.C0050f;
import V2.InterfaceC0049e;
import V2.o0;
import a3.u;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import x1.AbstractC0564a0;

/* loaded from: classes.dex */
public class c implements g {

    /* renamed from: L  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1591L = AtomicLongFieldUpdater.newUpdater(c.class, "sendersAndCloseStatus");

    /* renamed from: M  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1592M = AtomicLongFieldUpdater.newUpdater(c.class, "receivers");

    /* renamed from: N  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1593N = AtomicLongFieldUpdater.newUpdater(c.class, "bufferEnd");

    /* renamed from: O  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1594O = AtomicLongFieldUpdater.newUpdater(c.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: P  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1595P = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "sendSegment");

    /* renamed from: Q  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1596Q = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "receiveSegment");

    /* renamed from: R  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1597R = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "bufferEndSegment");

    /* renamed from: S  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1598S = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_closeCause");

    /* renamed from: T  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1599T = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "closeHandler");

    /* renamed from: J  reason: collision with root package name */
    public final int f1600J;

    /* renamed from: K  reason: collision with root package name */
    public final M2.l f1601K;
    private volatile Object _closeCause;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public c(int r7, M2.l lVar) {
        long j3;
        this.f1600J = r7;
        this.f1601K = lVar;
        if (r7 >= 0) {
            k kVar = e.f1603a;
            if (r7 != 0) {
                if (r7 != Integer.MAX_VALUE) {
                    j3 = r7;
                } else {
                    j3 = Long.MAX_VALUE;
                }
            } else {
                j3 = 0;
            }
            this.bufferEnd = j3;
            this.completedExpandBuffersAndPauseFlag = f1593N.get(this);
            k kVar2 = new k(0L, null, this, 3);
            this.sendSegment = kVar2;
            this.receiveSegment = kVar2;
            if (u()) {
                kVar2 = e.f1603a;
                N2.g.c(kVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment = kVar2;
            this._closeCause = e.f1620s;
            return;
        }
        throw new IllegalArgumentException(C.v(r7, "Invalid channel capacity: ", ", should be >=0").toString());
    }

    public static final k b(c cVar, long j3, k kVar) {
        Object b3;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        long j5;
        cVar.getClass();
        k kVar2 = e.f1603a;
        d dVar = d.f1602R;
        loop0: while (true) {
            b3 = a3.a.b(kVar, j3, dVar);
            if (!a3.a.e(b3)) {
                u c4 = a3.a.c(b3);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1595P;
                    u uVar = (u) atomicReferenceFieldUpdater.get(cVar);
                    if (uVar.f1884L >= c4.f1884L) {
                        break loop0;
                    } else if (!c4.i()) {
                        break;
                    } else {
                        while (!atomicReferenceFieldUpdater.compareAndSet(cVar, uVar, c4)) {
                            if (atomicReferenceFieldUpdater.get(cVar) != uVar) {
                                if (c4.e()) {
                                    c4.d();
                                }
                            }
                        }
                        if (uVar.e()) {
                            uVar.d();
                        }
                    }
                }
            } else {
                break;
            }
        }
        boolean e4 = a3.a.e(b3);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f1592M;
        if (e4) {
            cVar.s();
            if (kVar.f1884L * e.f1604b >= atomicLongFieldUpdater2.get(cVar)) {
                return null;
            }
            kVar.a();
            return null;
        }
        k kVar3 = (k) a3.a.c(b3);
        long j6 = kVar3.f1884L;
        if (j6 > j3) {
            long j7 = e.f1604b * j6;
            do {
                atomicLongFieldUpdater = f1591L;
                j4 = atomicLongFieldUpdater.get(cVar);
                j5 = 1152921504606846975L & j4;
                if (j5 >= j7) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(cVar, j4, j5 + (((int) (j4 >> 60)) << 60)));
            if (j6 * e.f1604b >= atomicLongFieldUpdater2.get(cVar)) {
                return null;
            }
            kVar3.a();
            return null;
        }
        return kVar3;
    }

    public static final void c(c cVar, Object obj, C0050f c0050f) {
        B2.b a4;
        M2.l lVar = cVar.f1601K;
        if (lVar != null && (a4 = a3.a.a(lVar, obj, null)) != null) {
            AbstractC0066x.d(c0050f.f1437N, a4);
        }
        c0050f.i(P1.a.a(cVar.o()));
    }

    public static final int e(c cVar, k kVar, int r6, Object obj, long j3, Object obj2, boolean z3) {
        cVar.getClass();
        kVar.m(r6, obj);
        if (z3) {
            return cVar.B(kVar, r6, obj, j3, obj2, z3);
        }
        Object k3 = kVar.k(r6);
        if (k3 == null) {
            if (cVar.f(j3)) {
                if (kVar.j(r6, null, e.f1606d)) {
                    return 1;
                }
            } else if (obj2 == null) {
                return 3;
            } else {
                if (kVar.j(r6, null, obj2)) {
                    return 2;
                }
            }
        } else if (k3 instanceof o0) {
            kVar.m(r6, null);
            if (cVar.y(k3, obj)) {
                kVar.n(r6, e.f1610i);
                return 0;
            }
            U1.b bVar = e.f1612k;
            if (kVar.f1626O.getAndSet((r6 * 2) + 1, bVar) != bVar) {
                kVar.l(r6, true);
            }
            return 5;
        }
        return cVar.B(kVar, r6, obj, j3, obj2, z3);
    }

    public static void q(c cVar) {
        cVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1594O;
        if ((atomicLongFieldUpdater.addAndGet(cVar, 1L) & 4611686018427387904L) != 0) {
            do {
            } while ((atomicLongFieldUpdater.get(cVar) & 4611686018427387904L) != 0);
        }
    }

    public static boolean z(Object obj) {
        if (obj instanceof InterfaceC0049e) {
            N2.g.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return e.a((InterfaceC0049e) obj, B2.i.f210a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final Object A(k kVar, int r11, long j3, Object obj) {
        Object k3 = kVar.k(r11);
        AtomicReferenceArray atomicReferenceArray = kVar.f1626O;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1591L;
        if (k3 == null) {
            if (j3 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return e.f1615n;
                }
                if (kVar.j(r11, k3, obj)) {
                    k();
                    return e.f1614m;
                }
            }
        } else if (k3 == e.f1606d && kVar.j(r11, k3, e.f1610i)) {
            k();
            Object obj2 = atomicReferenceArray.get(r11 * 2);
            kVar.m(r11, null);
            return obj2;
        }
        while (true) {
            Object k4 = kVar.k(r11);
            if (k4 != null && k4 != e.f1607e) {
                if (k4 == e.f1606d) {
                    if (kVar.j(r11, k4, e.f1610i)) {
                        k();
                        Object obj3 = atomicReferenceArray.get(r11 * 2);
                        kVar.m(r11, null);
                        return obj3;
                    }
                } else {
                    U1.b bVar = e.f1611j;
                    if (k4 == bVar) {
                        return e.f1616o;
                    }
                    if (k4 == e.f1609h) {
                        return e.f1616o;
                    }
                    if (k4 == e.f1613l) {
                        k();
                        return e.f1616o;
                    } else if (k4 != e.g && kVar.j(r11, k4, e.f1608f)) {
                        boolean z3 = k4 instanceof t;
                        if (z3) {
                            k4 = ((t) k4).f1634a;
                        }
                        if (z(k4)) {
                            kVar.n(r11, e.f1610i);
                            k();
                            Object obj4 = atomicReferenceArray.get(r11 * 2);
                            kVar.m(r11, null);
                            return obj4;
                        }
                        kVar.n(r11, bVar);
                        kVar.h();
                        if (z3) {
                            k();
                        }
                        return e.f1616o;
                    }
                }
            } else if (j3 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (kVar.j(r11, k4, e.f1609h)) {
                    k();
                    return e.f1616o;
                }
            } else if (obj == null) {
                return e.f1615n;
            } else {
                if (kVar.j(r11, k4, obj)) {
                    k();
                    return e.f1614m;
                }
            }
        }
    }

    public final int B(k kVar, int r7, Object obj, long j3, Object obj2, boolean z3) {
        while (true) {
            Object k3 = kVar.k(r7);
            if (k3 == null) {
                if (f(j3) && !z3) {
                    if (kVar.j(r7, null, e.f1606d)) {
                        return 1;
                    }
                } else if (z3) {
                    if (kVar.j(r7, null, e.f1611j)) {
                        kVar.h();
                        return 4;
                    }
                } else if (obj2 == null) {
                    return 3;
                } else {
                    if (kVar.j(r7, null, obj2)) {
                        return 2;
                    }
                }
            } else if (k3 == e.f1607e) {
                if (kVar.j(r7, k3, e.f1606d)) {
                    return 1;
                }
            } else {
                U1.b bVar = e.f1612k;
                if (k3 == bVar) {
                    kVar.m(r7, null);
                    return 5;
                } else if (k3 == e.f1609h) {
                    kVar.m(r7, null);
                    return 5;
                } else if (k3 == e.f1613l) {
                    kVar.m(r7, null);
                    s();
                    return 4;
                } else {
                    kVar.m(r7, null);
                    if (k3 instanceof t) {
                        k3 = ((t) k3).f1634a;
                    }
                    if (y(k3, obj)) {
                        kVar.n(r7, e.f1610i);
                        return 0;
                    } else if (kVar.f1626O.getAndSet((r7 * 2) + 1, bVar) == bVar) {
                        return 5;
                    } else {
                        kVar.l(r7, true);
                        return 5;
                    }
                }
            }
        }
    }

    public final void C(long j3) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        boolean z3;
        long j5;
        if (u()) {
            return;
        }
        do {
            atomicLongFieldUpdater = f1593N;
        } while (atomicLongFieldUpdater.get(this) <= j3);
        int r02 = e.f1605c;
        int r12 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f1594O;
            if (r12 < r02) {
                long j6 = atomicLongFieldUpdater.get(this);
                if (j6 == (atomicLongFieldUpdater2.get(this) & 4611686018427387903L) && j6 == atomicLongFieldUpdater.get(this)) {
                    return;
                }
                r12++;
            } else {
                do {
                    j4 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j4, 4611686018427387904L + (j4 & 4611686018427387903L)));
                while (true) {
                    long j7 = atomicLongFieldUpdater.get(this);
                    long j8 = atomicLongFieldUpdater2.get(this);
                    long j9 = j8 & 4611686018427387903L;
                    if ((j8 & 4611686018427387904L) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (j7 == j9 && j7 == atomicLongFieldUpdater.get(this)) {
                        break;
                    } else if (!z3) {
                        atomicLongFieldUpdater2.compareAndSet(this, j8, j9 + 4611686018427387904L);
                    }
                }
                do {
                    j5 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j5, j5 & 4611686018427387903L));
                return;
            }
        }
    }

    @Override // X2.r
    public final void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        h(cancellationException, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b6, code lost:
        if (r0 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01ba, code lost:
        r2.B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01bd, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01cb, code lost:
        if (r0 == E2.a.COROUTINE_SUSPENDED) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01d5, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
        if (r0 == E2.a.COROUTINE_SUSPENDED) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        r3 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ef, code lost:
        r5 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f1, code lost:
        c(r25, r27, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f4, code lost:
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f9, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00fa, code lost:
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0142, code lost:
        if (r20 >= r5.get(r25)) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0144, code lost:
        r18.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0147, code lost:
        r2 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0149, code lost:
        c(r25, r27, r2);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01b5  */
    /* JADX WARN: Type inference failed for: r2v34 */
    @Override // X2.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(D2.d r26, java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.c.d(D2.d, java.lang.Object):java.lang.Object");
    }

    public final boolean f(long j3) {
        if (j3 >= f1593N.get(this) && j3 >= f1592M.get(this) + this.f1600J) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
        return r1;
     */
    @Override // X2.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object g(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.c.g(java.lang.Object):java.lang.Object");
    }

    public final boolean h(Throwable th, boolean z3) {
        boolean z4;
        long j3;
        long j4;
        long j5;
        Object obj;
        U1.b bVar;
        long j6;
        long j7;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1591L;
        if (z3) {
            do {
                j7 = atomicLongFieldUpdater.get(this);
                if (((int) (j7 >> 60)) != 0) {
                    break;
                }
                k kVar = e.f1603a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j7, (1 << 60) + (j7 & 1152921504606846975L)));
        }
        U1.b bVar2 = e.f1620s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1598S;
            if (atomicReferenceFieldUpdater.compareAndSet(this, bVar2, th)) {
                z4 = true;
                break;
            } else if (atomicReferenceFieldUpdater.get(this) != bVar2) {
                z4 = false;
                break;
            }
        }
        if (z3) {
            do {
                j6 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j6, (3 << 60) + (j6 & 1152921504606846975L)));
        } else {
            do {
                j3 = atomicLongFieldUpdater.get(this);
                int r15 = (int) (j3 >> 60);
                if (r15 != 0) {
                    if (r15 != 1) {
                        break;
                    }
                    j4 = j3 & 1152921504606846975L;
                    j5 = 3;
                } else {
                    j4 = j3 & 1152921504606846975L;
                    j5 = 2;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j3, (j5 << 60) + j4));
        }
        s();
        if (z4) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1599T;
                obj = atomicReferenceFieldUpdater2.get(this);
                if (obj == null) {
                    bVar = e.f1618q;
                } else {
                    bVar = e.f1619r;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, bVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                N2.r.a(1, obj);
                ((M2.l) obj).h(m());
            }
        }
        return z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
        r1 = (X2.k) ((a3.d) a3.d.f1852K.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final X2.k i(long r14) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.c.i(long):X2.k");
    }

    public final void j(long j3) {
        B2.b a4;
        k kVar = (k) f1596Q.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1592M;
            long j4 = atomicLongFieldUpdater.get(this);
            if (j3 < Math.max(this.f1600J + j4, f1593N.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j4, j4 + 1)) {
                long j5 = e.f1604b;
                long j6 = j4 / j5;
                int r5 = (int) (j4 % j5);
                if (kVar.f1884L != j6) {
                    k l3 = l(j6, kVar);
                    if (l3 == null) {
                        continue;
                    } else {
                        kVar = l3;
                    }
                }
                Object A3 = A(kVar, r5, j4, null);
                if (A3 == e.f1616o) {
                    if (j4 < p()) {
                        kVar.a();
                    }
                } else {
                    kVar.a();
                    M2.l lVar = this.f1601K;
                    if (lVar != null && (a4 = a3.a.a(lVar, A3, null)) != null) {
                        throw a4;
                    }
                }
            }
        }
    }

    public final void k() {
        Object b3;
        if (u()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1597R;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = f1593N.getAndIncrement(this);
            long j3 = andIncrement / e.f1604b;
            if (p() <= andIncrement) {
                if (kVar.f1884L < j3 && kVar.b() != null) {
                    v(j3, kVar);
                }
                q(this);
                return;
            }
            if (kVar.f1884L != j3) {
                d dVar = d.f1602R;
                while (true) {
                    b3 = a3.a.b(kVar, j3, dVar);
                    if (!a3.a.e(b3)) {
                        u c4 = a3.a.c(b3);
                        while (true) {
                            u uVar = (u) atomicReferenceFieldUpdater.get(this);
                            if (uVar.f1884L >= c4.f1884L) {
                                break;
                            } else if (!c4.i()) {
                                break;
                            } else {
                                while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, c4)) {
                                    if (atomicReferenceFieldUpdater.get(this) != uVar) {
                                        if (c4.e()) {
                                            c4.d();
                                        }
                                    }
                                }
                                if (uVar.e()) {
                                    uVar.d();
                                }
                            }
                        }
                    } else {
                        break;
                    }
                }
                k kVar2 = null;
                if (a3.a.e(b3)) {
                    s();
                    v(j3, kVar);
                    q(this);
                } else {
                    k kVar3 = (k) a3.a.c(b3);
                    long j4 = kVar3.f1884L;
                    if (j4 > j3) {
                        long j5 = j4 * e.f1604b;
                        if (f1593N.compareAndSet(this, andIncrement + 1, j5)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f1594O;
                            if ((atomicLongFieldUpdater.addAndGet(this, j5 - andIncrement) & 4611686018427387904L) != 0) {
                                do {
                                } while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0);
                            }
                        } else {
                            q(this);
                        }
                    } else {
                        kVar2 = kVar3;
                    }
                }
                if (kVar2 == null) {
                    continue;
                } else {
                    kVar = kVar2;
                }
            }
            int r12 = (int) (andIncrement % e.f1604b);
            Object k3 = kVar.k(r12);
            boolean z3 = k3 instanceof o0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f1592M;
            if (!z3 || andIncrement < atomicLongFieldUpdater2.get(this) || !kVar.j(r12, k3, e.g)) {
                while (true) {
                    Object k4 = kVar.k(r12);
                    if (k4 instanceof o0) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (kVar.j(r12, k4, new t((o0) k4))) {
                                break loop0;
                            }
                        } else if (kVar.j(r12, k4, e.g)) {
                            if (z(k4)) {
                                kVar.n(r12, e.f1606d);
                                break;
                            } else {
                                kVar.n(r12, e.f1611j);
                                kVar.h();
                            }
                        }
                    } else if (k4 != e.f1611j) {
                        if (k4 == null) {
                            if (kVar.j(r12, k4, e.f1607e)) {
                                break loop0;
                            }
                        } else if (k4 == e.f1606d || k4 == e.f1609h || k4 == e.f1610i || k4 == e.f1612k || k4 == e.f1613l) {
                            break loop0;
                        } else if (k4 != e.f1608f) {
                            throw new IllegalStateException(("Unexpected cell state: " + k4).toString());
                        }
                    } else {
                        break;
                    }
                }
            } else if (z(k3)) {
                kVar.n(r12, e.f1606d);
                break;
            } else {
                kVar.n(r12, e.f1611j);
                kVar.h();
                q(this);
            }
        }
        q(this);
    }

    public final k l(long j3, k kVar) {
        Object b3;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        k kVar2 = e.f1603a;
        d dVar = d.f1602R;
        loop0: while (true) {
            b3 = a3.a.b(kVar, j3, dVar);
            if (!a3.a.e(b3)) {
                u c4 = a3.a.c(b3);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1596Q;
                    u uVar = (u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f1884L >= c4.f1884L) {
                        break loop0;
                    } else if (!c4.i()) {
                        break;
                    } else {
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, c4)) {
                            if (atomicReferenceFieldUpdater.get(this) != uVar) {
                                if (c4.e()) {
                                    c4.d();
                                }
                            }
                        }
                        if (uVar.e()) {
                            uVar.d();
                        }
                    }
                }
            } else {
                break;
            }
        }
        if (a3.a.e(b3)) {
            s();
            if (kVar.f1884L * e.f1604b >= p()) {
                return null;
            }
            kVar.a();
            return null;
        }
        k kVar3 = (k) a3.a.c(b3);
        boolean u3 = u();
        long j5 = kVar3.f1884L;
        if (!u3 && j3 <= f1593N.get(this) / e.f1604b) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1597R;
                u uVar2 = (u) atomicReferenceFieldUpdater2.get(this);
                if (uVar2.f1884L >= j5 || !kVar3.i()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, uVar2, kVar3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != uVar2) {
                        if (kVar3.e()) {
                            kVar3.d();
                        }
                    }
                }
                if (uVar2.e()) {
                    uVar2.d();
                }
            }
        }
        if (j5 > j3) {
            long j6 = e.f1604b * j5;
            do {
                atomicLongFieldUpdater = f1592M;
                j4 = atomicLongFieldUpdater.get(this);
                if (j4 >= j6) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j4, j6));
            if (j5 * e.f1604b >= p()) {
                return null;
            }
            kVar3.a();
            return null;
        }
        return kVar3;
    }

    public final Throwable m() {
        return (Throwable) f1598S.get(this);
    }

    public final Throwable n() {
        Throwable m3 = m();
        if (m3 == null) {
            return new NoSuchElementException("Channel was closed");
        }
        return m3;
    }

    public final Throwable o() {
        Throwable m3 = m();
        if (m3 == null) {
            return new IllegalStateException("Channel was closed");
        }
        return m3;
    }

    public final long p() {
        return f1591L.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c7, code lost:
        r0 = (X2.k) ((a3.d) a3.d.f1852K.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(long r19, boolean r21) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.c.r(long, boolean):boolean");
    }

    public final boolean s() {
        return r(f1591L.get(this), false);
    }

    public boolean t() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x019d, code lost:
        r3 = (X2.k) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a4, code lost:
        if (r3 != null) goto L94;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x019d A[EDGE_INSN: B:97:0x019d->B:75:0x019d ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.c.toString():java.lang.String");
    }

    public final boolean u() {
        long j3 = f1593N.get(this);
        if (j3 != 0 && j3 != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(long r6, X2.k r8) {
        /*
            r5 = this;
        L0:
            long r0 = r8.f1884L
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 >= 0) goto L11
            a3.d r0 = r8.b()
            X2.k r0 = (X2.k) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r8 = r0
            goto L0
        L11:
            boolean r6 = r8.c()
            if (r6 == 0) goto L22
            a3.d r6 = r8.b()
            X2.k r6 = (X2.k) r6
            if (r6 != 0) goto L20
            goto L22
        L20:
            r8 = r6
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = X2.c.f1597R
            java.lang.Object r7 = r6.get(r5)
            a3.u r7 = (a3.u) r7
            long r0 = r7.f1884L
            long r2 = r8.f1884L
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r8.i()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r6.compareAndSet(r5, r7, r8)
            if (r0 == 0) goto L4a
            boolean r6 = r7.e()
            if (r6 == 0) goto L49
            r7.d()
        L49:
            return
        L4a:
            java.lang.Object r0 = r6.get(r5)
            if (r0 == r7) goto L3a
            boolean r6 = r8.e()
            if (r6 == 0) goto L22
            r8.d()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.c.v(long, X2.k):void");
    }

    public final Object w(D2.d dVar, Object obj) {
        B2.b a4;
        C0050f c0050f = new C0050f(1, AbstractC0564a0.a(dVar));
        c0050f.v();
        M2.l lVar = this.f1601K;
        if (lVar != null && (a4 = a3.a.a(lVar, obj, null)) != null) {
            G.i.a(a4, o());
            c0050f.i(P1.a.a(a4));
        } else {
            c0050f.i(P1.a.a(o()));
        }
        Object u3 = c0050f.u();
        if (u3 == E2.a.COROUTINE_SUSPENDED) {
            return u3;
        }
        return B2.i.f210a;
    }

    public final void x(o0 o0Var, boolean z3) {
        Throwable o3;
        if (o0Var instanceof InterfaceC0049e) {
            D2.d dVar = (D2.d) o0Var;
            if (z3) {
                o3 = n();
            } else {
                o3 = o();
            }
            dVar.i(P1.a.a(o3));
        } else if (o0Var instanceof b) {
            b bVar = (b) o0Var;
            C0050f c0050f = bVar.f1589K;
            N2.g.b(c0050f);
            bVar.f1589K = null;
            bVar.f1588J = e.f1613l;
            Throwable m3 = bVar.f1590L.m();
            if (m3 == null) {
                c0050f.i(Boolean.FALSE);
            } else {
                c0050f.i(P1.a.a(m3));
            }
        } else {
            throw new IllegalStateException(("Unexpected waiter: " + o0Var).toString());
        }
    }

    public final boolean y(Object obj, Object obj2) {
        a3.p pVar = null;
        if (obj instanceof b) {
            N2.g.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            b bVar = (b) obj;
            C0050f c0050f = bVar.f1589K;
            N2.g.b(c0050f);
            bVar.f1589K = null;
            bVar.f1588J = obj2;
            Boolean bool = Boolean.TRUE;
            M2.l lVar = bVar.f1590L.f1601K;
            if (lVar != null) {
                pVar = new a3.p(lVar, obj2, c0050f.f1437N);
            }
            return e.a(c0050f, bool, pVar);
        } else if (obj instanceof InterfaceC0049e) {
            N2.g.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC0049e interfaceC0049e = (InterfaceC0049e) obj;
            M2.l lVar2 = this.f1601K;
            if (lVar2 != null) {
                pVar = new a3.p(lVar2, obj2, interfaceC0049e.e());
            }
            return e.a(interfaceC0049e, obj2, pVar);
        } else {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
    }
}
