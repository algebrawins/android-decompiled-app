package k;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import x1.AbstractC0759z4;

/* renamed from: k.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0310c extends AbstractC0759z4 {

    /* renamed from: a  reason: collision with root package name */
    public final ObjectAnimator f3932a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3933b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [k.d, android.animation.TimeInterpolator, java.lang.Object] */
    public C0310c(AnimationDrawable animationDrawable, boolean z3, boolean z4) {
        int r02;
        int r8;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int r22 = z3 ? numberOfFrames - 1 : 0;
        if (z3) {
            r02 = 0;
        } else {
            r02 = numberOfFrames - 1;
        }
        ?? obj = new Object();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        obj.f3935b = numberOfFrames2;
        int[] r6 = obj.f3934a;
        if (r6 == null || r6.length < numberOfFrames2) {
            obj.f3934a = new int[numberOfFrames2];
        }
        int[] r62 = obj.f3934a;
        int r7 = 0;
        for (int r12 = 0; r12 < numberOfFrames2; r12++) {
            if (z3) {
                r8 = (numberOfFrames2 - r12) - 1;
            } else {
                r8 = r12;
            }
            int duration = animationDrawable.getDuration(r8);
            r62[r12] = duration;
            r7 += duration;
        }
        obj.f3936c = r7;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", r22, r02);
        ofInt.setAutoCancel(true);
        ofInt.setDuration(obj.f3936c);
        ofInt.setInterpolator(obj);
        this.f3933b = z4;
        this.f3932a = ofInt;
    }

    @Override // x1.AbstractC0759z4
    public final boolean a() {
        return this.f3933b;
    }

    @Override // x1.AbstractC0759z4
    public final void b() {
        this.f3932a.reverse();
    }

    @Override // x1.AbstractC0759z4
    public final void c() {
        this.f3932a.start();
    }

    @Override // x1.AbstractC0759z4
    public final void d() {
        this.f3932a.cancel();
    }
}
