package p;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class H implements Runnable {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f4529J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ K f4530K;

    public /* synthetic */ H(K k3, int r22) {
        this.f4529J = r22;
        this.f4530K = k3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        K k3 = this.f4530K;
        switch (this.f4529J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                M m3 = k3.f4538L;
                if (m3 != null) {
                    m3.setListSelectionHidden(true);
                    m3.requestLayout();
                    return;
                }
                return;
            default:
                M m4 = k3.f4538L;
                if (m4 != null) {
                    Field field = f0.w.f3200a;
                    if (m4.isAttachedToWindow() && k3.f4538L.getCount() > k3.f4538L.getChildCount() && k3.f4538L.getChildCount() <= Integer.MAX_VALUE) {
                        k3.f4556e0.setInputMethodMode(2);
                        k3.d();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
