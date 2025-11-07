package f3;

import B2.i;
import M2.p;
import N2.h;
import N2.l;
import N2.n;
import java.io.IOException;

/* loaded from: classes.dex */
public final class f extends h implements p {

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ l f3218K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ long f3219L;

    /* renamed from: M  reason: collision with root package name */
    public final /* synthetic */ n f3220M;

    /* renamed from: N  reason: collision with root package name */
    public final /* synthetic */ e3.p f3221N;

    /* renamed from: O  reason: collision with root package name */
    public final /* synthetic */ n f3222O;

    /* renamed from: P  reason: collision with root package name */
    public final /* synthetic */ n f3223P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l lVar, long j3, n nVar, e3.p pVar, n nVar2, n nVar3) {
        super(2);
        this.f3218K = lVar;
        this.f3219L = j3;
        this.f3220M = nVar;
        this.f3221N = pVar;
        this.f3222O = nVar2;
        this.f3223P = nVar3;
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        long j3;
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        if (intValue == 1) {
            l lVar = this.f3218K;
            if (!lVar.f1004J) {
                lVar.f1004J = true;
                if (longValue >= this.f3219L) {
                    n nVar = this.f3220M;
                    long j4 = nVar.f1006J;
                    e3.p pVar = this.f3221N;
                    if (j4 == 4294967295L) {
                        j4 = pVar.b();
                    }
                    nVar.f1006J = j4;
                    n nVar2 = this.f3222O;
                    long j5 = 0;
                    if (nVar2.f1006J == 4294967295L) {
                        j3 = pVar.b();
                    } else {
                        j3 = 0;
                    }
                    nVar2.f1006J = j3;
                    n nVar3 = this.f3223P;
                    if (nVar3.f1006J == 4294967295L) {
                        j5 = pVar.b();
                    }
                    nVar3.f1006J = j5;
                } else {
                    throw new IOException("bad zip: zip64 extra too short");
                }
            } else {
                throw new IOException("bad zip: zip64 extra repeated");
            }
        }
        return i.f210a;
    }
}
