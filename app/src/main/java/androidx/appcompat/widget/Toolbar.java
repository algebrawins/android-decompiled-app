package androidx.appcompat.widget;

import A0.C0001b;
import A0.RunnableC0004e;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.catering_inventory.R;
import f0.w;
import java.lang.reflect.Field;
import java.util.ArrayList;
import k0.C0322i;
import m0.AbstractC0351b;
import n.C0357d;
import o.j;
import o.k;
import p.C0408f;
import p.C0417p;
import p.C0418q;
import p.C0421u;
import p.InterfaceC0425y;
import p.S;
import p.i;
import p.l0;
import p.m0;
import p.n0;
import p.o0;
import p.p0;
import p.q0;
import p.w0;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: J  reason: collision with root package name */
    public ActionMenuView f2059J;

    /* renamed from: K  reason: collision with root package name */
    public C0421u f2060K;

    /* renamed from: L  reason: collision with root package name */
    public C0421u f2061L;

    /* renamed from: M  reason: collision with root package name */
    public C0417p f2062M;

    /* renamed from: N  reason: collision with root package name */
    public C0418q f2063N;

    /* renamed from: O  reason: collision with root package name */
    public final Drawable f2064O;

    /* renamed from: P  reason: collision with root package name */
    public final CharSequence f2065P;

    /* renamed from: Q  reason: collision with root package name */
    public C0417p f2066Q;

    /* renamed from: R  reason: collision with root package name */
    public View f2067R;

    /* renamed from: S  reason: collision with root package name */
    public Context f2068S;

    /* renamed from: T  reason: collision with root package name */
    public int f2069T;

    /* renamed from: U  reason: collision with root package name */
    public int f2070U;

    /* renamed from: V  reason: collision with root package name */
    public int f2071V;

    /* renamed from: W  reason: collision with root package name */
    public final int f2072W;
    public final int a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f2073b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f2074c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f2075d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f2076e0;

    /* renamed from: f0  reason: collision with root package name */
    public S f2077f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f2078g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f2079h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f2080i0;
    public CharSequence j0;

    /* renamed from: k0  reason: collision with root package name */
    public CharSequence f2081k0;

    /* renamed from: l0  reason: collision with root package name */
    public ColorStateList f2082l0;

    /* renamed from: m0  reason: collision with root package name */
    public ColorStateList f2083m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f2084n0;
    public boolean o0;

    /* renamed from: p0  reason: collision with root package name */
    public final ArrayList f2085p0;

    /* renamed from: q0  reason: collision with root package name */
    public final ArrayList f2086q0;

    /* renamed from: r0  reason: collision with root package name */
    public final int[] f2087r0;

    /* renamed from: s0  reason: collision with root package name */
    public final C0322i f2088s0;

    /* renamed from: t0  reason: collision with root package name */
    public q0 f2089t0;

    /* renamed from: u0  reason: collision with root package name */
    public m0 f2090u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f2091v0;
    public final RunnableC0004e w0;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f2080i0 = 8388627;
        this.f2085p0 = new ArrayList();
        this.f2086q0 = new ArrayList();
        this.f2087r0 = new int[2];
        this.f2088s0 = new C0322i(5, this);
        this.w0 = new RunnableC0004e(18, this);
        C0001b P3 = C0001b.P(getContext(), attributeSet, i.a.f3402t, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) P3.f84K;
        this.f2070U = typedArray.getResourceId(28, 0);
        this.f2071V = typedArray.getResourceId(19, 0);
        this.f2080i0 = typedArray.getInteger(0, 8388627);
        this.f2072W = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f2076e0 = dimensionPixelOffset;
        this.f2075d0 = dimensionPixelOffset;
        this.f2074c0 = dimensionPixelOffset;
        this.f2073b0 = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f2073b0 = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f2074c0 = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f2075d0 = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f2076e0 = dimensionPixelOffset5;
        }
        this.a0 = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        S s3 = this.f2077f0;
        s3.f4577h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            s3.f4575e = dimensionPixelSize;
            s3.f4571a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            s3.f4576f = dimensionPixelSize2;
            s3.f4572b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            s3.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f2078g0 = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f2079h0 = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f2064O = P3.E(4);
        this.f2065P = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f2068S = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable E3 = P3.E(16);
        if (E3 != null) {
            setNavigationIcon(E3);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable E4 = P3.E(11);
        if (E4 != null) {
            setLogo(E4);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(P3.D(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(P3.D(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        P3.S();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.n0, android.view.ViewGroup$MarginLayoutParams] */
    public static n0 g() {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.f4669b = 0;
        marginLayoutParams.f4668a = 8388627;
        return marginLayoutParams;
    }

    private MenuInflater getMenuInflater() {
        return new C0357d(getContext());
    }

    public static n0 h(ViewGroup.LayoutParams layoutParams) {
        boolean z3 = layoutParams instanceof n0;
        if (z3) {
            n0 n0Var = (n0) layoutParams;
            n0 n0Var2 = new n0(n0Var);
            n0Var2.f4669b = 0;
            n0Var2.f4669b = n0Var.f4669b;
            return n0Var2;
        } else if (z3) {
            n0 n0Var3 = new n0((n0) layoutParams);
            n0Var3.f4669b = 0;
            return n0Var3;
        } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            n0 n0Var4 = new n0(marginLayoutParams);
            n0Var4.f4669b = 0;
            ((ViewGroup.MarginLayoutParams) n0Var4).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) n0Var4).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) n0Var4).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) n0Var4).bottomMargin = marginLayoutParams.bottomMargin;
            return n0Var4;
        } else {
            n0 n0Var5 = new n0(layoutParams);
            n0Var5.f4669b = 0;
            return n0Var5;
        }
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int r8) {
        boolean z3;
        Field field = w.f3200a;
        if (getLayoutDirection() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(r8, getLayoutDirection());
        arrayList.clear();
        if (z3) {
            for (int r3 = childCount - 1; r3 >= 0; r3--) {
                View childAt = getChildAt(r3);
                n0 n0Var = (n0) childAt.getLayoutParams();
                if (n0Var.f4669b == 0 && r(childAt) && i(n0Var.f4668a) == absoluteGravity) {
                    arrayList.add(childAt);
                }
            }
            return;
        }
        for (int r22 = 0; r22 < childCount; r22++) {
            View childAt2 = getChildAt(r22);
            n0 n0Var2 = (n0) childAt2.getLayoutParams();
            if (n0Var2.f4669b == 0 && r(childAt2) && i(n0Var2.f4668a) == absoluteGravity) {
                arrayList.add(childAt2);
            }
        }
    }

    public final void b(View view, boolean z3) {
        n0 n0Var;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            n0Var = g();
        } else if (!checkLayoutParams(layoutParams)) {
            n0Var = h(layoutParams);
        } else {
            n0Var = (n0) layoutParams;
        }
        n0Var.f4669b = 1;
        if (z3 && this.f2067R != null) {
            view.setLayoutParams(n0Var);
            this.f2086q0.add(view);
            return;
        }
        addView(view, n0Var);
    }

    public final void c() {
        if (this.f2066Q == null) {
            C0417p c0417p = new C0417p(getContext());
            this.f2066Q = c0417p;
            c0417p.setImageDrawable(this.f2064O);
            this.f2066Q.setContentDescription(this.f2065P);
            n0 g = g();
            g.f4668a = (this.f2072W & 112) | 8388611;
            g.f4669b = 2;
            this.f2066Q.setLayoutParams(g);
            this.f2066Q.setOnClickListener(new l0(this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof n0)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [p.S, java.lang.Object] */
    public final void d() {
        if (this.f2077f0 == null) {
            ?? obj = new Object();
            obj.f4571a = 0;
            obj.f4572b = 0;
            obj.f4573c = Integer.MIN_VALUE;
            obj.f4574d = Integer.MIN_VALUE;
            obj.f4575e = 0;
            obj.f4576f = 0;
            obj.g = false;
            obj.f4577h = false;
            this.f2077f0 = obj;
        }
    }

    public final void e() {
        if (this.f2059J == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f2059J = actionMenuView;
            actionMenuView.setPopupTheme(this.f2069T);
            this.f2059J.setOnMenuItemClickListener(this.f2088s0);
            this.f2059J.getClass();
            n0 g = g();
            g.f4668a = (this.f2072W & 112) | 8388613;
            this.f2059J.setLayoutParams(g);
            b(this.f2059J, false);
        }
        ActionMenuView actionMenuView2 = this.f2059J;
        if (actionMenuView2.f1965b0 == null) {
            j jVar = (j) actionMenuView2.getMenu();
            if (this.f2090u0 == null) {
                this.f2090u0 = new m0(this);
            }
            this.f2059J.setExpandedActionViewsExclusive(true);
            jVar.b(this.f2090u0, this.f2068S);
        }
    }

    public final void f() {
        if (this.f2062M == null) {
            this.f2062M = new C0417p(getContext());
            n0 g = g();
            g.f4668a = (this.f2072W & 112) | 8388611;
            this.f2062M.setLayoutParams(g);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return h(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C0417p c0417p = this.f2066Q;
        if (c0417p != null) {
            return c0417p.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0417p c0417p = this.f2066Q;
        if (c0417p != null) {
            return c0417p.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        S s3 = this.f2077f0;
        if (s3 != null) {
            if (s3.g) {
                return s3.f4571a;
            }
            return s3.f4572b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int r02 = this.f2079h0;
        if (r02 == Integer.MIN_VALUE) {
            return getContentInsetEnd();
        }
        return r02;
    }

    public int getContentInsetLeft() {
        S s3 = this.f2077f0;
        if (s3 != null) {
            return s3.f4571a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        S s3 = this.f2077f0;
        if (s3 != null) {
            return s3.f4572b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        S s3 = this.f2077f0;
        if (s3 != null) {
            if (s3.g) {
                return s3.f4572b;
            }
            return s3.f4571a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int r02 = this.f2078g0;
        if (r02 == Integer.MIN_VALUE) {
            return getContentInsetStart();
        }
        return r02;
    }

    public int getCurrentContentInsetEnd() {
        j jVar;
        ActionMenuView actionMenuView = this.f2059J;
        if (actionMenuView != null && (jVar = actionMenuView.f1965b0) != null && jVar.hasVisibleItems()) {
            return Math.max(getContentInsetEnd(), Math.max(this.f2079h0, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        Field field = w.f3200a;
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        Field field = w.f3200a;
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f2078g0, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        C0418q c0418q = this.f2063N;
        if (c0418q != null) {
            return c0418q.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0418q c0418q = this.f2063N;
        if (c0418q != null) {
            return c0418q.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f2059J.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        C0417p c0417p = this.f2062M;
        if (c0417p != null) {
            return c0417p.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0417p c0417p = this.f2062M;
        if (c0417p != null) {
            return c0417p.getDrawable();
        }
        return null;
    }

    public i getOuterActionMenuPresenter() {
        return null;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f2059J.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f2068S;
    }

    public int getPopupTheme() {
        return this.f2069T;
    }

    public CharSequence getSubtitle() {
        return this.f2081k0;
    }

    public final TextView getSubtitleTextView() {
        return this.f2061L;
    }

    public CharSequence getTitle() {
        return this.j0;
    }

    public int getTitleMarginBottom() {
        return this.f2076e0;
    }

    public int getTitleMarginEnd() {
        return this.f2074c0;
    }

    public int getTitleMarginStart() {
        return this.f2073b0;
    }

    public int getTitleMarginTop() {
        return this.f2075d0;
    }

    public final TextView getTitleTextView() {
        return this.f2060K;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, p.q0] */
    public InterfaceC0425y getWrapper() {
        boolean z3;
        Drawable drawable;
        if (this.f2089t0 == null) {
            ?? obj = new Object();
            obj.f4689l = 0;
            obj.f4679a = this;
            obj.f4685h = getTitle();
            obj.f4686i = getSubtitle();
            if (obj.f4685h != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            obj.g = z3;
            obj.f4684f = getNavigationIcon();
            String str = null;
            C0001b P3 = C0001b.P(getContext(), null, i.a.f3384a, R.attr.actionBarStyle);
            obj.f4690m = P3.E(15);
            TypedArray typedArray = (TypedArray) P3.f84K;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                obj.g = true;
                obj.f4685h = text;
                if ((obj.f4680b & 8) != 0) {
                    obj.f4679a.setTitle(text);
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                obj.f4686i = text2;
                if ((obj.f4680b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable E3 = P3.E(20);
            if (E3 != null) {
                obj.f4683e = E3;
                obj.c();
            }
            Drawable E4 = P3.E(17);
            if (E4 != null) {
                obj.f4682d = E4;
                obj.c();
            }
            if (obj.f4684f == null && (drawable = obj.f4690m) != null) {
                obj.f4684f = drawable;
                int r4 = obj.f4680b & 4;
                Toolbar toolbar = obj.f4679a;
                if (r4 != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            obj.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View inflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = obj.f4681c;
                if (view != null && (obj.f4680b & 16) != 0) {
                    removeView(view);
                }
                obj.f4681c = inflate;
                if (inflate != null && (obj.f4680b & 16) != 0) {
                    addView(inflate);
                }
                obj.a(obj.f4680b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int max = Math.max(dimensionPixelOffset, 0);
                int max2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.f2077f0.a(max, max2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f2070U = resourceId2;
                C0421u c0421u = this.f2060K;
                if (c0421u != null) {
                    c0421u.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f2071V = resourceId3;
                C0421u c0421u2 = this.f2061L;
                if (c0421u2 != null) {
                    c0421u2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            P3.S();
            if (R.string.abc_action_bar_up_description != obj.f4689l) {
                obj.f4689l = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int r12 = obj.f4689l;
                    if (r12 != 0) {
                        str = getContext().getString(r12);
                    }
                    obj.f4687j = str;
                    obj.b();
                }
            }
            obj.f4687j = getNavigationContentDescription();
            setNavigationOnClickListener(new l0((q0) obj));
            this.f2089t0 = obj;
        }
        return this.f2089t0;
    }

    public final int i(int r5) {
        Field field = w.f3200a;
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(r5, layoutDirection) & 7;
        if (absoluteGravity != 1 && absoluteGravity != 3 && absoluteGravity != 5) {
            if (layoutDirection != 1) {
                return 3;
            }
            return 5;
        }
        return absoluteGravity;
    }

    public final int j(View view, int r8) {
        int r82;
        n0 n0Var = (n0) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (r8 > 0) {
            r82 = (measuredHeight - r8) / 2;
        } else {
            r82 = 0;
        }
        int r22 = n0Var.f4668a & 112;
        if (r22 != 16 && r22 != 48 && r22 != 80) {
            r22 = this.f2080i0 & 112;
        }
        if (r22 != 48) {
            if (r22 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int r4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int r5 = ((ViewGroup.MarginLayoutParams) n0Var).topMargin;
                if (r4 < r5) {
                    r4 = r5;
                } else {
                    int r3 = (((height - paddingBottom) - measuredHeight) - r4) - paddingTop;
                    int r7 = ((ViewGroup.MarginLayoutParams) n0Var).bottomMargin;
                    if (r3 < r7) {
                        r4 = Math.max(0, r4 - (r7 - r3));
                    }
                }
                return paddingTop + r4;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) n0Var).bottomMargin) - r82;
        }
        return getPaddingTop() - r82;
    }

    public final boolean m(View view) {
        if (view.getParent() != this && !this.f2086q0.contains(view)) {
            return false;
        }
        return true;
    }

    public final int n(View view, int r6, int r7, int[] r8) {
        n0 n0Var = (n0) view.getLayoutParams();
        int r12 = ((ViewGroup.MarginLayoutParams) n0Var).leftMargin - r8[0];
        int max = Math.max(0, r12) + r6;
        r8[0] = Math.max(0, -r12);
        int j3 = j(view, r7);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j3, max + measuredWidth, view.getMeasuredHeight() + j3);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) n0Var).rightMargin + max;
    }

    public final int o(View view, int r7, int r8, int[] r9) {
        n0 n0Var = (n0) view.getLayoutParams();
        int r12 = ((ViewGroup.MarginLayoutParams) n0Var).rightMargin - r9[1];
        int max = r7 - Math.max(0, r12);
        r9[1] = Math.max(0, -r12);
        int j3 = j(view, r8);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j3, max, view.getMeasuredHeight() + j3);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) n0Var).leftMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.w0);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.o0 = false;
        }
        if (!this.o0) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.o0 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.o0 = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x029b A[LOOP:0: B:106:0x0299->B:107:0x029b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02b8 A[LOOP:1: B:109:0x02b6->B:110:0x02b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02d6 A[LOOP:2: B:112:0x02d4->B:113:0x02d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0325 A[LOOP:3: B:121:0x0323->B:122:0x0325, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0222  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int r17, int r18) {
        int r12;
        int r11;
        int r122;
        int r13;
        int r6;
        int r123;
        int r15;
        boolean a4 = w0.a(this);
        int r8 = !a4 ? 1 : 0;
        int r9 = 0;
        if (r(this.f2062M)) {
            q(this.f2062M, r17, 0, r18, this.a0);
            r12 = k(this.f2062M) + this.f2062M.getMeasuredWidth();
            r11 = Math.max(0, l(this.f2062M) + this.f2062M.getMeasuredHeight());
            r122 = View.combineMeasuredStates(0, this.f2062M.getMeasuredState());
        } else {
            r12 = 0;
            r11 = 0;
            r122 = 0;
        }
        if (r(this.f2066Q)) {
            q(this.f2066Q, r17, 0, r18, this.a0);
            r12 = k(this.f2066Q) + this.f2066Q.getMeasuredWidth();
            r11 = Math.max(r11, l(this.f2066Q) + this.f2066Q.getMeasuredHeight());
            r122 = View.combineMeasuredStates(r122, this.f2066Q.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, r12);
        int max2 = Math.max(0, currentContentInsetStart - r12);
        int[] r132 = this.f2087r0;
        r132[a4 ? 1 : 0] = max2;
        if (r(this.f2059J)) {
            q(this.f2059J, r17, max, r18, this.a0);
            r13 = k(this.f2059J) + this.f2059J.getMeasuredWidth();
            r11 = Math.max(r11, l(this.f2059J) + this.f2059J.getMeasuredHeight());
            r122 = View.combineMeasuredStates(r122, this.f2059J.getMeasuredState());
        } else {
            r13 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, r13);
        r132[r8] = Math.max(0, currentContentInsetEnd - r13);
        if (r(this.f2067R)) {
            max3 += p(this.f2067R, r17, max3, r18, 0, r132);
            r11 = Math.max(r11, l(this.f2067R) + this.f2067R.getMeasuredHeight());
            r122 = View.combineMeasuredStates(r122, this.f2067R.getMeasuredState());
        }
        if (r(this.f2063N)) {
            max3 += p(this.f2063N, r17, max3, r18, 0, r132);
            r11 = Math.max(r11, l(this.f2063N) + this.f2063N.getMeasuredHeight());
            r122 = View.combineMeasuredStates(r122, this.f2063N.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int r14 = 0; r14 < childCount; r14++) {
            View childAt = getChildAt(r14);
            if (((n0) childAt.getLayoutParams()).f4669b == 0 && r(childAt)) {
                max3 += p(childAt, r17, max3, r18, 0, r132);
                r11 = Math.max(r11, l(childAt) + childAt.getMeasuredHeight());
                r122 = View.combineMeasuredStates(r122, childAt.getMeasuredState());
            }
        }
        int r82 = this.f2075d0 + this.f2076e0;
        int r142 = this.f2073b0 + this.f2074c0;
        if (r(this.f2060K)) {
            p(this.f2060K, r17, max3 + r142, r18, r82, r132);
            int k3 = k(this.f2060K) + this.f2060K.getMeasuredWidth();
            r15 = l(this.f2060K) + this.f2060K.getMeasuredHeight();
            r6 = View.combineMeasuredStates(r122, this.f2060K.getMeasuredState());
            r123 = k3;
        } else {
            r6 = r122;
            r123 = 0;
            r15 = 0;
        }
        if (r(this.f2061L)) {
            r123 = Math.max(r123, p(this.f2061L, r17, max3 + r142, r18, r15 + r82, r132));
            r15 += l(this.f2061L) + this.f2061L.getMeasuredHeight();
            r6 = View.combineMeasuredStates(r6, this.f2061L.getMeasuredState());
        }
        int max4 = Math.max(r11, r15);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + r123, getSuggestedMinimumWidth()), r17, (-16777216) & r6);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), r18, r6 << 16);
        if (this.f2091v0) {
            int childCount2 = getChildCount();
            for (int r3 = 0; r3 < childCount2; r3++) {
                View childAt2 = getChildAt(r3);
                if (!r(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, r9);
        }
        r9 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, r9);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        j jVar;
        MenuItem findItem;
        if (!(parcelable instanceof p0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p0 p0Var = (p0) parcelable;
        super.onRestoreInstanceState(p0Var.f4117a);
        ActionMenuView actionMenuView = this.f2059J;
        if (actionMenuView != null) {
            jVar = actionMenuView.f1965b0;
        } else {
            jVar = null;
        }
        int r12 = p0Var.f4675c;
        if (r12 != 0 && this.f2090u0 != null && jVar != null && (findItem = jVar.findItem(r12)) != null) {
            findItem.expandActionView();
        }
        if (p0Var.f4676d) {
            RunnableC0004e runnableC0004e = this.w0;
            removeCallbacks(runnableC0004e);
            post(runnableC0004e);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int r3) {
        super.onRtlPropertiesChanged(r3);
        d();
        S s3 = this.f2077f0;
        boolean z3 = true;
        if (r3 != 1) {
            z3 = false;
        }
        if (z3 != s3.g) {
            s3.g = z3;
            if (s3.f4577h) {
                if (z3) {
                    int r12 = s3.f4574d;
                    if (r12 == Integer.MIN_VALUE) {
                        r12 = s3.f4575e;
                    }
                    s3.f4571a = r12;
                    int r13 = s3.f4573c;
                    if (r13 == Integer.MIN_VALUE) {
                        r13 = s3.f4576f;
                    }
                    s3.f4572b = r13;
                    return;
                }
                int r14 = s3.f4573c;
                if (r14 == Integer.MIN_VALUE) {
                    r14 = s3.f4575e;
                }
                s3.f4571a = r14;
                int r15 = s3.f4574d;
                if (r15 == Integer.MIN_VALUE) {
                    r15 = s3.f4576f;
                }
                s3.f4572b = r15;
                return;
            }
            s3.f4571a = s3.f4575e;
            s3.f4572b = s3.f4576f;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, m0.b, p.p0] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z3;
        i iVar;
        C0408f c0408f;
        k kVar;
        ?? abstractC0351b = new AbstractC0351b(super.onSaveInstanceState());
        m0 m0Var = this.f2090u0;
        if (m0Var != null && (kVar = m0Var.f4660K) != null) {
            abstractC0351b.f4675c = kVar.f4429a;
        }
        ActionMenuView actionMenuView = this.f2059J;
        if (actionMenuView != null && (iVar = actionMenuView.f1968e0) != null && (c0408f = iVar.a0) != null && c0408f.b()) {
            z3 = true;
        } else {
            z3 = false;
        }
        abstractC0351b.f4676d = z3;
        return abstractC0351b;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2084n0 = false;
        }
        if (!this.f2084n0) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f2084n0 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f2084n0 = false;
        }
        return true;
    }

    public final int p(View view, int r9, int r10, int r11, int r12, int[] r13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int r14 = marginLayoutParams.leftMargin - r13[0];
        int r3 = marginLayoutParams.rightMargin - r13[1];
        int max = Math.max(0, r3) + Math.max(0, r14);
        r13[0] = Math.max(0, -r14);
        r13[1] = Math.max(0, -r3);
        view.measure(ViewGroup.getChildMeasureSpec(r9, getPaddingRight() + getPaddingLeft() + max + r10, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(r11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + r12, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void q(View view, int r5, int r6, int r7, int r8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(r5, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + r6, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(r7, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && r8 >= 0) {
            if (mode != 0) {
                r8 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), r8);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(r8, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean r(View view) {
        if (view != null && view.getParent() == this && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public void setCollapseContentDescription(int r22) {
        setCollapseContentDescription(r22 != 0 ? getContext().getText(r22) : null);
    }

    public void setCollapseIcon(int r22) {
        setCollapseIcon(j.b.c(getContext(), r22));
    }

    public void setCollapsible(boolean z3) {
        this.f2091v0 = z3;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int r22) {
        if (r22 < 0) {
            r22 = Integer.MIN_VALUE;
        }
        if (r22 != this.f2079h0) {
            this.f2079h0 = r22;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int r22) {
        if (r22 < 0) {
            r22 = Integer.MIN_VALUE;
        }
        if (r22 != this.f2078g0) {
            this.f2078g0 = r22;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int r22) {
        setLogo(j.b.c(getContext(), r22));
    }

    public void setLogoDescription(int r22) {
        setLogoDescription(getContext().getText(r22));
    }

    public void setNavigationContentDescription(int r22) {
        setNavigationContentDescription(r22 != 0 ? getContext().getText(r22) : null);
    }

    public void setNavigationIcon(int r22) {
        setNavigationIcon(j.b.c(getContext(), r22));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f2062M.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f2059J.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int r3) {
        if (this.f2069T != r3) {
            this.f2069T = r3;
            if (r3 == 0) {
                this.f2068S = getContext();
            } else {
                this.f2068S = new ContextThemeWrapper(getContext(), r3);
            }
        }
    }

    public void setSubtitle(int r22) {
        setSubtitle(getContext().getText(r22));
    }

    public void setSubtitleTextColor(int r12) {
        setSubtitleTextColor(ColorStateList.valueOf(r12));
    }

    public void setTitle(int r22) {
        setTitle(getContext().getText(r22));
    }

    public void setTitleMarginBottom(int r12) {
        this.f2076e0 = r12;
        requestLayout();
    }

    public void setTitleMarginEnd(int r12) {
        this.f2074c0 = r12;
        requestLayout();
    }

    public void setTitleMarginStart(int r12) {
        this.f2073b0 = r12;
        requestLayout();
    }

    public void setTitleMarginTop(int r12) {
        this.f2075d0 = r12;
        requestLayout();
    }

    public void setTitleTextColor(int r12) {
        setTitleTextColor(ColorStateList.valueOf(r12));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.n0, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f4668a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.a.f3385b);
        marginLayoutParams.f4668a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        marginLayoutParams.f4669b = 0;
        return marginLayoutParams;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C0417p c0417p = this.f2066Q;
        if (c0417p != null) {
            c0417p.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f2066Q.setImageDrawable(drawable);
            return;
        }
        C0417p c0417p = this.f2066Q;
        if (c0417p != null) {
            c0417p.setImageDrawable(this.f2064O);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f2063N == null) {
                this.f2063N = new C0418q(getContext(), 0);
            }
            if (!m(this.f2063N)) {
                b(this.f2063N, true);
            }
        } else {
            C0418q c0418q = this.f2063N;
            if (c0418q != null && m(c0418q)) {
                removeView(this.f2063N);
                this.f2086q0.remove(this.f2063N);
            }
        }
        C0418q c0418q2 = this.f2063N;
        if (c0418q2 != null) {
            c0418q2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f2063N == null) {
            this.f2063N = new C0418q(getContext(), 0);
        }
        C0418q c0418q = this.f2063N;
        if (c0418q != null) {
            c0418q.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        C0417p c0417p = this.f2062M;
        if (c0417p != null) {
            c0417p.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!m(this.f2062M)) {
                b(this.f2062M, true);
            }
        } else {
            C0417p c0417p = this.f2062M;
            if (c0417p != null && m(c0417p)) {
                removeView(this.f2062M);
                this.f2086q0.remove(this.f2062M);
            }
        }
        C0417p c0417p2 = this.f2062M;
        if (c0417p2 != null) {
            c0417p2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f2061L == null) {
                Context context = getContext();
                C0421u c0421u = new C0421u(context, null);
                this.f2061L = c0421u;
                c0421u.setSingleLine();
                this.f2061L.setEllipsize(TextUtils.TruncateAt.END);
                int r12 = this.f2071V;
                if (r12 != 0) {
                    this.f2061L.setTextAppearance(context, r12);
                }
                ColorStateList colorStateList = this.f2083m0;
                if (colorStateList != null) {
                    this.f2061L.setTextColor(colorStateList);
                }
            }
            if (!m(this.f2061L)) {
                b(this.f2061L, true);
            }
        } else {
            C0421u c0421u2 = this.f2061L;
            if (c0421u2 != null && m(c0421u2)) {
                removeView(this.f2061L);
                this.f2086q0.remove(this.f2061L);
            }
        }
        C0421u c0421u3 = this.f2061L;
        if (c0421u3 != null) {
            c0421u3.setText(charSequence);
        }
        this.f2081k0 = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f2083m0 = colorStateList;
        C0421u c0421u = this.f2061L;
        if (c0421u != null) {
            c0421u.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f2060K == null) {
                Context context = getContext();
                C0421u c0421u = new C0421u(context, null);
                this.f2060K = c0421u;
                c0421u.setSingleLine();
                this.f2060K.setEllipsize(TextUtils.TruncateAt.END);
                int r12 = this.f2070U;
                if (r12 != 0) {
                    this.f2060K.setTextAppearance(context, r12);
                }
                ColorStateList colorStateList = this.f2082l0;
                if (colorStateList != null) {
                    this.f2060K.setTextColor(colorStateList);
                }
            }
            if (!m(this.f2060K)) {
                b(this.f2060K, true);
            }
        } else {
            C0421u c0421u2 = this.f2060K;
            if (c0421u2 != null && m(c0421u2)) {
                removeView(this.f2060K);
                this.f2086q0.remove(this.f2060K);
            }
        }
        C0421u c0421u3 = this.f2060K;
        if (c0421u3 != null) {
            c0421u3.setText(charSequence);
        }
        this.j0 = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f2082l0 = colorStateList;
        C0421u c0421u = this.f2060K;
        if (c0421u != null) {
            c0421u.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(o0 o0Var) {
    }
}
