package E0;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class h extends Drawable implements Z.g {

    /* renamed from: J  reason: collision with root package name */
    public Drawable f535J;

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            Z.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            return drawable.getCurrent();
        }
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            return drawable.getPadding(rect);
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            return drawable.getState();
        }
        return super.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            return drawable.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int r22) {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            return drawable.setLevel(r22);
        }
        return super.onLevelChange(r22);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int r22) {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            drawable.setChangingConfigurations(r22);
        } else {
            super.setChangingConfigurations(r22);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int r22, PorterDuff.Mode mode) {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            drawable.setColorFilter(r22, mode);
        } else {
            super.setColorFilter(r22, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z3) {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            drawable.setFilterBitmap(z3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f2, float f4) {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            Z.a.e(drawable, f2, f4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int r22, int r3, int r4, int r5) {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            Z.a.f(drawable, r22, r3, r4, r5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] r22) {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            return drawable.setState(r22);
        }
        return super.setState(r22);
    }
}
