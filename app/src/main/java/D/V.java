package D;

import androidx.camera.core.ImageProcessingUtil;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes.dex */
public final /* synthetic */ class V implements InterfaceC0044z {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f344J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ X f345K;

    public /* synthetic */ V(X x3, X x4, int r3) {
        this.f344J = r3;
        this.f345K = x4;
    }

    @Override // D.InterfaceC0044z
    public final void a(A a4) {
        X x3 = this.f345K;
        switch (this.f344J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                int r02 = ImageProcessingUtil.f2101a;
                x3.close();
                return;
            default:
                int r03 = ImageProcessingUtil.f2101a;
                x3.close();
                return;
        }
    }
}
