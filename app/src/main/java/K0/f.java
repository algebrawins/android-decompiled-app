package K0;

import androidx.window.extensions.layout.WindowLayoutComponent;

/* loaded from: classes.dex */
public final class f extends N2.h implements M2.a {

    /* renamed from: K  reason: collision with root package name */
    public static final f f830K = new N2.h(0);

    @Override // M2.a
    public final Object a() {
        e eVar;
        WindowLayoutComponent a4;
        Object obj;
        try {
            ClassLoader classLoader = h.class.getClassLoader();
            if (classLoader != null) {
                eVar = new e(classLoader, new A.c(13, classLoader));
            } else {
                eVar = null;
            }
            if (eVar == null || (a4 = eVar.a()) == null) {
                return null;
            }
            N2.g.d(classLoader, "loader");
            A.c cVar = new A.c(13, classLoader);
            int a5 = H0.f.a();
            if (a5 >= 2) {
                obj = new M0.d(a4);
            } else if (a5 == 1) {
                obj = new M0.c(a4, cVar);
            } else {
                obj = new Object();
            }
            return obj;
        } catch (Throwable unused) {
            g gVar = g.f831a;
            return null;
        }
    }
}
