package I0;

import D2.d;
import K0.i;
import N2.o;
import Y2.e;
import com.google.android.libraries.barhopper.RecognitionOptions;
import n0.N;
import n0.O;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f784J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ Object f785K;

    public /* synthetic */ a(int r12, Object obj) {
        this.f784J = r12;
        this.f785K = obj;
    }

    @Override // Y2.e
    public final Object b(Object obj, d dVar) {
        Object e4;
        switch (this.f784J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                ((i) this.f785K).accept(obj);
                return B2.i.f210a;
            case 1:
                ((o) this.f785K).f1007J = obj;
                throw new Z2.a(this);
            default:
                B2.i iVar = (B2.i) obj;
                N n3 = (N) this.f785K;
                boolean z3 = n3.f4223Q.d() instanceof O;
                B2.i iVar2 = B2.i.f210a;
                if (!z3 && (e4 = N.e(n3, true, dVar)) == E2.a.COROUTINE_SUSPENDED) {
                    return e4;
                }
                return iVar2;
        }
    }
}
