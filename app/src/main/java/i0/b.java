package I0;

import F2.g;
import K0.i;
import M2.p;
import V2.InterfaceC0063u;
import Y2.d;

/* loaded from: classes.dex */
public final class b extends g implements p {

    /* renamed from: N  reason: collision with root package name */
    public int f786N;

    /* renamed from: O  reason: collision with root package name */
    public final /* synthetic */ d f787O;

    /* renamed from: P  reason: collision with root package name */
    public final /* synthetic */ i f788P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, i iVar, D2.d dVar2) {
        super(2, dVar2);
        this.f787O = dVar;
        this.f788P = iVar;
    }

    @Override // F2.b
    public final D2.d f(D2.d dVar, Object obj) {
        return new b(this.f787O, this.f788P, dVar);
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        return ((b) f((D2.d) obj2, (InterfaceC0063u) obj)).k(B2.i.f210a);
    }

    @Override // F2.b
    public final Object k(Object obj) {
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        int r12 = this.f786N;
        if (r12 != 0) {
            if (r12 == 1) {
                P1.a.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            P1.a.b(obj);
            a aVar2 = new a(0, this.f788P);
            this.f786N = 1;
            if (this.f787O.h(aVar2, this) == aVar) {
                return aVar;
            }
        }
        return B2.i.f210a;
    }
}
