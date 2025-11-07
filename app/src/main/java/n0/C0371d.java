package n0;

import java.util.List;
import x1.H4;

/* renamed from: n0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0371d extends F2.g implements M2.p {

    /* renamed from: N  reason: collision with root package name */
    public int f4262N;

    /* renamed from: O  reason: collision with root package name */
    public /* synthetic */ Object f4263O;

    /* renamed from: P  reason: collision with root package name */
    public final /* synthetic */ List f4264P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0371d(List list, D2.d dVar) {
        super(2, dVar);
        this.f4264P = list;
    }

    @Override // F2.b
    public final D2.d f(D2.d dVar, Object obj) {
        C0371d c0371d = new C0371d(this.f4264P, dVar);
        c0371d.f4263O = obj;
        return c0371d;
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        return ((C0371d) f((D2.d) obj2, (C0378k) obj)).k(B2.i.f210a);
    }

    @Override // F2.b
    public final Object k(Object obj) {
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        int r12 = this.f4262N;
        if (r12 != 0) {
            if (r12 == 1) {
                P1.a.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            P1.a.b(obj);
            this.f4262N = 1;
            if (H4.a(this.f4264P, (C0378k) this.f4263O, this) == aVar) {
                return aVar;
            }
        }
        return B2.i.f210a;
    }
}
