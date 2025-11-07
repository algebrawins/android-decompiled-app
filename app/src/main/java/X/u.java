package x;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f5472J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ v f5473K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ String f5474L;

    public /* synthetic */ u(v vVar, String str, int r3) {
        this.f5472J = r3;
        this.f5473K = vVar;
        this.f5474L = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5472J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                this.f5473K.f5476b.onCameraAvailable(this.f5474L);
                return;
            default:
                this.f5473K.f5476b.onCameraUnavailable(this.f5474L);
                return;
        }
    }
}
