package h2;

import android.view.ViewTreeObserver;

/* renamed from: h2.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserver$OnPreDrawListenerC0294f implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ t f3320J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ C0295g f3321K;

    public ViewTreeObserver$OnPreDrawListenerC0294f(C0295g c0295g, t tVar) {
        this.f3321K = c0295g;
        this.f3320J = tVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        C0295g c0295g = this.f3321K;
        if (c0295g.g && c0295g.f3326e != null) {
            this.f3320J.getViewTreeObserver().removeOnPreDrawListener(this);
            c0295g.f3326e = null;
        }
        return c0295g.g;
    }
}
