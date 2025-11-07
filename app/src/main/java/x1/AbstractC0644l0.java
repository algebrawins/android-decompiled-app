package x1;

import android.media.ImageWriter;
import android.os.Build;
import android.view.Surface;

/* renamed from: x1.l0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0644l0 {
    public static ImageWriter a(int r22, Surface surface) {
        int r02 = Build.VERSION.SDK_INT;
        if (r02 >= 23) {
            return J.a.c(r22, surface);
        }
        throw new RuntimeException(D.C.v(r02, "Unable to call newInstance(Surface, int) on API ", ". Version 23 or higher required."));
    }
}
