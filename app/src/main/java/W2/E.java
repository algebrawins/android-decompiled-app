package w2;

import V2.InterfaceC0063u;
import android.content.Context;
import d2.C0235c;

/* loaded from: classes.dex */
public final class E extends F2.g implements M2.p {

    /* renamed from: N  reason: collision with root package name */
    public int f5334N;

    /* renamed from: O  reason: collision with root package name */
    public final /* synthetic */ String f5335O;

    /* renamed from: P  reason: collision with root package name */
    public final /* synthetic */ J f5336P;

    /* renamed from: Q  reason: collision with root package name */
    public final /* synthetic */ double f5337Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(String str, J j3, double d4, D2.d dVar) {
        super(2, dVar);
        this.f5335O = str;
        this.f5336P = j3;
        this.f5337Q = d4;
    }

    @Override // F2.b
    public final D2.d f(D2.d dVar, Object obj) {
        return new E(this.f5335O, this.f5336P, this.f5337Q, dVar);
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        return ((E) f((D2.d) obj2, (InterfaceC0063u) obj)).k(B2.i.f210a);
    }

    @Override // F2.b
    public final Object k(Object obj) {
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        int r12 = this.f5334N;
        if (r12 != 0) {
            if (r12 == 1) {
                P1.a.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            P1.a.b(obj);
            r0.d dVar = new r0.d(this.f5335O);
            Context context = this.f5336P.f5353J;
            if (context != null) {
                C0235c a4 = K.a(context);
                C0530D c0530d = new C0530D(dVar, this.f5337Q, null);
                this.f5334N = 1;
                if (a4.d(new r0.f(c0530d, null), this) == aVar) {
                    return aVar;
                }
            } else {
                N2.g.g("context");
                throw null;
            }
        }
        return B2.i.f210a;
    }
}
