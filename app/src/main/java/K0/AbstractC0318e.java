package k0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* renamed from: k0.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0318e {
    public static ColorStateList a(ImageView imageView) {
        return imageView.getImageTintList();
    }

    public static PorterDuff.Mode b(ImageView imageView) {
        return imageView.getImageTintMode();
    }

    public static void c(ImageView imageView, ColorStateList colorStateList) {
        imageView.setImageTintList(colorStateList);
    }

    public static void d(ImageView imageView, PorterDuff.Mode mode) {
        imageView.setImageTintMode(mode);
    }
}
