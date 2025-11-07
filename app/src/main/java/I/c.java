package I;

import D.d0;
import D.n0;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import x1.AbstractC0636k0;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements d0 {
    @Override // D.d0
    public void b(n0 n0Var) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(n0Var.f424b.getWidth(), n0Var.f424b.getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        n0Var.a(surface, AbstractC0636k0.a(), new d(0, surface, surfaceTexture));
    }
}
