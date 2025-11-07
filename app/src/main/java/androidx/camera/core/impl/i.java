package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract /* synthetic */ class I {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f2137a = 0;

    static {
        C0076c c0076c = J.f2138n;
    }

    public static int a(J j3) {
        return ((Integer) j3.i0(J.f2140p, -1)).intValue();
    }

    public static ArrayList b(J j3) {
        List list = (List) j3.i0(J.f2147w, null);
        if (list == null) {
            return null;
        }
        return new ArrayList(list);
    }

    public static int c(J j3) {
        return ((Integer) j3.i0(J.f2141q, 0)).intValue();
    }

    public static int d(J j3) {
        return ((Integer) j3.i0(J.f2139o, 0)).intValue();
    }

    public static void e(J j3) {
        boolean z3;
        boolean M3 = j3.M();
        if (j3.k() != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (M3 && z3) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (j3.A() != null) {
            if (M3 || z3) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }
}
