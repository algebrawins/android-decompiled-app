package w2;

import V2.InterfaceC0063u;
import android.content.Context;
import n0.InterfaceC0375h;

/* loaded from: classes.dex */
public final class x extends F2.g implements M2.p {

    /* renamed from: N  reason: collision with root package name */
    public N2.o f5431N;

    /* renamed from: O  reason: collision with root package name */
    public int f5432O;

    /* renamed from: P  reason: collision with root package name */
    public final /* synthetic */ String f5433P;

    /* renamed from: Q  reason: collision with root package name */
    public final /* synthetic */ J f5434Q;

    /* renamed from: R  reason: collision with root package name */
    public final /* synthetic */ N2.o f5435R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(String str, J j3, N2.o oVar, D2.d dVar) {
        super(2, dVar);
        this.f5433P = str;
        this.f5434Q = j3;
        this.f5435R = oVar;
    }

    @Override // F2.b
    public final D2.d f(D2.d dVar, Object obj) {
        return new x(this.f5433P, this.f5434Q, this.f5435R, dVar);
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        return ((x) f((D2.d) obj2, (InterfaceC0063u) obj)).k(B2.i.f210a);
    }

    @Override // F2.b
    public final Object k(Object obj) {
        N2.o oVar;
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        int r12 = this.f5432O;
        if (r12 != 0) {
            if (r12 == 1) {
                oVar = this.f5431N;
                P1.a.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            P1.a.b(obj);
            r0.d dVar = new r0.d(this.f5433P);
            Context context = this.f5434Q.f5353J;
            if (context != null) {
                C0543n c0543n = new C0543n(((InterfaceC0375h) K.a(context).f3003K).f(), dVar, 2);
                N2.o oVar2 = this.f5435R;
                this.f5431N = oVar2;
                this.f5432O = 1;
                Object c4 = Y2.r.c(c0543n, this);
                if (c4 == aVar) {
                    return aVar;
                }
                oVar = oVar2;
                obj = c4;
            } else {
                N2.g.g("context");
                throw null;
            }
        }
        oVar.f1007J = obj;
        return B2.i.f210a;
    }
}
