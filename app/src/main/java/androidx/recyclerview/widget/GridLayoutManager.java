package androidx.recyclerview.widget;

import A.c;
import A0.A;
import A0.C0012n;
import A0.F;
import A0.J;
import A0.z;
import D.C;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: p  reason: collision with root package name */
    public final int f2508p;

    /* renamed from: q  reason: collision with root package name */
    public final c f2509q;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int r5, int r6) {
        super(context, attributeSet, r5, r6);
        this.f2508p = -1;
        new SparseIntArray();
        new SparseIntArray();
        c cVar = new c(3);
        this.f2509q = cVar;
        new Rect();
        int r3 = z.w(context, attributeSet, r5, r6).f149c;
        if (r3 != this.f2508p) {
            if (r3 >= 1) {
                this.f2508p = r3;
                ((SparseIntArray) cVar.f5K).clear();
                H();
                return;
            }
            throw new IllegalArgumentException(C.w("Span count should be at least 1. Provided ", r3));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void Q(boolean z3) {
        if (!z3) {
            super.Q(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public final int R(F f2, J j3, int r5) {
        int C3;
        boolean z3 = j3.f45c;
        c cVar = this.f2509q;
        if (!z3) {
            int r3 = this.f2508p;
            cVar.getClass();
            return c.B(r5, r3);
        }
        RecyclerView recyclerView = f2.f40f;
        if (r5 >= 0 && r5 < recyclerView.f2529G0.a()) {
            if (!recyclerView.f2529G0.f45c) {
                C3 = r5;
            } else {
                C3 = recyclerView.f2535L.C(r5, 0);
            }
            if (C3 == -1) {
                Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + r5);
                return 0;
            }
            int r4 = this.f2508p;
            cVar.getClass();
            return c.B(C3, r4);
        }
        throw new IndexOutOfBoundsException("invalid position " + r5 + ". State item count is " + recyclerView.f2529G0.a() + recyclerView.h());
    }

    @Override // A0.z
    public final boolean d(A a4) {
        return a4 instanceof C0012n;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, A0.z
    public final A l() {
        if (this.f2510h == 0) {
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
        if (this.f2510h == 1) {
            return this.f2508p;
        }
        if (j3.a() < 1) {
            return 0;
        }
        return R(f2, j3, j3.a() - 1) + 1;
    }

    @Override // A0.z
    public final int x(F f2, J j3) {
        if (this.f2510h == 0) {
            return this.f2508p;
        }
        if (j3.a() < 1) {
            return 0;
        }
        return R(f2, j3, j3.a() - 1) + 1;
    }
}
