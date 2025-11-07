package A0;

import android.animation.ValueAnimator;

/* renamed from: A0.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0007h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f104a;

    public C0007h(i iVar) {
        this.f104a = iVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        i iVar = this.f104a;
        iVar.f108b.setAlpha(floatValue);
        iVar.f109c.setAlpha(floatValue);
        iVar.f119n.invalidate();
    }
}
