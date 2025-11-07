package x;

import android.hardware.camera2.CameraDevice;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f5466J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ p f5467K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ CameraDevice f5468L;

    public /* synthetic */ o(p pVar, CameraDevice cameraDevice, int r3) {
        this.f5466J = r3;
        this.f5467K = pVar;
        this.f5468L = cameraDevice;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5466J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                this.f5467K.f5469a.onClosed(this.f5468L);
                return;
            case 1:
                this.f5467K.f5469a.onDisconnected(this.f5468L);
                return;
            default:
                this.f5467K.f5469a.onOpened(this.f5468L);
                return;
        }
    }
}
