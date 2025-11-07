package N;

import com.google.android.libraries.barhopper.RecognitionOptions;
import x1.AbstractC0636k0;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f919J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ m f920K;

    public /* synthetic */ i(m mVar, int r22) {
        this.f919J = r22;
        this.f920K = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f919J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                m mVar = this.f920K;
                mVar.getClass();
                AbstractC0636k0.d().execute(new i(mVar, 2));
                return;
            case 1:
                this.f920K.c();
                return;
            default:
                m mVar2 = this.f920K;
                if (!mVar2.f947n) {
                    mVar2.d();
                    return;
                }
                return;
        }
    }
}
