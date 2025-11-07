package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import io.flutter.view.TextureRegistry$SurfaceTextureEntry;
import io.flutter.view.t;
import io.flutter.view.u;

/* loaded from: classes.dex */
public final class k implements TextureRegistry$SurfaceTextureEntry, u {

    /* renamed from: a  reason: collision with root package name */
    public final long f3474a;

    /* renamed from: b  reason: collision with root package name */
    public final SurfaceTextureWrapper f3475b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3476c;

    /* renamed from: d  reason: collision with root package name */
    public u f3477d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ n f3478e;

    public k(n nVar, long j3, SurfaceTexture surfaceTexture) {
        this.f3478e = nVar;
        this.f3474a = j3;
        SurfaceTextureWrapper surfaceTextureWrapper = new SurfaceTextureWrapper(surfaceTexture, new f(this, 1));
        this.f3475b = surfaceTextureWrapper;
        surfaceTextureWrapper.surfaceTexture().setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: io.flutter.embedding.engine.renderer.j
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                k kVar = k.this;
                if (!kVar.f3476c) {
                    n nVar2 = kVar.f3478e;
                    if (nVar2.f3498a.isAttached()) {
                        kVar.f3475b.markDirty();
                        nVar2.f3498a.scheduleFrame();
                    }
                }
            }
        }, new Handler());
    }

    public final void finalize() {
        try {
            if (this.f3476c) {
                return;
            }
            n nVar = this.f3478e;
            nVar.f3502e.post(new l(this.f3474a, nVar.f3498a));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final long id() {
        return this.f3474a;
    }

    @Override // io.flutter.view.u
    public final void onTrimMemory(int r22) {
        u uVar = this.f3477d;
        if (uVar != null) {
            uVar.onTrimMemory(r22);
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void release() {
        if (this.f3476c) {
            return;
        }
        this.f3475b.release();
        n nVar = this.f3478e;
        nVar.f3498a.unregisterTexture(this.f3474a);
        nVar.b(this);
        this.f3476c = true;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void setOnFrameConsumedListener(t tVar) {
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final void setOnTrimMemoryListener(u uVar) {
        this.f3477d = uVar;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceTextureEntry
    public final SurfaceTexture surfaceTexture() {
        return this.f3475b.surfaceTexture();
    }
}
