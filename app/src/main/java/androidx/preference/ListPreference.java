package androidx.preference;

import X.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import com.example.catering_inventory.R;
import h1.C0287g;
import x0.AbstractC0561b;
import x0.InterfaceC0560a;

/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* renamed from: Q  reason: collision with root package name */
    public final CharSequence[] f2495Q;

    /* renamed from: R  reason: collision with root package name */
    public final String f2496R;

    /* JADX WARN: Type inference failed for: r2v9, types: [h1.g, java.lang.Object] */
    public ListPreference(Context context, AttributeSet attributeSet, int r7) {
        super(context, attributeSet, r7);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0561b.f5484d, r7, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(2);
        this.f2495Q = textArray == null ? obtainStyledAttributes.getTextArray(0) : textArray;
        if (obtainStyledAttributes.getTextArray(3) == null) {
            obtainStyledAttributes.getTextArray(1);
        }
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (C0287g.f3267K == null) {
                C0287g.f3267K = new Object();
            }
            this.f2503P = C0287g.f3267K;
            b();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0561b.f5486f, r7, 0);
        this.f2496R = b.d(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final CharSequence a() {
        InterfaceC0560a interfaceC0560a = this.f2503P;
        if (interfaceC0560a != null) {
            return interfaceC0560a.g(this);
        }
        CharSequence a4 = super.a();
        String str = this.f2496R;
        if (str == null) {
            return a4;
        }
        String format = String.format(str, "");
        if (TextUtils.equals(format, a4)) {
            return a4;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int r22) {
        return typedArray.getString(r22);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.a(context, R.attr.dialogPreferenceStyle, 16842897));
    }
}
