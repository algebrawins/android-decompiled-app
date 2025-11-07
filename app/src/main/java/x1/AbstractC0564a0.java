package x1;

import V2.AbstractC0061s;

/* renamed from: x1.a0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0564a0 {
    public static D2.d a(D2.d dVar) {
        F2.b bVar;
        D2.d dVar2;
        N2.g.e(dVar, "<this>");
        if (dVar instanceof F2.b) {
            bVar = (F2.b) dVar;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            D2.d dVar3 = bVar.f656L;
            if (dVar3 == null) {
                D2.f fVar = (D2.f) bVar.e().f(D2.e.f491J);
                if (fVar != null) {
                    dVar2 = new a3.h((AbstractC0061s) fVar, bVar);
                } else {
                    dVar2 = bVar;
                }
                bVar.f656L = dVar2;
                return dVar2;
            }
            return dVar3;
        }
        return dVar;
    }
}
