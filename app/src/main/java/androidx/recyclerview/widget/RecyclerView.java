package androidx.recyclerview.widget;

import A0.A;
import A0.AbstractC0019v;
import A0.B;
import A0.C;
import A0.C0001b;
import A0.C0002c;
import A0.C0009k;
import A0.D;
import A0.E;
import A0.F;
import A0.G;
import A0.I;
import A0.InterfaceC0020w;
import A0.J;
import A0.K;
import A0.L;
import A0.N;
import A0.RunnableC0004e;
import A0.RunnableC0011m;
import A0.W;
import A0.animation.InterpolatorC0018u;
import A0.i;
import A0.x;
import A0.y;
import A0.z;
import N2.g;
import O1.a;
import R.e;
import R.k;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import b0.h;
import c0.f;
import com.example.catering_inventory.R;
import f0.AbstractC0252A;
import f0.AbstractC0268o;
import f0.AbstractC0270q;
import f0.C0260f;
import f0.w;
import h1.C0287g;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import m0.AbstractC0351b;
import z0.AbstractC0958a;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: Q0  reason: collision with root package name */
    public static final int[] f2518Q0 = {16843830};

    /* renamed from: R0  reason: collision with root package name */
    public static final int[] f2519R0 = {16842987};

    /* renamed from: S0  reason: collision with root package name */
    public static final boolean f2520S0 = true;

    /* renamed from: T0  reason: collision with root package name */
    public static final Class[] f2521T0;

    /* renamed from: U0  reason: collision with root package name */
    public static final animation.InterpolatorC0018u f2522U0;

    /* renamed from: A0  reason: collision with root package name */
    public final float f2523A0;

    /* renamed from: B0  reason: collision with root package name */
    public final float f2524B0;

    /* renamed from: C0  reason: collision with root package name */
    public boolean f2525C0;

    /* renamed from: D0  reason: collision with root package name */
    public final L f2526D0;

    /* renamed from: E0  reason: collision with root package name */
    public RunnableC0011m f2527E0;

    /* renamed from: F0  reason: collision with root package name */
    public final C0009k f2528F0;

    /* renamed from: G0  reason: collision with root package name */
    public final J f2529G0;

    /* renamed from: H0  reason: collision with root package name */
    public ArrayList f2530H0;

    /* renamed from: I0  reason: collision with root package name */
    public final C0287g f2531I0;

    /* renamed from: J  reason: collision with root package name */
    public final F f2532J;
    public N J0;

    /* renamed from: K  reason: collision with root package name */
    public I f2533K;

    /* renamed from: K0  reason: collision with root package name */
    public C0260f f2534K0;

    /* renamed from: L  reason: collision with root package name */
    public final C0001b f2535L;

    /* renamed from: L0  reason: collision with root package name */
    public final int[] f2536L0;

    /* renamed from: M  reason: collision with root package name */
    public final C0001b f2537M;

    /* renamed from: M0  reason: collision with root package name */
    public final int[] f2538M0;

    /* renamed from: N  reason: collision with root package name */
    public final a f2539N;

    /* renamed from: N0  reason: collision with root package name */
    public final int[] f2540N0;

    /* renamed from: O  reason: collision with root package name */
    public boolean f2541O;

    /* renamed from: O0  reason: collision with root package name */
    public final ArrayList f2542O0;

    /* renamed from: P  reason: collision with root package name */
    public final Rect f2543P;
    public final RunnableC0004e P0;

    /* renamed from: Q  reason: collision with root package name */
    public final Rect f2544Q;

    /* renamed from: R  reason: collision with root package name */
    public z f2545R;

    /* renamed from: S  reason: collision with root package name */
    public final ArrayList f2546S;

    /* renamed from: T  reason: collision with root package name */
    public final ArrayList f2547T;

    /* renamed from: U  reason: collision with root package name */
    public i f2548U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f2549V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f2550W;
    public boolean a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f2551b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f2552c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f2553d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f2554e0;

    /* renamed from: f0  reason: collision with root package name */
    public final AccessibilityManager f2555f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f2556g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f2557h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f2558i0;
    public final int j0;

    /* renamed from: k0  reason: collision with root package name */
    public x f2559k0;

    /* renamed from: l0  reason: collision with root package name */
    public EdgeEffect f2560l0;

    /* renamed from: m0  reason: collision with root package name */
    public EdgeEffect f2561m0;

    /* renamed from: n0  reason: collision with root package name */
    public EdgeEffect f2562n0;
    public EdgeEffect o0;

    /* renamed from: p0  reason: collision with root package name */
    public y f2563p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f2564q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f2565r0;

    /* renamed from: s0  reason: collision with root package name */
    public VelocityTracker f2566s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f2567t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f2568u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f2569v0;
    public int w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f2570x0;

    /* renamed from: y0  reason: collision with root package name */
    public final int f2571y0;

    /* renamed from: z0  reason: collision with root package name */
    public final int f2572z0;

    /* JADX WARN: Type inference failed for: r0v2, types: [A0.u, java.lang.Object] */
    static {
        Class cls = Integer.TYPE;
        f2521T0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f2522U0 = new Object();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [O1.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [A0.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [A0.y, java.lang.Object, A0.d] */
    /* JADX WARN: Type inference failed for: r2v20, types: [A0.J, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21, types: [h1.g, java.lang.Object] */
    public RecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C0009k c0009k;
        float a4;
        float a5;
        boolean z3;
        int r22;
        TypedArray typedArray;
        char c4;
        char c5;
        ClassLoader classLoader;
        Object[] objArr;
        Constructor constructor;
        boolean z4 = true;
        this.f2532J = new F(this);
        ?? obj = new Object();
        new k();
        new e();
        this.f2539N = obj;
        this.f2543P = new Rect();
        this.f2544Q = new Rect();
        new RectF();
        this.f2546S = new ArrayList();
        this.f2547T = new ArrayList();
        this.f2551b0 = 0;
        this.f2556g0 = false;
        this.f2557h0 = false;
        this.f2558i0 = 0;
        this.j0 = 0;
        this.f2559k0 = new Object();
        ?? obj2 = new Object();
        obj2.f158a = null;
        obj2.f159b = new ArrayList();
        obj2.f160c = 250L;
        obj2.f161d = 250L;
        obj2.f90e = new ArrayList();
        obj2.f91f = new ArrayList();
        obj2.g = new ArrayList();
        obj2.f92h = new ArrayList();
        obj2.f93i = new ArrayList();
        obj2.f94j = new ArrayList();
        obj2.f95k = new ArrayList();
        obj2.f96l = new ArrayList();
        obj2.f97m = new ArrayList();
        obj2.f98n = new ArrayList();
        obj2.f99o = new ArrayList();
        this.f2563p0 = obj2;
        this.f2564q0 = 0;
        this.f2565r0 = -1;
        this.f2523A0 = Float.MIN_VALUE;
        this.f2524B0 = Float.MIN_VALUE;
        this.f2525C0 = true;
        this.f2526D0 = new L(this);
        if (f2520S0) {
            c0009k = new Object();
        } else {
            c0009k = null;
        }
        this.f2528F0 = c0009k;
        ?? obj3 = new Object();
        obj3.f43a = 0;
        obj3.f44b = false;
        obj3.f45c = false;
        obj3.f46d = false;
        obj3.f47e = false;
        this.f2529G0 = obj3;
        ?? obj4 = new Object();
        this.f2531I0 = obj4;
        this.f2536L0 = new int[2];
        this.f2538M0 = new int[2];
        this.f2540N0 = new int[2];
        this.f2542O0 = new ArrayList();
        this.P0 = new RunnableC0004e(1, this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2519R0, 0, 0);
            this.f2541O = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.f2541O = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2570x0 = viewConfiguration.getScaledTouchSlop();
        int r4 = Build.VERSION.SDK_INT;
        if (r4 >= 26) {
            Method method = AbstractC0252A.f3148a;
            a4 = f0.x.a(viewConfiguration);
        } else {
            a4 = AbstractC0252A.a(viewConfiguration, context);
        }
        this.f2523A0 = a4;
        if (r4 >= 26) {
            a5 = f0.x.b(viewConfiguration);
        } else {
            a5 = AbstractC0252A.a(viewConfiguration, context);
        }
        this.f2524B0 = a5;
        this.f2571y0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2572z0 = viewConfiguration.getScaledMaximumFlingVelocity();
        if (getOverScrollMode() == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        setWillNotDraw(z3);
        this.f2563p0.f158a = obj4;
        this.f2535L = new C0001b(new R1.a(this));
        this.f2537M = new C0001b(new A.a(4, this));
        Field field = w.f3200a;
        if (r4 >= 26) {
            r22 = AbstractC0270q.c(this);
        } else {
            r22 = 0;
        }
        if (r22 == 0 && r4 >= 26) {
            AbstractC0270q.m(this, 8);
        }
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.f2555f0 = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new N(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0958a.f6584a, 0, 0);
            String string = obtainStyledAttributes2.getString(7);
            if (obtainStyledAttributes2.getInt(1, -1) == -1) {
                setDescendantFocusability(262144);
            }
            if (obtainStyledAttributes2.getBoolean(2, false)) {
                StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes2.getDrawable(5);
                Drawable drawable = obtainStyledAttributes2.getDrawable(6);
                StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes2.getDrawable(3);
                Drawable drawable2 = obtainStyledAttributes2.getDrawable(4);
                if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                    Resources resources = getContext().getResources();
                    c4 = 3;
                    typedArray = obtainStyledAttributes2;
                    c5 = 2;
                    new i(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
                } else {
                    throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + h());
                }
            } else {
                typedArray = obtainStyledAttributes2;
                c4 = 3;
                c5 = 2;
            }
            typedArray.recycle();
            if (string != null) {
                String trim = string.trim();
                if (!trim.isEmpty()) {
                    if (trim.charAt(0) == '.') {
                        trim = context.getPackageName() + trim;
                    } else if (!trim.contains(".")) {
                        trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                    }
                    try {
                        if (isInEditMode()) {
                            classLoader = getClass().getClassLoader();
                        } else {
                            classLoader = context.getClassLoader();
                        }
                        Class<? extends U> asSubclass = classLoader.loadClass(trim).asSubclass(z.class);
                        try {
                            constructor = asSubclass.getConstructor(f2521T0);
                            Object[] objArr2 = new Object[4];
                            objArr2[0] = context;
                            objArr2[1] = attributeSet;
                            objArr2[c5] = 0;
                            objArr2[c4] = 0;
                            objArr = objArr2;
                        } catch (NoSuchMethodException e4) {
                            try {
                                objArr = null;
                                constructor = asSubclass.getConstructor(null);
                            } catch (NoSuchMethodException e5) {
                                e5.initCause(e4);
                                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e5);
                            }
                        }
                        constructor.setAccessible(true);
                        setLayoutManager((z) constructor.newInstance(objArr));
                    } catch (ClassCastException e6) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e6);
                    } catch (ClassNotFoundException e7) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e7);
                    } catch (IllegalAccessException e8) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e8);
                    } catch (InstantiationException e9) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e9);
                    } catch (InvocationTargetException e10) {
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e10);
                    }
                }
            }
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f2518Q0, 0, 0);
            z4 = obtainStyledAttributes3.getBoolean(0, true);
            obtainStyledAttributes3.recycle();
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z4);
    }

    private C0260f getScrollingChildHelper() {
        if (this.f2534K0 == null) {
            this.f2534K0 = new C0260f(this);
        }
        return this.f2534K0;
    }

    public static void j(View view) {
        if (view == null) {
            return;
        }
        ((A) view.getLayoutParams()).getClass();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int r3, int r4) {
        z zVar = this.f2545R;
        if (zVar != null) {
            zVar.getClass();
        }
        super.addFocusables(arrayList, r3, r4);
    }

    public final void b(String str) {
        if (this.f2558i0 > 0) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + h());
            }
            throw new IllegalStateException(str);
        } else if (this.j0 > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + h()));
        }
    }

    public final void c(int r3, int r4) {
        boolean z3;
        EdgeEffect edgeEffect = this.f2560l0;
        if (edgeEffect != null && !edgeEffect.isFinished() && r3 > 0) {
            this.f2560l0.onRelease();
            z3 = this.f2560l0.isFinished();
        } else {
            z3 = false;
        }
        EdgeEffect edgeEffect2 = this.f2562n0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && r3 < 0) {
            this.f2562n0.onRelease();
            z3 |= this.f2562n0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2561m0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && r4 > 0) {
            this.f2561m0.onRelease();
            z3 |= this.f2561m0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.o0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && r4 < 0) {
            this.o0.onRelease();
            z3 |= this.o0.isFinished();
        }
        if (z3) {
            Field field = w.f3200a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof A) && this.f2545R.d((A) layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        z zVar = this.f2545R;
        if (zVar == null || !zVar.b()) {
            return 0;
        }
        return this.f2545R.f(this.f2529G0);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        z zVar = this.f2545R;
        if (zVar != null && zVar.b()) {
            this.f2545R.g(this.f2529G0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        z zVar = this.f2545R;
        if (zVar == null || !zVar.b()) {
            return 0;
        }
        return this.f2545R.h(this.f2529G0);
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        z zVar = this.f2545R;
        if (zVar == null || !zVar.c()) {
            return 0;
        }
        return this.f2545R.i(this.f2529G0);
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        z zVar = this.f2545R;
        if (zVar != null && zVar.c()) {
            this.f2545R.j(this.f2529G0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        z zVar = this.f2545R;
        if (zVar == null || !zVar.c()) {
            return 0;
        }
        return this.f2545R.k(this.f2529G0);
    }

    public final void d() {
        C0001b c0001b = this.f2535L;
        if (this.a0 && !this.f2556g0) {
            if (((ArrayList) c0001b.f84K).size() > 0) {
                c0001b.getClass();
                if (((ArrayList) c0001b.f84K).size() > 0) {
                    int r02 = h.f2605a;
                    Trace.beginSection("RV FullInvalidate");
                    Log.e("RecyclerView", "No adapter attached; skipping layout");
                    Trace.endSection();
                    return;
                }
                return;
            }
            return;
        }
        int r03 = h.f2605a;
        Trace.beginSection("RV FullInvalidate");
        Log.e("RecyclerView", "No adapter attached; skipping layout");
        Trace.endSection();
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f4, boolean z3) {
        return getScrollingChildHelper().a(f2, f4, z3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f4) {
        return getScrollingChildHelper().b(f2, f4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int r7, int r8, int[] r9, int[] r10) {
        return getScrollingChildHelper().c(r7, r8, r9, r10, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int r9, int r10, int r11, int r12, int[] r13) {
        return getScrollingChildHelper().d(r9, r10, r11, r12, r13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z3;
        int r6;
        boolean z4;
        boolean z5;
        int r4;
        boolean z6 = true;
        super.draw(canvas);
        ArrayList arrayList = this.f2546S;
        int size = arrayList.size();
        boolean z7 = false;
        for (int r42 = 0; r42 < size; r42++) {
            i iVar = (i) arrayList.get(r42);
            if (iVar.f117l == iVar.f119n.getWidth() && iVar.f118m == iVar.f119n.getHeight()) {
                if (iVar.f127v != 0) {
                    if (iVar.f120o) {
                        int r7 = iVar.f117l;
                        int r8 = iVar.f110d;
                        int r72 = r7 - r8;
                        int r9 = 0 - (0 / 2);
                        StateListDrawable stateListDrawable = iVar.f108b;
                        stateListDrawable.setBounds(0, 0, r8, 0);
                        int r11 = iVar.f118m;
                        Drawable drawable = iVar.f109c;
                        drawable.setBounds(0, 0, iVar.f111e, r11);
                        RecyclerView recyclerView = iVar.f119n;
                        Field field = w.f3200a;
                        if (recyclerView.getLayoutDirection() == 1) {
                            drawable.draw(canvas);
                            canvas.translate(r8, r9);
                            canvas.scale(-1.0f, 1.0f);
                            stateListDrawable.draw(canvas);
                            canvas.scale(1.0f, 1.0f);
                            canvas.translate(-r8, -r9);
                        } else {
                            canvas.translate(r72, 0.0f);
                            drawable.draw(canvas);
                            canvas.translate(0.0f, r9);
                            stateListDrawable.draw(canvas);
                            canvas.translate(-r72, -r9);
                        }
                    }
                    if (iVar.f121p) {
                        int r73 = iVar.f118m;
                        int r82 = iVar.f113h;
                        int r74 = r73 - r82;
                        int r92 = 0 - (0 / 2);
                        StateListDrawable stateListDrawable2 = iVar.f112f;
                        stateListDrawable2.setBounds(0, 0, 0, r82);
                        int r83 = iVar.f117l;
                        Drawable drawable2 = iVar.g;
                        drawable2.setBounds(0, 0, r83, iVar.f114i);
                        canvas.translate(0.0f, r74);
                        drawable2.draw(canvas);
                        canvas.translate(r92, 0.0f);
                        stateListDrawable2.draw(canvas);
                        canvas.translate(-r92, -r74);
                    }
                }
            } else {
                iVar.f117l = iVar.f119n.getWidth();
                iVar.f118m = iVar.f119n.getHeight();
                iVar.e(0);
            }
        }
        EdgeEffect edgeEffect = this.f2560l0;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.f2541O) {
                r4 = getPaddingBottom();
            } else {
                r4 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + r4, 0.0f);
            EdgeEffect edgeEffect2 = this.f2560l0;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z3 = true;
            } else {
                z3 = false;
            }
            canvas.restoreToCount(save);
        } else {
            z3 = false;
        }
        EdgeEffect edgeEffect3 = this.f2561m0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f2541O) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f2561m0;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z5 = true;
            } else {
                z5 = false;
            }
            z3 |= z5;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f2562n0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.f2541O) {
                r6 = getPaddingTop();
            } else {
                r6 = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(-r6, -width);
            EdgeEffect edgeEffect6 = this.f2562n0;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z4 = true;
            } else {
                z4 = false;
            }
            z3 |= z4;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.o0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f2541O) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.o0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z7 = true;
            }
            z3 |= z7;
            canvas.restoreToCount(save4);
        }
        if (z3 || this.f2563p0 == null || arrayList.size() <= 0 || !this.f2563p0.b()) {
            z6 = z3;
        }
        if (z6) {
            Field field2 = w.f3200a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return super.drawChild(canvas, view, j3);
    }

    public final void e(int r3, int r4) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        Field field = w.f3200a;
        setMeasuredDimension(z.e(r3, paddingRight, getMinimumWidth()), z.e(r4, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public final boolean f(int r7, int r8, int[] r9, int[] r10, int r11) {
        return getScrollingChildHelper().c(r7, r8, r9, r10, r11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int r14) {
        int r12;
        int r7;
        this.f2545R.getClass();
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, r14);
        if (findNextFocus != null && !findNextFocus.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, r14);
            }
            o(findNextFocus, null);
            return view;
        }
        if (findNextFocus != null && findNextFocus != this && i(findNextFocus) != null) {
            if (view != null && i(view) != null) {
                int width = view.getWidth();
                int height = view.getHeight();
                Rect rect = this.f2543P;
                char c4 = 0;
                rect.set(0, 0, width, height);
                int width2 = findNextFocus.getWidth();
                int height2 = findNextFocus.getHeight();
                Rect rect2 = this.f2544Q;
                rect2.set(0, 0, width2, height2);
                offsetDescendantRectToMyCoords(view, rect);
                offsetDescendantRectToMyCoords(findNextFocus, rect2);
                RecyclerView recyclerView = this.f2545R.f163b;
                Field field = w.f3200a;
                if (recyclerView.getLayoutDirection() == 1) {
                    r12 = -1;
                } else {
                    r12 = 1;
                }
                int r72 = rect.left;
                int r8 = rect2.left;
                if ((r72 < r8 || rect.right <= r8) && rect.right < rect2.right) {
                    r7 = 1;
                } else {
                    int r9 = rect.right;
                    int r10 = rect2.right;
                    if ((r9 > r10 || r72 >= r10) && r72 > r8) {
                        r7 = -1;
                    } else {
                        r7 = 0;
                    }
                }
                int r82 = rect.top;
                int r92 = rect2.top;
                if ((r82 < r92 || rect.bottom <= r92) && rect.bottom < rect2.bottom) {
                    c4 = 1;
                } else {
                    int r3 = rect.bottom;
                    int r5 = rect2.bottom;
                    if ((r3 > r5 || r82 >= r5) && r82 > r92) {
                        c4 = 65535;
                    }
                }
                if (r14 != 1) {
                    if (r14 != 2) {
                        if (r14 != 17) {
                            if (r14 != 33) {
                                if (r14 != 66) {
                                    if (r14 == 130) {
                                        if (c4 > 0) {
                                            return findNextFocus;
                                        }
                                    } else {
                                        throw new IllegalArgumentException("Invalid direction: " + r14 + h());
                                    }
                                } else if (r7 > 0) {
                                    return findNextFocus;
                                }
                            } else if (c4 < 0) {
                                return findNextFocus;
                            }
                        } else if (r7 < 0) {
                            return findNextFocus;
                        }
                    } else if (c4 <= 0) {
                        if (c4 == 0 && r7 * r12 >= 0) {
                            return findNextFocus;
                        }
                    } else {
                        return findNextFocus;
                    }
                } else if (c4 >= 0) {
                    if (c4 == 0 && r7 * r12 <= 0) {
                        return findNextFocus;
                    }
                } else {
                    return findNextFocus;
                }
            } else {
                return findNextFocus;
            }
        }
        return super.focusSearch(view, r14);
    }

    public final boolean g(int[] r9, int r10) {
        return getScrollingChildHelper().d(0, 0, 0, 0, r9, r10, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        z zVar = this.f2545R;
        if (zVar != null) {
            return zVar.l();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        z zVar = this.f2545R;
        if (zVar != null) {
            return zVar.m(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public AbstractC0019v getAdapter() {
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        z zVar = this.f2545R;
        if (zVar != null) {
            zVar.getClass();
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int r12, int r22) {
        return super.getChildDrawingOrder(r12, r22);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f2541O;
    }

    public N getCompatAccessibilityDelegate() {
        return this.J0;
    }

    public x getEdgeEffectFactory() {
        return this.f2559k0;
    }

    public y getItemAnimator() {
        return this.f2563p0;
    }

    public int getItemDecorationCount() {
        return this.f2546S.size();
    }

    public z getLayoutManager() {
        return this.f2545R;
    }

    public int getMaxFlingVelocity() {
        return this.f2572z0;
    }

    public int getMinFlingVelocity() {
        return this.f2571y0;
    }

    public long getNanoTime() {
        if (f2520S0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public B getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f2525C0;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [A0.E, java.lang.Object] */
    public E getRecycledViewPool() {
        F f2 = this.f2532J;
        if (f2.f39e == null) {
            ?? obj = new Object();
            obj.f33a = new SparseArray();
            obj.f34b = 0;
            f2.f39e = obj;
        }
        return f2.f39e;
    }

    public int getScrollState() {
        return this.f2564q0;
    }

    public final String h() {
        return " " + super.toString() + ", adapter:null, layout:" + this.f2545R + ", context:" + getContext();
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View i(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.i(android.view.View):android.view.View");
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.f2549V;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f3190d;
    }

    public final boolean k() {
        return getScrollingChildHelper().f(1);
    }

    public final boolean l() {
        if (this.a0 && !this.f2556g0 && ((ArrayList) this.f2535L.f84K).size() <= 0) {
            return false;
        }
        return true;
    }

    public final void m() {
        int I3 = this.f2537M.I();
        for (int r22 = 0; r22 < I3; r22++) {
            ((A) this.f2537M.H(r22).getLayoutParams()).f32b = true;
        }
        ArrayList arrayList = this.f2532J.f36b;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public final void n(MotionEvent motionEvent) {
        int r02;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2565r0) {
            if (actionIndex == 0) {
                r02 = 1;
            } else {
                r02 = 0;
            }
            this.f2565r0 = motionEvent.getPointerId(r02);
            int x3 = (int) (motionEvent.getX(r02) + 0.5f);
            this.f2569v0 = x3;
            this.f2567t0 = x3;
            int y3 = (int) (motionEvent.getY(r02) + 0.5f);
            this.w0 = y3;
            this.f2568u0 = y3;
        }
    }

    public final void o(View view, View view2) {
        View view3;
        boolean z3;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f2543P;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof A) {
            A a4 = (A) layoutParams;
            if (!a4.f32b) {
                int r12 = rect.left;
                Rect rect2 = a4.f31a;
                rect.left = r12 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        z zVar = this.f2545R;
        boolean z4 = !this.a0;
        if (view2 == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        zVar.G(this, view, this.f2543P, z4, z3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
        if (r1 >= 30.0f) goto L18;
     */
    /* JADX WARN: Type inference failed for: r1v3, types: [A0.m, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f2558i0 = r0
            r1 = 1
            r5.f2549V = r1
            boolean r2 = r5.a0
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            r0 = 1
        L14:
            r5.a0 = r0
            A0.z r0 = r5.f2545R
            if (r0 == 0) goto L1c
            r0.f166e = r1
        L1c:
            boolean r0 = androidx.recyclerview.widget.RecyclerView.f2520S0
            if (r0 == 0) goto L6f
            java.lang.ThreadLocal r0 = A0.RunnableC0011m.f138N
            java.lang.Object r1 = r0.get()
            A0.m r1 = (A0.RunnableC0011m) r1
            r5.f2527E0 = r1
            if (r1 != 0) goto L68
            A0.m r1 = new A0.m
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f140J = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f143M = r2
            r5.f2527E0 = r1
            java.lang.reflect.Field r1 = f0.w.f3200a
            android.view.Display r1 = r5.getDisplay()
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L5a
            if (r1 == 0) goto L5a
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L5a
            goto L5c
        L5a:
            r1 = 1114636288(0x42700000, float:60.0)
        L5c:
            A0.m r2 = r5.f2527E0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f142L = r3
            r0.set(r2)
        L68:
            A0.m r0 = r5.f2527E0
            java.util.ArrayList r0 = r0.f140J
            r0.add(r5)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Object obj;
        RunnableC0011m runnableC0011m;
        super.onDetachedFromWindow();
        y yVar = this.f2563p0;
        if (yVar != null) {
            yVar.a();
        }
        setScrollState(0);
        L l3 = this.f2526D0;
        l3.f54P.removeCallbacks(l3);
        l3.f50L.abortAnimation();
        this.f2549V = false;
        z zVar = this.f2545R;
        if (zVar != null) {
            zVar.f166e = false;
            zVar.z(this);
        }
        this.f2542O0.clear();
        removeCallbacks(this.P0);
        this.f2539N.getClass();
        do {
            f fVar = W.f81a;
            int r12 = fVar.f2650a;
            obj = null;
            if (r12 > 0) {
                int r13 = r12 - 1;
                Object[] objArr = (Object[]) fVar.f2651b;
                Object obj2 = objArr[r13];
                g.c(obj2, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
                objArr[r13] = null;
                fVar.f2650a--;
                obj = obj2;
                continue;
            }
        } while (obj != null);
        if (f2520S0 && (runnableC0011m = this.f2527E0) != null) {
            runnableC0011m.f140J.remove(this);
            this.f2527E0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.f2546S;
        int size = arrayList.size();
        for (int r12 = 0; r12 < size; r12++) {
            ((i) arrayList.get(r12)).getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            A0.z r0 = r5.f2545R
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.f2552c0
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L79
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            A0.z r0 = r5.f2545R
            boolean r0 = r0.c()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            A0.z r3 = r5.f2545R
            boolean r3 = r3.b()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = 0
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            A0.z r3 = r5.f2545R
            boolean r3 = r3.c()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            A0.z r3 = r5.f2545R
            boolean r3 = r3.b()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = 0
            goto L64
        L62:
            r0 = 0
            goto L3c
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L79
        L6c:
            float r2 = r5.f2523A0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f2524B0
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.q(r2, r0, r6)
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        if (this.f2552c0) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.f2548U = null;
        }
        ArrayList arrayList = this.f2547T;
        int size = arrayList.size();
        for (int r5 = 0; r5 < size; r5++) {
            i iVar = (i) arrayList.get(r5);
            if (iVar.c(motionEvent) && action != 3) {
                this.f2548U = iVar;
                p();
                setScrollState(0);
                return true;
            }
        }
        z zVar = this.f2545R;
        if (zVar == null) {
            return false;
        }
        boolean b3 = zVar.b();
        boolean c4 = this.f2545R.c();
        if (this.f2566s0 == null) {
            this.f2566s0 = VelocityTracker.obtain();
        }
        this.f2566s0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                n(motionEvent);
                            }
                        } else {
                            this.f2565r0 = motionEvent.getPointerId(actionIndex);
                            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.f2569v0 = x3;
                            this.f2567t0 = x3;
                            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.w0 = y3;
                            this.f2568u0 = y3;
                        }
                    } else {
                        p();
                        setScrollState(0);
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f2565r0);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f2565r0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x4 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y4 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.f2564q0 != 1) {
                        int r22 = x4 - this.f2567t0;
                        int r52 = y4 - this.f2568u0;
                        if (b3 && Math.abs(r22) > this.f2570x0) {
                            this.f2569v0 = x4;
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (c4 && Math.abs(r52) > this.f2570x0) {
                            this.w0 = y4;
                            z3 = true;
                        }
                        if (z3) {
                            setScrollState(1);
                        }
                    }
                }
            } else {
                this.f2566s0.clear();
                s(0);
            }
        } else {
            if (this.f2553d0) {
                this.f2553d0 = false;
            }
            this.f2565r0 = motionEvent.getPointerId(0);
            int x5 = (int) (motionEvent.getX() + 0.5f);
            this.f2569v0 = x5;
            this.f2567t0 = x5;
            int y5 = (int) (motionEvent.getY() + 0.5f);
            this.w0 = y5;
            this.f2568u0 = y5;
            if (this.f2564q0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
            int[] r10 = this.f2540N0;
            r10[1] = 0;
            r10[0] = 0;
            int r02 = b3;
            if (c4) {
                r02 = (b3 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().g(r02, 0);
        }
        if (this.f2564q0 != 1) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int r22, int r3, int r4, int r5) {
        int r12 = h.f2605a;
        Trace.beginSection("RV OnLayout");
        Log.e("RecyclerView", "No adapter attached; skipping layout");
        Trace.endSection();
        this.a0 = true;
    }

    @Override // android.view.View
    public final void onMeasure(int r3, int r4) {
        z zVar = this.f2545R;
        if (zVar == null) {
            e(r3, r4);
        } else if (zVar.y()) {
            View.MeasureSpec.getMode(r3);
            View.MeasureSpec.getMode(r4);
            this.f2545R.f163b.e(r3, r4);
        } else if (this.f2550W) {
            this.f2545R.f163b.e(r3, r4);
        } else {
            J j3 = this.f2529G0;
            if (j3.f47e) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            j3.getClass();
            this.f2551b0++;
            this.f2545R.f163b.e(r3, r4);
            if (this.f2551b0 < 1) {
                this.f2551b0 = 1;
            }
            this.f2551b0--;
            j3.f45c = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int r22, Rect rect) {
        if (this.f2558i0 > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(r22, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof I)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        I r22 = (I) parcelable;
        this.f2533K = r22;
        super.onRestoreInstanceState(r22.f4117a);
        z zVar = this.f2545R;
        if (zVar != null && (parcelable2 = this.f2533K.f42c) != null) {
            zVar.B(parcelable2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, A0.I, m0.b] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? abstractC0351b = new AbstractC0351b(super.onSaveInstanceState());
        I r12 = this.f2533K;
        if (r12 != null) {
            abstractC0351b.f42c = r12.f42c;
        } else {
            z zVar = this.f2545R;
            if (zVar != null) {
                abstractC0351b.f42c = zVar.C();
            } else {
                abstractC0351b.f42c = null;
            }
        }
        return abstractC0351b;
    }

    @Override // android.view.View
    public final void onSizeChanged(int r12, int r22, int r3, int r4) {
        super.onSizeChanged(r12, r22, r3, r4);
        if (r12 != r3 || r22 != r4) {
            this.o0 = null;
            this.f2561m0 = null;
            this.f2562n0 = null;
            this.f2560l0 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x024c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 869
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        VelocityTracker velocityTracker = this.f2566s0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z3 = false;
        s(0);
        EdgeEffect edgeEffect = this.f2560l0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z3 = this.f2560l0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f2561m0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z3 |= this.f2561m0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f2562n0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z3 |= this.f2562n0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.o0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z3 |= this.o0.isFinished();
        }
        if (z3) {
            Field field = w.f3200a;
            postInvalidateOnAnimation();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(int r11, int r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.q(int, int, android.view.MotionEvent):void");
    }

    public final void r(int r14, int r15) {
        int r5;
        int r6;
        boolean z3;
        int height;
        int r152;
        z zVar = this.f2545R;
        if (zVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f2552c0) {
            if (!zVar.b()) {
                r5 = 0;
            } else {
                r5 = r14;
            }
            if (!this.f2545R.c()) {
                r6 = 0;
            } else {
                r6 = r15;
            }
            if (r5 != 0 || r6 != 0) {
                L l3 = this.f2526D0;
                l3.getClass();
                int abs = Math.abs(r5);
                int abs2 = Math.abs(r6);
                if (abs > abs2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int sqrt = (int) Math.sqrt(0);
                int sqrt2 = (int) Math.sqrt((r6 * r6) + (r5 * r5));
                RecyclerView recyclerView = l3.f54P;
                if (z3) {
                    height = recyclerView.getWidth();
                } else {
                    height = recyclerView.getHeight();
                }
                int r9 = height / 2;
                float f2 = height;
                float f4 = r9;
                float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f2) - 0.5f) * 0.47123894f)) * f4) + f4;
                if (sqrt > 0) {
                    r152 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
                } else {
                    if (!z3) {
                        abs = abs2;
                    }
                    r152 = (int) (((abs / f2) + 1.0f) * 300.0f);
                }
                int min = Math.min(r152, 2000);
                Interpolator interpolator = l3.f51M;
                animation.InterpolatorC0018u r22 = f2522U0;
                if (interpolator != r22) {
                    l3.f51M = r22;
                    l3.f50L = new OverScroller(recyclerView.getContext(), r22);
                }
                recyclerView.setScrollState(2);
                l3.f49K = 0;
                l3.f48J = 0;
                l3.f50L.startScroll(0, 0, r5, r6, min);
                if (Build.VERSION.SDK_INT < 23) {
                    l3.f50L.computeScrollOffset();
                }
                l3.a();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z3) {
        j(view);
        view.clearAnimation();
        j(view);
        super.removeDetachedView(view, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        this.f2545R.getClass();
        if (this.f2558i0 <= 0 && view2 != null) {
            o(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        return this.f2545R.G(this, view, rect, z3, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        ArrayList arrayList = this.f2547T;
        int size = arrayList.size();
        for (int r22 = 0; r22 < size; r22++) {
            ((i) arrayList.get(r22)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f2551b0 == 0 && !this.f2552c0) {
            super.requestLayout();
        }
    }

    public final void s(int r22) {
        getScrollingChildHelper().h(r22);
    }

    @Override // android.view.View
    public final void scrollBy(int r4, int r5) {
        z zVar = this.f2545R;
        if (zVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.f2552c0) {
        } else {
            boolean b3 = zVar.b();
            boolean c4 = this.f2545R.c();
            if (b3 || c4) {
                if (!b3) {
                    r4 = 0;
                }
                if (!c4) {
                    r5 = 0;
                }
                q(r4, r5, null);
            }
        }
    }

    @Override // android.view.View
    public final void scrollTo(int r12, int r22) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int r22;
        if (this.f2558i0 > 0) {
            int r02 = 0;
            if (accessibilityEvent != null) {
                r22 = accessibilityEvent.getContentChangeTypes();
            } else {
                r22 = 0;
            }
            if (r22 != 0) {
                r02 = r22;
            }
            this.f2554e0 |= r02;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(N n3) {
        this.J0 = n3;
        w.a(this, n3);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [A0.E, java.lang.Object] */
    public void setAdapter(AbstractC0019v abstractC0019v) {
        setLayoutFrozen(false);
        y yVar = this.f2563p0;
        if (yVar != null) {
            yVar.a();
        }
        z zVar = this.f2545R;
        F f2 = this.f2532J;
        if (zVar != null) {
            zVar.E();
            this.f2545R.F(f2);
        }
        f2.f35a.clear();
        f2.a();
        C0001b c0001b = this.f2535L;
        c0001b.T((ArrayList) c0001b.f84K);
        c0001b.T((ArrayList) c0001b.f86M);
        f2.f35a.clear();
        f2.a();
        if (f2.f39e == null) {
            ?? obj = new Object();
            obj.f33a = new SparseArray();
            obj.f34b = 0;
            f2.f39e = obj;
        }
        E e4 = f2.f39e;
        if (e4.f34b == 0) {
            SparseArray sparseArray = e4.f33a;
            if (sparseArray.size() > 0) {
                ((D) sparseArray.valueAt(0)).getClass();
                throw null;
            }
        }
        this.f2529G0.f44b = true;
        this.f2557h0 = this.f2557h0;
        this.f2556g0 = true;
        int I3 = this.f2537M.I();
        for (int r22 = 0; r22 < I3; r22++) {
            j(this.f2537M.H(r22));
        }
        m();
        ArrayList arrayList = f2.f36b;
        int size = arrayList.size();
        for (int r5 = 0; r5 < size; r5++) {
            if (arrayList.get(r5) != null) {
                throw new ClassCastException();
            }
        }
        f2.f40f.getClass();
        f2.a();
        requestLayout();
    }

    public void setChildDrawingOrderCallback(InterfaceC0020w interfaceC0020w) {
        if (interfaceC0020w == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z3) {
        if (z3 != this.f2541O) {
            this.o0 = null;
            this.f2561m0 = null;
            this.f2562n0 = null;
            this.f2560l0 = null;
        }
        this.f2541O = z3;
        super.setClipToPadding(z3);
        if (this.a0) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(x xVar) {
        xVar.getClass();
        this.f2559k0 = xVar;
        this.o0 = null;
        this.f2561m0 = null;
        this.f2562n0 = null;
        this.f2560l0 = null;
    }

    public void setHasFixedSize(boolean z3) {
        this.f2550W = z3;
    }

    public void setItemAnimator(y yVar) {
        y yVar2 = this.f2563p0;
        if (yVar2 != null) {
            yVar2.a();
            this.f2563p0.f158a = null;
        }
        this.f2563p0 = yVar;
        if (yVar != null) {
            yVar.f158a = this.f2531I0;
        }
    }

    public void setItemViewCacheSize(int r22) {
        F f2 = this.f2532J;
        f2.f37c = r22;
        f2.c();
    }

    public void setLayoutFrozen(boolean z3) {
        if (z3 != this.f2552c0) {
            b("Do not setLayoutFrozen in layout or scroll");
            if (!z3) {
                this.f2552c0 = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f2552c0 = true;
            this.f2553d0 = true;
            setScrollState(0);
            L l3 = this.f2526D0;
            l3.f54P.removeCallbacks(l3);
            l3.f50L.abortAnimation();
        }
    }

    public void setLayoutManager(z zVar) {
        A.a aVar;
        if (zVar == this.f2545R) {
            return;
        }
        setScrollState(0);
        L l3 = this.f2526D0;
        l3.f54P.removeCallbacks(l3);
        l3.f50L.abortAnimation();
        z zVar2 = this.f2545R;
        F f2 = this.f2532J;
        if (zVar2 != null) {
            y yVar = this.f2563p0;
            if (yVar != null) {
                yVar.a();
            }
            this.f2545R.E();
            this.f2545R.F(f2);
            f2.f35a.clear();
            f2.a();
            if (this.f2549V) {
                z zVar3 = this.f2545R;
                zVar3.f166e = false;
                zVar3.z(this);
            }
            this.f2545R.I(null);
            this.f2545R = null;
        } else {
            f2.f35a.clear();
            f2.a();
        }
        C0001b c0001b = this.f2537M;
        ((C0002c) c0001b.f86M).d();
        ArrayList arrayList = (ArrayList) c0001b.f84K;
        int size = arrayList.size() - 1;
        while (true) {
            aVar = (A.a) c0001b.f85L;
            if (size < 0) {
                break;
            }
            j((View) arrayList.get(size));
            arrayList.remove(size);
            size--;
        }
        RecyclerView recyclerView = (RecyclerView) aVar.f1K;
        int childCount = recyclerView.getChildCount();
        for (int r02 = 0; r02 < childCount; r02++) {
            View childAt = recyclerView.getChildAt(r02);
            j(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f2545R = zVar;
        if (zVar != null) {
            if (zVar.f163b == null) {
                zVar.I(this);
                if (this.f2549V) {
                    this.f2545R.f166e = true;
                }
            } else {
                throw new IllegalArgumentException("LayoutManager " + zVar + " is already attached to a RecyclerView:" + zVar.f163b.h());
            }
        }
        f2.c();
        requestLayout();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z3) {
        C0260f scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f3190d) {
            Field field = w.f3200a;
            AbstractC0268o.z(scrollingChildHelper.f3189c);
        }
        scrollingChildHelper.f3190d = z3;
    }

    public void setPreserveFocusAfterLayout(boolean z3) {
        this.f2525C0 = z3;
    }

    public void setRecycledViewPool(E e4) {
        E e5;
        F f2 = this.f2532J;
        if (f2.f39e != null) {
            e5.f34b--;
        }
        f2.f39e = e4;
        if (e4 != null) {
            f2.f40f.getAdapter();
        }
    }

    public void setScrollState(int r3) {
        if (r3 == this.f2564q0) {
            return;
        }
        this.f2564q0 = r3;
        if (r3 != 2) {
            L l3 = this.f2526D0;
            l3.f54P.removeCallbacks(l3);
            l3.f50L.abortAnimation();
        }
        z zVar = this.f2545R;
        if (zVar != null) {
            zVar.D(r3);
        }
        ArrayList arrayList = this.f2530H0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C) this.f2530H0.get(size)).getClass();
            }
        }
    }

    public void setScrollingTouchSlop(int r4) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (r4 != 0) {
            if (r4 != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + r4 + "; using default value");
            } else {
                this.f2570x0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.f2570x0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(K k3) {
        this.f2532J.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int r3) {
        return getScrollingChildHelper().g(r3, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        z zVar = this.f2545R;
        if (zVar != null) {
            return zVar.n(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + h());
    }

    public void setOnFlingListener(B b3) {
    }

    @Deprecated
    public void setOnScrollListener(C c4) {
    }

    public void setRecyclerListener(G g) {
    }
}
