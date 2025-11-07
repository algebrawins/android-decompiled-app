package y0;

import android.content.Context;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f6218J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ Context f6219K;

    public /* synthetic */ g(Context context, int r22) {
        this.f6218J = r22;
        this.f6219K = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6218J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new g(this.f6219K, 1));
                return;
            default:
                f.s(this.f6219K, new Object(), f.f6209a, false);
                return;
        }
    }
}
