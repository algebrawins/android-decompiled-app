package androidx.appcompat.widget;

import A0.C0001b;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.example.catering_inventory.R;
import f0.w;
import java.lang.reflect.Field;
import m.C0349a;
import p.AbstractC0426z;
import p.C0420t;
import p.h0;
import p.w0;
import x1.D0;
import x1.E4;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: y0  reason: collision with root package name */
    public static final h0 f2023y0 = new Property(Float.class, "thumbPos");

    /* renamed from: z0  reason: collision with root package name */
    public static final int[] f2024z0 = {16842912};

    /* renamed from: J  reason: collision with root package name */
    public Drawable f2025J;

    /* renamed from: K  reason: collision with root package name */
    public ColorStateList f2026K;

    /* renamed from: L  reason: collision with root package name */
    public PorterDuff.Mode f2027L;

    /* renamed from: M  reason: collision with root package name */
    public boolean f2028M;

    /* renamed from: N  reason: collision with root package name */
    public boolean f2029N;

    /* renamed from: O  reason: collision with root package name */
    public Drawable f2030O;

    /* renamed from: P  reason: collision with root package name */
    public ColorStateList f2031P;

    /* renamed from: Q  reason: collision with root package name */
    public PorterDuff.Mode f2032Q;

    /* renamed from: R  reason: collision with root package name */
    public boolean f2033R;

    /* renamed from: S  reason: collision with root package name */
    public boolean f2034S;

    /* renamed from: T  reason: collision with root package name */
    public int f2035T;

    /* renamed from: U  reason: collision with root package name */
    public int f2036U;

    /* renamed from: V  reason: collision with root package name */
    public int f2037V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f2038W;
    public CharSequence a0;

    /* renamed from: b0  reason: collision with root package name */
    public CharSequence f2039b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f2040c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f2041d0;

    /* renamed from: e0  reason: collision with root package name */
    public final int f2042e0;

    /* renamed from: f0  reason: collision with root package name */
    public float f2043f0;

    /* renamed from: g0  reason: collision with root package name */
    public float f2044g0;

    /* renamed from: h0  reason: collision with root package name */
    public final VelocityTracker f2045h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f2046i0;
    public float j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f2047k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f2048l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f2049m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f2050n0;
    public int o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f2051p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f2052q0;

    /* renamed from: r0  reason: collision with root package name */
    public final TextPaint f2053r0;

    /* renamed from: s0  reason: collision with root package name */
    public final ColorStateList f2054s0;

    /* renamed from: t0  reason: collision with root package name */
    public StaticLayout f2055t0;

    /* renamed from: u0  reason: collision with root package name */
    public StaticLayout f2056u0;

    /* renamed from: v0  reason: collision with root package name */
    public final C0349a f2057v0;
    public ObjectAnimator w0;

    /* renamed from: x0  reason: collision with root package name */
    public final Rect f2058x0;

    /* JADX WARN: Type inference failed for: r1v2, types: [m.a, java.lang.Object] */
    public SwitchCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchStyle);
        Typeface typeface;
        Typeface create;
        int r8;
        int resourceId;
        this.f2026K = null;
        this.f2027L = null;
        this.f2028M = false;
        this.f2029N = false;
        this.f2031P = null;
        this.f2032Q = null;
        this.f2033R = false;
        this.f2034S = false;
        this.f2045h0 = VelocityTracker.obtain();
        this.f2058x0 = new Rect();
        TextPaint textPaint = new TextPaint(1);
        this.f2053r0 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        C0001b P3 = C0001b.P(context, attributeSet, i.a.f3400r, R.attr.switchStyle);
        Drawable E3 = P3.E(2);
        this.f2025J = E3;
        if (E3 != null) {
            E3.setCallback(this);
        }
        Drawable E4 = P3.E(11);
        this.f2030O = E4;
        if (E4 != null) {
            E4.setCallback(this);
        }
        TypedArray typedArray = (TypedArray) P3.f84K;
        this.a0 = typedArray.getText(0);
        this.f2039b0 = typedArray.getText(1);
        this.f2040c0 = typedArray.getBoolean(3, true);
        this.f2035T = typedArray.getDimensionPixelSize(8, 0);
        this.f2036U = typedArray.getDimensionPixelSize(5, 0);
        this.f2037V = typedArray.getDimensionPixelSize(6, 0);
        this.f2038W = typedArray.getBoolean(4, false);
        ColorStateList D3 = P3.D(9);
        if (D3 != null) {
            this.f2026K = D3;
            this.f2028M = true;
        }
        PorterDuff.Mode d4 = AbstractC0426z.d(typedArray.getInt(10, -1), null);
        if (this.f2027L != d4) {
            this.f2027L = d4;
            this.f2029N = true;
        }
        if (this.f2028M || this.f2029N) {
            a();
        }
        ColorStateList D4 = P3.D(12);
        if (D4 != null) {
            this.f2031P = D4;
            this.f2033R = true;
        }
        PorterDuff.Mode d5 = AbstractC0426z.d(typedArray.getInt(13, -1), null);
        if (this.f2032Q != d5) {
            this.f2032Q = d5;
            this.f2034S = true;
        }
        if (this.f2033R || this.f2034S) {
            b();
        }
        int resourceId2 = typedArray.getResourceId(7, 0);
        if (resourceId2 != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId2, i.a.f3401s);
            ColorStateList colorStateList = (!obtainStyledAttributes.hasValue(3) || (resourceId = obtainStyledAttributes.getResourceId(3, 0)) == 0 || (colorStateList = j.b.b(context, resourceId)) == null) ? obtainStyledAttributes.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.f2054s0 = colorStateList;
            } else {
                this.f2054s0 = getTextColors();
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f2 = dimensionPixelSize;
                if (f2 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f2);
                    requestLayout();
                }
            }
            int r9 = obtainStyledAttributes.getInt(1, -1);
            int r10 = obtainStyledAttributes.getInt(2, -1);
            if (r9 != 1) {
                if (r9 != 2) {
                    if (r9 != 3) {
                        typeface = null;
                    } else {
                        typeface = Typeface.MONOSPACE;
                    }
                } else {
                    typeface = Typeface.SERIF;
                }
            } else {
                typeface = Typeface.SANS_SERIF;
            }
            if (r10 > 0) {
                if (typeface == null) {
                    create = Typeface.defaultFromStyle(r10);
                } else {
                    create = Typeface.create(typeface, r10);
                }
                setSwitchTypeface(create);
                if (create != null) {
                    r8 = create.getStyle();
                } else {
                    r8 = 0;
                }
                int r82 = (~r8) & r10;
                textPaint.setFakeBoldText((r82 & 1) != 0);
                textPaint.setTextSkewX((r82 & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (obtainStyledAttributes.getBoolean(14, false)) {
                Context context2 = getContext();
                ?? obj = new Object();
                obj.f4115a = context2.getResources().getConfiguration().locale;
                this.f2057v0 = obj;
            } else {
                this.f2057v0 = null;
            }
            obtainStyledAttributes.recycle();
        }
        new C0420t(this).d(attributeSet, R.attr.switchStyle);
        P3.S();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2042e0 = viewConfiguration.getScaledTouchSlop();
        this.f2046i0 = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    private boolean getTargetCheckedState() {
        if (this.j0 > 0.5f) {
            return true;
        }
        return false;
    }

    private int getThumbOffset() {
        float f2;
        if (w0.a(this)) {
            f2 = 1.0f - this.j0;
        } else {
            f2 = this.j0;
        }
        return (int) ((f2 * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f2030O;
        if (drawable != null) {
            Rect rect2 = this.f2058x0;
            drawable.getPadding(rect2);
            Drawable drawable2 = this.f2025J;
            if (drawable2 != null) {
                rect = AbstractC0426z.c(drawable2);
            } else {
                rect = AbstractC0426z.f4743c;
            }
            return ((((this.f2047k0 - this.f2049m0) - rect2.left) - rect2.right) - rect.left) - rect.right;
        }
        return 0;
    }

    public final void a() {
        Drawable drawable = this.f2025J;
        if (drawable != null) {
            if (this.f2028M || this.f2029N) {
                Drawable mutate = D0.c(drawable).mutate();
                this.f2025J = mutate;
                if (this.f2028M) {
                    Z.a.h(mutate, this.f2026K);
                }
                if (this.f2029N) {
                    Z.a.i(this.f2025J, this.f2027L);
                }
                if (this.f2025J.isStateful()) {
                    this.f2025J.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f2030O;
        if (drawable != null) {
            if (this.f2033R || this.f2034S) {
                Drawable mutate = D0.c(drawable).mutate();
                this.f2030O = mutate;
                if (this.f2033R) {
                    Z.a.h(mutate, this.f2031P);
                }
                if (this.f2034S) {
                    Z.a.i(this.f2030O, this.f2032Q);
                }
                if (this.f2030O.isStateful()) {
                    this.f2030O.setState(getDrawableState());
                }
            }
        }
    }

    public final StaticLayout c(CharSequence charSequence) {
        int r3;
        C0349a c0349a = this.f2057v0;
        if (c0349a != null) {
            charSequence = c0349a.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.f2053r0;
        if (charSequence2 != null) {
            r3 = (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint));
        } else {
            r3 = 0;
        }
        return new StaticLayout(charSequence2, textPaint, r3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Rect rect;
        int r6;
        int r5;
        int r02 = this.f2050n0;
        int r12 = this.o0;
        int r22 = this.f2051p0;
        int r3 = this.f2052q0;
        int thumbOffset = getThumbOffset() + r02;
        Drawable drawable = this.f2025J;
        if (drawable != null) {
            rect = AbstractC0426z.c(drawable);
        } else {
            rect = AbstractC0426z.f4743c;
        }
        Drawable drawable2 = this.f2030O;
        Rect rect2 = this.f2058x0;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int r62 = rect2.left;
            thumbOffset += r62;
            if (rect != null) {
                int r8 = rect.left;
                if (r8 > r62) {
                    r02 += r8 - r62;
                }
                int r63 = rect.top;
                int r82 = rect2.top;
                if (r63 > r82) {
                    r6 = (r63 - r82) + r12;
                } else {
                    r6 = r12;
                }
                int r83 = rect.right;
                int r9 = rect2.right;
                if (r83 > r9) {
                    r22 -= r83 - r9;
                }
                int r52 = rect.bottom;
                int r84 = rect2.bottom;
                if (r52 > r84) {
                    r5 = r3 - (r52 - r84);
                    this.f2030O.setBounds(r02, r6, r22, r5);
                }
            } else {
                r6 = r12;
            }
            r5 = r3;
            this.f2030O.setBounds(r02, r6, r22, r5);
        }
        Drawable drawable3 = this.f2025J;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int r03 = thumbOffset - rect2.left;
            int r4 = thumbOffset + this.f2049m0 + rect2.right;
            this.f2025J.setBounds(r03, r12, r4, r3);
            Drawable background = getBackground();
            if (background != null) {
                Z.a.f(background, r03, r12, r4, r3);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f2, float f4) {
        super.drawableHotspotChanged(f2, f4);
        Drawable drawable = this.f2025J;
        if (drawable != null) {
            Z.a.e(drawable, f2, f4);
        }
        Drawable drawable2 = this.f2030O;
        if (drawable2 != null) {
            Z.a.e(drawable2, f2, f4);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        boolean z3;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2025J;
        if (drawable != null && drawable.isStateful()) {
            z3 = drawable.setState(drawableState);
        } else {
            z3 = false;
        }
        Drawable drawable2 = this.f2030O;
        if (drawable2 != null && drawable2.isStateful()) {
            z3 |= drawable2.setState(drawableState);
        }
        if (z3) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!w0.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f2047k0;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft + this.f2037V;
        }
        return compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (w0.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f2047k0;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.f2037V;
        }
        return compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f2040c0;
    }

    public boolean getSplitTrack() {
        return this.f2038W;
    }

    public int getSwitchMinWidth() {
        return this.f2036U;
    }

    public int getSwitchPadding() {
        return this.f2037V;
    }

    public CharSequence getTextOff() {
        return this.f2039b0;
    }

    public CharSequence getTextOn() {
        return this.a0;
    }

    public Drawable getThumbDrawable() {
        return this.f2025J;
    }

    public int getThumbTextPadding() {
        return this.f2035T;
    }

    public ColorStateList getThumbTintList() {
        return this.f2026K;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f2027L;
    }

    public Drawable getTrackDrawable() {
        return this.f2030O;
    }

    public ColorStateList getTrackTintList() {
        return this.f2031P;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f2032Q;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2025J;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f2030O;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.w0;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.w0.end();
            this.w0 = null;
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int r22) {
        int[] onCreateDrawableState = super.onCreateDrawableState(r22 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f2024z0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        StaticLayout staticLayout;
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f2030O;
        Rect rect = this.f2058x0;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int r22 = this.o0;
        int r3 = this.f2052q0;
        int r23 = r22 + rect.top;
        int r32 = r3 - rect.bottom;
        Drawable drawable2 = this.f2025J;
        if (drawable != null) {
            if (this.f2038W && drawable2 != null) {
                Rect c4 = AbstractC0426z.c(drawable2);
                drawable2.copyBounds(rect);
                rect.left += c4.left;
                rect.right -= c4.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            staticLayout = this.f2055t0;
        } else {
            staticLayout = this.f2056u0;
        }
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f2054s0;
            TextPaint textPaint = this.f2053r0;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((r23 + r32) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (isChecked()) {
            charSequence = this.a0;
        } else {
            charSequence = this.f2039b0;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z3, int r3, int r4, int r5, int r6) {
        int r52;
        int width;
        int r22;
        int r53;
        int r32;
        super.onLayout(z3, r3, r4, r5, r6);
        int r33 = 0;
        if (this.f2025J != null) {
            Drawable drawable = this.f2030O;
            Rect rect = this.f2058x0;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect c4 = AbstractC0426z.c(this.f2025J);
            r52 = Math.max(0, c4.left - rect.left);
            r33 = Math.max(0, c4.right - rect.right);
        } else {
            r52 = 0;
        }
        if (w0.a(this)) {
            r22 = getPaddingLeft() + r52;
            width = ((this.f2047k0 + r22) - r52) - r33;
        } else {
            width = (getWidth() - getPaddingRight()) - r33;
            r22 = (width - this.f2047k0) + r52 + r33;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                r32 = getPaddingTop();
                r53 = this.f2048l0 + r32;
            } else {
                r53 = getHeight() - getPaddingBottom();
                r32 = r53 - this.f2048l0;
            }
        } else {
            int paddingTop = getPaddingTop();
            int r34 = this.f2048l0;
            int height = (((getHeight() + paddingTop) - getPaddingBottom()) / 2) - (r34 / 2);
            r53 = r34 + height;
            r32 = height;
        }
        this.f2050n0 = r22;
        this.o0 = r32;
        this.f2052q0 = r53;
        this.f2051p0 = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int r7, int r8) {
        int r02;
        int r3;
        int r5;
        if (this.f2040c0) {
            if (this.f2055t0 == null) {
                this.f2055t0 = c(this.a0);
            }
            if (this.f2056u0 == null) {
                this.f2056u0 = c(this.f2039b0);
            }
        }
        Drawable drawable = this.f2025J;
        int r12 = 0;
        Rect rect = this.f2058x0;
        if (drawable != null) {
            drawable.getPadding(rect);
            r02 = (this.f2025J.getIntrinsicWidth() - rect.left) - rect.right;
            r3 = this.f2025J.getIntrinsicHeight();
        } else {
            r02 = 0;
            r3 = 0;
        }
        if (this.f2040c0) {
            r5 = (this.f2035T * 2) + Math.max(this.f2055t0.getWidth(), this.f2056u0.getWidth());
        } else {
            r5 = 0;
        }
        this.f2049m0 = Math.max(r5, r02);
        Drawable drawable2 = this.f2030O;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            r12 = this.f2030O.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int r03 = rect.left;
        int r22 = rect.right;
        Drawable drawable3 = this.f2025J;
        if (drawable3 != null) {
            Rect c4 = AbstractC0426z.c(drawable3);
            r03 = Math.max(r03, c4.left);
            r22 = Math.max(r22, c4.right);
        }
        int max = Math.max(this.f2036U, (this.f2049m0 * 2) + r03 + r22);
        int max2 = Math.max(r12, r3);
        this.f2047k0 = max;
        this.f2048l0 = max2;
        super.onMeasure(r7, r8);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.a0;
        } else {
            charSequence = this.f2039b0;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r1 != 3) goto L7;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z3) {
        super.setChecked(z3);
        boolean isChecked = isChecked();
        float f2 = 0.0f;
        if (getWindowToken() != null) {
            Field field = w.f3200a;
            if (isLaidOut()) {
                if (isChecked) {
                    f2 = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f2023y0, f2);
                this.w0 = ofFloat;
                ofFloat.setDuration(250L);
                this.w0.setAutoCancel(true);
                this.w0.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.w0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (isChecked) {
            f2 = 1.0f;
        }
        setThumbPosition(f2);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(E4.d(callback, this));
    }

    public void setShowText(boolean z3) {
        if (this.f2040c0 != z3) {
            this.f2040c0 = z3;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z3) {
        this.f2038W = z3;
        invalidate();
    }

    public void setSwitchMinWidth(int r12) {
        this.f2036U = r12;
        requestLayout();
    }

    public void setSwitchPadding(int r12) {
        this.f2037V = r12;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f2053r0;
        if ((textPaint.getTypeface() != null && !textPaint.getTypeface().equals(typeface)) || (textPaint.getTypeface() == null && typeface != null)) {
            textPaint.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        this.f2039b0 = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.a0 = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f2025J;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2025J = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f2) {
        this.j0 = f2;
        invalidate();
    }

    public void setThumbResource(int r22) {
        setThumbDrawable(j.b.c(getContext(), r22));
    }

    public void setThumbTextPadding(int r12) {
        this.f2035T = r12;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f2026K = colorStateList;
        this.f2028M = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f2027L = mode;
        this.f2029N = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f2030O;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f2030O = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int r22) {
        setTrackDrawable(j.b.c(getContext(), r22));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f2031P = colorStateList;
        this.f2033R = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f2032Q = mode;
        this.f2034S = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f2025J && drawable != this.f2030O) {
            return false;
        }
        return true;
    }
}
