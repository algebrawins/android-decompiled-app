package androidx.camera.core.impl;

import android.view.Surface;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface L {
    D.X acquireLatestImage();

    void close();

    int getHeight();

    Surface getSurface();

    int getWidth();

    int k();

    int m();

    D.X o();

    void s();

    void t(K k3, Executor executor);
}
