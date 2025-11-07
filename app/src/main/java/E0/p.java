package E0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* loaded from: classes.dex */
public final class p extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable.ConstantState f585a;

    public p(Drawable.ConstantState constantState) {
        this.f585a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f585a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f585a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        q qVar = new q();
        qVar.f535J = (VectorDrawable) this.f585a.newDrawable();
        return qVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        q qVar = new q();
        qVar.f535J = (VectorDrawable) this.f585a.newDrawable(resources);
        return qVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        q qVar = new q();
        qVar.f535J = (VectorDrawable) this.f585a.newDrawable(resources, theme);
        return qVar;
    }
}
