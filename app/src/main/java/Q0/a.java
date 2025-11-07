package Q0;

import A0.C0001b;
import android.content.Context;
import h2.AbstractActivityC0292d;
import n2.InterfaceC0394a;
import r2.f;

/* loaded from: classes.dex */
public final class a implements InterfaceC0394a, o2.a {

    /* renamed from: J  reason: collision with root package name */
    public c f1050J;

    /* renamed from: K  reason: collision with root package name */
    public C0001b f1051K;

    /* renamed from: L  reason: collision with root package name */
    public i2.d f1052L;

    @Override // o2.a
    public final void a(i2.d dVar) {
        AbstractActivityC0292d abstractActivityC0292d = dVar.f3441a;
        c cVar = this.f1050J;
        if (cVar != null) {
            cVar.f1055L = abstractActivityC0292d;
        }
        this.f1052L = dVar;
        dVar.f3444d.add(cVar);
        i2.d dVar2 = this.f1052L;
        dVar2.f3443c.add(this.f1050J);
    }

    @Override // o2.a
    public final void c(i2.d dVar) {
        a(dVar);
    }

    @Override // o2.a
    public final void d() {
        c cVar = this.f1050J;
        if (cVar != null) {
            cVar.f1055L = null;
        }
        i2.d dVar = this.f1052L;
        if (dVar != null) {
            dVar.f3444d.remove(cVar);
            i2.d dVar2 = this.f1052L;
            dVar2.f3443c.remove(this.f1050J);
        }
        this.f1052L = null;
    }

    @Override // n2.InterfaceC0394a
    public final void f(C0001b c0001b) {
        this.f1051K.U(null);
        this.f1051K = null;
    }

    @Override // o2.a
    public final void g() {
        d();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [w1.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [O1.a, java.lang.Object] */
    @Override // n2.InterfaceC0394a
    public final void h(C0001b c0001b) {
        Context context = (Context) c0001b.f85L;
        this.f1050J = new c(context);
        C0001b c0001b2 = new C0001b((f) c0001b.f84K, "flutter.baseflow.com/permissions/methods", 26);
        this.f1051K = c0001b2;
        c0001b2.U(new A.f(context, new Object(), this.f1050J, new Object()));
    }
}
