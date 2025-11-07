package h2;

import android.graphics.Region;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceView;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class n extends SurfaceView implements io.flutter.embedding.engine.renderer.p {

    /* renamed from: J  reason: collision with root package name */
    public boolean f3341J;

    /* renamed from: K  reason: collision with root package name */
    public boolean f3342K;

    /* renamed from: L  reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.n f3343L;

    /* renamed from: M  reason: collision with root package name */
    public final C0293e f3344M;

    public n(AbstractActivityC0292d abstractActivityC0292d, boolean z3) {
        super(abstractActivityC0292d, null);
        this.f3341J = false;
        this.f3342K = false;
        m mVar = new m(this);
        this.f3344M = new C0293e(1, this);
        if (z3) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(mVar);
        setAlpha(0.0f);
    }

    @Override // io.flutter.embedding.engine.renderer.p
    public final void a(io.flutter.embedding.engine.renderer.n nVar) {
        io.flutter.embedding.engine.renderer.n nVar2 = this.f3343L;
        if (nVar2 != null) {
            nVar2.c();
            this.f3343L.f3498a.removeIsDisplayingFlutterUiListener(this.f3344M);
        }
        this.f3343L = nVar;
        d();
    }

    @Override // io.flutter.embedding.engine.renderer.p
    public final void b() {
        if (this.f3343L == null) {
            Log.w("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f3342K = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.p
    public final void c() {
        if (this.f3343L != null) {
            if (getWindowToken() != null) {
                io.flutter.embedding.engine.renderer.n nVar = this.f3343L;
                if (nVar != null) {
                    nVar.c();
                } else {
                    throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
                }
            }
            setAlpha(0.0f);
            this.f3343L.f3498a.removeIsDisplayingFlutterUiListener(this.f3344M);
            this.f3343L = null;
            return;
        }
        Log.w("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
    }

    @Override // io.flutter.embedding.engine.renderer.p
    public final void d() {
        io.flutter.embedding.engine.renderer.n nVar = this.f3343L;
        if (nVar == null) {
            Log.w("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        FlutterJNI flutterJNI = nVar.f3498a;
        C0293e c0293e = this.f3344M;
        flutterJNI.addIsDisplayingFlutterUiListener(c0293e);
        if (nVar.f3501d) {
            c0293e.b();
        }
        if (this.f3341J) {
            e();
        }
        this.f3342K = false;
    }

    public final void e() {
        if (this.f3343L != null && getHolder() != null) {
            io.flutter.embedding.engine.renderer.n nVar = this.f3343L;
            Surface surface = getHolder().getSurface();
            boolean z3 = this.f3342K;
            if (!z3) {
                nVar.c();
            }
            nVar.f3500c = surface;
            FlutterJNI flutterJNI = nVar.f3498a;
            if (z3) {
                flutterJNI.onSurfaceWindowChanged(surface);
                return;
            } else {
                flutterJNI.onSurfaceCreated(surface);
                return;
            }
        }
        throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
    }

    @Override // android.view.SurfaceView, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] r02 = new int[2];
        getLocationInWindow(r02);
        int r4 = r02[0];
        region.op(r4, r02[1], (getRight() + r4) - getLeft(), (getBottom() + r02[1]) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // io.flutter.embedding.engine.renderer.p
    public io.flutter.embedding.engine.renderer.n getAttachedRenderer() {
        return this.f3343L;
    }
}
