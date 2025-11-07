package D;

import android.util.Size;
import android.view.Surface;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes.dex */
public final class l0 extends androidx.camera.core.impl.D {

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ int f421o = 0;

    /* renamed from: p  reason: collision with root package name */
    public final Object f422p;

    public l0(Surface surface, Size size, int r4) {
        super(size, r4);
        this.f422p = surface;
    }

    @Override // androidx.camera.core.impl.D
    public final E1.a f() {
        switch (this.f421o) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return ((n0) this.f422p).f425c;
            default:
                return H.f.c((Surface) this.f422p);
        }
    }

    public l0(Surface surface) {
        super(androidx.camera.core.impl.D.f2105k, 0);
        this.f422p = surface;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(n0 n0Var, Size size) {
        super(size, 34);
        this.f422p = n0Var;
    }
}
