package E0;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public q f525a;

    /* renamed from: b  reason: collision with root package name */
    public AnimatorSet f526b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f527c;

    /* renamed from: d  reason: collision with root package name */
    public R.b f528d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
