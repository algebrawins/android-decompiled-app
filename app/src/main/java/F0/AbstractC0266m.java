package f0;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: f0.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0266m {
    public static WindowInsets a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static WindowInsets b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    public static void c(View view) {
        view.requestApplyInsets();
    }
}
