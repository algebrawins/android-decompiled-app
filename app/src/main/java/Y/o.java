package y;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import x1.AbstractC0624h4;

/* loaded from: classes.dex */
public class o extends m {
    public o(int r3, Surface surface) {
        super(new n(new OutputConfiguration(r3, surface)));
    }

    @Override // y.m, y.k, y.r
    public Object c() {
        Object obj = this.f6186a;
        AbstractC0624h4.b(obj instanceof n);
        return ((n) obj).f6178a;
    }

    @Override // y.m, y.k, y.r
    public final String d() {
        return null;
    }

    @Override // y.m, y.k, y.r
    public void g(long j3) {
        ((n) this.f6186a).f6179b = j3;
    }

    @Override // y.m, y.k, y.r
    public final void h(String str) {
        ((OutputConfiguration) c()).setPhysicalCameraId(str);
    }
}
