package f0;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class P extends O {
    @Override // x1.AbstractC0656m4
    public final void b(boolean z3) {
        Window window = this.f3172a;
        if (z3) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            return;
        }
        View decorView2 = window.getDecorView();
        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
    }
}
