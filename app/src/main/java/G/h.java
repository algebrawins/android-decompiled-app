package G;

import D.ThreadFactoryC0034o;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import u1.HandlerC0477e;

/* loaded from: classes.dex */
public final class h implements Executor {

    /* renamed from: L  reason: collision with root package name */
    public static volatile h f677L;

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f678J;

    /* renamed from: K  reason: collision with root package name */
    public final Object f679K;

    public /* synthetic */ h(int r12, Object obj) {
        this.f678J = r12;
        this.f679K = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f678J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                ((ExecutorService) this.f679K).execute(runnable);
                return;
            case 1:
                ((ExecutorService) this.f679K).execute(new j(runnable, 1));
                return;
            default:
                ((HandlerC0477e) this.f679K).post(runnable);
                return;
        }
    }

    public h() {
        this.f678J = 0;
        this.f679K = Executors.newFixedThreadPool(2, new ThreadFactoryC0034o(1));
    }
}
