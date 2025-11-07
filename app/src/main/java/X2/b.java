package X2;

import V2.AbstractC0066x;
import V2.C0050f;
import V2.o0;
import a3.u;
import a3.v;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import x1.AbstractC0564a0;

/* loaded from: classes.dex */
public final class b implements o0 {

    /* renamed from: J  reason: collision with root package name */
    public Object f1588J = e.f1617p;

    /* renamed from: K  reason: collision with root package name */
    public C0050f f1589K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ c f1590L;

    public b(c cVar) {
        this.f1590L = cVar;
    }

    @Override // V2.o0
    public final void a(u uVar, int r3) {
        C0050f c0050f = this.f1589K;
        if (c0050f != null) {
            c0050f.a(uVar, r3);
        }
    }

    public final Object b(Y2.f fVar) {
        C0050f c0050f;
        Boolean bool;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c.f1596Q;
        c cVar = this.f1590L;
        k kVar = (k) atomicReferenceFieldUpdater.get(cVar);
        while (true) {
            cVar.getClass();
            if (cVar.r(c.f1591L.get(cVar), true)) {
                this.f1588J = e.f1613l;
                Throwable m3 = cVar.m();
                if (m3 == null) {
                    return Boolean.FALSE;
                }
                int r12 = v.f1885a;
                throw m3;
            }
            long andIncrement = c.f1592M.getAndIncrement(cVar);
            long j3 = e.f1604b;
            long j4 = andIncrement / j3;
            int r122 = (int) (andIncrement % j3);
            if (kVar.f1884L != j4) {
                k l3 = cVar.l(j4, kVar);
                if (l3 == null) {
                    continue;
                } else {
                    kVar = l3;
                }
            }
            Object A3 = cVar.A(kVar, r122, andIncrement, null);
            U1.b bVar = e.f1614m;
            if (A3 != bVar) {
                U1.b bVar2 = e.f1616o;
                if (A3 == bVar2) {
                    if (andIncrement < cVar.p()) {
                        kVar.a();
                    }
                } else if (A3 == e.f1615n) {
                    c cVar2 = this.f1590L;
                    C0050f c4 = AbstractC0066x.c(AbstractC0564a0.a(fVar));
                    try {
                        this.f1589K = c4;
                        c0050f = c4;
                    } catch (Throwable th) {
                        th = th;
                        c0050f = c4;
                    }
                    try {
                        Object A4 = cVar2.A(kVar, r122, andIncrement, this);
                        if (A4 == bVar) {
                            a(kVar, r122);
                        } else {
                            a3.p pVar = null;
                            D2.i iVar = c0050f.f1437N;
                            M2.l lVar = cVar2.f1601K;
                            if (A4 == bVar2) {
                                if (andIncrement < cVar2.p()) {
                                    kVar.a();
                                }
                                k kVar2 = (k) c.f1596Q.get(cVar2);
                                while (true) {
                                    if (cVar2.r(c.f1591L.get(cVar2), true)) {
                                        C0050f c0050f2 = this.f1589K;
                                        N2.g.b(c0050f2);
                                        this.f1589K = null;
                                        this.f1588J = e.f1613l;
                                        Throwable m4 = cVar.m();
                                        if (m4 == null) {
                                            c0050f2.i(Boolean.FALSE);
                                        } else {
                                            c0050f2.i(P1.a.a(m4));
                                        }
                                    } else {
                                        long andIncrement2 = c.f1592M.getAndIncrement(cVar2);
                                        long j5 = e.f1604b;
                                        long j6 = andIncrement2 / j5;
                                        int r11 = (int) (andIncrement2 % j5);
                                        if (kVar2.f1884L != j6) {
                                            k l4 = cVar2.l(j6, kVar2);
                                            if (l4 != null) {
                                                kVar2 = l4;
                                            }
                                        }
                                        M2.l lVar2 = lVar;
                                        Object A5 = cVar2.A(kVar2, r11, andIncrement2, this);
                                        if (A5 == e.f1614m) {
                                            a(kVar2, r11);
                                            break;
                                        } else if (A5 == e.f1616o) {
                                            if (andIncrement2 < cVar2.p()) {
                                                kVar2.a();
                                            }
                                            lVar = lVar2;
                                        } else if (A5 != e.f1615n) {
                                            kVar2.a();
                                            this.f1588J = A5;
                                            this.f1589K = null;
                                            bool = Boolean.TRUE;
                                            if (lVar2 != null) {
                                                pVar = new a3.p(lVar2, A5, iVar);
                                            }
                                        } else {
                                            throw new IllegalStateException("unexpected");
                                        }
                                    }
                                }
                            } else {
                                kVar.a();
                                this.f1588J = A4;
                                this.f1589K = null;
                                bool = Boolean.TRUE;
                                if (lVar != null) {
                                    pVar = new a3.p(lVar, A4, iVar);
                                }
                            }
                            c0050f.l(bool, pVar);
                        }
                        Object u3 = c0050f.u();
                        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
                        return u3;
                    } catch (Throwable th2) {
                        th = th2;
                        c0050f.B();
                        throw th;
                    }
                } else {
                    kVar.a();
                    this.f1588J = A3;
                    return Boolean.TRUE;
                }
            } else {
                throw new IllegalStateException("unreachable");
            }
        }
    }
}
