package w;

import A0.C0002c;
import D.C0026f;
import android.hardware.camera2.CameraDevice;
import android.os.SystemClock;
import androidx.camera.core.impl.C0093v;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import x1.AbstractC0624h4;

/* renamed from: w.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0510u extends CameraDevice.StateCallback {

    /* renamed from: a  reason: collision with root package name */
    public final G.l f5237a;

    /* renamed from: b  reason: collision with root package name */
    public final G.e f5238b;

    /* renamed from: c  reason: collision with root package name */
    public RunnableC0509t f5239c;

    /* renamed from: d  reason: collision with root package name */
    public ScheduledFuture f5240d;

    /* renamed from: e  reason: collision with root package name */
    public final C0002c f5241e = new C0002c(this);

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ C0511v f5242f;

    public C0510u(C0511v c0511v, G.l lVar, G.e eVar) {
        this.f5242f = c0511v;
        this.f5237a = lVar;
        this.f5238b = eVar;
    }

    public final boolean a() {
        if (this.f5240d == null) {
            return false;
        }
        this.f5242f.q("Cancelling scheduled re-open: " + this.f5239c, null);
        this.f5239c.f5235K = true;
        this.f5239c = null;
        this.f5240d.cancel(false);
        this.f5240d = null;
        return true;
    }

    public final void b() {
        boolean z3;
        int r6;
        boolean z4 = true;
        if (this.f5239c == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0624h4.f(null, z3);
        if (this.f5240d != null) {
            z4 = false;
        }
        AbstractC0624h4.f(null, z4);
        C0002c c0002c = this.f5241e;
        c0002c.getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        if (c0002c.f88K == -1) {
            c0002c.f88K = uptimeMillis;
        }
        long j3 = uptimeMillis - c0002c.f88K;
        C0510u c0510u = (C0510u) c0002c.f89L;
        int r7 = 1800000;
        if (!c0510u.c()) {
            r6 = ModuleDescriptor.MODULE_VERSION;
        } else {
            r6 = 1800000;
        }
        long j4 = r6;
        C0511v c0511v = this.f5242f;
        if (j3 >= j4) {
            c0002c.f88K = -1L;
            StringBuilder sb = new StringBuilder("Camera reopening attempted for ");
            if (!c0510u.c()) {
                r7 = ModuleDescriptor.MODULE_VERSION;
            }
            sb.append(r7);
            sb.append("ms without success.");
            x1.X.b("Camera2CameraImpl", sb.toString());
            c0511v.D(EnumC0508s.PENDING_OPEN, null, false);
            return;
        }
        this.f5239c = new RunnableC0509t(this, this.f5237a);
        c0511v.q("Attempting camera re-open in " + c0002c.c() + "ms: " + this.f5239c + " activeResuming = " + c0511v.f5265g0, null);
        this.f5240d = this.f5238b.schedule(this.f5239c, (long) c0002c.c(), TimeUnit.MILLISECONDS);
    }

    public final boolean c() {
        int r02;
        C0511v c0511v = this.f5242f;
        if (c0511v.f5265g0 && ((r02 = c0511v.f5253T) == 1 || r02 == 2)) {
            return true;
        }
        return false;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        boolean z3;
        this.f5242f.q("CameraDevice.onClosed()", null);
        if (this.f5242f.f5252S == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0624h4.f("Unexpected onClose callback on camera device: " + cameraDevice, z3);
        int r6 = AbstractC0507q.f5230a[this.f5242f.f5246M.ordinal()];
        if (r6 != 3) {
            if (r6 != 7) {
                if (r6 != 8) {
                    throw new IllegalStateException("Camera closed while in state: " + this.f5242f.f5246M);
                }
            } else {
                C0511v c0511v = this.f5242f;
                int r02 = c0511v.f5253T;
                if (r02 != 0) {
                    c0511v.q("Camera closed due to error: ".concat(C0511v.s(r02)), null);
                    b();
                    return;
                }
                c0511v.H(false);
                return;
            }
        }
        AbstractC0624h4.f(null, this.f5242f.v());
        this.f5242f.r();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        this.f5242f.q("CameraDevice.onDisconnected()", null);
        onError(cameraDevice, 1);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int r11) {
        boolean z3;
        int r10;
        C0511v c0511v = this.f5242f;
        c0511v.f5252S = cameraDevice;
        c0511v.f5253T = r11;
        switch (AbstractC0507q.f5230a[c0511v.f5246M.ordinal()]) {
            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
            case 8:
                String id = cameraDevice.getId();
                String s3 = C0511v.s(r11);
                String name = this.f5242f.f5246M.name();
                x1.X.b("Camera2CameraImpl", "CameraDevice.onError(): " + id + " failed with " + s3 + " while in " + name + " state. Will finish closing camera.");
                this.f5242f.h();
                return;
            case 4:
            case q0.k.STRING_FIELD_NUMBER /* 5 */:
            case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
            case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                String id2 = cameraDevice.getId();
                String s4 = C0511v.s(r11);
                String name2 = this.f5242f.f5246M.name();
                x1.X.a("Camera2CameraImpl", "CameraDevice.onError(): " + id2 + " failed with " + s4 + " while in " + name2 + " state. Will attempt recovering from error.");
                boolean z4 = false;
                if (this.f5242f.f5246M != EnumC0508s.OPENING && this.f5242f.f5246M != EnumC0508s.OPENED && this.f5242f.f5246M != EnumC0508s.CONFIGURED && this.f5242f.f5246M != EnumC0508s.REOPENING) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                AbstractC0624h4.f("Attempt to handle open error from non open state: " + this.f5242f.f5246M, z3);
                int r12 = 3;
                if (r11 != 1 && r11 != 2 && r11 != 4) {
                    x1.X.b("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + C0511v.s(r11) + " closing camera.");
                    if (r11 == 3) {
                        r10 = 5;
                    } else {
                        r10 = 6;
                    }
                    this.f5242f.D(EnumC0508s.CLOSING, new C0026f(r10, null), true);
                    this.f5242f.h();
                    return;
                }
                String id3 = cameraDevice.getId();
                String s5 = C0511v.s(r11);
                x1.X.a("Camera2CameraImpl", "Attempt to reopen camera[" + id3 + "] after error[" + s5 + "]");
                C0511v c0511v2 = this.f5242f;
                if (c0511v2.f5253T != 0) {
                    z4 = true;
                }
                AbstractC0624h4.f("Can only reopen camera device after error if the camera device is actually in an error state.", z4);
                if (r11 != 1) {
                    if (r11 == 2) {
                        r12 = 1;
                    }
                } else {
                    r12 = 2;
                }
                c0511v2.D(EnumC0508s.REOPENING, new C0026f(r12, null), true);
                c0511v2.h();
                return;
            default:
                throw new IllegalStateException("onError() should not be possible from state: " + this.f5242f.f5246M);
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        this.f5242f.q("CameraDevice.onOpened()", null);
        C0511v c0511v = this.f5242f;
        c0511v.f5252S = cameraDevice;
        c0511v.f5253T = 0;
        this.f5241e.f88K = -1L;
        int r02 = AbstractC0507q.f5230a[c0511v.f5246M.ordinal()];
        if (r02 != 3) {
            if (r02 != 6 && r02 != 7) {
                if (r02 != 8) {
                    throw new IllegalStateException("onOpened() should not be possible from state: " + this.f5242f.f5246M);
                }
            } else {
                this.f5242f.C(EnumC0508s.OPENED);
                C0093v c0093v = this.f5242f.f5258Y;
                String id = cameraDevice.getId();
                C0511v c0511v2 = this.f5242f;
                if (c0093v.d(id, c0511v2.f5257X.c(c0511v2.f5252S.getId()))) {
                    this.f5242f.y();
                    return;
                }
                return;
            }
        }
        AbstractC0624h4.f(null, this.f5242f.v());
        this.f5242f.f5252S.close();
        this.f5242f.f5252S = null;
    }
}
