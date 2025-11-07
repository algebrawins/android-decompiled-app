package V2;

import java.util.concurrent.locks.LockSupport;

/* renamed from: V2.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0047c extends AbstractC0045a {

    /* renamed from: M  reason: collision with root package name */
    public final Thread f1428M;

    /* renamed from: N  reason: collision with root package name */
    public final J f1429N;

    public C0047c(D2.i iVar, Thread thread, J j3) {
        super(iVar, true);
        this.f1428M = thread;
        this.f1429N = j3;
    }

    @Override // V2.b0
    public final void q(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f1428M;
        if (!N2.g.a(currentThread, thread)) {
            LockSupport.unpark(thread);
        }
    }
}
