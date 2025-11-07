package k0;

import A0.C0001b;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.Handler;
import android.os.Parcel;
import android.util.Log;
import android.util.Size;
import android.view.accessibility.AccessibilityEvent;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.libraries.barhopper.RecognitionOptions;
import d2.C0235c;
import h2.J;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import n0.C0385s;
import n0.Y;
import n0.Z;
import o.t;
import o1.C0398a;
import p.InterfaceC0413l;
import r2.InterfaceC0445b;
import r2.s;
import u1.AbstractC0474b;
import w.N;
import w.Q;
import w.d0;
import x1.X;

/* renamed from: k0.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0322i implements j1.i, o.o, InterfaceC0413l, InterfaceC0445b, r2.m, H.c, Y2.d, y0.e {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f3982J;

    /* renamed from: K  reason: collision with root package name */
    public Object f3983K;

    public /* synthetic */ C0322i(int r12, Object obj) {
        this.f3982J = r12;
        this.f3983K = obj;
    }

    private final void l(Throwable th) {
        synchronized (((Q) this.f3983K).f5060a) {
            try {
                ((d0) ((Q) this.f3983K).f5064e.f3003K).r();
                int r22 = N.f5057a[((Q) this.f3983K).f5070l.ordinal()];
                if ((r22 == 4 || r22 == 6 || r22 == 7) && !(th instanceof CancellationException)) {
                    X.h("CaptureSession", "Opening session with fail " + ((Q) this.f3983K).f5070l, th);
                    ((Q) this.f3983K).b();
                }
            } finally {
            }
        }
    }

    @Override // o.o
    public void a(o.j jVar, boolean z3) {
        if (jVar instanceof t) {
            ((t) jVar).f4484v.j().c(false);
        }
        o.o oVar = ((p.i) this.f3983K).f4625N;
        if (oVar != null) {
            oVar.a(jVar, z3);
        }
    }

    @Override // H.c
    public /* bridge */ /* synthetic */ void b(Object obj) {
        switch (this.f3982J) {
            case 20:
                Void r22 = (Void) obj;
                return;
            default:
                Void r23 = (Void) obj;
                return;
        }
    }

    @Override // r2.InterfaceC0445b
    public void c(Object obj, J j3) {
        C0001b c0001b = (C0001b) this.f3983K;
        if (((io.flutter.view.b) c0001b.f86M) == null) {
            j3.h(null);
            return;
        }
        HashMap hashMap = (HashMap) obj;
        String str = (String) hashMap.get("type");
        HashMap hashMap2 = (HashMap) hashMap.get("data");
        str.getClass();
        char c4 = 65535;
        switch (str.hashCode()) {
            case -1140076541:
                if (str.equals("tooltip")) {
                    c4 = 0;
                    break;
                }
                break;
            case -649620375:
                if (str.equals("announce")) {
                    c4 = 1;
                    break;
                }
                break;
            case 114595:
                if (str.equals("tap")) {
                    c4 = 2;
                    break;
                }
                break;
            case 97604824:
                if (str.equals("focus")) {
                    c4 = 3;
                    break;
                }
                break;
            case 114203431:
                if (str.equals("longPress")) {
                    c4 = 4;
                    break;
                }
                break;
        }
        switch (c4) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                String str2 = (String) hashMap2.get("message");
                if (str2 != null) {
                    io.flutter.view.b bVar = (io.flutter.view.b) c0001b.f86M;
                    if (Build.VERSION.SDK_INT >= 28) {
                        bVar.getClass();
                        break;
                    } else {
                        io.flutter.view.q qVar = (io.flutter.view.q) bVar.f3670a;
                        AccessibilityEvent c5 = qVar.c(0, 32);
                        c5.getText().add(str2);
                        qVar.g(c5);
                        break;
                    }
                }
                break;
            case 1:
                String str3 = (String) hashMap2.get("message");
                if (str3 != null) {
                    io.flutter.view.b bVar2 = (io.flutter.view.b) c0001b.f86M;
                    if (Build.VERSION.SDK_INT >= 36) {
                        bVar2.getClass();
                        Log.w("AccessibilityBridge", "Using AnnounceSemanticsEvent for accessibility is deprecated on Android. Migrate to using semantic properties for a more robust and accessible user experience.\nFlutter: If you are unsure why you are seeing this bug, it might be because you are using a widget that calls this method. See https://github.com/flutter/flutter/issues/165510 for more details.\nAndroid documentation: https://developer.android.com/reference/android/view/View#announceForAccessibility(java.lang.CharSequence)");
                    }
                    ((io.flutter.view.q) bVar2.f3670a).f3740a.announceForAccessibility(str3);
                    break;
                }
                break;
            case 2:
                Integer num = (Integer) hashMap.get("nodeId");
                if (num != null) {
                    ((io.flutter.view.q) ((io.flutter.view.b) c0001b.f86M).f3670a).f(num.intValue(), 1);
                    break;
                }
                break;
            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                Integer num2 = (Integer) hashMap.get("nodeId");
                if (num2 != null) {
                    ((io.flutter.view.q) ((io.flutter.view.b) c0001b.f86M).f3670a).f(num2.intValue(), 8);
                    break;
                }
                break;
            case 4:
                Integer num3 = (Integer) hashMap.get("nodeId");
                if (num3 != null) {
                    ((io.flutter.view.q) ((io.flutter.view.b) c0001b.f86M).f3670a).f(num3.intValue(), 2);
                    break;
                }
                break;
        }
        j3.h(null);
    }

    @Override // H.c
    public void c0(Throwable th) {
        d0 d0Var;
        switch (this.f3982J) {
            case 20:
                l(th);
                return;
            default:
                d0 d0Var2 = (d0) this.f3983K;
                d0Var2.o();
                V0.a aVar = d0Var2.f5135b;
                Iterator it = aVar.h().iterator();
                while (it.hasNext() && (d0Var = (d0) it.next()) != d0Var2) {
                    d0Var.o();
                }
                synchronized (aVar.f1357K) {
                    ((LinkedHashSet) aVar.f1360N).remove(d0Var2);
                }
                return;
        }
    }

    public Y d() {
        Y2.q qVar = (Y2.q) this.f3983K;
        qVar.getClass();
        U1.b bVar = Z2.l.f1793a;
        Object obj = Y2.q.f1738N.get(qVar);
        if (obj == bVar) {
            obj = null;
        }
        return (Y) obj;
    }

    @Override // y0.e
    public void e(int r4, Serializable serializable) {
        String str;
        switch (r4) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case q0.k.STRING_FIELD_NUMBER /* 5 */:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (r4 != 6 && r4 != 7 && r4 != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        }
        ((ProfileInstallReceiver) this.f3983K).setResultCode(r4);
    }

    @Override // o.o
    public boolean f(t tVar) {
        if (tVar == null) {
            return false;
        }
        tVar.f4485w.getClass();
        p.i iVar = (p.i) this.f3983K;
        iVar.getClass();
        o.o oVar = iVar.f4625N;
        if (oVar == null) {
            return false;
        }
        return oVar.f(tVar);
    }

    @Override // y0.e
    public void g() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // Y2.d
    public Object h(Y2.e eVar, D2.d dVar) {
        Object h3 = ((Y2.d) this.f3983K).h(new C0385s(eVar, 1), dVar);
        if (h3 == E2.a.COROUTINE_SUSPENDED) {
            return h3;
        }
        return B2.i.f210a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x04be, code lost:
        if (r5.f3577a.f1033a.get(r4) != null) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x04d3, code lost:
        throw new java.lang.IllegalStateException("Trying to create a platform view of unregistered type: " + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x04d9, code lost:
        throw new java.lang.ClassCastException();
     */
    @Override // r2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i(h2.J r42, q2.n r43) {
        /*
            Method dump skipped, instructions count: 1494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.C0322i.i(h2.J, q2.n):void");
    }

    @Override // j1.i
    public void j(Object obj, Object obj2) {
        o1.f fVar = new o1.f((C1.g) obj2, 1);
        o1.e eVar = (o1.e) ((o1.h) obj).q();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(eVar.f5025n);
        AbstractC0474b.d(obtain, fVar);
        AbstractC0474b.c(obtain, (C0398a) this.f3983K);
        obtain.writeStrongBinder(null);
        eVar.D(obtain, 2);
    }

    public Size[] k(int r3) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f3983K;
        if (r3 == 34) {
            return streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
        }
        return streamConfigurationMap.getOutputSizes(r3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r7.f4255a > r3.f4255a) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m(n0.Y r7) {
        /*
            r6 = this;
            java.lang.String r0 = "newState"
            N2.g.e(r7, r0)
        L5:
            java.lang.Object r0 = r6.f3983K
            Y2.q r0 = (Y2.q) r0
            r0.getClass()
            U1.b r1 = Z2.l.f1793a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = Y2.q.f1738N
            java.lang.Object r2 = r2.get(r0)
            if (r2 != r1) goto L17
            r2 = 0
        L17:
            r3 = r2
            n0.Y r3 = (n0.Y) r3
            boolean r4 = r3 instanceof n0.Q
            if (r4 == 0) goto L20
            r4 = 1
            goto L26
        L20:
            n0.Z r4 = n0.Z.f4256b
            boolean r4 = N2.g.a(r3, r4)
        L26:
            if (r4 == 0) goto L29
            goto L33
        L29:
            boolean r4 = r3 instanceof n0.C0370c
            if (r4 == 0) goto L35
            int r4 = r3.f4255a
            int r5 = r7.f4255a
            if (r5 <= r4) goto L39
        L33:
            r3 = r7
            goto L39
        L35:
            boolean r4 = r3 instanceof n0.O
            if (r4 == 0) goto L47
        L39:
            if (r2 != 0) goto L3c
            r2 = r1
        L3c:
            if (r3 != 0) goto L3f
            goto L40
        L3f:
            r1 = r3
        L40:
            boolean r0 = r0.c(r2, r1)
            if (r0 == 0) goto L5
            return
        L47:
            B2.b r7 = new B2.b
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.C0322i.m(n0.Y):void");
    }

    public /* synthetic */ C0322i(o1.g gVar, C0398a c0398a) {
        this.f3982J = 3;
        this.f3983K = c0398a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, r2.m] */
    public C0322i(j2.b bVar, int r6) {
        this.f3982J = r6;
        switch (r6) {
            case 12:
                new C0001b(bVar, "flutter/platform_views_2", s.f4896a, 26).U(new C0235c(18, this));
                return;
            case 16:
                this.f3983K = new a1.i((r2.f) bVar, "flutter/system", (r2.l) r2.j.f4891a, (R1.a) null);
                return;
            default:
                ?? obj = new Object();
                C0001b c0001b = new C0001b(bVar, "flutter/navigation", r2.k.f4892a, 26);
                this.f3983K = c0001b;
                c0001b.U(obj);
                return;
        }
    }

    public C0322i(int r22) {
        this.f3982J = r22;
        switch (r22) {
            case 2:
                this.f3983K = new Y2.q(Z.f4256b);
                return;
            case 26:
                return;
            default:
                this.f3983K = new AtomicInteger(0);
                return;
        }
    }

    public C0322i(boolean z3) {
        this.f3982J = 17;
        this.f3983K = new AtomicBoolean(z3);
    }

    public C0322i(r2.f fVar) {
        this.f3982J = 8;
        new C0001b(fVar, "flutter/keyboard", s.f4896a, 26).U(new J(this));
    }

    public C0322i(CameraDevice cameraDevice, Handler handler) {
        this.f3982J = 24;
        int r02 = Build.VERSION.SDK_INT;
        if (r02 >= 28) {
            cameraDevice.getClass();
            this.f3983K = new J(cameraDevice, (x.t) null);
        } else if (r02 >= 24) {
            this.f3983K = new J(cameraDevice, new x.t(handler));
        } else if (r02 >= 23) {
            this.f3983K = new J(cameraDevice, new x.t(handler));
        } else {
            this.f3983K = new J(cameraDevice, new x.t(handler));
        }
    }
}
