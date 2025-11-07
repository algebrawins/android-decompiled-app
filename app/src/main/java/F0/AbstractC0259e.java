package f0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* renamed from: f0.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0259e {
    public static int a(MenuItem menuItem) {
        return menuItem.getAlphabeticModifiers();
    }

    public static CharSequence b(MenuItem menuItem) {
        return menuItem.getContentDescription();
    }

    public static ColorStateList c(MenuItem menuItem) {
        return menuItem.getIconTintList();
    }

    public static PorterDuff.Mode d(MenuItem menuItem) {
        return menuItem.getIconTintMode();
    }

    public static int e(MenuItem menuItem) {
        return menuItem.getNumericModifiers();
    }

    public static CharSequence f(MenuItem menuItem) {
        return menuItem.getTooltipText();
    }

    public static MenuItem g(MenuItem menuItem, char c4, int r22) {
        return menuItem.setAlphabeticShortcut(c4, r22);
    }

    public static MenuItem h(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setContentDescription(charSequence);
    }

    public static MenuItem i(MenuItem menuItem, ColorStateList colorStateList) {
        return menuItem.setIconTintList(colorStateList);
    }

    public static MenuItem j(MenuItem menuItem, PorterDuff.Mode mode) {
        return menuItem.setIconTintMode(mode);
    }

    public static MenuItem k(MenuItem menuItem, char c4, int r22) {
        return menuItem.setNumericShortcut(c4, r22);
    }

    public static MenuItem l(MenuItem menuItem, char c4, char c5, int r3, int r4) {
        return menuItem.setShortcut(c4, c5, r3, r4);
    }

    public static MenuItem m(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setTooltipText(charSequence);
    }
}
