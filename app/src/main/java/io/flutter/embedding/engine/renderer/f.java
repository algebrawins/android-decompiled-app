package io.flutter.embedding.engine.renderer;

import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.view.u;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f3464J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ u f3465K;

    public /* synthetic */ f(u uVar, int r22) {
        this.f3464J = r22;
        this.f3465K = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3464J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                FlutterRenderer$ImageReaderSurfaceProducer.a((FlutterRenderer$ImageReaderSurfaceProducer) this.f3465K);
                return;
            default:
                ((k) this.f3465K).getClass();
                return;
        }
    }
}
