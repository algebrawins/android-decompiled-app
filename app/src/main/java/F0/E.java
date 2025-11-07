package f0;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class E extends G {

    /* renamed from: a  reason: collision with root package name */
    public final WindowInsets.Builder f3159a = Q0.d.j();

    @Override // f0.G
    public N b() {
        WindowInsets build;
        a();
        build = this.f3159a.build();
        N a4 = N.a(build, null);
        a4.f3171a.j(null);
        return a4;
    }

    @Override // f0.G
    public void c(Y.c cVar) {
        this.f3159a.setStableInsets(cVar.b());
    }

    @Override // f0.G
    public void d(Y.c cVar) {
        this.f3159a.setSystemWindowInsets(cVar.b());
    }
}
