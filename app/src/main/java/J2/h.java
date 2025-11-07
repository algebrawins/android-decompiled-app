package j2;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f3879J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ i f3880K;

    public /* synthetic */ h(i iVar, int r22) {
        this.f3879J = r22;
        this.f3880K = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3879J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                this.f3880K.b();
                return;
            default:
                this.f3880K.b();
                return;
        }
    }
}
