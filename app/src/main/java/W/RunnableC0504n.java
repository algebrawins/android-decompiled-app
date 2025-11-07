package w;

import D.RunnableC0023c;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Arrays;
import x1.AbstractC0636k0;

/* renamed from: w.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0504n implements Runnable {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f5206J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ Object f5207K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ Object f5208L;

    /* renamed from: M  reason: collision with root package name */
    public final /* synthetic */ Object f5209M;

    /* renamed from: N  reason: collision with root package name */
    public final /* synthetic */ Object f5210N;

    public /* synthetic */ RunnableC0504n(Object obj, Object obj2, Object obj3, Object obj4, int r5) {
        this.f5206J = r5;
        this.f5207K = obj;
        this.f5208L = obj2;
        this.f5209M = obj3;
        this.f5210N = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f5210N;
        Object obj2 = this.f5209M;
        Object obj3 = this.f5208L;
        Object obj4 = this.f5207K;
        switch (this.f5206J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                C0511v c0511v = (C0511v) obj4;
                Q q3 = (Q) obj3;
                c0511v.f5259Z.remove(q3);
                E1.a z3 = c0511v.z(q3);
                D.l0 l0Var = (D.l0) obj2;
                l0Var.a();
                new H.j(new ArrayList(Arrays.asList(z3, H.f.d(l0Var.f2113e))), false, AbstractC0636k0.a()).a((RunnableC0023c) obj, AbstractC0636k0.a());
                return;
            case 1:
                ((CameraCaptureSession.CaptureCallback) ((i) obj4).f5166b).onCaptureCompleted((CameraCaptureSession) obj3, (CaptureRequest) obj2, (TotalCaptureResult) obj);
                return;
            case 2:
                ((CameraCaptureSession.CaptureCallback) ((i) obj4).f5166b).onCaptureProgressed((CameraCaptureSession) obj3, (CaptureRequest) obj2, (CaptureResult) obj);
                return;
            default:
                ((CameraCaptureSession.CaptureCallback) ((i) obj4).f5166b).onCaptureFailed((CameraCaptureSession) obj3, (CaptureRequest) obj2, (CaptureFailure) obj);
                return;
        }
    }
}
