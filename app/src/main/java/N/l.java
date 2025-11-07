package N;

import D.N;
import android.util.Size;
import androidx.camera.core.impl.D;
import x1.AbstractC0612g0;
import x1.AbstractC0624h4;
import x1.AbstractC0636k0;
import x1.AbstractC0699s0;

/* loaded from: classes.dex */
public final class l extends D {

    /* renamed from: o  reason: collision with root package name */
    public final S.l f932o;

    /* renamed from: p  reason: collision with root package name */
    public S.i f933p;

    /* renamed from: q  reason: collision with root package name */
    public D f934q;

    public l(Size size, int r22) {
        super(size, r22);
        this.f932o = AbstractC0699s0.a(new A.k(5, this));
    }

    @Override // androidx.camera.core.impl.D
    public final E1.a f() {
        return this.f932o;
    }

    public final boolean g(D d4, Runnable runnable) {
        boolean z3;
        boolean z4;
        AbstractC0612g0.a();
        d4.getClass();
        D d5 = this.f934q;
        boolean z5 = false;
        if (d5 == d4) {
            return false;
        }
        if (d5 == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0624h4.f("A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider", z3);
        AbstractC0624h4.a("The provider's size must match the parent", this.f2115h.equals(d4.f2115h));
        if (this.f2116i == d4.f2116i) {
            z5 = true;
        }
        AbstractC0624h4.a("The provider's format must match the parent", z5);
        synchronized (this.f2109a) {
            z4 = this.f2111c;
        }
        AbstractC0624h4.f("The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.", !z4);
        this.f934q = d4;
        H.f.e(true, d4.c(), this.f933p, AbstractC0636k0.a());
        d4.d();
        H.f.d(this.f2113e).a(new N(7, d4), AbstractC0636k0.a());
        H.f.d(d4.g).a(runnable, AbstractC0636k0.d());
        return true;
    }
}
