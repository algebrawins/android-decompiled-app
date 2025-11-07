package A;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.core.impl.C0096y;
import androidx.camera.core.impl.c0;
import androidx.camera.core.impl.h0;
import com.google.android.libraries.barhopper.RecognitionOptions;
import h2.J;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import w.C0515z;
import w.Q;
import x.AbstractC0548c;
import x1.AbstractC0624h4;
import x1.X;

/* loaded from: classes.dex */
public final class l extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f24b;

    public /* synthetic */ l(int r12, Object obj) {
        this.f23a = r12;
        this.f24b = obj;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j3) {
        switch (this.f23a) {
            case 1:
                Iterator it = ((ArrayList) this.f24b).iterator();
                while (it.hasNext()) {
                    AbstractC0548c.a((CameraCaptureSession.CaptureCallback) it.next(), cameraCaptureSession, captureRequest, surface, j3);
                }
                return;
            default:
                super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j3);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        h0 h0Var;
        switch (this.f23a) {
            case 1:
                Iterator it = ((ArrayList) this.f24b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
                return;
            case 2:
                super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                Object tag = captureRequest.getTag();
                if (tag != null) {
                    AbstractC0624h4.a("The tagBundle object from the CaptureResult is not a TagBundle object.", tag instanceof h0);
                    h0Var = (h0) tag;
                } else {
                    h0Var = h0.f2205b;
                }
                ((androidx.camera.core.impl.i) this.f24b).b(new J(h0Var, totalCaptureResult, 21, false));
                return;
            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                synchronized (((Q) this.f24b).f5060a) {
                    try {
                        c0 c0Var = ((Q) this.f24b).g;
                        if (c0Var != null) {
                            C0096y c0096y = c0Var.f2184f;
                            X.a("CaptureSession", "Submit FLASH_MODE_OFF request");
                            Q q3 = (Q) this.f24b;
                            q3.f5075q.getClass();
                            q3.g(Collections.singletonList(h.a(c0096y)));
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            default:
                super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [h1.g, java.lang.Object] */
    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        switch (this.f23a) {
            case 1:
                Iterator it = ((ArrayList) this.f24b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
                return;
            case 2:
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                ((androidx.camera.core.impl.i) this.f24b).c(new Object());
                return;
            default:
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        switch (this.f23a) {
            case 1:
                Iterator it = ((ArrayList) this.f24b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }
                return;
            default:
                super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int r5) {
        switch (this.f23a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                m mVar = (m) this.f24b;
                S.i iVar = (S.i) mVar.f29e;
                if (iVar != null) {
                    iVar.f1190d = true;
                    S.l lVar = iVar.f1188b;
                    if (lVar != null && lVar.f1193K.cancel(true)) {
                        iVar.f1187a = null;
                        iVar.f1188b = null;
                        iVar.f1189c = null;
                    }
                    mVar.f29e = null;
                    return;
                }
                return;
            case 1:
                Iterator it = ((ArrayList) this.f24b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureSequenceAborted(cameraCaptureSession, r5);
                }
                return;
            default:
                super.onCaptureSequenceAborted(cameraCaptureSession, r5);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int r4, long j3) {
        switch (this.f23a) {
            case 1:
                Iterator it = ((ArrayList) this.f24b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureSequenceCompleted(cameraCaptureSession, r4, j3);
                }
                return;
            default:
                super.onCaptureSequenceCompleted(cameraCaptureSession, r4, j3);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j3, long j4) {
        switch (this.f23a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                m mVar = (m) this.f24b;
                S.i iVar = (S.i) mVar.f29e;
                if (iVar != null) {
                    iVar.a(null);
                    mVar.f29e = null;
                    return;
                }
                return;
            case 1:
                Iterator it = ((ArrayList) this.f24b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.CaptureCallback) it.next()).onCaptureStarted(cameraCaptureSession, captureRequest, j3, j4);
                }
                return;
            default:
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j3, j4);
                return;
        }
    }

    public l(androidx.camera.core.impl.i iVar) {
        this.f23a = 2;
        if (iVar != null) {
            this.f24b = iVar;
            return;
        }
        throw new NullPointerException("cameraCaptureCallback is null");
    }

    public l(List list) {
        this.f23a = 1;
        this.f24b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraCaptureSession.CaptureCallback captureCallback = (CameraCaptureSession.CaptureCallback) it.next();
            if (!(captureCallback instanceof C0515z)) {
                ((ArrayList) this.f24b).add(captureCallback);
            }
        }
    }
}
