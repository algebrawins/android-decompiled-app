package C;

import w.InterfaceC0500j;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements InterfaceC0500j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f216a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f217b;

    public /* synthetic */ c(int r12, Object obj) {
        this.f216a = r12;
        this.f217b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // w.InterfaceC0500j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(android.hardware.camera2.TotalCaptureResult r4) {
        /*
            r3 = this;
            int r0 = r3.f216a
            switch(r0) {
                case 0: goto L33;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.f217b
            w.i0 r0 = (w.i0) r0
            S.i r1 = r0.f5173f
            r2 = 0
            if (r1 == 0) goto L32
            android.hardware.camera2.CaptureRequest r4 = r4.getRequest()
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Object r4 = r4.get(r1)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L25
            int r4 = r4.intValue()
            r1 = 2
            if (r4 != r1) goto L25
            r4 = 1
            goto L26
        L25:
            r4 = 0
        L26:
            boolean r1 = r0.g
            if (r4 != r1) goto L32
            S.i r4 = r0.f5173f
            r1 = 0
            r4.a(r1)
            r0.f5173f = r1
        L32:
            return r2
        L33:
            java.lang.Object r0 = r3.f217b
            C.e r0 = (C.e) r0
            S.i r1 = r0.g
            r2 = 0
            if (r1 == 0) goto L6b
            android.hardware.camera2.CaptureRequest r4 = r4.getRequest()
            java.lang.Object r4 = r4.getTag()
            boolean r1 = r4 instanceof androidx.camera.core.impl.h0
            if (r1 == 0) goto L6b
            androidx.camera.core.impl.h0 r4 = (androidx.camera.core.impl.h0) r4
            android.util.ArrayMap r4 = r4.f2206a
            java.lang.String r1 = "Camera2CameraControl"
            java.lang.Object r4 = r4.get(r1)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L6b
            S.i r1 = r0.g
            int r1 = r1.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L6b
            S.i r4 = r0.g
            r0.g = r2
            goto L6c
        L6b:
            r4 = r2
        L6c:
            if (r4 == 0) goto L71
            r4.a(r2)
        L71:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: C.c.a(android.hardware.camera2.TotalCaptureResult):boolean");
    }
}
