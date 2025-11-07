package A0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import z0.AbstractC0958a;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a  reason: collision with root package name */
    public C0001b f162a;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f163b;

    /* renamed from: c  reason: collision with root package name */
    public final A.f f164c;

    /* renamed from: d  reason: collision with root package name */
    public final A.f f165d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f166e;

    /* renamed from: f  reason: collision with root package name */
    public int f167f;
    public int g;

    public z() {
        A.c cVar = new A.c(4, this);
        A.a aVar = new A.a(5, this);
        this.f164c = new A.f(cVar);
        this.f165d = new A.f(aVar);
        this.f166e = false;
    }

    public static int e(int r22, int r3, int r4) {
        int mode = View.MeasureSpec.getMode(r22);
        int size = View.MeasureSpec.getSize(r22);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return Math.max(r3, r4);
            }
            return size;
        }
        return Math.min(size, Math.max(r3, r4));
    }

    public static void v(View view) {
        ((A) view.getLayoutParams()).getClass();
        throw null;
    }

    public static C0014p w(Context context, AttributeSet attributeSet, int r4, int r5) {
        C0014p c0014p = new C0014p(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0958a.f6584a, r4, r5);
        c0014p.f148b = obtainStyledAttributes.getInt(0, 1);
        c0014p.f149c = obtainStyledAttributes.getInt(9, 1);
        c0014p.f150d = obtainStyledAttributes.getBoolean(8, false);
        c0014p.f151e = obtainStyledAttributes.getBoolean(10, false);
        obtainStyledAttributes.recycle();
        return c0014p;
    }

    public void A(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f163b;
        F f2 = recyclerView.f2532J;
        J j3 = recyclerView.f2529G0;
        if (recyclerView != null && accessibilityEvent != null) {
            boolean z3 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f163b.canScrollVertically(-1) && !this.f163b.canScrollHorizontally(-1) && !this.f163b.canScrollHorizontally(1)) {
                z3 = false;
            }
            accessibilityEvent.setScrollable(z3);
            this.f163b.getClass();
        }
    }

    public abstract void B(Parcelable parcelable);

    public abstract Parcelable C();

    public final void E() {
        int p2 = p() - 1;
        if (p2 < 0) {
            return;
        }
        RecyclerView.j(o(p2));
        throw null;
    }

    public final void F(F f2) {
        int size = f2.f35a.size();
        int r12 = size - 1;
        ArrayList arrayList = f2.f35a;
        if (r12 < 0) {
            arrayList.clear();
            if (size > 0) {
                this.f163b.invalidate();
                return;
            }
            return;
        }
        arrayList.get(r12).getClass();
        throw new ClassCastException();
    }

    public final boolean G(RecyclerView recyclerView, View view, Rect rect, boolean z3, boolean z4) {
        int s3 = s();
        int u3 = u();
        int t3 = this.f167f - t();
        int r3 = this.g - r();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int r7 = left - s3;
        int min = Math.min(0, r7);
        int r8 = top - u3;
        int min2 = Math.min(0, r8);
        int r9 = width - t3;
        int max = Math.max(0, r9);
        int max2 = Math.max(0, height - r3);
        RecyclerView recyclerView2 = this.f163b;
        Field field = f0.w.f3200a;
        if (recyclerView2.getLayoutDirection() == 1) {
            if (max == 0) {
                max = Math.max(min, r9);
            }
        } else {
            if (min == 0) {
                min = Math.min(r7, max);
            }
            max = min;
        }
        if (min2 == 0) {
            min2 = Math.min(r8, max2);
        }
        int[] r22 = {max, min2};
        int r4 = r22[0];
        int r23 = r22[1];
        if (z4) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int s4 = s();
                int u4 = u();
                int t4 = this.f167f - t();
                int r5 = this.g - r();
                Rect rect2 = this.f163b.f2543P;
                int[] r12 = RecyclerView.f2518Q0;
                A a4 = (A) focusedChild.getLayoutParams();
                Rect rect3 = a4.f31a;
                rect2.set((focusedChild.getLeft() - rect3.left) - ((ViewGroup.MarginLayoutParams) a4).leftMargin, (focusedChild.getTop() - rect3.top) - ((ViewGroup.MarginLayoutParams) a4).topMargin, focusedChild.getRight() + rect3.right + ((ViewGroup.MarginLayoutParams) a4).rightMargin, focusedChild.getBottom() + rect3.bottom + ((ViewGroup.MarginLayoutParams) a4).bottomMargin);
                if (rect2.left - r4 >= t4 || rect2.right - r4 <= s4 || rect2.top - r23 >= r5 || rect2.bottom - r23 <= u4) {
                    return false;
                }
            } else {
                return false;
            }
        }
        if (r4 == 0 && r23 == 0) {
            return false;
        }
        if (z3) {
            recyclerView.scrollBy(r4, r23);
            return true;
        }
        recyclerView.r(r4, r23);
        return true;
    }

    public final void H() {
        RecyclerView recyclerView = this.f163b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void I(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f163b = null;
            this.f162a = null;
            this.f167f = 0;
            this.g = 0;
            return;
        }
        this.f163b = recyclerView;
        this.f162a = recyclerView.f2537M;
        this.f167f = recyclerView.getWidth();
        this.g = recyclerView.getHeight();
    }

    public abstract void a(String str);

    public abstract boolean b();

    public abstract boolean c();

    public boolean d(A a4) {
        if (a4 != null) {
            return true;
        }
        return false;
    }

    public abstract int f(J j3);

    public abstract void g(J j3);

    public abstract int h(J j3);

    public abstract int i(J j3);

    public abstract void j(J j3);

    public abstract int k(J j3);

    public abstract A l();

    public A m(Context context, AttributeSet attributeSet) {
        return new A(context, attributeSet);
    }

    public A n(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof A) {
            return new A((A) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new A((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new A(layoutParams);
    }

    public final View o(int r7) {
        C0001b c0001b = this.f162a;
        if (c0001b != null) {
            int r12 = -1;
            if (r7 >= 0) {
                int childCount = ((RecyclerView) ((A.a) c0001b.f85L).f1K).getChildCount();
                int r3 = r7;
                while (true) {
                    if (r3 >= childCount) {
                        break;
                    }
                    C0002c c0002c = (C0002c) c0001b.f86M;
                    int a4 = r7 - (r3 - c0002c.a(r3));
                    if (a4 == 0) {
                        r12 = r3;
                        while (c0002c.b(r12)) {
                            r12++;
                        }
                    } else {
                        r3 += a4;
                    }
                }
            }
            return ((RecyclerView) ((A.a) c0001b.f85L).f1K).getChildAt(r12);
        }
        return null;
    }

    public final int p() {
        C0001b c0001b = this.f162a;
        if (c0001b != null) {
            return ((RecyclerView) ((A.a) c0001b.f85L).f1K).getChildCount() - ((ArrayList) c0001b.f84K).size();
        }
        return 0;
    }

    public int q(F f2, J j3) {
        RecyclerView recyclerView = this.f163b;
        if (recyclerView != null) {
            recyclerView.getClass();
            return 1;
        }
        return 1;
    }

    public final int r() {
        RecyclerView recyclerView = this.f163b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int s() {
        RecyclerView recyclerView = this.f163b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int t() {
        RecyclerView recyclerView = this.f163b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int u() {
        RecyclerView recyclerView = this.f163b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int x(F f2, J j3) {
        RecyclerView recyclerView = this.f163b;
        if (recyclerView != null) {
            recyclerView.getClass();
            return 1;
        }
        return 1;
    }

    public abstract boolean y();

    public abstract void z(RecyclerView recyclerView);

    public void D(int r12) {
    }
}
