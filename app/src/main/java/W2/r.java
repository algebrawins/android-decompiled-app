package w2;

import V2.InterfaceC0063u;
import android.content.Context;
import n0.InterfaceC0375h;

/* loaded from: classes.dex */
public final class r extends F2.g implements M2.p {

    /* renamed from: N  reason: collision with root package name */
    public N2.o f5404N;

    /* renamed from: O  reason: collision with root package name */
    public int f5405O;

    /* renamed from: P  reason: collision with root package name */
    public final /* synthetic */ String f5406P;

    /* renamed from: Q  reason: collision with root package name */
    public final /* synthetic */ J f5407Q;

    /* renamed from: R  reason: collision with root package name */
    public final /* synthetic */ N2.o f5408R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str, J j3, N2.o oVar, D2.d dVar) {
        super(2, dVar);
        this.f5406P = str;
        this.f5407Q = j3;
        this.f5408R = oVar;
    }

    @Override // F2.b
    public final D2.d f(D2.d dVar, Object obj) {
        return new r(this.f5406P, this.f5407Q, this.f5408R, dVar);
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        return ((r) f((D2.d) obj2, (InterfaceC0063u) obj)).k(B2.i.f210a);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [Y2.d, w2.q, java.lang.Object] */
    @Override // F2.b
    public final Object k(Object obj) {
        N2.o oVar;
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        int r12 = this.f5405O;
        if (r12 != 0) {
            if (r12 == 1) {
                oVar = this.f5404N;
                P1.a.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            P1.a.b(obj);
            r0.d dVar = new r0.d(this.f5406P);
            J j3 = this.f5407Q;
            Context context = j3.f5353J;
            if (context != null) {
                Y2.d f2 = ((InterfaceC0375h) K.a(context).f3003K).f();
                ?? obj2 = new Object();
                obj2.f5401J = f2;
                obj2.f5402K = dVar;
                obj2.f5403L = j3;
                N2.o oVar2 = this.f5408R;
                this.f5404N = oVar2;
                this.f5405O = 1;
                Object c4 = Y2.r.c(obj2, this);
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
