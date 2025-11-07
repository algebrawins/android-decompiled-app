package w;

/* renamed from: w.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0509t implements Runnable {

    /* renamed from: J  reason: collision with root package name */
    public final G.l f5234J;

    /* renamed from: K  reason: collision with root package name */
    public boolean f5235K = false;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ C0510u f5236L;

    public RunnableC0509t(C0510u c0510u, G.l lVar) {
        this.f5236L = c0510u;
        this.f5234J = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5234J.execute(new D.N(19, this));
    }
}
