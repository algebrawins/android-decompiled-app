package n0;

import V2.C0055l;
import V2.InterfaceC0063u;

/* renamed from: n0.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0391y extends F2.g implements M2.p {

    /* renamed from: N  reason: collision with root package name */
    public int f4338N;

    /* renamed from: O  reason: collision with root package name */
    public final /* synthetic */ N f4339O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0391y(N n3, D2.d dVar) {
        super(2, dVar);
        this.f4339O = n3;
    }

    @Override // F2.b
    public final D2.d f(D2.d dVar, Object obj) {
        return new C0391y(this.f4339O, dVar);
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        return ((C0391y) f((D2.d) obj2, (InterfaceC0063u) obj)).k(B2.i.f210a);
    }

    @Override // F2.b
    public final Object k(Object obj) {
        Y2.d hVar;
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        int r12 = this.f4338N;
        B2.i iVar = B2.i.f210a;
        N n3 = this.f4339O;
        if (r12 != 0) {
            if (r12 != 1) {
                if (r12 == 2) {
                    P1.a.b(obj);
                    return iVar;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P1.a.b(obj);
        } else {
            P1.a.b(obj);
            this.f4338N = 1;
            Object U3 = ((C0055l) n3.f4224R.f1833K).U(this);
            if (U3 != aVar) {
                U3 = iVar;
            }
            if (U3 == aVar) {
                return aVar;
            }
        }
        A.a aVar2 = n3.h().f4254c;
        X2.a aVar3 = X2.a.DROP_OLDEST;
        if (aVar2 instanceof Z2.j) {
            hVar = Z2.l.a((Z2.j) aVar2, null, 0, aVar3, 1);
        } else {
            hVar = new Z2.h(aVar2, D2.j.f492J, 0, aVar3);
        }
        I0.a aVar4 = new I0.a(2, n3);
        this.f4338N = 2;
        if (hVar.h(aVar4, this) == aVar) {
            return aVar;
        }
        return iVar;
    }
}
