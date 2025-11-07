package j1;

import A0.C0001b;
import A0.RunnableC0004e;
import D.C;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zact;
import h1.C0281a;
import h1.C0283c;
import h1.C0284d;
import h2.J;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import k1.C0341j;
import u1.HandlerC0477e;

/* loaded from: classes.dex */
public final class m implements i1.g, i1.h {

    /* renamed from: m  reason: collision with root package name */
    public final i1.c f3816m;

    /* renamed from: n  reason: collision with root package name */
    public final C0302a f3817n;

    /* renamed from: o  reason: collision with root package name */
    public final J f3818o;

    /* renamed from: r  reason: collision with root package name */
    public final int f3821r;

    /* renamed from: s  reason: collision with root package name */
    public final zact f3822s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3823t;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ C0304c f3827x;

    /* renamed from: l  reason: collision with root package name */
    public final LinkedList f3815l = new LinkedList();

    /* renamed from: p  reason: collision with root package name */
    public final HashSet f3819p = new HashSet();

    /* renamed from: q  reason: collision with root package name */
    public final HashMap f3820q = new HashMap();

    /* renamed from: u  reason: collision with root package name */
    public final ArrayList f3824u = new ArrayList();

    /* renamed from: v  reason: collision with root package name */
    public C0281a f3825v = null;

    /* renamed from: w  reason: collision with root package name */
    public int f3826w = 0;

    public m(C0304c c0304c, i1.f fVar) {
        this.f3827x = c0304c;
        Looper looper = c0304c.f3810m.getLooper();
        C0001b a4 = fVar.a();
        V0.a aVar = new V0.a((R.c) a4.f85L, (String) a4.f84K, (String) a4.f86M);
        A1.b bVar = (A1.b) fVar.f3411c.f3303K;
        k1.w.e(bVar);
        i1.c a5 = bVar.a(fVar.f3409a, looper, aVar, fVar.f3412d, this, this);
        String str = fVar.f3410b;
        if (str != null && (a5 instanceof com.google.android.gms.common.internal.a)) {
            ((com.google.android.gms.common.internal.a) a5).f2756r = str;
        }
        if (str != null && (a5 instanceof h)) {
            C.G(a5);
            throw null;
        }
        this.f3816m = a5;
        this.f3817n = fVar.f3413e;
        this.f3818o = new J(4);
        this.f3821r = fVar.f3414f;
        if (a5.k()) {
            Context context = c0304c.f3803e;
            HandlerC0477e handlerC0477e = c0304c.f3810m;
            C0001b a6 = fVar.a();
            this.f3822s = new zact(context, handlerC0477e, new V0.a((R.c) a6.f85L, (String) a6.f84K, (String) a6.f86M));
            return;
        }
        this.f3822s = null;
    }

    @Override // i1.h
    public final void D(C0281a c0281a) {
        l(c0281a, null);
    }

    @Override // i1.g
    public final void Q(int r4) {
        Looper myLooper = Looper.myLooper();
        C0304c c0304c = this.f3827x;
        if (myLooper == c0304c.f3810m.getLooper()) {
            f(r4);
        } else {
            c0304c.f3810m.post(new l(this, r4));
        }
    }

    @Override // i1.g
    public final void Y() {
        Looper myLooper = Looper.myLooper();
        C0304c c0304c = this.f3827x;
        if (myLooper == c0304c.f3810m.getLooper()) {
            e();
        } else {
            c0304c.f3810m.post(new RunnableC0004e(11, this));
        }
    }

