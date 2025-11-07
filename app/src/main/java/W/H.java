package w;

import android.hardware.camera2.CameraDevice;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class H extends CameraDevice.StateCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5052a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f5053b;

    public H(V0.a aVar) {
        this.f5052a = 1;
        this.f5053b = aVar;
    }

    public void a() {
        ArrayList h3;
        synchronized (((V0.a) this.f5053b).f1357K) {
            h3 = ((V0.a) this.f5053b).h();
            ((LinkedHashSet) ((V0.a) this.f5053b).f1360N).clear();
            ((LinkedHashSet) ((V0.a) this.f5053b).f1358L).clear();
            ((LinkedHashSet) ((V0.a) this.f5053b).f1359M).clear();
        }
        Iterator it = h3.iterator();
        while (it.hasNext()) {
            ((d0) it.next()).o();
        }
    }

    public void b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (((V0.a) this.f5053b).f1357K) {
            linkedHashSet.addAll((LinkedHashSet) ((V0.a) this.f5053b).f1360N);
            linkedHashSet.addAll((LinkedHashSet) ((V0.a) this.f5053b).f1358L);
        }
        ((G.l) ((V0.a) this.f5053b).f1356J).execute(new D.N(20, linkedHashSet));
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.f5052a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                Iterator it = ((ArrayList) this.f5053b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onClosed(cameraDevice);
                }
                return;
            default:
                a();
                return;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.f5052a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                Iterator it = ((ArrayList) this.f5053b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onDisconnected(cameraDevice);
                }
                return;
            default:
                b();
                a();
                return;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int r4) {
        switch (this.f5052a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                Iterator it = ((ArrayList) this.f5053b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onError(cameraDevice, r4);
                }
                return;
            default:
                b();
                a();
                return;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        switch (this.f5052a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                Iterator it = ((ArrayList) this.f5053b).iterator();
                while (it.hasNext()) {
                    ((CameraDevice.StateCallback) it.next()).onOpened(cameraDevice);
                }
                return;
            default:
                return;
        }
    }

    public H(ArrayList arrayList) {
        this.f5052a = 0;
        this.f5053b = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CameraDevice.StateCallback stateCallback = (CameraDevice.StateCallback) it.next();
            if (!(stateCallback instanceof I)) {
                ((ArrayList) this.f5053b).add(stateCallback);
            }
        }
    }

    private final void c(CameraDevice cameraDevice) {
    }
}
