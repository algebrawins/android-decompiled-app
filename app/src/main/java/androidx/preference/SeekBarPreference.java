package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.example.catering_inventory.R;
import x0.AbstractC0561b;

/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* renamed from: Q  reason: collision with root package name */
    public final int f2504Q;

    /* renamed from: R  reason: collision with root package name */
    public final int f2505R;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0561b.f5488i, R.attr.seekBarPreferenceStyle, 0);
        int r6 = obtainStyledAttributes.getInt(3, 0);
        int r12 = obtainStyledAttributes.getInt(1, 100);
        r12 = r12 < r6 ? r6 : r12;
        if (r12 != this.f2504Q) {
            this.f2504Q = r12;
        }
        int r13 = obtainStyledAttributes.getInt(4, 0);
        if (r13 != this.f2505R) {
            this.f2505R = Math.min(this.f2504Q - r6, Math.abs(r13));
        }
        obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.getBoolean(5, false);
        obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int r3) {
        return Integer.valueOf(typedArray.getInt(r3, 0));
    }
}
