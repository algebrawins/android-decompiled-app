package D;

import android.view.Surface;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class f0 implements androidx.camera.core.impl.L {

    /* renamed from: M  reason: collision with root package name */
    public final androidx.camera.core.impl.L f386M;

    /* renamed from: N  reason: collision with root package name */
    public final Surface f387N;

    /* renamed from: O  reason: collision with root package name */
    public InterfaceC0044z f388O;

    /* renamed from: J  reason: collision with root package name */
    public final Object f383J = new Object();

    /* renamed from: K  reason: collision with root package name */
    public int f384K = 0;

    /* renamed from: L  reason: collision with root package name */
    public boolean f385L = false;

    /* renamed from: P  reason: collision with root package name */
    public final M f389P = new M(1, this);

    public f0(androidx.camera.core.impl.L l3) {
        this.f386M = l3;
        this.f387N = l3.getSurface();
    }

    public final void a() {
        synchronized (this.f383J) {
            try {
                this.f385L = true;
                this.f386M.s();
                if (this.f384K == 0) {
                    close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.L
    public final X acquireLatestImage() {
        O o3;
        synchronized (this.f383J) {
            X acquireLatestImage = this.f386M.acquireLatestImage();
            if (acquireLatestImage != null) {
                this.f384K++;
                o3 = new O(acquireLatestImage);
                o3.a(this.f389P);
            } else {
                o3 = null;
            }
        }
        return o3;
    }

    @Override // androidx.camera.core.impl.L, c0.InterfaceC0157a
    public final void close() {
        synchronized (this.f383J) {
            try {
                Surface surface = this.f387N;
                if (surface != null) {
                    surface.release();
                }
                this.f386M.close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.L
    public final int getHeight() {
        int height;
        synchronized (this.f383J) {
            height = this.f386M.getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.L
    public final Surface getSurface() {
        Surface surface;
        synchronized (this.f383J) {
            surface = this.f386M.getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.L
    public final int getWidth() {
        int width;
        synchronized (this.f383J) {
            width = this.f386M.getWidth();
        }
        return width;
    }

    @Override // androidx.camera.core.impl.L
    public final int k() {
        int k3;
        synchronized (this.f383J) {
            k3 = this.f386M.k();
        }
        return k3;
    }

    @Override // androidx.camera.core.impl.L
    public final int m() {
        int m3;
        synchronized (this.f383J) {
            m3 = this.f386M.m();
        }
        return m3;
    }

    @Override // androidx.camera.core.impl.L
    public final X o() {
        O o3;
        synchronized (this.f383J) {
            X o4 = this.f386M.o();
            if (o4 != null) {
                this.f384K++;
                o3 = new O(o4);
                o3.a(this.f389P);
            } else {
                o3 = null;
            }
        }
        return o3;
    }

    @Override // androidx.camera.core.impl.L
    public final void s() {
        synchronized (this.f383J) {
            this.f386M.s();
        }
    }

    @Override // androidx.camera.core.impl.L
    public final void t(androidx.camera.core.impl.K k3, Executor executor) {
        synchronized (this.f383J) {
            this.f386M.t(new C.f(2, this, k3), executor);
        }
    }
}
