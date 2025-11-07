package Z2;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: J  reason: collision with root package name */
    public c[] f1773J;

    /* renamed from: K  reason: collision with root package name */
    public int f1774K;

    /* renamed from: L  reason: collision with root package name */
    public int f1775L;

    public final void a(Y2.s sVar) {
        synchronized (this) {
            try {
                int r02 = this.f1774K - 1;
                this.f1774K = r02;
                if (r02 == 0) {
                    this.f1775L = 0;
                }
                N2.g.c(sVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                Y2.q qVar = (Y2.q) this;
                Y2.s.f1742a.set(sVar, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
