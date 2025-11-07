package Y1;

import C1.h;
import C1.i;
import C1.j;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public abstract class d {
    public static Object a(j jVar) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            if (jVar.e()) {
                return b(jVar);
            }
            A.c cVar = new A.c(6);
            G.a aVar = h.f241b;
            jVar.b(aVar, cVar);
            jVar.a(aVar, cVar);
            jVar.f247b.g(new i(aVar, (C1.b) cVar));
            jVar.l();
            ((CountDownLatch) cVar.f5K).await();
            return b(jVar);
        }
        throw new IllegalStateException("Must not be called on the main application thread");
    }

    public static Object b(j jVar) {
        if (jVar.f()) {
            return jVar.d();
        }
        if (jVar.f249d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(jVar.c());
    }
}
