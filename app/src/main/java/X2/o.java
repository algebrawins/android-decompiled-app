package X2;

import V2.C0050f;
import com.google.android.libraries.barhopper.RecognitionOptions;
import n0.N;
import n0.O;

/* loaded from: classes.dex */
public final class o extends N2.h implements M2.l {

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ int f1631K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ Object f1632L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int r12, Object obj) {
        super(1);
        this.f1631K = r12;
        this.f1632L = obj;
    }

    @Override // M2.l
    public final Object h(Object obj) {
        switch (this.f1631K) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                Throwable th = (Throwable) obj;
                B2.i iVar = B2.i.f210a;
                ((C0050f) this.f1632L).i(iVar);
                return iVar;
            case 1:
                Throwable th2 = (Throwable) obj;
                ((d3.h) this.f1632L).b();
                return B2.i.f210a;
            default:
                Throwable th3 = (Throwable) obj;
                N n3 = (N) this.f1632L;
                if (th3 != null) {
                    n3.f4223Q.m(new O(th3));
                }
                if (n3.f4225S.f204K != B2.h.f209a) {
                    ((p0.h) n3.f4225S.a()).close();
                }
                return B2.i.f210a;
        }
    }
}
