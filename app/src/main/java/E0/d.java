package E0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class d extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable.ConstantState f529a;

    public d(Drawable.ConstantState constantState) {
        this.f529a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f529a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f529a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        e eVar = new e(null);
        Drawable newDrawable = this.f529a.newDrawable();
        eVar.f535J = newDrawable;
        newDrawable.setCallback(eVar.f532M);
        return eVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        e eVar = new e(null);
        Drawable newDrawable = this.f529a.newDrawable(resources);
        eVar.f535J = newDrawable;
        newDrawable.setCallback(eVar.f532M);
        return eVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        e eVar = new e(null);
        Drawable newDrawable = this.f529a.newDrawable(resources, theme);
        eVar.f535J = newDrawable;
        newDrawable.setCallback(eVar.f532M);
        return eVar;
    }
}
