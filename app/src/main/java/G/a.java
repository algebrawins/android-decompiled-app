package G;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class a implements Executor {

    /* renamed from: K  reason: collision with root package name */
    public static volatile a f663K;

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f664J;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f664J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
