package androidx.window.layout.adapter.sidecar;

import N0.f;
import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* renamed from: b  reason: collision with root package name */
    public SidecarDeviceState f2587b;

    /* renamed from: d  reason: collision with root package name */
    public final f f2589d;

    /* renamed from: e  reason: collision with root package name */
    public final SidecarInterface.SidecarCallback f2590e;

    /* renamed from: a  reason: collision with root package name */
    public final Object f2586a = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final WeakHashMap f2588c = new WeakHashMap();

    public DistinctElementSidecarCallback(f fVar, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f2589d = fVar;
        this.f2590e = sidecarCallback;
    }

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.f2586a) {
            try {
                f fVar = this.f2589d;
                SidecarDeviceState sidecarDeviceState2 = this.f2587b;
                fVar.getClass();
                if (f.a(sidecarDeviceState2, sidecarDeviceState)) {
                    return;
                }
                this.f2587b = sidecarDeviceState;
                this.f2590e.onDeviceStateChanged(sidecarDeviceState);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.f2586a) {
            try {
                this.f2589d.getClass();
                if (f.d((SidecarWindowLayoutInfo) this.f2588c.get(iBinder), sidecarWindowLayoutInfo)) {
                    return;
                }
                this.f2588c.put(iBinder, sidecarWindowLayoutInfo);
                this.f2590e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
