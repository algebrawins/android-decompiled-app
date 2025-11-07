package io.flutter.plugin.platform;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* loaded from: classes.dex */
public final class k extends ViewGroup {

    /* renamed from: J  reason: collision with root package name */
    public final Rect f3596J;

    /* renamed from: K  reason: collision with root package name */
    public final Rect f3597K;

    public k(Context context) {
        super(context);
        this.f3596J = new Rect();
        this.f3597K = new Rect();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int r12, int r13, int r14, int r15) {
        for (int r11 = 0; r11 < getChildCount(); r11++) {
            View childAt = getChildAt(r11);
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) childAt.getLayoutParams();
            this.f3596J.set(r12, r13, r14, r15);
            Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.f3596J, layoutParams.x, layoutParams.y, this.f3597K);
            Rect rect = this.f3597K;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int r6, int r7) {
        for (int r02 = 0; r02 < getChildCount(); r02++) {
            getChildAt(r02).measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(r6), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(r7), Integer.MIN_VALUE));
        }
        super.onMeasure(r6, r7);
    }
}
