package x;

import android.hardware.camera2.CameraDevice;

/* loaded from: classes.dex */
public final class p extends CameraDevice.StateCallback {

    /* renamed from: a  reason: collision with root package name */
    public final CameraDevice.StateCallback f5469a;

    /* renamed from: b  reason: collision with root package name */
    public final G.l f5470b;

    public p(G.l lVar, CameraDevice.StateCallback stateCallback) {
        this.f5470b = lVar;
        this.f5469a = stateCallback;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        this.f5470b.execute(new o(this, cameraDevice, 0));
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        this.f5470b.execute(new o(this, cameraDevice, 1));
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int r4) {
        this.f5470b.execute(new RunnableC0554i(this, cameraDevice, r4, 1));
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        this.f5470b.execute(new o(this, cameraDevice, 2));
    }
}
