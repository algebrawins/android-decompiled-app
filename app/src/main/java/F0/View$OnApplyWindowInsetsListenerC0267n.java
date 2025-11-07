package f0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: f0.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnApplyWindowInsetsListenerC0267n implements View.OnApplyWindowInsetsListener {

    /* renamed from: a  reason: collision with root package name */
    public N f3198a = null;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f3199b;

    public View$OnApplyWindowInsetsListenerC0267n(View view, i iVar) {
        this.f3199b = view;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        N a4 = N.a(windowInsets, view);
        if (Build.VERSION.SDK_INT < 30) {
            AbstractC0268o.a(windowInsets, this.f3199b);
            if (a4.equals(this.f3198a)) {
                throw null;
            }
        }
        this.f3198a = a4;
        throw null;
    }
}
