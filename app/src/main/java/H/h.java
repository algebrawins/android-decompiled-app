package H;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import x1.X;

/* loaded from: classes.dex */
public class h implements E1.a {

    /* renamed from: L  reason: collision with root package name */
    public static final h f701L = new h(0, null);

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f702J;

    /* renamed from: K  reason: collision with root package name */
    public final Object f703K;

    public /* synthetic */ h(int r12, Object obj) {
        this.f702J = r12;
        this.f703K = obj;
    }

    @Override // E1.a
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            X.c("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e4);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        switch (this.f702J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return this.f703K;
            default:
                throw new ExecutionException((Exception) this.f703K);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        switch (this.f702J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return super.toString() + "[status=SUCCESS, result=[" + this.f703K + "]]";
            default:
                return super.toString() + "[status=FAILURE, cause=[" + ((Exception) this.f703K) + "]]";
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) {
        timeUnit.getClass();
        return get();
    }
}
