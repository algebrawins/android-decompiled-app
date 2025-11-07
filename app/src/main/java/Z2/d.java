package Z2;

import V2.AbstractC0066x;
import V2.D;
import V2.EnumC0065w;
import V2.InterfaceC0063u;

/* loaded from: classes.dex */
public final class d extends F2.g implements M2.p {

    /* renamed from: N  reason: collision with root package name */
    public int f1776N;

    /* renamed from: O  reason: collision with root package name */
    public /* synthetic */ Object f1777O;

    /* renamed from: P  reason: collision with root package name */
    public final /* synthetic */ Y2.e f1778P;

    /* renamed from: Q  reason: collision with root package name */
    public final /* synthetic */ f f1779Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Y2.e eVar, f fVar, D2.d dVar) {
        super(2, dVar);
        this.f1778P = eVar;
        this.f1779Q = fVar;
    }

    @Override // F2.b
    public final D2.d f(D2.d dVar, Object obj) {
        d dVar2 = new d(this.f1778P, this.f1779Q, dVar);
        dVar2.f1777O = obj;
        return dVar2;
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        return ((d) f((D2.d) obj2, (InterfaceC0063u) obj)).k(B2.i.f210a);
    }

    @Override // F2.b
    public final Object k(Object obj) {
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        int r12 = this.f1776N;
        B2.i iVar = B2.i.f210a;
        if (r12 != 0) {
            if (r12 == 1) {
                P1.a.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            P1.a.b(obj);
            InterfaceC0063u interfaceC0063u = (InterfaceC0063u) this.f1777O;
            f fVar = this.f1779Q;
            int r4 = fVar.f1784K;
            if (r4 == -3) {
                r4 = -2;
            }
            EnumC0065w enumC0065w = EnumC0065w.ATOMIC;
            M2.p eVar = new e(fVar, null);
            X2.c a4 = X2.j.a(r4, fVar.f1785L, 4);
            D2.i a5 = AbstractC0066x.a(interfaceC0063u.h(), fVar.f1783J, true);
            c3.f fVar2 = D.f1390a;
            if (a5 != fVar2 && a5.f(D2.e.f491J) == null) {
                a5 = a5.k(fVar2);
            }
            X2.p pVar = new X2.p(a5, a4);
            pVar.W(enumC0065w, pVar, eVar);
            this.f1776N = 1;
            Object b3 = Y2.r.b(this.f1778P, pVar, true, this);
            if (b3 != aVar) {
                b3 = iVar;
            }
            if (b3 == aVar) {
                return aVar;
            }
        }
        return iVar;
    }
}
