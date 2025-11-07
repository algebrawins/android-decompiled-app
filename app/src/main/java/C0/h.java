package c0;

import android.os.Process;

/* loaded from: classes.dex */
public final class h extends Thread {

    /* renamed from: J  reason: collision with root package name */
    public final int f2657J;

    public h(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f2657J = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f2657J);
        super.run();
    }
}
