package h2;

import android.view.SurfaceHolder;

/* loaded from: classes.dex */
public final class m implements SurfaceHolder.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f3340a;

    public m(n nVar) {
        this.f3340a = nVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int r22, int r3, int r4) {
        n nVar = this.f3340a;
        io.flutter.embedding.engine.renderer.n nVar2 = nVar.f3343L;
        if (nVar2 != null && !nVar.f3342K) {
            if (nVar2 != null) {
                nVar2.f3498a.onSurfaceChanged(r3, r4);
                return;
            }
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        n nVar = this.f3340a;
        boolean z3 = true;
        nVar.f3341J = true;
        if ((nVar.f3343L == null || nVar.f3342K) ? false : false) {
            nVar.e();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        n nVar = this.f3340a;
        boolean z3 = false;
        nVar.f3341J = false;
        io.flutter.embedding.engine.renderer.n nVar2 = nVar.f3343L;
        if (nVar2 != null && !nVar.f3342K) {
            z3 = true;
        }
        if (z3) {
            if (nVar2 != null) {
                nVar2.c();
                return;
            }
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
    }
}
