package y;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import x1.AbstractC0624h4;

/* loaded from: classes.dex */
public class m extends k {
    public m(int r3, Surface surface) {
        super(new l(new OutputConfiguration(r3, surface)));
    }

    @Override // y.r
    public final void a(Surface surface) {
        ((OutputConfiguration) c()).addSurface(surface);
    }

    @Override // y.k, y.r
    public final void b() {
        ((OutputConfiguration) c()).enableSurfaceSharing();
    }

    @Override // y.k, y.r
    public Object c() {
        Object obj = this.f6186a;
        AbstractC0624h4.b(obj instanceof l);
        return ((l) obj).f6175a;
    }

    @Override // y.k, y.r
    public String d() {
        return ((l) this.f6186a).f6176b;
    }

    @Override // y.k, y.r
    public final boolean f() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }

    @Override // y.k, y.r
    public void g(long j3) {
        ((l) this.f6186a).f6177c = j3;
    }

    @Override // y.k, y.r
    public void h(String str) {
        ((l) this.f6186a).f6176b = str;
    }
}
