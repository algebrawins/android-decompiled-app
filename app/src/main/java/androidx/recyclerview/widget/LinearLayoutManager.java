package androidx.recyclerview.widget;

import A0.A;
import A0.AbstractC0017t;
import A0.C0014p;
import A0.J;
import A0.r;
import A0.z;
import D.C;
import F.e;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import w1.u;

/* loaded from: classes.dex */
public class LinearLayoutManager extends z {

    /* renamed from: h  reason: collision with root package name */
    public final int f2510h;

    /* renamed from: i  reason: collision with root package name */
    public u f2511i;

    /* renamed from: j  reason: collision with root package name */
    public final AbstractC0017t f2512j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f2513k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f2514l = false;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2515m = false;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f2516n = true;

    /* renamed from: o  reason: collision with root package name */
    public r f2517o = null;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int r7, int r8) {
        this.f2510h = 1;
        this.f2513k = false;
        C0014p c0014p = new C0014p(0);
        c0014p.f148b = -1;
        c0014p.f149c = Integer.MIN_VALUE;
        c0014p.f150d = false;
        c0014p.f151e = false;
        C0014p w3 = z.w(context, attributeSet, r7, r8);
        int r6 = w3.f148b;
        if (r6 != 0 && r6 != 1) {
            throw new IllegalArgumentException(C.w("invalid orientation:", r6));
        }
        a(null);
        if (r6 != this.f2510h || this.f2512j == null) {
            this.f2512j = AbstractC0017t.e(this, r6);
            this.f2510h = r6;
            H();
        }
        boolean z3 = w3.f150d;
        a(null);
        if (z3 != this.f2513k) {
            this.f2513k = z3;
            H();
        }
        Q(w3.f151e);
    }

    @Override // A0.z
    public final void A(AccessibilityEvent accessibilityEvent) {
        super.A(accessibilityEvent);
        if (p() > 0) {
            View P3 = P(0, p(), false);
            if (P3 == null) {
                accessibilityEvent.setFromIndex(-1);
                View P4 = P(p() - 1, -1, false);
                if (P4 == null) {
                    accessibilityEvent.setToIndex(-1);
                    return;
                } else {
                    ((A) P4.getLayoutParams()).getClass();
                    throw null;
                }
            }
            ((A) P3.getLayoutParams()).getClass();
            throw null;
        }
    }

    @Override // A0.z
    public final void B(Parcelable parcelable) {
        if (parcelable instanceof r) {
            this.f2517o = (r) parcelable;
            H();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.os.Parcelable, java.lang.Object, A0.r] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.os.Parcelable, java.lang.Object, A0.r] */
    @Override // A0.z
    public final Parcelable C() {
        r rVar = this.f2517o;
        if (rVar != null) {
            ?? obj = new Object();
            obj.f153a = rVar.f153a;
            obj.f154b = rVar.f154b;
            obj.f155c = rVar.f155c;
            return obj;
        }
        ?? obj2 = new Object();
        if (p() > 0) {
            M();
            boolean z3 = this.f2514l;
            obj2.f155c = z3;
            int r3 = 0;
            if (z3) {
                if (!z3) {
                    r3 = p() - 1;
                }
                View o3 = o(r3);
                obj2.f154b = this.f2512j.o() - this.f2512j.i(o3);
                z.v(o3);
                throw null;
            }
            if (z3) {
                r3 = p() - 1;
            }
            z.v(o(r3));
            throw null;
        }
        obj2.f153a = -1;
        return obj2;
    }

    public final int J(J j3) {
        if (p() == 0) {
            return 0;
        }
        M();
        AbstractC0017t abstractC0017t = this.f2512j;
        boolean z3 = !this.f2516n;
        return e.a(j3, abstractC0017t, O(z3), N(z3), this, this.f2516n);
    }

    public final void K(J j3) {
        if (p() == 0) {
            return;
        }
        M();
        boolean z3 = !this.f2516n;
        View O2 = O(z3);
        View N3 = N(z3);
        if (p() != 0 && j3.a() != 0 && O2 != null && N3 != null) {
            ((A) O2.getLayoutParams()).getClass();
            throw null;
        }
    }

    public final int L(J j3) {
        if (p() == 0) {
            return 0;
        }
        M();
        AbstractC0017t abstractC0017t = this.f2512j;
        boolean z3 = !this.f2516n;
        return e.b(j3, abstractC0017t, O(z3), N(z3), this, this.f2516n);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [w1.u, java.lang.Object] */
    public final void M() {
        if (this.f2511i == null) {
            this.f2511i = new Object();
        }
    }

    public final View N(boolean z3) {
        if (this.f2514l) {
            return P(0, p(), z3);
        }
        return P(p() - 1, -1, z3);
    }

    public final View O(boolean z3) {
        if (this.f2514l) {
            return P(p() - 1, -1, z3);
        }
        return P(0, p(), z3);
    }

    public final View P(int r3, int r4, boolean z3) {
        int r5;
        M();
        if (z3) {
            r5 = 24579;
        } else {
            r5 = 320;
        }
        if (this.f2510h == 0) {
            return this.f164c.k(r3, r4, r5, 320);
        }
        return this.f165d.k(r3, r4, r5, 320);
    }

    public void Q(boolean z3) {
        a(null);
        if (this.f2515m == z3) {
            return;
        }
        this.f2515m = z3;
        H();
    }

    @Override // A0.z
    public final void a(String str) {
        RecyclerView recyclerView;
        if (this.f2517o == null && (recyclerView = this.f163b) != null) {
            recyclerView.b(str);
        }
    }

    @Override // A0.z
    public final boolean b() {
        if (this.f2510h == 0) {
            return true;
        }
        return false;
    }

    @Override // A0.z
    public final boolean c() {
        if (this.f2510h == 1) {
            return true;
        }
        return false;
    }

    @Override // A0.z
    public final int f(J j3) {
        return J(j3);
    }

    @Override // A0.z
    public final void g(J j3) {
        K(j3);
    }

    @Override // A0.z
    public final int h(J j3) {
        return L(j3);
    }

    @Override // A0.z
    public final int i(J j3) {
        return J(j3);
    }

    @Override // A0.z
    public final void j(J j3) {
        K(j3);
    }

    @Override // A0.z
    public final int k(J j3) {
        return L(j3);
    }

    @Override // A0.z
    public A l() {
        return new A(-2, -2);
    }

    @Override // A0.z
    public final boolean y() {
        return true;
    }

    @Override // A0.z
    public final void z(RecyclerView recyclerView) {
    }
}
