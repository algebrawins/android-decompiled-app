package w2;

import V2.InterfaceC0063u;
import android.content.Context;
import d2.C0235c;

/* loaded from: classes.dex */
public final class H extends F2.g implements M2.p {

    /* renamed from: N  reason: collision with root package name */
    public int f5345N;

    /* renamed from: O  reason: collision with root package name */
    public final /* synthetic */ String f5346O;

    /* renamed from: P  reason: collision with root package name */
    public final /* synthetic */ J f5347P;

    /* renamed from: Q  reason: collision with root package name */
    public final /* synthetic */ long f5348Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(String str, J j3, long j4, D2.d dVar) {
        super(2, dVar);
        this.f5346O = str;
        this.f5347P = j3;
        this.f5348Q = j4;
    }

    @Override // F2.b
    public final D2.d f(D2.d dVar, Object obj) {
        return new H(this.f5346O, this.f5347P, this.f5348Q, dVar);
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        return ((H) f((D2.d) obj2, (InterfaceC0063u) obj)).k(B2.i.f210a);
    }

    @Override // F2.b
    public final Object k(Object obj) {
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        int r12 = this.f5345N;
        if (r12 != 0) {
            if (r12 == 1) {
                P1.a.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            P1.a.b(obj);
            r0.d dVar = new r0.d(this.f5346O);
            Context context = this.f5347P.f5353J;
            if (context != null) {
                C0235c a4 = K.a(context);
                G g = new G(dVar, this.f5348Q, null);
                this.f5345N = 1;
                if (a4.d(new r0.f(g, null), this) == aVar) {
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
