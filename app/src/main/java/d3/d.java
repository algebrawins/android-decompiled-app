package d3;

import V2.AbstractC0066x;
import V2.C0050f;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import x1.AbstractC0564a0;

/* loaded from: classes.dex */
public final class d extends h implements a {
    public static final AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner");
    private volatile Object owner;

    public d(boolean z3) {
        super(z3 ? 1 : 0);
        U1.b bVar;
        if (z3) {
            bVar = null;
        } else {
            bVar = e.f3069a;
        }
        this.owner = bVar;
    }

    public final Object c(F2.b bVar) {
        boolean d4 = d(null);
        B2.i iVar = B2.i.f210a;
        if (!d4) {
            C0050f c4 = AbstractC0066x.c(AbstractC0564a0.a(bVar));
            try {
                a(new c(this, c4));
                Object u3 = c4.u();
                E2.a aVar = E2.a.COROUTINE_SUSPENDED;
                if (u3 != aVar) {
                    u3 = iVar;
                }
                if (u3 == aVar) {
                    return u3;
                }
                return iVar;
            } catch (Throwable th) {
                c4.B();
                throw th;
            }
        }
        return iVar;
    }

    public final boolean d(Object obj) {
        int r12;
        char c4;
        char c5;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f3076f;
            int r13 = atomicIntegerFieldUpdater.get(this);
            if (r13 > 1) {
                do {
                    r12 = atomicIntegerFieldUpdater.get(this);
                    if (r12 > 1) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, r12, 1));
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
                if (r13 <= 0) {
                    if (obj != null) {
                        while (true) {
                            if (Math.max(atomicIntegerFieldUpdater.get(this), 0) == 0) {
                                Object obj2 = atomicReferenceFieldUpdater.get(this);
                                if (obj2 != e.f3069a) {
                                    if (obj2 == obj) {
                                        c5 = 1;
                                    } else {
                                        c5 = 2;
                                    }
                                }
                            } else {
                                c5 = 0;
                                break;
                            }
                        }
                        if (c5 != 1) {
                            if (c5 == 2) {
                                break;
                            }
                        } else {
                            c4 = 2;
                            break;
                        }
                    } else {
                        break;
                    }
                } else if (atomicIntegerFieldUpdater.compareAndSet(this, r13, r13 - 1)) {
                    atomicReferenceFieldUpdater.set(this, obj);
                    c4 = 0;
                    break;
                }
            }
        }
        c4 = 1;
        if (c4 == 0) {
            return true;
        }
        if (c4 != 1) {
            if (c4 != 2) {
                throw new IllegalStateException("unexpected");
            }
            throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
        }
        return false;
    }

    public final void e(Object obj) {
        while (Math.max(h.f3076f.get(this), 0) == 0) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            U1.b bVar = e.f3069a;
            if (obj2 != bVar) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, bVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                b();
                return;
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mutex@");
        sb.append(AbstractC0066x.b(this));
        sb.append("[isLocked=");
        boolean z3 = false;
        if (Math.max(h.f3076f.get(this), 0) == 0) {
            z3 = true;
        }
        sb.append(z3);
        sb.append(",owner=");
        sb.append(g.get(this));
        sb.append(']');
        return sb.toString();
    }
}
