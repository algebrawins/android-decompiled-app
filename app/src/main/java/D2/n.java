package d2;

import D.RunnableC0023c;
import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements M2.l {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f3043J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ q f3044K;

    public /* synthetic */ n(q qVar, int r22) {
        this.f3043J = r22;
        this.f3044K = qVar;
    }

    @Override // M2.l
    public final Object h(Object obj) {
        B2.i iVar = B2.i.f210a;
        q qVar = this.f3044K;
        switch (this.f3043J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                String str = (String) obj;
                N2.g.e(str, "it");
                new Handler(Looper.getMainLooper()).post(new RunnableC0023c(14, qVar, str));
                return iVar;
            case 1:
                new Handler(Looper.getMainLooper()).post(new RunnableC0023c(13, qVar, (List) obj));
                return iVar;
            case 2:
                String str2 = (String) obj;
                N2.g.e(str2, "error");
                ((C0235c) qVar.f3049K).p(C2.t.b(new B2.c("name", "error"), new B2.c("data", str2)));
                return iVar;
            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                Integer num = (Integer) obj;
                num.intValue();
                ((C0235c) qVar.f3049K).p(C2.t.b(new B2.c("name", "torchState"), new B2.c("data", num)));
                return iVar;
            default:
                Double d4 = (Double) obj;
                d4.doubleValue();
                ((C0235c) qVar.f3049K).p(C2.t.b(new B2.c("name", "zoomScaleState"), new B2.c("data", d4)));
                return iVar;
        }
    }
}
