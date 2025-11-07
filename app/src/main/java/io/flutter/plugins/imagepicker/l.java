package io.flutter.plugins.imagepicker;

import A0.C0001b;
import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.DefaultLifecycleObserver;
import h2.AbstractActivityC0292d;

/* loaded from: classes.dex */
public final class l implements Application.ActivityLifecycleCallbacks, DefaultLifecycleObserver {

    /* renamed from: J  reason: collision with root package name */
    public final AbstractActivityC0292d f3635J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ m f3636K;

    public l(m mVar, AbstractActivityC0292d abstractActivityC0292d) {
        this.f3636K = mVar;
        this.f3635J = abstractActivityC0292d;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void f(androidx.lifecycle.r rVar) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f3635J == activity && activity.getApplicationContext() != null) {
            ((Application) activity.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        EnumC0300a enumC0300a;
        if (this.f3635J == activity) {
            j jVar = (j) this.f3636K.f3638K.f4720c;
            synchronized (jVar.f3632U) {
                try {
                    C0001b c0001b = jVar.f3631T;
                    if (c0001b != null) {
                        u uVar = (u) c0001b.f85L;
                        b bVar = jVar.f3624M;
                        if (uVar != null) {
                            enumC0300a = EnumC0300a.IMAGE;
                        } else {
                            enumC0300a = EnumC0300a.VIDEO;
                        }
                        bVar.getClass();
                        int ordinal = enumC0300a.ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                bVar.f3607a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().putString("flutter_image_picker_type", "video").apply();
                            }
                        } else {
                            bVar.f3607a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().putString("flutter_image_picker_type", "image").apply();
                        }
                        if (uVar != null) {
                            SharedPreferences.Editor edit = jVar.f3624M.f3607a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit();
                            Double d4 = uVar.f3653a;
                            if (d4 != null) {
                                edit.putLong("flutter_image_picker_max_width", Double.doubleToRawLongBits(d4.doubleValue()));
                            }
                            Double d5 = uVar.f3654b;
                            if (d5 != null) {
                                edit.putLong("flutter_image_picker_max_height", Double.doubleToRawLongBits(d5.doubleValue()));
                            }
                            edit.putInt("flutter_image_picker_image_quality", uVar.f3655c.intValue());
                            edit.apply();
                        }
                        Uri uri = jVar.f3630S;
                        if (uri != null) {
                            jVar.f3624M.f3607a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().putString("flutter_image_picker_pending_image_uri", uri.getPath()).apply();
                        }
                    }
                } finally {
                }
            }
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(androidx.lifecycle.r rVar) {
        onActivityDestroyed(this.f3635J);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(androidx.lifecycle.r rVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(androidx.lifecycle.r rVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(androidx.lifecycle.r rVar) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(androidx.lifecycle.r rVar) {
        onActivityStopped(this.f3635J);
    }
}
