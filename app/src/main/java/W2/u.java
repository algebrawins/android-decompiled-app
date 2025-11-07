package w2;

import V2.InterfaceC0063u;
import java.util.List;

/* loaded from: classes.dex */
public final class u extends F2.g implements M2.p {

    /* renamed from: N  reason: collision with root package name */
    public int f5417N;

    /* renamed from: O  reason: collision with root package name */
    public final /* synthetic */ J f5418O;

    /* renamed from: P  reason: collision with root package name */
    public final /* synthetic */ List f5419P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(J j3, List list, D2.d dVar) {
        super(2, dVar);
        this.f5418O = j3;
        this.f5419P = list;
    }

    @Override // F2.b
    public final D2.d f(D2.d dVar, Object obj) {
        return new u(this.f5418O, this.f5419P, dVar);
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        return ((u) f((D2.d) obj2, (InterfaceC0063u) obj)).k(B2.i.f210a);
    }

    @Override // F2.b
    public final Object k(Object obj) {
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        int r12 = this.f5417N;
        if (r12 != 0) {
            if (r12 == 1) {
                P1.a.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            P1.a.b(obj);
            this.f5417N = 1;
            obj = J.o(this.f5418O, this.f5419P, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
