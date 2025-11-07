package V2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import x1.AbstractC0564a0;

/* loaded from: classes.dex */
public final class B extends a3.t {

    /* renamed from: N  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1388N = AtomicIntegerFieldUpdater.newUpdater(B.class, "_decision");
    private volatile int _decision;

    @Override // a3.t, V2.b0
    public final void q(Object obj) {
        r(obj);
    }

    @Override // a3.t, V2.b0
    public final void r(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f1388N;
            int r12 = atomicIntegerFieldUpdater.get(this);
            if (r12 != 0) {
                if (r12 == 1) {
                    a3.a.h(AbstractC0564a0.a(this.f1882M), AbstractC0066x.h(obj), null);
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
