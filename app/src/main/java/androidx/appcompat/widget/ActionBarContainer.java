package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.example.catering_inventory.R;
import f0.w;
import java.lang.reflect.Field;
import p.C0403a;
import p.T;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: J  reason: collision with root package name */
    public boolean f1921J;

    /* renamed from: K  reason: collision with root package name */
    public View f1922K;

    /* renamed from: L  reason: collision with root package name */
    public View f1923L;

    /* renamed from: M  reason: collision with root package name */
    public Drawable f1924M;

    /* renamed from: N  reason: collision with root package name */
    public Drawable f1925N;

    /* renamed from: O  reason: collision with root package name */
    public Drawable f1926O;

    /* renamed from: P  reason: collision with root package name */
    public final boolean f1927P;

    /* renamed from: Q  reason: collision with root package name */
    public boolean f1928Q;

    /* renamed from: R  reason: collision with root package name */
    public final int f1929R;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0403a c0403a = new C0403a(this);
        Field field = w.f3200a;
        setBackground(c0403a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.a.f3384a);
        boolean z3 = false;
        this.f1924M = obtainStyledAttributes.getDrawable(0);
        this.f1925N = obtainStyledAttributes.getDrawable(2);
        this.f1929R = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f1927P = true;
            this.f1926O = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1927P ? !(this.f1924M != null || this.f1925N != null) : this.f1926O == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1924M;
        if (drawable != null && drawable.isStateful()) {
            this.f1924M.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1925N;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1925N.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1926O;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f1926O.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1924M;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1925N;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1926O;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1922K = findViewById(R.id.action_bar);
        this.f1923L = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f1921J && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int r4, int r5, int r6, int r7) {
        super.onLayout(z3, r4, r5, r6, r7);
        boolean z4 = true;
        if (this.f1927P) {
            Drawable drawable = this.f1926O;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z4 = false;
            }
        } else {
            if (this.f1924M != null) {
                if (this.f1922K.getVisibility() == 0) {
                    this.f1924M.setBounds(this.f1922K.getLeft(), this.f1922K.getTop(), this.f1922K.getRight(), this.f1922K.getBottom());
                } else {
                    View view = this.f1923L;
                    if (view != null && view.getVisibility() == 0) {
                        this.f1924M.setBounds(this.f1923L.getLeft(), this.f1923L.getTop(), this.f1923L.getRight(), this.f1923L.getBottom());
                    } else {
                        this.f1924M.setBounds(0, 0, 0, 0);
                    }
                }
            } else {
                z4 = false;
            }
            this.f1928Q = false;
        }
        if (z4) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r3, int r4) {
        int r02;
        if (this.f1922K == null && View.MeasureSpec.getMode(r4) == Integer.MIN_VALUE && (r02 = this.f1929R) >= 0) {
            r4 = View.MeasureSpec.makeMeasureSpec(Math.min(r02, View.MeasureSpec.getSize(r4)), Integer.MIN_VALUE);
        }
        super.onMeasure(r3, r4);
        if (this.f1922K == null) {
            return;
        }
        View.MeasureSpec.getMode(r4);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1924M;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1924M);
        }
        this.f1924M = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1922K;
            if (view != null) {
                this.f1924M.setBounds(view.getLeft(), this.f1922K.getTop(), this.f1922K.getRight(), this.f1922K.getBottom());
            }
        }
        boolean z3 = false;
        if (!this.f1927P ? !(this.f1924M != null || this.f1925N != null) : this.f1926O == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1926O;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1926O);
        }
        this.f1926O = drawable;
        boolean z3 = this.f1927P;
        boolean z4 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z3 && (drawable2 = this.f1926O) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z3 ? !(this.f1924M != null || this.f1925N != null) : this.f1926O == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f1925N;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1925N);
        }
        this.f1925N = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1928Q && this.f1925N != null) {
                throw null;
            }
        }
        boolean z3 = false;
        if (!this.f1927P ? !(this.f1924M != null || this.f1925N != null) : this.f1926O == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z3) {
        int r12;
        this.f1921J = z3;
        if (z3) {
            r12 = 393216;
        } else {
            r12 = 262144;
        }
        setDescendantFocusability(r12);
    }

    @Override // android.view.View
    public void setVisibility(int r3) {
        boolean z3;
        super.setVisibility(r3);
        if (r3 == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Drawable drawable = this.f1924M;
        if (drawable != null) {
            drawable.setVisible(z3, false);
        }
        Drawable drawable2 = this.f1925N;
        if (drawable2 != null) {
            drawable2.setVisible(z3, false);
        }
        Drawable drawable3 = this.f1926O;
        if (drawable3 != null) {
            drawable3.setVisible(z3, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1924M;
        boolean z3 = this.f1927P;
        if ((drawable == drawable2 && !z3) || ((drawable == this.f1925N && this.f1928Q) || ((drawable == this.f1926O && z3) || super.verifyDrawable(drawable)))) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int r3) {
        if (r3 != 0) {
            return super.startActionModeForChild(view, callback, r3);
        }
        return null;
    }

    public void setTabContainer(T t3) {
    }
}
