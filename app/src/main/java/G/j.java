package G;

import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f681J;

    /* renamed from: K  reason: collision with root package name */
    public final Runnable f682K;

    public /* synthetic */ j(Runnable runnable, int r22) {
        this.f681J = r22;
        this.f682K = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f681J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                this.f682K.run();
                return;
            default:
                try {
                    this.f682K.run();
                    return;
                } catch (Exception e4) {
                    Log.e("TransportRuntime.".concat("Executor"), "Background execution failure.", e4);
                    return;
                }
        }
    }
}
