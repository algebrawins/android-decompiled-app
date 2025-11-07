package c3;

import D.C;
import V2.AbstractC0061s;
import V2.K;
import a3.w;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class e extends K implements Executor {

    /* renamed from: L  reason: collision with root package name */
    public static final e f2686L = new AbstractC0061s();

    /* renamed from: M  reason: collision with root package name */
    public static final AbstractC0061s f2687M;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [V2.s, c3.e] */
    /* JADX WARN: Type inference failed for: r2v3, types: [a3.i] */
    static {
        n nVar = n.f2702L;
        int r12 = w.f1886a;
        if (64 >= r12) {
            r12 = 64;
        }
        int k3 = a3.a.k("kotlinx.coroutines.io.parallelism", r12, 0, 0, 12);
        nVar.getClass();
        if (k3 >= 1) {
            if (k3 < m.f2698d) {
                if (k3 >= 1) {
                    nVar = new a3.i(nVar, k3);
                } else {
                    throw new IllegalArgumentException(C.w("Expected positive parallelism level, but got ", k3).toString());
                }
            }
            f2687M = nVar;
            return;
        }
        throw new IllegalArgumentException(C.w("Expected positive parallelism level, but got ", k3).toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        h(D2.j.f492J, runnable);
    }

    @Override // V2.AbstractC0061s
    public final void h(D2.i iVar, Runnable runnable) {
        f2687M.h(iVar, runnable);
    }

    @Override // V2.AbstractC0061s
    public final String toString() {
        return "Dispatchers.IO";
    }
}
