package Z2;

import V2.C0062t;
import V2.S;
import V2.b0;

/* loaded from: classes.dex */
public final class q extends N2.h implements M2.p {

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ n f1802K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n nVar) {
        super(2);
        this.f1802K = nVar;
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        int r4;
        int intValue = ((Number) obj).intValue();
        D2.g gVar = (D2.g) obj2;
        D2.h key = gVar.getKey();
        D2.g f2 = this.f1802K.f1796N.f(key);
        if (key != C0062t.f1462K) {
            if (gVar != f2) {
                r4 = Integer.MIN_VALUE;
            } else {
                r4 = intValue + 1;
            }
            return Integer.valueOf(r4);
        }
        S s3 = (S) f2;
        S s4 = (S) gVar;
        while (true) {
            if (s4 == null) {
                s4 = null;
                break;
            } else if (s4 == s3 || !(s4 instanceof a3.t)) {
                break;
            } else {
                V2.i iVar = (V2.i) b0.f1427K.get((b0) s4);
                if (iVar != null) {
                    s4 = iVar.getParent();
                } else {
                    s4 = null;
                }
            }
        }
        if (s4 == s3) {
            if (s3 != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + s4 + ", expected child of " + s3 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
