package G;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.concurrent.Callable;
import k1.C0340h;
import w1.r;
import x1.I6;
import y1.O4;

/* loaded from: classes.dex */
public final class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f666a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f667b;

    public /* synthetic */ c(int r12, Object obj) {
        this.f666a = r12;
        this.f667b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f666a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                ((Runnable) this.f667b).run();
                return null;
            case 1:
                r rVar = (r) this.f667b;
                rVar.getClass();
                return C0340h.f4039c.a(rVar.f5316a);
            case 2:
                I6 r02 = (I6) this.f667b;
                r02.getClass();
                return C0340h.f4039c.a(r02.g);
            default:
                O4 o4 = (O4) this.f667b;
                o4.getClass();
                return C0340h.f4039c.a(o4.g);
        }
    }
}
