package w;

import android.content.Context;
import android.util.ArrayMap;
import android.util.Range;
import androidx.camera.core.impl.C0076c;
import androidx.camera.core.impl.C0079f;
import androidx.camera.core.impl.C0096y;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* renamed from: w.E  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0489E implements androidx.camera.core.impl.n0 {

    /* renamed from: b  reason: collision with root package name */
    public final S f5049b;

    public C0489E(Context context) {
        this.f5049b = S.b(context);
    }

    @Override // androidx.camera.core.impl.n0
    public final androidx.camera.core.impl.A a(androidx.camera.core.impl.m0 m0Var, int r28) {
        int r13;
        int r7;
        Object obj;
        androidx.camera.core.impl.O b3 = androidx.camera.core.impl.O.b();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        androidx.camera.core.impl.O b4 = androidx.camera.core.impl.O.b();
        Range range = C0079f.f2191e;
        ArrayList arrayList = new ArrayList();
        androidx.camera.core.impl.P a4 = androidx.camera.core.impl.P.a();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        int[] r15 = f0.f5157a;
        int r132 = r15[m0Var.ordinal()];
        int r16 = 5;
        if (r132 != 1) {
            if (r132 == 2 || r132 == 3) {
                r13 = 3;
            }
            r13 = 1;
        } else {
            if (r28 == 2) {
                r13 = 5;
            }
            r13 = 1;
        }
        C0076c c0076c = androidx.camera.core.impl.k0.f2218x;
        ArrayList arrayList6 = new ArrayList(linkedHashSet);
        ArrayList arrayList7 = new ArrayList(arrayList2);
        ArrayList arrayList8 = new ArrayList(arrayList3);
        ArrayList arrayList9 = new ArrayList(arrayList5);
        ArrayList arrayList10 = new ArrayList(arrayList4);
        ArrayList arrayList11 = new ArrayList(hashSet);
        androidx.camera.core.impl.S a5 = androidx.camera.core.impl.S.a(b4);
        ArrayList arrayList12 = new ArrayList(arrayList);
        androidx.camera.core.impl.h0 h0Var = androidx.camera.core.impl.h0.f2205b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = a4.f2206a;
        for (String str : arrayMap2.keySet()) {
            ArrayList arrayList13 = arrayList8;
            arrayMap.put(str, arrayMap2.get(str));
            arrayList9 = arrayList9;
            arrayList8 = arrayList13;
        }
        b3.g(c0076c, new androidx.camera.core.impl.c0(arrayList6, arrayList7, arrayList8, arrayList9, arrayList10, new C0096y(arrayList11, a5, r13, range, arrayList12, false, new androidx.camera.core.impl.h0(arrayMap), null), null));
        b3.g(androidx.camera.core.impl.k0.f2220z, C0488D.f5048a);
        HashSet hashSet2 = new HashSet();
        androidx.camera.core.impl.O b5 = androidx.camera.core.impl.O.b();
        Range range2 = C0079f.f2191e;
        ArrayList arrayList14 = new ArrayList();
        androidx.camera.core.impl.P a6 = androidx.camera.core.impl.P.a();
        int r6 = r15[m0Var.ordinal()];
        if (r6 != 1) {
            if (r6 != 2) {
                r7 = 3;
                if (r6 != 3) {
                    r7 = 1;
                }
            } else {
                r7 = 3;
            }
        } else {
            if (r28 != 2) {
                r16 = 2;
            }
            r7 = r16;
        }
        C0076c c0076c2 = androidx.camera.core.impl.k0.f2219y;
        ArrayList arrayList15 = new ArrayList(hashSet2);
        androidx.camera.core.impl.S a7 = androidx.camera.core.impl.S.a(b5);
        ArrayList arrayList16 = new ArrayList(arrayList14);
        androidx.camera.core.impl.h0 h0Var2 = androidx.camera.core.impl.h0.f2205b;
        ArrayMap arrayMap3 = new ArrayMap();
        ArrayMap arrayMap4 = a6.f2206a;
        for (String str2 : arrayMap4.keySet()) {
            arrayMap3.put(str2, arrayMap4.get(str2));
        }
        b3.g(c0076c2, new C0096y(arrayList15, a7, r7, range2, arrayList16, false, new androidx.camera.core.impl.h0(arrayMap3), null));
        C0076c c0076c3 = androidx.camera.core.impl.k0.f2211A;
        if (m0Var == androidx.camera.core.impl.m0.IMAGE_CAPTURE) {
            obj = V.f5091b;
        } else {
            obj = C0485A.f5047a;
        }
        b3.g(c0076c3, obj);
        androidx.camera.core.impl.m0 m0Var2 = androidx.camera.core.impl.m0.PREVIEW;
        S s3 = this.f5049b;
        if (m0Var == m0Var2) {
            b3.g(androidx.camera.core.impl.J.f2144t, s3.e());
        }
        b3.g(androidx.camera.core.impl.J.f2139o, Integer.valueOf(s3.c(true).getRotation()));
        if (m0Var == androidx.camera.core.impl.m0.VIDEO_CAPTURE || m0Var == androidx.camera.core.impl.m0.STREAM_SHARING) {
            b3.g(androidx.camera.core.impl.k0.f2215E, Boolean.TRUE);
        }
        return androidx.camera.core.impl.S.a(b3);
    }
}
