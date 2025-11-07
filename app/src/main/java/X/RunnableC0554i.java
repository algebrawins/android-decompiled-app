package x;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.Serializable;

/* renamed from: x.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0554i implements Runnable {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f5453J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ int f5454K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ Object f5455L;

    /* renamed from: M  reason: collision with root package name */
    public final /* synthetic */ Object f5456M;

    public /* synthetic */ RunnableC0554i(Object obj, AutoCloseable autoCloseable, int r3, int r4) {
        this.f5453J = r4;
        this.f5455L = obj;
        this.f5456M = autoCloseable;
        this.f5454K = r3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5453J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                ((CameraCaptureSession.CaptureCallback) ((w.i) this.f5455L).f5166b).onCaptureSequenceAborted((CameraCaptureSession) this.f5456M, this.f5454K);
                return;
            case 1:
                ((p) this.f5455L).f5469a.onError((CameraDevice) this.f5456M, this.f5454K);
                return;
            default:
                ((y0.a) this.f5455L).f6195b.e(this.f5454K, (Serializable) this.f5456M);
                return;
        }
    }

    public /* synthetic */ RunnableC0554i(y0.a aVar, int r3, Serializable serializable) {
        this.f5453J = 2;
        this.f5455L = aVar;
        this.f5454K = r3;
        this.f5456M = serializable;
    }
}
