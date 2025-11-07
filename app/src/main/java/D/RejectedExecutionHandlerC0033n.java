package D;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: D.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RejectedExecutionHandlerC0033n implements RejectedExecutionHandler {
    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        x1.X.b("CameraExecutor", "A rejected execution occurred in CameraExecutor!");
    }
}
