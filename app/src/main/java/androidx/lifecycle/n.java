package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.H;

/* loaded from: classes.dex */
public final class n extends AbstractC0133f {
    @Override // androidx.lifecycle.AbstractC0133f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        N2.g.e(activity, "activity");
        int r4 = H.f2442K;
        if (Build.VERSION.SDK_INT >= 29) {
            H.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new H.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new Fragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
