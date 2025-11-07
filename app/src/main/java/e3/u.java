package e3;

import h1.C0287g;
import java.io.IOException;
import java.util.LinkedHashMap;
import x1.AbstractC0648l4;

/* loaded from: classes.dex */
public final class u extends f {

    /* renamed from: e  reason: collision with root package name */
    public static final l f3144e;

    /* renamed from: b  reason: collision with root package name */
    public final l f3145b;

    /* renamed from: c  reason: collision with root package name */
    public final i f3146c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f3147d;

    static {
        String str = l.f3123K;
        f3144e = C0287g.c("/", false);
    }

    public u(l lVar, i iVar, LinkedHashMap linkedHashMap) {
        N2.g.e(iVar, "fileSystem");
        this.f3145b = lVar;
        this.f3146c = iVar;
        this.f3147d = linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [N2.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [N2.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [N2.o, java.lang.Object] */
    @Override // e3.f
    public final e b(l lVar) {
        Long valueOf;
        p pVar;
        int a4;
        N2.g.e(lVar, "path");
        l lVar2 = f3144e;
        lVar2.getClass();
        f3.e eVar = (f3.e) this.f3147d.get(f3.b.b(lVar2, lVar, true));
        Throwable th = null;
        if (eVar == null) {
            return null;
        }
        boolean z3 = eVar.f3213b;
        boolean z4 = !z3;
        if (z3) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(eVar.f3214c);
        }
        e eVar2 = new e(z4, z3, valueOf, null, eVar.f3215d, null);
        long j3 = eVar.f3216e;
        if (j3 == -1) {
            return eVar2;
        }
        h e4 = this.f3146c.e(this.f3145b);
        try {
            pVar = AbstractC0648l4.a(e4.h(j3));
            try {
                e4.close();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            try {
                e4.close();
            } catch (Throwable th4) {
                G.i.a(th3, th4);
            }
            pVar = null;
            th = th3;
        }
        if (th == null) {
            N2.g.b(pVar);
            ?? obj = new Object();
            obj.f1007J = eVar2.f3113e;
            ?? obj2 = new Object();
            ?? obj3 = new Object();
            if (pVar.a() == 67324752) {
                pVar.k(2L);
                short f2 = pVar.f();
                int r7 = f2 & 65535;
                if ((f2 & 1) == 0) {
                    pVar.k(18L);
                    pVar.k(pVar.f() & 65535);
                    f3.a.d(pVar, pVar.f() & 65535, new f3.g(pVar, obj, obj2, obj3));
                    e eVar3 = new e(eVar2.f3109a, eVar2.f3110b, eVar2.f3111c, (Long) obj3.f1007J, (Long) obj.f1007J, (Long) obj2.f1007J);
                    N2.g.b(eVar3);
                    return eVar3;
                }
                throw new IOException("unsupported zip: general purpose bit flag=" + f3.a.b(r7));
            }
            throw new IOException("bad zip: expected " + f3.a.b(67324752) + " but was " + f3.a.b(a4));
        }
        throw th;
    }
}
