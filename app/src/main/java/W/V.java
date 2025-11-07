package w;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.C0076c;
import androidx.camera.core.impl.C0095x;
import v.C0479a;
import z.AbstractC0957j;

/* loaded from: classes.dex */
public final class V extends C0485A {

    /* renamed from: b  reason: collision with root package name */
    public static final V f5091b = new Object();

    @Override // w.C0485A
    public final void a(androidx.camera.core.impl.G g, C0095x c0095x) {
        CaptureRequest.Key key;
        CaptureRequest.Key key2;
        super.a(g, c0095x);
        if (g instanceof androidx.camera.core.impl.G) {
            androidx.camera.core.impl.O b3 = androidx.camera.core.impl.O.b();
            C0076c c0076c = androidx.camera.core.impl.G.f2128K;
            if (g.q(c0076c)) {
                int intValue = ((Integer) D.C.o(g, c0076c)).intValue();
                if (((z.t) AbstractC0957j.f6565a.b(z.t.class)) != null) {
                    if (intValue == 0) {
                        key = CaptureRequest.CONTROL_ENABLE_ZSL;
                        b3.g(C0479a.r0(key), Boolean.TRUE);
                    } else if (intValue == 1) {
                        key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
                        b3.g(C0479a.r0(key2), Boolean.FALSE);
                    }
                }
            }
            c0095x.c(new A.a(7, androidx.camera.core.impl.S.a(b3)));
            return;
        }
        throw new IllegalArgumentException("config is not ImageCaptureConfig");
    }
}
