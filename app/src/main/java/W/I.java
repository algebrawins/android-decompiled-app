package w;

import D.RunnableC0023c;
import D.RunnableC0038t;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import x.AbstractC0548c;
import x.RunnableC0554i;

/* loaded from: classes.dex */
public final class i extends CameraCaptureSession.CaptureCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5165a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f5166b;

    /* renamed from: c  reason: collision with root package name */
    public Object f5167c;

    public i() {
        this.f5165a = 1;
        this.f5167c = null;
        this.f5166b = new HashMap();
    }

    public void a(CaptureRequest captureRequest, List list) {
        HashMap hashMap = (HashMap) this.f5166b;
        List list2 = (List) hashMap.get(captureRequest);
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(list2.size() + list.size());
            arrayList.addAll(list);
            arrayList.addAll(list2);
            hashMap.put(captureRequest, arrayList);
            return;
        }
        hashMap.put(captureRequest, list);
    }

    public List b(CaptureRequest captureRequest) {
        List list = (List) ((HashMap) this.f5166b).get(captureRequest);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j3) {
        switch (this.f5165a) {
            case 1:
                for (CameraCaptureSession.CaptureCallback captureCallback : b(captureRequest)) {
                    AbstractC0548c.a(captureCallback, cameraCaptureSession, captureRequest, surface, j3);
                }
                return;
            case 2:
                ((G.l) this.f5167c).execute(new RunnableC0038t(this, cameraCaptureSession, captureRequest, surface, j3, 1));
                return;
            default:
                super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j3);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        switch (this.f5165a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                ((G.l) this.f5167c).execute(new RunnableC0023c(18, this, totalCaptureResult));
                return;
            case 1:
                for (CameraCaptureSession.CaptureCallback captureCallback : b(captureRequest)) {
                    captureCallback.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
                return;
            default:
                ((G.l) this.f5167c).execute(new RunnableC0504n(this, cameraCaptureSession, captureRequest, totalCaptureResult, 1));
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        switch (this.f5165a) {
            case 1:
                for (CameraCaptureSession.CaptureCallback captureCallback : b(captureRequest)) {
                    captureCallback.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                }
                return;
            case 2:
                ((G.l) this.f5167c).execute(new RunnableC0504n(this, cameraCaptureSession, captureRequest, captureFailure, 3));
                return;
            default:
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        switch (this.f5165a) {
            case 1:
                for (CameraCaptureSession.CaptureCallback captureCallback : b(captureRequest)) {
                    captureCallback.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }
                return;
            case 2:
                ((G.l) this.f5167c).execute(new RunnableC0504n(this, cameraCaptureSession, captureRequest, captureResult, 2));
                return;
            default:
                super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int r5) {
        switch (this.f5165a) {
            case 1:
                for (List<CameraCaptureSession.CaptureCallback> list : ((HashMap) this.f5166b).values()) {
                    for (CameraCaptureSession.CaptureCallback captureCallback : list) {
                        captureCallback.onCaptureSequenceAborted(cameraCaptureSession, r5);
                    }
                }
                L l3 = (L) this.f5167c;
                if (l3 != null) {
                    l3.a();
                    return;
                }
                return;
            case 2:
                ((G.l) this.f5167c).execute(new RunnableC0554i(this, cameraCaptureSession, r5, 0));
                return;
            default:
                super.onCaptureSequenceAborted(cameraCaptureSession, r5);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int r9, final long j3) {
        switch (this.f5165a) {
            case 1:
                for (List<CameraCaptureSession.CaptureCallback> list : ((HashMap) this.f5166b).values()) {
                    for (CameraCaptureSession.CaptureCallback captureCallback : list) {
                        captureCallback.onCaptureSequenceCompleted(cameraCaptureSession, r9, j3);
                    }
                }
                L l3 = (L) this.f5167c;
                if (l3 != null) {
                    l3.a();
                    return;
                }
                return;
            case 2:
                ((G.l) this.f5167c).execute(new Runnable() { // from class: x.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((CameraCaptureSession.CaptureCallback) w.i.this.f5166b).onCaptureSequenceCompleted(cameraCaptureSession, r9, j3);
                    }
                });
                return;
            default:
                super.onCaptureSequenceCompleted(cameraCaptureSession, r9, j3);
                return;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long j3, final long j4) {
        switch (this.f5165a) {
            case 1:
                for (CameraCaptureSession.CaptureCallback captureCallback : b(captureRequest)) {
                    captureCallback.onCaptureStarted(cameraCaptureSession, captureRequest, j3, j4);
                }
                return;
            case 2:
                ((G.l) this.f5167c).execute(new Runnable() { // from class: x.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((CameraCaptureSession.CaptureCallback) w.i.this.f5166b).onCaptureStarted(cameraCaptureSession, captureRequest, j3, j4);
                    }
                });
                return;
            default:
                super.onCaptureStarted(cameraCaptureSession, captureRequest, j3, j4);
                return;
        }
    }

    public i(G.l lVar, CameraCaptureSession.CaptureCallback captureCallback) {
        this.f5165a = 2;
        this.f5167c = lVar;
        this.f5166b = captureCallback;
    }

    public i(G.l lVar) {
        this.f5165a = 0;
        this.f5166b = new HashSet();
        this.f5167c = lVar;
    }
}
