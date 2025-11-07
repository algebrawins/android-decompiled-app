package k;

import Z.g;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import x1.AbstractC0759z4;

/* renamed from: k.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0312e extends AbstractC0313f implements g {

    /* renamed from: W  reason: collision with root package name */
    public C0309b f3937W;

    /* renamed from: X  reason: collision with root package name */
    public boolean f3938X;

    /* renamed from: Y  reason: collision with root package name */
    public C0309b f3939Y;

    /* renamed from: Z  reason: collision with root package name */
    public AbstractC0759z4 f3940Z;
    public int a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f3941b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f3942c0;

    public C0312e(C0309b c0309b, Resources resources) {
        this.f3948N = 255;
        this.f3950P = -1;
        this.a0 = -1;
        this.f3941b0 = -1;
        d(new C0309b(c0309b, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x026f, code lost:
        r5.onStateChange(r5.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0276, code lost:
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static k.C0312e e(android.content.Context r20, android.content.res.Resources r21, android.content.res.XmlResourceParser r22, android.util.AttributeSet r23, android.content.res.Resources.Theme r24) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C0312e.e(android.content.Context, android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):k.e");
    }

    @Override // k.AbstractC0313f, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // k.AbstractC0313f
    public final void d(C0309b c0309b) {
        this.f3944J = c0309b;
        int r02 = this.f3950P;
        if (r02 >= 0) {
            Drawable d4 = c0309b.d(r02);
            this.f3946L = d4;
            if (d4 != null) {
                b(d4);
            }
        }
        this.f3947M = null;
        this.f3937W = c0309b;
        this.f3939Y = c0309b;
    }

    public final Drawable f() {
        if (!this.f3938X) {
            super.mutate();
            C0309b c0309b = this.f3937W;
            c0309b.f3905I = c0309b.f3905I.clone();
            c0309b.f3906J = c0309b.f3906J.clone();
            this.f3938X = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // k.AbstractC0313f, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        AbstractC0759z4 abstractC0759z4 = this.f3940Z;
        if (abstractC0759z4 != null) {
            abstractC0759z4.d();
            this.f3940Z = null;
            c(this.a0);
            this.a0 = -1;
            this.f3941b0 = -1;
        }
    }

    @Override // k.AbstractC0313f, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f3942c0) {
            f();
            C0309b c0309b = this.f3939Y;
            c0309b.f3905I = c0309b.f3905I.clone();
            c0309b.f3906J = c0309b.f3906J.clone();
            this.f3942c0 = true;
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0106, code lost:
        if (c(r3) != false) goto L16;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStateChange(int[] r18) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C0312e.onStateChange(int[]):boolean");
    }

    @Override // k.AbstractC0313f, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z4) {
        boolean visible = super.setVisible(z3, z4);
        AbstractC0759z4 abstractC0759z4 = this.f3940Z;
        if (abstractC0759z4 != null && (visible || z4)) {
            if (z3) {
                abstractC0759z4.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
