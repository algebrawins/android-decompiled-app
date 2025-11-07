package Z;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;
import x1.D0;

/* loaded from: classes.dex */
public final class i extends Drawable implements Drawable.Callback, h, g {

    /* renamed from: P  reason: collision with root package name */
    public static final PorterDuff.Mode f1744P = PorterDuff.Mode.SRC_IN;

    /* renamed from: Q  reason: collision with root package name */
    public static Method f1745Q;

    /* renamed from: J  reason: collision with root package name */
    public int f1746J;

    /* renamed from: K  reason: collision with root package name */
    public PorterDuff.Mode f1747K;

    /* renamed from: L  reason: collision with root package name */
    public boolean f1748L;

    /* renamed from: M  reason: collision with root package name */
    public j f1749M;

    /* renamed from: N  reason: collision with root package name */
    public boolean f1750N;

    /* renamed from: O  reason: collision with root package name */
    public Drawable f1751O;

    public static void a() {
        if (f1745Q == null) {
            try {
                f1745Q = Drawable.class.getDeclaredMethod("isProjected", null);
            } catch (Exception e4) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e4);
            }
        }
    }

    public final boolean b() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f1751O;
        if (!(drawable instanceof GradientDrawable) && !(drawable instanceof DrawableContainer) && !(drawable instanceof InsetDrawable) && !(drawable instanceof RippleDrawable)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.drawable.Drawable$ConstantState, Z.j] */
    public final j c() {
        j jVar = this.f1749M;
        ?? constantState = new Drawable.ConstantState();
        constantState.f1754c = null;
        constantState.f1755d = f1744P;
        if (jVar != null) {
            constantState.f1752a = jVar.f1752a;
            constantState.f1753b = jVar.f1753b;
            constantState.f1754c = jVar.f1754c;
            constantState.f1755d = jVar.f1755d;
        }
        return constantState;
    }

    public final boolean d(int[] r22) {
        boolean state = this.f1751O.setState(r22);
        if (!i(r22) && !state) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f1751O.draw(canvas);
    }

    public final void e(int r12) {
        setTintList(ColorStateList.valueOf(r12));
    }

    public final void f(ColorStateList colorStateList) {
        this.f1749M.f1754c = colorStateList;
        i(this.f1751O.getState());
    }

    public final void g(PorterDuff.Mode mode) {
        this.f1749M.f1755d = mode;
        i(this.f1751O.getState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int r12;
        int changingConfigurations = super.getChangingConfigurations();
        j jVar = this.f1749M;
        if (jVar != null) {
            r12 = jVar.getChangingConfigurations();
        } else {
            r12 = 0;
        }
        return changingConfigurations | r12 | this.f1751O.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        j jVar = this.f1749M;
        if (jVar != null && jVar.f1753b != null) {
            jVar.f1752a = getChangingConfigurations();
            return this.f1749M;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f1751O.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        return this.f1751O.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f1751O.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f1751O.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getLayoutDirection() {
        return D0.a(this.f1751O);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f1751O.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f1751O.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f1751O.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        this.f1751O.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f1751O.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f1751O.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f1751O.getTransparentRegion();
    }

    public final void h(Drawable drawable) {
        Drawable drawable2 = this.f1751O;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1751O = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            j jVar = this.f1749M;
            if (jVar != null) {
                jVar.f1753b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public final boolean i(int[] r5) {
        if (!b()) {
            return false;
        }
        j jVar = this.f1749M;
        ColorStateList colorStateList = jVar.f1754c;
        PorterDuff.Mode mode = jVar.f1755d;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(r5, colorStateList.getDefaultColor());
            if (!this.f1748L || colorForState != this.f1746J || mode != this.f1747K) {
                setColorFilter(colorForState, mode);
                this.f1746J = colorForState;
                this.f1747K = mode;
                this.f1748L = true;
                return true;
            }
        } else {
            this.f1748L = false;
            clearColorFilter();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f1751O.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Method method;
        Drawable drawable = this.f1751O;
        if (drawable != null && (method = f1745Q) != null) {
            try {
                return ((Boolean) method.invoke(drawable, null)).booleanValue();
            } catch (Exception e4) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e4);
                return false;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        j jVar;
        if (b() && (jVar = this.f1749M) != null) {
            colorStateList = jVar.f1754c;
        } else {
            colorStateList = null;
        }
        if ((colorStateList != null && colorStateList.isStateful()) || this.f1751O.isStateful()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f1751O.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable.ConstantState constantState;
        if (!this.f1750N && super.mutate() == this) {
            this.f1749M = c();
            Drawable drawable = this.f1751O;
            if (drawable != null) {
                drawable.mutate();
            }
            j jVar = this.f1749M;
            if (jVar != null) {
                Drawable drawable2 = this.f1751O;
                if (drawable2 != null) {
                    constantState = drawable2.getConstantState();
                } else {
                    constantState = null;
                }
                jVar.f1753b = constantState;
            }
            this.f1750N = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1751O;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int r9) {
        Drawable drawable = this.f1751O;
        if (Build.VERSION.SDK_INT >= 23) {
            return b.b(drawable, r9);
        }
        if (!D0.f5519b) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                D0.f5518a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e4) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e4);
            }
            D0.f5519b = true;
        }
        Method method = D0.f5518a;
        if (method == null) {
            return false;
        }
        try {
            method.invoke(drawable, Integer.valueOf(r9));
            return true;
        } catch (Exception e5) {
            Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e5);
            D0.f5518a = null;
            return false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int r22) {
        return this.f1751O.setLevel(r22);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        scheduleSelf(runnable, j3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r22) {
        this.f1751O.setAlpha(r22);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z3) {
        this.f1751O.setAutoMirrored(z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int r22) {
        this.f1751O.setChangingConfigurations(r22);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f1751O.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z3) {
        this.f1751O.setDither(z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z3) {
        this.f1751O.setFilterBitmap(z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f2, float f4) {
        this.f1751O.setHotspot(f2, f4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int r22, int r3, int r4, int r5) {
        this.f1751O.setHotspotBounds(r22, r3, r4, r5);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] r12) {
        if (d(r12)) {
            invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int r22) {
        if (b()) {
            e(r22);
        } else {
            this.f1751O.setTint(r22);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (b()) {
            f(colorStateList);
        } else {
            this.f1751O.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (b()) {
            g(mode);
        } else {
            this.f1751O.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z4) {
        if (!super.setVisible(z3, z4) && !this.f1751O.setVisible(z3, z4)) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
