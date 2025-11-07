package V2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: V2.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0052h extends U {

    /* renamed from: N  reason: collision with root package name */
    public final C0050f f1439N;

    public C0052h(C0050f c0050f) {
        this.f1439N = c0050f;
    }

    @Override // M2.l
    public final /* bridge */ /* synthetic */ Object h(Object obj) {
        o((Throwable) obj);
        return B2.i.f210a;
    }

    @Override // V2.W
    public final void o(Throwable th) {
        b0 n3 = n();
        C0050f c0050f = this.f1439N;
        Throwable t3 = c0050f.t(n3);
        if (c0050f.y()) {
            D2.d dVar = c0050f.f1436M;
            N2.g.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            a3.h hVar = (a3.h) dVar;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a3.h.f1856Q;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                U1.b bVar = a3.a.f1846d;
                if (N2.g.a(obj, bVar)) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, bVar, t3)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != bVar) {
                            break;
                        }
                    }
                    return;
                } else if (!(obj instanceof Throwable)) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    return;
                }
            }
        }
        c0050f.q(t3);
        if (!c0050f.y()) {
            c0050f.r();
        }
    }
}
