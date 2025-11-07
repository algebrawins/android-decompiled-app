package io.flutter.plugin.platform;

import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import d2.C0235c;
import h2.C0299l;
import h2.EnumC0298k;
import h2.J;
import h2.t;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class j implements g {

    /* renamed from: b  reason: collision with root package name */
    public Activity f3578b;

    /* renamed from: c  reason: collision with root package name */
    public t f3579c;

    /* renamed from: d  reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.n f3580d;

    /* renamed from: e  reason: collision with root package name */
    public io.flutter.plugin.editing.k f3581e;

    /* renamed from: f  reason: collision with root package name */
    public C0235c f3582f;

    /* renamed from: s  reason: collision with root package name */
    public final J f3594s;

    /* renamed from: n  reason: collision with root package name */
    public int f3589n = 0;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3590o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3591p = true;

    /* renamed from: t  reason: collision with root package name */
    public final A.c f3595t = new A.c(27, this);

    /* renamed from: a  reason: collision with root package name */
    public final P1.c f3577a = new P1.c(2);

    /* renamed from: h  reason: collision with root package name */
    public final HashMap f3583h = new HashMap();
    public final a g = new Object();

    /* renamed from: i  reason: collision with root package name */
    public final HashMap f3584i = new HashMap();

    /* renamed from: l  reason: collision with root package name */
    public final SparseArray f3587l = new SparseArray();

    /* renamed from: q  reason: collision with root package name */
    public final HashSet f3592q = new HashSet();

    /* renamed from: r  reason: collision with root package name */
    public final HashSet f3593r = new HashSet();

    /* renamed from: m  reason: collision with root package name */
    public final SparseArray f3588m = new SparseArray();

    /* renamed from: j  reason: collision with root package name */
    public final SparseArray f3585j = new SparseArray();

    /* renamed from: k  reason: collision with root package name */
    public final SparseArray f3586k = new SparseArray();

    /* JADX WARN: Type inference failed for: r0v5, types: [io.flutter.plugin.platform.a, java.lang.Object] */
    public j() {
        if (J.f3300M == null) {
            J.f3300M = new J(0);
        }
        this.f3594s = J.f3300M;
    }

    @Override // io.flutter.plugin.platform.g
    public final void a() {
        this.g.f3558a = null;
    }

    @Override // io.flutter.plugin.platform.g
    public final void b(io.flutter.view.q qVar) {
        this.g.f3558a = qVar;
    }

    @Override // io.flutter.plugin.platform.g
    public final boolean c(int r22) {
        return this.f3583h.containsKey(Integer.valueOf(r22));
    }

    @Override // io.flutter.plugin.platform.g
    public final void d(int r22) {
        if (c(r22)) {
            ((p) this.f3583h.get(Integer.valueOf(r22))).getClass();
        } else if (this.f3585j.get(r22) == null) {
        } else {
            throw new ClassCastException();
        }
    }

    public final void e() {
        int r02 = 0;
        while (true) {
            SparseArray sparseArray = this.f3587l;
            if (r02 < sparseArray.size()) {
                b bVar = (b) sparseArray.valueAt(r02);
                bVar.c();
                bVar.f3334J.close();
                r02++;
            } else {
                return;
            }
        }
    }

    public final void f(boolean z3) {
        int r12 = 0;
        while (true) {
            SparseArray sparseArray = this.f3587l;
            if (r12 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(r12);
            b bVar = (b) sparseArray.valueAt(r12);
            if (this.f3592q.contains(Integer.valueOf(keyAt))) {
                i2.c cVar = this.f3579c.f3362Q;
                if (cVar != null) {
                    bVar.a(cVar.f3421b);
                }
                z3 &= bVar.e();
            } else {
                if (!this.f3590o) {
                    bVar.c();
                }
                bVar.setVisibility(8);
                this.f3579c.removeView(bVar);
            }
            r12++;
        }
        int r13 = 0;
        while (true) {
            SparseArray sparseArray2 = this.f3586k;
            if (r13 < sparseArray2.size()) {
                int keyAt2 = sparseArray2.keyAt(r13);
                View view = (View) sparseArray2.get(keyAt2);
                if (this.f3593r.contains(Integer.valueOf(keyAt2)) && (z3 || !this.f3591p)) {
                    view.setVisibility(0);
                } else {
                    view.setVisibility(8);
                }
                r13++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [io.flutter.embedding.engine.renderer.p, android.view.View] */
    public final void g() {
        if (this.f3591p && !this.f3590o) {
            t tVar = this.f3579c;
            tVar.f3358M.b();
            C0299l c0299l = tVar.f3357L;
            if (c0299l == null) {
                C0299l c0299l2 = new C0299l(tVar.getContext(), tVar.getWidth(), tVar.getHeight(), EnumC0298k.background);
                tVar.f3357L = c0299l2;
                tVar.addView(c0299l2);
            } else {
                c0299l.g(tVar.getWidth(), tVar.getHeight());
            }
            tVar.f3359N = tVar.f3358M;
            C0299l c0299l3 = tVar.f3357L;
            tVar.f3358M = c0299l3;
            i2.c cVar = tVar.f3362Q;
            if (cVar != null) {
                c0299l3.a(cVar.f3421b);
            }
            this.f3590o = true;
        }
    }

    public final int h(double d4) {
        return (int) Math.round(d4 * this.f3578b.getResources().getDisplayMetrics().density);
    }
}
