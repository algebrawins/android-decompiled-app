package io.flutter.view;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final class y implements Choreographer.FrameCallback {

    /* renamed from: a  reason: collision with root package name */
    public long f3773a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ z f3774b;

    public y(z zVar, long j3) {
        this.f3774b = zVar;
        this.f3773a = j3;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        long j4;
        long nanoTime = System.nanoTime() - j3;
        if (nanoTime < 0) {
            j4 = 0;
        } else {
            j4 = nanoTime;
        }
        z zVar = this.f3774b;
        zVar.f3778b.onVsync(j4, zVar.f3777a, this.f3773a);
        zVar.f3779c = this;
    }
}
