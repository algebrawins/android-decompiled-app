package V2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import x1.AbstractC0592d4;
import x1.AbstractC0600e4;

/* renamed from: V2.x */
/* loaded from: classes.dex */
public abstract class AbstractC0066x {

    /* renamed from: a */
    public static final U1.b f1464a = new U1.b("RESUME_TOKEN", 1);

    /* renamed from: b */
    public static final U1.b f1465b = new U1.b("CLOSED_EMPTY", 1);

    /* renamed from: c */
    public static final U1.b f1466c = new U1.b("COMPLETING_ALREADY", 1);

    /* renamed from: d */
    public static final U1.b f1467d = new U1.b("COMPLETING_WAITING_CHILDREN", 1);

    /* renamed from: e */
    public static final U1.b f1468e = new U1.b("COMPLETING_RETRY", 1);

    /* renamed from: f */
    public static final U1.b f1469f = new U1.b("TOO_LATE_TO_CANCEL", 1);
    public static final U1.b g = new U1.b("SEALED", 1);

    /* renamed from: h */
    public static final G f1470h = new G(false);

    /* renamed from: i */
    public static final G f1471i = new G(true);

    public static final D2.i a(D2.i iVar, D2.i iVar2, boolean z3) {
        Boolean bool = Boolean.FALSE;
        C0059p c0059p = C0059p.f1455M;
        boolean booleanValue = ((Boolean) iVar.j(bool, c0059p)).booleanValue();
        boolean booleanValue2 = ((Boolean) iVar2.j(bool, c0059p)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return iVar.k(iVar2);
        }
        D2.j jVar = D2.j.f492J;
        D2.i iVar3 = (D2.i) iVar.j(jVar, new C0059p(2, 2));
        D2.i iVar4 = iVar2;
        if (booleanValue2) {
            iVar4 = iVar2.j(jVar, C0059p.f1454L);
        }
        return iVar3.k(iVar4);
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C0050f c(D2.d dVar) {
        C0050f c0050f;
        C0050f c0050f2;
        if (!(dVar instanceof a3.h)) {
            return new C0050f(1, dVar);
        }
        a3.h hVar = (a3.h) dVar;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a3.h.f1856Q;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            U1.b bVar = a3.a.f1846d;
            c0050f = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, bVar);
                c0050f2 = null;
                break;
            } else if (obj instanceof C0050f) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, bVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                c0050f2 = (C0050f) obj;
                break loop0;
            } else if (obj != bVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0050f2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0050f.f1434P;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0050f2);
            if ((obj2 instanceof C0056m) && ((C0056m) obj2).f1446d != null) {
                c0050f2.r();
            } else {
                C0050f.f1433O.set(c0050f2, 536870911);
                atomicReferenceFieldUpdater2.set(c0050f2, C0046b.f1425J);
                c0050f = c0050f2;
            }
            if (c0050f != null) {
                return c0050f;
            }
        }
        return new C0050f(2, dVar);
    }

    public static final void d(D2.i iVar, Throwable th) {
        try {
            W2.b bVar = (W2.b) iVar.f(C0062t.f1461J);
            if (bVar != null) {
                bVar.h(iVar, th);
            } else {
                a3.a.d(iVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                G.i.a(runtimeException, th);
                th = runtimeException;
            }
            a3.a.d(iVar, th);
        }
    }

    public static /* synthetic */ E e(S s3, boolean z3, W w3, int r5) {
        boolean z4 = false;
        if ((r5 & 1) != 0) {
            z3 = false;
        }
        if ((r5 & 2) != 0) {
            z4 = true;
        }
        return ((b0) s3).I(z3, z4, w3);
    }

    public static final boolean f(int r22) {
        if (r22 == 1 || r22 == 2) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [V2.a, V2.h0] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static h0 g(InterfaceC0063u interfaceC0063u, M2.p pVar) {
        c0 c0Var;
        D2.j jVar = D2.j.f492J;
        EnumC0065w enumC0065w = EnumC0065w.DEFAULT;
        D2.i a4 = a(interfaceC0063u.h(), jVar, true);
        c3.f fVar = D.f1390a;
        if (a4 != fVar && a4.f(D2.e.f491J) == null) {
            a4 = a4.k(fVar);
        }
        enumC0065w.getClass();
        if (enumC0065w == EnumC0065w.LAZY) {
            c0Var = new c0(a4, pVar);
        } else {
            c0Var = new AbstractC0045a(a4, true);
        }
        c0Var.W(enumC0065w, c0Var, pVar);
        return c0Var;
    }

    public static final Object h(Object obj) {
        if (obj instanceof C0057n) {
            return P1.a.a(((C0057n) obj).f1450a);
        }
        return obj;
    }

    public static final void i(C0050f c0050f, D2.d dVar, boolean z3) {
        Object g3;
        m0 m0Var;
        boolean X3;
        Object obj = C0050f.f1434P.get(c0050f);
        Throwable f2 = c0050f.f(obj);
        if (f2 != null) {
            g3 = P1.a.a(f2);
        } else {
            g3 = c0050f.g(obj);
        }
        if (z3) {
            N2.g.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            a3.h hVar = (a3.h) dVar;
            F2.b bVar = hVar.f1858N;
            D2.i e4 = bVar.e();
            Object m3 = a3.a.m(e4, hVar.f1860P);
            if (m3 != a3.a.f1848f) {
                m0Var = m(bVar, e4, m3);
            } else {
                m0Var = null;
            }
            try {
                bVar.i(g3);
                if (m0Var != null) {
                    if (!X3) {
                        return;
                    }
                }
                return;
            } finally {
                if (m0Var == null || m0Var.X()) {
                    a3.a.g(e4, m3);
                }
            }
        }
        dVar.i(g3);
    }

    public static Object j(M2.p pVar) {
        long j3;
        C0057n c0057n;
        D2.j jVar = D2.j.f492J;
        Thread currentThread = Thread.currentThread();
        D2.e eVar = D2.e.f491J;
        J a4 = k0.a();
        D2.i a5 = a(jVar, a4, true);
        c3.f fVar = D.f1390a;
        if (a5 != fVar && a5.f(eVar) == null) {
            a5 = a5.k(fVar);
        }
        C0047c c0047c = new C0047c(a5, currentThread, a4);
        c0047c.W(EnumC0065w.DEFAULT, c0047c, pVar);
        J j4 = c0047c.f1429N;
        if (j4 != null) {
            int r12 = J.f1397O;
            j4.p(false);
        }
        while (!Thread.interrupted()) {
            try {
                if (j4 != null) {
                    j3 = j4.q();
                } else {
                    j3 = Long.MAX_VALUE;
                }
                if (c0047c.E() instanceof N) {
                    LockSupport.parkNanos(c0047c, j3);
                } else {
                    if (j4 != null) {
                        int r13 = J.f1397O;
                        j4.m(false);
                    }
                    Object l3 = l(c0047c.E());
                    if (l3 instanceof C0057n) {
                        c0057n = (C0057n) l3;
                    } else {
                        c0057n = null;
                    }
                    if (c0057n == null) {
                        return l3;
                    }
                    throw c0057n.f1450a;
                }
            } catch (Throwable th) {
                if (j4 != null) {
                    int r22 = J.f1397O;
                    j4.m(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0047c.s(interruptedException);
        throw interruptedException;
    }

    public static final String k(D2.d dVar) {
        String str;
        if (dVar instanceof a3.h) {
            return dVar.toString();
        }
        try {
            str = dVar + '@' + b(dVar);
        } catch (Throwable th) {
            str = P1.a.a(th);
        }
        Throwable a4 = B2.e.a(str);
        String str2 = str;
        if (a4 != null) {
            str2 = dVar.getClass().getName() + '@' + b(dVar);
        }
        return (String) str2;
    }

    public static final Object l(Object obj) {
        O o3;
        N n3;
        if (obj instanceof O) {
            o3 = (O) obj;
        } else {
            o3 = null;
        }
        if (o3 != null && (n3 = o3.f1403a) != null) {
            return n3;
        }
        return obj;
    }

    public static final m0 m(D2.d dVar, D2.i iVar, Object obj) {
        m0 m0Var = null;
        if (!(dVar instanceof F2.c)) {
            return null;
        }
        if (iVar.f(n0.f1451J) != null) {
            F2.c cVar = (F2.c) dVar;
            while (true) {
                if (!(cVar instanceof B) && (cVar = cVar.c()) != null) {
                    if (cVar instanceof m0) {
                        m0Var = (m0) cVar;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (m0Var != null) {
                m0Var.Y(iVar, obj);
            }
        }
        return m0Var;
    }

    public static final Object n(D2.i iVar, M2.p pVar, F2.g gVar) {
        D2.i a4;
        Object l3;
        D2.i iVar2 = gVar.f655K;
        N2.g.b(iVar2);
        if (!((Boolean) iVar.j(Boolean.FALSE, C0059p.f1455M)).booleanValue()) {
            a4 = iVar2.k(iVar);
        } else {
            a4 = a(iVar2, iVar, false);
        }
        S s3 = (S) a4.f(C0062t.f1462K);
        if (s3 != null && !s3.b()) {
            throw ((b0) s3).A();
        }
        if (a4 == iVar2) {
            a3.t tVar = new a3.t(gVar, a4);
            l3 = AbstractC0600e4.a(tVar, tVar, pVar);
        } else {
            D2.e eVar = D2.e.f491J;
            if (N2.g.a(a4.f(eVar), iVar2.f(eVar))) {
                m0 m0Var = new m0(a4, gVar);
                D2.i iVar3 = m0Var.f1420L;
                Object m3 = a3.a.m(iVar3, null);
                try {
                    Object a5 = AbstractC0600e4.a(m0Var, m0Var, pVar);
                    a3.a.g(iVar3, m3);
                    l3 = a5;
                } catch (Throwable th) {
                    a3.a.g(iVar3, m3);
                    throw th;
                }
            } else {
                a3.t tVar2 = new a3.t(gVar, a4);
                AbstractC0592d4.a(pVar, tVar2, tVar2);
                while (true) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = B.f1388N;
                    int r5 = atomicIntegerFieldUpdater.get(tVar2);
                    if (r5 != 0) {
                        if (r5 == 2) {
                            l3 = l(tVar2.E());
                            if (l3 instanceof C0057n) {
                                throw ((C0057n) l3).f1450a;
                            }
                        } else {
                            throw new IllegalStateException("Already suspended");
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(tVar2, 0, 1)) {
                        l3 = E2.a.COROUTINE_SUSPENDED;
                        break;
                    }
                }
            }
        }
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        return l3;
    }
}
