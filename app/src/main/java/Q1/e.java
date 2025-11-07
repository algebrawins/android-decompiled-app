package Q1;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public Object f1066a;

    /* renamed from: b  reason: collision with root package name */
    public Object f1067b;

    /* renamed from: c  reason: collision with root package name */
    public Object f1068c;

    public static boolean k(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public C1.j a(final Executor executor, final Callable callable, final A.a aVar) {
        if (((AtomicInteger) this.f1067b).get() > 0) {
            if (((C1.j) aVar.f1K).e()) {
                C1.j jVar = new C1.j();
                jVar.i();
                return jVar;
            }
            final A.c cVar = new A.c(5);
            final C1.g gVar = new C1.g((A.a) cVar.f5K);
            Executor executor2 = new Executor() { // from class: Q1.q
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    try {
                        executor.execute(runnable);
                    } catch (RuntimeException e4) {
                        if (((C1.j) aVar.f1K).e()) {
                            cVar.u();
                        } else {
                            gVar.f239a.g(e4);
                        }
                        throw e4;
                    }
                }
            };
            ((k) this.f1066a).b(new Runnable() { // from class: Q1.r
                @Override // java.lang.Runnable
                public final void run() {
                    e eVar = e.this;
                    A.a aVar2 = aVar;
                    A.c cVar2 = cVar;
                    Callable callable2 = callable;
                    C1.g gVar2 = gVar;
                    eVar.getClass();
                    try {
                        if (((C1.j) aVar2.f1K).e()) {
                            cVar2.u();
                            return;
                        }
                        try {
                            if (!((AtomicBoolean) eVar.f1068c).get()) {
                                W1.h hVar = (W1.h) eVar;
                                synchronized (hVar) {
                                    hVar.f1522i = hVar.f1519e.b();
                                }
                                ((AtomicBoolean) eVar.f1068c).set(true);
                            }
                            if (((C1.j) aVar2.f1K).e()) {
                                cVar2.u();
                                return;
                            }
                            Object call = callable2.call();
                            if (((C1.j) aVar2.f1K).e()) {
                                cVar2.u();
                            } else {
                                gVar2.f239a.h(call);
                            }
                        } catch (RuntimeException e4) {
                            throw new M1.a("Internal error has occurred when executing ML Kit tasks", e4);
                        }
                    } catch (Exception e5) {
                        if (((C1.j) aVar2.f1K).e()) {
                            cVar2.u();
                        } else {
                            gVar2.f239a.g(e5);
                        }
                    }
                }
            }, executor2);
            return gVar.f239a;
        }
        throw new IllegalStateException();
    }

    public abstract void b();

    public abstract Object c(int r12, int r22);

    public abstract Map d();

    public abstract int e();

    public abstract int f(Object obj);

    public abstract int g(Object obj);

    public abstract void h(Object obj, Object obj2);

    public abstract void i(int r12);

    public abstract Object j(int r12, Object obj);

    public Object[] l(int r4, Object[] objArr) {
        int e4 = e();
        if (objArr.length < e4) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), e4);
        }
        for (int r12 = 0; r12 < e4; r12++) {
            objArr[r12] = c(r12, r4);
        }
        if (objArr.length > e4) {
            objArr[e4] = null;
        }
        return objArr;
    }
}
