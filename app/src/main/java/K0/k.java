package K0;

import android.app.Activity;

/* loaded from: classes.dex */
public final class k extends F2.g implements M2.p {

    /* renamed from: N  reason: collision with root package name */
    public int f840N;

    /* renamed from: O  reason: collision with root package name */
    public /* synthetic */ Object f841O;

    /* renamed from: P  reason: collision with root package name */
    public final /* synthetic */ b f842P;

    /* renamed from: Q  reason: collision with root package name */
    public final /* synthetic */ Activity f843Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(b bVar, Activity activity, D2.d dVar) {
        super(2, dVar);
        this.f842P = bVar;
        this.f843Q = activity;
    }

    @Override // F2.b
    public final D2.d f(D2.d dVar, Object obj) {
        k kVar = new k(this.f842P, this.f843Q, dVar);
        kVar.f841O = obj;
        return kVar;
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        return ((k) f((D2.d) obj2, (X2.q) obj)).k(B2.i.f210a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, y0.d] */
    @Override // F2.b
    public final Object k(Object obj) {
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        int r12 = this.f840N;
        if (r12 != 0) {
            if (r12 == 1) {
                P1.a.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            P1.a.b(obj);
            X2.q qVar = (X2.q) this.f841O;
            i iVar = new i(0, qVar);
            b bVar = this.f842P;
            ((L0.a) bVar.f821K).a(this.f843Q, new Object(), iVar);
            j jVar = new j(0, bVar, iVar);
            this.f840N = 1;
            if (X2.j.b(qVar, jVar, this) == aVar) {
                return aVar;
            }
        }
        return B2.i.f210a;
    }
}
