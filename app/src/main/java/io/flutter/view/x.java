package io.flutter.view;

import android.hardware.display.DisplayManager;

/* loaded from: classes.dex */
public final class x implements DisplayManager.DisplayListener {

    /* renamed from: a  reason: collision with root package name */
    public final DisplayManager f3771a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ z f3772b;

    public x(z zVar, DisplayManager displayManager) {
        this.f3772b = zVar;
        this.f3771a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int r12) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int r5) {
        if (r5 == 0) {
            float refreshRate = this.f3771a.getDisplay(0).getRefreshRate();
            z zVar = this.f3772b;
            zVar.f3777a = (long) (1.0E9d / refreshRate);
            zVar.f3778b.setRefreshRateFPS(refreshRate);
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int r12) {
    }
}
