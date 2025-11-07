package androidx.preference.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import x0.AbstractC0561b;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class PreferenceImageView extends ImageView {

    /* renamed from: J  reason: collision with root package name */
    public int f2506J;

    /* renamed from: K  reason: collision with root package name */
    public int f2507K;

    public PreferenceImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2506J = Integer.MAX_VALUE;
        this.f2507K = Integer.MAX_VALUE;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0561b.f5487h, 0, 0);
        setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(3, Integer.MAX_VALUE));
        setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(2, Integer.MAX_VALUE));
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.ImageView
    public int getMaxHeight() {
        return this.f2507K;
    }

    @Override // android.widget.ImageView
    public int getMaxWidth() {
        return this.f2506J;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int r6, int r7) {
        int mode = View.MeasureSpec.getMode(r6);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int size = View.MeasureSpec.getSize(r6);
            int maxWidth = getMaxWidth();
            if (maxWidth != Integer.MAX_VALUE && (maxWidth < size || mode == 0)) {
                r6 = View.MeasureSpec.makeMeasureSpec(maxWidth, Integer.MIN_VALUE);
            }
        }
        int mode2 = View.MeasureSpec.getMode(r7);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int size2 = View.MeasureSpec.getSize(r7);
            int maxHeight = getMaxHeight();
            if (maxHeight != Integer.MAX_VALUE && (maxHeight < size2 || mode2 == 0)) {
                r7 = View.MeasureSpec.makeMeasureSpec(maxHeight, Integer.MIN_VALUE);
            }
        }
        super.onMeasure(r6, r7);
    }

    @Override // android.widget.ImageView
    public void setMaxHeight(int r12) {
        this.f2507K = r12;
        super.setMaxHeight(r12);
    }

    @Override // android.widget.ImageView
    public void setMaxWidth(int r12) {
        this.f2506J = r12;
        super.setMaxWidth(r12);
    }
}
