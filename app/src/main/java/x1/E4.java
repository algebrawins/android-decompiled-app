package x1;

import android.graphics.Paint;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.widget.TextView;
import d0.C0231a;
import k0.AbstractC0326m;
import k0.AbstractC0327n;
import k0.AbstractC0328o;
import k0.ActionMode$CallbackC0329p;
import p.C0421u;

/* loaded from: classes.dex */
public abstract class E4 {
    public static C0231a a(C0421u c0421u) {
        int r6;
        int r7;
        int r02 = Build.VERSION.SDK_INT;
        if (r02 >= 28) {
            return new C0231a(AbstractC0328o.c(c0421u));
        }
        TextPaint textPaint = new TextPaint(c0421u.getPaint());
        boolean z3 = false;
        if (r02 >= 23) {
            r6 = 1;
            r7 = 1;
        } else {
            r6 = 0;
            r7 = 0;
        }
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        if (r02 >= 23) {
            r6 = AbstractC0326m.a(c0421u);
            r7 = AbstractC0326m.d(c0421u);
        }
        if (c0421u.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (r02 >= 28 && (c0421u.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(AbstractC0328o.b(AbstractC0327n.a(c0421u.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        } else {
            if (c0421u.getLayoutDirection() == 1) {
                z3 = true;
            }
            switch (c0421u.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case q0.k.STRING_FIELD_NUMBER /* 5 */:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    break;
                case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z3) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    }
                    break;
            }
        }
        return new C0231a(textPaint, textDirectionHeuristic, r6, r7);
    }

    public static void b(TextView textView, int r4) {
        int r02;
        if (r4 >= 0) {
            if (Build.VERSION.SDK_INT >= 28) {
                AbstractC0328o.d(textView, r4);
                return;
            }
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            if (textView.getIncludeFontPadding()) {
                r02 = fontMetricsInt.top;
            } else {
                r02 = fontMetricsInt.ascent;
            }
            if (r4 > Math.abs(r02)) {
                textView.setPadding(textView.getPaddingLeft(), r4 + r02, textView.getPaddingRight(), textView.getPaddingBottom());
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void c(TextView textView, int r4) {
        int r02;
        if (r4 >= 0) {
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            if (textView.getIncludeFontPadding()) {
                r02 = fontMetricsInt.bottom;
            } else {
                r02 = fontMetricsInt.descent;
            }
            if (r4 > Math.abs(r02)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), r4 - r02);
                return;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static ActionMode.Callback d(ActionMode.Callback callback, TextView textView) {
        int r02 = Build.VERSION.SDK_INT;
        if (r02 >= 26 && r02 <= 27 && !(callback instanceof ActionMode$CallbackC0329p) && callback != null) {
            return new ActionMode$CallbackC0329p(callback, textView);
        }
        return callback;
    }
}
