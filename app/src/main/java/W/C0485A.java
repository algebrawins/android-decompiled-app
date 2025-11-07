package w;

import android.hardware.camera2.CameraCaptureSession;
import android.util.ArrayMap;
import android.util.Range;
import androidx.camera.core.impl.C0076c;
import androidx.camera.core.impl.C0079f;
import androidx.camera.core.impl.C0095x;
import androidx.camera.core.impl.C0096y;
import java.util.ArrayList;
import java.util.HashSet;
import v.C0479a;

/* renamed from: w.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0485A {

    /* renamed from: a  reason: collision with root package name */
    public static final C0485A f5047a = new Object();

    public void a(androidx.camera.core.impl.G g, C0095x c0095x) {
        C0096y c0096y = (C0096y) g.i0(androidx.camera.core.impl.k0.f2219y, null);
        androidx.camera.core.impl.S s3 = androidx.camera.core.impl.S.f2152L;
        C0076c c0076c = C0096y.f2244i;
        HashSet hashSet = new HashSet();
        androidx.camera.core.impl.O b3 = androidx.camera.core.impl.O.b();
        Range range = C0079f.f2191e;
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.P a4 = androidx.camera.core.impl.P.a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        androidx.camera.core.impl.S a5 = androidx.camera.core.impl.S.a(b3);
        ArrayList arrayList3 = new ArrayList(arrayList);
        androidx.camera.core.impl.h0 h0Var = androidx.camera.core.impl.h0.f2205b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = a4.f2206a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        androidx.camera.core.impl.h0 h0Var2 = new androidx.camera.core.impl.h0(arrayMap);
        int r3 = -1;
        new C0096y(arrayList2, a5, -1, range, arrayList3, false, h0Var2, null);
        if (c0096y != null) {
            c0095x.a(c0096y.f2250e);
            s3 = c0096y.f2247b;
            r3 = c0096y.f2248c;
        }
        c0095x.f2238b = androidx.camera.core.impl.O.c(s3);
        c0095x.f2239c = ((Integer) g.i0(C0479a.f5035L, Integer.valueOf(r3))).intValue();
        c0095x.b(new K((CameraCaptureSession.CaptureCallback) g.i0(C0479a.f5039P, new CameraCaptureSession.CaptureCallback())));
        c0095x.c(new A.a(7, androidx.camera.core.impl.S.a(C.g.c(g).f232b)));
    }
}
