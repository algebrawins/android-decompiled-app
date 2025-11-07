package w;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import x.C0559n;

/* renamed from: w.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0492a implements m0 {

    /* renamed from: J  reason: collision with root package name */
    public final Range f5097J;

    /* renamed from: L  reason: collision with root package name */
    public S.i f5099L;

    /* renamed from: K  reason: collision with root package name */
    public float f5098K = 1.0f;

    /* renamed from: M  reason: collision with root package name */
    public float f5100M = 1.0f;

    public C0492a(C0559n c0559n) {
        CameraCharacteristics.Key key;
        key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
        this.f5097J = (Range) c0559n.a(key);
    }

    @Override // w.m0
    public final void a(TotalCaptureResult totalCaptureResult) {
        CaptureRequest.Key key;
        Float f2;
        if (this.f5099L != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            if (request != null) {
                key = CaptureRequest.CONTROL_ZOOM_RATIO;
                f2 = (Float) request.get(key);
            } else {
                f2 = null;
            }
            if (f2 == null) {
                return;
            }
            if (this.f5100M == f2.floatValue()) {
                this.f5099L.a(null);
                this.f5099L = null;
            }
        }
    }

    @Override // w.m0
    public final void b(C.g gVar) {
        CaptureRequest.Key key;
        key = CaptureRequest.CONTROL_ZOOM_RATIO;
        gVar.d(key, Float.valueOf(this.f5098K));
    }

    @Override // w.m0
    public final float c() {
        return ((Float) this.f5097J.getLower()).floatValue();
    }

    @Override // w.m0
    public final float d() {
        return ((Float) this.f5097J.getUpper()).floatValue();
    }

    @Override // w.m0
    public final void e() {
        this.f5098K = 1.0f;
        S.i iVar = this.f5099L;
        if (iVar != null) {
            iVar.b(new Exception("Camera is not active."));
            this.f5099L = null;
        }
    }

    @Override // w.m0
    public final void f(float f2, S.i iVar) {
        this.f5098K = f2;
        S.i iVar2 = this.f5099L;
        if (iVar2 != null) {
            iVar2.b(new Exception("There is a new zoomRatio being set"));
        }
        this.f5100M = this.f5098K;
        this.f5099L = iVar;
    }
}
