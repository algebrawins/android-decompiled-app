package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import i.a;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {
    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f3398p);
        obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
