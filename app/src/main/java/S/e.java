package S;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import x1.AbstractC0691r0;

/* loaded from: classes.dex */
public final class e extends AbstractC0691r0 {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f1172a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f1173b;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f1174c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f1175d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f1176e;

    public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f1172a = atomicReferenceFieldUpdater;
        this.f1173b = atomicReferenceFieldUpdater2;
        this.f1174c = atomicReferenceFieldUpdater3;
        this.f1175d = atomicReferenceFieldUpdater4;
        this.f1176e = atomicReferenceFieldUpdater5;
    }

    @Override // x1.AbstractC0691r0
    public final boolean a(h hVar, d dVar, d dVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f1175d;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, dVar, dVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == dVar);
        return false;
    }

    @Override // x1.AbstractC0691r0
    public final boolean b(h hVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f1176e;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == obj);
        return false;
    }

    @Override // x1.AbstractC0691r0
    public final boolean c(h hVar, g gVar, g gVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f1174c;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, gVar, gVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == gVar);
        return false;
    }

    @Override // x1.AbstractC0691r0
    public final void d(g gVar, g gVar2) {
        this.f1173b.lazySet(gVar, gVar2);
    }

    @Override // x1.AbstractC0691r0
    public final void e(g gVar, Thread thread) {
        this.f1172a.lazySet(gVar, thread);
    }
}
