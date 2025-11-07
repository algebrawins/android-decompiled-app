package w1;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5313a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Q1.j f5314b;

    public /* synthetic */ q(Q1.j jVar, int r22) {
        this.f5313a = r22;
        this.f5314b = jVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f5313a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return this.f5314b.a();
            case 1:
                return this.f5314b.a();
            default:
                return this.f5314b.a();
        }
    }
}
