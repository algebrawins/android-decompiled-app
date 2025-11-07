package K0;

import android.content.Context;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ g f831a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final B2.f f832b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f833c;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, K0.g] */
    static {
        N2.p.a(h.class).b();
        f832b = new B2.f(f.f830K);
        f833c = a.f812a;
    }

    public static b a(Context context) {
        N2.g.e(context, "context");
        L0.a aVar = (L0.a) f832b.a();
        if (aVar == null) {
            N0.k kVar = N0.k.f974c;
            if (N0.k.f974c == null) {
                ReentrantLock reentrantLock = N0.k.f975d;
                reentrantLock.lock();
                try {
                    if (N0.k.f974c == null) {
                        N0.i iVar = null;
                        try {
                            H0.l c4 = N0.g.c();
                            if (c4 != null) {
                                H0.l lVar = H0.l.f733O;
                                N2.g.e(lVar, "other");
                                Object a4 = c4.f738N.a();
                                N2.g.d(a4, "<get-bigInteger>(...)");
                                Object a5 = lVar.f738N.a();
                                N2.g.d(a5, "<get-bigInteger>(...)");
                                if (((BigInteger) a4).compareTo((BigInteger) a5) >= 0) {
                                    N0.i iVar2 = new N0.i(context);
                                    if (iVar2.i()) {
                                        iVar = iVar2;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        N0.k.f974c = new N0.k(iVar);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            aVar = N0.k.f974c;
            N2.g.b(aVar);
        }
        int r12 = q.f849b;
        b bVar = new b(aVar);
        f833c.getClass();
        return bVar;
    }
}
