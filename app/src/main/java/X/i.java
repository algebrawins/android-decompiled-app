package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class i {
    public static Drawable a(Resources resources, int r12, Resources.Theme theme) {
        return resources.getDrawable(r12, theme);
    }

    public static Drawable b(Resources resources, int r12, int r22, Resources.Theme theme) {
        return resources.getDrawableForDensity(r12, r22, theme);
    }
}
