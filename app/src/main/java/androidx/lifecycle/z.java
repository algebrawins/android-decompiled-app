package androidx.lifecycle;

import A0.RunnableC0004e;
import android.os.Looper;
import h2.AbstractActivityC0292d;
import java.util.Iterator;
import java.util.Map;
import q.C0428a;
import r.C0437b;
import r.C0438c;
import r.C0439d;
import r.C0441f;

/* loaded from: classes.dex */
public class z {

    /* renamed from: k  reason: collision with root package name */
    public static final Object f2484k = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f2485a;

    /* renamed from: b  reason: collision with root package name */
    public final C0441f f2486b;

    /* renamed from: c  reason: collision with root package name */
    public int f2487c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2488d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f2489e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f2490f;
    public int g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2491h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2492i;

    /* renamed from: j  reason: collision with root package name */
    public final RunnableC0004e f2493j;

    public z(Object obj) {
        this.f2485a = new Object();
        this.f2486b = new C0441f();
        this.f2487c = 0;
        this.f2490f = f2484k;
        this.f2493j = new RunnableC0004e(9, this);
        this.f2489e = obj;
        this.g = 0;
    }

    public static void a(String str) {
        C0428a.a().f4790a.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public final void b(x xVar) {
        if (!xVar.f2478K) {
            return;
        }
        if (!xVar.d()) {
            xVar.a(false);
            return;
        }
        int r02 = xVar.f2479L;
        int r12 = this.g;
        if (r02 >= r12) {
            return;
        }
        xVar.f2479L = r12;
        xVar.f2477J.a(this.f2489e);
    }

    public final void c(x xVar) {
        if (this.f2491h) {
            this.f2492i = true;
            return;
        }
        this.f2491h = true;
        do {
            this.f2492i = false;
            if (xVar != null) {
                b(xVar);
                xVar = null;
            } else {
                C0441f c0441f = this.f2486b;
                c0441f.getClass();
                C0439d c0439d = new C0439d(c0441f);
                c0441f.f4868L.put(c0439d, Boolean.FALSE);
                while (c0439d.hasNext()) {
                    b((x) ((Map.Entry) c0439d.next()).getValue());
                    if (this.f2492i) {
                        break;
                    }
                }
            }
        } while (this.f2492i);
        this.f2491h = false;
    }

    public Object d() {
        Object obj = this.f2489e;
        if (obj != f2484k) {
            return obj;
        }
        return null;
    }

    public final void e(AbstractActivityC0292d abstractActivityC0292d, d2.k kVar) {
        Object obj;
        a("observe");
        if (abstractActivityC0292d.f3316L.f2467c == l.DESTROYED) {
            return;
        }
        w wVar = new w(this, abstractActivityC0292d, kVar);
        C0441f c0441f = this.f2486b;
        C0438c e4 = c0441f.e(kVar);
        if (e4 != null) {
            obj = e4.f4860K;
        } else {
            C0438c c0438c = new C0438c(kVar, wVar);
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
        x xVar = (x) obj;
        if (xVar != null && !xVar.c(abstractActivityC0292d)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (xVar != null) {
            return;
        }
        abstractActivityC0292d.f3316L.a(wVar);
    }

    public final void h(Object obj) {
        boolean z3;
        synchronized (this.f2485a) {
            if (this.f2490f == f2484k) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f2490f = obj;
        }
        if (z3) {
            C0428a.a().b(this.f2493j);
        }
    }

    public final void i(A a4) {
        a("removeObserver");
        x xVar = (x) this.f2486b.h(a4);
        if (xVar == null) {
            return;
        }
        xVar.b();
        xVar.a(false);
    }

    public final void j(AbstractActivityC0292d abstractActivityC0292d) {
        a("removeObservers");
        Iterator it = this.f2486b.iterator();
        while (true) {
            C0437b c0437b = (C0437b) it;
            if (c0437b.hasNext()) {
                Map.Entry entry = (Map.Entry) c0437b.next();
                if (((x) entry.getValue()).c(abstractActivityC0292d)) {
                    i((A) entry.getKey());
                }
            } else {
                return;
            }
        }
    }

    public final void k(Object obj) {
        a("setValue");
        this.g++;
        this.f2489e = obj;
        c(null);
    }

    public z() {
        this.f2485a = new Object();
        this.f2486b = new C0441f();
        this.f2487c = 0;
        Object obj = f2484k;
        this.f2490f = obj;
        this.f2493j = new RunnableC0004e(9, this);
        this.f2489e = obj;
        this.g = -1;
    }

    public void f() {
    }

    public void g() {
    }
}
