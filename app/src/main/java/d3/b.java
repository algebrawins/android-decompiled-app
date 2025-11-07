package d3;

import M2.l;
import V2.o0;
import X2.k;
import X2.o;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n0.C0366J;

/* loaded from: classes.dex */
public final class b extends N2.h implements l {

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ int f3064K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ Object f3065L;

    /* renamed from: M  reason: collision with root package name */
    public final /* synthetic */ Object f3066M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int r12, Object obj, Object obj2) {
        super(1);
        this.f3064K = r12;
        this.f3065L = obj;
        this.f3066M = obj2;
    }

    @Override // M2.l
    public final Object h(Object obj) {
        Object hVar;
        k kVar;
        o0 o0Var;
        B2.i iVar;
        B2.i iVar2;
        switch (this.f3064K) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                Throwable th = (Throwable) obj;
                ((c) this.f3066M).getClass();
                ((d) this.f3065L).e(null);
                return B2.i.f210a;
            case 1:
                Throwable th2 = (Throwable) obj;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.g;
                ((c) this.f3066M).getClass();
                d dVar = (d) this.f3065L;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.e(null);
                return B2.i.f210a;
            default:
                Throwable th3 = (Throwable) obj;
                ((o) this.f3065L).h(th3);
                a1.i iVar3 = (a1.i) this.f3066M;
                ((X2.c) iVar3.f1834L).h(th3, false);
                do {
                    X2.c cVar = (X2.c) iVar3.f1834L;
                    cVar.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = X2.c.f1592M;
                    long j3 = atomicLongFieldUpdater.get(cVar);
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = X2.c.f1591L;
                    long j4 = atomicLongFieldUpdater2.get(cVar);
                    if (cVar.r(j4, true)) {
                        hVar = new X2.h(cVar.m());
                    } else {
                        Object obj2 = X2.j.f1624a;
                        if (j3 < (j4 & 1152921504606846975L)) {
                            U1.b bVar = X2.e.f1612k;
                            k kVar2 = (k) X2.c.f1596Q.get(cVar);
                            for (boolean z3 = true; !cVar.r(atomicLongFieldUpdater2.get(cVar), z3); z3 = true) {
                                long andIncrement = atomicLongFieldUpdater.getAndIncrement(cVar);
                                long j5 = X2.e.f1604b;
                                Object obj3 = obj2;
                                long j6 = andIncrement / j5;
                                int r9 = (int) (andIncrement % j5);
                                if (kVar2.f1884L != j6) {
                                    k l3 = cVar.l(j6, kVar2);
                                    if (l3 == null) {
                                        continue;
                                        obj2 = obj3;
                                    } else {
                                        kVar = l3;
                                    }
                                } else {
                                    kVar = kVar2;
                                }
                                Object A3 = cVar.A(kVar, r9, andIncrement, bVar);
                                if (A3 == X2.e.f1614m) {
                                    if (bVar instanceof o0) {
                                        o0Var = (o0) bVar;
                                    } else {
                                        o0Var = null;
                                    }
                                    if (o0Var != null) {
                                        o0Var.a(kVar, r9);
                                    }
                                    cVar.C(andIncrement);
                                    kVar.h();
                                    obj2 = obj3;
                                } else if (A3 == X2.e.f1616o) {
                                    if (andIncrement < cVar.p()) {
                                        kVar.a();
                                    }
                                    kVar2 = kVar;
                                    obj2 = obj3;
                                } else if (A3 != X2.e.f1615n) {
                                    kVar.a();
                                    obj2 = A3;
                                } else {
                                    throw new IllegalStateException("unexpected");
                                }
                            }
                            hVar = new X2.h(cVar.m());
                        }
                        hVar = obj2;
                    }
                    iVar = null;
                    if (hVar instanceof X2.i) {
                        hVar = null;
                    }
                    iVar2 = B2.i.f210a;
                    if (hVar != null) {
                        C0366J.f4201K.g(hVar, th3);
                        iVar = iVar2;
                        continue;
                    }
                } while (iVar != null);
                return iVar2;
        }
    }
}
