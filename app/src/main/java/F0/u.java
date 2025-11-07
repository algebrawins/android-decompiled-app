package f0;

import android.view.View;

/* loaded from: classes.dex */
public abstract class u {
    public static int a(View view) {
        return view.getImportantForContentCapture();
    }

    public static CharSequence b(View view) {
        return view.getStateDescription();
    }

    public static boolean c(View view) {
        return view.isImportantForContentCapture();
    }

    public static void d(View view, int r12) {
        view.setImportantForContentCapture(r12);
    }

    public static void e(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }
}
