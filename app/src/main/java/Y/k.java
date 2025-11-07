package y;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import x1.AbstractC0624h4;

/* loaded from: classes.dex */
public class k extends r {
    public k(int r3, Surface surface) {
        super(new C0781j(new OutputConfiguration(r3, surface)));
    }

    @Override // y.r
    public void b() {
        ((C0781j) this.f6186a).f6173c = true;
    }

    @Override // y.r
    public Object c() {
        Object obj = this.f6186a;
        AbstractC0624h4.b(obj instanceof C0781j);
        return ((C0781j) obj).f6171a;
    }

    @Override // y.r
    public String d() {
        return ((C0781j) this.f6186a).f6172b;
    }

    @Override // y.r
    public final Surface e() {
        return ((OutputConfiguration) c()).getSurface();
    }

    @Override // y.r
    public boolean f() {
        return ((C0781j) this.f6186a).f6173c;
    }

    @Override // y.r
    public void g(long j3) {
        ((C0781j) this.f6186a).f6174d = j3;
    }

    @Override // y.r
    public void h(String str) {
        ((C0781j) this.f6186a).f6172b = str;
    }
}
