package j1;

/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f3813J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ m f3814K;

    public l(m mVar, int r22) {
        this.f3814K = mVar;
        this.f3813J = r22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3814K.f(this.f3813J);
    }
}
