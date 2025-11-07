package N;

import A0.C0001b;
import D.C0042x;
import D.RunnableC0023c;
import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Map;
import x.AbstractC0547b;
import x.C0556k;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f881J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ Object f882K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ Object f883L;

    /* renamed from: M  reason: collision with root package name */
    public final /* synthetic */ Object f884M;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int r4) {
        this.f881J = r4;
        this.f882K = obj;
        this.f883L = obj2;
        this.f884M = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f881J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                if (((f) this.f882K).f896j) {
                    ((Runnable) this.f883L).run();
                    return;
                } else {
                    ((Runnable) this.f884M).run();
                    return;
                }
            case 1:
                C0042x c0042x = (C0042x) this.f883L;
                S.i iVar = (S.i) this.f884M;
                f fVar = (f) this.f882K;
                fVar.getClass();
                try {
                    fVar.f888a.l(c0042x);
                    iVar.a(null);
                    return;
                } catch (RuntimeException e4) {
                    iVar.b(e4);
                    return;
                }
            case 2:
                ((C0001b) this.f882K).u((m) this.f883L, (Map.Entry) this.f884M);
                return;
            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                ((G.l) this.f882K).execute(new RunnableC0023c(9, (H.j) this.f883L, (S.i) this.f884M));
                return;
            default:
                AbstractC0547b.a(((C0556k) this.f882K).f5460a, (CameraCaptureSession) this.f883L, (Surface) this.f884M);
                return;
        }
    }
}
