package androidx.core.widget;

import A0.C0013o;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.example.catering_inventory.R;
import f0.AbstractC0268o;
import f0.C0256b;
import f0.C0257c;
import f0.C0260f;
import f0.InterfaceC0262h;
import f0.w;
import java.lang.reflect.Field;
import java.util.ArrayList;
import k0.AbstractC0317d;
import k0.AbstractC0321h;
import k0.C0320g;
import k0.C0322i;
import k0.C0324k;
import k0.InterfaceC0323j;
import x1.A4;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0262h {

    /* renamed from: n0  reason: collision with root package name */
    public static final float f2269n0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final C0320g o0 = new C0256b();

    /* renamed from: p0  reason: collision with root package name */
    public static final int[] f2270p0 = {16843130};

    /* renamed from: J  reason: collision with root package name */
    public final float f2271J;

    /* renamed from: K  reason: collision with root package name */
    public long f2272K;

    /* renamed from: L  reason: collision with root package name */
    public final Rect f2273L;

    /* renamed from: M  reason: collision with root package name */
    public final OverScroller f2274M;

    /* renamed from: N  reason: collision with root package name */
    public final EdgeEffect f2275N;

    /* renamed from: O  reason: collision with root package name */
    public final EdgeEffect f2276O;

    /* renamed from: P  reason: collision with root package name */
    public int f2277P;

    /* renamed from: Q  reason: collision with root package name */
    public boolean f2278Q;

    /* renamed from: R  reason: collision with root package name */
    public boolean f2279R;

    /* renamed from: S  reason: collision with root package name */
    public View f2280S;

    /* renamed from: T  reason: collision with root package name */
    public boolean f2281T;

    /* renamed from: U  reason: collision with root package name */
    public VelocityTracker f2282U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f2283V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f2284W;
    public final int a0;

    /* renamed from: b0  reason: collision with root package name */
    public final int f2285b0;

    /* renamed from: c0  reason: collision with root package name */
    public final int f2286c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f2287d0;

    /* renamed from: e0  reason: collision with root package name */
    public final int[] f2288e0;

    /* renamed from: f0  reason: collision with root package name */
    public final int[] f2289f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f2290g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f2291h0;

    /* renamed from: i0  reason: collision with root package name */
    public C0324k f2292i0;
    public final C0013o j0;

    /* renamed from: k0  reason: collision with root package name */
    public final C0260f f2293k0;

    /* renamed from: l0  reason: collision with root package name */
    public float f2294l0;

    /* renamed from: m0  reason: collision with root package name */
    public final C0257c f2295m0;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.nestedScrollViewStyle);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        this.f2273L = new Rect();
        this.f2278Q = true;
        this.f2279R = false;
        this.f2280S = null;
        this.f2281T = false;
        this.f2284W = true;
        this.f2287d0 = -1;
        this.f2288e0 = new int[2];
        this.f2289f0 = new int[2];
        this.f2295m0 = new C0257c(getContext(), new C0322i(0, this));
        int r3 = Build.VERSION.SDK_INT;
        if (r3 >= 31) {
            edgeEffect = AbstractC0317d.a(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f2275N = edgeEffect;
        if (r3 >= 31) {
            edgeEffect2 = AbstractC0317d.a(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f2276O = edgeEffect2;
        this.f2271J = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f2274M = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.a0 = viewConfiguration.getScaledTouchSlop();
        this.f2285b0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2286c0 = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2270p0, R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.j0 = new C0013o(1);
        this.f2293k0 = new C0260f(this);
        setNestedScrollingEnabled(true);
        w.a(this, o0);
    }

    public static boolean k(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        ViewParent parent = view.getParent();
        if ((parent instanceof ViewGroup) && k((View) parent, nestedScrollView)) {
            return true;
        }
        return false;
    }

    @Override // f0.InterfaceC0261g
    public final void a(View view, View view2, int r3, int r4) {
        C0013o c0013o = this.j0;
        if (r4 == 1) {
            c0013o.f146c = r3;
        } else {
            c0013o.f145b = r3;
        }
        u(2, r4);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // f0.InterfaceC0261g
    public final void b(ViewGroup viewGroup, int r22, int r3, int r4, int r5, int r6) {
        m(r5, r6, null);
    }

    @Override // f0.InterfaceC0261g
    public final void c(View view, int r4) {
        C0013o c0013o = this.j0;
        if (r4 == 1) {
            c0013o.f146c = 0;
        } else {
            c0013o.f145b = 0;
        }
        w(r4);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ea  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return bottom + (scrollY - max);
        }
        return bottom;
    }

    @Override // f0.InterfaceC0261g
    public final void d(int r7, int r8, int[] r9, int r10) {
        this.f2293k0.c(r7, r8, r9, null, r10);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00ce A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r7) {
        /*
            r6 = this;
            boolean r0 = super.dispatchKeyEvent(r7)
            r1 = 1
            if (r0 != 0) goto Lcf
            android.graphics.Rect r0 = r6.f2273L
            r0.setEmpty()
            int r0 = r6.getChildCount()
            r2 = 0
            r3 = 130(0x82, float:1.82E-43)
            if (r0 <= 0) goto La2
            android.view.View r0 = r6.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r4 = (android.widget.FrameLayout.LayoutParams) r4
            int r0 = r0.getHeight()
            int r5 = r4.topMargin
            int r0 = r0 + r5
            int r4 = r4.bottomMargin
            int r0 = r0 + r4
            int r4 = r6.getHeight()
            int r5 = r6.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r6.getPaddingBottom()
            int r4 = r4 - r5
            if (r0 <= r4) goto La2
            int r0 = r7.getAction()
            if (r0 != 0) goto Lca
            int r0 = r7.getKeyCode()
            r4 = 19
            r5 = 33
            if (r0 == r4) goto L92
            r4 = 20
            if (r0 == r4) goto L82
            r4 = 62
            if (r0 == r4) goto L76
            r7 = 92
            if (r0 == r7) goto L71
            r7 = 93
            if (r0 == r7) goto L6c
            r7 = 122(0x7a, float:1.71E-43)
            if (r0 == r7) goto L68
            r7 = 123(0x7b, float:1.72E-43)
            if (r0 == r7) goto L63
            goto Lca
        L63:
            r6.p(r3)
            goto Lca
        L68:
            r6.p(r5)
            goto Lca
        L6c:
            boolean r7 = r6.j(r3)
            goto Lcb
        L71:
            boolean r7 = r6.j(r5)
            goto Lcb
        L76:
            boolean r7 = r7.isShiftPressed()
            if (r7 == 0) goto L7e
            r3 = 33
        L7e:
            r6.p(r3)
            goto Lca
        L82:
            boolean r7 = r7.isAltPressed()
            if (r7 == 0) goto L8d
            boolean r7 = r6.j(r3)
            goto Lcb
        L8d:
            boolean r7 = r6.g(r3)
            goto Lcb
        L92:
            boolean r7 = r7.isAltPressed()
            if (r7 == 0) goto L9d
            boolean r7 = r6.j(r5)
            goto Lcb
        L9d:
            boolean r7 = r6.g(r5)
            goto Lcb
        La2:
            boolean r0 = r6.isFocused()
            if (r0 == 0) goto Lca
            int r7 = r7.getKeyCode()
            r0 = 4
            if (r7 == r0) goto Lca
            android.view.View r7 = r6.findFocus()
            if (r7 != r6) goto Lb6
            r7 = 0
        Lb6:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r7 = r0.findNextFocus(r6, r7, r3)
            if (r7 == 0) goto Lca
            if (r7 == r6) goto Lca
            boolean r7 = r7.requestFocus(r3)
            if (r7 == 0) goto Lca
            r7 = 1
            goto Lcb
        Lca:
            r7 = 0
        Lcb:
            if (r7 == 0) goto Lce
            goto Lcf
        Lce:
            r1 = 0
        Lcf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f4, boolean z3) {
        return this.f2293k0.a(f2, f4, z3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f4) {
        return this.f2293k0.b(f2, f4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int r7, int r8, int[] r9, int[] r10) {
        return this.f2293k0.c(r7, r8, r9, r10, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int r9, int r10, int r11, int r12, int[] r13) {
        return this.f2293k0.d(r9, r10, r11, r12, r13, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int r7;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f2275N;
        int r3 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (AbstractC0321h.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                r7 = getPaddingLeft();
            } else {
                r7 = 0;
            }
            if (AbstractC0321h.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(r7, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f2276O;
        if (!edgeEffect2.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (AbstractC0321h.a(this)) {
                width2 -= getPaddingRight() + getPaddingLeft();
                r3 = getPaddingLeft();
            }
            if (AbstractC0321h.a(this)) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate(r3 - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            edgeEffect2.setSize(width2, height2);
            if (edgeEffect2.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save2);
        }
    }

    @Override // f0.InterfaceC0262h
    public final void e(ViewGroup viewGroup, int r22, int r3, int r4, int r5, int r6, int[] r7) {
        m(r5, r6, r7);
    }

    @Override // f0.InterfaceC0261g
    public final boolean f(View view, View view2, int r3, int r4) {
        return (r3 & 2) != 0;
    }

    public final boolean g(int r9) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, r9);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && l(findNextFocus, maxScrollAmount, getHeight())) {
            Rect rect = this.f2273L;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            r(h(rect), 0, 1, true);
            findNextFocus.requestFocus(r9);
        } else {
            if (r9 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (r9 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (r9 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            r(maxScrollAmount, 0, 1, true);
        }
        if (findFocus != null && findFocus.isFocused() && !l(findFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0013o c0013o = this.j0;
        return c0013o.f146c | c0013o.f145b;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f2294l0 == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f2294l0 = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f2294l0;
    }

    public final int h(Rect rect) {
        int r4;
        int r12;
        int r11;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int r3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            r4 = r3 - verticalFadingEdgeLength;
        } else {
            r4 = r3;
        }
        int r7 = rect.bottom;
        if (r7 > r4 && rect.top > scrollY) {
            if (rect.height() > height) {
                r11 = rect.top - scrollY;
            } else {
                r11 = rect.bottom - r4;
            }
            return Math.min(r11, (childAt.getBottom() + layoutParams.bottomMargin) - r3);
        } else if (rect.top >= scrollY || r7 >= r4) {
            return 0;
        } else {
            if (rect.height() > height) {
                r12 = 0 - (r4 - rect.bottom);
            } else {
                r12 = 0 - (scrollY - rect.top);
            }
            return Math.max(r12, -getScrollY());
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f2293k0.f(0);
    }

    public final void i(int r13) {
        if (getChildCount() > 0) {
            this.f2274M.fling(getScrollX(), getScrollY(), 0, r13, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            u(2, 1);
            this.f2291h0 = getScrollY();
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f2293k0.f3190d;
    }

    public final boolean j(int r6) {
        boolean z3;
        int childCount;
        if (r6 == 130) {
            z3 = true;
        } else {
            z3 = false;
        }
        int height = getHeight();
        Rect rect = this.f2273L;
        rect.top = 0;
        rect.bottom = height;
        if (z3 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return q(r6, rect.top, rect.bottom);
    }

    public final boolean l(View view, int r4, int r5) {
        Rect rect = this.f2273L;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        if (rect.bottom + r4 >= getScrollY() && rect.top - r4 <= getScrollY() + r5) {
            return true;
        }
        return false;
    }

    public final void m(int r11, int r12, int[] r13) {
        int scrollY = getScrollY();
        scrollBy(0, r11);
        int scrollY2 = getScrollY() - scrollY;
        if (r13 != null) {
            r13[1] = r13[1] + scrollY2;
        }
        this.f2293k0.d(0, scrollY2, 0, r11 - scrollY2, null, r12, r13);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int r4, int r5) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(r4, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int r3, int r4, int r5, int r6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(r3, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + r4, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(MotionEvent motionEvent) {
        int r02;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2287d0) {
            if (actionIndex == 0) {
                r02 = 1;
            } else {
                r02 = 0;
            }
            this.f2277P = (int) motionEvent.getY(r02);
            this.f2287d0 = motionEvent.getPointerId(r02);
            VelocityTracker velocityTracker = this.f2282U;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean o(int r10, int r11, int r12, int r13) {
        boolean z3;
        boolean z4;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int r122 = r12 + r10;
        if (r11 > 0 || r11 < 0) {
            r11 = 0;
            z3 = true;
        } else {
            z3 = false;
        }
        if (r122 > r13) {
            z4 = true;
        } else if (r122 < 0) {
            z4 = true;
            r13 = 0;
        } else {
            r13 = r122;
            z4 = false;
        }
        if (z4 && !this.f2293k0.f(1)) {
            this.f2274M.springBack(r11, r13, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(r11, r13);
        if (z3 || z4) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2279R = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f9  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r27) {
        /*
            Method dump skipped, instructions count: 856
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z3 = true;
        if (action == 2 && this.f2281T) {
            return true;
        }
        int r02 = action & 255;
        if (r02 != 0) {
            if (r02 != 1) {
                if (r02 != 2) {
                    if (r02 != 3) {
                        if (r02 == 6) {
                            n(motionEvent);
                        }
                    }
                } else {
                    int r03 = this.f2287d0;
                    if (r03 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(r03);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + r03 + " in onInterceptTouchEvent");
                        } else {
                            int y3 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y3 - this.f2277P) > this.a0 && (2 & getNestedScrollAxes()) == 0) {
                                this.f2281T = true;
                                this.f2277P = y3;
                                if (this.f2282U == null) {
                                    this.f2282U = VelocityTracker.obtain();
                                }
                                this.f2282U.addMovement(motionEvent);
                                this.f2290g0 = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                }
            }
            this.f2281T = false;
            this.f2287d0 = -1;
            VelocityTracker velocityTracker = this.f2282U;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f2282U = null;
            }
            if (this.f2274M.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else {
            int y4 = (int) motionEvent.getY();
            int x3 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y4 >= childAt.getTop() - scrollY && y4 < childAt.getBottom() - scrollY && x3 >= childAt.getLeft() && x3 < childAt.getRight()) {
                    this.f2277P = y4;
                    this.f2287d0 = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f2282U;
                    if (velocityTracker2 == null) {
                        this.f2282U = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f2282U.addMovement(motionEvent);
                    this.f2274M.computeScrollOffset();
                    if (!v(motionEvent) && this.f2274M.isFinished()) {
                        z3 = false;
                    }
                    this.f2281T = z3;
                    u(2, 0);
                }
            }
            if (!v(motionEvent) && this.f2274M.isFinished()) {
                z3 = false;
            }
            this.f2281T = z3;
            VelocityTracker velocityTracker3 = this.f2282U;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f2282U = null;
            }
        }
        return this.f2281T;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int r3, int r4, int r5, int r6) {
        int r32;
        super.onLayout(z3, r3, r4, r5, r6);
        int r22 = 0;
        this.f2278Q = false;
        View view = this.f2280S;
        if (view != null && k(view, this)) {
            View view2 = this.f2280S;
            Rect rect = this.f2273L;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h3 = h(rect);
            if (h3 != 0) {
                scrollBy(0, h3);
            }
        }
        this.f2280S = null;
        if (!this.f2279R) {
            if (this.f2292i0 != null) {
                scrollTo(getScrollX(), this.f2292i0.f3984a);
                this.f2292i0 = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                r32 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                r32 = 0;
            }
            int paddingTop = ((r6 - r4) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < r32 && scrollY >= 0) {
                r22 = paddingTop + scrollY > r32 ? r32 - paddingTop : scrollY;
            }
            if (r22 != scrollY) {
                scrollTo(getScrollX(), r22);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2279R = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r5, int r6) {
        super.onMeasure(r5, r6);
        if (this.f2283V && View.MeasureSpec.getMode(r6) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(r5, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f4, boolean z3) {
        if (!z3) {
            dispatchNestedFling(0.0f, f4, true);
            i((int) f4);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f4) {
        return this.f2293k0.b(f2, f4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int r8, int r9, int[] r10) {
        this.f2293k0.c(r8, r9, r10, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int r22, int r3, int r4, int r5) {
        m(r5, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int r4) {
        a(view, view2, r4, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int r12, int r22, boolean z3, boolean z4) {
        super.scrollTo(r12, r22);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int r4, Rect rect) {
        View findNextFocusFromRect;
        if (r4 == 2) {
            r4 = 130;
        } else if (r4 == 1) {
            r4 = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, r4);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, r4);
        }
        if (findNextFocusFromRect == null || !l(findNextFocusFromRect, 0, getHeight())) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(r4, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0324k)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0324k c0324k = (C0324k) parcelable;
        super.onRestoreInstanceState(c0324k.getSuperState());
        this.f2292i0 = c0324k;
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, k0.k, android.os.Parcelable] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f3984a = getScrollY();
        return baseSavedState;
    }

    @Override // android.view.View
    public final void onScrollChanged(int r12, int r22, int r3, int r4) {
        super.onScrollChanged(r12, r22, r3, r4);
    }

    @Override // android.view.View
    public final void onSizeChanged(int r12, int r22, int r3, int r4) {
        super.onSizeChanged(r12, r22, r3, r4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && l(findFocus, 0, r4)) {
            Rect rect = this.f2273L;
            findFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findFocus, rect);
            int h3 = h(rect);
            if (h3 != 0) {
                if (this.f2284W) {
                    t(0, h3, false);
                } else {
                    scrollBy(0, h3);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int r4) {
        return f(view, view2, r4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        c(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f2282U == null) {
            this.f2282U = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2290g0 = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        float f2 = 0.0f;
        obtain.offsetLocation(0.0f, this.f2290g0);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f2276O;
            EdgeEffect edgeEffect2 = this.f2275N;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                n(motionEvent);
                                this.f2277P = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f2287d0));
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.f2277P = (int) motionEvent.getY(actionIndex);
                            this.f2287d0 = motionEvent.getPointerId(actionIndex);
                        }
                    } else {
                        if (this.f2281T && getChildCount() > 0 && this.f2274M.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                            postInvalidateOnAnimation();
                        }
                        this.f2287d0 = -1;
                        this.f2281T = false;
                        VelocityTracker velocityTracker = this.f2282U;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                            this.f2282U = null;
                        }
                        w(0);
                        this.f2275N.onRelease();
                        this.f2276O.onRelease();
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f2287d0);
                    if (findPointerIndex == -1) {
                        Log.e("NestedScrollView", "Invalid pointerId=" + this.f2287d0 + " in onTouchEvent");
                    } else {
                        int y3 = (int) motionEvent.getY(findPointerIndex);
                        int r10 = this.f2277P - y3;
                        float x3 = motionEvent.getX(findPointerIndex) / getWidth();
                        float height = r10 / getHeight();
                        if (A4.a(edgeEffect2) != 0.0f) {
                            float f4 = -A4.b(edgeEffect2, -height, x3);
                            if (A4.a(edgeEffect2) == 0.0f) {
                                edgeEffect2.onRelease();
                            }
                            f2 = f4;
                        } else if (A4.a(edgeEffect) != 0.0f) {
                            float b3 = A4.b(edgeEffect, height, 1.0f - x3);
                            if (A4.a(edgeEffect) == 0.0f) {
                                edgeEffect.onRelease();
                            }
                            f2 = b3;
                        }
                        int round = Math.round(f2 * getHeight());
                        if (round != 0) {
                            invalidate();
                        }
                        int r102 = r10 - round;
                        if (!this.f2281T && Math.abs(r102) > this.a0) {
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f2281T = true;
                            r102 = r102 > 0 ? r102 - this.a0 : r102 + this.a0;
                        }
                        if (this.f2281T) {
                            int r3 = r(r102, (int) motionEvent.getX(findPointerIndex), 0, false);
                            this.f2277P = y3 - r3;
                            this.f2290g0 += r3;
                        }
                    }
                }
            } else {
                VelocityTracker velocityTracker2 = this.f2282U;
                velocityTracker2.computeCurrentVelocity(1000, this.f2286c0);
                int yVelocity = (int) velocityTracker2.getYVelocity(this.f2287d0);
                if (Math.abs(yVelocity) >= this.f2285b0) {
                    if (A4.a(edgeEffect2) != 0.0f) {
                        if (s(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            i(-yVelocity);
                        }
                    } else if (A4.a(edgeEffect) != 0.0f) {
                        int r12 = -yVelocity;
                        if (s(edgeEffect, r12)) {
                            edgeEffect.onAbsorb(r12);
                        } else {
                            i(r12);
                        }
                    } else {
                        int r13 = -yVelocity;
                        float f5 = r13;
                        if (!this.f2293k0.b(0.0f, f5)) {
                            dispatchNestedFling(0.0f, f5, true);
                            i(r13);
                        }
                    }
                } else if (this.f2274M.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f2287d0 = -1;
                this.f2281T = false;
                VelocityTracker velocityTracker3 = this.f2282U;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f2282U = null;
                }
                w(0);
                this.f2275N.onRelease();
                this.f2276O.onRelease();
            }
        } else if (getChildCount() == 0) {
            return false;
        } else {
            if (this.f2281T && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f2274M.isFinished()) {
                this.f2274M.abortAnimation();
                w(1);
            }
            int pointerId = motionEvent.getPointerId(0);
            this.f2277P = (int) motionEvent.getY();
            this.f2287d0 = pointerId;
            u(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f2282U;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public final void p(int r6) {
        boolean z3;
        if (r6 == 130) {
            z3 = true;
        } else {
            z3 = false;
        }
        int height = getHeight();
        Rect rect = this.f2273L;
        if (z3) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int r02 = rect.top;
        int r3 = height + r02;
        rect.bottom = r3;
        q(r6, r02, r3);
    }

    public final boolean q(int r18, int r19, int r20) {
        boolean z3;
        int r22;
        boolean z4;
        boolean z5;
        boolean z6;
        int height = getHeight();
        int scrollY = getScrollY();
        int r4 = height + scrollY;
        if (r18 == 33) {
            z3 = true;
        } else {
            z3 = false;
        }
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z7 = false;
        for (int r12 = 0; r12 < size; r12++) {
            View view2 = focusables.get(r12);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (r19 < bottom && top < r20) {
                if (r19 < top && bottom < r20) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (view == null) {
                    view = view2;
                    z7 = z5;
                } else {
                    if ((z3 && top < view.getTop()) || (!z3 && bottom > view.getBottom())) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (z7) {
                        if (z5) {
                            if (!z6) {
                            }
                            view = view2;
                        }
                    } else if (z5) {
                        view = view2;
                        z7 = true;
                    } else {
                        if (!z6) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (r19 >= scrollY && r20 <= r4) {
            z4 = false;
        } else {
            if (z3) {
                r22 = r19 - scrollY;
            } else {
                r22 = r20 - r4;
            }
            r(r22, 0, 1, true);
            z4 = true;
        }
        if (view != findFocus()) {
            view.requestFocus(r18);
        }
        return z4;
    }

    public final int r(int r21, int r22, int r23, boolean z3) {
        int r15;
        int r16;
        boolean z4;
        boolean z5;
        boolean z6;
        VelocityTracker velocityTracker;
        if (r23 == 1) {
            u(2, r23);
        }
        boolean c4 = this.f2293k0.c(0, r21, this.f2289f0, this.f2288e0, r23);
        int[] r13 = this.f2289f0;
        int[] r14 = this.f2288e0;
        if (c4) {
            r15 = r21 - r13[1];
            r16 = r14[1];
        } else {
            r15 = r21;
            r16 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        if ((overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (o(r15, 0, scrollY, scrollRange) && !this.f2293k0.f(r23)) {
            z5 = true;
        } else {
            z5 = false;
        }
        int scrollY2 = getScrollY() - scrollY;
        r13[1] = 0;
        this.f2293k0.d(0, scrollY2, 0, r15 - scrollY2, this.f2288e0, r23, r13);
        int r162 = r16 + r14[1];
        int r152 = r15 - r13[1];
        int r9 = scrollY + r152;
        EdgeEffect edgeEffect = this.f2276O;
        EdgeEffect edgeEffect2 = this.f2275N;
        if (r9 < 0) {
            if (z4) {
                A4.b(edgeEffect2, (-r152) / getHeight(), r22 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (r9 > scrollRange && z4) {
            A4.b(edgeEffect, r152 / getHeight(), 1.0f - (r22 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z6 = z5;
        } else {
            postInvalidateOnAnimation();
            z6 = false;
        }
        if (z6 && r23 == 0 && (velocityTracker = this.f2282U) != null) {
            velocityTracker.clear();
        }
        if (r23 == 1) {
            w(r23);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return r162;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.f2278Q) {
            Rect rect = this.f2273L;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h3 = h(rect);
            if (h3 != 0) {
                scrollBy(0, h3);
            }
        } else {
            this.f2280S = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        boolean z4;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h3 = h(rect);
        if (h3 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (z3) {
                scrollBy(0, h3);
            } else {
                t(0, h3, false);
            }
        }
        return z4;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        VelocityTracker velocityTracker;
        if (z3 && (velocityTracker = this.f2282U) != null) {
            velocityTracker.recycle();
            this.f2282U = null;
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f2278Q = true;
        super.requestLayout();
    }

    public final boolean s(EdgeEffect edgeEffect, int r12) {
        if (r12 > 0) {
            return true;
        }
        float a4 = A4.a(edgeEffect) * getHeight();
        float f2 = this.f2271J * 0.015f;
        double log = Math.log((Math.abs(-r12) * 0.35f) / f2);
        double d4 = f2269n0;
        if (((float) (Math.exp((d4 / (d4 - 1.0d)) * log) * f2)) < a4) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void scrollTo(int r8, int r9) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width < width2 && r8 >= 0) {
                if (width + r8 > width2) {
                    r8 = width2 - width;
                }
            } else {
                r8 = 0;
            }
            if (height < height2 && r9 >= 0) {
                if (height + r9 > height2) {
                    r9 = height2 - height;
                }
            } else {
                r9 = 0;
            }
            if (r8 != getScrollX() || r9 != getScrollY()) {
                super.scrollTo(r8, r9);
            }
        }
    }

    public void setFillViewport(boolean z3) {
        if (z3 != this.f2283V) {
            this.f2283V = z3;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z3) {
        C0260f c0260f = this.f2293k0;
        if (c0260f.f3190d) {
            Field field = w.f3200a;
            AbstractC0268o.z(c0260f.f3189c);
        }
        c0260f.f3190d = z3;
    }

    public void setSmoothScrollingEnabled(boolean z3) {
        this.f2284W = z3;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int r3) {
        return this.f2293k0.g(r3, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final void t(int r12, int r13, boolean z3) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f2272K > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int scrollY = getScrollY();
            OverScroller overScroller = this.f2274M;
            int scrollX = getScrollX();
            overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(r13 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, 250);
            if (z3) {
                u(2, 1);
            } else {
                w(1);
            }
            this.f2291h0 = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.f2274M.isFinished()) {
                this.f2274M.abortAnimation();
                w(1);
            }
            scrollBy(r12, r13);
        }
        this.f2272K = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void u(int r22, int r3) {
        this.f2293k0.g(2, r3);
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z3;
        EdgeEffect edgeEffect = this.f2275N;
        if (A4.a(edgeEffect) != 0.0f) {
            A4.b(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z3 = true;
        } else {
            z3 = false;
        }
        EdgeEffect edgeEffect2 = this.f2276O;
        if (A4.a(edgeEffect2) != 0.0f) {
            A4.b(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z3;
    }

    public final void w(int r22) {
        this.f2293k0.h(r22);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int r3) {
        if (getChildCount() <= 0) {
            super.addView(view, r3);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int r3, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, r3, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(InterfaceC0323j interfaceC0323j) {
    }
}
