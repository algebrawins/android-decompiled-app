package a1;

import A0.C0001b;
import D.C;
import D.C0042x;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.C0078e;
import androidx.camera.core.impl.C0079f;
import androidx.camera.core.impl.D;
import b1.InterfaceC0147c;
import c1.InterfaceC0161c;
import h2.J;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Executor;
import r2.C0444a;
import r2.InterfaceC0445b;
import r2.InterfaceC0446c;
import r2.l;
import v.C0479a;
import w.m0;
import x.C0559n;

/* loaded from: classes.dex */
public final class i implements X0.b, m0 {

    /* renamed from: J  reason: collision with root package name */
    public Object f1832J;

    /* renamed from: K  reason: collision with root package name */
    public Object f1833K;

    /* renamed from: L  reason: collision with root package name */
    public Object f1834L;

    /* renamed from: M  reason: collision with root package name */
    public Object f1835M;

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f1832J = obj;
        this.f1833K = obj2;
        this.f1835M = obj3;
        this.f1834L = obj4;
    }

    @Override // w.m0
    public void a(TotalCaptureResult totalCaptureResult) {
        Rect rect;
        if (((S.i) this.f1834L) != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            if (request == null) {
                rect = null;
            } else {
                rect = (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            }
            Rect rect2 = (Rect) this.f1835M;
            if (rect2 != null && rect2.equals(rect)) {
                ((S.i) this.f1834L).a(null);
                this.f1834L = null;
                this.f1835M = null;
            }
        }
    }

    @Override // w.m0
    public void b(C.g gVar) {
        Rect rect = (Rect) this.f1833K;
        if (rect != null) {
            gVar.d(CaptureRequest.SCALER_CROP_REGION, rect);
        }
    }

    @Override // w.m0
    public float c() {
        return 1.0f;
    }

    @Override // w.m0
    public float d() {
        Float f2 = (Float) ((C0559n) this.f1832J).a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f2 == null || f2.floatValue() < 1.0f) {
            return 1.0f;
        }
        return f2.floatValue();
    }

    @Override // w.m0
    public void e() {
        this.f1835M = null;
        this.f1833K = null;
        S.i iVar = (S.i) this.f1834L;
        if (iVar != null) {
            iVar.b(new Exception("Camera is not active."));
            this.f1834L = null;
        }
    }

    @Override // w.m0
    public void f(float f2, S.i iVar) {
        Rect rect = (Rect) ((C0559n) this.f1832J).a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        float width = rect.width() / f2;
        float height = rect.height() / f2;
        float width2 = (rect.width() - width) / 2.0f;
        float height2 = (rect.height() - height) / 2.0f;
        this.f1833K = new Rect((int) width2, (int) height2, (int) (width2 + width), (int) (height2 + height));
        S.i iVar2 = (S.i) this.f1834L;
        if (iVar2 != null) {
            iVar2.b(new Exception("There is a new zoomRatio being set"));
        }
        this.f1835M = (Rect) this.f1833K;
        this.f1834L = iVar;
    }

    public C0078e g() {
        String str;
        if (((D) this.f1832J) == null) {
            str = " surface";
        } else {
            str = "";
        }
        if (((List) this.f1833K) == null) {
            str = str.concat(" sharedSurfaces");
        }
        if (((Integer) this.f1834L) == null) {
            str = C.y(str, " surfaceGroupId");
        }
        if (((C0042x) this.f1835M) == null) {
            str = C.y(str, " dynamicRange");
        }
        if (str.isEmpty()) {
            return new C0078e((D) this.f1832J, (List) this.f1833K, ((Integer) this.f1834L).intValue(), (C0042x) this.f1835M);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // A2.a
    public Object get() {
        return new h((Executor) ((A2.a) this.f1832J).get(), (InterfaceC0147c) ((A2.a) this.f1833K).get(), (d) ((C0001b) this.f1835M).get(), (InterfaceC0161c) ((A2.a) this.f1834L).get());
    }

    public C0079f h() {
        String str;
        if (((Size) this.f1832J) == null) {
            str = " resolution";
        } else {
            str = "";
        }
        if (((C0042x) this.f1833K) == null) {
            str = str.concat(" dynamicRange");
        }
        if (((Range) this.f1834L) == null) {
            str = C.y(str, " expectedFrameRateRange");
        }
        if (str.isEmpty()) {
            return new C0079f((Size) this.f1832J, (C0042x) this.f1833K, (Range) this.f1834L, (C0479a) this.f1835M);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object i(F2.b r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof n0.C0376i
            if (r0 == 0) goto L13
            r0 = r7
            n0.i r0 = (n0.C0376i) r0
            int r1 = r0.f4279P
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4279P = r1
            goto L18
        L13:
            n0.i r0 = new n0.i
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f4277N
            E2.a r1 = E2.a.COROUTINE_SUSPENDED
            int r2 = r0.f4279P
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            a1.i r0 = r0.f4276M
            P1.a.b(r7)
            goto L64
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            a1.i r0 = r0.f4276M
            P1.a.b(r7)
            goto L74
        L3a:
            P1.a.b(r7)
            java.lang.Object r7 = r6.f1834L
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r2 = r6.f1835M
            n0.N r2 = (n0.N) r2
            if (r7 == 0) goto L67
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L4e
            goto L67
        L4e:
            n0.X r7 = r2.h()
            n0.l r4 = new n0.l
            r5 = 0
            r4.<init>(r2, r6, r5)
            r0.f4276M = r6
            r0.f4279P = r3
            java.lang.Object r7 = r7.b(r4, r0)
            if (r7 != r1) goto L63
            return r1
        L63:
            r0 = r6
        L64:
            n0.c r7 = (n0.C0370c) r7
            goto L76
        L67:
            r0.f4276M = r6
            r0.f4279P = r4
            r7 = 0
            java.lang.Object r7 = n0.N.g(r2, r7, r0)
            if (r7 != r1) goto L73
            return r1
        L73:
            r0 = r6
        L74:
            n0.c r7 = (n0.C0370c) r7
        L76:
            java.lang.Object r0 = r0.f1835M
            n0.N r0 = (n0.N) r0
            k0.i r0 = r0.f4223Q
            r0.m(r7)
            B2.i r7 = B2.i.f210a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.i.i(F2.b):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078 A[Catch: all -> 0x0097, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0097, blocks: (B:27:0x0066, B:31:0x0078), top: B:45:0x0066 }] */
    /* JADX WARN: Type inference failed for: r2v6, types: [d3.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object j(F2.b r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof n0.S
            if (r0 == 0) goto L13
            r0 = r8
            n0.S r0 = (n0.S) r0
            int r1 = r0.f4238Q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4238Q = r1
            goto L18
        L13:
            n0.S r0 = new n0.S
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f4236O
            E2.a r1 = E2.a.COROUTINE_SUSPENDED
            int r2 = r0.f4238Q
            B2.i r3 = B2.i.f210a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            d3.a r1 = r0.f4235N
            a1.i r0 = r0.f4234M
            P1.a.b(r8)     // Catch: java.lang.Throwable -> L31
            goto L87
        L31:
            r8 = move-exception
            goto L99
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3b:
            d3.a r2 = r0.f4235N
            a1.i r5 = r0.f4234M
            P1.a.b(r8)
            r8 = r2
            goto L66
        L44:
            P1.a.b(r8)
            java.lang.Object r8 = r7.f1833K
            V2.l r8 = (V2.C0055l) r8
            java.lang.Object r8 = r8.E()
            boolean r8 = r8 instanceof V2.N
            if (r8 != 0) goto L54
            return r3
        L54:
            r0.f4234M = r7
            java.lang.Object r8 = r7.f1832J
            d3.d r8 = (d3.d) r8
            r0.f4235N = r8
            r0.f4238Q = r5
            java.lang.Object r2 = r8.c(r0)
            if (r2 != r1) goto L65
            return r1
        L65:
            r5 = r7
        L66:
            java.lang.Object r2 = r5.f1833K     // Catch: java.lang.Throwable -> L97
            V2.l r2 = (V2.C0055l) r2     // Catch: java.lang.Throwable -> L97
            java.lang.Object r2 = r2.E()     // Catch: java.lang.Throwable -> L97
            boolean r2 = r2 instanceof V2.N     // Catch: java.lang.Throwable -> L97
            if (r2 != 0) goto L78
            d3.d r8 = (d3.d) r8
            r8.e(r6)
            return r3
        L78:
            r0.f4234M = r5     // Catch: java.lang.Throwable -> L97
            r0.f4235N = r8     // Catch: java.lang.Throwable -> L97
            r0.f4238Q = r4     // Catch: java.lang.Throwable -> L97
            java.lang.Object r0 = r5.i(r0)     // Catch: java.lang.Throwable -> L97
            if (r0 != r1) goto L85
            return r1
        L85:
            r1 = r8
            r0 = r5
        L87:
            java.lang.Object r8 = r0.f1833K     // Catch: java.lang.Throwable -> L31
            V2.l r8 = (V2.C0055l) r8     // Catch: java.lang.Throwable -> L31
            r8.K(r3)     // Catch: java.lang.Throwable -> L31
            d3.d r1 = (d3.d) r1
            r1.e(r6)
            return r3
        L94:
            r1 = r8
            r8 = r0
            goto L99
        L97:
            r0 = move-exception
            goto L94
        L99:
            d3.d r1 = (d3.d) r1
            r1.e(r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.i.j(F2.b):java.lang.Object");
    }

    public void k(Serializable serializable, InterfaceC0446c interfaceC0446c) {
        C0444a c0444a;
        ByteBuffer b3 = ((l) this.f1834L).b(serializable);
        if (interfaceC0446c == null) {
            c0444a = null;
        } else {
            c0444a = new C0444a(0, this, interfaceC0446c);
        }
        ((r2.f) this.f1832J).i((String) this.f1833K, b3, c0444a);
    }

    public void l(InterfaceC0445b interfaceC0445b) {
        String str = (String) this.f1833K;
        r2.f fVar = (r2.f) this.f1832J;
        J j3 = null;
        R1.a aVar = (R1.a) this.f1835M;
        if (aVar != null) {
            if (interfaceC0445b != null) {
                j3 = new J(16, this, interfaceC0445b);
            }
            fVar.d(str, j3, aVar);
            return;
        }
        if (interfaceC0445b != null) {
            j3 = new J(16, this, interfaceC0445b);
        }
        fVar.e(str, j3);
    }

    public i(r2.f fVar, String str, l lVar, R1.a aVar) {
        this.f1832J = fVar;
        this.f1833K = str;
        this.f1834L = lVar;
        this.f1835M = aVar;
    }
}
