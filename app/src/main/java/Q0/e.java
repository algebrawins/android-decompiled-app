package Q0;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.media.ImageReader;
import java.util.List;

/* loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static /* bridge */ /* synthetic */ PackageManager.ResolveInfoFlags d() {
        return PackageManager.ResolveInfoFlags.of(0L);
    }

    public static /* bridge */ /* synthetic */ DynamicRangeProfiles g(Object obj) {
        return (DynamicRangeProfiles) obj;
    }

    public static /* synthetic */ ImageReader.Builder h(int r12, int r22) {
        return new ImageReader.Builder(r12, r22);
    }

    public static /* bridge */ /* synthetic */ List m(PackageManager packageManager, Intent intent, PackageManager.ResolveInfoFlags resolveInfoFlags) {
        return packageManager.queryIntentActivities(intent, resolveInfoFlags);
    }

    public static /* synthetic */ void o() {
    }
}
