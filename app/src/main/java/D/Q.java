package D;

import androidx.camera.core.impl.C0076c;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a  reason: collision with root package name */
    public static final androidx.camera.core.impl.G f335a;

    static {
        Object bVar = new O.b(O.a.f1009a, O.c.f1012c, null);
        C0042x c0042x = C0042x.f480d;
        C.g gVar = new C.g(2);
        C0076c c0076c = androidx.camera.core.impl.k0.f2212B;
        androidx.camera.core.impl.O o3 = gVar.f232b;
        o3.g(c0076c, 4);
        o3.g(androidx.camera.core.impl.J.f2138n, 0);
        o3.g(androidx.camera.core.impl.J.f2146v, bVar);
        o3.g(androidx.camera.core.impl.k0.f2217G, androidx.camera.core.impl.m0.IMAGE_CAPTURE);
        if (c0042x.equals(c0042x)) {
            o3.g(androidx.camera.core.impl.H.f2136m, c0042x);
            f335a = new androidx.camera.core.impl.G(androidx.camera.core.impl.S.a(o3));
            return;
        }
        throw new UnsupportedOperationException("ImageCapture currently only supports SDR");
    }
}
