package h2;

import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class p extends TextureView implements io.flutter.embedding.engine.renderer.p {

    /* renamed from: J  reason: collision with root package name */
    public boolean f3346J;

    /* renamed from: K  reason: collision with root package name */
    public boolean f3347K;

    /* renamed from: L  reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.n f3348L;

    /* renamed from: M  reason: collision with root package name */
    public Surface f3349M;

    @Override // io.flutter.embedding.engine.renderer.p
    public final void a(io.flutter.embedding.engine.renderer.n nVar) {
        io.flutter.embedding.engine.renderer.n nVar2 = this.f3348L;
        if (nVar2 != null) {
            nVar2.c();
        }
        this.f3348L = nVar;
        d();
    }

    @Override // io.flutter.embedding.engine.renderer.p
    public final void b() {
        if (this.f3348L == null) {
            Log.w("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f3347K = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.p
    public final void c() {
        if (this.f3348L != null) {
            if (getWindowToken() != null) {
                io.flutter.embedding.engine.renderer.n nVar = this.f3348L;
                if (nVar != null) {
                    nVar.c();
                    Surface surface = this.f3349M;
                    if (surface != null) {
                        surface.release();
                        this.f3349M = null;
                    }
                } else {
                    throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
                }
            }
            this.f3348L = null;
            return;
        }
        Log.w("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
    }

    @Override // io.flutter.embedding.engine.renderer.p
    public final void d() {
        if (this.f3348L == null) {
            Log.w("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (this.f3346J) {
            e();
        }
        this.f3347K = false;
    }

    public final void e() {
        if (this.f3348L != null && getSurfaceTexture() != null) {
            Surface surface = this.f3349M;
            if (surface != null) {
                surface.release();
                this.f3349M = null;
            }
            Surface surface2 = new Surface(getSurfaceTexture());
            this.f3349M = surface2;
            io.flutter.embedding.engine.renderer.n nVar = this.f3348L;
            boolean z3 = this.f3347K;
            if (!z3) {
                nVar.c();
            }
            nVar.f3500c = surface2;
            FlutterJNI flutterJNI = nVar.f3498a;
            if (z3) {
                flutterJNI.onSurfaceWindowChanged(surface2);
                return;
            } else {
                flutterJNI.onSurfaceCreated(surface2);
                return;
            }
        }
        throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
    }

    @Override // io.flutter.embedding.engine.renderer.p
    public io.flutter.embedding.engine.renderer.n getAttachedRenderer() {
        return this.f3348L;
    }

    public void setRenderSurface(Surface surface) {
        this.f3349M = surface;
    }
}
