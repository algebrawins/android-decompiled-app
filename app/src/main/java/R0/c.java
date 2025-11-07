package r0;

import B2.i;
import M2.p;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class c extends F2.g implements p {

    /* renamed from: N  reason: collision with root package name */
    public int f4873N;

    /* renamed from: O  reason: collision with root package name */
    public /* synthetic */ Object f4874O;

    /* renamed from: P  reason: collision with root package name */
    public final /* synthetic */ F2.g f4875P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p pVar, D2.d dVar) {
        super(2, dVar);
        this.f4875P = (F2.g) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [M2.p, F2.g] */
    @Override // F2.b
    public final D2.d f(D2.d dVar, Object obj) {
        c cVar = new c(this.f4875P, dVar);
        cVar.f4874O = obj;
        return cVar;
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        return ((c) f((D2.d) obj2, (b) obj)).k(i.f210a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [M2.p, F2.g] */
    @Override // F2.b
    public final Object k(Object obj) {
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        int r12 = this.f4873N;
        if (r12 != 0) {
            if (r12 == 1) {
                P1.a.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            P1.a.b(obj);
            this.f4873N = 1;
            obj = this.f4875P.g((b) this.f4874O, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        b bVar = (b) obj;
        N2.g.c(bVar, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        ((AtomicBoolean) bVar.f4872b.f3983K).set(true);
        return bVar;
    }
}
