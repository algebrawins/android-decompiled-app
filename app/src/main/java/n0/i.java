package n0;

import V2.AbstractC0066x;
import V2.InterfaceC0063u;
import java.util.concurrent.atomic.AtomicInteger;
import k0.C0322i;

/* loaded from: classes.dex */
public final class I extends F2.g implements M2.p {

    /* renamed from: N  reason: collision with root package name */
    public int f4197N;

    /* renamed from: O  reason: collision with root package name */
    public /* synthetic */ Object f4198O;

    /* renamed from: P  reason: collision with root package name */
    public final /* synthetic */ N f4199P;

    /* renamed from: Q  reason: collision with root package name */
    public final /* synthetic */ F2.g f4200Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(N n3, M2.p pVar, D2.d dVar) {
        super(2, dVar);
        this.f4199P = n3;
        this.f4200Q = (F2.g) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [M2.p, F2.g] */
    @Override // F2.b
    public final D2.d f(D2.d dVar, Object obj) {
        I r02 = new I(this.f4199P, this.f4200Q, dVar);
        r02.f4198O = obj;
        return r02;
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        return ((I) f((D2.d) obj2, (InterfaceC0063u) obj)).k(B2.i.f210a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [V2.b0, V2.l] */
    /* JADX WARN: Type inference failed for: r7v0, types: [M2.p, F2.g] */
    @Override // F2.b
    public final Object k(Object obj) {
        X2.h hVar;
        E2.a aVar = E2.a.COROUTINE_SUSPENDED;
        int r12 = this.f4197N;
        if (r12 != 0) {
            if (r12 == 1) {
                P1.a.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            P1.a.b(obj);
            ?? b0Var = new V2.b0(true);
            Throwable th = null;
            b0Var.H(null);
            N n3 = this.f4199P;
            P p2 = new P(this.f4200Q, b0Var, n3.f4223Q.d(), ((InterfaceC0063u) this.f4198O).h());
            a1.i iVar = n3.f4227U;
            Object g = ((X2.c) iVar.f1834L).g(p2);
            if (g instanceof X2.h) {
                if (g instanceof X2.h) {
                    hVar = (X2.h) g;
                } else {
                    hVar = null;
                }
                if (hVar != null) {
                    th = hVar.f1623a;
                }
                if (th == null) {
                    throw new IllegalStateException("Channel was closed normally");
                }
                throw th;
            } else if (!(g instanceof X2.i)) {
                if (((AtomicInteger) ((C0322i) iVar.f1835M).f3983K).getAndIncrement() == 0) {
                    AbstractC0066x.g((InterfaceC0063u) iVar.f1832J, new T(iVar, null));
                }
                this.f4197N = 1;
                obj = b0Var.U(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
        return obj;
    }
}