    public final void a(C0281a c0281a) {
        HashSet hashSet = this.f3819p;
        Iterator it = hashSet.iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (k1.w.h(c0281a, C0281a.f3248e)) {
                    this.f3816m.e();
                }
                throw null;
            }
            throw new ClassCastException();
        }
        hashSet.clear();
    }

    public final void b(Status status) {
        k1.w.b(this.f3827x.f3810m);
        c(status, null, false);
    }

    public final void c(Status status, RuntimeException runtimeException, boolean z3) {
        boolean z4;
        k1.w.b(this.f3827x.f3810m);
        boolean z5 = true;
        if (status != null) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (runtimeException != null) {
            z5 = false;
        }
        if (z4 != z5) {
            Iterator it = this.f3815l.iterator();
            while (it.hasNext()) {
                s sVar = (s) it.next();
                if (!z3 || sVar.f3838a == 2) {
                    if (status != null) {
                        sVar.c(status);
                    } else {
                        sVar.d(runtimeException);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    public final void d() {
        LinkedList linkedList = this.f3815l;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int r3 = 0; r3 < size; r3++) {
            s sVar = (s) arrayList.get(r3);
            if (this.f3816m.d()) {
                if (h(sVar)) {
                    linkedList.remove(sVar);
                }
            } else {
                return;
            }
        }
    }

    public final void e() {
        C0304c c0304c = this.f3827x;
        k1.w.b(c0304c.f3810m);
        this.f3825v = null;
        a(C0281a.f3248e);
        if (this.f3823t) {
            HandlerC0477e handlerC0477e = c0304c.f3810m;
            C0302a c0302a = this.f3817n;
            handlerC0477e.removeMessages(11, c0302a);
            c0304c.f3810m.removeMessages(9, c0302a);
            this.f3823t = false;
        }
        Iterator it = this.f3820q.values().iterator();
        if (!it.hasNext()) {
            d();
            g();
            return;
        }
        w wVar = (w) it.next();
        throw null;
    }

    public final void f(int r7) {
        C0304c c0304c = this.f3827x;
        k1.w.b(c0304c.f3810m);
        this.f3825v = null;
        this.f3823t = true;
        String g = this.f3816m.g();
        J j3 = this.f3818o;
        j3.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (r7 == 1) {
            sb.append(" due to service disconnection.");
        } else if (r7 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (g != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(g);
        }
        j3.G(true, new Status(sb.toString(), 20));
        HandlerC0477e handlerC0477e = c0304c.f3810m;
        C0302a c0302a = this.f3817n;
        handlerC0477e.sendMessageDelayed(Message.obtain(handlerC0477e, 9, c0302a), 5000L);
        HandlerC0477e handlerC0477e2 = c0304c.f3810m;
        handlerC0477e2.sendMessageDelayed(Message.obtain(handlerC0477e2, 11, c0302a), 120000L);
        ((SparseIntArray) c0304c.g.f3303K).clear();
        for (w wVar : this.f3820q.values()) {
            wVar.getClass();
        }
    }

    public final void g() {
        C0304c c0304c = this.f3827x;
        HandlerC0477e handlerC0477e = c0304c.f3810m;
        C0302a c0302a = this.f3817n;
        handlerC0477e.removeMessages(12, c0302a);
        HandlerC0477e handlerC0477e2 = c0304c.f3810m;
        handlerC0477e2.sendMessageDelayed(handlerC0477e2.obtainMessage(12, c0302a), c0304c.f3799a);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, R.k] */
    public final boolean h(s sVar) {
        C0283c c0283c;
        if (!(sVar instanceof s)) {
            i1.c cVar = this.f3816m;
            sVar.f(this.f3818o, cVar.k());
            try {
                sVar.e(this);
            } catch (DeadObjectException unused) {
                Q(1);
                cVar.j("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        C0283c[] b3 = sVar.b(this);
        if (b3 != null && b3.length != 0) {
            C0283c[] c4 = this.f3816m.c();
            if (c4 == null) {
                c4 = new C0283c[0];
            }
            int length = c4.length;
            ?? obj = new Object();
            if (length == 0) {
                obj.f1147J = R.d.f1119a;
                obj.f1148K = R.d.f1120b;
            } else {
                obj.a(length);
            }
            obj.f1149L = 0;
            for (C0283c c0283c2 : c4) {
                obj.put(c0283c2.f3256a, Long.valueOf(c0283c2.a()));
            }
            int length2 = b3.length;
            for (int r6 = 0; r6 < length2; r6++) {
                c0283c = b3[r6];
                Long l3 = (Long) obj.getOrDefault(c0283c.f3256a, null);
                if (l3 == null || l3.longValue() < c0283c.a()) {
                    break;
                }
            }
        }
        c0283c = null;
        if (c0283c == null) {
            i1.c cVar2 = this.f3816m;
            sVar.f(this.f3818o, cVar2.k());
            try {
                sVar.e(this);
            } catch (DeadObjectException unused2) {
                Q(1);
                cVar2.j("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        Log.w("GoogleApiManager", this.f3816m.getClass().getName() + " could not execute call because it requires feature (" + c0283c.f3256a + ", " + c0283c.a() + ").");
        if (this.f3827x.f3811n && sVar.a(this)) {
            n nVar = new n(this.f3817n, c0283c);
            int indexOf = this.f3824u.indexOf(nVar);
            if (indexOf >= 0) {
                n nVar2 = (n) this.f3824u.get(indexOf);
                this.f3827x.f3810m.removeMessages(15, nVar2);
                HandlerC0477e handlerC0477e = this.f3827x.f3810m;
                Message obtain = Message.obtain(handlerC0477e, 15, nVar2);
                this.f3827x.getClass();
                handlerC0477e.sendMessageDelayed(obtain, 5000L);
            } else {
                this.f3824u.add(nVar);
                HandlerC0477e handlerC0477e2 = this.f3827x.f3810m;
                Message obtain2 = Message.obtain(handlerC0477e2, 15, nVar);
                this.f3827x.getClass();
                handlerC0477e2.sendMessageDelayed(obtain2, 5000L);
                HandlerC0477e handlerC0477e3 = this.f3827x.f3810m;
                Message obtain3 = Message.obtain(handlerC0477e3, 16, nVar);
                this.f3827x.getClass();
                handlerC0477e3.sendMessageDelayed(obtain3, 120000L);
                C0281a c0281a = new C0281a(2, null);
                if (!i(c0281a)) {
                    this.f3827x.b(c0281a, this.f3821r);
                }
            }
            return false;
        }
        sVar.d(new i1.l(c0283c));
        return true;
    }

    public final boolean i(C0281a c0281a) {
        synchronized (C0304c.f3797q) {
            this.f3827x.getClass();
        }
        return false;
    }

    public final void j() {
        C0304c c0304c = this.f3827x;
        k1.w.b(c0304c.f3810m);
        i1.c cVar = this.f3816m;
        if (!cVar.d() && !cVar.b()) {
            try {
                J j3 = c0304c.g;
                Context context = c0304c.f3803e;
                j3.getClass();
                k1.w.e(context);
                int l3 = cVar.l();
                SparseIntArray sparseIntArray = (SparseIntArray) j3.f3303K;
                int r8 = sparseIntArray.get(l3, -1);
                if (r8 == -1) {
                    r8 = 0;
                    int r9 = 0;
                    while (true) {
                        if (r9 < sparseIntArray.size()) {
                            int keyAt = sparseIntArray.keyAt(r9);
                            if (keyAt > l3 && sparseIntArray.get(keyAt) == 0) {
                                break;
                            }
                            r9++;
                        } else {
                            r8 = -1;
                            break;
                        }
                    }
                    if (r8 == -1) {
                        r8 = ((C0284d) j3.f3304L).c(context, l3);
                    }
                    sparseIntArray.put(l3, r8);
                }
                if (r8 != 0) {
                    C0281a c0281a = new C0281a(r8, null);
                    String name = cVar.getClass().getName();
                    String c0281a2 = c0281a.toString();
                    Log.w("GoogleApiManager", "The service for " + name + " is not available: " + c0281a2);
                    l(c0281a, null);
                    return;
                }
                o oVar = new o(c0304c, cVar, this.f3817n);
                if (cVar.k()) {
                    zact zactVar = this.f3822s;
                    k1.w.e(zactVar);
                    B1.a aVar = zactVar.f2737q;
                    if (aVar != null) {
                        aVar.i();
                    }
                    Integer valueOf = Integer.valueOf(System.identityHashCode(zactVar));
                    V0.a aVar2 = zactVar.f2736p;
                    aVar2.f1357K = valueOf;
                    HandlerC0477e handlerC0477e = zactVar.f2733m;
                    Looper looper = handlerC0477e.getLooper();
                    zactVar.f2737q = (B1.a) zactVar.f2734n.a(zactVar.f2732l, looper, aVar2, (A1.a) aVar2.f1361O, zactVar, zactVar);
                    zactVar.f2738r = oVar;
                    Set set = zactVar.f2735o;
                    if (set != null && !set.isEmpty()) {
                        B1.a aVar3 = zactVar.f2737q;
                        aVar3.getClass();
                        aVar3.m(new C0341j(aVar3));
                    } else {
                        handlerC0477e.post(new RunnableC0004e(13, zactVar));
                    }
                }
                try {
                    cVar.m(oVar);
                } catch (SecurityException e4) {
                    l(new C0281a(10), e4);
                }
            } catch (IllegalStateException e5) {
                l(new C0281a(10), e5);
            }
        }
    }

    public final void k(s sVar) {
        k1.w.b(this.f3827x.f3810m);
        boolean d4 = this.f3816m.d();
        LinkedList linkedList = this.f3815l;
        if (d4) {
            if (h(sVar)) {
                g();
                return;
            } else {
                linkedList.add(sVar);
                return;
            }
        }
        linkedList.add(sVar);
        C0281a c0281a = this.f3825v;
        if (c0281a != null && c0281a.f3250b != 0 && c0281a.f3251c != null) {
            l(c0281a, null);
        } else {
            j();
        }
    }

    public final void l(C0281a c0281a, RuntimeException runtimeException) {
        B1.a aVar;
        k1.w.b(this.f3827x.f3810m);
        zact zactVar = this.f3822s;
        if (zactVar != null && (aVar = zactVar.f2737q) != null) {
            aVar.i();
        }
        k1.w.b(this.f3827x.f3810m);
        this.f3825v = null;
        ((SparseIntArray) this.f3827x.g.f3303K).clear();
        a(c0281a);
        if ((this.f3816m instanceof m1.c) && c0281a.f3250b != 24) {
            C0304c c0304c = this.f3827x;
            c0304c.f3800b = true;
            HandlerC0477e handlerC0477e = c0304c.f3810m;
            handlerC0477e.sendMessageDelayed(handlerC0477e.obtainMessage(19), 300000L);
        }
        if (c0281a.f3250b == 4) {
            b(C0304c.f3796p);
        } else if (this.f3815l.isEmpty()) {
            this.f3825v = c0281a;
        } else if (runtimeException != null) {
            k1.w.b(this.f3827x.f3810m);
            c(null, runtimeException, false);
        } else if (this.f3827x.f3811n) {
            c(C0304c.c(this.f3817n, c0281a), null, true);
            if (!this.f3815l.isEmpty() && !i(c0281a) && !this.f3827x.b(c0281a, this.f3821r)) {
                if (c0281a.f3250b == 18) {
                    this.f3823t = true;
                }
                if (this.f3823t) {
                    HandlerC0477e handlerC0477e2 = this.f3827x.f3810m;
                    Message obtain = Message.obtain(handlerC0477e2, 9, this.f3817n);
                    this.f3827x.getClass();
                    handlerC0477e2.sendMessageDelayed(obtain, 5000L);
                    return;
                }
                b(C0304c.c(this.f3817n, c0281a));
            }
        } else {
            b(C0304c.c(this.f3817n, c0281a));
        }
    }

    public final void m() {
        k1.w.b(this.f3827x.f3810m);
        Status status = C0304c.f3795o;
        b(status);
        this.f3818o.G(false, status);
        for (g gVar : (g[]) this.f3820q.keySet().toArray(new g[0])) {
            k(new y(gVar, new C1.g()));
        }
        a(new C0281a(4));
        i1.c cVar = this.f3816m;
        if (cVar.d()) {
            cVar.a(new A.c(28, this));
        }
    }
}
