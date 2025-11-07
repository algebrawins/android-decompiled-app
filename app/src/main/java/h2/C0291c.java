package h2;

import A0.C0001b;
import android.util.Log;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import d2.C0235c;

/* renamed from: h2.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0291c implements OnBackAnimationCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0292d f3312a;

    public C0291c(AbstractActivityC0292d abstractActivityC0292d) {
        this.f3312a = abstractActivityC0292d;
    }

    public final void onBackCancelled() {
        AbstractActivityC0292d abstractActivityC0292d = this.f3312a;
        if (abstractActivityC0292d.l("cancelBackGesture")) {
            C0295g c0295g = abstractActivityC0292d.f3315K;
            c0295g.c();
            i2.c cVar = c0295g.f3323b;
            if (cVar != null) {
                ((C0001b) cVar.f3428j.f3003K).M("cancelBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackInvoked() {
        AbstractActivityC0292d abstractActivityC0292d = this.f3312a;
        if (abstractActivityC0292d.l("commitBackGesture")) {
            C0295g c0295g = abstractActivityC0292d.f3315K;
            c0295g.c();
            i2.c cVar = c0295g.f3323b;
            if (cVar != null) {
                ((C0001b) cVar.f3428j.f3003K).M("commitBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        AbstractActivityC0292d abstractActivityC0292d = this.f3312a;
        if (abstractActivityC0292d.l("updateBackGestureProgress")) {
            C0295g c0295g = abstractActivityC0292d.f3315K;
            c0295g.c();
            i2.c cVar = c0295g.f3323b;
            if (cVar != null) {
                C0235c c0235c = cVar.f3428j;
                c0235c.getClass();
                ((C0001b) c0235c.f3003K).M("updateBackGestureProgress", C0235c.k(backEvent), null);
                return;
            }
            Log.w("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        AbstractActivityC0292d abstractActivityC0292d = this.f3312a;
        if (abstractActivityC0292d.l("startBackGesture")) {
            C0295g c0295g = abstractActivityC0292d.f3315K;
            c0295g.c();
            i2.c cVar = c0295g.f3323b;
            if (cVar != null) {
                C0235c c0235c = cVar.f3428j;
                c0235c.getClass();
                ((C0001b) c0235c.f3003K).M("startBackGesture", C0235c.k(backEvent), null);
                return;
            }
            Log.w("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
        }
    }
}
