package H;

import F1.p;
import F1.q;
import F1.r;
import Q1.m;
import Q1.n;
import V2.AbstractC0066x;
import android.app.job.JobParameters;
import android.graphics.Typeface;
import android.os.IBinder;
import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.common.internal.IAccountAccessor$Stub;
import com.google.android.libraries.barhopper.RecognitionOptions;
import d2.C0235c;
import h1.C0281a;
import j1.C0302a;
import j1.C0304c;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import k1.InterfaceC0336d;
import k1.w;
import p.C0408f;
import p.C0419s;
import p.C0420t;
import q0.k;
import w1.o;
import w1.t;
import x1.I6;
import x1.M4;
import x1.O4;
import x1.Z4;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f698J;

    /* renamed from: K  reason: collision with root package name */
    public Object f699K;

    /* renamed from: L  reason: collision with root package name */
    public final Object f700L;

    public /* synthetic */ e(int r12, Object obj, Object obj2) {
        this.f698J = r12;
        this.f699K = obj;
        this.f700L = obj2;
    }

    private final void a() {
        synchronized (((C1.i) this.f700L).f243K) {
            try {
                C1.d dVar = (C1.d) ((C1.i) this.f700L).f245M;
                if (dVar != null) {
                    Exception c4 = ((C1.j) this.f699K).c();
                    w.e(c4);
                    dVar.q(c4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        synchronized (((C1.i) this.f700L).f243K) {
            try {
                C1.e eVar = (C1.e) ((C1.i) this.f700L).f245M;
                if (eVar != null) {
                    eVar.b(((C1.j) this.f699K).d());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        q qVar;
        r rVar = (r) this.f699K;
        L1.a aVar = (L1.a) this.f700L;
        if (rVar.f647b == F1.g.f624c) {
            synchronized (rVar) {
                qVar = rVar.f646a;
                rVar.f646a = null;
                rVar.f647b = aVar;
            }
            qVar.getClass();
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }

    private final void d() {
        p pVar = (p) this.f699K;
        L1.a aVar = (L1.a) this.f700L;
        synchronized (pVar) {
            try {
                if (pVar.f644b == null) {
                    pVar.f643a.add(aVar);
                } else {
                    pVar.f644b.add(aVar.get());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, V0.a] */
    private final void e() {
        M4 m4;
        W1.h hVar = (W1.h) this.f699K;
        C1.g gVar = (C1.g) this.f700L;
        int decrementAndGet = ((AtomicInteger) hVar.f1067b).decrementAndGet();
        if (decrementAndGet >= 0) {
            if (decrementAndGet == 0) {
                synchronized (hVar) {
                    try {
                        hVar.f1519e.a();
                        W1.h.f1517k = true;
                        I6 r4 = hVar.f1520f;
                        ?? obj = new Object();
                        if (hVar.f1522i) {
                            m4 = M4.zzc;
                        } else {
                            m4 = M4.zzb;
                        }
                        obj.f1358L = m4;
                        E.c cVar = new E.c(8);
                        cVar.f503L = W1.c.a(hVar.f1518d);
                        obj.f1359M = new Z4(cVar);
                        n.zza.execute(new o.e(r4, new U1.h(obj, 0), O4.zzl, r4.c(), 1));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                ((AtomicBoolean) hVar.f1068c).set(false);
            }
            o.f5312J.clear();
            t.f5318a.clear();
            gVar.f239a.h(null);
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [E1.a] */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.Object, k1.d] */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r3v20, types: [i1.c] */
    @Override // java.lang.Runnable
    public final void run() {
        a3.i iVar;
        InterfaceC0336d interfaceC0336d;
        Set set;
        C0235c c0235c;
        boolean z3 = true;
        ?? r12 = 0;
        int r22 = 0;
        try {
            switch (this.f698J) {
                case RecognitionOptions.UNRECOGNIZED /* 0 */:
                    c cVar = (c) this.f700L;
                    try {
                        cVar.b(f.a((E1.a) this.f699K));
                        return;
                    } catch (Error e4) {
                        e = e4;
                        cVar.c0(e);
                        return;
                    } catch (RuntimeException e5) {
                        e = e5;
                        cVar.c0(e);
                        return;
                    } catch (ExecutionException e6) {
                        Throwable cause = e6.getCause();
                        if (cause == null) {
                            cVar.c0(e6);
                            return;
                        } else {
                            cVar.c0(cause);
                            return;
                        }
                    }
                case 1:
                    synchronized (((C1.i) this.f700L).f243K) {
                        ((C1.c) ((C1.i) this.f700L).f245M).e((C1.j) this.f699K);
                    }
                    return;
                case 2:
                    a();
                    return;
                case k.INTEGER_FIELD_NUMBER /* 3 */:
                    b();
                    return;
                case 4:
                    C1.i iVar2 = (C1.i) this.f700L;
                    try {
                        C1.j R3 = ((A.c) iVar2.f243K).R(((C1.j) this.f699K).d());
                        G.a aVar = C1.h.f241b;
                        R3.b(aVar, iVar2);
                        R3.a(aVar, iVar2);
                        R3.f247b.g(new C1.i(aVar, (C1.b) iVar2));
                        R3.l();
                        return;
                    } catch (C1.f e7) {
                        if (e7.getCause() instanceof Exception) {
                            iVar2.q((Exception) e7.getCause());
                            return;
                        } else {
                            iVar2.q(e7);
                            return;
                        }
                    } catch (CancellationException unused) {
                        iVar2.p();
                        return;
                    } catch (Exception e8) {
                        iVar2.q(e8);
                        return;
                    }
                case k.STRING_FIELD_NUMBER /* 5 */:
                    c();
                    return;
                case k.STRING_SET_FIELD_NUMBER /* 6 */:
                    d();
                    return;
                case k.DOUBLE_FIELD_NUMBER /* 7 */:
                    try {
                        Object b3 = f.b((E1.a) this.f699K);
                        S.i iVar3 = ((b) this.f700L).f697K;
                        if (iVar3 != null) {
                            iVar3.a(b3);
                        }
                    } catch (CancellationException unused2) {
                        ((b) this.f700L).cancel(false);
                    } catch (ExecutionException e9) {
                        Throwable cause2 = e9.getCause();
                        S.i iVar4 = ((b) this.f700L).f697K;
                        if (iVar4 != null) {
                            iVar4.b(cause2);
                        }
                    }
                    return;
                case 8:
                    ReferenceQueue referenceQueue = (ReferenceQueue) this.f699K;
                    while (!((Set) this.f700L).isEmpty()) {
                        try {
                            m mVar = (m) referenceQueue.remove();
                            if (mVar.f1088a.remove(mVar)) {
                                mVar.clear();
                                mVar.f1089b.getClass();
                            }
                        } catch (InterruptedException unused3) {
                        }
                    }
                    return;
                case 9:
                    Callable callable = (Callable) this.f699K;
                    C1.j jVar = ((C1.g) this.f700L).f239a;
                    try {
                        jVar.h(callable.call());
                        return;
                    } catch (M1.a e10) {
                        jVar.g(e10);
                        return;
                    } catch (Exception e11) {
                        jVar.g(new M1.a("Internal error has occurred when executing ML Kit tasks", e11));
                        return;
                    }
                case 10:
                    e();
                    return;
                case 11:
                    Runnable runnable = (Runnable) this.f700L;
                    Q1.k kVar = (Q1.k) this.f699K;
                    AtomicReference atomicReference = (AtomicReference) kVar.f1086d;
                    if (((Thread) ((AtomicReference) kVar.f1086d).getAndSet(Thread.currentThread())) == null) {
                        try {
                            runnable.run();
                            atomicReference.set(null);
                            kVar.c();
                            return;
                        } catch (Throwable th) {
                            try {
                                atomicReference.set(null);
                                kVar.c();
                            } catch (Throwable th2) {
                                try {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                } catch (Exception unused4) {
                                }
                            }
                            throw th;
                        }
                    }
                    throw new IllegalStateException();
                case 12:
                    int r02 = JobInfoSchedulerService.f2709J;
                    ((JobInfoSchedulerService) this.f699K).jobFinished((JobParameters) this.f700L, false);
                    return;
                case 13:
                    break;
                case 14:
                    C0419s c0419s = (C0419s) ((A.c) this.f699K).f5K;
                    if (c0419s != null) {
                        c0419s.b((Typeface) this.f700L);
                        return;
                    }
                    return;
                case 15:
                    ((N.g) this.f699K).accept(this.f700L);
                    return;
                case 16:
                    j1.o oVar = (j1.o) this.f700L;
                    j1.m mVar2 = (j1.m) ((C0304c) oVar.f3835f).f3807j.get((C0302a) oVar.f3832c);
                    if (mVar2 != null) {
                        C0281a c0281a = (C0281a) this.f699K;
                        if (c0281a.f3250b == 0) {
                            r22 = 1;
                        }
                        if (r22 != 0) {
                            oVar.f3830a = true;
                            i1.c cVar2 = (i1.c) oVar.f3831b;
                            if (cVar2.k()) {
                                if (oVar.f3830a && (interfaceC0336d = (InterfaceC0336d) oVar.f3833d) != null) {
                                    cVar2.f(interfaceC0336d, (Set) oVar.f3834e);
                                    return;
                                }
                                return;
                            }
                            try {
                                cVar2.f(null, cVar2.h());
                                return;
                            } catch (SecurityException e12) {
                                Log.e("GoogleApiManager", "Failed to get service from broker. ", e12);
                                cVar2.j("Failed to get service from broker.");
                                mVar2.l(new C0281a(10), null);
                                return;
                            }
                        }
                        mVar2.l(c0281a, null);
                        return;
                    }
                    return;
                case 17:
                    A1.b bVar = zact.f2731s;
                    B1.g gVar = (B1.g) this.f699K;
                    C0281a c0281a2 = gVar.f198b;
                    if (c0281a2.f3250b != 0) {
                        z3 = false;
                    }
                    zact zactVar = (zact) this.f700L;
                    if (z3) {
                        k1.q qVar = gVar.f199c;
                        w.e(qVar);
                        C0281a c0281a3 = qVar.f4072c;
                        if (c0281a3.f3250b == 0) {
                            j1.o oVar2 = zactVar.f2738r;
                            IBinder iBinder = qVar.f4071b;
                            if (iBinder != null) {
                                r12 = IAccountAccessor$Stub.asInterface(iBinder);
                            }
                            oVar2.getClass();
                            if (r12 != 0 && (set = zactVar.f2735o) != null) {
                                oVar2.f3833d = r12;
                                oVar2.f3834e = set;
                                if (oVar2.f3830a) {
                                    ((i1.c) oVar2.f3831b).f(r12, set);
                                }
                            } else {
                                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                                oVar2.e(new C0281a(4));
                            }
                        } else {
                            Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(c0281a3)), new Exception());
                            zactVar.f2738r.e(c0281a3);
                            zactVar.f2737q.i();
                            return;
                        }
                    } else {
                        zactVar.f2738r.e(c0281a2);
                    }
                    zactVar.f2737q.i();
                    return;
                case 18:
                    p.i iVar5 = (p.i) this.f700L;
                    o.j jVar2 = iVar5.f4623L;
                    if (jVar2 != null && (c0235c = jVar2.f4412e) != null) {
                        ((ActionMenuView) c0235c.f3003K).getClass();
                    }
                    ActionMenuView actionMenuView = iVar5.f4627P;
                    if (actionMenuView != null && actionMenuView.getWindowToken() != null) {
                        C0408f c0408f = (C0408f) this.f699K;
                        if (!c0408f.b()) {
                            if (c0408f.f4460e != null) {
                                c0408f.d(0, 0, false, false);
                            }
                        }
                        iVar5.a0 = c0408f;
                    }
                    iVar5.f4639c0 = null;
                    return;
                default:
                    C0420t c0420t = (C0420t) ((WeakReference) this.f699K).get();
                    if (c0420t != null && c0420t.f4717m) {
                        TextView textView = c0420t.f4706a;
                        Typeface typeface = (Typeface) this.f700L;
                        textView.setTypeface(typeface);
                        c0420t.f4716l = typeface;
                        return;
                    }
                    return;
            }
            do {
                try {
                    ((Runnable) this.f699K).run();
                } catch (Throwable th3) {
                    AbstractC0066x.d(D2.j.f492J, th3);
                }
                iVar = (a3.i) this.f700L;
                Runnable m3 = iVar.m();
                if (m3 != null) {
                    this.f699K = m3;
                    r22++;
                } else {
                    return;
                }
            } while (r22 < 16);
            c3.n nVar = iVar.f1862L;
            nVar.getClass();
            nVar.h(iVar, this);
        } finally {
            ((b) this.f700L).f695P = null;
        }
    }

    public String toString() {
        switch (this.f698J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return e.class.getSimpleName() + "," + ((c) this.f700L);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ e(Object obj, Object obj2, int r3, boolean z3) {
        this.f698J = r3;
        this.f700L = obj;
        this.f699K = obj2;
    }
}
