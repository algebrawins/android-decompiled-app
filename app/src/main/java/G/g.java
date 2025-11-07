package G;

import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import u1.HandlerC0477e;

/* loaded from: classes.dex */
public final class g implements Executor {

    /* renamed from: L  reason: collision with root package name */
    public static volatile g f674L;

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f675J;

    /* renamed from: K  reason: collision with root package name */
    public final Object f676K;

    public g(int r22) {
        this.f675J = r22;
        switch (r22) {
            case 1:
                this.f676K = new Handler(Looper.getMainLooper());
                return;
            default:
                this.f676K = Executors.newSingleThreadExecutor(new f(0));
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f675J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                ((ExecutorService) this.f676K).execute(runnable);
                return;
            case 1:
                ((HandlerC0477e) this.f676K).post(runnable);
                return;
            default:
                runnable.getClass();
                Handler handler = (Handler) this.f676K;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
        }
    }

    public g(Handler handler) {
        this.f675J = 2;
        this.f676K = handler;
    }
}
