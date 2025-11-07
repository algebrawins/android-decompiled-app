package d2;

import A0.C0001b;
import h2.AbstractActivityC0292d;
import n2.InterfaceC0394a;

/* loaded from: classes.dex */
public final class s implements InterfaceC0394a, o2.a {

    /* renamed from: J  reason: collision with root package name */
    public i2.d f3061J;

    /* renamed from: K  reason: collision with root package name */
    public C0001b f3062K;

    /* renamed from: L  reason: collision with root package name */
    public q f3063L;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, r2.m, d2.q] */
    @Override // o2.a
    public final void a(i2.d dVar) {
        N2.g.e(dVar, "activityPluginBinding");
        C0001b c0001b = this.f3062K;
        N2.g.b(c0001b);
        r2.f fVar = (r2.f) c0001b.f84K;
        N2.g.d(fVar, "getBinaryMessenger(...)");
        AbstractActivityC0292d abstractActivityC0292d = dVar.f3441a;
        N2.g.d(abstractActivityC0292d, "getActivity(...)");
        C0235c c0235c = new C0235c(0);
        new C0001b(fVar, "dev.steenbakker.mobile_scanner/scanner/event", 25).V(c0235c);
        Object obj = new Object();
        C0241i c0241i = new C0241i(1, dVar, i2.d.class, "addRequestPermissionsResultListener", "addRequestPermissionsResultListener(Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;)V", 0, 1);
        C0001b c0001b2 = this.f3062K;
        N2.g.b(c0001b2);
        io.flutter.embedding.engine.renderer.n nVar = (io.flutter.embedding.engine.renderer.n) c0001b2.f86M;
        N2.g.d(nVar, "getTextureRegistry(...)");
        N2.g.e(abstractActivityC0292d, "activity");
        N2.g.e(fVar, "binaryMessenger");
        N2.g.e(nVar, "textureRegistry");
        ?? obj2 = new Object();
        obj2.f3048J = abstractActivityC0292d;
        obj2.f3049K = c0235c;
        obj2.f3050L = obj;
        obj2.f3051M = c0241i;
        obj2.f3052N = new n(obj2, 0);
        obj2.f3053O = new n(obj2, 1);
        o oVar = new o(obj2);
        n nVar2 = new n(obj2, 2);
        obj2.f3057S = new n(obj2, 3);
        obj2.f3058T = new n(obj2, 4);
        C0001b c0001b3 = new C0001b(fVar, "dev.steenbakker.mobile_scanner/scanner/method", 26);
        obj2.f3055Q = c0001b3;
        c0001b3.U(obj2);
        obj2.f3056R = new m(abstractActivityC0292d, nVar, oVar, nVar2);
        this.f3063L = obj2;
        this.f3061J = dVar;
    }

    @Override // o2.a
    public final void c(i2.d dVar) {
        N2.g.e(dVar, "binding");
        a(dVar);
    }

    @Override // o2.a
    public final void d() {
        q qVar = this.f3063L;
        if (qVar != null) {
            i2.d dVar = this.f3061J;
            N2.g.b(dVar);
            C0001b c0001b = (C0001b) qVar.f3055Q;
            if (c0001b != null) {
                c0001b.U(null);
            }
            qVar.f3055Q = null;
            m mVar = (m) qVar.f3056R;
            if (mVar != null && (mVar.g != null || mVar.f3032h != null)) {
                mVar.c();
            }
            qVar.f3056R = null;
            r rVar = (r) ((E.d) qVar.f3050L).f508b;
            if (rVar != null) {
                dVar.f3443c.remove(rVar);
            }
        }
        this.f3063L = null;
        this.f3061J = null;
    }

    @Override // n2.InterfaceC0394a
    public final void f(C0001b c0001b) {
        N2.g.e(c0001b, "binding");
        this.f3062K = null;
    }

    @Override // o2.a
    public final void g() {
        d();
    }

    @Override // n2.InterfaceC0394a
    public final void h(C0001b c0001b) {
        N2.g.e(c0001b, "binding");
        this.f3062K = c0001b;
    }
}
