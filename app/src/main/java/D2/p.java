package d2;

import D.RunnableC0023c;
import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements M2.l {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f3046J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ q2.n f3047K;

    public /* synthetic */ p(q2.n nVar, int r22) {
        this.f3046J = r22;
        this.f3047K = nVar;
    }

    @Override // M2.l
    public final Object h(Object obj) {
        switch (this.f3046J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                e2.d dVar = (e2.d) obj;
                N2.g.e(dVar, "it");
                new Handler(Looper.getMainLooper()).post(new RunnableC0023c(11, this.f3047K, dVar));
                return B2.i.f210a;
            default:
                Exception exc = (Exception) obj;
                N2.g.e(exc, "it");
                new Handler(Looper.getMainLooper()).post(new RunnableC0023c(12, exc, this.f3047K));
                return B2.i.f210a;
        }
    }
}
