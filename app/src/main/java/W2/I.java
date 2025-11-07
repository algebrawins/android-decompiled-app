package w2;

import V2.InterfaceC0063u;
import android.content.Context;
import d2.C0235c;
import java.util.List;

/* loaded from: classes.dex */
public final class i extends F2.g implements M2.p {

    /* renamed from: N  reason: collision with root package name */
    public int f5375N;

    /* renamed from: O  reason: collision with root package name */
    public final /* synthetic */ J f5376O;

    /* renamed from: P  reason: collision with root package name */
    public final /* synthetic */ List f5377P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(J j3, List list, D2.d dVar) {
        super(2, dVar);
        this.f5376O = j3;
        this.f5377P = list;
    }

    @Override // F2.b
    public final D2.d f(D2.d dVar, Object obj) {
        return new i(this.f5376O, this.f5377P, dVar);
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        return ((i) f((D2.d) obj2, (InterfaceC0063u) obj)).k(B2.i.f210a);
    }

    @Override // F2.b
    public final Object k(Object obj) {
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        int r12 = this.f5375N;
        if (r12 != 0) {
            if (r12 == 1) {
                P1.a.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            P1.a.b(obj);
            Context context = this.f5376O.f5353J;
            if (context != null) {
                C0235c a4 = K.a(context);
                C0538h c0538h = new C0538h(this.f5377P, null);
                this.f5375N = 1;
                obj = a4.d(new r0.f(c0538h, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                N2.g.g("context");
                throw null;
            }
        }
        return obj;
    }
}
