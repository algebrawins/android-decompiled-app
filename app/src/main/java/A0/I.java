package A0;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: x  reason: collision with root package name */
    public static final int[] f105x = {16842919};

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f106y = new int[0];

    /* renamed from: a  reason: collision with root package name */
    public final int f107a;

    /* renamed from: b  reason: collision with root package name */
    public final StateListDrawable f108b;

    /* renamed from: c  reason: collision with root package name */
    public final Drawable f109c;

    /* renamed from: d  reason: collision with root package name */
    public final int f110d;

    /* renamed from: e  reason: collision with root package name */
    public final int f111e;

    /* renamed from: f  reason: collision with root package name */
    public final StateListDrawable f112f;
    public final Drawable g;

    /* renamed from: h  reason: collision with root package name */
    public final int f113h;

    /* renamed from: i  reason: collision with root package name */
    public final int f114i;

    /* renamed from: j  reason: collision with root package name */
    public float f115j;

    /* renamed from: k  reason: collision with root package name */
    public float f116k;

    /* renamed from: n  reason: collision with root package name */
    public final RecyclerView f119n;

    /* renamed from: u  reason: collision with root package name */
    public final ValueAnimator f126u;

    /* renamed from: v  reason: collision with root package name */
    public int f127v;

    /* renamed from: w  reason: collision with root package name */
    public final RunnableC0004e f128w;

    /* renamed from: l  reason: collision with root package name */
    public int f117l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f118m = 0;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f120o = false;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f121p = false;

    /* renamed from: q  reason: collision with root package name */
    public int f122q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f123r = 0;

    /* renamed from: s  reason: collision with root package name */
    public final int[] f124s = new int[2];

    /* renamed from: t  reason: collision with root package name */
    public final int[] f125t = new int[2];

    public i(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int r11, int r12, int r13) {
        boolean z3;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f126u = ofFloat;
        this.f127v = 0;
        RunnableC0004e runnableC0004e = new RunnableC0004e(0, this);
        this.f128w = runnableC0004e;
        Object obj = new Object();
        this.f108b = stateListDrawable;
        this.f109c = drawable;
        this.f112f = stateListDrawable2;
        this.g = drawable2;
        this.f110d = Math.max(r11, stateListDrawable.getIntrinsicWidth());
        this.f111e = Math.max(r11, drawable.getIntrinsicWidth());
        this.f113h = Math.max(r11, stateListDrawable2.getIntrinsicWidth());
        this.f114i = Math.max(r11, drawable2.getIntrinsicWidth());
        this.f107a = r13;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0006g(this));
        ofFloat.addUpdateListener(new C0007h(this));
        RecyclerView recyclerView2 = this.f119n;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                z zVar = recyclerView2.f2545R;
                if (zVar != null) {
                    zVar.a("Cannot remove item decoration during a scroll  or layout");
                }
                ArrayList arrayList = recyclerView2.f2546S;
                arrayList.remove(this);
                if (arrayList.isEmpty()) {
                    if (recyclerView2.getOverScrollMode() == 2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    recyclerView2.setWillNotDraw(z3);
                }
                recyclerView2.m();
                recyclerView2.requestLayout();
                RecyclerView recyclerView3 = this.f119n;
                recyclerView3.f2547T.remove(this);
                if (recyclerView3.f2548U == this) {
                    recyclerView3.f2548U = null;
                }
                ArrayList arrayList2 = this.f119n.f2530H0;
                if (arrayList2 != null) {
                    arrayList2.remove(obj);
                }
                this.f119n.removeCallbacks(runnableC0004e);
            }
            this.f119n = recyclerView;
            if (recyclerView != null) {
                z zVar2 = recyclerView.f2545R;
                if (zVar2 != null) {
                    zVar2.a("Cannot add item decoration during a scroll  or layout");
                }
                ArrayList arrayList3 = recyclerView.f2546S;
                if (arrayList3.isEmpty()) {
                    recyclerView.setWillNotDraw(false);
                }
                arrayList3.add(this);
                recyclerView.m();
                recyclerView.requestLayout();
                this.f119n.f2547T.add(this);
                RecyclerView recyclerView4 = this.f119n;
                if (recyclerView4.f2530H0 == null) {
                    recyclerView4.f2530H0 = new ArrayList();
                }
                recyclerView4.f2530H0.add(obj);
            }
        }
    }

    public static int d(float f2, float f4, int[] r4, int r5, int r6, int r7) {
        int r02 = r4[1] - r4[0];
        if (r02 == 0) {
            return 0;
        }
        int r52 = r5 - r7;
        int r22 = (int) (((f4 - f2) / r02) * r52);
        int r62 = r6 + r22;
        if (r62 >= r52 || r62 < 0) {
            return 0;
        }
        return r22;
    }

    public final boolean a(float f2, float f4) {
        if (f4 >= this.f118m - this.f113h && f2 >= 0 - (0 / 2) && f2 <= (0 / 2) + 0) {
            return true;
        }
        return false;
    }

    public final boolean b(float f2, float f4) {
        boolean z3;
        RecyclerView recyclerView = this.f119n;
        Field field = f0.w.f3200a;
        if (recyclerView.getLayoutDirection() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        int r3 = this.f110d;
        if (z3) {
            if (f2 > r3 / 2) {
                return false;
            }
        } else if (f2 < this.f117l - r3) {
            return false;
        }
        int r5 = 0 / 2;
        if (f4 < 0 - r5 || f4 > r5 + 0) {
            return false;
        }
        return true;
    }

    public final boolean c(MotionEvent motionEvent) {
        int r02 = this.f122q;
        if (r02 == 1) {
            boolean b3 = b(motionEvent.getX(), motionEvent.getY());
            boolean a4 = a(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!b3 && !a4) {
                return false;
            }
            if (a4) {
                this.f123r = 1;
                this.f116k = (int) motionEvent.getX();
            } else if (b3) {
                this.f123r = 2;
                this.f115j = (int) motionEvent.getY();
            }
            e(2);
        } else if (r02 != 2) {
            return false;
        }
        return true;
    }

    public final void e(int r5) {
        RunnableC0004e runnableC0004e = this.f128w;
        StateListDrawable stateListDrawable = this.f108b;
        if (r5 == 2 && this.f122q != 2) {
            stateListDrawable.setState(f105x);
            this.f119n.removeCallbacks(runnableC0004e);
        }
        if (r5 == 0) {
            this.f119n.invalidate();
        } else {
            f();
        }
        if (this.f122q == 2 && r5 != 2) {
            stateListDrawable.setState(f106y);
            this.f119n.removeCallbacks(runnableC0004e);
            this.f119n.postDelayed(runnableC0004e, 1200);
        } else if (r5 == 1) {
            this.f119n.removeCallbacks(runnableC0004e);
            this.f119n.postDelayed(runnableC0004e, 1500);
        }
        this.f122q = r5;
    }

    public final void f() {
        int r12 = this.f127v;
        ValueAnimator valueAnimator = this.f126u;
        if (r12 != 0) {
            if (r12 == 3) {
                valueAnimator.cancel();
            } else {
                return;
            }
        }
        this.f127v = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
