package D;

import java.util.concurrent.Executor;
import x1.AbstractC0636k0;

/* loaded from: classes.dex */
public final class P extends K {

    /* renamed from: c0  reason: collision with root package name */
    public final Executor f331c0;

    /* renamed from: d0  reason: collision with root package name */
    public final Object f332d0 = new Object();

    /* renamed from: e0  reason: collision with root package name */
    public X f333e0;

    /* renamed from: f0  reason: collision with root package name */
    public O f334f0;

    public P(Executor executor) {
        this.f331c0 = executor;
    }

    @Override // D.K
    public final X b(androidx.camera.core.impl.L l3) {
        return l3.acquireLatestImage();
    }

    @Override // D.K
    public final void d() {
        synchronized (this.f332d0) {
            try {
                X x3 = this.f333e0;
                if (x3 != null) {
                    x3.close();
                    this.f333e0 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D.K
    public final void f(X x3) {
        synchronized (this.f332d0) {
            try {
                if (!this.f324b0) {
                    x3.close();
                } else if (this.f334f0 != null) {
                    if (x3.g().c() <= this.f334f0.f277K.g().c()) {
                        x3.close();
                    } else {
                        X x4 = this.f333e0;
                        if (x4 != null) {
                            x4.close();
                        }
                        this.f333e0 = x3;
                    }
                } else {
                    O o3 = new O(x3, this);
                    this.f334f0 = o3;
                    E1.a c4 = c(o3);
                    A.a aVar = new A.a(11, o3);
                    c4.a(new H.e(0, c4, aVar), AbstractC0636k0.a());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
