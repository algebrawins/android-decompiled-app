package r0;

import B2.i;
import M2.p;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class f extends F2.g implements p {

    /* renamed from: N  reason: collision with root package name */
    public int f4877N;

    /* renamed from: O  reason: collision with root package name */
    public /* synthetic */ Object f4878O;

    /* renamed from: P  reason: collision with root package name */
    public final /* synthetic */ F2.g f4879P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p pVar, D2.d dVar) {
        super(2, dVar);
        this.f4879P = (F2.g) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [M2.p, F2.g] */
    @Override // F2.b
    public final D2.d f(D2.d dVar, Object obj) {
        f fVar = new f(this.f4879P, dVar);
        fVar.f4878O = obj;
        return fVar;
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        return ((f) f((D2.d) obj2, (b) obj)).k(i.f210a);
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [M2.p, F2.g] */
    @Override // F2.b
    public final Object k(Object obj) {
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        int r12 = this.f4877N;
        if (r12 != 0) {
            if (r12 == 1) {
                b bVar = (b) this.f4878O;
                P1.a.b(obj);
                return bVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        P1.a.b(obj);
        b bVar2 = new b(new LinkedHashMap(((b) this.f4878O).a()), false);
        this.f4878O = bVar2;
        this.f4877N = 1;
        if (this.f4879P.g(bVar2, this) == aVar) {
            return aVar;
        }
        return bVar2;
    }
}
