package androidx.preference;

import X.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.example.catering_inventory.R;
import x0.AbstractC0561b;

/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public DialogPreference(Context context, AttributeSet attributeSet, int r5) {
        super(context, attributeSet, r5);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0561b.f5482b, r5, 0);
        b.d(obtainStyledAttributes, 9, 0);
        b.d(obtainStyledAttributes, 8, 1);
        if (obtainStyledAttributes.getDrawable(6) == null) {
            obtainStyledAttributes.getDrawable(2);
        }
        b.d(obtainStyledAttributes, 11, 3);
        b.d(obtainStyledAttributes, 10, 4);
        obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.a(context, R.attr.dialogPreferenceStyle, 16842897));
    }
}
