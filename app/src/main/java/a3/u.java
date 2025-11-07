package a3;

import V2.f0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public abstract class u extends d implements f0 {

    /* renamed from: M  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1883M = AtomicIntegerFieldUpdater.newUpdater(u.class, "cleanedAndPointers");

    /* renamed from: L  reason: collision with root package name */
    public final long f1884L;
    private volatile int cleanedAndPointers;

    public u(long j3, u uVar, int r4) {
        super(uVar);
        this.f1884L = j3;
        this.cleanedAndPointers = r4 << 16;
    }

    @Override // a3.d
    public final boolean c() {
        if (f1883M.get(this) == f() && b() != null) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (f1883M.addAndGet(this, -65536) == f() && b() != null) {
            return true;
        }
        return false;
    }

    public abstract int f();

    public abstract void g(int r12, D2.i iVar);

    public final void h() {
        if (f1883M.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int r12;
        do {
            atomicIntegerFieldUpdater = f1883M;
            r12 = atomicIntegerFieldUpdater.get(this);
            if (r12 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, r12, 65536 + r12));
        return true;
    }
}
