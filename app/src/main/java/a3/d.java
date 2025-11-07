package a3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: J  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1851J = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_next");

    /* renamed from: K  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1852K = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public d(u uVar) {
        this._prev = uVar;
    }

    public final void a() {
        f1852K.lazySet(this, null);
    }

    public final d b() {
        Object obj = f1851J.get(this);
        if (obj == a.f1844b) {
            return null;
        }
        return (d) obj;
    }

    public abstract boolean c();

    public final void d() {
        d dVar;
        d b3;
        if (b() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1852K;
            d dVar2 = (d) atomicReferenceFieldUpdater.get(this);
            while (dVar2 != null && dVar2.c()) {
                dVar2 = (d) atomicReferenceFieldUpdater.get(dVar2);
            }
            d b4 = b();
            N2.g.b(b4);
            while (b4.c() && (b3 = b4.b()) != null) {
                b4 = b3;
            }
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(b4);
                if (((d) obj) == null) {
                    dVar = null;
                } else {
                    dVar = dVar2;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(b4, obj, dVar)) {
                    if (atomicReferenceFieldUpdater.get(b4) != obj) {
                        break;
                    }
                }
            }
            if (dVar2 != null) {
                f1851J.set(dVar2, b4);
            }
            if (!b4.c() || b4.b() == null) {
                if (dVar2 == null || !dVar2.c()) {
                    return;
                }
            }
        }
    }
}
