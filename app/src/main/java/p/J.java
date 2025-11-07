package p;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class J implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ K f4532a;

    public J(K k3) {
        this.f4532a = k3;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        r rVar;
        int action = motionEvent.getAction();
        int x3 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        K k3 = this.f4532a;
        if (action == 0 && (rVar = k3.f4556e0) != null && rVar.isShowing() && x3 >= 0 && x3 < k3.f4556e0.getWidth() && y3 >= 0 && y3 < k3.f4556e0.getHeight()) {
            k3.a0.postDelayed(k3.f4549W, 250L);
            return false;
        } else if (action == 1) {
            k3.a0.removeCallbacks(k3.f4549W);
            return false;
        } else {
            return false;
        }
    }
}
