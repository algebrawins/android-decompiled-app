package w;

import D.AbstractC0024d;
import D.C0025e;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import android.util.Size;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import x.C0559n;
import x1.AbstractC0572b0;
import x1.AbstractC0624h4;
import x1.AbstractC0696r5;

/* renamed from: w.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0514y implements androidx.camera.core.impl.r {

    /* renamed from: a  reason: collision with root package name */
    public final String f5272a;

    /* renamed from: b  reason: collision with root package name */
    public final C0559n f5273b;

    /* renamed from: c  reason: collision with root package name */
    public final A.a f5274c;

    /* renamed from: e  reason: collision with root package name */
    public C0501k f5276e;

    /* renamed from: h  reason: collision with root package name */
    public final C0513x f5278h;

    /* renamed from: i  reason: collision with root package name */
    public final A0.Q f5279i;

    /* renamed from: d  reason: collision with root package name */
    public final Object f5275d = new Object();

    /* renamed from: f  reason: collision with root package name */
    public C0513x f5277f = null;
    public C0513x g = null;

    public C0514y(String str, x.w wVar) {
        str.getClass();
        this.f5272a = str;
        C0559n b3 = wVar.b(str);
        this.f5273b = b3;
        this.f5274c = new A.a(6, this);
        this.f5279i = AbstractC0696r5.a(b3);
        new HashMap();
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            x1.X.g("Camera2EncoderProfilesProvider", "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
        }
        this.f5278h = new C0513x(new C0025e(D.r.CLOSED, null));
    }

    @Override // androidx.camera.core.impl.r
    public final int a() {
        return h(0);
    }

    @Override // androidx.camera.core.impl.r
    public final int b() {
        boolean z3;
        Integer num = (Integer) this.f5273b.a(CameraCharacteristics.LENS_FACING);
        if (num != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0624h4.a("Unable to get the lens facing of the camera.", z3);
        int intValue = num.intValue();
        if (intValue == 0) {
            return 0;
        }
        if (intValue != 1) {
            if (intValue == 2) {
                return 2;
            }
            throw new IllegalArgumentException(D.C.v(intValue, "The given lens facing integer: ", " can not be recognized."));
        }
        return 1;
    }

    @Override // androidx.camera.core.impl.r
    public final A0.Q c() {
        return this.f5279i;
    }

    @Override // androidx.camera.core.impl.r
    public final List d(int r22) {
        Size[] c4 = this.f5273b.b().c(r22);
        if (c4 != null) {
            return Arrays.asList(c4);
        }
        return Collections.emptyList();
    }

    @Override // androidx.camera.core.impl.r
    public final String e() {
        return this.f5272a;
    }

    @Override // androidx.camera.core.impl.r
    public final androidx.lifecycle.z f() {
        synchronized (this.f5275d) {
            try {
                C0501k c0501k = this.f5276e;
                if (c0501k == null) {
                    if (this.f5277f == null) {
                        this.f5277f = new C0513x(0);
                    }
                    return this.f5277f;
                }
                C0513x c0513x = this.f5277f;
                if (c0513x != null) {
                    return c0513x;
                }
                return c0501k.f5185R.f5169b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.r
    public final androidx.lifecycle.z g() {
        synchronized (this.f5275d) {
            try {
                C0501k c0501k = this.f5276e;
                if (c0501k == null) {
                    if (this.g == null) {
                        m0 b3 = j1.o.b(this.f5273b);
                        n0 n0Var = new n0(b3.d(), b3.c());
                        n0Var.f();
                        this.g = new C0513x(I.a.e(n0Var));
                    }
                    return this.g;
                }
                C0513x c0513x = this.g;
                if (c0513x != null) {
                    return c0513x;
                }
                return (androidx.lifecycle.z) c0501k.f5184Q.f3834e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.r
    public final int h(int r4) {
        Integer num = (Integer) this.f5273b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        int intValue = num.intValue();
        int b3 = AbstractC0572b0.b(r4);
        boolean z3 = true;
        if (1 != b()) {
            z3 = false;
        }
        return AbstractC0572b0.a(b3, intValue, z3);
    }

    @Override // androidx.camera.core.impl.r
    public final androidx.lifecycle.z i() {
        return this.f5278h;
    }

    @Override // androidx.camera.core.impl.r
    public final boolean j() {
        C0559n c0559n = this.f5273b;
        Objects.requireNonNull(c0559n);
        return AbstractC0024d.a(new A.k(19, c0559n));
    }

    @Override // androidx.camera.core.impl.r
    public final androidx.camera.core.impl.r k() {
        return this;
    }

    public final void l(C0501k c0501k) {
        String str;
        synchronized (this.f5275d) {
            try {
                this.f5276e = c0501k;
                C0513x c0513x = this.g;
                if (c0513x != null) {
                    c0513x.l((androidx.lifecycle.z) c0501k.f5184Q.f3834e);
                }
                C0513x c0513x2 = this.f5277f;
                if (c0513x2 != null) {
                    c0513x2.l(this.f5276e.f5185R.f5169b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Integer num = (Integer) this.f5273b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue != 4) {
                            str = D.C.w("Unknown value: ", intValue);
                        } else {
                            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
                        }
                    } else {
                        str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
                    }
                } else {
                    str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
                }
            } else {
                str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
            }
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        }
        String I3 = D.C.I("Device Level: ", str);
        String f2 = x1.X.f("Camera2CameraInfo");
        if (x1.X.e(f2, 4)) {
            Log.i(f2, I3);
        }
    }
}
