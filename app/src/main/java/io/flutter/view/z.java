package io.flutter.view;

import android.hardware.display.DisplayManager;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: e  reason: collision with root package name */
    public static z f3775e;

    /* renamed from: f  reason: collision with root package name */
    public static x f3776f;

    /* renamed from: b  reason: collision with root package name */
    public final FlutterJNI f3778b;

    /* renamed from: a  reason: collision with root package name */
    public long f3777a = -1;

    /* renamed from: c  reason: collision with root package name */
    public y f3779c = new y(this, 0);

    /* renamed from: d  reason: collision with root package name */
    public final b f3780d = new b(this);

    public z(FlutterJNI flutterJNI) {
        this.f3778b = flutterJNI;
    }

    public static z a(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f3775e == null) {
            f3775e = new z(flutterJNI);
        }
        if (f3776f == null) {
            z zVar = f3775e;
            Objects.requireNonNull(zVar);
            x xVar = new x(zVar, displayManager);
            f3776f = xVar;
            displayManager.registerDisplayListener(xVar, null);
        }
        if (f3775e.f3777a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f3775e.f3777a = (long) (1.0E9d / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f3775e;
    }
}
