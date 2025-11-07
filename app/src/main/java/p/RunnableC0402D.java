package p;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.google.android.libraries.barhopper.RecognitionOptions;
import o.View$OnTouchListenerC0395a;

/* renamed from: p.D  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0402D implements Runnable {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f4509J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ View$OnTouchListenerC0395a f4510K;

    public /* synthetic */ RunnableC0402D(View$OnTouchListenerC0395a view$OnTouchListenerC0395a, int r22) {
        this.f4509J = r22;
        this.f4510K = view$OnTouchListenerC0395a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4509J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                ViewParent parent = this.f4510K.f4358d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                View$OnTouchListenerC0395a view$OnTouchListenerC0395a = this.f4510K;
                view$OnTouchListenerC0395a.a();
                View view = view$OnTouchListenerC0395a.f4358d;
                if (view.isEnabled() && !view.isLongClickable() && view$OnTouchListenerC0395a.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    view$OnTouchListenerC0395a.g = true;
                    return;
                }
                return;
        }
    }
}
