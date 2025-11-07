package D;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements Runnable {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f410J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ n0 f411K;

    public /* synthetic */ j0(n0 n0Var, int r22) {
        this.f410J = r22;
        this.f411K = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f410J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                this.f411K.f425c.cancel(true);
                return;
            default:
                n0 n0Var = this.f411K;
                n0Var.f426d.b(new Exception("Surface request will not complete."));
                return;
        }
    }
}
