package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import d2.C0235c;
import o.i;
import o.j;
import o.k;
import p.C0408f;
import p.C0410h;
import p.C0412k;
import p.E;
import p.F;
import p.InterfaceC0411j;
import p.InterfaceC0413l;
import p.w0;

/* loaded from: classes.dex */
public class ActionMenuView extends F implements i {

    /* renamed from: b0  reason: collision with root package name */
    public j f1965b0;

    /* renamed from: c0  reason: collision with root package name */
    public Context f1966c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f1967d0;

    /* renamed from: e0  reason: collision with root package name */
    public p.i f1968e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f1969f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f1970g0;

    /* renamed from: h0  reason: collision with root package name */
    public final int f1971h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f1972i0;
    public InterfaceC0413l j0;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f1971h0 = (int) (56.0f * f2);
        this.f1972i0 = (int) (f2 * 4.0f);
        this.f1966c0 = context;
        this.f1967d0 = 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.E, p.k] */
    public static C0412k h() {
        ?? e4 = new E(-2);
        e4.f4649c = false;
        e4.f4512b = 16;
        return e4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [p.E, p.k] */
    public static C0412k i(ViewGroup.LayoutParams layoutParams) {
        C0412k c0412k;
        if (layoutParams != null) {
            if (layoutParams instanceof C0412k) {
                C0412k c0412k2 = (C0412k) layoutParams;
                ?? e4 = new E(c0412k2);
                e4.f4649c = c0412k2.f4649c;
                c0412k = e4;
            } else {
                c0412k = new E(layoutParams);
            }
            if (c0412k.f4512b <= 0) {
                c0412k.f4512b = 16;
            }
            return c0412k;
        }
        return h();
    }

    @Override // o.i
    public final boolean a(k kVar) {
        return this.f1965b0.p(kVar, null, 0);
    }

    @Override // p.F, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0412k;
    }

    @Override // p.F
    public final /* bridge */ /* synthetic */ E d() {
        return h();
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // p.F
    public final E e(AttributeSet attributeSet) {
        return new E(getContext(), attributeSet);
    }

    @Override // p.F
    public final /* bridge */ /* synthetic */ E f(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    @Override // p.F, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // p.F, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [o.o, java.lang.Object] */
    public Menu getMenu() {
        if (this.f1965b0 == null) {
            Context context = getContext();
            j jVar = new j(context);
            this.f1965b0 = jVar;
            jVar.f4412e = new C0235c(11, this);
            p.i iVar = new p.i(context);
            this.f1968e0 = iVar;
            iVar.f4631T = true;
            iVar.f4632U = true;
            iVar.f4625N = new Object();
            this.f1965b0.b(iVar, this.f1966c0);
            p.i iVar2 = this.f1968e0;
            iVar2.f4627P = this;
            this.f1965b0 = iVar2.f4623L;
        }
        return this.f1965b0;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        p.i iVar = this.f1968e0;
        C0410h c0410h = iVar.f4628Q;
        if (c0410h != null) {
            return c0410h.getDrawable();
        }
        if (iVar.f4630S) {
            return iVar.f4629R;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f1967d0;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean j(int r5) {
        boolean z3 = false;
        if (r5 == 0) {
            return false;
        }
        View childAt = getChildAt(r5 - 1);
        View childAt2 = getChildAt(r5);
        if (r5 < getChildCount() && (childAt instanceof InterfaceC0411j)) {
            z3 = ((InterfaceC0411j) childAt).a();
        }
        if (r5 > 0 && (childAt2 instanceof InterfaceC0411j)) {
            return z3 | ((InterfaceC0411j) childAt2).c();
        }
        return z3;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        p.i iVar = this.f1968e0;
        if (iVar != null) {
            iVar.f();
            C0408f c0408f = this.f1968e0.a0;
            if (c0408f != null && c0408f.b()) {
                this.f1968e0.g();
                this.f1968e0.h();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p.i iVar = this.f1968e0;
        if (iVar != null) {
            iVar.g();
            C0408f c0408f = iVar.f4638b0;
            if (c0408f != null && c0408f.b()) {
                c0408f.f4463i.dismiss();
            }
        }
    }

    @Override // p.F, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int r19, int r20, int r21, int r22) {
        int r3;
        int width;
        int r15;
        if (!this.f1969f0) {
            super.onLayout(z3, r19, r20, r21, r22);
            return;
        }
        int childCount = getChildCount();
        int r23 = (r22 - r20) / 2;
        int dividerWidth = getDividerWidth();
        int r4 = r21 - r19;
        int paddingRight = (r4 - getPaddingRight()) - getPaddingLeft();
        boolean a4 = w0.a(this);
        int r9 = 0;
        int r10 = 0;
        for (int r8 = 0; r8 < childCount; r8++) {
            View childAt = getChildAt(r8);
            if (childAt.getVisibility() != 8) {
                C0412k c0412k = (C0412k) childAt.getLayoutParams();
                if (c0412k.f4649c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (j(r8)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a4) {
                        r15 = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0412k).leftMargin;
                        width = r15 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0412k).rightMargin;
                        r15 = width - measuredWidth;
                    }
                    int r7 = r23 - (measuredHeight / 2);
                    childAt.layout(r15, r7, width, measuredHeight + r7);
                    paddingRight -= measuredWidth;
                    r9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0412k).leftMargin) + ((ViewGroup.MarginLayoutParams) c0412k).rightMargin;
                    j(r8);
                    r10++;
                }
            }
        }
        if (childCount == 1 && r9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int r42 = (r4 / 2) - (measuredWidth2 / 2);
            int r24 = r23 - (measuredHeight2 / 2);
            childAt2.layout(r42, r24, measuredWidth2 + r42, measuredHeight2 + r24);
            return;
        }
        int r102 = r10 - (r9 ^ 1);
        if (r102 > 0) {
            r3 = paddingRight / r102;
        } else {
            r3 = 0;
        }
        int max = Math.max(0, r3);
        if (a4) {
            int width2 = getWidth() - getPaddingRight();
            for (int r72 = 0; r72 < childCount; r72++) {
                View childAt3 = getChildAt(r72);
                C0412k c0412k2 = (C0412k) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0412k2.f4649c) {
                    int r5 = width2 - ((ViewGroup.MarginLayoutParams) c0412k2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int r103 = r23 - (measuredHeight3 / 2);
                    childAt3.layout(r5 - measuredWidth3, r103, r5, measuredHeight3 + r103);
                    width2 = r5 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) c0412k2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int r73 = 0; r73 < childCount; r73++) {
            View childAt4 = getChildAt(r73);
            C0412k c0412k3 = (C0412k) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0412k3.f4649c) {
                int r52 = paddingLeft + ((ViewGroup.MarginLayoutParams) c0412k3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int r104 = r23 - (measuredHeight4 / 2);
                childAt4.layout(r52, r104, r52 + measuredWidth4, measuredHeight4 + r104);
                paddingLeft = measuredWidth4 + ((ViewGroup.MarginLayoutParams) c0412k3).rightMargin + max + r52;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v31 */
    @Override // p.F, android.view.View
    public final void onMeasure(int r32, int r33) {
        boolean z3;
        int r5;
        boolean z4;
        boolean z5;
        boolean z6;
        int r3;
        boolean z7;
        int r6;
        int r22;
        int r62;
        int r63;
        ?? r4;
        boolean z8;
        int r64;
        int r23;
        int r21;
        ActionMenuItemView actionMenuItemView;
        boolean z9;
        int r9;
        boolean z10;
        j jVar;
        boolean z11 = this.f1969f0;
        if (View.MeasureSpec.getMode(r32) == 1073741824) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f1969f0 = z3;
        if (z11 != z3) {
            this.f1970g0 = 0;
        }
        int size = View.MeasureSpec.getSize(r32);
        if (this.f1969f0 && (jVar = this.f1965b0) != null && size != this.f1970g0) {
            this.f1970g0 = size;
            jVar.o(true);
        }
        int childCount = getChildCount();
        if (this.f1969f0 && childCount > 0) {
            int mode = View.MeasureSpec.getMode(r33);
            int size2 = View.MeasureSpec.getSize(r32);
            int size3 = View.MeasureSpec.getSize(r33);
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(r33, paddingBottom, -2);
            int r24 = size2 - paddingRight;
            int r8 = this.f1971h0;
            int r10 = r24 / r8;
            int r11 = r24 % r8;
            if (r10 == 0) {
                setMeasuredDimension(r24, 0);
                return;
            }
            int r112 = (r11 / r10) + r8;
            int childCount2 = getChildCount();
            int r42 = 0;
            int r12 = 0;
            int r13 = 0;
            int r14 = 0;
            boolean z12 = false;
            long j3 = 0;
            int r18 = 0;
            while (true) {
                r5 = this.f1972i0;
                if (r14 >= childCount2) {
                    break;
                }
                View childAt = getChildAt(r14);
                int r19 = size3;
                int r20 = r24;
                if (childAt.getVisibility() == 8) {
                    r23 = mode;
                    r21 = paddingBottom;
                } else {
                    boolean z13 = childAt instanceof ActionMenuItemView;
                    int r122 = r12 + 1;
                    if (z13) {
                        childAt.setPadding(r5, 0, r5, 0);
                    }
                    C0412k c0412k = (C0412k) childAt.getLayoutParams();
                    c0412k.f4653h = false;
                    c0412k.f4651e = 0;
                    c0412k.f4650d = 0;
                    c0412k.f4652f = false;
                    ((ViewGroup.MarginLayoutParams) c0412k).leftMargin = 0;
                    ((ViewGroup.MarginLayoutParams) c0412k).rightMargin = 0;
                    if (z13 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText())) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    c0412k.g = z8;
                    if (c0412k.f4649c) {
                        r64 = 1;
                    } else {
                        r64 = r10;
                    }
                    C0412k c0412k2 = (C0412k) childAt.getLayoutParams();
                    r23 = mode;
                    r21 = paddingBottom;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                    if (z13) {
                        actionMenuItemView = (ActionMenuItemView) childAt;
                    } else {
                        actionMenuItemView = null;
                    }
                    if (actionMenuItemView != null && !TextUtils.isEmpty(actionMenuItemView.getText())) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (r64 > 0 && (!z9 || r64 >= 2)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(r64 * r112, Integer.MIN_VALUE), makeMeasureSpec);
                        int measuredWidth = childAt.getMeasuredWidth();
                        r9 = measuredWidth / r112;
                        if (measuredWidth % r112 != 0) {
                            r9++;
                        }
                        if (z9 && r9 < 2) {
                            r9 = 2;
                        }
                    } else {
                        r9 = 0;
                    }
                    if (!c0412k2.f4649c && z9) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    c0412k2.f4652f = z10;
                    c0412k2.f4650d = r9;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(r9 * r112, 1073741824), makeMeasureSpec);
                    r13 = Math.max(r13, r9);
                    if (c0412k.f4652f) {
                        r18++;
                    }
                    if (c0412k.f4649c) {
                        z12 = true;
                    }
                    r10 -= r9;
                    r42 = Math.max(r42, childAt.getMeasuredHeight());
                    if (r9 == 1) {
                        j3 |= 1 << r14;
                    }
                    r12 = r122;
                }
                r14++;
                size3 = r19;
                r24 = r20;
                paddingBottom = r21;
                mode = r23;
            }
            int r232 = mode;
            int r202 = r24;
            int r192 = size3;
            if (z12 && r12 == 2) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z14 = false;
            while (r18 > 0 && r10 > 0) {
                int r34 = Integer.MAX_VALUE;
                int r65 = 0;
                int r92 = 0;
                long j4 = 0;
                while (r92 < childCount2) {
                    C0412k c0412k3 = (C0412k) getChildAt(r92).getLayoutParams();
                    boolean z15 = z14;
                    if (c0412k3.f4652f) {
                        int r25 = c0412k3.f4650d;
                        if (r25 < r34) {
                            j4 = 1 << r92;
                            r34 = r25;
                            r65 = 1;
                        } else if (r25 == r34) {
                            j4 |= 1 << r92;
                            r65++;
                        }
                    }
                    r92++;
                    z14 = z15;
                }
                z5 = z14;
                j3 |= j4;
                if (r65 > r10) {
                    break;
                }
                int r35 = r34 + 1;
                int r26 = 0;
                while (r26 < childCount2) {
                    View childAt2 = getChildAt(r26);
                    C0412k c0412k4 = (C0412k) childAt2.getLayoutParams();
                    int r27 = r42;
                    int r142 = childMeasureSpec;
                    int r28 = childCount2;
                    long j5 = 1 << r26;
                    if ((j4 & j5) == 0) {
                        if (c0412k4.f4650d == r35) {
                            j3 |= j5;
                        }
                    } else {
                        if (z4 && c0412k4.g) {
                            r4 = 1;
                            r4 = 1;
                            if (r10 == 1) {
                                childAt2.setPadding(r5 + r112, 0, r5, 0);
                            }
                        } else {
                            r4 = 1;
                        }
                        c0412k4.f4650d += r4;
                        c0412k4.f4653h = r4;
                        r10--;
                    }
                    r26++;
                    childMeasureSpec = r142;
                    r42 = r27;
                    childCount2 = r28;
                }
                z14 = true;
            }
            z5 = z14;
            int r272 = r42;
            int r143 = childMeasureSpec;
            int r282 = childCount2;
            if (!z12 && r12 == 1) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (r10 <= 0 || j3 == 0 || (r10 >= r12 - 1 && !z6 && r13 <= 1)) {
                r3 = r282;
                z7 = z5;
            } else {
                float bitCount = Long.bitCount(j3);
                if (!z6) {
                    if ((j3 & 1) != 0 && !((C0412k) getChildAt(0).getLayoutParams()).g) {
                        bitCount -= 0.5f;
                    }
                    int r82 = r282 - 1;
                    if ((j3 & (1 << r82)) != 0 && !((C0412k) getChildAt(r82).getLayoutParams()).g) {
                        bitCount -= 0.5f;
                    }
                }
                if (bitCount > 0.0f) {
                    r63 = (int) ((r10 * r112) / bitCount);
                } else {
                    r63 = 0;
                }
                boolean z16 = z5;
                r3 = r282;
                for (int r29 = 0; r29 < r3; r29++) {
                    if ((j3 & (1 << r29)) != 0) {
                        View childAt3 = getChildAt(r29);
                        C0412k c0412k5 = (C0412k) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            c0412k5.f4651e = r63;
                            c0412k5.f4653h = true;
                            if (r29 == 0 && !c0412k5.g) {
                                ((ViewGroup.MarginLayoutParams) c0412k5).leftMargin = (-r63) / 2;
                            }
                            z16 = true;
                        } else {
                            if (c0412k5.f4649c) {
                                c0412k5.f4651e = r63;
                                c0412k5.f4653h = true;
                                ((ViewGroup.MarginLayoutParams) c0412k5).rightMargin = (-r63) / 2;
                                z16 = true;
                            } else {
                                if (r29 != 0) {
                                    ((ViewGroup.MarginLayoutParams) c0412k5).leftMargin = r63 / 2;
                                }
                                if (r29 != r3 - 1) {
                                    ((ViewGroup.MarginLayoutParams) c0412k5).rightMargin = r63 / 2;
                                }
                            }
                        }
                    }
                }
                z7 = z16;
            }
            if (z7) {
                int r15 = 0;
                while (r15 < r3) {
                    View childAt4 = getChildAt(r15);
                    C0412k c0412k6 = (C0412k) childAt4.getLayoutParams();
                    if (!c0412k6.f4653h) {
                        r62 = r143;
                    } else {
                        r62 = r143;
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0412k6.f4650d * r112) + c0412k6.f4651e, 1073741824), r62);
                    }
                    r15++;
                    r143 = r62;
                }
            }
            if (r232 != 1073741824) {
                r22 = r202;
                r6 = r272;
            } else {
                r6 = r192;
                r22 = r202;
            }
            setMeasuredDimension(r22, r6);
            return;
        }
        for (int r66 = 0; r66 < childCount; r66++) {
            C0412k c0412k7 = (C0412k) getChildAt(r66).getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c0412k7).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) c0412k7).leftMargin = 0;
        }
        super.onMeasure(r32, r33);
    }

    public void setExpandedActionViewsExclusive(boolean z3) {
        this.f1968e0.f4636Y = z3;
    }

    public void setOnMenuItemClickListener(InterfaceC0413l interfaceC0413l) {
        this.j0 = interfaceC0413l;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        p.i iVar = this.f1968e0;
        C0410h c0410h = iVar.f4628Q;
        if (c0410h != null) {
            c0410h.setImageDrawable(drawable);
            return;
        }
        iVar.f4630S = true;
        iVar.f4629R = drawable;
    }

    public void setOverflowReserved(boolean z3) {
    }

    public void setPopupTheme(int r3) {
        if (this.f1967d0 != r3) {
            this.f1967d0 = r3;
            if (r3 == 0) {
                this.f1966c0 = getContext();
            } else {
                this.f1966c0 = new ContextThemeWrapper(getContext(), r3);
            }
        }
    }

    public void setPresenter(p.i iVar) {
        this.f1968e0 = iVar;
        iVar.f4627P = this;
        this.f1965b0 = iVar.f4623L;
    }

    @Override // p.F, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new E(getContext(), attributeSet);
    }
}
