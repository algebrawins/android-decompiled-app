package H;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import x1.AbstractC0624h4;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f704J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ E1.a f705K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ j f706L;

    public i(j jVar, int r22, E1.a aVar) {
        this.f706L = jVar;
        this.f704J = r22;
        this.f705K = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        S.i iVar;
        ArrayList arrayList;
        int decrementAndGet;
        int r02 = this.f704J;
        E1.a aVar = this.f705K;
        j jVar = this.f706L;
        AtomicInteger atomicInteger = jVar.f710M;
        ArrayList arrayList2 = jVar.f708K;
        boolean isDone = jVar.isDone();
        boolean z3 = jVar.f709L;
        if (!isDone && arrayList2 != null) {
            boolean z4 = true;
            try {
                try {
                    try {
                        try {
                            AbstractC0624h4.f("Tried to set value from future which is not done", aVar.isDone());
                            arrayList2.set(r02, f.b(aVar));
                            decrementAndGet = atomicInteger.decrementAndGet();
                            if (decrementAndGet < 0) {
                                z4 = false;
                            }
                            AbstractC0624h4.f("Less than 0 remaining futures", z4);
                        } catch (CancellationException unused) {
                            if (z3) {
                                jVar.cancel(false);
                            }
                            int decrementAndGet2 = atomicInteger.decrementAndGet();
                            if (decrementAndGet2 < 0) {
                                z4 = false;
                            }
                            AbstractC0624h4.f("Less than 0 remaining futures", z4);
                            if (decrementAndGet2 == 0) {
                                ArrayList arrayList3 = jVar.f708K;
                                if (arrayList3 != null) {
                                    iVar = jVar.f712O;
                                    arrayList = new ArrayList(arrayList3);
                                }
                            } else {
                                return;
                            }
                        } catch (ExecutionException e4) {
                            if (z3) {
                                jVar.f712O.b(e4.getCause());
                            }
                            int decrementAndGet3 = atomicInteger.decrementAndGet();
                            if (decrementAndGet3 < 0) {
                                z4 = false;
                            }
                            AbstractC0624h4.f("Less than 0 remaining futures", z4);
                            if (decrementAndGet3 == 0) {
                                ArrayList arrayList4 = jVar.f708K;
                                if (arrayList4 != null) {
                                    iVar = jVar.f712O;
                                    arrayList = new ArrayList(arrayList4);
                                }
                            } else {
                                return;
                            }
                        }
                    } catch (RuntimeException e5) {
                        if (z3) {
                            jVar.f712O.b(e5);
                        }
                        int decrementAndGet4 = atomicInteger.decrementAndGet();
                        if (decrementAndGet4 < 0) {
                            z4 = false;
                        }
                        AbstractC0624h4.f("Less than 0 remaining futures", z4);
                        if (decrementAndGet4 == 0) {
                            ArrayList arrayList5 = jVar.f708K;
                            if (arrayList5 != null) {
                                iVar = jVar.f712O;
                                arrayList = new ArrayList(arrayList5);
                            }
                        } else {
                            return;
                        }
                    }
                } catch (Error e6) {
                    jVar.f712O.b(e6);
                    int decrementAndGet5 = atomicInteger.decrementAndGet();
                    if (decrementAndGet5 < 0) {
                        z4 = false;
                    }
                    AbstractC0624h4.f("Less than 0 remaining futures", z4);
                    if (decrementAndGet5 == 0) {
                        ArrayList arrayList6 = jVar.f708K;
                        if (arrayList6 != null) {
                            iVar = jVar.f712O;
                            arrayList = new ArrayList(arrayList6);
                        }
                    } else {
                        return;
                    }
                }
                if (decrementAndGet == 0) {
                    ArrayList arrayList7 = jVar.f708K;
                    if (arrayList7 != null) {
                        iVar = jVar.f712O;
                        arrayList = new ArrayList(arrayList7);
                        iVar.a(arrayList);
                        return;
                    }
                    AbstractC0624h4.f(null, jVar.isDone());
                    return;
                }
                return;
            } catch (Throwable th) {
                int decrementAndGet6 = atomicInteger.decrementAndGet();
                if (decrementAndGet6 < 0) {
                    z4 = false;
                }
                AbstractC0624h4.f("Less than 0 remaining futures", z4);
                if (decrementAndGet6 == 0) {
                    ArrayList arrayList8 = jVar.f708K;
                    if (arrayList8 != null) {
                        jVar.f712O.a(new ArrayList(arrayList8));
                    } else {
                        AbstractC0624h4.f(null, jVar.isDone());
                    }
                }
                throw th;
            }
        }
        AbstractC0624h4.f("Future was done before all dependencies completed", z3);
    }
}
