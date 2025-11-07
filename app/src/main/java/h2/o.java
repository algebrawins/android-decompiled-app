package h2;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* loaded from: classes.dex */
public final class o implements TextureView.SurfaceTextureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f3345a;

    public o(p pVar) {
        this.f3345a = pVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int r22, int r3) {
        p pVar = this.f3345a;
        boolean z3 = true;
        pVar.f3346J = true;
        if ((pVar.f3348L == null || pVar.f3347K) ? false : false) {
            pVar.e();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        p pVar = this.f3345a;
        boolean z3 = false;
        pVar.f3346J = false;
        io.flutter.embedding.engine.renderer.n nVar = pVar.f3348L;
        if (nVar != null && !pVar.f3347K) {
            z3 = true;
        }
        if (z3) {
            if (nVar != null) {
                nVar.c();
                Surface surface = pVar.f3349M;
                if (surface != null) {
                    surface.release();
                    pVar.f3349M = null;
                }
            } else {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
        }
        Surface surface2 = pVar.f3349M;
        if (surface2 != null) {
            surface2.release();
            pVar.f3349M = null;
        }
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int r3, int r4) {
        p pVar = this.f3345a;
        io.flutter.embedding.engine.renderer.n nVar = pVar.f3348L;
        if (nVar != null && !pVar.f3347K) {
            if (nVar != null) {
                nVar.f3498a.onSurfaceChanged(r3, r4);
                return;
            }
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
