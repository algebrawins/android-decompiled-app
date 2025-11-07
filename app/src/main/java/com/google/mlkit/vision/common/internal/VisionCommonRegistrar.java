package com.google.mlkit.vision.common.internal;

import B.a;
import D.C;
import F1.b;
import F1.e;
import F1.k;
import Y1.d;
import java.util.List;
import y1.T4;
import y1.V4;
import y1.X4;

/* loaded from: classes.dex */
public class VisionCommonRegistrar implements e {
    @Override // F1.e
    public final List a() {
        a a4 = b.a(Y1.e.class);
        a4.a(new k(d.class, 2, 0));
        a4.f174M = Y1.e.f1671K;
        Object[] objArr = {a4.b()};
        for (int r02 = 0; r02 < 1; r02++) {
            T4 t4 = V4.f6318K;
            if (objArr[r02] == null) {
                throw new NullPointerException(C.w("at index ", r02));
            }
        }
        T4 t42 = V4.f6318K;
        return new X4(1, objArr);
    }
}
