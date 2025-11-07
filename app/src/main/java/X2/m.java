package X2;

import D.C;
import V2.o0;

/* loaded from: classes.dex */
public final class m extends c {

    /* renamed from: U  reason: collision with root package name */
    public final a f1627U;

    public m(int r12, a aVar, M2.l lVar) {
        super(r12, lVar);
        this.f1627U = aVar;
        if (aVar != a.SUSPEND) {
            if (r12 >= 1) {
                return;
            }
            throw new IllegalArgumentException(C.v(r12, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
        }
        throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + N2.p.a(c.class).b() + " instead").toString());
    }

    public final Object D(Object obj, boolean z3) {
        k kVar;
        o0 o0Var;
        M2.l lVar;
        B2.b a4;
        a aVar = a.DROP_LATEST;
        B2.i iVar = B2.i.f210a;
        if (this.f1627U == aVar) {
            Object g = super.g(obj);
            if ((g instanceof i) && !(g instanceof h)) {
                if (z3 && (lVar = this.f1601K) != null && (a4 = a3.a.a(lVar, obj, null)) != null) {
                    throw a4;
                }
                return iVar;
            }
            return g;
        }
        U1.b bVar = e.f1606d;
        k kVar2 = (k) c.f1595P.get(this);
        while (true) {
            long andIncrement = c.f1591L.getAndIncrement(this);
            long j3 = andIncrement & 1152921504606846975L;
            boolean r3 = r(andIncrement, false);
            int r7 = e.f1604b;
            long j4 = r7;
            long j5 = j3 / j4;
            int r11 = (int) (j3 % j4);
            if (kVar2.f1884L != j5) {
                k b3 = c.b(this, j5, kVar2);
                if (b3 == null) {
                    if (r3) {
                        return new h(o());
                    }
                } else {
                    kVar = b3;
                }
            } else {
                kVar = kVar2;
            }
            int e4 = c.e(this, kVar, r11, obj, j3, bVar, r3);
            if (e4 != 0) {
                if (e4 != 1) {
                    if (e4 != 2) {
                        if (e4 != 3) {
                            if (e4 != 4) {
                                if (e4 == 5) {
                                    kVar.a();
                                }
                                kVar2 = kVar;
                            } else {
                                if (j3 < c.f1592M.get(this)) {
                                    kVar.a();
                                }
                                return new h(o());
                            }
                        } else {
                            throw new IllegalStateException("unexpected");
                        }
                    } else if (r3) {
                        kVar.h();
                        return new h(o());
                    } else {
                        if (bVar instanceof o0) {
                            o0Var = (o0) bVar;
                        } else {
                            o0Var = null;
                        }
                        if (o0Var != null) {
                            o0Var.a(kVar, r11 + r7);
                        }
                        j((kVar.f1884L * j4) + r11);
                        return iVar;
                    }
                } else {
                    return iVar;
                }
            } else {
                kVar.a();
                return iVar;
            }
        }
    }

    @Override // X2.c, X2.s
    public final Object d(D2.d dVar, Object obj) {
        B2.b a4;
        if (D(obj, true) instanceof h) {
            M2.l lVar = this.f1601K;
            if (lVar != null && (a4 = a3.a.a(lVar, obj, null)) != null) {
                G.i.a(a4, o());
                throw a4;
            }
            throw o();
        }
        return B2.i.f210a;
    }

    @Override // X2.c, X2.s
    public final Object g(Object obj) {
        return D(obj, false);
    }

    @Override // X2.c
    public final boolean t() {
        if (this.f1627U == a.DROP_OLDEST) {
            return true;
        }
        return false;
    }
}
