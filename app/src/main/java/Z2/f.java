package Z2;

import java.util.ArrayList;
import x1.AbstractC0600e4;

/* loaded from: classes.dex */
public abstract class f implements j {

    /* renamed from: J  reason: collision with root package name */
    public final D2.i f1783J;

    /* renamed from: K  reason: collision with root package name */
    public final int f1784K;

    /* renamed from: L  reason: collision with root package name */
    public final X2.a f1785L;

    public f(D2.i iVar, int r22, X2.a aVar) {
        this.f1783J = iVar;
        this.f1784K = r22;
        this.f1785L = aVar;
    }

    public abstract Object a(X2.q qVar, D2.d dVar);

    public abstract f b(D2.i iVar, int r22, X2.a aVar);

    @Override // Y2.d
    public Object h(Y2.e eVar, D2.d dVar) {
        d dVar2 = new d(eVar, this, null);
        a3.t tVar = new a3.t(dVar, dVar.e());
        Object a4 = AbstractC0600e4.a(tVar, tVar, dVar2);
        if (a4 != E2.a.COROUTINE_SUSPENDED) {
            return B2.i.f210a;
        }
        return a4;
    }

    @Override // Z2.j
    public final Y2.d s(D2.i iVar, int r6, X2.a aVar) {
        D2.i iVar2 = this.f1783J;
        D2.i k3 = iVar.k(iVar2);
        X2.a aVar2 = X2.a.SUSPEND;
        X2.a aVar3 = this.f1785L;
        int r3 = this.f1784K;
        if (aVar == aVar2) {
            if (r3 != -3) {
                if (r6 != -3) {
                    if (r3 != -2) {
                        if (r6 != -2) {
                            r6 += r3;
                            if (r6 < 0) {
                                r6 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                r6 = r3;
            }
            aVar = aVar3;
        }
        if (N2.g.a(k3, iVar2) && r6 == r3 && aVar == aVar3) {
            return this;
        }
        return b(k3, r6, aVar);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        D2.j jVar = D2.j.f492J;
        D2.i iVar = this.f1783J;
        if (iVar != jVar) {
            arrayList.add("context=" + iVar);
        }
        int r22 = this.f1784K;
        if (r22 != -3) {
            arrayList.add("capacity=" + r22);
        }
        X2.a aVar = X2.a.SUSPEND;
        X2.a aVar2 = this.f1785L;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        return getClass().getSimpleName() + '[' + C2.i.j(arrayList, ", ", null, null, null, 62) + ']';
    }
}
