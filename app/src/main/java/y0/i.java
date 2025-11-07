package y0;

import android.view.Choreographer;

/* loaded from: classes.dex */
public abstract class i {
    public static void a(final Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: y0.h
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j3) {
                runnable.run();
            }
        });
    }
}
