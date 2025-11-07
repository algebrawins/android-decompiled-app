package androidx.preference;

import X.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.example.catering_inventory.R;
import x0.AbstractC0561b;
import x0.InterfaceC0560a;

/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* renamed from: J  reason: collision with root package name */
    public final Context f2497J;

    /* renamed from: K  reason: collision with root package name */
    public final int f2498K;

    /* renamed from: L  reason: collision with root package name */
    public final CharSequence f2499L;

    /* renamed from: M  reason: collision with root package name */
    public final CharSequence f2500M;

    /* renamed from: N  reason: collision with root package name */
    public final String f2501N;

    /* renamed from: O  reason: collision with root package name */
    public final Object f2502O;

    /* renamed from: P  reason: collision with root package name */
    public InterfaceC0560a f2503P;

    public Preference(Context context, AttributeSet attributeSet, int r7) {
        this.f2498K = Integer.MAX_VALUE;
        this.f2497J = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0561b.f5486f, r7, 0);
        obtainStyledAttributes.getResourceId(23, obtainStyledAttributes.getResourceId(0, 0));
        String string = obtainStyledAttributes.getString(26);
        this.f2501N = string == null ? obtainStyledAttributes.getString(6) : string;
        CharSequence text = obtainStyledAttributes.getText(34);
        this.f2499L = text == null ? obtainStyledAttributes.getText(4) : text;
        CharSequence text2 = obtainStyledAttributes.getText(33);
        this.f2500M = text2 == null ? obtainStyledAttributes.getText(7) : text2;
        this.f2498K = obtainStyledAttributes.getInt(28, obtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        if (obtainStyledAttributes.getString(22) == null) {
            obtainStyledAttributes.getString(13);
        }
        obtainStyledAttributes.getResourceId(27, obtainStyledAttributes.getResourceId(3, R.layout.preference));
        obtainStyledAttributes.getResourceId(35, obtainStyledAttributes.getResourceId(9, 0));
        obtainStyledAttributes.getBoolean(21, obtainStyledAttributes.getBoolean(2, true));
        boolean z3 = obtainStyledAttributes.getBoolean(30, obtainStyledAttributes.getBoolean(5, true));
        obtainStyledAttributes.getBoolean(29, obtainStyledAttributes.getBoolean(1, true));
        b.d(obtainStyledAttributes, 19, 10);
        obtainStyledAttributes.getBoolean(16, obtainStyledAttributes.getBoolean(16, z3));
        obtainStyledAttributes.getBoolean(17, obtainStyledAttributes.getBoolean(17, z3));
        if (obtainStyledAttributes.hasValue(18)) {
            this.f2502O = c(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.f2502O = c(obtainStyledAttributes, 11);
        }
        obtainStyledAttributes.getBoolean(31, obtainStyledAttributes.getBoolean(12, true));
        if (obtainStyledAttributes.hasValue(32)) {
            obtainStyledAttributes.getBoolean(32, obtainStyledAttributes.getBoolean(14, true));
        }
        obtainStyledAttributes.getBoolean(24, obtainStyledAttributes.getBoolean(15, false));
        obtainStyledAttributes.getBoolean(25, obtainStyledAttributes.getBoolean(25, true));
        obtainStyledAttributes.getBoolean(20, obtainStyledAttributes.getBoolean(20, false));
        obtainStyledAttributes.recycle();
    }

    public CharSequence a() {
        InterfaceC0560a interfaceC0560a = this.f2503P;
        if (interfaceC0560a != null) {
            return interfaceC0560a.g(this);
        }
        return this.f2500M;
    }

    public void b() {
    }

    public Object c(TypedArray typedArray, int r22) {
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int r02 = preference2.f2498K;
        int r12 = this.f2498K;
        if (r12 != r02) {
            return r12 - r02;
        }
        CharSequence charSequence = preference2.f2499L;
        CharSequence charSequence2 = this.f2499L;
        if (charSequence2 == charSequence) {
            return 0;
        }
        if (charSequence2 == null) {
            return 1;
        }
        if (charSequence == null) {
            return -1;
        }
        return charSequence2.toString().compareToIgnoreCase(charSequence.toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.f2499L;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence a4 = a();
        if (!TextUtils.isEmpty(a4)) {
            sb.append(a4);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.a(context, R.attr.preferenceStyle, 16842894));
    }
}
