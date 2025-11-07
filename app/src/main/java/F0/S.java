package f0;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import x1.AbstractC0656m4;

/* loaded from: classes.dex */
public final class S extends AbstractC0656m4 {

    /* renamed from: a  reason: collision with root package name */
    public final WindowInsetsController f3173a;

    /* renamed from: b  reason: collision with root package name */
    public final Window f3174b;

    public S(Window window) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f3173a = insetsController;
        this.f3174b = window;
    }

    @Override // x1.AbstractC0656m4
    public final void a(boolean z3) {
        Window window = this.f3174b;
        if (z3) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f3173a.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f3173a.setSystemBarsAppearance(0, 16);
    }

    @Override // x1.AbstractC0656m4
    public final void b(boolean z3) {
        Window window = this.f3174b;
        if (z3) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f3173a.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f3173a.setSystemBarsAppearance(0, 8);
    }
}
