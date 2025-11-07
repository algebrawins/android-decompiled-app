package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import p.C0421u;

/* loaded from: classes.dex */
public class DialogTitle extends C0421u {
    public DialogTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // p.C0421u, android.widget.TextView, android.view.View
    public final void onMeasure(int r7, int r8) {
        int lineCount;
        super.onMeasure(r7, r8);
        Layout layout = getLayout();
        if (layout != null && (lineCount = layout.getLineCount()) > 0 && layout.getEllipsisCount(lineCount - 1) > 0) {
            setSingleLine(false);
            setMaxLines(2);
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, i.a.f3401s, 16842817, 16973892);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                setTextSize(0, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            super.onMeasure(r7, r8);
        }
    }
}
