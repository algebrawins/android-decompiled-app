package f3;

import e3.l;
import h1.C0287g;
import java.util.ArrayList;
import java.util.List;
import w1.u;

/* loaded from: classes.dex */
public final class d extends e3.f {

    /* renamed from: c  reason: collision with root package name */
    public static final l f3210c;

    /* renamed from: b  reason: collision with root package name */
    public final B2.f f3211b;

    static {
        String str = l.f3123K;
        f3210c = C0287g.c("/", false);
    }

    public d(ClassLoader classLoader) {
        this.f3211b = new B2.f(new G0.a(3, classLoader));
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, e3.a] */
    @Override // e3.f
    public final e3.e b(l lVar) {
        l lVar2;
        l lVar3;
        l d4;
        N2.g.e(lVar, "path");
        if (!u.n(lVar)) {
            return null;
        }
        l lVar4 = f3210c;
        lVar4.getClass();
        N2.g.e(lVar, "child");
        l b3 = b.b(lVar4, lVar, true);
        int a4 = b.a(b3);
        e3.b bVar = b3.f3124J;
        if (a4 == -1) {
            lVar2 = null;
        } else {
            lVar2 = new l(bVar.l(0, a4));
        }
        int a5 = b.a(lVar4);
        e3.b bVar2 = lVar4.f3124J;
        if (a5 == -1) {
            lVar3 = null;
        } else {
            lVar3 = new l(bVar2.l(0, a5));
        }
        if (N2.g.a(lVar2, lVar3)) {
            ArrayList a6 = b3.a();
            ArrayList a7 = lVar4.a();
            int min = Math.min(a6.size(), a7.size());
            int r11 = 0;
            while (r11 < min && N2.g.a(a6.get(r11), a7.get(r11))) {
                r11++;
            }
            if (r11 == min && bVar.b() == bVar2.b()) {
                String str = l.f3123K;
                d4 = C0287g.c(".", false);
            } else if (a7.subList(r11, a7.size()).indexOf(b.f3207e) == -1) {
                ?? obj = new Object();
                e3.b c4 = b.c(lVar4);
                if (c4 == null && (c4 = b.c(b3)) == null) {
                    c4 = b.f(l.f3123K);
                }
                int size = a7.size();
                for (int r6 = r11; r6 < size; r6++) {
                    obj.q(b.f3207e);
                    obj.q(c4);
                }
                int size2 = a6.size();
                while (r11 < size2) {
                    obj.q((e3.b) a6.get(r11));
                    obj.q(c4);
                    r11++;
                }
                d4 = b.d(obj, false);
            } else {
                throw new IllegalArgumentException(("Impossible relative path to resolve: " + b3 + " and " + lVar4).toString());
            }
            String n3 = d4.f3124J.n();
            for (B2.c cVar : (List) this.f3211b.a()) {
                e3.e b4 = ((e3.f) cVar.f200J).b(((l) cVar.f201K).d(n3));
                if (b4 != null) {
                    return b4;
                }
            }
            return null;
        }
        throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + b3 + " and " + lVar4).toString());
    }
}
