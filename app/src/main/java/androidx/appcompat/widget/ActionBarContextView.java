package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.catering_inventory.R;
import f0.w;
import java.lang.reflect.Field;
import p.w0;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: J  reason: collision with root package name */
    public int f1930J;

    /* renamed from: K  reason: collision with root package name */
    public boolean f1931K;

    /* renamed from: L  reason: collision with root package name */
    public boolean f1932L;

    /* renamed from: M  reason: collision with root package name */
    public CharSequence f1933M;

    /* renamed from: N  reason: collision with root package name */
    public CharSequence f1934N;

    /* renamed from: O  reason: collision with root package name */
    public View f1935O;

    /* renamed from: P  reason: collision with root package name */
    public LinearLayout f1936P;

    /* renamed from: Q  reason: collision with root package name */
    public TextView f1937Q;

    /* renamed from: R  reason: collision with root package name */
    public TextView f1938R;

    /* renamed from: S  reason: collision with root package name */
    public final int f1939S;

    /* renamed from: T  reason: collision with root package name */
    public final int f1940T;

    /* renamed from: U  reason: collision with root package name */
    public boolean f1941U;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        Drawable drawable;
        int resourceId;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.a.f3387d, R.attr.actionModeStyle, 0);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = j.b.c(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        Field field = w.f3200a;
        setBackground(drawable);
        this.f1939S = obtainStyledAttributes.getResourceId(5, 0);
        this.f1940T = obtainStyledAttributes.getResourceId(4, 0);
        this.f1930J = obtainStyledAttributes.getLayoutDimension(3, 0);
        obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int b(View view, int r3, int r4, int r5, boolean z3) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int r52 = ((r5 - measuredHeight) / 2) + r4;
        if (z3) {
            view.layout(r3 - measuredWidth, r52, r3, measuredHeight + r52);
        } else {
            view.layout(r3, r52, r3 + measuredWidth, measuredHeight + r52);
        }
        if (z3) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    public final void a() {
        int r5;
        if (this.f1936P == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1936P = linearLayout;
            this.f1937Q = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f1938R = (TextView) this.f1936P.findViewById(R.id.action_bar_subtitle);
            int r02 = this.f1939S;
            if (r02 != 0) {
                this.f1937Q.setTextAppearance(getContext(), r02);
            }
            int r03 = this.f1940T;
            if (r03 != 0) {
                this.f1938R.setTextAppearance(getContext(), r03);
            }
        }
        this.f1937Q.setText(this.f1933M);
        this.f1938R.setText(this.f1934N);
        boolean isEmpty = TextUtils.isEmpty(this.f1933M);
        boolean isEmpty2 = TextUtils.isEmpty(this.f1934N);
        TextView textView = this.f1938R;
        int r3 = 8;
        if (!isEmpty2) {
            r5 = 0;
        } else {
            r5 = 8;
        }
        textView.setVisibility(r5);
        this.f1936P.setVisibility((isEmpty && isEmpty2) ? 0 : 0);
        if (this.f1936P.getParent() == null) {
            addView(this.f1936P);
        }
    }

    @Override // android.view.View
    /* renamed from: c */
    public final void setVisibility(int r22) {
        if (r22 != getVisibility()) {
            super.setVisibility(r22);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f1930J;
    }

    public CharSequence getSubtitle() {
        return this.f1934N;
    }

    public CharSequence getTitle() {
        return this.f1933M;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, i.a.f3384a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1932L = false;
        }
        if (!this.f1932L) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1932L = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1932L = false;
        }
        return true;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.f1933M);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int r3, int r4, int r5, int r6) {
        int paddingLeft;
        boolean a4 = w0.a(this);
        if (a4) {
            paddingLeft = (r5 - r3) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((r6 - r4) - getPaddingTop()) - getPaddingBottom();
        LinearLayout linearLayout = this.f1936P;
        if (linearLayout != null && this.f1935O == null && linearLayout.getVisibility() != 8) {
            paddingLeft += b(this.f1936P, paddingLeft, paddingTop, paddingTop2, a4);
        }
        View view = this.f1935O;
        if (view != null) {
            b(view, paddingLeft, paddingTop, paddingTop2, a4);
        }
        if (a4) {
            getPaddingLeft();
        } else {
            getPaddingRight();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int r11, int r12) {
        int r9;
        boolean z3;
        int r6;
        int r13 = 1073741824;
        if (View.MeasureSpec.getMode(r11) == 1073741824) {
            if (View.MeasureSpec.getMode(r12) != 0) {
                int size = View.MeasureSpec.getSize(r11);
                int r02 = this.f1930J;
                if (r02 <= 0) {
                    r02 = View.MeasureSpec.getSize(r12);
                }
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int r3 = r02 - paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(r3, Integer.MIN_VALUE);
                LinearLayout linearLayout = this.f1936P;
                if (linearLayout != null && this.f1935O == null) {
                    if (this.f1941U) {
                        this.f1936P.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.f1936P.getMeasuredWidth();
                        if (measuredWidth <= paddingLeft) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            paddingLeft -= measuredWidth;
                        }
                        LinearLayout linearLayout2 = this.f1936P;
                        if (z3) {
                            r6 = 0;
                        } else {
                            r6 = 8;
                        }
                        linearLayout2.setVisibility(r6);
                    } else {
                        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), makeMeasureSpec);
                        paddingLeft = Math.max(0, paddingLeft - linearLayout.getMeasuredWidth());
                    }
                }
                View view = this.f1935O;
                if (view != null) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    int r62 = layoutParams.width;
                    if (r62 != -2) {
                        r9 = 1073741824;
                    } else {
                        r9 = Integer.MIN_VALUE;
                    }
                    if (r62 >= 0) {
                        paddingLeft = Math.min(r62, paddingLeft);
                    }
                    int r5 = layoutParams.height;
                    if (r5 == -2) {
                        r13 = Integer.MIN_VALUE;
                    }
                    if (r5 >= 0) {
                        r3 = Math.min(r5, r3);
                    }
                    this.f1935O.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, r9), View.MeasureSpec.makeMeasureSpec(r3, r13));
                }
                if (this.f1930J <= 0) {
                    int childCount = getChildCount();
                    int r03 = 0;
                    for (int r7 = 0; r7 < childCount; r7++) {
                        int measuredHeight = getChildAt(r7).getMeasuredHeight() + paddingBottom;
                        if (measuredHeight > r03) {
                            r03 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size, r03);
                    return;
                }
                setMeasuredDimension(size, r02);
                return;
            }
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1931K = false;
        }
        if (!this.f1931K) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1931K = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1931K = false;
        }
        return true;
    }

    public void setContentHeight(int r12) {
        this.f1930J = r12;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1935O;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1935O = view;
        if (view != null && (linearLayout = this.f1936P) != null) {
            removeView(linearLayout);
            this.f1936P = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1934N = charSequence;
        a();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1933M = charSequence;
        a();
    }

    public void setTitleOptional(boolean z3) {
        if (z3 != this.f1941U) {
            requestLayout();
        }
        this.f1941U = z3;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
