package f3;

import B2.i;
import M2.p;
import N2.h;
import N2.o;
import java.io.IOException;

/* loaded from: classes.dex */
public final class g extends h implements p {

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ e3.p f3224K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ o f3225L;

    /* renamed from: M  reason: collision with root package name */
    public final /* synthetic */ o f3226M;

    /* renamed from: N  reason: collision with root package name */
    public final /* synthetic */ o f3227N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e3.p pVar, o oVar, o oVar2, o oVar3) {
        super(2);
        this.f3224K = pVar;
        this.f3225L = oVar;
        this.f3226M = oVar2;
        this.f3227N = oVar3;
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        boolean z3;
        boolean z4;
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        if (intValue == 21589) {
            long j3 = 1;
            if (longValue >= 1) {
                e3.p pVar = this.f3224K;
                pVar.j(1L);
                byte h3 = pVar.f3131K.h();
                boolean z5 = true;
                if ((h3 & 1) == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((h3 & 2) == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((h3 & 4) != 4) {
                    z5 = false;
                }
                if (z3) {
                    j3 = 5;
                }
                if (z4) {
                    j3 += 4;
                }
                if (z5) {
                    j3 += 4;
                }
                if (longValue >= j3) {
                    if (z3) {
                        this.f3225L.f1007J = Long.valueOf(pVar.a() * 1000);
                    }
                    if (z4) {
                        this.f3226M.f1007J = Long.valueOf(pVar.a() * 1000);
                    }
                    if (z5) {
                        this.f3227N.f1007J = Long.valueOf(pVar.a() * 1000);
                    }
                } else {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
            } else {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
        }
        return i.f210a;
    }
}
