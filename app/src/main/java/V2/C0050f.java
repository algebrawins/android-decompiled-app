package V2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: V2.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0050f extends C implements InterfaceC0049e, F2.c, o0 {

    /* renamed from: O  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1433O = AtomicIntegerFieldUpdater.newUpdater(C0050f.class, "_decisionAndIndex");

    /* renamed from: P  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1434P = AtomicReferenceFieldUpdater.newUpdater(C0050f.class, Object.class, "_state");

    /* renamed from: Q  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1435Q = AtomicReferenceFieldUpdater.newUpdater(C0050f.class, Object.class, "_parentHandle");

    /* renamed from: M  reason: collision with root package name */
    public final D2.d f1436M;

    /* renamed from: N  reason: collision with root package name */
    public final D2.i f1437N;
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    public C0050f(int r12, D2.d dVar) {
        super(r12);
        this.f1436M = dVar;
        this.f1437N = dVar.e();
        this._decisionAndIndex = 536870911;
        this._state = C0046b.f1425J;
    }

    public static Object D(f0 f0Var, Object obj, int r8, M2.l lVar) {
        F f2;
        if (!(obj instanceof C0057n) && AbstractC0066x.f(r8)) {
            if (lVar != null || (f0Var instanceof F)) {
                if (f0Var instanceof F) {
                    f2 = (F) f0Var;
                } else {
                    f2 = null;
                }
                return new C0056m(obj, f2, lVar, (CancellationException) null, 16);
            }
            return obj;
        }
        return obj;
    }

    public static void z(f0 f0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + f0Var + ", already has " + obj).toString());
    }

    public String A() {
        return "CancellableContinuation";
    }

    public final void B() {
        a3.h hVar;
        D2.d dVar = this.f1436M;
        Throwable th = null;
        if (dVar instanceof a3.h) {
            hVar = (a3.h) dVar;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a3.h.f1856Q;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                U1.b bVar = a3.a.f1846d;
                if (obj == bVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, bVar, this)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != bVar) {
                            break;
                        }
                    }
                    break loop0;
                } else if (obj instanceof Throwable) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                } else {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                }
            }
            if (th != null) {
                r();
                q(th);
            }
        }
    }

    public final void C(Object obj, int r6, M2.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1434P;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof f0) {
                Object D3 = D((f0) obj2, obj, r6, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, D3)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!y()) {
                    r();
                }
                s(r6);
                return;
            }
            if (obj2 instanceof C0051g) {
                C0051g c0051g = (C0051g) obj2;
                c0051g.getClass();
                if (C0051g.f1438c.compareAndSet(c0051g, 0, 1)) {
                    if (lVar != null) {
                        n(lVar, c0051g.f1450a);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    @Override // V2.o0
    public final void a(a3.u uVar, int r6) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int r12;
        do {
            atomicIntegerFieldUpdater = f1433O;
            r12 = atomicIntegerFieldUpdater.get(this);
            if ((r12 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, r12, ((r12 >> 29) << 29) + r6));
        x(uVar);
    }

    @Override // V2.C
    public final void b(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1434P;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof f0)) {
                if (obj2 instanceof C0057n) {
                    return;
                }
                if (obj2 instanceof C0056m) {
                    C0056m c0056m = (C0056m) obj2;
                    if (c0056m.f1447e == null) {
                        C0056m a4 = C0056m.a(c0056m, null, cancellationException, 15);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a4)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                break;
                            }
                        }
                        F f2 = c0056m.f1444b;
                        if (f2 != null) {
                            k(f2, cancellationException);
                        }
                        M2.l lVar = c0056m.f1445c;
                        if (lVar != null) {
                            n(lVar, cancellationException);
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Must be called at most once");
                }
                C0056m c0056m2 = new C0056m(obj2, (F) null, (M2.l) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0056m2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            throw new IllegalStateException("Not completed");
        }
    }

    @Override // F2.c
    public final F2.c c() {
        D2.d dVar = this.f1436M;
        if (dVar instanceof F2.c) {
            return (F2.c) dVar;
        }
        return null;
    }

    @Override // V2.C
    public final D2.d d() {
        return this.f1436M;
    }

    @Override // D2.d
    public final D2.i e() {
        return this.f1437N;
    }

    @Override // V2.C
    public final Throwable f(Object obj) {
        Throwable f2 = super.f(obj);
        if (f2 == null) {
            return null;
        }
        return f2;
    }

    @Override // V2.C
    public final Object g(Object obj) {
        if (obj instanceof C0056m) {
            return ((C0056m) obj).f1443a;
        }
        return obj;
    }

    @Override // D2.d
    public final void i(Object obj) {
        Throwable a4 = B2.e.a(obj);
        if (a4 != null) {
            obj = new C0057n(a4, false);
        }
        C(obj, this.f1389L, null);
    }

    @Override // V2.C
    public final Object j() {
        return f1434P.get(this);
    }

    public final void k(F f2, Throwable th) {
        try {
            f2.b(th);
        } catch (Throwable th2) {
            AbstractC0066x.d(this.f1437N, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // V2.InterfaceC0049e
    public final void l(Object obj, M2.l lVar) {
        C(obj, this.f1389L, lVar);
    }

    @Override // V2.InterfaceC0049e
    public final U1.b m(Object obj, M2.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1434P;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj2 instanceof f0;
            U1.b bVar = AbstractC0066x.f1464a;
            if (z3) {
                Object D3 = D((f0) obj2, obj, this.f1389L, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, D3)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!y()) {
                    r();
                    return bVar;
                }
                return bVar;
            }
            boolean z4 = obj2 instanceof C0056m;
            return null;
        }
    }

    public final void n(M2.l lVar, Throwable th) {
        try {
            lVar.h(th);
        } catch (Throwable th2) {
            AbstractC0066x.d(this.f1437N, new RuntimeException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // V2.InterfaceC0049e
    public final void o(Object obj) {
        s(this.f1389L);
    }

    public final void p(a3.u uVar, Throwable th) {
        D2.i iVar = this.f1437N;
        int r02 = f1433O.get(this) & 536870911;
        if (r02 != 536870911) {
            try {
                uVar.g(r02, iVar);
                return;
            } catch (Throwable th2) {
                AbstractC0066x.d(iVar, new RuntimeException("Exception in invokeOnCancellation handler for " + this, th2));
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
    }

    public final void q(Throwable th) {
        boolean z3;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1434P;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof f0)) {
                return;
            }
            if (!(obj instanceof F) && !(obj instanceof a3.u)) {
                z3 = false;
            } else {
                z3 = true;
            }
            C0051g c0051g = new C0051g(this, th, z3);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0051g)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            f0 f0Var = (f0) obj;
            if (f0Var instanceof F) {
                k((F) obj, th);
            } else if (f0Var instanceof a3.u) {
                p((a3.u) obj, th);
            }
            if (!y()) {
                r();
            }
            s(this.f1389L);
            return;
        }
    }

    public final void r() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1435Q;
        E e4 = (E) atomicReferenceFieldUpdater.get(this);
        if (e4 == null) {
            return;
        }
        e4.c();
        atomicReferenceFieldUpdater.set(this, e0.f1432J);
    }

    public final void s(int r8) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int r12;
        boolean z3;
        do {
            atomicIntegerFieldUpdater = f1433O;
            r12 = atomicIntegerFieldUpdater.get(this);
            int r22 = r12 >> 29;
            if (r22 != 0) {
                if (r22 == 1) {
                    if (r8 == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    D2.d dVar = this.f1436M;
                    if (!z3 && (dVar instanceof a3.h) && AbstractC0066x.f(r8) == AbstractC0066x.f(this.f1389L)) {
                        AbstractC0061s abstractC0061s = ((a3.h) dVar).f1857M;
                        D2.i e4 = ((a3.h) dVar).f1858N.e();
                        if (abstractC0061s.l()) {
                            abstractC0061s.h(e4, this);
                            return;
                        }
                        J a4 = k0.a();
                        if (a4.f1398L >= 4294967296L) {
                            C2.g gVar = a4.f1400N;
                            if (gVar == null) {
                                gVar = new C2.g();
                                a4.f1400N = gVar;
                            }
                            gVar.addLast(this);
                            return;
                        }
                        a4.p(true);
                        try {
                            AbstractC0066x.i(this, dVar, true);
                            do {
                            } while (a4.r());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                    AbstractC0066x.i(this, dVar, z3);
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, r12, 1073741824 + (536870911 & r12)));
    }

    public Throwable t(b0 b0Var) {
        return b0Var.A();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(A());
        sb.append('(');
        sb.append(AbstractC0066x.k(this.f1436M));
        sb.append("){");
        Object obj = f1434P.get(this);
        if (obj instanceof f0) {
            str = "Active";
        } else if (obj instanceof C0051g) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(AbstractC0066x.b(this));
        return sb.toString();
    }

    public final Object u() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int r22;
        boolean y3 = y();
        do {
            atomicIntegerFieldUpdater = f1433O;
            r22 = atomicIntegerFieldUpdater.get(this);
            int r3 = r22 >> 29;
            if (r3 != 0) {
                if (r3 == 2) {
                    if (y3) {
                        B();
                    }
                    Object obj = f1434P.get(this);
                    if (!(obj instanceof C0057n)) {
                        if (AbstractC0066x.f(this.f1389L)) {
                            S s3 = (S) this.f1437N.f(C0062t.f1462K);
                            if (s3 != null && !s3.b()) {
                                CancellationException A3 = ((b0) s3).A();
                                b(obj, A3);
                                throw A3;
                            }
                        }
                        return g(obj);
                    }
                    throw ((C0057n) obj).f1450a;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, r22, 536870912 + (536870911 & r22)));
        if (((E) f1435Q.get(this)) == null) {
            w();
        }
        if (y3) {
            B();
        }
        return E2.a.COROUTINE_SUSPENDED;
    }

    public final void v() {
        E w3 = w();
        if (w3 != null && !(f1434P.get(this) instanceof f0)) {
            w3.c();
            f1435Q.set(this, e0.f1432J);
        }
    }

    public final E w() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        S s3 = (S) this.f1437N.f(C0062t.f1462K);
        if (s3 == null) {
            return null;
        }
        E e4 = AbstractC0066x.e(s3, true, new C0052h(this), 2);
        do {
            atomicReferenceFieldUpdater = f1435Q;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, e4)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return e4;
    }

    public final void x(f0 f0Var) {
        boolean z3;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1434P;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0046b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, f0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof F) {
                z3 = true;
            } else {
                z3 = obj instanceof a3.u;
            }
            Throwable th = null;
            if (!z3) {
                if (obj instanceof C0057n) {
                    C0057n c0057n = (C0057n) obj;
                    c0057n.getClass();
                    if (C0057n.f1449b.compareAndSet(c0057n, 0, 1)) {
                        if (obj instanceof C0051g) {
                            if (!(obj instanceof C0057n)) {
                                c0057n = null;
                            }
                            if (c0057n != null) {
                                th = c0057n.f1450a;
                            }
                            if (f0Var instanceof F) {
                                k((F) f0Var, th);
                                return;
                            }
                            N2.g.c(f0Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            p((a3.u) f0Var, th);
                            return;
                        }
                        return;
                    }
                    z(f0Var, obj);
                    throw null;
                } else if (obj instanceof C0056m) {
                    C0056m c0056m = (C0056m) obj;
                    if (c0056m.f1444b == null) {
                        if (f0Var instanceof a3.u) {
                            return;
                        }
                        N2.g.c(f0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        F f2 = (F) f0Var;
                        Throwable th2 = c0056m.f1447e;
                        if (th2 != null) {
                            k(f2, th2);
                            return;
                        }
                        C0056m a4 = C0056m.a(c0056m, f2, null, 29);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a4)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        return;
                    }
                    z(f0Var, obj);
                    throw null;
                } else if (f0Var instanceof a3.u) {
                    return;
                } else {
                    N2.g.c(f0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    C0056m c0056m2 = new C0056m(obj, (F) f0Var, (M2.l) null, (CancellationException) null, 28);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0056m2)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    return;
                }
            }
            z(f0Var, obj);
            throw null;
        }
    }

    public final boolean y() {
        if (this.f1389L == 2) {
            D2.d dVar = this.f1436M;
            N2.g.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (a3.h.f1856Q.get((a3.h) dVar) != null) {
                return true;
            }
        }
        return false;
    }
}
