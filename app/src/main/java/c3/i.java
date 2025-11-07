package c3;

import V2.K;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* loaded from: classes.dex */
public abstract class i extends K {

    /* renamed from: L  reason: collision with root package name */
    public d f2690L;

    @Override // V2.AbstractC0061s
    public final void h(D2.i iVar, Runnable runnable) {
        d dVar = this.f2690L;
        AtomicLongFieldUpdater atomicLongFieldUpdater = d.f2675Q;
        dVar.b(runnable, m.g, false);
    }
}
