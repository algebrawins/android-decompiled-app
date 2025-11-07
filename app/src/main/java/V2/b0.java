package V2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class b0 implements S, g0 {

    /* renamed from: J  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1426J = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, "_state");

    /* renamed from: K  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1427K = AtomicReferenceFieldUpdater.newUpdater(b0.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public b0(boolean z3) {
        G g;
        if (z3) {
            g = AbstractC0066x.f1471i;
        } else {
            g = AbstractC0066x.f1470h;
        }
        this._state = g;
    }

    public static C0053j M(a3.k kVar) {
        while (kVar.m()) {
            a3.k i3 = kVar.i();
            if (i3 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a3.k.f1867K;
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (a3.k) obj;
                    if (!kVar.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVar);
                }
            } else {
                kVar = i3;
            }
        }
        while (true) {
            kVar = kVar.l();
            if (!kVar.m()) {
                if (kVar instanceof C0053j) {
                    return (C0053j) kVar;
                }
                if (kVar instanceof d0) {
                    return null;
                }
            }
        }
    }

    public static String S(Object obj) {
        if (obj instanceof Z) {
            Z z3 = (Z) obj;
            if (z3.d()) {
                return "Cancelling";
            }
            if (!z3.e()) {
                return "Active";
            }
            return "Completing";
        } else if (obj instanceof N) {
            if (((N) obj).b()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof C0057n) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    public final CancellationException A() {
        Object E3 = E();
        CancellationException cancellationException = null;
        if (E3 instanceof Z) {
            Throwable c4 = ((Z) E3).c();
            if (c4 != null) {
                String concat = getClass().getSimpleName().concat(" is cancelling");
                if (c4 instanceof CancellationException) {
                    cancellationException = (CancellationException) c4;
                }
                if (cancellationException == null) {
                    if (concat == null) {
                        concat = v();
                    }
                    return new T(concat, c4, this);
                }
                return cancellationException;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (!(E3 instanceof N)) {
            if (E3 instanceof C0057n) {
                Throwable th = ((C0057n) E3).f1450a;
                if (th instanceof CancellationException) {
                    cancellationException = (CancellationException) th;
                }
                if (cancellationException == null) {
                    return new T(v(), th, this);
                }
                return cancellationException;
            }
            return new T(getClass().getSimpleName().concat(" has completed normally"), null, this);
        } else {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
    }

    public boolean B() {
        return true;
    }

    public boolean C() {
        return this instanceof C0055l;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [a3.k, V2.d0] */
    public final d0 D(N n3) {
        d0 f2 = n3.f();
        if (f2 == null) {
            if (n3 instanceof G) {
                return new a3.k();
            }
            if (n3 instanceof W) {
                Q((W) n3);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + n3).toString());
        }
        return f2;
    }

    public final Object E() {
        while (true) {
            Object obj = f1426J.get(this);
            if (!(obj instanceof a3.q)) {
                return obj;
            }
            ((a3.q) obj).a(this);
        }
    }

    public boolean F(Throwable th) {
        return false;
    }

    public final void H(S s3) {
        int R3;
        e0 e0Var = e0.f1432J;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1427K;
        if (s3 == null) {
            atomicReferenceFieldUpdater.set(this, e0Var);
            return;
        }
        b0 b0Var = (b0) s3;
        do {
            R3 = b0Var.R(b0Var.E());
            if (R3 == 0) {
                break;
            }
        } while (R3 != 1);
        i iVar = (i) AbstractC0066x.e(b0Var, true, new C0053j(this), 2);
        atomicReferenceFieldUpdater.set(this, iVar);
        if (!(E() instanceof N)) {
            iVar.c();
            atomicReferenceFieldUpdater.set(this, e0Var);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [a3.k, V2.d0] */
    public final E I(boolean z3, boolean z4, M2.l lVar) {
        W w3;
        M m3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0057n c0057n;
        Throwable th;
        Throwable th2 = null;
        if (z3) {
            if (lVar instanceof U) {
                w3 = (U) lVar;
            } else {
                w3 = null;
            }
            if (w3 == null) {
                w3 = new P(lVar);
            }
        } else {
            if (lVar instanceof W) {
                w3 = (W) lVar;
            } else {
                w3 = null;
            }
            if (w3 == null) {
                w3 = new Q(0, lVar);
            }
        }
        w3.f1410M = this;
        while (true) {
            Object E3 = E();
            if (E3 instanceof G) {
                G g = (G) E3;
                if (g.f1393J) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1426J;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, E3, w3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != E3) {
                            break;
                        }
                    }
                    return w3;
                }
                ?? kVar = new a3.k();
                if (g.f1393J) {
                    m3 = kVar;
                } else {
                    m3 = new M(kVar);
                }
                do {
                    atomicReferenceFieldUpdater = f1426J;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, g, m3)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == g);
            } else if (E3 instanceof N) {
                d0 f2 = ((N) E3).f();
                if (f2 == null) {
                    N2.g.c(E3, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    Q((W) E3);
                } else {
                    E e4 = e0.f1432J;
                    if (z3 && (E3 instanceof Z)) {
                        synchronized (E3) {
                            try {
                                th = ((Z) E3).c();
                                if (th != null) {
                                    if ((lVar instanceof C0053j) && !((Z) E3).e()) {
                                    }
                                }
                                if (p((N) E3, f2, w3)) {
                                    if (th == null) {
                                        return w3;
                                    }
                                    e4 = w3;
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z4) {
                            lVar.h(th);
                        }
                        return e4;
                    } else if (p((N) E3, f2, w3)) {
                        return w3;
                    }
                }
            } else {
                if (z4) {
                    if (E3 instanceof C0057n) {
                        c0057n = (C0057n) E3;
                    } else {
                        c0057n = null;
                    }
                    if (c0057n != null) {
                        th2 = c0057n.f1450a;
                    }
                    lVar.h(th2);
                }
                return e0.f1432J;
            }
        }
    }

    public boolean J() {
        return this instanceof C0047c;
    }

    public final boolean K(Object obj) {
        Object T3;
        do {
            T3 = T(E(), obj);
            if (T3 == AbstractC0066x.f1466c) {
                return false;
            }
            if (T3 == AbstractC0066x.f1467d) {
                return true;
            }
        } while (T3 == AbstractC0066x.f1468e);
        q(T3);
        return true;
    }

    public final Object L(Object obj) {
        Object T3;
        C0057n c0057n;
        do {
            T3 = T(E(), obj);
            if (T3 == AbstractC0066x.f1466c) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                if (obj instanceof C0057n) {
                    c0057n = (C0057n) obj;
                } else {
                    c0057n = null;
                }
                if (c0057n != null) {
                    th = c0057n.f1450a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (T3 == AbstractC0066x.f1468e);
        return T3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable, B2.b] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r6v0, types: [V2.b0, java.lang.Object] */
    public final void N(d0 d0Var, Throwable th) {
        Object k3 = d0Var.k();
        N2.g.c(k3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        a3.k kVar = (a3.k) k3;
        ?? r12 = 0;
        while (!kVar.equals(d0Var)) {
            if (kVar instanceof U) {
                W w3 = (W) kVar;
                try {
                    w3.o(th);
                } catch (Throwable th2) {
                    if (r12 != 0) {
                        G.i.a(r12, th2);
                    } else {
                        r12 = new RuntimeException("Exception in completion handler " + w3 + " for " + ((Object) this), th2);
                    }
                }
            }
            kVar = kVar.l();
            r12 = r12;
        }
        if (r12 != 0) {
            G(r12);
        }
        u(th);
    }

    public final void Q(W w3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        a3.k kVar = new a3.k();
        w3.getClass();
        a3.k.f1867K.lazySet(kVar, w3);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a3.k.f1866J;
        atomicReferenceFieldUpdater2.lazySet(kVar, w3);
        loop0: while (true) {
            if (w3.k() == w3) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(w3, w3, kVar)) {
                    if (atomicReferenceFieldUpdater2.get(w3) != w3) {
                        break;
                    }
                }
                kVar.j(w3);
                break loop0;
            }
            break;
        }
        a3.k l3 = w3.l();
        do {
            atomicReferenceFieldUpdater = f1426J;
            if (atomicReferenceFieldUpdater.compareAndSet(this, w3, l3)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == w3);
    }

    public final int R(Object obj) {
        boolean z3 = obj instanceof G;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1426J;
        if (z3) {
            if (((G) obj).f1393J) {
                return 0;
            }
            G g = AbstractC0066x.f1471i;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, g)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            P();
            return 1;
        } else if (!(obj instanceof M)) {
            return 0;
        } else {
            d0 d0Var = ((M) obj).f1402J;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, d0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            P();
            return 1;
        }
    }

    public final Object T(Object obj, Object obj2) {
        O o3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Z z3;
        C0057n c0057n;
        C0053j c0053j;
        if (!(obj instanceof N)) {
            return AbstractC0066x.f1466c;
        }
        if (((obj instanceof G) || (obj instanceof W)) && !(obj instanceof C0053j) && !(obj2 instanceof C0057n)) {
            N n3 = (N) obj;
            if (obj2 instanceof N) {
                o3 = new O((N) obj2);
            } else {
                o3 = obj2;
            }
            do {
                atomicReferenceFieldUpdater = f1426J;
                if (atomicReferenceFieldUpdater.compareAndSet(this, n3, o3)) {
                    O(obj2);
                    x(n3, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == n3);
            return AbstractC0066x.f1468e;
        }
        N n4 = (N) obj;
        d0 D3 = D(n4);
        if (D3 == null) {
            return AbstractC0066x.f1468e;
        }
        C0053j c0053j2 = null;
        if (n4 instanceof Z) {
            z3 = (Z) n4;
        } else {
            z3 = null;
        }
        if (z3 == null) {
            z3 = new Z(D3, null);
        }
        synchronized (z3) {
            if (z3.e()) {
                return AbstractC0066x.f1466c;
            }
            Z.f1416K.set(z3, 1);
            if (z3 != n4) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1426J;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, n4, z3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != n4) {
                        return AbstractC0066x.f1468e;
                    }
                }
            }
            boolean d4 = z3.d();
            if (obj2 instanceof C0057n) {
                c0057n = (C0057n) obj2;
            } else {
                c0057n = null;
            }
            if (c0057n != null) {
                z3.a(c0057n.f1450a);
            }
            Throwable c4 = z3.c();
            if (d4) {
                c4 = null;
            }
            if (c4 != null) {
                N(D3, c4);
            }
            if (n4 instanceof C0053j) {
                c0053j = (C0053j) n4;
            } else {
                c0053j = null;
            }
            if (c0053j == null) {
                d0 f2 = n4.f();
                if (f2 != null) {
                    c0053j2 = M(f2);
                }
            } else {
                c0053j2 = c0053j;
            }
            if (c0053j2 != null) {
                while (AbstractC0066x.e(c0053j2.f1440N, false, new Y(this, z3, c0053j2, obj2), 1) == e0.f1432J) {
                    c0053j2 = M(c0053j2);
                    if (c0053j2 == null) {
                        return z(z3, obj2);
                    }
                }
                return AbstractC0066x.f1467d;
            }
            return z(z3, obj2);
        }
    }

    @Override // V2.S
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new T(v(), null, this);
        }
        t(cancellationException);
    }

    @Override // V2.S
    public boolean b() {
        Object E3 = E();
        if ((E3 instanceof N) && ((N) E3).b()) {
            return true;
        }
        return false;
    }

    @Override // D2.i
    public final D2.g f(D2.h hVar) {
        return x1.Z.a(this, hVar);
    }

    @Override // D2.g
    public final D2.h getKey() {
        return C0062t.f1462K;
    }

    @Override // D2.i
    public final Object j(Object obj, M2.p pVar) {
        return pVar.g(obj, this);
    }

    @Override // D2.i
    public final D2.i k(D2.i iVar) {
        N2.g.e(iVar, "context");
        if (iVar == D2.j.f492J) {
            return this;
        }
        return (D2.i) iVar.j(this, new D2.b(1));
    }

    @Override // D2.i
    public final D2.i n(D2.h hVar) {
        return x1.Z.b(this, hVar);
    }

    public final boolean p(N n3, d0 d0Var, W w3) {
        char c4;
        a0 a0Var = new a0(w3, this, n3);
        do {
            a3.k i3 = d0Var.i();
            if (i3 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a3.k.f1867K;
                Object obj = atomicReferenceFieldUpdater.get(d0Var);
                while (true) {
                    i3 = (a3.k) obj;
                    if (!i3.m()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(i3);
                }
            }
            a3.k.f1867K.lazySet(w3, i3);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = a3.k.f1866J;
            atomicReferenceFieldUpdater2.lazySet(w3, d0Var);
            a0Var.f1422c = d0Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(i3, d0Var, a0Var)) {
                    if (a0Var.a(i3) == null) {
                        c4 = 1;
                    } else {
                        c4 = 2;
                    }
                } else if (atomicReferenceFieldUpdater2.get(i3) != d0Var) {
                    c4 = 0;
                    break;
                }
            }
            if (c4 == 1) {
                return true;
            }
        } while (c4 != 2);
        return false;
    }

    public void r(Object obj) {
        q(obj);
    }

    public final boolean s(Object obj) {
        boolean z3;
        U1.b bVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        U1.b bVar2 = AbstractC0066x.f1466c;
        if (C()) {
            do {
                Object E3 = E();
                if ((E3 instanceof N) && (!(E3 instanceof Z) || !((Z) E3).e())) {
                    bVar2 = T(E3, new C0057n(y(obj), false));
                } else {
                    bVar2 = AbstractC0066x.f1466c;
                    break;
                }
            } while (bVar2 == AbstractC0066x.f1468e);
            if (bVar2 == AbstractC0066x.f1467d) {
                return true;
            }
        }
        if (bVar2 == AbstractC0066x.f1466c) {
            Throwable th = null;
            Throwable th2 = null;
            loop1: while (true) {
                Object E4 = E();
                if (E4 instanceof Z) {
                    synchronized (E4) {
                        try {
                            Z z4 = (Z) E4;
                            z4.getClass();
                            if (Z.f1418M.get(z4) == AbstractC0066x.g) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                bVar = AbstractC0066x.f1469f;
                            } else {
                                boolean d4 = ((Z) E4).d();
                                if (th2 == null) {
                                    th2 = y(obj);
                                }
                                ((Z) E4).a(th2);
                                Throwable c4 = ((Z) E4).c();
                                if (!d4) {
                                    th = c4;
                                }
                                if (th != null) {
                                    N(((Z) E4).f1419J, th);
                                }
                                bVar = AbstractC0066x.f1466c;
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                } else if (E4 instanceof N) {
                    if (th2 == null) {
                        th2 = y(obj);
                    }
                    N n3 = (N) E4;
                    if (n3.b()) {
                        d0 D3 = D(n3);
                        if (D3 == null) {
                            continue;
                        } else {
                            Z z5 = new Z(D3, th2);
                            do {
                                atomicReferenceFieldUpdater = f1426J;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, n3, z5)) {
                                    N(D3, th2);
                                    bVar = AbstractC0066x.f1466c;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == n3);
                        }
                    } else {
                        Object T3 = T(E4, new C0057n(th2, false));
                        if (T3 != AbstractC0066x.f1466c) {
                            if (T3 != AbstractC0066x.f1468e) {
                                bVar2 = T3;
                                break;
                            }
                        } else {
                            throw new IllegalStateException(("Cannot happen in " + E4).toString());
                        }
                    }
                } else {
                    bVar = AbstractC0066x.f1469f;
                    break;
                }
            }
            bVar2 = bVar;
        }
        if (bVar2 != AbstractC0066x.f1466c && bVar2 != AbstractC0066x.f1467d) {
            if (bVar2 == AbstractC0066x.f1469f) {
                return false;
            }
            q(bVar2);
        }
        return true;
    }

    public void t(CancellationException cancellationException) {
        s(cancellationException);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + S(E()) + '}');
        sb.append('@');
        sb.append(AbstractC0066x.b(this));
        return sb.toString();
    }

    public final boolean u(Throwable th) {
        if (J()) {
            return true;
        }
        boolean z3 = th instanceof CancellationException;
        i iVar = (i) f1427K.get(this);
        if (iVar != null && iVar != e0.f1432J) {
            if (iVar.e(th) || z3) {
                return true;
            }
            return false;
        }
        return z3;
    }

    public String v() {
        return "Job was cancelled";
    }

    public boolean w(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (s(th) && B()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [B2.b, java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Throwable, B2.b] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r7v0, types: [V2.b0, java.lang.Object] */
    public final void x(N n3, Object obj) {
        C0057n c0057n;
        Throwable th;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1427K;
        i iVar = (i) atomicReferenceFieldUpdater.get(this);
        if (iVar != null) {
            iVar.c();
            atomicReferenceFieldUpdater.set(this, e0.f1432J);
        }
        ?? r12 = 0;
        if (obj instanceof C0057n) {
            c0057n = (C0057n) obj;
        } else {
            c0057n = null;
        }
        if (c0057n != null) {
            th = c0057n.f1450a;
        } else {
            th = null;
        }
        if (n3 instanceof W) {
            try {
                ((W) n3).o(th);
                return;
            } catch (Throwable th2) {
                G(new RuntimeException("Exception in completion handler " + n3 + " for " + ((Object) this), th2));
                return;
            }
        }
        d0 f2 = n3.f();
        if (f2 != null) {
            Object k3 = f2.k();
            N2.g.c(k3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            a3.k kVar = (a3.k) k3;
            while (!kVar.equals(f2)) {
                if (kVar instanceof W) {
                    W w3 = (W) kVar;
                    try {
                        w3.o(th);
                    } catch (Throwable th3) {
                        if (r12 != 0) {
                            G.i.a(r12, th3);
                        } else {
                            r12 = new RuntimeException("Exception in completion handler " + w3 + " for " + ((Object) this), th3);
                        }
                    }
                }
                kVar = kVar.l();
                r12 = r12;
            }
            if (r12 != 0) {
                G(r12);
            }
        }
    }

    public final Throwable y(Object obj) {
        Throwable th;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        b0 b0Var = (b0) ((g0) obj);
        Object E3 = b0Var.E();
        CancellationException cancellationException = null;
        if (E3 instanceof Z) {
            th = ((Z) E3).c();
        } else if (E3 instanceof C0057n) {
            th = ((C0057n) E3).f1450a;
        } else if (!(E3 instanceof N)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + E3).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = th;
        }
        if (cancellationException == null) {
            cancellationException = new T("Parent job is ".concat(S(E3)), th, b0Var);
        }
        return cancellationException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object z(Z z3, Object obj) {
        C0057n c0057n;
        Throwable th;
        Object obj2;
        Throwable th2 = null;
        if (obj instanceof C0057n) {
            c0057n = (C0057n) obj;
        } else {
            c0057n = null;
        }
        if (c0057n != null) {
            th = c0057n.f1450a;
        } else {
            th = null;
        }
        synchronized (z3) {
            z3.d();
            ArrayList<Throwable> g = z3.g(th);
            if (g.isEmpty()) {
                if (z3.d()) {
                    th2 = new T(v(), null, this);
                }
            } else {
                Iterator it = g.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (!(((Throwable) next) instanceof CancellationException)) {
                        th2 = next;
                        break;
                    }
                }
                th2 = th2;
                if (th2 == null) {
                    th2 = (Throwable) g.get(0);
                }
            }
            if (th2 != null && g.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g.size()));
                for (Throwable th3 : g) {
                    if (th3 != th2 && th3 != th2 && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        G.i.a(th2, th3);
                    }
                }
            }
        }
        if (th2 != null && th2 != th) {
            obj = new C0057n(th2, false);
        }
        if (th2 != null && (u(th2) || F(th2))) {
            N2.g.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C0057n.f1449b.compareAndSet((C0057n) obj, 0, 1);
        }
        O(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1426J;
        if (obj instanceof N) {
            obj2 = new O((N) obj);
        } else {
            obj2 = obj;
        }
        while (!atomicReferenceFieldUpdater.compareAndSet(this, z3, obj2) && atomicReferenceFieldUpdater.get(this) == z3) {
        }
        x(z3, obj);
        return obj;
    }

    public void P() {
    }

    public void G(B2.b bVar) {
        throw bVar;
    }

    public void O(Object obj) {
    }

    public void q(Object obj) {
    }
}
