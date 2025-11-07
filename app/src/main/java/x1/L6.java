package x1;

import A0.C0001b;
import android.content.Context;

/* loaded from: classes.dex */
public final class L6 implements E6 {

    /* renamed from: a  reason: collision with root package name */
    public final F1.o f5667a;

    /* renamed from: b  reason: collision with root package name */
    public final F1.o f5668b;

    /* renamed from: c  reason: collision with root package name */
    public final D6 f5669c;

    public L6(Context context, D6 d6) {
        this.f5669c = d6;
        T0.a aVar = T0.a.f1205e;
        V0.i.b(context);
        C0001b c4 = V0.i.a().c(aVar);
        if (T0.a.f1204d.contains(new S0.b("json"))) {
            this.f5667a = new F1.o(new K6(0, c4));
        }
        this.f5668b = new F1.o(new K6(1, c4));
    }

    @Override // x1.E6
    public final void a(U1.h hVar) {
        S0.a aVar;
        S0.a aVar2;
        D6 d6 = this.f5669c;
        int r12 = d6.f5532b;
        int r02 = d6.f5532b;
        if (r12 == 0) {
            F1.o oVar = this.f5667a;
            if (oVar != null) {
                V0.h hVar2 = (V0.h) oVar.get();
                if (hVar.f1340J != 0) {
                    aVar2 = new S0.a(hVar.d(r02), S0.c.DEFAULT);
                } else {
                    aVar2 = new S0.a(hVar.d(r02), S0.c.VERY_LOW);
                }
                hVar2.a(aVar2);
                return;
            }
            return;
        }
        V0.h hVar3 = (V0.h) this.f5668b.get();
        if (hVar.f1340J != 0) {
            aVar = new S0.a(hVar.d(r02), S0.c.DEFAULT);
        } else {
            aVar = new S0.a(hVar.d(r02), S0.c.VERY_LOW);
        }
        hVar3.a(aVar);
    }
}
