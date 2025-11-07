package p;

import A0.C0001b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public abstract class F extends ViewGroup {

    /* renamed from: J  reason: collision with root package name */
    public boolean f4513J;

    /* renamed from: K  reason: collision with root package name */
    public int f4514K;

    /* renamed from: L  reason: collision with root package name */
    public int f4515L;

    /* renamed from: M  reason: collision with root package name */
    public int f4516M;

    /* renamed from: N  reason: collision with root package name */
    public int f4517N;

    /* renamed from: O  reason: collision with root package name */
    public int f4518O;

    /* renamed from: P  reason: collision with root package name */
    public float f4519P;

    /* renamed from: Q  reason: collision with root package name */
    public boolean f4520Q;

    /* renamed from: R  reason: collision with root package name */
    public int[] f4521R;

    /* renamed from: S  reason: collision with root package name */
    public int[] f4522S;

    /* renamed from: T  reason: collision with root package name */
    public Drawable f4523T;

    /* renamed from: U  reason: collision with root package name */
    public int f4524U;

    /* renamed from: V  reason: collision with root package name */
    public int f4525V;

    /* renamed from: W  reason: collision with root package name */
    public int f4526W;
    public int a0;

    public F(Context context, AttributeSet attributeSet, int r7) {
        super(context, attributeSet, r7);
        this.f4513J = true;
        this.f4514K = -1;
        this.f4515L = 0;
        this.f4517N = 8388659;
        C0001b P3 = C0001b.P(context, attributeSet, i.a.f3391i, r7);
        TypedArray typedArray = (TypedArray) P3.f84K;
        int r72 = typedArray.getInt(1, -1);
        if (r72 >= 0) {
            setOrientation(r72);
        }
        int r73 = typedArray.getInt(0, -1);
        if (r73 >= 0) {
            setGravity(r73);
        }
        boolean z3 = typedArray.getBoolean(2, true);
        if (!z3) {
            setBaselineAligned(z3);
        }
        this.f4519P = typedArray.getFloat(4, -1.0f);
        this.f4514K = typedArray.getInt(3, -1);
        this.f4520Q = typedArray.getBoolean(7, false);
        setDividerDrawable(P3.E(5));
        this.f4526W = typedArray.getInt(8, 0);
        this.a0 = typedArray.getDimensionPixelSize(6, 0);
        P3.S();
    }

    public final void b(Canvas canvas, int r6) {
        this.f4523T.setBounds(getPaddingLeft() + this.a0, r6, (getWidth() - getPaddingRight()) - this.a0, this.f4525V + r6);
        this.f4523T.draw(canvas);
    }

    public final void c(Canvas canvas, int r7) {
        this.f4523T.setBounds(r7, getPaddingTop() + this.a0, this.f4524U + r7, (getHeight() - getPaddingBottom()) - this.a0);
        this.f4523T.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof E;
    }

    @Override // android.view.ViewGroup
    /* renamed from: d */
    public E generateDefaultLayoutParams() {
        int r02 = this.f4516M;
        if (r02 == 0) {
            return new E(-2);
        }
        if (r02 == 1) {
            return new E(-1);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: e */
    public E generateLayoutParams(AttributeSet attributeSet) {
        return new E(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f */
    public E generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new E(layoutParams);
    }

    public final boolean g(int r5) {
        if (r5 == 0) {
            if ((this.f4526W & 1) == 0) {
                return false;
            }
            return true;
        } else if (r5 == getChildCount()) {
            if ((this.f4526W & 4) == 0) {
                return false;
            }
            return true;
        } else if ((this.f4526W & 2) == 0) {
            return false;
        } else {
            for (int r52 = r5 - 1; r52 >= 0; r52--) {
                if (getChildAt(r52).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        int r3;
        if (this.f4514K < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int r12 = this.f4514K;
        if (childCount > r12) {
            View childAt = getChildAt(r12);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f4514K == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int r22 = this.f4515L;
            if (this.f4516M == 1 && (r3 = this.f4517N & 112) != 48) {
                if (r3 != 16) {
                    if (r3 == 80) {
                        r22 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f4518O;
                    }
                } else {
                    r22 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f4518O) / 2;
                }
            }
            return r22 + ((ViewGroup.MarginLayoutParams) ((E) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f4514K;
    }

    public Drawable getDividerDrawable() {
        return this.f4523T;
    }

    public int getDividerPadding() {
        return this.a0;
    }

    public int getDividerWidth() {
        return this.f4524U;
    }

    public int getGravity() {
        return this.f4517N;
    }

    public int getOrientation() {
        return this.f4516M;
    }

    public int getShowDividers() {
        return this.f4526W;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f4519P;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int r12;
        int left2;
        int bottom;
        if (this.f4523T == null) {
            return;
        }
        int r22 = 0;
        if (this.f4516M == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (r22 < virtualChildCount) {
                View childAt = getChildAt(r22);
                if (childAt != null && childAt.getVisibility() != 8 && g(r22)) {
                    b(canvas, (childAt.getTop() - ((ViewGroup.MarginLayoutParams) ((E) childAt.getLayoutParams())).topMargin) - this.f4525V);
                }
                r22++;
            }
            if (g(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.f4525V;
                } else {
                    bottom = childAt2.getBottom() + ((ViewGroup.MarginLayoutParams) ((E) childAt2.getLayoutParams())).bottomMargin;
                }
                b(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a4 = w0.a(this);
        while (r22 < virtualChildCount2) {
            View childAt3 = getChildAt(r22);
            if (childAt3 != null && childAt3.getVisibility() != 8 && g(r22)) {
                E e4 = (E) childAt3.getLayoutParams();
                if (a4) {
                    left2 = childAt3.getRight() + ((ViewGroup.MarginLayoutParams) e4).rightMargin;
                } else {
                    left2 = (childAt3.getLeft() - ((ViewGroup.MarginLayoutParams) e4).leftMargin) - this.f4524U;
                }
                c(canvas, left2);
            }
            r22++;
        }
        if (g(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 == null) {
                if (a4) {
                    right = getPaddingLeft();
                } else {
                    left = getWidth() - getPaddingRight();
                    r12 = this.f4524U;
                    right = left - r12;
                }
            } else {
                E e5 = (E) childAt4.getLayoutParams();
                if (a4) {
                    left = childAt4.getLeft() - ((ViewGroup.MarginLayoutParams) e5).leftMargin;
                    r12 = this.f4524U;
                    right = left - r12;
                } else {
                    right = childAt4.getRight() + ((ViewGroup.MarginLayoutParams) e5).rightMargin;
                }
            }
            c(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.F.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x02db, code lost:
        if (((android.view.ViewGroup.MarginLayoutParams) r9).width == (-1)) goto L177;
     */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0857  */
    /* JADX WARN: Removed duplicated region for block: B:444:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 2199
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.F.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z3) {
        this.f4513J = z3;
    }

    public void setBaselineAlignedChildIndex(int r3) {
        if (r3 >= 0 && r3 < getChildCount()) {
            this.f4514K = r3;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f4523T) {
            return;
        }
        this.f4523T = drawable;
        boolean z3 = false;
        if (drawable != null) {
            this.f4524U = drawable.getIntrinsicWidth();
            this.f4525V = drawable.getIntrinsicHeight();
        } else {
            this.f4524U = 0;
            this.f4525V = 0;
        }
        if (drawable == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        requestLayout();
    }

    public void setDividerPadding(int r12) {
        this.a0 = r12;
    }

    public void setGravity(int r22) {
        if (this.f4517N != r22) {
            if ((8388615 & r22) == 0) {
                r22 |= 8388611;
            }
            if ((r22 & 112) == 0) {
                r22 |= 48;
            }
            this.f4517N = r22;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int r3) {
        int r32 = r3 & 8388615;
        int r12 = this.f4517N;
        if ((8388615 & r12) != r32) {
            this.f4517N = r32 | ((-8388616) & r12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z3) {
        this.f4520Q = z3;
    }

    public void setOrientation(int r22) {
        if (this.f4516M != r22) {
            this.f4516M = r22;
            requestLayout();
        }
    }

    public void setShowDividers(int r22) {
        if (r22 != this.f4526W) {
            requestLayout();
        }
        this.f4526W = r22;
    }

    public void setVerticalGravity(int r3) {
        int r32 = r3 & 112;
        int r02 = this.f4517N;
        if ((r02 & 112) != r32) {
            this.f4517N = r32 | (r02 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f4519P = Math.max(0.0f, f2);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
