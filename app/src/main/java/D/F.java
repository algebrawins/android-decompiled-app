package D;

import android.util.Size;
import androidx.camera.core.impl.C0076c;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a  reason: collision with root package name */
    public static final androidx.camera.core.impl.F f286a;

    static {
        Object size = new Size(640, 480);
        C0042x c0042x = C0042x.f480d;
        Object bVar = new O.b(O.a.f1009a, new O.c(M.a.f852b), null);
        E e4 = new E(0);
        C0076c c0076c = androidx.camera.core.impl.J.f2143s;
        androidx.camera.core.impl.O o3 = e4.f285b;
        o3.g(c0076c, size);
        o3.g(androidx.camera.core.impl.k0.f2212B, 1);
        o3.g(androidx.camera.core.impl.J.f2138n, 0);
        o3.g(androidx.camera.core.impl.J.f2146v, bVar);
        o3.g(androidx.camera.core.impl.k0.f2217G, androidx.camera.core.impl.m0.IMAGE_ANALYSIS);
        if (c0042x.equals(c0042x)) {
            o3.g(androidx.camera.core.impl.H.f2136m, c0042x);
            f286a = new androidx.camera.core.impl.F(androidx.camera.core.impl.S.a(o3));
            return;
        }
        throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
    }
}
