package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import k0.AbstractC0325l;
import l0.C0346a;
import x1.C4;

/* loaded from: classes.dex */
public abstract class K implements o.r {

    /* renamed from: f0  reason: collision with root package name */
    public static final Method f4533f0;

    /* renamed from: g0  reason: collision with root package name */
    public static final Method f4534g0;

    /* renamed from: h0  reason: collision with root package name */
    public static final Method f4535h0;

    /* renamed from: J  reason: collision with root package name */
    public final Context f4536J;

    /* renamed from: K  reason: collision with root package name */
    public ListAdapter f4537K;

    /* renamed from: L  reason: collision with root package name */
    public M f4538L;

    /* renamed from: N  reason: collision with root package name */
    public int f4540N;

    /* renamed from: O  reason: collision with root package name */
    public int f4541O;

    /* renamed from: P  reason: collision with root package name */
    public boolean f4542P;

    /* renamed from: Q  reason: collision with root package name */
    public boolean f4543Q;

    /* renamed from: R  reason: collision with root package name */
    public boolean f4544R;

    /* renamed from: T  reason: collision with root package name */
    public C0346a f4546T;

    /* renamed from: U  reason: collision with root package name */
    public View f4547U;

    /* renamed from: V  reason: collision with root package name */
    public o.l f4548V;
    public final Handler a0;

    /* renamed from: c0  reason: collision with root package name */
    public Rect f4554c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f4555d0;

    /* renamed from: e0  reason: collision with root package name */
    public final r f4556e0;

    /* renamed from: M  reason: collision with root package name */
    public int f4539M = -2;

    /* renamed from: S  reason: collision with root package name */
    public int f4545S = 0;

    /* renamed from: W  reason: collision with root package name */
    public final H f4549W = new H(this, 1);

    /* renamed from: X  reason: collision with root package name */
    public final J f4550X = new J(this);

    /* renamed from: Y  reason: collision with root package name */
    public final I f4551Y = new I(this);

    /* renamed from: Z  reason: collision with root package name */
    public final H f4552Z = new H(this, 0);

