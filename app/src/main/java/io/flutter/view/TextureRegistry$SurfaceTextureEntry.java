package io.flutter.view;

import android.graphics.SurfaceTexture;
import androidx.annotation.Keep;

@Keep
/* loaded from: classes.dex */
public interface TextureRegistry$SurfaceTextureEntry {
    /* synthetic */ long id();

    /* synthetic */ void release();

    void setOnFrameConsumedListener(t tVar);

    void setOnTrimMemoryListener(u uVar);

    SurfaceTexture surfaceTexture();
}
