package N;

import D.C0030k;
import D.N;
import D.h0;
import D.l0;
import D.n0;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import androidx.camera.core.impl.C;
import androidx.camera.core.impl.C0079f;
import java.util.HashSet;
import java.util.Iterator;
import x1.AbstractC0612g0;
import x1.AbstractC0624h4;
import x1.AbstractC0636k0;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final int f935a;

    /* renamed from: b  reason: collision with root package name */
    public final Matrix f936b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f937c;

    /* renamed from: d  reason: collision with root package name */
    public final Rect f938d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f939e;

    /* renamed from: f  reason: collision with root package name */
    public final C0079f f940f;
    public int g;

    /* renamed from: h  reason: collision with root package name */
    public int f941h;

    /* renamed from: i  reason: collision with root package name */
    public n f942i;

    /* renamed from: k  reason: collision with root package name */
    public n0 f944k;

    /* renamed from: l  reason: collision with root package name */
    public l f945l;

    /* renamed from: j  reason: collision with root package name */
    public boolean f943j = false;

    /* renamed from: m  reason: collision with root package name */
    public final HashSet f946m = new HashSet();

    /* renamed from: n  reason: collision with root package name */
    public boolean f947n = false;

    public m(int r22, int r3, C0079f c0079f, Matrix matrix, boolean z3, Rect rect, int r8, int r9, boolean z4) {
        this.f935a = r3;
        this.f940f = c0079f;
        this.f936b = matrix;
        this.f937c = z3;
        this.f938d = rect;
        this.f941h = r8;
        this.g = r9;
        this.f939e = z4;
        this.f945l = new l(c0079f.f2192a, r3);
    }

    public final void a() {
        AbstractC0624h4.f("Edge is already closed.", !this.f947n);
    }

    public final n0 b() {
        AbstractC0612g0.a();
        a();
        n0 n0Var = new n0(this.f940f.f2192a, new i(this, 0));
        try {
            l0 l0Var = n0Var.f429h;
            if (this.f945l.g(l0Var, new i(this, 1))) {
                H.f.d(this.f945l.f2113e).a(new N(5, l0Var), AbstractC0636k0.a());
            }
            this.f944k = n0Var;
            e();
            return n0Var;
        } catch (C e4) {
            throw new AssertionError("Surface is somehow already closed", e4);
        } catch (RuntimeException e5) {
            n0Var.f426d.b(new Exception("Surface request will not complete."));
            throw e5;
        }
    }

    public final void c() {
        AbstractC0612g0.a();
        this.f945l.a();
        n nVar = this.f942i;
        if (nVar != null) {
            nVar.a();
            this.f942i = null;
        }
    }

    public final void d() {
        boolean z3;
        AbstractC0612g0.a();
        a();
        l lVar = this.f945l;
        lVar.getClass();
        AbstractC0612g0.a();
        if (lVar.f934q == null) {
            synchronized (lVar.f2109a) {
                z3 = lVar.f2111c;
            }
            if (!z3) {
                return;
            }
        }
        c();
        this.f943j = false;
        this.f945l = new l(this.f940f.f2192a, this.f935a);
        Iterator it = this.f946m.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void e() {
        A.k kVar;
        G.e eVar;
        AbstractC0612g0.a();
        n0 n0Var = this.f944k;
        if (n0Var != null) {
            C0030k c0030k = new C0030k(this.f938d, this.f941h, this.g, this.f937c, this.f936b, this.f939e);
            synchronized (n0Var.f423a) {
                n0Var.f430i = c0030k;
                kVar = n0Var.f431j;
                eVar = n0Var.f432k;
            }
            if (kVar != null && eVar != null) {
                eVar.execute(new h0(kVar, c0030k, 0));
            }
        }
    }

    public final void f(final int r22, final int r3) {
        Runnable runnable = new Runnable() { // from class: N.j
            @Override // java.lang.Runnable
            public final void run() {
                boolean z3;
                m mVar = m.this;
                int r12 = mVar.f941h;
                int r23 = r22;
                boolean z4 = true;
                if (r12 != r23) {
                    mVar.f941h = r23;
                    z3 = true;
                } else {
                    z3 = false;
                }
                int r24 = mVar.g;
                int r4 = r3;
                if (r24 != r4) {
                    mVar.g = r4;
                } else {
                    z4 = z3;
                }
                if (z4) {
                    mVar.e();
                }
            }
        };
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            AbstractC0624h4.f("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(runnable));
        }
    }
}
