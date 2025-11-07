package p0;

import com.google.android.libraries.barhopper.RecognitionOptions;
import e3.l;
import h1.C0287g;

/* loaded from: classes.dex */
public final class d extends N2.h implements M2.a {

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ int f4754K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ e f4755L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int r22) {
        super(0);
        this.f4754K = r22;
        this.f4755L = eVar;
    }

    @Override // M2.a
    public final Object a() {
        switch (this.f4754K) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                e eVar = this.f4755L;
                l lVar = (l) eVar.f4760c.a();
                if (f3.b.a(lVar) != -1) {
                    return C0287g.c(lVar.f3124J.n(), true);
                }
                throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + eVar.f4760c + ", instead got " + lVar).toString());
            default:
                C0287g c0287g = e.f4757f;
                e eVar2 = this.f4755L;
                synchronized (c0287g) {
                    e.f4756e.remove(((l) eVar2.f4761d.a()).f3124J.n());
                }
                return B2.i.f210a;
        }
    }
}
