package a3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1869a = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_cur");
    private volatile Object _cur = new n(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1869a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            int a4 = nVar.a(runnable);
            if (a4 == 0) {
                return true;
            }
            if (a4 != 1) {
                if (a4 == 2) {
                    return false;
                }
            } else {
                n c4 = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c4) && atomicReferenceFieldUpdater.get(this) == nVar) {
                }
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1869a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar.b()) {
                return;
            }
            n c4 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c4) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }

    public final int c() {
        n nVar = (n) f1869a.get(this);
        nVar.getClass();
        long j3 = n.f1872f.get(nVar);
        return 1073741823 & (((int) ((j3 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j3)));
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1869a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            Object d4 = nVar.d();
            if (d4 != n.g) {
                return d4;
            }
            n c4 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c4) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }
}
