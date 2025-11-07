package x1;

import android.os.Build;
import android.widget.EdgeEffect;
import k0.AbstractC0316c;
import k0.AbstractC0317d;

/* loaded from: classes.dex */
public abstract class A4 {
    public static float a(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0317d.b(edgeEffect);
        }
        return 0.0f;
    }

    public static float b(EdgeEffect edgeEffect, float f2, float f4) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0317d.c(edgeEffect, f2, f4);
        }
        AbstractC0316c.a(edgeEffect, f2, f4);
        return f2;
    }
}
