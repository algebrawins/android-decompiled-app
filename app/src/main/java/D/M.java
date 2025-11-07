package D;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final /* synthetic */ class M implements InterfaceC0044z {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f325J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ Object f326K;

    public /* synthetic */ M(int r12, Object obj) {
        this.f325J = r12;
        this.f326K = obj;
    }

    @Override // D.InterfaceC0044z
    public final void a(A a4) {
        InterfaceC0044z interfaceC0044z;
        switch (this.f325J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                P p2 = (P) ((WeakReference) ((O) this.f326K).f330N).get();
                if (p2 != null) {
                    p2.f331c0.execute(new N(0, p2));
                    return;
                }
                return;
            default:
                f0 f0Var = (f0) this.f326K;
                synchronized (f0Var.f383J) {
                    try {
                        int r22 = f0Var.f384K - 1;
                        f0Var.f384K = r22;
                        if (f0Var.f385L && r22 == 0) {
                            f0Var.close();
                        }
                        interfaceC0044z = f0Var.f388O;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (interfaceC0044z != null) {
                    interfaceC0044z.a(a4);
                    return;
                }
                return;
        }
    }
}
