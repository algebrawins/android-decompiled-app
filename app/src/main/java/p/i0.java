package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;

/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f4642a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f4643b = {-16842910};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f4644c = {16842908};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f4645d = {16842919};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f4646e = {16842912};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f4647f = new int[0];
    public static final int[] g = new int[1];

    public static int a(Context context, int r5) {
        ColorStateList c4 = c(context, r5);
        if (c4 != null && c4.isStateful()) {
            return c4.getColorForState(f4643b, c4.getDefaultColor());
        }
        ThreadLocal threadLocal = f4642a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f2 = typedValue.getFloat();
        int b3 = b(context, r5);
        int round = Math.round(Color.alpha(b3) * f2);
        int r02 = Y.a.f1635a;
        if (round >= 0 && round <= 255) {
            return (b3 & 16777215) | (round << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    public static int b(Context context, int r3) {
        int[] r02 = g;
        r02[0] = r3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, r02);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList c(Context context, int r3) {
        ColorStateList colorStateList;
        int resourceId;
        int[] r02 = g;
        r02[0] = r3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, r02);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = j.b.b(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
