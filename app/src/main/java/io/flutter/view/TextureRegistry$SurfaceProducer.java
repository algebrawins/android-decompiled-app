package io.flutter.view;

import android.view.Surface;
import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public interface TextureRegistry$SurfaceProducer {
    Surface getForcedNewSurface();

    int getHeight();

    Surface getSurface();

    int getWidth();

    boolean handlesCropAndRotation();

    /* synthetic */ long id();

    /* synthetic */ void release();

    void scheduleFrame();

    void setCallback(v vVar);

    void setSize(int r12, int r22);
}
