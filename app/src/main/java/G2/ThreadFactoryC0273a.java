package g2;

import java.util.concurrent.ThreadFactory;

/* renamed from: g2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC0273a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public int f3243a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        StringBuilder sb = new StringBuilder("flutter-worker-");
        int r12 = this.f3243a;
        this.f3243a = r12 + 1;
        sb.append(r12);
        thread.setName(sb.toString());
        return thread;
    }
}
