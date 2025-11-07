package w;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.LinkedHashSet;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements Runnable {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f5129J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ d0 f5130K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ d0 f5131L;

    public /* synthetic */ c0(d0 d0Var, d0 d0Var2, int r3) {
        this.f5129J = r3;
        this.f5130K = d0Var;
        this.f5131L = d0Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5129J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                d0 d0Var = this.f5130K;
                d0 d0Var2 = this.f5131L;
                V0.a aVar = d0Var.f5135b;
                synchronized (aVar.f1357K) {
                    ((LinkedHashSet) aVar.f1358L).remove(d0Var);
                    ((LinkedHashSet) aVar.f1359M).remove(d0Var);
                }
                d0Var.g(d0Var2);
                Objects.requireNonNull(d0Var.f5139f);
                d0Var.f5139f.c(d0Var2);
                return;
            default:
                d0 d0Var3 = this.f5130K;
                Objects.requireNonNull(d0Var3.f5139f);
                d0Var3.f5139f.g(this.f5131L);
                return;
        }
    }
}
