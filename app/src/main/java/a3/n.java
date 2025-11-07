package a3;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1871e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next");

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1872f = AtomicLongFieldUpdater.newUpdater(n.class, "_state");
    public static final U1.b g = new U1.b("REMOVE_FROZEN", 1);
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: a  reason: collision with root package name */
    public final int f1873a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1874b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1875c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReferenceArray f1876d;

    public n(int r3, boolean z3) {
        this.f1873a = r3;
        this.f1874b = z3;
        int r4 = r3 - 1;
        this.f1875c = r4;
        this.f1876d = new AtomicReferenceArray(r3);
        if (r4 <= 1073741823) {
            if ((r3 & r4) == 0) {
                return;
            }
            throw new IllegalStateException("Check failed.");
        }
        throw new IllegalStateException("Check failed.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Runnable r15) {
        /*
            r14 = this;
        L0:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = a3.n.f1872f
            long r2 = r6.get(r14)
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r4 = 1
            r7 = 0
            int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r5 == 0) goto L19
            r0 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r0 = r0 & r2
            int r15 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r15 == 0) goto L18
            r4 = 2
        L18:
            return r4
        L19:
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r2
            int r1 = (int) r0
            r9 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r9 = r9 & r2
            r0 = 30
            long r9 = r9 >> r0
            int r10 = (int) r9
            int r5 = r10 + 2
            int r9 = r14.f1875c
            r5 = r5 & r9
            r11 = r1 & r9
            if (r5 != r11) goto L32
            return r4
        L32:
            java.util.concurrent.atomic.AtomicReferenceArray r11 = r14.f1876d
            boolean r5 = r14.f1874b
            r12 = 1073741823(0x3fffffff, float:1.9999999)
            if (r5 != 0) goto L51
            r5 = r10 & r9
            java.lang.Object r5 = r11.get(r5)
            if (r5 == 0) goto L51
            r0 = 1024(0x400, float:1.435E-42)
            int r2 = r14.f1873a
            if (r2 < r0) goto L50
            int r10 = r10 - r1
            r0 = r10 & r12
            int r1 = r2 >> 1
            if (r0 <= r1) goto L0
        L50:
            return r4
        L51:
            int r1 = r10 + 1
            r1 = r1 & r12
            r4 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r4 = r4 & r2
            long r12 = (long) r1
            long r0 = r12 << r0
            long r4 = r4 | r0
            r0 = r6
            r1 = r14
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            r0 = r10 & r9
            r11.set(r0, r15)
            r0 = r14
        L6c:
            long r1 = r6.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 == 0) goto L95
            a3.n r0 = r0.c()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f1876d
            int r2 = r0.f1875c
            r2 = r2 & r10
            java.lang.Object r3 = r1.get(r2)
            boolean r4 = r3 instanceof a3.m
            if (r4 == 0) goto L92
            a3.m r3 = (a3.m) r3
            int r3 = r3.f1870a
            if (r3 != r10) goto L92
            r1.set(r2, r15)
            goto L93
        L92:
            r0 = 0
        L93:
            if (r0 != 0) goto L6c
        L95:
            r15 = 0
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.n.a(java.lang.Runnable):int");
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        do {
            atomicLongFieldUpdater = f1872f;
            j3 = atomicLongFieldUpdater.get(this);
            if ((j3 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j3) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, 2305843009213693952L | j3));
        return true;
    }

    public final n c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        while (true) {
            atomicLongFieldUpdater = f1872f;
            j3 = atomicLongFieldUpdater.get(this);
            if ((j3 & 1152921504606846976L) == 0) {
                long j4 = j3 | 1152921504606846976L;
                if (atomicLongFieldUpdater.compareAndSet(this, j3, j4)) {
                    j3 = j4;
                    break;
                }
            } else {
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1871e;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar != null) {
                return nVar;
            }
            n nVar2 = new n(this.f1873a * 2, this.f1874b);
            int r5 = (int) (1073741823 & j3);
            int r4 = (int) ((1152921503533105152L & j3) >> 30);
            while (true) {
                int r7 = this.f1875c;
                int r8 = r5 & r7;
                if (r8 == (r7 & r4)) {
                    break;
                }
                Object obj = this.f1876d.get(r8);
                if (obj == null) {
                    obj = new m(r5);
                }
                nVar2.f1876d.set(nVar2.f1875c & r5, obj);
                r5++;
            }
            atomicLongFieldUpdater.set(nVar2, (-1152921504606846977L) & j3);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, nVar2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1872f;
            long j3 = atomicLongFieldUpdater.get(this);
            if ((j3 & 1152921504606846976L) != 0) {
                return g;
            }
            int r12 = (int) (j3 & 1073741823);
            int r5 = (int) ((1152921503533105152L & j3) >> 30);
            int r4 = this.f1875c;
            int r13 = r12 & r4;
            if ((r5 & r4) == r13) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.f1876d;
            Object obj = atomicReferenceArray.get(r13);
            boolean z3 = this.f1874b;
            if (obj == null) {
                if (z3) {
                    return null;
                }
            } else if (obj instanceof m) {
                return null;
            } else {
                long j4 = (r12 + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(this, j3, (j3 & (-1073741824)) | j4)) {
                    atomicReferenceArray.set(r13, null);
                    return obj;
                } else if (z3) {
                    n nVar = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f1872f;
                        long j5 = atomicLongFieldUpdater2.get(nVar);
                        int r3 = (int) (j5 & 1073741823);
                        if ((j5 & 1152921504606846976L) != 0) {
                            nVar = nVar.c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(nVar, j5, (j5 & (-1073741824)) | j4)) {
                                nVar.f1876d.set(nVar.f1875c & r3, null);
                                nVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (nVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
