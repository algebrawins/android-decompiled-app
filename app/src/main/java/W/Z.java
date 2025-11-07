package w;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;

/* loaded from: classes.dex */
public abstract class Z {
    public static Size[] a(StreamConfigurationMap streamConfigurationMap, int r12) {
        return streamConfigurationMap.getHighResolutionOutputSizes(r12);
    }
}
