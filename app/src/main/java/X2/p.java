package X2;

import V2.AbstractC0045a;
import V2.AbstractC0066x;
import V2.C0057n;
import V2.T;
import V2.Z;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class p extends AbstractC0045a implements q, g {

    /* renamed from: M  reason: collision with root package name */
    public final c f1633M;

    public p(D2.i iVar, c cVar) {
        super(iVar, true);
        this.f1633M = cVar;
    }

    @Override // V2.AbstractC0045a
    public final void U(Throwable th, boolean z3) {
        if (!this.f1633M.h(th, false) && !z3) {
            AbstractC0066x.d(this.f1420L, th);
        }
    }

    @Override // V2.AbstractC0045a
    public final void V(Object obj) {
        B2.i iVar = (B2.i) obj;
        this.f1633M.h(null, false);
    }

    public final void X(o oVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c cVar = this.f1633M;
        cVar.getClass();
        do {
            atomicReferenceFieldUpdater = c.f1599T;
            if (atomicReferenceFieldUpdater.compareAndSet(cVar, null, oVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(cVar) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(cVar);
            U1.b bVar = e.f1618q;
            if (obj == bVar) {
                U1.b bVar2 = e.f1619r;
                while (!atomicReferenceFieldUpdater.compareAndSet(cVar, bVar, bVar2)) {
                    if (atomicReferenceFieldUpdater.get(cVar) != bVar) {
                        break;
                    }
                }
                oVar.h(cVar.m());
                return;
            } else if (obj == e.f1619r) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            } else {
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        }
    }

    @Override // V2.b0, V2.S
    public final void a(CancellationException cancellationException) {
        Object E3 = E();
        if (!(E3 instanceof C0057n)) {
            if (!(E3 instanceof Z) || !((Z) E3).d()) {
                if (cancellationException == null) {
                    cancellationException = new T(v(), null, this);
                }
                t(cancellationException);
            }
        }
    }

    @Override // X2.s
    public final Object d(D2.d dVar, Object obj) {
        return this.f1633M.d(dVar, obj);
    }

    @Override // X2.s
    public final Object g(Object obj) {
        return this.f1633M.g(obj);
    }

    @Override // V2.b0
    public final void t(CancellationException cancellationException) {
        this.f1633M.h(cancellationException, true);
        s(cancellationException);
    }
}