    /* renamed from: b0  reason: collision with root package name */
    public final Rect f4553b0 = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f4533f0 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f4535h0 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f4534g0 = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [p.r, android.widget.PopupWindow] */
    public K(Context context, int r7) {
        Drawable drawable;
        int resourceId;
        this.f4536J = context;
        this.a0 = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, i.a.f3393k, r7, 0);
        this.f4540N = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f4541O = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f4542P = true;
        }
        obtainStyledAttributes.recycle();
        ?? popupWindow = new PopupWindow(context, (AttributeSet) null, r7, 0);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(null, i.a.f3397o, r7, 0);
        if (obtainStyledAttributes2.hasValue(2)) {
            C4.a(popupWindow, obtainStyledAttributes2.getBoolean(2, false));
        }
        if (obtainStyledAttributes2.hasValue(0) && (resourceId = obtainStyledAttributes2.getResourceId(0, 0)) != 0) {
            drawable = j.b.c(context, resourceId);
        } else {
            drawable = obtainStyledAttributes2.getDrawable(0);
        }
        popupWindow.setBackgroundDrawable(drawable);
        obtainStyledAttributes2.recycle();
        this.f4556e0 = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    public final void b(ListAdapter listAdapter) {
        C0346a c0346a = this.f4546T;
        if (c0346a == null) {
            this.f4546T = new C0346a(1, this);
        } else {
            ListAdapter listAdapter2 = this.f4537K;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c0346a);
            }
        }
        this.f4537K = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f4546T);
        }
        M m3 = this.f4538L;
        if (m3 != null) {
            m3.setAdapter(this.f4537K);
        }
    }

    @Override // o.r
    public final void d() {
        int r7;
        boolean z3;
        int maxAvailableHeight;
        int makeMeasureSpec;
        int r5;
        M m3;
        int r8;
        M m4 = this.f4538L;
        r rVar = this.f4556e0;
        Context context = this.f4536J;
        if (m4 == null) {
            M m5 = new M(context, !this.f4555d0);
            m5.setHoverListener((N) this);
            this.f4538L = m5;
            m5.setAdapter(this.f4537K);
            this.f4538L.setOnItemClickListener(this.f4548V);
            this.f4538L.setFocusable(true);
            this.f4538L.setFocusableInTouchMode(true);
            this.f4538L.setOnItemSelectedListener(new G(0, this));
            this.f4538L.setOnScrollListener(this.f4551Y);
            rVar.setContentView(this.f4538L);
        } else {
            ViewGroup viewGroup = (ViewGroup) rVar.getContentView();
        }
        Drawable background = rVar.getBackground();
        Rect rect = this.f4553b0;
        if (background != null) {
            background.getPadding(rect);
            int r3 = rect.top;
            r7 = rect.bottom + r3;
            if (!this.f4542P) {
                this.f4541O = -r3;
            }
        } else {
            rect.setEmpty();
            r7 = 0;
        }
        if (rVar.getInputMethodMode() == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        View view = this.f4547U;
        int r9 = this.f4541O;
        if (Build.VERSION.SDK_INT > 23) {
            maxAvailableHeight = rVar.getMaxAvailableHeight(view, r9, z3);
        } else {
            Method method = f4534g0;
            if (method != null) {
                try {
                    maxAvailableHeight = ((Integer) method.invoke(rVar, view, Integer.valueOf(r9), Boolean.valueOf(z3))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            maxAvailableHeight = rVar.getMaxAvailableHeight(view, r9);
        }
        int r32 = this.f4539M;
        int r92 = -1;
        if (r32 != -2) {
            if (r32 != -1) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(r32, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            }
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
        }
        int a4 = this.f4538L.a(makeMeasureSpec, maxAvailableHeight);
        if (a4 > 0) {
            r5 = this.f4538L.getPaddingBottom() + this.f4538L.getPaddingTop() + r7;
        } else {
            r5 = 0;
        }
        int r02 = a4 + r5;
        this.f4556e0.getInputMethodMode();
        if (Build.VERSION.SDK_INT >= 23) {
            AbstractC0325l.d(rVar, 1002);
        } else {
            if (!C4.f5514b) {
                try {
                    Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                    C4.f5513a = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (Exception unused2) {
                }
                C4.f5514b = true;
            }
            Method method2 = C4.f5513a;
            if (method2 != null) {
                try {
                    method2.invoke(rVar, 1002);
                } catch (Exception unused3) {
                }
            }
        }
        if (rVar.isShowing()) {
            View view2 = this.f4547U;
            Field field = f0.w.f3200a;
            if (!view2.isAttachedToWindow()) {
                return;
            }
            int r22 = this.f4539M;
            if (r22 == -1) {
                r22 = -1;
            } else if (r22 == -2) {
                r22 = this.f4547U.getWidth();
            }
            rVar.setOutsideTouchable(true);
            View view3 = this.f4547U;
            int r6 = this.f4540N;
            int r72 = this.f4541O;
            if (r22 < 0) {
                r8 = -1;
            } else {
                r8 = r22;
            }
            if (r02 >= 0) {
                r92 = r02;
            }
            rVar.update(view3, r6, r72, r8, r92);
            return;
        }
        int r33 = this.f4539M;
        if (r33 == -1) {
            r33 = -1;
        } else if (r33 == -2) {
            r33 = this.f4547U.getWidth();
        }
        rVar.setWidth(r33);
        rVar.setHeight(r02);
        if (Build.VERSION.SDK_INT > 28) {
            rVar.setIsClippedToScreen(true);
        } else {
            Method method3 = f4533f0;
            if (method3 != null) {
                try {
                    method3.invoke(rVar, Boolean.TRUE);
                } catch (Exception unused4) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        }
        rVar.setOutsideTouchable(true);
        rVar.setTouchInterceptor(this.f4550X);
        if (this.f4544R) {
            C4.a(rVar, this.f4543Q);
        }
        if (Build.VERSION.SDK_INT > 28) {
            rVar.setEpicenterBounds(this.f4554c0);
        } else {
            Method method4 = f4535h0;
            if (method4 != null) {
                try {
                    method4.invoke(rVar, this.f4554c0);
                } catch (Exception e4) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e4);
                }
            }
        }
        rVar.showAsDropDown(this.f4547U, this.f4540N, this.f4541O, this.f4545S);
        this.f4538L.setSelection(-1);
        if ((!this.f4555d0 || this.f4538L.isInTouchMode()) && (m3 = this.f4538L) != null) {
            m3.setListSelectionHidden(true);
            m3.requestLayout();
        }
        if (!this.f4555d0) {
            this.a0.post(this.f4552Z);
        }
    }

    @Override // o.r
    public final void dismiss() {
        r rVar = this.f4556e0;
        rVar.dismiss();
        rVar.setContentView(null);
        this.f4538L = null;
        this.a0.removeCallbacks(this.f4549W);
    }

    @Override // o.r
    public final boolean g() {
        return this.f4556e0.isShowing();
    }

    @Override // o.r
    public final ListView h() {
        return this.f4538L;
    }
}
