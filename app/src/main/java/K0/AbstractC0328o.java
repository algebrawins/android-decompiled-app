package k0;

import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.widget.TextView;

/* renamed from: k0.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0328o {
    public static String[] b(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static PrecomputedText.Params c(TextView textView) {
        return textView.getTextMetricsParams();
    }

    public static void d(TextView textView, int r12) {
        textView.setFirstBaselineToTopHeight(r12);
    }

    public static CharSequence a(PrecomputedText precomputedText) {
        return precomputedText;
    }
}
