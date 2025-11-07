package p;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: p.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0399A extends Drawable implements Drawable.Callback {

    /* renamed from: J  reason: collision with root package name */
    public Drawable f4494J;

    /* renamed from: K  reason: collision with root package name */
    public boolean f4495K;

    public final void a(Canvas canvas) {
        this.f4494J.draw(canvas);
    }

    public final void b(float f2, float f4) {
        Z.a.e(this.f4494J, f2, f4);
    }

    public final void c(int r22, int r3, int r4, int r5) {
        Z.a.f(this.f4494J, r22, r3, r4, r5);
    }

    public final boolean d(boolean z3, boolean z4) {
        if (!super.setVisible(z3, z4) && !this.f4494J.setVisible(z3, z4)) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f4495K) {
            a(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return this.f4494J.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f4494J.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f4494J.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f4494J.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f4494J.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f4494J.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f4494J.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f4494J.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f4494J.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f4494J.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f4494J.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.f4494J.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f4494J.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f4494J.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int r22) {
        return this.f4494J.setLevel(r22);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        scheduleSelf(runnable, j3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r22) {
        this.f4494J.setAlpha(r22);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z3) {
        this.f4494J.setAutoMirrored(z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int r22) {
        this.f4494J.setChangingConfigurations(r22);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f4494J.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z3) {
        this.f4494J.setDither(z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z3) {
        this.f4494J.setFilterBitmap(z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f2, float f4) {
        if (this.f4495K) {
            b(f2, f4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int r22, int r3, int r4, int r5) {
        if (this.f4495K) {
            c(r22, r3, r4, r5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] r22) {
        if (this.f4495K) {
            return this.f4494J.setState(r22);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int r22) {
        Z.a.g(this.f4494J, r22);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Z.a.h(this.f4494J, colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Z.a.i(this.f4494J, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z4) {
        if (this.f4495K) {
            return d(z3, z4);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
