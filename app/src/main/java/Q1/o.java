package Q1;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayDeque;
import java.util.Deque;
import k1.w;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f1090J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ Runnable f1091K;

    public /* synthetic */ o(Runnable runnable, int r22) {
        this.f1090J = r22;
        this.f1091K = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1090J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                h.f1075K.set(new ArrayDeque());
                this.f1091K.run();
                return;
            default:
                Deque deque = (Deque) h.f1075K.get();
                w.e(deque);
                Runnable runnable = this.f1091K;
                deque.add(runnable);
                if (deque.size() <= 1) {
                    do {
                        runnable.run();
                        deque.removeFirst();
                        runnable = (Runnable) deque.peekFirst();
                    } while (runnable != null);
                    return;
                }
                return;
        }
    }
}
