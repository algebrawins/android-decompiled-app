package a3;

import D.C;
import V2.AbstractC0061s;
import V2.AbstractC0066x;
import V2.C0057n;
import V2.C0058o;
import V2.C0062t;
import V2.J;
import V2.S;
import V2.b0;
import V2.j0;
import V2.k0;
import V2.m0;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final U1.b f1843a = new U1.b("NO_DECISION", 1);

    /* renamed from: b  reason: collision with root package name */
    public static final U1.b f1844b = new U1.b("CLOSED", 1);

    /* renamed from: c  reason: collision with root package name */
    public static final U1.b f1845c = new U1.b("UNDEFINED", 1);

    /* renamed from: d  reason: collision with root package name */
    public static final U1.b f1846d = new U1.b("REUSABLE_CLAIMED", 1);

    /* renamed from: e  reason: collision with root package name */
    public static final U1.b f1847e = new U1.b("CONDITION_FALSE", 1);

    /* renamed from: f  reason: collision with root package name */
    public static final U1.b f1848f = new U1.b("NO_THREAD_ELEMENTS", 1);

    /* JADX WARN: Type inference failed for: r4v1, types: [B2.b, java.lang.RuntimeException] */
    public static final B2.b a(M2.l lVar, Object obj, B2.b bVar) {
        try {
            lVar.h(obj);
        } catch (Throwable th) {
            if (bVar != null && bVar.getCause() != th) {
                G.i.a(bVar, th);
            } else {
                return new RuntimeException("Exception in undelivered element handler for " + obj, th);
            }
        }
        return bVar;
    }

    public static final Object b(u uVar, long j3, M2.p pVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (uVar.f1884L >= j3 && !uVar.c()) {
                return uVar;
            }
            Object obj = d.f1851J.get(uVar);
            U1.b bVar = f1844b;
            if (obj == bVar) {
                return bVar;
            }
            u uVar2 = (u) ((d) obj);
            if (uVar2 == null) {
                uVar2 = (u) pVar.g(Long.valueOf(uVar.f1884L + 1), uVar);
                do {
                    atomicReferenceFieldUpdater = d.f1851J;
                    if (atomicReferenceFieldUpdater.compareAndSet(uVar, null, uVar2)) {
                        if (uVar.c()) {
                            uVar.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(uVar) == null);
            }
            uVar = uVar2;
        }
    }

    public static final u c(Object obj) {
        if (obj != f1844b) {
            return (u) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(D2.i iVar, Throwable th) {
        Throwable runtimeException;
        for (W2.b bVar : f.f1854a) {
            try {
                bVar.h(iVar, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    G.i.a(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            G.i.a(th, new g(iVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean e(Object obj) {
        if (obj == f1844b) {
            return true;
        }
        return false;
    }

    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void g(D2.i iVar, Object obj) {
        if (obj == f1848f) {
            return;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            j0[] j0VarArr = zVar.f1893b;
            int length = j0VarArr.length - 1;
            if (length < 0) {
                return;
            }
            j0 j0Var = j0VarArr[length];
            N2.g.b(null);
            Object obj2 = zVar.f1892a[length];
            throw null;
        }
        Object j3 = iVar.j(null, x.f1888M);
        N2.g.c(j3, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        C.G(j3);
        throw null;
    }

    public static final void h(D2.d dVar, Object obj, M2.l lVar) {
        Object c0057n;
        m0 m0Var;
        if (dVar instanceof h) {
            h hVar = (h) dVar;
            Throwable a4 = B2.e.a(obj);
            if (a4 == null) {
                if (lVar != null) {
                    c0057n = new C0058o(obj, lVar);
                } else {
                    c0057n = obj;
                }
            } else {
                c0057n = new C0057n(a4, false);
            }
            F2.b bVar = hVar.f1858N;
            bVar.e();
            AbstractC0061s abstractC0061s = hVar.f1857M;
            if (abstractC0061s.l()) {
                hVar.f1859O = c0057n;
                hVar.f1389L = 1;
                abstractC0061s.h(bVar.e(), hVar);
                return;
            }
            J a5 = k0.a();
            if (a5.f1398L >= 4294967296L) {
                hVar.f1859O = c0057n;
                hVar.f1389L = 1;
                C2.g gVar = a5.f1400N;
                if (gVar == null) {
                    gVar = new C2.g();
                    a5.f1400N = gVar;
                }
                gVar.addLast(hVar);
                return;
            }
            a5.p(true);
            try {
                S s3 = (S) bVar.e().f(C0062t.f1462K);
                if (s3 != null && !s3.b()) {
                    CancellationException A3 = ((b0) s3).A();
                    hVar.b(c0057n, A3);
                    hVar.i(P1.a.a(A3));
                } else {
                    Object obj2 = hVar.f1860P;
                    D2.i e4 = bVar.e();
                    Object m3 = m(e4, obj2);
                    if (m3 != f1848f) {
                        m0Var = AbstractC0066x.m(bVar, e4, m3);
                    } else {
                        m0Var = null;
                    }
                    bVar.i(obj);
                    if (m0Var == null || m0Var.X()) {
                        g(e4, m3);
                    }
                }
                do {
                } while (a5.r());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        dVar.i(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long j(java.lang.String r22, long r23, long r25, long r27) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.a.j(java.lang.String, long, long, long):long");
    }

    public static int k(String str, int r8, int r9, int r10, int r11) {
        if ((r11 & 4) != 0) {
            r9 = 1;
        }
        if ((r11 & 8) != 0) {
            r10 = Integer.MAX_VALUE;
        }
        return (int) j(str, r8, r9, r10);
    }

    public static final Object l(D2.i iVar) {
        Object j3 = iVar.j(0, x.f1887L);
        N2.g.b(j3);
        return j3;
    }

    public static final Object m(D2.i iVar, Object obj) {
        if (obj == null) {
            obj = l(iVar);
        }
        if (obj == 0) {
            return f1848f;
        }
        if (obj instanceof Integer) {
            return iVar.j(new z(((Number) obj).intValue(), iVar), x.f1889N);
        }
        C.G(obj);
        throw null;
    }
}
