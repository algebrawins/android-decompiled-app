package p;

import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* renamed from: p.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0405c implements Runnable {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f4587J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f4588K;

    public /* synthetic */ RunnableC0405c(ActionBarOverlayLayout actionBarOverlayLayout, int r22) {
        this.f4587J = r22;
        this.f4588K = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4587J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f4588K;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f1961f0 = actionBarOverlayLayout.f1945L.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f1962g0);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f4588K;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f1961f0 = actionBarOverlayLayout2.f1945L.animate().translationY(-actionBarOverlayLayout2.f1945L.getHeight()).setListener(actionBarOverlayLayout2.f1962g0);
                return;
        }
    }
}
