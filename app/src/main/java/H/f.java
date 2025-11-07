package H;

import A.k;
import A0.RunnableC0004e;
import S.m;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import x1.AbstractC0624h4;
import x1.AbstractC0636k0;
import x1.AbstractC0699s0;

/* loaded from: classes.dex */
public abstract class f {
    public static Object a(E1.a aVar) {
        boolean isDone = aVar.isDone();
        AbstractC0624h4.f("Future was expected to be done, " + aVar, isDone);
        return b(aVar);
    }

    public static Object b(Future future) {
        Object obj;
        boolean z3 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z3 = true;
            } catch (Throwable th) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static h c(Object obj) {
        if (obj == null) {
            return h.f701L;
        }
        return new h(0, obj);
    }

    public static E1.a d(E1.a aVar) {
        aVar.getClass();
        if (aVar.isDone()) {
            return aVar;
        }
        return AbstractC0699s0.a(new k(4, aVar));
    }

    public static void e(boolean z3, E1.a aVar, S.i iVar, G.a aVar2) {
        aVar.getClass();
        iVar.getClass();
        aVar2.getClass();
        aVar.a(new e(0, aVar, new A.c(12, iVar)), aVar2);
        if (z3) {
            RunnableC0004e runnableC0004e = new RunnableC0004e(6, aVar);
            G.a a4 = AbstractC0636k0.a();
            m mVar = iVar.f1189c;
            if (mVar != null) {
                mVar.a(runnableC0004e, a4);
            }
        }
    }

    public static b f(E1.a aVar, a aVar2, Executor executor) {
        b bVar = new b(aVar2, aVar);
        aVar.a(bVar, executor);
        return bVar;
    }
}
