package Y1;

import C1.j;
import Q1.k;
import W1.h;
import androidx.lifecycle.B;
import androidx.lifecycle.EnumC0137k;
import androidx.lifecycle.q;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class c implements Closeable, q {

    /* renamed from: N  reason: collision with root package name */
    public static final U1.g f1665N = new U1.g("MobileVisionBase", "");

    /* renamed from: J  reason: collision with root package name */
    public final AtomicBoolean f1666J = new AtomicBoolean(false);

    /* renamed from: K  reason: collision with root package name */
    public final h f1667K;

    /* renamed from: L  reason: collision with root package name */
    public final A.c f1668L;

    /* renamed from: M  reason: collision with root package name */
    public final Executor f1669M;

    public c(h hVar, Executor executor) {
        this.f1667K = hVar;
        A.c cVar = new A.c(5);
        this.f1668L = cVar;
        this.f1669M = executor;
        ((AtomicInteger) hVar.f1067b).incrementAndGet();
        j a4 = hVar.a(executor, g.f1675a, (A.a) cVar.f5K);
        e eVar = e.f1670J;
        a4.getClass();
        a4.a(C1.h.f240a, eVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, S1.a
    @B(EnumC0137k.ON_DESTROY)
    public synchronized void close() {
        if (!this.f1666J.getAndSet(true)) {
            this.f1668L.u();
            h hVar = this.f1667K;
            Executor executor = this.f1669M;
            if (((AtomicInteger) hVar.f1067b).get() > 0) {
                ((k) hVar.f1066a).b(new H.e(10, hVar, new C1.g()), executor);
                return;
            }
            throw new IllegalStateException();
        }
    }
}
