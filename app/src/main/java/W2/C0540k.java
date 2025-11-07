package w2;

import V2.InterfaceC0063u;
import java.util.List;

/* renamed from: w2.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0540k extends F2.g implements M2.p {

    /* renamed from: N  reason: collision with root package name */
    public int f5381N;

    /* renamed from: O  reason: collision with root package name */
    public final /* synthetic */ J f5382O;

    /* renamed from: P  reason: collision with root package name */
    public final /* synthetic */ List f5383P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0540k(J j3, List list, D2.d dVar) {
        super(2, dVar);
        this.f5382O = j3;
        this.f5383P = list;
    }

    @Override // F2.b
    public final D2.d f(D2.d dVar, Object obj) {
        return new C0540k(this.f5382O, this.f5383P, dVar);
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        return ((C0540k) f((D2.d) obj2, (InterfaceC0063u) obj)).k(B2.i.f210a);
    }

    @Override // F2.b
    public final Object k(Object obj) {
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        int r12 = this.f5381N;
        if (r12 != 0) {
            if (r12 == 1) {
                P1.a.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            P1.a.b(obj);
            this.f5381N = 1;
            obj = J.o(this.f5382O, this.f5383P, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
