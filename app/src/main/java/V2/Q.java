package V2;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes.dex */
public final class Q extends W {

    /* renamed from: N  reason: collision with root package name */
    public final /* synthetic */ int f1406N;

    /* renamed from: O  reason: collision with root package name */
    public final Object f1407O;

    public /* synthetic */ Q(int r12, Object obj) {
        this.f1406N = r12;
        this.f1407O = obj;
    }

    @Override // M2.l
    public final /* bridge */ /* synthetic */ Object h(Object obj) {
        switch (this.f1406N) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                o((Throwable) obj);
                return B2.i.f210a;
            default:
                o((Throwable) obj);
                return B2.i.f210a;
        }
    }

    @Override // V2.W
    public final void o(Throwable th) {
        switch (this.f1406N) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                ((M2.l) this.f1407O).h(th);
                return;
            default:
                Object E3 = n().E();
                boolean z3 = E3 instanceof C0057n;
                X x3 = (X) this.f1407O;
                if (z3) {
                    x3.i(P1.a.a(((C0057n) E3).f1450a));
                    return;
                } else {
                    x3.i(AbstractC0066x.l(E3));
                    return;
                }
        }
    }
}
