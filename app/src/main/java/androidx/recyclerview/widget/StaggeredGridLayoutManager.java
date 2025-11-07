package androidx.recyclerview.widget;

import A0.A;
import A0.AbstractC0017t;
import A0.C0013o;
import A0.C0014p;
import A0.F;
import A0.J;
import A0.O;
import A0.Q;
import A0.RunnableC0004e;
import A0.S;
import A0.T;
import A0.z;
import F.e;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import f0.w;
import java.lang.reflect.Field;
import java.util.BitSet;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends z {

    /* renamed from: h  reason: collision with root package name */
    public final int f2573h;

    /* renamed from: i  reason: collision with root package name */
    public final T[] f2574i;

    /* renamed from: j  reason: collision with root package name */
    public final AbstractC0017t f2575j;

    /* renamed from: k  reason: collision with root package name */
    public final AbstractC0017t f2576k;

    /* renamed from: l  reason: collision with root package name */
    public final int f2577l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f2578m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f2579n = false;

    /* renamed from: o  reason: collision with root package name */
    public final Q f2580o;

    /* renamed from: p  reason: collision with root package name */
    public final int f2581p;

    /* renamed from: q  reason: collision with root package name */
    public S f2582q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f2583r;

    /* renamed from: s  reason: collision with root package name */
    public final RunnableC0004e f2584s;

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, A0.Q] */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int r8, int r9) {
        this.f2573h = -1;
        this.f2578m = false;
        ?? obj = new Object();
        this.f2580o = obj;
        this.f2581p = 2;
        new Rect();
        this.f2583r = true;
        this.f2584s = new RunnableC0004e(2, this);
        C0014p w3 = z.w(context, attributeSet, r8, r9);
        int r7 = w3.f148b;
        if (r7 != 0 && r7 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        a(null);
        if (r7 != this.f2577l) {
            this.f2577l = r7;
            AbstractC0017t abstractC0017t = this.f2575j;
            this.f2575j = this.f2576k;
            this.f2576k = abstractC0017t;
            H();
        }
        int r72 = w3.f149c;
        a(null);
        if (r72 != this.f2573h) {
            obj.f61a = null;
            H();
            this.f2573h = r72;
            new BitSet(this.f2573h);
            this.f2574i = new T[this.f2573h];
            for (int r73 = 0; r73 < this.f2573h; r73++) {
                this.f2574i[r73] = new T(this, r73);
            }
            H();
        }
        boolean z3 = w3.f150d;
        a(null);
        S s3 = this.f2582q;
        if (s3 != null && s3.f68h != z3) {
            s3.f68h = z3;
        }
        this.f2578m = z3;
        H();
        C0013o c0013o = new C0013o(0);
        c0013o.f145b = 0;
        c0013o.f146c = 0;
        this.f2575j = AbstractC0017t.e(this, this.f2577l);
        this.f2576k = AbstractC0017t.e(this, 1 - this.f2577l);
    }

    @Override // A0.z
    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View O2 = O(false);
            View N3 = N(false);
            if (O2 != null && N3 != null) {
                ((A) O2.getLayoutParams()).getClass();
                throw null;
            }
        }
    }

    @Override // A0.z
    public final void B(Parcelable parcelable) {
        if (parcelable instanceof S) {
            this.f2582q = (S) parcelable;
            H();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object, A0.S] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.os.Parcelable, java.lang.Object, A0.S] */
    @Override // A0.z
    public final Parcelable C() {
        View O2;
        S s3 = this.f2582q;
        if (s3 != null) {
            ?? obj = new Object();
            obj.f64c = s3.f64c;
            obj.f62a = s3.f62a;
            obj.f63b = s3.f63b;
            obj.f65d = s3.f65d;
            obj.f66e = s3.f66e;
            obj.f67f = s3.f67f;
            obj.f68h = s3.f68h;
            obj.f69i = s3.f69i;
            obj.f70j = s3.f70j;
            obj.g = s3.g;
            return obj;
        }
        ?? obj2 = new Object();
        obj2.f68h = this.f2578m;
        obj2.f69i = false;
        obj2.f70j = false;
        obj2.f66e = 0;
        if (p() > 0) {
            P();
            obj2.f62a = 0;
            if (this.f2579n) {
                O2 = N(true);
            } else {
                O2 = O(true);
            }
            if (O2 == null) {
                obj2.f63b = -1;
                int r22 = this.f2573h;
                obj2.f64c = r22;
                obj2.f65d = new int[r22];
                for (int r12 = 0; r12 < this.f2573h; r12++) {
                    T t3 = this.f2574i[r12];
                    int r4 = t3.f72b;
                    if (r4 == Integer.MIN_VALUE) {
                        if (t3.f71a.size() == 0) {
                            r4 = Integer.MIN_VALUE;
                        } else {
                            View view = (View) t3.f71a.get(0);
                            t3.f72b = t3.f75e.f2575j.n(view);
                            ((O) view.getLayoutParams()).getClass();
                            r4 = t3.f72b;
                        }
                    }
                    if (r4 != Integer.MIN_VALUE) {
                        r4 -= this.f2575j.p();
                    }
                    obj2.f65d[r12] = r4;
                }
            } else {
                ((A) O2.getLayoutParams()).getClass();
                throw null;
            }
        } else {
            obj2.f62a = -1;
            obj2.f63b = -1;
            obj2.f64c = 0;
        }
        return obj2;
    }

    @Override // A0.z
    public final void D(int r12) {
        if (r12 == 0) {
            J();
        }
    }

    public final boolean J() {
        int r02 = this.f2573h;
        boolean z3 = this.f2579n;
        if (p() == 0 || this.f2581p == 0 || !this.f166e) {
            return false;
        }
        if (z3) {
            Q();
            P();
        } else {
            P();
            Q();
        }
        int p2 = p();
        int r5 = p2 - 1;
        new BitSet(r02).set(0, r02, true);
        if (this.f2577l == 1) {
            RecyclerView recyclerView = this.f163b;
            Field field = w.f3200a;
            if (recyclerView.getLayoutDirection() != 1) {
            }
        }
        if (z3) {
            p2 = -1;
        } else {
            r5 = 0;
        }
        if (r5 == p2) {
            return false;
        }
        ((O) o(r5).getLayoutParams()).getClass();
        throw null;
    }

    public final int K(J j3) {
        if (p() == 0) {
            return 0;
        }
        AbstractC0017t abstractC0017t = this.f2575j;
        boolean z3 = !this.f2583r;
        return e.a(j3, abstractC0017t, O(z3), N(z3), this, this.f2583r);
    }

    public final void L(J j3) {
        if (p() == 0) {
            return;
        }
        boolean z3 = !this.f2583r;
        View O2 = O(z3);
        View N3 = N(z3);
        if (p() != 0 && j3.a() != 0 && O2 != null && N3 != null) {
            ((A) O2.getLayoutParams()).getClass();
            throw null;
        }
    }

    public final int M(J j3) {
        if (p() == 0) {
            return 0;
        }
        AbstractC0017t abstractC0017t = this.f2575j;
        boolean z3 = !this.f2583r;
        return e.b(j3, abstractC0017t, O(z3), N(z3), this, this.f2583r);
    }

    public final View N(boolean z3) {
        int p2 = this.f2575j.p();
        int o3 = this.f2575j.o();
        View view = null;
        for (int p3 = p() - 1; p3 >= 0; p3--) {
            View o4 = o(p3);
            int n3 = this.f2575j.n(o4);
            int i3 = this.f2575j.i(o4);
            if (i3 > p2 && n3 < o3) {
                if (i3 > o3 && z3) {
                    if (view == null) {
                        view = o4;
                    }
                } else {
                    return o4;
                }
            }
        }
        return view;
    }

    public final View O(boolean z3) {
        int p2 = this.f2575j.p();
        int o3 = this.f2575j.o();
        int p3 = p();
        View view = null;
        for (int r4 = 0; r4 < p3; r4++) {
            View o4 = o(r4);
            int n3 = this.f2575j.n(o4);
            if (this.f2575j.i(o4) > p2 && n3 < o3) {
                if (n3 < p2 && z3) {
                    if (view == null) {
                        view = o4;
                    }
                } else {
                    return o4;
                }
            }
        }
        return view;
    }

    public final void P() {
        if (p() == 0) {
            return;
        }
        z.v(o(0));
        throw null;
    }

    public final void Q() {
        int p2 = p();
        if (p2 == 0) {
            return;
        }
        z.v(o(p2 - 1));
        throw null;
    }

    @Override // A0.z
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f2582q == null && (recyclerView = this.f163b) != null) {
            recyclerView.b(str);
        }
    }

    @Override // A0.z
    public final boolean b() {
        if (this.f2577l == 0) {
            return true;
        }
        return false;
    }

    @Override // A0.z
    public final boolean c() {
        if (this.f2577l == 1) {
            return true;
        }
        return false;
    }

    @Override // A0.z
    public final boolean d(A a4) {
        return a4 instanceof O;
    }

    @Override // A0.z
    public final int f(J j3) {
        return K(j3);
    }

    @Override // A0.z
    public final void g(J j3) {
        L(j3);
    }

    @Override // A0.z
    public final int h(J j3) {
        return M(j3);
    }

    @Override // A0.z
    public final int i(J j3) {
        return K(j3);
    }

    @Override // A0.z
    public final void j(J j3) {
        L(j3);
    }

    @Override // A0.z
    public final int k(J j3) {
        return M(j3);
    }

    @Override // A0.z
    public final A l() {
        if (this.f2577l == 0) {
            return new A(-2, -1);
        }
        return new A(-1, -2);
    }

    @Override // A0.z
    public final A m(Context context, AttributeSet attributeSet) {
        return new A(context, attributeSet);
    }

    @Override // A0.z
    public final A n(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new A((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new A(layoutParams);
    }

    @Override // A0.z
    public final int q(F f2, J j3) {
        if (this.f2577l == 1) {
            return this.f2573h;
        }
        super.q(f2, j3);
        return 1;
    }

    @Override // A0.z
    public final int x(F f2, J j3) {
        if (this.f2577l == 0) {
            return this.f2573h;
        }
        super.x(f2, j3);
        return 1;
    }

    @Override // A0.z
    public final boolean y() {
        if (this.f2581p != 0) {
            return true;
        }
        return false;
    }

    @Override // A0.z
    public final void z(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f163b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f2584s);
        }
        for (int r02 = 0; r02 < this.f2573h; r02++) {
            T t3 = this.f2574i[r02];
            t3.f71a.clear();
            t3.f72b = Integer.MIN_VALUE;
            t3.f73c = Integer.MIN_VALUE;
        }
        recyclerView.requestLayout();
    }
}
