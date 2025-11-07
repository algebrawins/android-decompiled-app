package p;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.example.catering_inventory.R;
import f0.AbstractC0252A;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class s0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: j  reason: collision with root package name */
    public static s0 f4696j;

    /* renamed from: k  reason: collision with root package name */
    public static s0 f4697k;

    /* renamed from: a  reason: collision with root package name */
    public final View f4698a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f4699b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4700c;

    /* renamed from: d  reason: collision with root package name */
    public final r0 f4701d = new r0(this, 0);

    /* renamed from: e  reason: collision with root package name */
    public final r0 f4702e = new r0(this, 1);

    /* renamed from: f  reason: collision with root package name */
    public int f4703f;
    public int g;

    /* renamed from: h  reason: collision with root package name */
    public t0 f4704h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4705i;

    public s0(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        this.f4698a = view;
        this.f4699b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = AbstractC0252A.f3148a;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = f0.y.a(viewConfiguration);
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f4700c = scaledTouchSlop;
        this.f4703f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(s0 s0Var) {
        s0 s0Var2 = f4696j;
        if (s0Var2 != null) {
            s0Var2.f4698a.removeCallbacks(s0Var2.f4701d);
        }
        f4696j = s0Var;
        if (s0Var != null) {
            s0Var.f4698a.postDelayed(s0Var.f4701d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        s0 s0Var = f4697k;
        View view = this.f4698a;
        if (s0Var == this) {
            f4697k = null;
            t0 t0Var = this.f4704h;
            if (t0Var != null) {
                View view2 = (View) t0Var.f4719b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) t0Var.f4718a).getSystemService("window")).removeView(view2);
                }
                this.f4704h = null;
                this.f4703f = Integer.MAX_VALUE;
                this.g = Integer.MAX_VALUE;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f4696j == this) {
            b(null);
        }
        view.removeCallbacks(this.f4702e);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [p.t0, java.lang.Object] */
    public final void c(boolean z3) {
        int height;
        int r5;
        int r14;
        String str;
        int r13;
        String str2;
        int r02;
        long longPressTimeout;
        long j3;
        long j4;
        Field field = f0.w.f3200a;
        View view = this.f4698a;
        if (!view.isAttachedToWindow()) {
            return;
        }
        b(null);
        s0 s0Var = f4697k;
        if (s0Var != null) {
            s0Var.a();
        }
        f4697k = this;
        this.f4705i = z3;
        Context context = view.getContext();
        ?? obj = new Object();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        obj.f4721d = layoutParams;
        obj.f4722e = new Rect();
        obj.f4723f = new int[2];
        obj.g = new int[2];
        obj.f4718a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        obj.f4719b = inflate;
        obj.f4720c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(t0.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2131623940;
        layoutParams.flags = 24;
        this.f4704h = obj;
        int r22 = this.f4703f;
        int r52 = this.g;
        boolean z4 = this.f4705i;
        View view2 = (View) obj.f4719b;
        ViewParent parent = view2.getParent();
        Context context2 = (Context) obj.f4718a;
        if (parent != null && view2.getParent() != null) {
            ((WindowManager) context2.getSystemService("window")).removeView(view2);
        }
        ((TextView) obj.f4720c).setText(this.f4699b);
        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) obj.f4721d;
        layoutParams2.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            r22 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
            height = r52 + dimensionPixelOffset2;
            r5 = r52 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            r5 = 0;
        }
        layoutParams2.gravity = 49;
        Resources resources = context2.getResources();
        if (z4) {
            r14 = R.dimen.tooltip_y_offset_touch;
        } else {
            r14 = R.dimen.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(r14);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
        if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
            Context context3 = view.getContext();
            while (true) {
                if (!(context3 instanceof ContextWrapper)) {
                    break;
                } else if (context3 instanceof Activity) {
                    rootView = ((Activity) context3).getWindow().getDecorView();
                    break;
                } else {
                    context3 = ((ContextWrapper) context3).getBaseContext();
                }
            }
        }
        if (rootView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            str2 = "window";
        } else {
            Rect rect = (Rect) obj.f4722e;
            rootView.getWindowVisibleDisplayFrame(rect);
            if (rect.left >= 0 || rect.top >= 0) {
                str = "window";
                r13 = 0;
            } else {
                Resources resources2 = context2.getResources();
                str = "window";
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    r02 = resources2.getDimensionPixelSize(identifier);
                } else {
                    r02 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                r13 = 0;
                rect.set(0, r02, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            int[] r03 = (int[]) obj.g;
            rootView.getLocationOnScreen(r03);
            int[] r12 = (int[]) obj.f4723f;
            view.getLocationOnScreen(r12);
            int r4 = r12[r13] - r03[r13];
            r12[r13] = r4;
            r12[1] = r12[1] - r03[1];
            layoutParams2.x = (r4 + r22) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(r13, r13);
            view2.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = view2.getMeasuredHeight();
            int r15 = r12[1];
            int r53 = ((r5 + r15) - dimensionPixelOffset3) - measuredHeight;
            int r16 = r15 + height + dimensionPixelOffset3;
            if (z4) {
                if (r53 >= 0) {
                    layoutParams2.y = r53;
                } else {
                    layoutParams2.y = r16;
                }
            } else if (measuredHeight + r16 <= rect.height()) {
                layoutParams2.y = r16;
            } else {
                layoutParams2.y = r53;
            }
            str2 = str;
        }
        ((WindowManager) context2.getSystemService(str2)).addView(view2, layoutParams2);
        view.addOnAttachStateChangeListener(this);
        if (this.f4705i) {
            j4 = 2500;
        } else {
            if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j3 = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j3 = 15000;
            }
            j4 = j3 - longPressTimeout;
        }
        r0 r0Var = this.f4702e;
        view.removeCallbacks(r0Var);
        view.postDelayed(r0Var, j4);
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f4704h != null && this.f4705i) {
            return false;
        }
        View view2 = this.f4698a;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                this.f4703f = Integer.MAX_VALUE;
                this.g = Integer.MAX_VALUE;
                a();
            }
        } else if (view2.isEnabled() && this.f4704h == null) {
            int x3 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            int abs = Math.abs(x3 - this.f4703f);
            int r22 = this.f4700c;
            if (abs > r22 || Math.abs(y3 - this.g) > r22) {
                this.f4703f = x3;
                this.g = y3;
                b(this);
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f4703f = view.getWidth() / 2;
        this.g = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
