package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class D extends AbstractC0133f {
    final /* synthetic */ E this$0;

    /* loaded from: classes.dex */
    public static final class a extends AbstractC0133f {
        final /* synthetic */ E this$0;

        public a(E e4) {
            this.this$0 = e4;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            N2.g.e(activity, "activity");
            this.this$0.c();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            N2.g.e(activity, "activity");
            E e4 = this.this$0;
            int r02 = e4.f2434J + 1;
            e4.f2434J = r02;
            if (r02 == 1 && e4.f2437M) {
                e4.f2439O.e(EnumC0137k.ON_START);
                e4.f2437M = false;
            }
        }
    }

    public D(E e4) {
        this.this$0 = e4;
    }

    @Override // androidx.lifecycle.AbstractC0133f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        N2.g.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int r3 = H.f2442K;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            N2.g.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((H) findFragmentByTag).f2443J = this.this$0.f2441Q;
        }
    }

    @Override // androidx.lifecycle.AbstractC0133f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        N2.g.e(activity, "activity");
        E e4 = this.this$0;
        int r02 = e4.f2435K - 1;
        e4.f2435K = r02;
        if (r02 == 0) {
            Handler handler = e4.f2438N;
            N2.g.b(handler);
            handler.postDelayed(e4.f2440P, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        N2.g.e(activity, "activity");
        C.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0133f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        N2.g.e(activity, "activity");
        E e4 = this.this$0;
        int r02 = e4.f2434J - 1;
        e4.f2434J = r02;
        if (r02 == 0 && e4.f2436L) {
            e4.f2439O.e(EnumC0137k.ON_STOP);
            e4.f2437M = true;
        }
    }
}
