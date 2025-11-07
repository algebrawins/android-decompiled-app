package w;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* renamed from: w.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0496e implements Runnable {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f5147J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ C0501k f5148K;

    public /* synthetic */ RunnableC0496e(C0501k c0501k, int r22) {
        this.f5147J = r22;
        this.f5148K = c0501k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5147J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                this.f5148K.r();
                return;
            default:
                C0501k c0501k = this.f5148K;
                c0501k.a(c0501k.f5188U.f227h);
                return;
        }
    }
}
