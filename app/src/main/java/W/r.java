package w;

import android.hardware.camera2.CameraManager;

/* loaded from: classes.dex */
public final class r extends CameraManager.AvailabilityCallback {

    /* renamed from: a  reason: collision with root package name */
    public final String f5231a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5232b = true;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0511v f5233c;

    public r(C0511v c0511v, String str) {
        this.f5233c = c0511v;
        this.f5231a = str;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        if (!this.f5231a.equals(str)) {
            return;
        }
        this.f5232b = true;
        if (this.f5233c.f5246M == EnumC0508s.PENDING_OPEN) {
            this.f5233c.H(false);
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        if (!this.f5231a.equals(str)) {
            return;
        }
        this.f5232b = false;
    }
}
