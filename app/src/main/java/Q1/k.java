package Q1;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import q2.AbstractC0435a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1083a;

    /* renamed from: b  reason: collision with root package name */
    public Object f1084b;

    /* renamed from: c  reason: collision with root package name */
    public Serializable f1085c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f1086d;

    public k() {
        this.f1084b = new Object();
        this.f1085c = new ArrayDeque();
        this.f1086d = new AtomicReference();
    }

    public void a(q2.b bVar, boolean z3) {
        q2.b bVar2;
        q2.b bVar3 = (q2.b) this.f1084b;
        if (bVar3 == bVar && z3 == this.f1083a) {
            return;
        }
        if (bVar == null && bVar3 == null) {
            this.f1083a = z3;
            return;
        }
        int r02 = AbstractC0435a.f4800a[bVar.ordinal()];
        if (r02 != 1) {
            if (r02 != 2 && r02 != 3 && r02 != 4 && r02 != 5) {
                bVar2 = null;
            } else {
                bVar2 = bVar;
            }
        } else if (z3) {
            bVar2 = q2.b.RESUMED;
        } else {
            bVar2 = q2.b.INACTIVE;
        }
        this.f1084b = bVar;
        this.f1083a = z3;
        if (bVar2 == ((q2.b) this.f1085c)) {
            return;
        }
        ((a1.i) this.f1086d).k("AppLifecycleState." + bVar2.name().toLowerCase(Locale.ROOT), null);
        this.f1085c = bVar2;
    }

    public void b(Runnable runnable, Executor executor) {
        synchronized (this.f1084b) {
            try {
                if (this.f1083a) {
                    ((ArrayDeque) this.f1085c).add(new t(runnable, executor));
                    return;
                }
                this.f1083a = true;
                d(runnable, executor);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c() {
        synchronized (this.f1084b) {
            try {
                if (((ArrayDeque) this.f1085c).isEmpty()) {
                    this.f1083a = false;
                    return;
                }
                t tVar = (t) ((ArrayDeque) this.f1085c).remove();
                d(tVar.f1105b, tVar.f1104a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(new H.e(11, this, runnable));
        } catch (RejectedExecutionException unused) {
            c();
        }
    }

    public k(j2.b bVar) {
        a1.i iVar = new a1.i((r2.f) bVar, "flutter/lifecycle", (r2.l) r2.t.f4898b, (R1.a) null);
        this.f1084b = null;
        this.f1085c = null;
        this.f1083a = true;
        this.f1086d = iVar;
    }
}
