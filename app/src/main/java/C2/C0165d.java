package c2;

import A0.C0001b;
import N2.g;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import n2.InterfaceC0394a;
import r2.f;

/* renamed from: c2.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0165d implements InterfaceC0394a, o2.a {

    /* renamed from: J  reason: collision with root package name */
    public E.c f2660J;

    /* renamed from: K  reason: collision with root package name */
    public C0166e f2661K;

    /* renamed from: L  reason: collision with root package name */
    public C0001b f2662L;

    @Override // o2.a
    public final void a(i2.d dVar) {
        g.e(dVar, "binding");
        C0166e c0166e = this.f2661K;
        if (c0166e != null) {
            dVar.f3444d.add(c0166e);
            E.c cVar = this.f2660J;
            if (cVar != null) {
                cVar.f503L = dVar.f3441a;
                return;
            } else {
                g.g("share");
                throw null;
            }
        }
        g.g("manager");
        throw null;
    }

    @Override // o2.a
    public final void c(i2.d dVar) {
        g.e(dVar, "binding");
        a(dVar);
    }

    @Override // o2.a
    public final void d() {
        E.c cVar = this.f2660J;
        if (cVar != null) {
            cVar.f503L = null;
        } else {
            g.g("share");
            throw null;
        }
    }

    @Override // n2.InterfaceC0394a
    public final void f(C0001b c0001b) {
        g.e(c0001b, "binding");
        C0001b c0001b2 = this.f2662L;
        if (c0001b2 != null) {
            c0001b2.U(null);
        } else {
            g.g("methodChannel");
            throw null;
        }
    }

    @Override // o2.a
    public final void g() {
        d();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, c2.e] */
    @Override // n2.InterfaceC0394a
    public final void h(C0001b c0001b) {
        g.e(c0001b, "binding");
        this.f2662L = new C0001b((f) c0001b.f84K, "dev.fluttercommunity.plus/share", 26);
        Context context = (Context) c0001b.f85L;
        g.d(context, "getApplicationContext(...)");
        ?? obj = new Object();
        obj.f2664K = new AtomicBoolean(true);
        this.f2661K = obj;
        E.c cVar = new E.c(context, obj);
        this.f2660J = cVar;
        C0166e c0166e = this.f2661K;
        if (c0166e != null) {
            A.f fVar = new A.f(cVar, c0166e);
            C0001b c0001b2 = this.f2662L;
            if (c0001b2 != null) {
                c0001b2.U(fVar);
                return;
            } else {
                g.g("methodChannel");
                throw null;
            }
        }
        g.g("manager");
        throw null;
    }
}
