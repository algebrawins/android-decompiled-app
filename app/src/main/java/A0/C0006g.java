package A0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: A0.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0006g extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f102a = false;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f103b;

    public C0006g(i iVar) {
        this.f103b = iVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f102a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.f102a) {
            this.f102a = false;
            return;
        }
        i iVar = this.f103b;
        if (((Float) iVar.f126u.getAnimatedValue()).floatValue() == 0.0f) {
            iVar.f127v = 0;
            iVar.e(0);
            return;
        }
        iVar.f127v = 2;
        iVar.f119n.invalidate();
    }
}
