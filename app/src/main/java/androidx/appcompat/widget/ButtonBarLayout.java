package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.example.catering_inventory.R;
import f0.w;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: J  reason: collision with root package name */
    public boolean f1974J;

    /* renamed from: K  reason: collision with root package name */
    public int f1975K;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1975K = -1;
        int[] r02 = i.a.f3390h;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r02);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, r02, attributeSet, obtainStyledAttributes, 0, 0);
        }
        this.f1974J = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    private void setStacked(boolean z3) {
        int r02;
        int r22;
        setOrientation(z3 ? 1 : 0);
        if (z3) {
            r02 = 5;
        } else {
            r02 = 80;
        }
        setGravity(r02);
        View findViewById = findViewById(R.id.spacer);
        if (findViewById != null) {
            if (z3) {
                r22 = 8;
            } else {
                r22 = 4;
            }
            findViewById.setVisibility(r22);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(0, super.getMinimumHeight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r6, int r7) {
        boolean z3;
        int r02;
        boolean z4;
        int r03;
        int size = View.MeasureSpec.getSize(r6);
        int r3 = 0;
        if (this.f1974J) {
            if (size > this.f1975K && getOrientation() == 1) {
                setStacked(false);
            }
            this.f1975K = size;
        }
        if (getOrientation() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 && View.MeasureSpec.getMode(r6) == 1073741824) {
            r02 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z4 = true;
        } else {
            r02 = r6;
            z4 = false;
        }
        super.onMeasure(r02, r7);
        if (this.f1974J && getOrientation() != 1 && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z4 = true;
        }
        if (z4) {
            super.onMeasure(r6, r7);
        }
        int childCount = getChildCount();
        int r72 = 0;
        while (true) {
            r03 = -1;
            if (r72 < childCount) {
                if (getChildAt(r72).getVisibility() == 0) {
                    break;
                }
                r72++;
            } else {
                r72 = -1;
                break;
            }
        }
        if (r72 >= 0) {
            View childAt = getChildAt(r72);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (getOrientation() == 1) {
                r3 = 1;
            }
            if (r3 != 0) {
                int r73 = r72 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (r73 >= childCount2) {
                        break;
                    } else if (getChildAt(r73).getVisibility() == 0) {
                        r03 = r73;
                        break;
                    } else {
                        r73++;
                    }
                }
                if (r03 >= 0) {
                    r3 = getChildAt(r03).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight;
                } else {
                    r3 = measuredHeight;
                }
            } else {
                r3 = getPaddingBottom() + measuredHeight;
            }
        }
        Field field = w.f3200a;
        if (getMinimumHeight() != r3) {
            setMinimumHeight(r3);
        }
    }

    public void setAllowStacking(boolean z3) {
        if (this.f1974J != z3) {
            this.f1974J = z3;
            if (!z3 && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
