package p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: p.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0404b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f4586a;

    public C0404b(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f4586a = actionBarOverlayLayout;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f4586a;
        actionBarOverlayLayout.f1961f0 = null;
        actionBarOverlayLayout.f1952S = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f4586a;
        actionBarOverlayLayout.f1961f0 = null;
        actionBarOverlayLayout.f1952S = false;
    }
}
