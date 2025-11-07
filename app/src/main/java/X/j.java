package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;

/* loaded from: classes.dex */
public abstract class j {
    public static int a(Resources resources, int r12, Resources.Theme theme) {
        return resources.getColor(r12, theme);
    }

    public static ColorStateList b(Resources resources, int r12, Resources.Theme theme) {
        return resources.getColorStateList(r12, theme);
    }
}
