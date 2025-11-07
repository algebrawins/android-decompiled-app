package androidx.lifecycle;

import r.C0438c;
import r.C0441f;
import w.C0512w;

/* loaded from: classes.dex */
public final class y implements A {

    /* renamed from: a  reason: collision with root package name */
    public final z f2481a;

    /* renamed from: b  reason: collision with root package name */
    public final C0512w f2482b;

    /* renamed from: c  reason: collision with root package name */
    public int f2483c = -1;

    public y(z zVar, C0512w c0512w) {
        this.f2481a = zVar;
        this.f2482b = c0512w;
    }

    @Override // androidx.lifecycle.A
    public final void a(Object obj) {
        int r02 = this.f2483c;
        int r12 = this.f2481a.g;
        if (r02 != r12) {
            this.f2483c = r12;
            this.f2482b.a(obj);
        }
    }

    public final void b() {
        Object obj;
        z zVar = this.f2481a;
        zVar.getClass();
        z.a("observeForever");
        x xVar = new x(zVar, this);
        C0441f c0441f = zVar.f2486b;
        C0438c e4 = c0441f.e(this);
        if (e4 != null) {
            obj = e4.f4860K;
        } else {
            C0438c c0438c = new C0438c(this, xVar);
            c0441f.f4869M++;
            C0438c c0438c2 = c0441f.f4867K;
            if (c0438c2 == null) {
                c0441f.f4866J = c0438c;
                c0441f.f4867K = c0438c;
            } else {
                c0438c2.f4861L = c0438c;
                c0438c.f4862M = c0438c2;
                c0441f.f4867K = c0438c;
            }
            obj = null;
        }
        x xVar2 = (x) obj;
        if (!(xVar2 instanceof w)) {
            if (xVar2 == null) {
                xVar.a(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }
}
