package D;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements Runnable {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f401J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ A.k f402K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ C0030k f403L;

    public /* synthetic */ h0(A.k kVar, C0030k c0030k, int r3) {
        this.f401J = r3;
        this.f402K = kVar;
        this.f403L = c0030k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f401J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                this.f402K.c(this.f403L);
                return;
            default:
                this.f402K.c(this.f403L);
                return;
        }
    }
}
