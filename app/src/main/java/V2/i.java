package V2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class I extends J implements A {

    /* renamed from: P  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1394P = AtomicReferenceFieldUpdater.newUpdater(I.class, Object.class, "_queue");

    /* renamed from: Q  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1395Q = AtomicReferenceFieldUpdater.newUpdater(I.class, Object.class, "_delayed");

    /* renamed from: R  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1396R = AtomicIntegerFieldUpdater.newUpdater(I.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    @Override // V2.AbstractC0061s
    public final void h(D2.i iVar, Runnable runnable) {
        s(runnable);
    }

    @Override // V2.J
    public final long q() {
        Runnable runnable;
        if (r()) {
            return 0L;
        }
        H h3 = (H) f1395Q.get(this);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1394P;
            Object obj = atomicReferenceFieldUpdater.get(this);
            runnable = null;
            if (obj == null) {
                break;
            } else if (obj instanceof a3.n) {
                a3.n nVar = (a3.n) obj;
                Object d4 = nVar.d();
                if (d4 != a3.n.g) {
                    runnable = (Runnable) d4;
                    break;
                }
                a3.n c4 = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c4) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (obj != AbstractC0066x.f1465b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                runnable = (Runnable) obj;
                break loop0;
            } else {
                break;
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        return t();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
        r6 = o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
        if (java.lang.Thread.currentThread() == r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
        java.util.concurrent.locks.LockSupport.unpark(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0073, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void s(java.lang.Runnable r6) {
        /*
            r5 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = V2.I.f1394P
            java.lang.Object r1 = r0.get(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = V2.I.f1396R
            int r2 = r2.get(r5)
            if (r2 == 0) goto Lf
            goto L4a
        Lf:
            if (r1 != 0) goto L20
        L11:
            r1 = 0
            boolean r1 = r0.compareAndSet(r5, r1, r6)
            if (r1 == 0) goto L19
            goto L66
        L19:
            java.lang.Object r1 = r0.get(r5)
            if (r1 == 0) goto L11
            goto L0
        L20:
            boolean r2 = r1 instanceof a3.n
            r3 = 1
            if (r2 == 0) goto L46
            r2 = r1
            a3.n r2 = (a3.n) r2
            int r4 = r2.a(r6)
            if (r4 == 0) goto L66
            if (r4 == r3) goto L34
            r0 = 2
            if (r4 == r0) goto L4a
            goto L0
        L34:
            a3.n r2 = r2.c()
        L38:
            boolean r3 = r0.compareAndSet(r5, r1, r2)
            if (r3 == 0) goto L3f
            goto L0
        L3f:
            java.lang.Object r3 = r0.get(r5)
            if (r3 == r1) goto L38
            goto L0
        L46:
            U1.b r2 = V2.AbstractC0066x.f1465b
            if (r1 != r2) goto L50
        L4a:
            V2.y r0 = V2.RunnableC0067y.f1472S
            r0.s(r6)
            goto L73
        L50:
            a3.n r2 = new a3.n
            r4 = 8
            r2.<init>(r4, r3)
            r3 = r1
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r2.a(r3)
            r2.a(r6)
        L60:
            boolean r3 = r0.compareAndSet(r5, r1, r2)
            if (r3 == 0) goto L74
        L66:
            java.lang.Thread r6 = r5.o()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            if (r0 == r6) goto L73
            java.util.concurrent.locks.LockSupport.unpark(r6)
        L73:
            return
        L74:
            java.lang.Object r3 = r0.get(r5)
            if (r3 == r1) goto L60
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: V2.I.s(java.lang.Runnable):void");
    }

    @Override // V2.J
    public void shutdown() {
        k0.f1441a.set(null);
        f1396R.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1394P;
            Object obj = atomicReferenceFieldUpdater.get(this);
            U1.b bVar = AbstractC0066x.f1465b;
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, bVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                break loop0;
            } else if (obj instanceof a3.n) {
                ((a3.n) obj).b();
                break;
            } else if (obj != bVar) {
                a3.n nVar = new a3.n(8, true);
                nVar.a((Runnable) obj);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                break loop0;
            } else {
                break;
            }
        }
        do {
        } while (q() <= 0);
        System.nanoTime();
        H h3 = (H) f1395Q.get(this);
    }

    public final long t() {
        long j3;
        C2.g gVar = this.f1400N;
        if (gVar == null || gVar.isEmpty()) {
            j3 = Long.MAX_VALUE;
        } else {
            j3 = 0;
        }
        if (j3 == 0) {
            return 0L;
        }
        Object obj = f1394P.get(this);
        if (obj != null) {
            if (obj instanceof a3.n) {
                long j4 = a3.n.f1872f.get((a3.n) obj);
                if (((int) (1073741823 & j4)) != ((int) ((j4 & 1152921503533105152L) >> 30))) {
                    return 0L;
                }
            } else if (obj == AbstractC0066x.f1465b) {
                return Long.MAX_VALUE;
            } else {
                return 0L;
            }
        }
        H h3 = (H) f1395Q.get(this);
        return Long.MAX_VALUE;
    }

    public final boolean u() {
        boolean z3;
        C2.g gVar = this.f1400N;
        if (gVar != null) {
            z3 = gVar.isEmpty();
        } else {
            z3 = true;
        }
        if (!z3) {
            return false;
        }
        H h3 = (H) f1395Q.get(this);
        Object obj = f1394P.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof a3.n) {
            long j3 = a3.n.f1872f.get((a3.n) obj);
            if (((int) (1073741823 & j3)) == ((int) ((j3 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == AbstractC0066x.f1465b) {
            return true;
        }
        return false;
    }
}
