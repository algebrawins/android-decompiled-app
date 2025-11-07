package io.flutter.embedding.engine.renderer;

import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: J  reason: collision with root package name */
    public final long f3479J;

    /* renamed from: K  reason: collision with root package name */
    public final FlutterJNI f3480K;

    public l(long j3, FlutterJNI flutterJNI) {
        this.f3479J = j3;
        this.f3480K = flutterJNI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FlutterJNI flutterJNI = this.f3480K;
        if (!flutterJNI.isAttached()) {
            return;
        }
        flutterJNI.unregisterTexture(this.f3479J);
    }
}
