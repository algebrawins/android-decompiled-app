package o;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes.dex */
public final class d implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4367a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f4368b;

    public /* synthetic */ d(l lVar, int r22) {
        this.f4367a = r22;
        this.f4368b = lVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int r12 = this.f4367a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f4367a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                g gVar = (g) this.f4368b;
                ViewTreeObserver viewTreeObserver = gVar.f4398g0;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        gVar.f4398g0 = view.getViewTreeObserver();
                    }
                    gVar.f4398g0.removeGlobalOnLayoutListener(gVar.f4384R);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                s sVar = (s) this.f4368b;
                ViewTreeObserver viewTreeObserver2 = sVar.f4479X;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        sVar.f4479X = view.getViewTreeObserver();
                    }
                    sVar.f4479X.removeGlobalOnLayoutListener(sVar.f4473R);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
