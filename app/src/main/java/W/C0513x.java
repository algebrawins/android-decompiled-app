package w;

import java.util.Iterator;
import java.util.Map;
import r.C0437b;
import r.C0438c;
import r.C0441f;

/* renamed from: w.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0513x extends androidx.lifecycle.z {

    /* renamed from: l  reason: collision with root package name */
    public C0441f f5269l = new C0441f();

    /* renamed from: m  reason: collision with root package name */
    public androidx.lifecycle.z f5270m;

    /* renamed from: n  reason: collision with root package name */
    public final Object f5271n;

    public C0513x(Object obj) {
        this.f5271n = obj;
    }

    @Override // androidx.lifecycle.z
    public final Object d() {
        androidx.lifecycle.z zVar = this.f5270m;
        if (zVar == null) {
            return this.f5271n;
        }
        return zVar.d();
    }

    @Override // androidx.lifecycle.z
    public final void f() {
        Iterator it = this.f5269l.iterator();
        while (true) {
            C0437b c0437b = (C0437b) it;
            if (c0437b.hasNext()) {
                ((androidx.lifecycle.y) ((Map.Entry) c0437b.next()).getValue()).b();
            } else {
                return;
            }
        }
    }

    @Override // androidx.lifecycle.z
    public final void g() {
        Iterator it = this.f5269l.iterator();
        while (true) {
            C0437b c0437b = (C0437b) it;
            if (c0437b.hasNext()) {
                androidx.lifecycle.y yVar = (androidx.lifecycle.y) ((Map.Entry) c0437b.next()).getValue();
                yVar.f2481a.i(yVar);
            } else {
                return;
            }
        }
    }

    public final void l(androidx.lifecycle.z zVar) {
        Object obj;
        androidx.lifecycle.y yVar;
        androidx.lifecycle.z zVar2 = this.f5270m;
        C0441f c0441f = this.f5269l;
        if (zVar2 != null && (yVar = (androidx.lifecycle.y) c0441f.h(zVar2)) != null) {
            yVar.f2481a.i(yVar);
        }
        this.f5270m = zVar;
        C0512w c0512w = new C0512w(this);
        if (zVar != null) {
            androidx.lifecycle.y yVar2 = new androidx.lifecycle.y(zVar, c0512w);
            C0438c e4 = c0441f.e(zVar);
            if (e4 != null) {
                obj = e4.f4860K;
            } else {
                C0438c c0438c = new C0438c(zVar, yVar2);
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
            androidx.lifecycle.y yVar3 = (androidx.lifecycle.y) obj;
            if (yVar3 != null && yVar3.f2482b != c0512w) {
                throw new IllegalArgumentException("This source was already added with the different observer");
            }
            if (yVar3 == null && this.f2487c > 0) {
                yVar2.b();
                return;
            }
            return;
        }
        throw new NullPointerException("source cannot be null");
    }
}
