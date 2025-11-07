package o1;

import C1.j;
import d2.C0235c;
import h1.C0283c;
import h2.D;
import h2.J;
import java.util.Arrays;
import k1.w;
import n1.C0393a;
import u1.AbstractC0475c;

/* loaded from: classes.dex */
public final class g extends i1.f {

    /* renamed from: i  reason: collision with root package name */
    public static final J f4493i = new J("ModuleInstall.API", new A1.b(3), (O1.a) new Object());

    public final j c(i1.j... jVarArr) {
        boolean z3;
        if (jVarArr.length > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        w.a("Please provide at least one OptionalModuleApi.", z3);
        for (i1.j jVar : jVarArr) {
            w.f(jVar, "Requested API must not be null.");
        }
        C0398a a4 = C0398a.a(Arrays.asList(jVarArr), false);
        if (a4.f4486a.isEmpty()) {
            C0393a c0393a = new C0393a(0, true);
            j jVar2 = new j();
            jVar2.h(c0393a);
            return jVar2;
        }
        D d4 = new D();
        d4.f3293e = new C0283c[]{AbstractC0475c.f5028c};
        d4.f3291c = 27301;
        d4.f3290b = false;
        d4.f3292d = new C0235c(this, a4);
        return b(0, d4.a());
    }
}
