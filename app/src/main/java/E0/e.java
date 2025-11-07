package E0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import x1.D0;

/* loaded from: classes.dex */
public final class e extends h implements Animatable {

    /* renamed from: L  reason: collision with root package name */
    public final Context f531L;

    /* renamed from: M  reason: collision with root package name */
    public final b f532M = new b(this);

    /* renamed from: K  reason: collision with root package name */
    public final c f530K = new Drawable.ConstantState();

    /* JADX WARN: Type inference failed for: r2v1, types: [E0.c, android.graphics.drawable.Drawable$ConstantState] */
    public e(Context context) {
        this.f531L = context;
    }

    @Override // E0.h, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            Z.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            return Z.a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        c cVar = this.f530K;
        cVar.f525a.draw(canvas);
        if (cVar.f526b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f530K.f525a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f530K.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            return Z.a.c(drawable);
        }
        return this.f530K.f525a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f535J != null && Build.VERSION.SDK_INT >= 24) {
            return new d(this.f535J.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f530K.f525a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f530K.f525a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f530K.f525a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x018a, code lost:
        if (r8.f526b != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x018c, code lost:
        r8.f526b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0193, code lost:
        r8.f526b.playTogether(r8.f527c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019a, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    /* JADX WARN: Type inference failed for: r11v16, types: [R.b, R.k] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void inflate(android.content.res.Resources r24, org.xmlpull.v1.XmlPullParser r25, android.util.AttributeSet r26, android.content.res.Resources.Theme r27) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.e.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f530K.f525a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f530K.f526b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f530K.f525a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f530K.f525a.setBounds(rect);
        }
    }

    @Override // E0.h, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int r22) {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            return drawable.setLevel(r22);
        }
        return this.f530K.f525a.setLevel(r22);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] r22) {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            return drawable.setState(r22);
        }
        return this.f530K.f525a.setState(r22);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r22) {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            drawable.setAlpha(r22);
        } else {
            this.f530K.f525a.setAlpha(r22);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z3) {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            drawable.setAutoMirrored(z3);
        } else {
            this.f530K.f525a.setAutoMirrored(z3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f530K.f525a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int r22) {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            D0.b(drawable, r22);
        } else {
            this.f530K.f525a.setTint(r22);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            Z.a.h(drawable, colorStateList);
        } else {
            this.f530K.f525a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            Z.a.i(drawable, mode);
        } else {
            this.f530K.f525a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z4) {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            return drawable.setVisible(z3, z4);
        }
        this.f530K.f525a.setVisible(z3, z4);
        return super.setVisible(z3, z4);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        c cVar = this.f530K;
        if (cVar.f526b.isStarted()) {
            return;
        }
        cVar.f526b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f535J;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f530K.f526b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
