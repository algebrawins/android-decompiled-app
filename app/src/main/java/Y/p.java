package y;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import x1.AbstractC0624h4;

/* loaded from: classes.dex */
public final class p extends o {
    public p(int r22, Surface surface) {
        super(new OutputConfiguration(r22, surface));
    }

    @Override // y.o, y.m, y.k, y.r
    public final Object c() {
        Object obj = this.f6186a;
        AbstractC0624h4.b(obj instanceof OutputConfiguration);
        return obj;
    }

    @Override // y.o, y.m, y.k, y.r
    public final void g(long j3) {
        ((OutputConfiguration) c()).setDynamicRangeProfile(j3);
    }

    @Override // y.r
    public final void i(long j3) {
        if (j3 == -1) {
            return;
        }
        ((OutputConfiguration) c()).setStreamUseCase(j3);
    }
}
