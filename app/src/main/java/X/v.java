package x;

import D.N;
import android.hardware.camera2.CameraManager;

/* loaded from: classes.dex */
public final class v extends CameraManager.AvailabilityCallback {

    /* renamed from: a  reason: collision with root package name */
    public final G.l f5475a;

    /* renamed from: b  reason: collision with root package name */
    public final w.r f5476b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f5477c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public boolean f5478d = false;

    public v(G.l lVar, w.r rVar) {
        this.f5475a = lVar;
        this.f5476b = rVar;
    }

    public final void a() {
        synchronized (this.f5477c) {
            this.f5478d = true;
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAccessPrioritiesChanged() {
        synchronized (this.f5477c) {
            try {
                if (!this.f5478d) {
                    this.f5475a.execute(new N(24, this));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        synchronized (this.f5477c) {
            try {
                if (!this.f5478d) {
                    this.f5475a.execute(new u(this, str, 0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        synchronized (this.f5477c) {
            try {
                if (!this.f5478d) {
                    this.f5475a.execute(new u(this, str, 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
