package S;

import D.C;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import x1.AbstractC0691r0;

/* loaded from: classes.dex */
public abstract class h implements E1.a {

    /* renamed from: M  reason: collision with root package name */
    public static final boolean f1180M = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: N  reason: collision with root package name */
    public static final Logger f1181N = Logger.getLogger(h.class.getName());

    /* renamed from: O  reason: collision with root package name */
    public static final AbstractC0691r0 f1182O;

    /* renamed from: P  reason: collision with root package name */
    public static final Object f1183P;

    /* renamed from: J  reason: collision with root package name */
    public volatile Object f1184J;

    /* renamed from: K  reason: collision with root package name */
    public volatile d f1185K;

    /* renamed from: L  reason: collision with root package name */
    public volatile g f1186L;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [x1.r0] */
    /* JADX WARN: Type inference failed for: r2v7 */
    static {
        e eVar;
        try {
            th = null;
            eVar = new e(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "L"), AtomicReferenceFieldUpdater.newUpdater(h.class, d.class, "K"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "J"));
        } catch (Throwable th) {
            th = th;
            eVar = new Object();
        }
        f1182O = eVar;
        if (th != null) {
            f1181N.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f1183P = new Object();
    }

    public static void c(h hVar) {
        g gVar;
        d dVar;
        d dVar2;
        d dVar3;
        do {
            gVar = hVar.f1186L;
        } while (!f1182O.c(hVar, gVar, g.f1177c));
        while (true) {
            dVar = null;
            if (gVar == null) {
                break;
            }
            Thread thread = gVar.f1178a;
            if (thread != null) {
                gVar.f1178a = null;
                LockSupport.unpark(thread);
            }
            gVar = gVar.f1179b;
        }
        do {
            dVar2 = hVar.f1185K;
        } while (!f1182O.a(hVar, dVar2, d.f1168d));
        while (true) {
            dVar3 = dVar;
            dVar = dVar2;
            if (dVar == null) {
                break;
            }
            dVar2 = dVar.f1171c;
            dVar.f1171c = dVar3;
        }
        while (dVar3 != null) {
            d dVar4 = dVar3.f1171c;
            d(dVar3.f1169a, dVar3.f1170b);
            dVar3 = dVar4;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            Level level = Level.SEVERE;
            f1181N.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e4);
        }
    }

    public static Object e(Object obj) {
        if (!(obj instanceof a)) {
            if (!(obj instanceof c)) {
                if (obj == f1183P) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((c) obj).f1167a);
        }
        CancellationException cancellationException = ((a) obj).f1165a;
        CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
        cancellationException2.initCause(cancellationException);
        throw cancellationException2;
    }

    public static Object f(h hVar) {
        Object obj;
        boolean z3 = false;
        while (true) {
            try {
                obj = hVar.get();
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

    @Override // E1.a
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        d dVar = this.f1185K;
        d dVar2 = d.f1168d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.f1171c = dVar;
                if (f1182O.a(this, dVar, dVar3)) {
                    return;
                }
                dVar = this.f1185K;
            } while (dVar != dVar2);
            d(runnable, executor);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        String valueOf;
        try {
            Object f2 = f(this);
            sb.append("SUCCESS, result=[");
            if (f2 == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(f2);
            }
            sb.append(valueOf);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e4) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e4.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e5) {
            sb.append("FAILURE, cause=[");
            sb.append(e5.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        a aVar;
        Object obj = this.f1184J;
        if (obj != null) {
            return false;
        }
        if (f1180M) {
            aVar = new a(z3, new CancellationException("Future.cancel() was called."));
        } else if (z3) {
            aVar = a.f1163b;
        } else {
            aVar = a.f1164c;
        }
        if (!f1182O.b(this, obj, aVar)) {
            return false;
        }
        c(this);
        return true;
    }

    public String g() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) {
        Locale locale;
        long nanos = timeUnit.toNanos(j3);
        if (!Thread.interrupted()) {
            Object obj = this.f1184J;
            if (obj != null) {
                return e(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                g gVar = this.f1186L;
                g gVar2 = g.f1177c;
                if (gVar != gVar2) {
                    g gVar3 = new g();
                    do {
                        AbstractC0691r0 abstractC0691r0 = f1182O;
                        abstractC0691r0.d(gVar3, gVar);
                        if (abstractC0691r0.c(this, gVar, gVar3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f1184J;
                                    if (obj2 != null) {
                                        return e(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    h(gVar3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            h(gVar3);
                        } else {
                            gVar = this.f1186L;
                        }
                    } while (gVar != gVar2);
                    return e(this.f1184J);
                }
                return e(this.f1184J);
            }
            while (nanos > 0) {
                Object obj3 = this.f1184J;
                if (obj3 != null) {
                    return e(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String hVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j3 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String y3 = C.y(str, " (plus ");
                long j4 = -nanos;
                long convert = timeUnit.convert(j4, TimeUnit.NANOSECONDS);
                long nanos2 = j4 - timeUnit.toNanos(convert);
                int r15 = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                boolean z3 = r15 == 0 || nanos2 > 1000;
                if (r15 > 0) {
                    String str2 = y3 + convert + " " + lowerCase;
                    if (z3) {
                        str2 = C.y(str2, ",");
                    }
                    y3 = C.y(str2, " ");
                }
                if (z3) {
                    y3 = y3 + nanos2 + " nanoseconds ";
                }
                str = C.y(y3, "delay)");
            }
            if (isDone()) {
                throw new TimeoutException(C.y(str, " but future completed as timeout expired"));
            }
            throw new TimeoutException(str + " for " + hVar);
        }
        throw new InterruptedException();
    }

    public final void h(g gVar) {
        gVar.f1178a = null;
        while (true) {
            g gVar2 = this.f1186L;
            if (gVar2 == g.f1177c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f1179b;
                if (gVar2.f1178a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f1179b = gVar4;
                    if (gVar3.f1178a == null) {
                        break;
                    }
                } else if (!f1182O.c(this, gVar2, gVar4)) {
                    break;
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    public boolean i(Throwable th) {
        th.getClass();
        if (f1182O.b(this, null, new c(th))) {
            c(this);
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f1184J instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        if (this.f1184J != null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f1184J instanceof a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                str = g();
            } catch (RuntimeException e4) {
                str = "Exception thrown from implementation: " + e4.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f1184J;
            if (obj2 != null) {
                return e(obj2);
            }
            g gVar = this.f1186L;
            g gVar2 = g.f1177c;
            if (gVar != gVar2) {
                g gVar3 = new g();
                do {
                    AbstractC0691r0 abstractC0691r0 = f1182O;
                    abstractC0691r0.d(gVar3, gVar);
                    if (abstractC0691r0.c(this, gVar, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f1184J;
                            } else {
                                h(gVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return e(obj);
                    }
                    gVar = this.f1186L;
                } while (gVar != gVar2);
                return e(this.f1184J);
            }
            return e(this.f1184J);
        }
        throw new InterruptedException();
    }
}
