package androidx.appcompat.widget;

import A0.C0013o;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import com.example.catering_inventory.R;
import com.google.android.libraries.barhopper.RecognitionOptions;
import f0.AbstractC0266m;
import f0.InterfaceC0261g;
import f0.InterfaceC0262h;
import f0.w;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p.C0404b;
import p.C0407e;
import p.InterfaceC0406d;
import p.InterfaceC0425y;
import p.RunnableC0405c;
import p.q0;
import p.w0;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0261g, InterfaceC0262h {

    /* renamed from: k0  reason: collision with root package name */
    public static final int[] f1942k0 = {R.attr.actionBarSize, 16842841};

    /* renamed from: J  reason: collision with root package name */
    public int f1943J;

    /* renamed from: K  reason: collision with root package name */
    public ContentFrameLayout f1944K;

    /* renamed from: L  reason: collision with root package name */
    public ActionBarContainer f1945L;

    /* renamed from: M  reason: collision with root package name */
    public InterfaceC0425y f1946M;

    /* renamed from: N  reason: collision with root package name */
    public Drawable f1947N;

    /* renamed from: O  reason: collision with root package name */
    public boolean f1948O;

    /* renamed from: P  reason: collision with root package name */
    public boolean f1949P;

    /* renamed from: Q  reason: collision with root package name */
    public boolean f1950Q;

    /* renamed from: R  reason: collision with root package name */
    public boolean f1951R;

    /* renamed from: S  reason: collision with root package name */
    public boolean f1952S;

    /* renamed from: T  reason: collision with root package name */
    public int f1953T;

    /* renamed from: U  reason: collision with root package name */
    public final Rect f1954U;

    /* renamed from: V  reason: collision with root package name */
    public final Rect f1955V;

    /* renamed from: W  reason: collision with root package name */
    public final Rect f1956W;
    public final Rect a0;

    /* renamed from: b0  reason: collision with root package name */
    public final Rect f1957b0;

    /* renamed from: c0  reason: collision with root package name */
    public final Rect f1958c0;

    /* renamed from: d0  reason: collision with root package name */
    public final Rect f1959d0;

    /* renamed from: e0  reason: collision with root package name */
    public OverScroller f1960e0;

    /* renamed from: f0  reason: collision with root package name */
    public ViewPropertyAnimator f1961f0;

    /* renamed from: g0  reason: collision with root package name */
    public final C0404b f1962g0;

    /* renamed from: h0  reason: collision with root package name */
    public final RunnableC0405c f1963h0;

    /* renamed from: i0  reason: collision with root package name */
    public final RunnableC0405c f1964i0;
    public final C0013o j0;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1954U = new Rect();
        this.f1955V = new Rect();
        this.f1956W = new Rect();
        this.a0 = new Rect();
        this.f1957b0 = new Rect();
        this.f1958c0 = new Rect();
        this.f1959d0 = new Rect();
        this.f1962g0 = new C0404b(this);
        this.f1963h0 = new RunnableC0405c(this, 0);
        this.f1964i0 = new RunnableC0405c(this, 1);
        i(context);
        this.j0 = new C0013o(1);
    }

    public static boolean g(View view, Rect rect, boolean z3) {
        boolean z4;
        C0407e c0407e = (C0407e) view.getLayoutParams();
        int r02 = ((ViewGroup.MarginLayoutParams) c0407e).leftMargin;
        int r12 = rect.left;
        if (r02 != r12) {
            ((ViewGroup.MarginLayoutParams) c0407e).leftMargin = r12;
            z4 = true;
        } else {
            z4 = false;
        }
        int r13 = ((ViewGroup.MarginLayoutParams) c0407e).topMargin;
        int r3 = rect.top;
        if (r13 != r3) {
            ((ViewGroup.MarginLayoutParams) c0407e).topMargin = r3;
            z4 = true;
        }
        int r14 = ((ViewGroup.MarginLayoutParams) c0407e).rightMargin;
        int r32 = rect.right;
        if (r14 != r32) {
            ((ViewGroup.MarginLayoutParams) c0407e).rightMargin = r32;
            z4 = true;
        }
        if (z3) {
            int r6 = ((ViewGroup.MarginLayoutParams) c0407e).bottomMargin;
            int r5 = rect.bottom;
            if (r6 != r5) {
                ((ViewGroup.MarginLayoutParams) c0407e).bottomMargin = r5;
                return true;
            }
        }
        return z4;
    }

    @Override // f0.InterfaceC0261g
    public final void a(View view, View view2, int r3, int r4) {
        if (r4 == 0) {
            onNestedScrollAccepted(view, view2, r3);
        }
    }

    @Override // f0.InterfaceC0261g
    public final void b(ViewGroup viewGroup, int r22, int r3, int r4, int r5, int r6) {
        if (r6 == 0) {
            onNestedScroll(viewGroup, r22, r3, r4, r5);
        }
    }

    @Override // f0.InterfaceC0261g
    public final void c(View view, int r22) {
        if (r22 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0407e;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int r02;
        super.draw(canvas);
        if (this.f1947N != null && !this.f1948O) {
            if (this.f1945L.getVisibility() == 0) {
                r02 = (int) (this.f1945L.getTranslationY() + this.f1945L.getBottom() + 0.5f);
            } else {
                r02 = 0;
            }
            this.f1947N.setBounds(0, r02, getWidth(), this.f1947N.getIntrinsicHeight() + r02);
            this.f1947N.draw(canvas);
        }
    }

    @Override // f0.InterfaceC0262h
    public final void e(ViewGroup viewGroup, int r22, int r3, int r4, int r5, int r6, int[] r7) {
        b(viewGroup, r22, r3, r4, r5, r6);
    }

    @Override // f0.InterfaceC0261g
    public final boolean f(View view, View view2, int r3, int r4) {
        if (r4 == 0 && onStartNestedScroll(view, view2, r3)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        j();
        Field field = w.f3200a;
        getWindowSystemUiVisibility();
        boolean g = g(this.f1945L, rect, false);
        Rect rect2 = this.a0;
        rect2.set(rect);
        Method method = w0.f4740a;
        Rect rect3 = this.f1954U;
        if (method != null) {
            try {
                method.invoke(this, rect2, rect3);
            } catch (Exception e4) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e4);
            }
        }
        Rect rect4 = this.f1957b0;
        if (!rect4.equals(rect2)) {
            rect4.set(rect2);
            g = true;
        }
        Rect rect5 = this.f1955V;
        if (!rect5.equals(rect3)) {
            rect5.set(rect3);
            g = true;
        }
        if (g) {
            requestLayout();
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1945L;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0013o c0013o = this.j0;
        return c0013o.f146c | c0013o.f145b;
    }

    public CharSequence getTitle() {
        j();
        return ((q0) this.f1946M).f4679a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f1963h0);
        removeCallbacks(this.f1964i0);
        ViewPropertyAnimator viewPropertyAnimator = this.f1961f0;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        boolean z3;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f1942k0);
        boolean z4 = false;
        this.f1943J = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f1947N = drawable;
        if (drawable == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        setWillNotDraw(z3);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z4 = true;
        }
        this.f1948O = z4;
        this.f1960e0 = new OverScroller(context);
    }

    public final void j() {
        InterfaceC0425y wrapper;
        if (this.f1944K == null) {
            this.f1944K = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f1945L = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof InterfaceC0425y) {
                wrapper = (InterfaceC0425y) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
            }
            this.f1946M = wrapper;
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        Field field = w.f3200a;
        AbstractC0266m.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int r6, int r7, int r8, int r9) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int r82 = 0; r82 < childCount; r82++) {
            View childAt = getChildAt(r82);
            if (childAt.getVisibility() != 8) {
                C0407e c0407e = (C0407e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int r3 = ((ViewGroup.MarginLayoutParams) c0407e).leftMargin + paddingLeft;
                int r02 = ((ViewGroup.MarginLayoutParams) c0407e).topMargin + paddingTop;
                childAt.layout(r3, r02, measuredWidth + r3, measuredHeight + r02);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int r14, int r15) {
        boolean z3;
        j();
        measureChildWithMargins(this.f1945L, r14, 0, r15, 0);
        C0407e c0407e = (C0407e) this.f1945L.getLayoutParams();
        int r22 = 0;
        int max = Math.max(0, this.f1945L.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0407e).leftMargin + ((ViewGroup.MarginLayoutParams) c0407e).rightMargin);
        int max2 = Math.max(0, this.f1945L.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0407e).topMargin + ((ViewGroup.MarginLayoutParams) c0407e).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f1945L.getMeasuredState());
        Field field = w.f3200a;
        if ((getWindowSystemUiVisibility() & RecognitionOptions.QR_CODE) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            r22 = this.f1943J;
            if (this.f1950Q && this.f1945L.getTabContainer() != null) {
                r22 += this.f1943J;
            }
        } else if (this.f1945L.getVisibility() != 8) {
            r22 = this.f1945L.getMeasuredHeight();
        }
        Rect rect = this.f1954U;
        Rect rect2 = this.f1956W;
        rect2.set(rect);
        Rect rect3 = this.f1958c0;
        rect3.set(this.a0);
        if (!this.f1949P && !z3) {
            rect2.top += r22;
            rect2.bottom = rect2.bottom;
        } else {
            rect3.top += r22;
            rect3.bottom = rect3.bottom;
        }
        g(this.f1944K, rect2, true);
        Rect rect4 = this.f1959d0;
        if (!rect4.equals(rect3)) {
            rect4.set(rect3);
            this.f1944K.a(rect3);
        }
        measureChildWithMargins(this.f1944K, r14, 0, r15, 0);
        C0407e c0407e2 = (C0407e) this.f1944K.getLayoutParams();
        int max3 = Math.max(max, this.f1944K.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0407e2).leftMargin + ((ViewGroup.MarginLayoutParams) c0407e2).rightMargin);
        int max4 = Math.max(max2, this.f1944K.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0407e2).topMargin + ((ViewGroup.MarginLayoutParams) c0407e2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f1944K.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), r14, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), r15, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f4, boolean z3) {
        if (this.f1951R && z3) {
            this.f1960e0.fling(0, 0, 0, (int) f4, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
            if (this.f1960e0.getFinalY() > this.f1945L.getHeight()) {
                h();
                this.f1964i0.run();
            } else {
                h();
                this.f1963h0.run();
            }
            this.f1952S = true;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f4) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int r22, int r3, int[] r4) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int r22, int r3, int r4, int r5) {
        int r12 = this.f1953T + r3;
        this.f1953T = r12;
        setActionBarHideOffset(r12);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int r3) {
        this.j0.f145b = r3;
        this.f1953T = getActionBarHideOffset();
        h();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int r3) {
        if ((r3 & 2) != 0 && this.f1945L.getVisibility() == 0) {
            return this.f1951R;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (this.f1951R && !this.f1952S) {
            if (this.f1953T <= this.f1945L.getHeight()) {
                h();
                postDelayed(this.f1963h0, 600L);
                return;
            }
            h();
            postDelayed(this.f1964i0, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int r12) {
        super.onWindowSystemUiVisibilityChanged(r12);
        j();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int r12) {
        super.onWindowVisibilityChanged(r12);
    }

    public void setActionBarHideOffset(int r3) {
        h();
        this.f1945L.setTranslationY(-Math.max(0, Math.min(r3, this.f1945L.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0406d interfaceC0406d) {
        if (getWindowToken() == null) {
            return;
        }
        throw null;
    }

    public void setHasNonEmbeddedTabs(boolean z3) {
        this.f1950Q = z3;
    }

    public void setHideOnContentScrollEnabled(boolean z3) {
        if (z3 != this.f1951R) {
            this.f1951R = z3;
            if (!z3) {
                h();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int r3) {
        j();
        q0 q0Var = (q0) this.f1946M;
        q0Var.f4682d = r3 != 0 ? j.b.c(q0Var.f4679a.getContext(), r3) : null;
        q0Var.c();
    }

    public void setLogo(int r3) {
        Drawable drawable;
        j();
        q0 q0Var = (q0) this.f1946M;
        if (r3 != 0) {
            drawable = j.b.c(q0Var.f4679a.getContext(), r3);
        } else {
            drawable = null;
        }
        q0Var.f4683e = drawable;
        q0Var.c();
    }

    public void setOverlayMode(boolean z3) {
        boolean z4;
        this.f1949P = z3;
        if (z3 && getContext().getApplicationInfo().targetSdkVersion < 19) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f1948O = z4;
    }

    public void setShowingForActionMode(boolean z3) {
    }

    public void setUiOptions(int r12) {
    }

    public void setWindowCallback(Window.Callback callback) {
        j();
        ((q0) this.f1946M).f4688k = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        j();
        q0 q0Var = (q0) this.f1946M;
        if (!q0Var.g) {
            q0Var.f4685h = charSequence;
            if ((q0Var.f4680b & 8) != 0) {
                q0Var.f4679a.setTitle(charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        j();
        q0 q0Var = (q0) this.f1946M;
        q0Var.f4682d = drawable;
        q0Var.c();
    }

    @Override // f0.InterfaceC0261g
    public final void d(int r12, int r22, int[] r3, int r4) {
    }
}
