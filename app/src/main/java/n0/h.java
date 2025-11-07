package N0;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class h implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final i f964a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference f965b;

    public h(i iVar, Activity activity) {
        N2.g.e(iVar, "sidecarCompat");
        this.f964a = iVar;
        this.f965b = new WeakReference(activity);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        IBinder iBinder;
        Window window;
        WindowManager.LayoutParams attributes;
        N2.g.e(view, "view");
        view.removeOnAttachStateChangeListener(this);
        Activity activity = (Activity) this.f965b.get();
        if (activity != null && (window = activity.getWindow()) != null && (attributes = window.getAttributes()) != null) {
            iBinder = attributes.token;
        } else {
            iBinder = null;
        }
        if (activity == null || iBinder == null) {
            return;
        }
        this.f964a.g(iBinder, activity);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        N2.g.e(view, "view");
    }
}
