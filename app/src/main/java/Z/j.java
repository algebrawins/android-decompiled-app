package Z;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class j extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public int f1752a;

    /* renamed from: b  reason: collision with root package name */
    public Drawable.ConstantState f1753b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f1754c;

    /* renamed from: d  reason: collision with root package name */
    public PorterDuff.Mode f1755d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        int r12;
        int r02 = this.f1752a;
        Drawable.ConstantState constantState = this.f1753b;
        if (constantState != null) {
            r12 = constantState.getChangingConfigurations();
        } else {
            r12 = 0;
        }
        return r02 | r12;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return newDrawable(null);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Z.i, android.graphics.drawable.Drawable] */
    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        ?? drawable = new Drawable();
        drawable.f1749M = this;
        Drawable.ConstantState constantState = this.f1753b;
        if (constantState != null) {
            drawable.h(constantState.newDrawable(resources));
        }
        i.a();
        return drawable;
    }
}
