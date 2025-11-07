package com.google.mlkit.vision.barcode.internal;

import B.a;
import F1.b;
import F1.e;
import F1.k;
import Q1.g;
import W1.d;
import W1.f;
import java.util.List;
import x1.C;
import x1.C0562A;
import x1.G;

/* loaded from: classes.dex */
public class BarcodeRegistrar implements e {
    @Override // F1.e
    public final List a() {
        a a4 = b.a(f.class);
        a4.a(new k(g.class, 1, 0));
        a4.f174M = d.f1504K;
        b b3 = a4.b();
        a a5 = b.a(W1.e.class);
        a5.a(new k(f.class, 1, 0));
        a5.a(new k(Q1.d.class, 1, 0));
        a5.a(new k(g.class, 1, 0));
        a5.f174M = d.f1505L;
        b b4 = a5.b();
        C0562A c0562a = C.f5509K;
        Object[] objArr = {b3, b4};
        for (int r12 = 0; r12 < 2; r12++) {
            if (objArr[r12] == null) {
                throw new NullPointerException(D.C.w("at index ", r12));
            }
        }
        return new G(2, objArr);
    }
}
