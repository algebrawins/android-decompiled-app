package io.flutter.plugin.platform;

import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class q implements WindowManager {

    /* renamed from: J  reason: collision with root package name */
    public final WindowManager f3604J;

    /* renamed from: K  reason: collision with root package name */
    public final k f3605K;

    public q(WindowManager windowManager, k kVar) {
        this.f3604J = windowManager;
        this.f3605K = kVar;
    }

    @Override // android.view.WindowManager
    public final void addCrossWindowBlurEnabledListener(Consumer consumer) {
        this.f3604J.addCrossWindowBlurEnabledListener(consumer);
    }

    @Override // android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        k kVar = this.f3605K;
        if (kVar == null) {
            Log.w("PlatformViewsController", "Embedded view called addView while detached from presentation");
        } else {
            kVar.addView(view, layoutParams);
        }
    }

    @Override // android.view.WindowManager
    public final WindowMetrics getCurrentWindowMetrics() {
        WindowMetrics currentWindowMetrics;
        currentWindowMetrics = this.f3604J.getCurrentWindowMetrics();
        return currentWindowMetrics;
    }

    @Override // android.view.WindowManager
    public final Display getDefaultDisplay() {
        return this.f3604J.getDefaultDisplay();
    }

    @Override // android.view.WindowManager
    public final WindowMetrics getMaximumWindowMetrics() {
        WindowMetrics maximumWindowMetrics;
        maximumWindowMetrics = this.f3604J.getMaximumWindowMetrics();
        return maximumWindowMetrics;
    }

    @Override // android.view.WindowManager
    public final boolean isCrossWindowBlurEnabled() {
        boolean isCrossWindowBlurEnabled;
        isCrossWindowBlurEnabled = this.f3604J.isCrossWindowBlurEnabled();
        return isCrossWindowBlurEnabled;
    }

    @Override // android.view.WindowManager
    public final void removeCrossWindowBlurEnabledListener(Consumer consumer) {
        this.f3604J.removeCrossWindowBlurEnabledListener(consumer);
    }

    @Override // android.view.ViewManager
    public final void removeView(View view) {
        k kVar = this.f3605K;
        if (kVar == null) {
            Log.w("PlatformViewsController", "Embedded view called removeView while detached from presentation");
        } else {
            kVar.removeView(view);
        }
    }

    @Override // android.view.WindowManager
    public final void removeViewImmediate(View view) {
        k kVar = this.f3605K;
        if (kVar == null) {
            Log.w("PlatformViewsController", "Embedded view called removeViewImmediate while detached from presentation");
            return;
        }
        view.clearAnimation();
        kVar.removeView(view);
    }

    @Override // android.view.ViewManager
    public final void updateViewLayout(View view, ViewGroup.LayoutParams layoutParams) {
        k kVar = this.f3605K;
        if (kVar == null) {
            Log.w("PlatformViewsController", "Embedded view called updateViewLayout while detached from presentation");
        } else {
            kVar.updateViewLayout(view, layoutParams);
        }
    }

    @Override // android.view.WindowManager
    public final void addCrossWindowBlurEnabledListener(Executor executor, Consumer consumer) {
        this.f3604J.addCrossWindowBlurEnabledListener(executor, consumer);
    }
}
