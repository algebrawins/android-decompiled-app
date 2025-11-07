package V2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class P extends U {

    /* renamed from: O  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1404O = AtomicIntegerFieldUpdater.newUpdater(P.class, "_invoked");

    /* renamed from: N  reason: collision with root package name */
    public final M2.l f1405N;
    private volatile int _invoked;

    public P(M2.l lVar) {
        this.f1405N = lVar;
    }

    @Override // M2.l
    public final /* bridge */ /* synthetic */ Object h(Object obj) {
        o((Throwable) obj);
        return B2.i.f210a;
    }

    @Override // V2.W
    public final void o(Throwable th) {
        if (f1404O.compareAndSet(this, 0, 1)) {
            this.f1405N.h(th);
        }
    }
}
