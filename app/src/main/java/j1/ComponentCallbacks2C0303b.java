package j1;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import u1.HandlerC0477e;

/* renamed from: j1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C0303b implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: N  reason: collision with root package name */
    public static final ComponentCallbacks2C0303b f3790N = new ComponentCallbacks2C0303b();

    /* renamed from: J  reason: collision with root package name */
    public final AtomicBoolean f3791J = new AtomicBoolean();

    /* renamed from: K  reason: collision with root package name */
    public final AtomicBoolean f3792K = new AtomicBoolean();

    /* renamed from: L  reason: collision with root package name */
    public final ArrayList f3793L = new ArrayList();

    /* renamed from: M  reason: collision with root package name */
    public boolean f3794M = false;

    public final void a(k kVar) {
        synchronized (f3790N) {
            this.f3793L.add(kVar);
        }
    }

    public final void b(boolean z3) {
        synchronized (f3790N) {
            try {
                Iterator it = this.f3793L.iterator();
                while (it.hasNext()) {
                    HandlerC0477e handlerC0477e = ((k) it.next()).f3812a.f3810m;
                    handlerC0477e.sendMessage(handlerC0477e.obtainMessage(1, Boolean.valueOf(z3)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f3791J.compareAndSet(true, false);
        this.f3792K.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f3791J.compareAndSet(true, false);
        this.f3792K.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int r3) {
        if (r3 == 20 && this.f3791J.compareAndSet(false, true)) {
            this.f3792K.set(true);
            b(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
