package n0;

import V2.C0057n;
import java.util.concurrent.CancellationException;

/* renamed from: n0.J  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0366J extends N2.h implements M2.p {

    /* renamed from: K  reason: collision with root package name */
    public static final C0366J f4201K = new N2.h(2);

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        P p2 = (P) obj;
        Throwable th = (Throwable) obj2;
        N2.g.e(p2, "msg");
        if (th == null) {
            th = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        p2.f4230b.K(new C0057n(th, false));
        return B2.i.f210a;
    }
}
