package V2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class W extends a3.k implements E, N, M2.l {

    /* renamed from: M  reason: collision with root package name */
    public b0 f1410M;

    @Override // V2.N
    public final boolean b() {
        return true;
    }

    @Override // V2.E
    public final void c() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        b0 n3 = n();
        while (true) {
            Object E3 = n3.E();
            if (E3 instanceof W) {
                if (E3 == this) {
                    G g = AbstractC0066x.f1471i;
                    do {
                        atomicReferenceFieldUpdater2 = b0.f1426J;
                        if (atomicReferenceFieldUpdater2.compareAndSet(n3, E3, g)) {
                            return;
                        }
                    } while (atomicReferenceFieldUpdater2.get(n3) == E3);
                } else {
                    return;
                }
            } else if (!(E3 instanceof N) || ((N) E3).f() == null) {
                return;
            } else {
                while (true) {
                    Object k3 = k();
                    if (k3 instanceof a3.r) {
                        a3.k kVar = ((a3.r) k3).f1881a;
                        return;
                    } else if (k3 == this) {
                        a3.k kVar2 = (a3.k) k3;
                        return;
                    } else {
                        N2.g.c(k3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        a3.k kVar3 = (a3.k) k3;
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = a3.k.f1868L;
                        a3.r rVar = (a3.r) atomicReferenceFieldUpdater3.get(kVar3);
                        if (rVar == null) {
                            rVar = new a3.r(kVar3);
                            atomicReferenceFieldUpdater3.lazySet(kVar3, rVar);
                        }
                        do {
                            atomicReferenceFieldUpdater = a3.k.f1866J;
                            if (atomicReferenceFieldUpdater.compareAndSet(this, k3, rVar)) {
                                kVar3.i();
                                return;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == k3);
                    }
                }
            }
        }
    }

    @Override // V2.N
    public final d0 f() {
        return null;
    }

    public S getParent() {
        return n();
    }

    public final b0 n() {
        b0 b0Var = this.f1410M;
        if (b0Var != null) {
            return b0Var;
        }
        N2.g.g("job");
        throw null;
    }

    public abstract void o(Throwable th);

    @Override // a3.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0066x.b(this) + "[job@" + AbstractC0066x.b(n()) + ']';
    }
}
