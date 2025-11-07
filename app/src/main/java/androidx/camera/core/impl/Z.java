package androidx.camera.core.impl;

import D.C0042x;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import v.C0479a;
import v.C0480b;
import z.AbstractC0957j;
import z.C0940A;

/* loaded from: classes.dex */
public final class Z extends Y {
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.camera.core.impl.Z, androidx.camera.core.impl.Y] */
    public static Z d(k0 k0Var, Size size) {
        if (k0Var.y() != null) {
            ?? y3 = new Y();
            c0 u3 = k0Var.u();
            S s3 = S.f2152L;
            int r4 = c0.a().f2184f.f2248c;
            ArrayList arrayList = y3.f2161d;
            ArrayList arrayList2 = y3.f2160c;
            C0095x c0095x = y3.f2159b;
            if (u3 != null) {
                C0096y c0096y = u3.f2184f;
                r4 = c0096y.f2248c;
                for (CameraDevice.StateCallback stateCallback : u3.f2180b) {
                    if (!arrayList2.contains(stateCallback)) {
                        arrayList2.add(stateCallback);
                    }
                }
                for (CameraCaptureSession.StateCallback stateCallback2 : u3.f2181c) {
                    if (!arrayList.contains(stateCallback2)) {
                        arrayList.add(stateCallback2);
                    }
                }
                c0095x.a(c0096y.f2250e);
                s3 = c0096y.f2247b;
            }
            c0095x.getClass();
            c0095x.f2238b = O.c(s3);
            if (k0Var instanceof T) {
                Rational rational = A.g.f12a;
                if (((C0940A) AbstractC0957j.f6565a.b(C0940A.class)) != null) {
                    if (!A.g.f12a.equals(new Rational(size.getWidth(), size.getHeight()))) {
                        O b3 = O.b();
                        b3.g(C0479a.r0(CaptureRequest.TONEMAP_MODE), 2);
                        c0095x.c(new A.a(7, S.a(b3)));
                    }
                }
            }
            c0095x.f2239c = ((Integer) k0Var.i0(C0479a.f5035L, Integer.valueOf(r4))).intValue();
            CameraDevice.StateCallback stateCallback3 = (CameraDevice.StateCallback) k0Var.i0(C0479a.f5037N, new CameraDevice.StateCallback());
            if (!arrayList2.contains(stateCallback3)) {
                arrayList2.add(stateCallback3);
            }
            CameraCaptureSession.StateCallback stateCallback4 = (CameraCaptureSession.StateCallback) k0Var.i0(C0479a.f5038O, new CameraCaptureSession.StateCallback());
            if (!arrayList.contains(stateCallback4)) {
                arrayList.add(stateCallback4);
            }
            w.K k3 = new w.K((CameraCaptureSession.CaptureCallback) k0Var.i0(C0479a.f5039P, new CameraCaptureSession.CaptureCallback()));
            c0095x.b(k3);
            ArrayList arrayList3 = y3.f2163f;
            if (!arrayList3.contains(k3)) {
                arrayList3.add(k3);
            }
            O b4 = O.b();
            C0076c c0076c = C0479a.f5040Q;
            b4.g(c0076c, (C0480b) k0Var.i0(c0076c, C0480b.a()));
            C0076c c0076c2 = C0479a.f5042S;
            b4.g(c0076c2, (String) k0Var.i0(c0076c2, null));
            C0076c c0076c3 = C0479a.f5036M;
            Long l3 = (Long) k0Var.i0(c0076c3, -1L);
            l3.getClass();
            b4.g(c0076c3, l3);
            c0095x.c(b4);
            c0095x.c(new A.a(7, S.a(C.g.c(k0Var).f232b)));
            return y3;
        }
        throw new IllegalStateException("Implementation is missing option unpacker for " + k0Var.N(k0Var.toString()));
    }

    public final void a(C0479a c0479a) {
        this.f2159b.c(c0479a);
    }

    public final void b(D d4, C0042x c0042x) {
        a1.i a4 = C0078e.a(d4);
        if (c0042x != null) {
            a4.f1835M = c0042x;
            this.f2158a.add(a4.g());
            this.f2159b.f2237a.add(d4);
            return;
        }
        throw new NullPointerException("Null dynamicRange");
    }

    public final c0 c() {
        return new c0(new ArrayList(this.f2158a), new ArrayList(this.f2160c), new ArrayList(this.f2161d), new ArrayList(this.f2163f), new ArrayList(this.f2162e), this.f2159b.d(), this.g);
    }
}
