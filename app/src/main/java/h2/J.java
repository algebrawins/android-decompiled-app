package h2;

import A0.C0001b;
import D.C0025e;
import D.C0026f;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.camera.core.impl.C0092u;
import androidx.camera.core.impl.C0093v;
import androidx.camera.core.impl.EnumC0083k;
import androidx.camera.core.impl.EnumC0084l;
import androidx.camera.core.impl.EnumC0085m;
import androidx.camera.core.impl.EnumC0090s;
import androidx.camera.core.impl.InterfaceC0086n;
import androidx.camera.core.impl.h0;
import com.google.android.libraries.barhopper.RecognitionOptions;
import d2.C0235c;
import h1.C0284d;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import k0.C0322i;
import org.json.JSONArray;
import org.json.JSONObject;
import p.t0;
import r2.InterfaceC0445b;
import r2.InterfaceC0446c;
import t2.InterfaceC0461a;
import w.AbstractC0507q;
import w.C0511v;
import w.Q;
import w.a0;
import x.AbstractC0546a;
import x.C0551f;
import x.C0556k;
import x1.X;
import y.C0780i;

/* loaded from: classes.dex */
public class J implements C1.c, r2.m, InterfaceC0446c, r2.d, InterfaceC0086n, H.c {

    /* renamed from: M  reason: collision with root package name */
    public static J f3300M;

    /* renamed from: N  reason: collision with root package name */
    public static N.o f3301N;

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f3302J;

    /* renamed from: K  reason: collision with root package name */
    public Object f3303K;

    /* renamed from: L  reason: collision with root package name */
    public Object f3304L;

    public /* synthetic */ J(int r12, Object obj, Object obj2) {
        this.f3302J = r12;
        this.f3304L = obj;
        this.f3303K = obj2;
    }

