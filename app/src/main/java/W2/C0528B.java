package w2;

import V2.InterfaceC0063u;
import android.content.Context;
import d2.C0235c;

/* renamed from: w2.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0528B extends F2.g implements M2.p {

    /* renamed from: N  reason: collision with root package name */
    public int f5323N;

    /* renamed from: O  reason: collision with root package name */
    public final /* synthetic */ String f5324O;

    /* renamed from: P  reason: collision with root package name */
    public final /* synthetic */ J f5325P;

    /* renamed from: Q  reason: collision with root package name */
    public final /* synthetic */ boolean f5326Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0528B(String str, J j3, boolean z3, D2.d dVar) {
        super(2, dVar);
        this.f5324O = str;
        this.f5325P = j3;
        this.f5326Q = z3;
    }

    @Override // F2.b
    public final D2.d f(D2.d dVar, Object obj) {
        return new C0528B(this.f5324O, this.f5325P, this.f5326Q, dVar);
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        return ((C0528B) f((D2.d) obj2, (InterfaceC0063u) obj)).k(B2.i.f210a);
    }

    @Override // F2.b
    public final Object k(Object obj) {
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        int r12 = this.f5323N;
        if (r12 != 0) {
            if (r12 == 1) {
                P1.a.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            P1.a.b(obj);
            r0.d dVar = new r0.d(this.f5324O);
            Context context = this.f5325P.f5353J;
            if (context != null) {
                C0235c a4 = K.a(context);
                C0527A c0527a = new C0527A(dVar, this.f5326Q, null);
                this.f5323N = 1;
                if (a4.d(new r0.f(c0527a, null), this) == aVar) {
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
