package f0;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class Q extends P {
    @Override // x1.AbstractC0656m4
    public final void a(boolean z3) {
        Window window = this.f3172a;
        if (z3) {
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            return;
        }
        View decorView2 = window.getDecorView();
        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
    }
}