    public static ArrayList D(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C0780i) it.next()).f6170a.e());
        }
        return arrayList;
    }

    public static ArrayList k(J j3, JSONArray jSONArray) {
        j3.getClass();
        ArrayList arrayList = new ArrayList();
        for (int r02 = 0; r02 < jSONArray.length(); r02++) {
            int r12 = q2.c.f4802b[q2.j.a(jSONArray.getString(r02)).ordinal()];
            if (r12 != 1) {
                if (r12 == 2) {
                    arrayList.add(q2.j.BOTTOM_OVERLAYS);
                }
            } else {
                arrayList.add(q2.j.TOP_OVERLAYS);
            }
        }
        return arrayList;
    }

    public static q2.i l(J j3, String str) {
        j3.getClass();
        int r02 = q2.c.f4803c[q2.i.a(str).ordinal()];
        if (r02 != 1) {
            if (r02 != 2) {
                if (r02 != 3) {
                    if (r02 != 4) {
                        return q2.i.EDGE_TO_EDGE;
                    }
                    return q2.i.EDGE_TO_EDGE;
                }
                return q2.i.IMMERSIVE_STICKY;
            }
            return q2.i.IMMERSIVE;
        }
        return q2.i.LEAN_BACK;
    }

    public static t0 m(J j3, JSONObject jSONObject) {
        Integer num;
        q2.d dVar;
        Boolean bool;
        Integer num2;
        q2.d dVar2;
        Integer num3;
        j3.getClass();
        Boolean bool2 = null;
        if (!jSONObject.isNull("statusBarColor")) {
            num = Integer.valueOf(jSONObject.getInt("statusBarColor"));
        } else {
            num = null;
        }
        if (!jSONObject.isNull("statusBarIconBrightness")) {
            dVar = q2.d.a(jSONObject.getString("statusBarIconBrightness"));
        } else {
            dVar = null;
        }
        if (!jSONObject.isNull("systemStatusBarContrastEnforced")) {
            bool = Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced"));
        } else {
            bool = null;
        }
        if (!jSONObject.isNull("systemNavigationBarColor")) {
            num2 = Integer.valueOf(jSONObject.getInt("systemNavigationBarColor"));
        } else {
            num2 = null;
        }
        if (!jSONObject.isNull("systemNavigationBarIconBrightness")) {
            dVar2 = q2.d.a(jSONObject.getString("systemNavigationBarIconBrightness"));
        } else {
            dVar2 = null;
        }
        if (!jSONObject.isNull("systemNavigationBarDividerColor")) {
            num3 = Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor"));
        } else {
            num3 = null;
        }
        if (!jSONObject.isNull("systemNavigationBarContrastEnforced")) {
            bool2 = Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced"));
        }
        return new t0(num, dVar, bool, num2, dVar2, num3, bool2);
    }

    public static void r(CameraDevice cameraDevice, y.v vVar) {
        cameraDevice.getClass();
        y.u uVar = vVar.f6193a;
        uVar.f().getClass();
        List<C0780i> g = uVar.g();
        if (g != null) {
            if (uVar.d() != null) {
                String id = cameraDevice.getId();
                for (C0780i c0780i : g) {
                    String d4 = c0780i.f6170a.d();
                    if (d4 != null && !d4.isEmpty()) {
                        X.g("CameraDeviceCompat", "Camera " + id + ": Camera doesn't support physicalCameraId " + d4 + ". Ignoring.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Invalid executor");
        }
        throw new IllegalArgumentException("Invalid output configurations");
    }

    public static HashMap t(String str, int r3, int r4, int r5, int r6) {
        HashMap hashMap = new HashMap();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(r3));
        hashMap.put("selectionExtent", Integer.valueOf(r4));
        hashMap.put("composingBase", Integer.valueOf(r5));
        hashMap.put("composingExtent", Integer.valueOf(r6));
        return hashMap;
    }

    public void A(String str, G.l lVar, CameraDevice.StateCallback stateCallback) {
        lVar.getClass();
        stateCallback.getClass();
        try {
            ((CameraManager) this.f3303K).openCamera(str, new x.p(lVar, stateCallback), (Handler) ((J) this.f3304L).f3304L);
        } catch (CameraAccessException e4) {
            throw new C0551f(e4);
        }
    }

    public void B(G.l lVar, w.r rVar) {
        x.v vVar;
        J j3 = (J) this.f3304L;
        synchronized (((HashMap) j3.f3303K)) {
            try {
                vVar = (x.v) ((HashMap) j3.f3303K).get(rVar);
                if (vVar == null) {
                    vVar = new x.v(lVar, rVar);
                    ((HashMap) j3.f3303K).put(rVar, vVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ((CameraManager) this.f3303K).registerAvailabilityCallback(vVar, (Handler) j3.f3304L);
    }

    public int C(CaptureRequest captureRequest, G.l lVar, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.f3303K).setRepeatingRequest(captureRequest, new w.i(lVar, captureCallback), (Handler) ((C0322i) this.f3304L).f3983K);
    }

    public void E(CameraManager.AvailabilityCallback availabilityCallback) {
        x.v vVar;
        if (availabilityCallback != null) {
            J j3 = (J) this.f3304L;
            synchronized (((HashMap) j3.f3303K)) {
                vVar = (x.v) ((HashMap) j3.f3303K).remove(availabilityCallback);
            }
        } else {
            vVar = null;
        }
        if (vVar != null) {
            vVar.a();
        }
        ((CameraManager) this.f3303K).unregisterAvailabilityCallback(vVar);
    }

    public void F(EnumC0090s enumC0090s, C0026f c0026f) {
        C0025e c0025e;
        switch (w.J.f5054a[enumC0090s.ordinal()]) {
            case 1:
                C0093v c0093v = (C0093v) this.f3303K;
                synchronized (c0093v.f2232b) {
                    Iterator it = c0093v.f2235e.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((C0092u) ((Map.Entry) it.next()).getValue()).f2227a == EnumC0090s.CLOSING) {
                                c0025e = new C0025e(D.r.OPENING, null);
                            }
                        } else {
                            c0025e = new C0025e(D.r.PENDING_OPEN, null);
                        }
                    }
                }
                break;
            case 2:
                c0025e = new C0025e(D.r.OPENING, c0026f);
                break;
            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
            case 4:
                c0025e = new C0025e(D.r.OPEN, c0026f);
                break;
            case q0.k.STRING_FIELD_NUMBER /* 5 */:
            case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                c0025e = new C0025e(D.r.CLOSING, c0026f);
                break;
            case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
                c0025e = new C0025e(D.r.CLOSED, c0026f);
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + enumC0090s);
        }
        X.a("CameraStateMachine", "New public camera state " + c0025e + " from " + enumC0090s + " and " + c0026f);
        if (!Objects.equals((C0025e) ((androidx.lifecycle.z) this.f3304L).d(), c0025e)) {
            X.a("CameraStateMachine", "Publishing new public camera state " + c0025e);
            ((androidx.lifecycle.z) this.f3304L).h(c0025e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void G(boolean r5, com.google.android.gms.common.api.Status r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f3303K
            java.util.Map r0 = (java.util.Map) r0
            monitor-enter(r0)
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> L84
            java.lang.Object r2 = r4.f3303K     // Catch: java.lang.Throwable -> L84
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L84
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L84
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L84
            java.lang.Object r0 = r4.f3304L
            r2 = r0
            java.util.Map r2 = (java.util.Map) r2
            monitor-enter(r2)
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> L81
            java.lang.Object r3 = r4.f3304L     // Catch: java.lang.Throwable -> L81
            java.util.Map r3 = (java.util.Map) r3     // Catch: java.lang.Throwable -> L81
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L81
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L81
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L27:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4f
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            if (r5 != 0) goto L42
            java.lang.Object r3 = r2.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L42
            goto L27
        L42:
            java.lang.Object r5 = r2.getKey()
            r5.getClass()
            java.lang.ClassCastException r5 = new java.lang.ClassCastException
            r5.<init>()
            throw r5
        L4f:
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L57:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L80
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            if (r5 != 0) goto L71
            java.lang.Object r2 = r1.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L57
        L71:
            java.lang.Object r1 = r1.getKey()
            C1.g r1 = (C1.g) r1
            i1.d r2 = new i1.d
            r2.<init>(r6)
            r1.a(r2)
            goto L57
        L80:
            return
        L81:
            r5 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L81
            throw r5
        L84:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L84
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.J.G(boolean, com.google.android.gms.common.api.Status):void");
    }

    @Override // androidx.camera.core.impl.InterfaceC0086n
    public h0 a() {
        return (h0) this.f3303K;
    }

    @Override // H.c
    public void b(Object obj) {
        CameraDevice cameraDevice;
        switch (this.f3302J) {
            case 22:
                Void r22 = (Void) obj;
                ((C0511v) this.f3304L).f5255V.remove((Q) this.f3303K);
                int r23 = AbstractC0507q.f5230a[((C0511v) this.f3304L).f5246M.ordinal()];
                if (r23 != 3) {
                    if (r23 != 7) {
                        if (r23 != 8) {
                            return;
                        }
                    } else if (((C0511v) this.f3304L).f5253T == 0) {
                        return;
                    }
                }
                if (((C0511v) this.f3304L).v() && (cameraDevice = ((C0511v) this.f3304L).f5252S) != null) {
                    AbstractC0546a.a(cameraDevice);
                    ((C0511v) this.f3304L).f5252S = null;
                    return;
                }
                return;
            default:
                Void r24 = (Void) obj;
                ((Surface) this.f3303K).release();
                ((SurfaceTexture) this.f3304L).release();
                return;
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0086n
    public long c() {
        Long l3 = (Long) ((TotalCaptureResult) this.f3304L).get(CaptureResult.SENSOR_TIMESTAMP);
        if (l3 == null) {
            return -1L;
        }
        return l3.longValue();
    }

    @Override // H.c
    public void c0(Throwable th) {
        switch (this.f3302J) {
            case 22:
                return;
            default:
                throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0086n
    public EnumC0085m d() {
        Integer num = (Integer) ((TotalCaptureResult) this.f3304L).get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return EnumC0085m.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        X.b("C2CameraCaptureResult", "Undefined awb state: " + num);
                        return EnumC0085m.UNKNOWN;
                    }
                    return EnumC0085m.LOCKED;
                }
                return EnumC0085m.CONVERGED;
            }
            return EnumC0085m.METERING;
        }
        return EnumC0085m.INACTIVE;
    }

    @Override // C1.c
    public void e(C1.j jVar) {
        ((Map) ((J) this.f3304L).f3304L).remove((C1.g) this.f3303K);
    }

    @Override // androidx.camera.core.impl.InterfaceC0086n
    public CaptureResult f() {
        return (TotalCaptureResult) this.f3304L;
    }

    @Override // androidx.camera.core.impl.InterfaceC0086n
    public EnumC0084l g() {
        Integer num = (Integer) ((TotalCaptureResult) this.f3304L).get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return EnumC0084l.UNKNOWN;
        }
        switch (num.intValue()) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return EnumC0084l.INACTIVE;
            case 1:
            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                return EnumC0084l.SCANNING;
            case 2:
                return EnumC0084l.PASSIVE_FOCUSED;
            case 4:
                return EnumC0084l.LOCKED_FOCUSED;
            case q0.k.STRING_FIELD_NUMBER /* 5 */:
                return EnumC0084l.LOCKED_NOT_FOCUSED;
            case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return EnumC0084l.PASSIVE_NOT_FOCUSED;
            default:
                X.b("C2CameraCaptureResult", "Undefined af state: " + num);
                return EnumC0084l.UNKNOWN;
        }
    }

    @Override // r2.InterfaceC0446c
    public void h(Object obj) {
        switch (this.f3302J) {
            case 13:
                C0001b c0001b = (C0001b) this.f3304L;
                q2.p pVar = (q2.p) this.f3303K;
                ((ConcurrentLinkedQueue) c0001b.f85L).remove(pVar);
                if (!((ConcurrentLinkedQueue) c0001b.f85L).isEmpty()) {
                    Log.e("SettingsChannel", "The queue becomes empty after removing config generation " + String.valueOf(pVar.f4832a));
                    return;
                }
                return;
            default:
                ((j2.g) this.f3303K).a(((r2.l) ((a1.i) ((J) this.f3304L).f3304L).f1834L).b(obj));
                return;
        }
    }

    @Override // r2.m
    public void i(J j3, q2.n nVar) {
        C0322i c0322i = (C0322i) this.f3304L;
        if (((C0001b) c0322i.f3983K) == null) {
            nVar.c((Map) this.f3303K);
            return;
        }
        String str = (String) j3.f3303K;
        str.getClass();
        if (!str.equals("getKeyboardState")) {
            nVar.b();
            return;
        }
        try {
            this.f3303K = Collections.unmodifiableMap(((C) ((E[]) ((C0001b) c0322i.f3983K).f85L)[0]).f3286K);
        } catch (IllegalStateException e4) {
            nVar.a("error", e4.getMessage(), null);
        }
        nVar.c((Map) this.f3303K);
    }

    @Override // androidx.camera.core.impl.InterfaceC0086n
    public EnumC0083k j() {
        Integer num = (Integer) ((TotalCaptureResult) this.f3304L).get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return EnumC0083k.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue != 4) {
                            if (intValue != 5) {
                                X.b("C2CameraCaptureResult", "Undefined ae state: " + num);
                                return EnumC0083k.UNKNOWN;
                            }
                        } else {
                            return EnumC0083k.FLASH_REQUIRED;
                        }
                    } else {
                        return EnumC0083k.LOCKED;
                    }
                } else {
                    return EnumC0083k.CONVERGED;
                }
            }
            return EnumC0083k.SEARCHING;
        }
        return EnumC0083k.INACTIVE;
    }

    public void n(Object obj, String str) {
        String valueOf = String.valueOf(obj);
        ((ArrayList) this.f3303K).add(str + "=" + valueOf);
    }

    @Override // r2.d
    public void o(ByteBuffer byteBuffer, j2.g gVar) {
        switch (this.f3302J) {
            case 16:
                a1.i iVar = (a1.i) this.f3304L;
                try {
                    ((InterfaceC0445b) this.f3303K).c(((r2.l) iVar.f1834L).a(byteBuffer), new J(15, this, gVar));
                    return;
                } catch (RuntimeException e4) {
                    Log.e("BasicMessageChannel#" + ((String) iVar.f1833K), "Failed to handle message", e4);
                    gVar.a(null);
                    return;
                }
            default:
                C0001b c0001b = (C0001b) this.f3304L;
                try {
                    ((r2.m) this.f3303K).i(((r2.n) c0001b.f86M).b(byteBuffer), new q2.n(1, this, gVar));
                    return;
                } catch (RuntimeException e5) {
                    Log.e("MethodChannel#" + ((String) c0001b.f84K), "Failed to handle method call", e5);
                    gVar.a(((r2.n) c0001b.f86M).e(e5.getMessage(), Log.getStackTraceString(e5)));
                    return;
                }
        }
    }

    public Object p(String str) {
        Object obj = this.f3304L;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }

    public int q(ArrayList arrayList, G.l lVar, w.i iVar) {
        return ((CameraCaptureSession) this.f3303K).captureBurst(arrayList, new w.i(lVar, iVar), (Handler) ((C0322i) this.f3304L).f3983K);
    }

    public void s(y.v vVar) {
        CameraDevice cameraDevice = (CameraDevice) this.f3303K;
        r(cameraDevice, vVar);
        y.u uVar = vVar.f6193a;
        if (uVar.b() == null) {
            if (uVar.c() != 1) {
                try {
                    cameraDevice.createCaptureSession(D(uVar.g()), new C0556k(uVar.d(), uVar.f()), (Handler) ((x.t) this.f3304L).f5471a);
                    return;
                } catch (CameraAccessException e4) {
                    throw new C0551f(e4);
                }
            }
            throw new IllegalArgumentException("High speed capture sessions not supported until API 23");
        }
        throw new IllegalArgumentException("Reprocessing sessions not supported until API 23");
    }

    public String toString() {
        switch (this.f3302J) {
            case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.f3304L.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.f3303K;
                int size = arrayList.size();
                for (int r3 = 0; r3 < size; r3++) {
                    sb.append((String) arrayList.get(r3));
                    if (r3 < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public t0.e u(String str) {
        t0.h hVar = (t0.h) ((HashMap) this.f3304L).get(str);
        return null;
    }

    public CameraCharacteristics v(String str) {
        try {
            return ((CameraManager) this.f3303K).getCameraCharacteristics(str);
        } catch (CameraAccessException e4) {
            throw new C0551f(e4);
        }
    }

    public Set w() {
        return Collections.emptySet();
    }

    public List x() {
        ArrayList arrayList;
        if (((ArrayList) this.f3303K).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f3303K)) {
            arrayList = new ArrayList((ArrayList) this.f3303K);
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:412:0x0ad9, code lost:
        if (r6 < r13) goto L639;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0b73, code lost:
        if (w.a0.f(r12) < w.a0.f(r5)) goto L619;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0b3f  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0d46  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0d86  */
    /* JADX WARN: Type inference failed for: r10v16, types: [A.a, v.a] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.util.Pair y(int r39, java.lang.String r40, java.util.ArrayList r41, java.util.HashMap r42) {
        /*
            Method dump skipped, instructions count: 3911
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.J.y(int, java.lang.String, java.util.ArrayList, java.util.HashMap):android.util.Pair");
    }

    public /* synthetic */ J(Object obj, Object obj2, int r3, boolean z3) {
        this.f3302J = r3;
        this.f3303K = obj;
        this.f3304L = obj2;
    }

    public /* synthetic */ J(Object obj) {
        this.f3302J = 6;
        this.f3304L = obj;
        this.f3303K = new ArrayList();
    }

    public J(String str, A1.b bVar, O1.a aVar) {
        this.f3302J = 1;
        this.f3304L = str;
        this.f3303K = bVar;
    }

    public J(InterfaceC0461a interfaceC0461a, C0235c c0235c) {
        this.f3302J = 20;
        this.f3303K = interfaceC0461a;
        this.f3304L = c0235c;
        c0235c.f3003K = new C0235c(26, this);
    }

    public J(C0322i c0322i) {
        this.f3302J = 9;
        this.f3304L = c0322i;
        this.f3303K = new HashMap();
    }

    public J(View view, InputMethodManager inputMethodManager, C0235c c0235c) {
        this.f3302J = 2;
        if (Build.VERSION.SDK_INT >= 33) {
            view.setAutoHandwritingEnabled(false);
        }
        this.f3304L = view;
        this.f3303K = inputMethodManager;
        c0235c.f3003K = this;
    }

    public J(CameraCaptureSession cameraCaptureSession, C0322i c0322i) {
        this.f3302J = 26;
        cameraCaptureSession.getClass();
        this.f3303K = cameraCaptureSession;
        this.f3304L = c0322i;
    }

    public J(CameraDevice cameraDevice, x.t tVar) {
        this.f3302J = 27;
        cameraDevice.getClass();
        this.f3303K = cameraDevice;
        this.f3304L = tVar;
    }

    public J(C0093v c0093v) {
        this.f3302J = 24;
        this.f3303K = c0093v;
        androidx.lifecycle.z zVar = new androidx.lifecycle.z();
        this.f3304L = zVar;
        zVar.h(new C0025e(D.r.CLOSED, null));
    }

    public J(Context context, J j3) {
        this.f3302J = 29;
        this.f3303K = (CameraManager) context.getSystemService("camera");
        this.f3304L = j3;
    }

    public J(int r22) {
        this.f3302J = r22;
        switch (r22) {
            case 4:
                this.f3303K = Collections.synchronizedMap(new WeakHashMap());
                this.f3304L = Collections.synchronizedMap(new WeakHashMap());
                return;
            case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                C0284d c0284d = C0284d.f3260d;
                this.f3303K = new SparseIntArray();
                this.f3304L = c0284d;
                return;
            case 8:
                return;
            case 19:
                this.f3303K = new ArrayList();
                this.f3304L = new HashMap();
                new HashMap();
                return;
            default:
                this.f3303K = new LongSparseArray();
                this.f3304L = new PriorityQueue();
                return;
        }
    }

    public J(j2.b bVar, int r6) {
        this.f3302J = r6;
        switch (r6) {
            case 11:
                C0235c c0235c = new C0235c(17, this);
                C0001b c0001b = new C0001b(bVar, "flutter/platform", r2.k.f4892a, 26);
                this.f3303K = c0001b;
                c0001b.U(c0235c);
                return;
            case 14:
                C0235c c0235c2 = new C0235c(23, this);
                C0001b c0001b2 = new C0001b(bVar, "flutter/textinput", r2.k.f4892a, 26);
                this.f3303K = c0001b2;
                c0001b2.U(c0235c2);
                return;
            default:
                C0235c c0235c3 = new C0235c(15, this);
                C0001b c0001b3 = new C0001b(bVar, "flutter/localization", r2.k.f4892a, 26);
                this.f3303K = c0001b3;
                c0001b3.U(c0235c3);
                return;
        }
    }

    public J(Context context, Object obj, LinkedHashSet linkedHashSet) {
        x.w a4;
        this.f3302J = 23;
        Object obj2 = new Object();
        this.f3303K = new HashMap();
        this.f3304L = obj2;
        if (obj instanceof x.w) {
            a4 = (x.w) obj;
        } else {
            a4 = x.w.a(context, F.e.c());
        }
        context.getClass();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ((HashMap) this.f3303K).put(str, new a0(context, str, a4, (O1.a) this.f3304L));
        }
    }

    public J(j2.b bVar, PackageManager packageManager) {
        this.f3302J = 12;
        C0322i c0322i = new C0322i(13, this);
        this.f3303K = packageManager;
        new C0001b(bVar, "flutter/processtext", r2.s.f4896a, 26).U(c0322i);
    }

    public J(Handler handler) {
        this.f3302J = 28;
        this.f3303K = new HashMap();
        this.f3304L = handler;
    }

    private final void z(Throwable th) {
    }
}
