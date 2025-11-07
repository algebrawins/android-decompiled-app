package f0;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class I extends H {

    /* renamed from: k  reason: collision with root package name */
    public Y.c f3167k;

    public I(N n3, WindowInsets windowInsets) {
        super(n3, windowInsets);
        this.f3167k = null;
    }

    @Override // f0.M
    public N b() {
        return N.a(this.f3164c.consumeStableInsets(), null);
    }

    @Override // f0.M
    public N c() {
        return N.a(this.f3164c.consumeSystemWindowInsets(), null);
    }

    @Override // f0.M
    public final Y.c f() {
        if (this.f3167k == null) {
            WindowInsets windowInsets = this.f3164c;
            this.f3167k = Y.c.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f3167k;
    }

    @Override // f0.M
    public boolean h() {
        return this.f3164c.isConsumed();
    }

    @Override // f0.M
    public void l(Y.c cVar) {
        this.f3167k = cVar;
    }
}
