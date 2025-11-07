package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public class H extends Fragment {

    /* renamed from: K  reason: collision with root package name */
    public static final /* synthetic */ int f2442K = 0;

    /* renamed from: J  reason: collision with root package name */
    public A.a f2443J;

    /* loaded from: classes.dex */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final G Companion = new Object();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            N2.g.e(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            N2.g.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            N2.g.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            N2.g.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            N2.g.e(activity, "activity");
            int r22 = H.f2442K;
            F.a(activity, EnumC0137k.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            N2.g.e(activity, "activity");
            int r02 = H.f2442K;
            F.a(activity, EnumC0137k.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            N2.g.e(activity, "activity");
            int r02 = H.f2442K;
            F.a(activity, EnumC0137k.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            N2.g.e(activity, "activity");
            int r02 = H.f2442K;
            F.a(activity, EnumC0137k.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            N2.g.e(activity, "activity");
            int r02 = H.f2442K;
            F.a(activity, EnumC0137k.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            N2.g.e(activity, "activity");
            int r02 = H.f2442K;
            F.a(activity, EnumC0137k.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            N2.g.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            N2.g.e(activity, "activity");
            N2.g.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            N2.g.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            N2.g.e(activity, "activity");
        }
    }

    public final void a(EnumC0137k enumC0137k) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            N2.g.d(activity, "activity");
            F.a(activity, enumC0137k);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC0137k.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC0137k.ON_DESTROY);
        this.f2443J = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0137k.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        A.a aVar = this.f2443J;
        if (aVar != null) {
            ((E) aVar.f1K).c();
        }
        a(EnumC0137k.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        A.a aVar = this.f2443J;
        if (aVar != null) {
            E e4 = (E) aVar.f1K;
            int r12 = e4.f2434J + 1;
            e4.f2434J = r12;
            if (r12 == 1 && e4.f2437M) {
                e4.f2439O.e(EnumC0137k.ON_START);
                e4.f2437M = false;
            }
        }
        a(EnumC0137k.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC0137k.ON_STOP);
    }
}
