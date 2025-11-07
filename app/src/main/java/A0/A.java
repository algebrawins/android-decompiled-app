package A0;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class A extends ViewGroup.MarginLayoutParams {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f31a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f32b;

    public A(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31a = new Rect();
        this.f32b = true;
    }

    public A(int r12, int r22) {
        super(r12, r22);
        this.f31a = new Rect();
        this.f32b = true;
    }

    public A(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f31a = new Rect();
        this.f32b = true;
    }

    public A(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f31a = new Rect();
        this.f32b = true;
    }

    public A(A a4) {
        super((ViewGroup.LayoutParams) a4);
        this.f31a = new Rect();
        this.f32b = true;
    }
}
