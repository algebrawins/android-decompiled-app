package k0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.TextView;

/* renamed from: k0.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0326m {
    public static int a(TextView textView) {
        return textView.getBreakStrategy();
    }

    public static ColorStateList b(TextView textView) {
        return textView.getCompoundDrawableTintList();
    }

    public static PorterDuff.Mode c(TextView textView) {
        return textView.getCompoundDrawableTintMode();
    }

    public static int d(TextView textView) {
        return textView.getHyphenationFrequency();
    }

    public static void e(TextView textView, int r12) {
        textView.setBreakStrategy(r12);
    }

    public static void f(TextView textView, ColorStateList colorStateList) {
        textView.setCompoundDrawableTintList(colorStateList);
    }

    public static void g(TextView textView, PorterDuff.Mode mode) {
        textView.setCompoundDrawableTintMode(mode);
    }

    public static void h(TextView textView, int r12) {
        textView.setHyphenationFrequency(r12);
    }
}
