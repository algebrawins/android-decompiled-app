package D;

import android.graphics.Matrix;
import android.media.Image;

/* renamed from: D.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0021a implements X {

    /* renamed from: J  reason: collision with root package name */
    public final Image f346J;

    /* renamed from: K  reason: collision with root package name */
    public final A.a[] f347K;

    /* renamed from: L  reason: collision with root package name */
    public final C0027g f348L;

    public C0021a(Image image) {
        this.f346J = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f347K = new A.a[planes.length];
            for (int r12 = 0; r12 < planes.length; r12++) {
                this.f347K[r12] = new A.a(10, planes[r12]);
            }
        } else {
            this.f347K = new A.a[0];
        }
        this.f348L = new C0027g(androidx.camera.core.impl.h0.f2205b, image.getTimestamp(), 0, new Matrix());
    }

    @Override // D.X
    public final int c() {
        return this.f346J.getFormat();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f346J.close();
    }

    @Override // D.X
    public final A.a[] e() {
        return this.f347K;
    }

    @Override // D.X
    public final U g() {
        return this.f348L;
    }

    @Override // D.X
    public final int getHeight() {
        return this.f346J.getHeight();
    }

    @Override // D.X
    public final int getWidth() {
        return this.f346J.getWidth();
    }

    @Override // D.X
    public final Image i() {
        return this.f346J;
    }
}
