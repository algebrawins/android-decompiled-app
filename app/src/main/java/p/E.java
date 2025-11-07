package p;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class E extends ViewGroup.MarginLayoutParams {

    /* renamed from: a  reason: collision with root package name */
    public final float f4511a;

    /* renamed from: b  reason: collision with root package name */
    public int f4512b;

    public E(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4512b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.a.f3392j);
        this.f4511a = obtainStyledAttributes.getFloat(3, 0.0f);
        this.f4512b = obtainStyledAttributes.getInt(0, -1);
        obtainStyledAttributes.recycle();
    }

    public E(int r22) {
        super(r22, -2);
        this.f4512b = -1;
        this.f4511a = 0.0f;
    }

    public E(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f4512b = -1;
    }
}
