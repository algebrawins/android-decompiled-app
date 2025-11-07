package x;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import h2.J;
import java.util.ArrayList;

/* renamed from: x.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0557l extends J {
    @Override // h2.J
    public final int C(CaptureRequest captureRequest, G.l lVar, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f3303K).setSingleRepeatingRequest(captureRequest, lVar, captureCallback);
    }

    @Override // h2.J
    public final int q(ArrayList arrayList, G.l lVar, w.i iVar) {
        return ((CameraCaptureSession) this.f3303K).captureBurstRequests(arrayList, lVar, iVar);
    }
}
