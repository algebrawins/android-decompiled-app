package G;

import A0.RunnableC0004e;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class l implements Executor {

    /* renamed from: K  reason: collision with root package name */
    public final Executor f684K;

    /* renamed from: J  reason: collision with root package name */
    public final ArrayDeque f683J = new ArrayDeque();

    /* renamed from: L  reason: collision with root package name */
    public final RunnableC0004e f685L = new RunnableC0004e(5, this);

    /* renamed from: M  reason: collision with root package name */
    public k f686M = k.IDLE;

    /* renamed from: N  reason: collision with root package name */
    public long f687N = 0;

    public l(Executor executor) {
        executor.getClass();
        this.f684K = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0067 A[ADDED_TO_REGION] */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void execute(java.lang.Runnable r8) {
        /*
            r7 = this;
            r8.getClass()
            java.util.ArrayDeque r0 = r7.f683J
            monitor-enter(r0)
            G.k r1 = r7.f686M     // Catch: java.lang.Throwable -> L6e
            G.k r2 = G.k.RUNNING     // Catch: java.lang.Throwable -> L6e
            if (r1 == r2) goto L70
            G.k r2 = G.k.QUEUED     // Catch: java.lang.Throwable -> L6e
            if (r1 != r2) goto L11
            goto L70
        L11:
            long r3 = r7.f687N     // Catch: java.lang.Throwable -> L6e
            G.j r1 = new G.j     // Catch: java.lang.Throwable -> L6e
            r5 = 0
            r1.<init>(r8, r5)     // Catch: java.lang.Throwable -> L6e
            java.util.ArrayDeque r8 = r7.f683J     // Catch: java.lang.Throwable -> L6e
            r8.add(r1)     // Catch: java.lang.Throwable -> L6e
            G.k r8 = G.k.QUEUING     // Catch: java.lang.Throwable -> L6e
            r7.f686M = r8     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            java.util.concurrent.Executor r0 = r7.f684K     // Catch: java.lang.Error -> L45 java.lang.RuntimeException -> L47
            A0.e r5 = r7.f685L     // Catch: java.lang.Error -> L45 java.lang.RuntimeException -> L47
            r0.execute(r5)     // Catch: java.lang.Error -> L45 java.lang.RuntimeException -> L47
            G.k r0 = r7.f686M
            if (r0 == r8) goto L2f
            return
        L2f:
            java.util.ArrayDeque r0 = r7.f683J
            monitor-enter(r0)
            long r5 = r7.f687N     // Catch: java.lang.Throwable -> L3f
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L41
            G.k r1 = r7.f686M     // Catch: java.lang.Throwable -> L3f
            if (r1 != r8) goto L41
            r7.f686M = r2     // Catch: java.lang.Throwable -> L3f
            goto L41
        L3f:
            r8 = move-exception
            goto L43
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            return
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r8
        L45:
            r8 = move-exception
            goto L48
        L47:
            r8 = move-exception
        L48:
            java.util.ArrayDeque r2 = r7.f683J
            monitor-enter(r2)
            G.k r0 = r7.f686M     // Catch: java.lang.Throwable -> L56
            G.k r3 = G.k.IDLE     // Catch: java.lang.Throwable -> L56
            if (r0 == r3) goto L58
            G.k r3 = G.k.QUEUING     // Catch: java.lang.Throwable -> L56
            if (r0 != r3) goto L62
            goto L58
        L56:
            r8 = move-exception
            goto L6c
        L58:
            java.util.ArrayDeque r0 = r7.f683J     // Catch: java.lang.Throwable -> L56
            boolean r0 = r0.removeLastOccurrence(r1)     // Catch: java.lang.Throwable -> L56
            if (r0 == 0) goto L62
            r0 = 1
            goto L63
        L62:
            r0 = 0
        L63:
            boolean r1 = r8 instanceof java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L56
            if (r1 == 0) goto L6b
            if (r0 != 0) goto L6b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L56
            return
        L6b:
            throw r8     // Catch: java.lang.Throwable -> L56
        L6c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L56
            throw r8
        L6e:
            r8 = move-exception
            goto L77
        L70:
            java.util.ArrayDeque r1 = r7.f683J     // Catch: java.lang.Throwable -> L6e
            r1.add(r8)     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            return
        L77:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6e
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: G.l.execute(java.lang.Runnable):void");
    }
}
