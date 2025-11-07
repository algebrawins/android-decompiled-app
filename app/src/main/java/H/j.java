package H;

import A0.RunnableC0004e;
import S.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import x1.AbstractC0636k0;
import x1.AbstractC0699s0;

/* loaded from: classes.dex */
public final class j implements E1.a {

    /* renamed from: J  reason: collision with root package name */
    public ArrayList f707J;

    /* renamed from: K  reason: collision with root package name */
    public ArrayList f708K;

    /* renamed from: L  reason: collision with root package name */
    public final boolean f709L;

    /* renamed from: M  reason: collision with root package name */
    public final AtomicInteger f710M;

    /* renamed from: N  reason: collision with root package name */
    public final l f711N = AbstractC0699s0.a(new A.a(15, this));

    /* renamed from: O  reason: collision with root package name */
    public S.i f712O;

    public j(ArrayList arrayList, boolean z3, G.a aVar) {
        this.f707J = arrayList;
        this.f708K = new ArrayList(arrayList.size());
        this.f709L = z3;
        this.f710M = new AtomicInteger(arrayList.size());
        a(new RunnableC0004e(7, this), AbstractC0636k0.a());
        if (this.f707J.isEmpty()) {
            this.f712O.a(new ArrayList(this.f708K));
            return;
        }
        for (int r4 = 0; r4 < this.f707J.size(); r4++) {
            this.f708K.add(null);
        }
        ArrayList arrayList2 = this.f707J;
        for (int r3 = 0; r3 < arrayList2.size(); r3++) {
            E1.a aVar2 = (E1.a) arrayList2.get(r3);
            aVar2.a(new i(this, r3, aVar2), aVar);
        }
    }

    @Override // E1.a
    public final void a(Runnable runnable, Executor executor) {
        this.f711N.f1193K.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        ArrayList arrayList = this.f707J;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((E1.a) it.next()).cancel(z3);
            }
        }
        return this.f711N.cancel(z3);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) {
        return (List) this.f711N.f1193K.get(j3, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f711N.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f711N.f1193K.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        ArrayList arrayList = this.f707J;
        if (arrayList != null && !isDone()) {
            Iterator it = arrayList.iterator();
            loop0: while (it.hasNext()) {
                E1.a aVar = (E1.a) it.next();
                while (!aVar.isDone()) {
                    try {
                        aVar.get();
                    } catch (Error e4) {
                        throw e4;
                    } catch (InterruptedException e5) {
                        throw e5;
                    } catch (Throwable unused) {
                        if (this.f709L) {
                            break loop0;
                        }
                    }
                }
            }
        }
        return (List) this.f711N.f1193K.get();
    }
}
