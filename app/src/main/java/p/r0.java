package p;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes.dex */
public final class r0 implements Runnable {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f4691J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ s0 f4692K;

    public /* synthetic */ r0(s0 s0Var, int r22) {
        this.f4691J = r22;
        this.f4692K = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4691J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                this.f4692K.c(false);
                return;
            default:
                this.f4692K.a();
                return;
        }
    }
}
