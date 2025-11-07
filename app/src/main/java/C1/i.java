package C1;

import A0.RunnableC0004e;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.concurrent.Executor;
import q0.k;

/* loaded from: classes.dex */
public final class i implements e, d, b {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f242J;

    /* renamed from: K  reason: collision with root package name */
    public final Object f243K;

    /* renamed from: L  reason: collision with root package name */
    public final Executor f244L;

    /* renamed from: M  reason: collision with root package name */
    public final Object f245M;

    public i(G.a aVar, b bVar) {
        this.f242J = 0;
        this.f243K = new Object();
        this.f244L = aVar;
        this.f245M = bVar;
    }

    private final void c(j jVar) {
        synchronized (this.f243K) {
        }
        this.f244L.execute(new H.e(this, jVar, 1, false));
    }

    private final void d(j jVar) {
        if (!jVar.f() && !jVar.f249d) {
            synchronized (this.f243K) {
                try {
                    if (((d) this.f245M) == null) {
                        return;
                    }
                    this.f244L.execute(new H.e(this, jVar, 2, false));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private final void e(j jVar) {
        if (jVar.f()) {
            synchronized (this.f243K) {
                try {
                    if (((e) this.f245M) == null) {
                        return;
                    }
                    this.f244L.execute(new H.e(this, jVar, 3, false));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void a(j jVar) {
        switch (this.f242J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                if (jVar.f249d) {
                    synchronized (this.f243K) {
                        try {
                            if (((b) this.f245M) != null) {
                                RunnableC0004e runnableC0004e = new RunnableC0004e(3, this);
                                ((G.a) this.f244L).getClass();
                                runnableC0004e.run();
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            case 1:
                c(jVar);
                return;
            case 2:
                d(jVar);
                return;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                e(jVar);
                return;
            default:
                ((G.g) this.f244L).execute(new H.e(this, jVar, 4, false));
                return;
        }
    }

    @Override // C1.e, H.c
    public void b(Object obj) {
        ((j) this.f245M).h(obj);
    }

    @Override // C1.b
    public void p() {
        ((j) this.f245M).i();
    }

    @Override // C1.d
    public void q(Exception exc) {
        ((j) this.f245M).g(exc);
    }

    public i(G.g gVar, A.c cVar, j jVar) {
        this.f242J = 4;
        this.f244L = gVar;
        this.f243K = cVar;
        this.f245M = jVar;
    }

    public i(Executor executor, c cVar) {
        this.f242J = 1;
        this.f243K = new Object();
        this.f244L = executor;
        this.f245M = cVar;
    }

    public i(Executor executor, d dVar) {
        this.f242J = 2;
        this.f243K = new Object();
        this.f244L = executor;
        this.f245M = dVar;
    }

    public i(Executor executor, e eVar) {
        this.f242J = 3;
        this.f243K = new Object();
        this.f244L = executor;
        this.f245M = eVar;
    }
}
