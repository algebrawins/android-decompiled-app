package k;

import A0.RunnableC0004e;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import x1.D0;

/* renamed from: k.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0313f extends Drawable implements Drawable.Callback {

    /* renamed from: V  reason: collision with root package name */
    public static final /* synthetic */ int f3943V = 0;

    /* renamed from: J  reason: collision with root package name */
    public C0309b f3944J;

    /* renamed from: K  reason: collision with root package name */
    public Rect f3945K;

    /* renamed from: L  reason: collision with root package name */
    public Drawable f3946L;

    /* renamed from: M  reason: collision with root package name */
    public Drawable f3947M;

    /* renamed from: N  reason: collision with root package name */
    public int f3948N;

    /* renamed from: O  reason: collision with root package name */
    public boolean f3949O;

    /* renamed from: P  reason: collision with root package name */
    public int f3950P;

    /* renamed from: Q  reason: collision with root package name */
    public boolean f3951Q;

    /* renamed from: R  reason: collision with root package name */
    public RunnableC0004e f3952R;

    /* renamed from: S  reason: collision with root package name */
    public long f3953S;

    /* renamed from: T  reason: collision with root package name */
    public long f3954T;

    /* renamed from: U  reason: collision with root package name */
    public E0.b f3955U;

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f3949O = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f3946L
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L38
            long r9 = r13.f3953S
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L3a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f3948N
            r3.setAlpha(r9)
            r13.f3953S = r6
            goto L3a
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            k.b r9 = r13.f3944J
            int r9 = r9.f3930y
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f3948N
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L3b
        L38:
            r13.f3953S = r6
        L3a:
            r3 = 0
        L3b:
            android.graphics.drawable.Drawable r9 = r13.f3947M
            if (r9 == 0) goto L65
            long r10 = r13.f3954T
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L67
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L52
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f3947M = r0
            r13.f3954T = r6
            goto L67
        L52:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            k.b r4 = r13.f3944J
            int r4 = r4.f3931z
            int r3 = r3 / r4
            int r4 = r13.f3948N
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L68
        L65:
            r13.f3954T = r6
        L67:
            r0 = r3
        L68:
            if (r14 == 0) goto L74
            if (r0 == 0) goto L74
            A0.e r14 = r13.f3952R
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k.AbstractC0313f.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        C0309b c0309b = this.f3944J;
        if (theme != null) {
            c0309b.c();
            int r12 = c0309b.f3913h;
            Drawable[] drawableArr = c0309b.g;
            for (int r4 = 0; r4 < r12; r4++) {
                Drawable drawable = drawableArr[r4];
                if (drawable != null && drawable.canApplyTheme()) {
                    drawableArr[r4].applyTheme(theme);
                    c0309b.f3911e |= drawableArr[r4].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                c0309b.f3908b = resources;
                int r8 = resources.getDisplayMetrics().densityDpi;
                if (r8 == 0) {
                    r8 = 160;
                }
                int r13 = c0309b.f3909c;
                c0309b.f3909c = r8;
                if (r13 != r8) {
                    c0309b.f3918m = false;
                    c0309b.f3915j = false;
                    return;
                }
                return;
            }
            return;
        }
        c0309b.getClass();
    }

    public final void b(Drawable drawable) {
        int layoutDirection;
        if (this.f3955U == null) {
            this.f3955U = new E0.b();
        }
        E0.b bVar = this.f3955U;
        bVar.f524K = drawable.getCallback();
        drawable.setCallback(bVar);
        try {
            if (this.f3944J.f3930y <= 0 && this.f3949O) {
                drawable.setAlpha(this.f3948N);
            }
            C0309b c0309b = this.f3944J;
            if (c0309b.f3899C) {
                drawable.setColorFilter(c0309b.f3898B);
            } else {
                if (c0309b.f3902F) {
                    Z.a.h(drawable, c0309b.f3900D);
                }
                C0309b c0309b2 = this.f3944J;
                if (c0309b2.f3903G) {
                    Z.a.i(drawable, c0309b2.f3901E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f3944J.f3928w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                layoutDirection = getLayoutDirection();
                drawable.setLayoutDirection(layoutDirection);
            }
            drawable.setAutoMirrored(this.f3944J.f3897A);
            Rect rect = this.f3945K;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            E0.b bVar2 = this.f3955U;
            bVar2.f524K = null;
            drawable.setCallback((Drawable.Callback) bVar2.f524K);
        } catch (Throwable th) {
            E0.b bVar3 = this.f3955U;
            bVar3.f524K = null;
            drawable.setCallback((Drawable.Callback) bVar3.f524K);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(int r10) {
        /*
            r9 = this;
            int r0 = r9.f3950P
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            k.b r0 = r9.f3944J
            int r0 = r0.f3931z
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f3947M
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f3946L
            if (r0 == 0) goto L29
            r9.f3947M = r0
            k.b r0 = r9.f3944J
            int r0 = r0.f3931z
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f3954T = r0
            goto L35
        L29:
            r9.f3947M = r4
            r9.f3954T = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f3946L
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            k.b r0 = r9.f3944J
            int r1 = r0.f3913h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.d(r10)
            r9.f3946L = r0
            r9.f3950P = r10
            if (r0 == 0) goto L5a
            k.b r10 = r9.f3944J
            int r10 = r10.f3930y
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f3953S = r2
        L51:
            r9.b(r0)
            goto L5a
        L55:
            r9.f3946L = r4
            r10 = -1
            r9.f3950P = r10
        L5a:
            long r0 = r9.f3953S
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.f3954T
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L7e
        L67:
            A0.e r0 = r9.f3952R
            if (r0 != 0) goto L78
            A0.e r0 = new A0.e
            r1 = r9
            k.e r1 = (k.C0312e) r1
            r2 = 15
            r0.<init>(r2, r1)
            r9.f3952R = r0
            goto L7b
        L78:
            r9.unscheduleSelf(r0)
        L7b:
            r9.a(r10)
        L7e:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: k.AbstractC0313f.c(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f3944J.canApplyTheme();
    }

    public abstract void d(C0309b c0309b);

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f3946L;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f3947M;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f3948N;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f3944J.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z3;
        C0309b c0309b = this.f3944J;
        synchronized (c0309b) {
            if (c0309b.f3926u) {
                z3 = c0309b.f3927v;
            } else {
                c0309b.c();
                z3 = true;
                c0309b.f3926u = true;
                int r22 = c0309b.f3913h;
                Drawable[] drawableArr = c0309b.g;
                int r5 = 0;
                while (true) {
                    if (r5 < r22) {
                        if (drawableArr[r5].getConstantState() == null) {
                            c0309b.f3927v = false;
                            z3 = false;
                            break;
                        }
                        r5++;
                    } else {
                        c0309b.f3927v = true;
                        break;
                    }
                }
            }
        }
        if (z3) {
            this.f3944J.f3910d = getChangingConfigurations();
            return this.f3944J;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f3946L;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f3945K;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        C0309b c0309b = this.f3944J;
        if (c0309b.f3917l) {
            if (!c0309b.f3918m) {
                c0309b.b();
            }
            return c0309b.f3920o;
        }
        Drawable drawable = this.f3946L;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        C0309b c0309b = this.f3944J;
        if (c0309b.f3917l) {
            if (!c0309b.f3918m) {
                c0309b.b();
            }
            return c0309b.f3919n;
        }
        Drawable drawable = this.f3946L;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        C0309b c0309b = this.f3944J;
        if (c0309b.f3917l) {
            if (!c0309b.f3918m) {
                c0309b.b();
            }
            return c0309b.f3922q;
        }
        Drawable drawable = this.f3946L;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        C0309b c0309b = this.f3944J;
        if (c0309b.f3917l) {
            if (!c0309b.f3918m) {
                c0309b.b();
            }
            return c0309b.f3921p;
        }
        Drawable drawable = this.f3946L;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f3946L;
        int r12 = -2;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        C0309b c0309b = this.f3944J;
        if (c0309b.f3923r) {
            return c0309b.f3924s;
        }
        c0309b.c();
        int r22 = c0309b.f3913h;
        Drawable[] drawableArr = c0309b.g;
        if (r22 > 0) {
            r12 = drawableArr[0].getOpacity();
        }
        for (int r5 = 1; r5 < r22; r5++) {
            r12 = Drawable.resolveOpacity(r12, drawableArr[r5].getOpacity());
        }
        c0309b.f3924s = r12;
        c0309b.f3923r = true;
        return r12;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f3946L;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        C0309b c0309b = this.f3944J;
        boolean z3 = false;
        Rect rect2 = null;
        if (!c0309b.f3914i) {
            Rect rect3 = c0309b.f3916k;
            if (rect3 == null && !c0309b.f3915j) {
                c0309b.c();
                Rect rect4 = new Rect();
                int r5 = c0309b.f3913h;
                Drawable[] drawableArr = c0309b.g;
                for (int r7 = 0; r7 < r5; r7++) {
                    if (drawableArr[r7].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int r8 = rect4.left;
                        if (r8 > rect2.left) {
                            rect2.left = r8;
                        }
                        int r82 = rect4.top;
                        if (r82 > rect2.top) {
                            rect2.top = r82;
                        }
                        int r83 = rect4.right;
                        if (r83 > rect2.right) {
                            rect2.right = r83;
                        }
                        int r84 = rect4.bottom;
                        if (r84 > rect2.bottom) {
                            rect2.bottom = r84;
                        }
                    }
                }
                c0309b.f3915j = true;
                c0309b.f3916k = rect2;
            } else {
                rect2 = rect3;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                z3 = true;
            }
        } else {
            Drawable drawable = this.f3946L;
            if (drawable != null) {
                z3 = drawable.getPadding(rect);
            } else {
                z3 = super.getPadding(rect);
            }
        }
        if (this.f3944J.f3897A && D0.a(this) == 1) {
            int r02 = rect.left;
            rect.left = rect.right;
            rect.right = r02;
        }
        return z3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        C0309b c0309b = this.f3944J;
        if (c0309b != null) {
            c0309b.f3923r = false;
            c0309b.f3925t = false;
        }
        if (drawable == this.f3946L && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f3944J.f3897A;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z3;
        Drawable drawable = this.f3947M;
        boolean z4 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f3947M = null;
            z3 = true;
        } else {
            z3 = false;
        }
        Drawable drawable2 = this.f3946L;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f3949O) {
                this.f3946L.setAlpha(this.f3948N);
            }
        }
        if (this.f3954T != 0) {
            this.f3954T = 0L;
            z3 = true;
        }
        if (this.f3953S != 0) {
            this.f3953S = 0L;
        } else {
            z4 = z3;
        }
        if (z4) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f3951Q && super.mutate() == this) {
            C0312e c0312e = (C0312e) this;
            C0309b c0309b = new C0309b(c0312e.f3939Y, c0312e, null);
            c0309b.f3905I = c0309b.f3905I.clone();
            c0309b.f3906J = c0309b.f3906J.clone();
            d(c0309b);
            this.f3951Q = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3947M;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f3946L;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int r11) {
        boolean z3;
        C0309b c0309b = this.f3944J;
        int r12 = this.f3950P;
        int r22 = c0309b.f3913h;
        Drawable[] drawableArr = c0309b.g;
        boolean z4 = false;
        for (int r5 = 0; r5 < r22; r5++) {
            Drawable drawable = drawableArr[r5];
            if (drawable != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    z3 = drawable.setLayoutDirection(r11);
                } else {
                    z3 = false;
                }
                if (r5 == r12) {
                    z4 = z3;
                }
            }
        }
        c0309b.f3929x = r11;
        return z4;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int r22) {
        Drawable drawable = this.f3947M;
        if (drawable != null) {
            return drawable.setLevel(r22);
        }
        Drawable drawable2 = this.f3946L;
        if (drawable2 != null) {
            return drawable2.setLevel(r22);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        if (drawable == this.f3946L && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int r7) {
        if (!this.f3949O || this.f3948N != r7) {
            this.f3949O = true;
            this.f3948N = r7;
            Drawable drawable = this.f3946L;
            if (drawable != null) {
                if (this.f3953S == 0) {
                    drawable.setAlpha(r7);
                } else {
                    a(false);
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z3) {
        C0309b c0309b = this.f3944J;
        if (c0309b.f3897A != z3) {
            c0309b.f3897A = z3;
            Drawable drawable = this.f3946L;
            if (drawable != null) {
                drawable.setAutoMirrored(z3);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C0309b c0309b = this.f3944J;
        c0309b.f3899C = true;
        if (c0309b.f3898B != colorFilter) {
            c0309b.f3898B = colorFilter;
            Drawable drawable = this.f3946L;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z3) {
        C0309b c0309b = this.f3944J;
        if (c0309b.f3928w != z3) {
            c0309b.f3928w = z3;
            Drawable drawable = this.f3946L;
            if (drawable != null) {
                drawable.setDither(z3);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f2, float f4) {
        Drawable drawable = this.f3946L;
        if (drawable != null) {
            Z.a.e(drawable, f2, f4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int r22, int r3, int r4, int r5) {
        Rect rect = this.f3945K;
        if (rect == null) {
            this.f3945K = new Rect(r22, r3, r4, r5);
        } else {
            rect.set(r22, r3, r4, r5);
        }
        Drawable drawable = this.f3946L;
        if (drawable != null) {
            Z.a.f(drawable, r22, r3, r4, r5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        C0309b c0309b = this.f3944J;
        c0309b.f3902F = true;
        if (c0309b.f3900D != colorStateList) {
            c0309b.f3900D = colorStateList;
            Z.a.h(this.f3946L, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        C0309b c0309b = this.f3944J;
        c0309b.f3903G = true;
        if (c0309b.f3901E != mode) {
            c0309b.f3901E = mode;
            Z.a.i(this.f3946L, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z3, boolean z4) {
        boolean visible = super.setVisible(z3, z4);
        Drawable drawable = this.f3947M;
        if (drawable != null) {
            drawable.setVisible(z3, z4);
        }
        Drawable drawable2 = this.f3946L;
        if (drawable2 != null) {
            drawable2.setVisible(z3, z4);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f3946L && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
