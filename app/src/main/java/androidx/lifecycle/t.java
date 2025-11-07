package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import q.C0428a;
import r.C0436a;
import r.C0438c;

/* loaded from: classes.dex */
public final class t extends m {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2465a;

    /* renamed from: b  reason: collision with root package name */
    public C0436a f2466b;

    /* renamed from: c  reason: collision with root package name */
    public l f2467c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakReference f2468d;

    /* renamed from: e  reason: collision with root package name */
    public int f2469e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2470f;
    public boolean g;

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f2471h;

    /* renamed from: i  reason: collision with root package name */
    public final Y2.q f2472i;

    public t(r rVar) {
        new AtomicReference();
        this.f2465a = true;
        this.f2466b = new C0436a();
        l lVar = l.INITIALIZED;
        this.f2467c = lVar;
        this.f2471h = new ArrayList();
        this.f2468d = new WeakReference(rVar);
        this.f2472i = new Y2.q(lVar == null ? Z2.l.f1793a : lVar);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.lifecycle.s, java.lang.Object] */
    @Override // androidx.lifecycle.m
    public final void a(q qVar) {
        p c0132e;
        r rVar;
        ArrayList arrayList = this.f2471h;
        Object obj = null;
        N2.g.e(qVar, "observer");
        d("addObserver");
        l lVar = this.f2467c;
        l lVar2 = l.DESTROYED;
        if (lVar != lVar2) {
            lVar2 = l.INITIALIZED;
        }
        N2.g.e(lVar2, "initialState");
        ?? obj2 = new Object();
        HashMap hashMap = u.f2473a;
        boolean z3 = qVar instanceof p;
        boolean z4 = qVar instanceof DefaultLifecycleObserver;
        boolean z5 = false;
        if (z3 && z4) {
            c0132e = new C0132e((DefaultLifecycleObserver) qVar, (p) qVar);
        } else if (z4) {
            c0132e = new C0132e((DefaultLifecycleObserver) qVar, null);
        } else if (z3) {
            c0132e = (p) qVar;
        } else {
            Class<?> cls = qVar.getClass();
            if (u.b(cls) == 2) {
                Object obj3 = u.f2474b.get(cls);
                N2.g.b(obj3);
                List list = (List) obj3;
                if (list.size() != 1) {
                    int size = list.size();
                    InterfaceC0134g[] interfaceC0134gArr = new InterfaceC0134g[size];
                    if (size <= 0) {
                        c0132e = new B0.a(1, interfaceC0134gArr);
                    } else {
                        u.a((Constructor) list.get(0), qVar);
                        throw null;
                    }
                } else {
                    u.a((Constructor) list.get(0), qVar);
                    throw null;
                }
            } else {
                c0132e = new C0132e(qVar);
            }
        }
        obj2.f2464b = c0132e;
        obj2.f2463a = lVar2;
        C0436a c0436a = this.f2466b;
        C0438c e4 = c0436a.e(qVar);
        if (e4 != null) {
            obj = e4.f4860K;
        } else {
            HashMap hashMap2 = c0436a.f4855N;
            C0438c c0438c = new C0438c(qVar, obj2);
            c0436a.f4869M++;
            C0438c c0438c2 = c0436a.f4867K;
            if (c0438c2 == null) {
                c0436a.f4866J = c0438c;
                c0436a.f4867K = c0438c;
            } else {
                c0438c2.f4861L = c0438c;
                c0438c.f4862M = c0438c2;
                c0436a.f4867K = c0438c;
            }
            hashMap2.put(qVar, c0438c);
        }
        if (((s) obj) != null || (rVar = (r) this.f2468d.get()) == null) {
            return;
        }
        z5 = (this.f2469e != 0 || this.f2470f) ? true : true;
        l c4 = c(qVar);
        this.f2469e++;
        while (obj2.f2463a.compareTo(c4) < 0 && this.f2466b.f4855N.containsKey(qVar)) {
            arrayList.add(obj2.f2463a);
            i iVar = EnumC0137k.Companion;
            l lVar3 = obj2.f2463a;
            iVar.getClass();
            EnumC0137k a4 = i.a(lVar3);
            if (a4 != null) {
                obj2.a(rVar, a4);
                arrayList.remove(arrayList.size() - 1);
                c4 = c(qVar);
            } else {
                throw new IllegalStateException("no event up from " + obj2.f2463a);
            }
        }
        if (!z5) {
            f();
        }
        this.f2469e--;
    }

    @Override // androidx.lifecycle.m
    public final void b(q qVar) {
        N2.g.e(qVar, "observer");
        d("removeObserver");
        this.f2466b.h(qVar);
    }

    public final l c(q qVar) {
        C0438c c0438c;
        l lVar;
        HashMap hashMap = this.f2466b.f4855N;
        l lVar2 = null;
        if (hashMap.containsKey(qVar)) {
            c0438c = ((C0438c) hashMap.get(qVar)).f4862M;
        } else {
            c0438c = null;
        }
        if (c0438c != null) {
            lVar = ((s) c0438c.f4860K).f2463a;
        } else {
            lVar = null;
        }
        ArrayList arrayList = this.f2471h;
        if (!arrayList.isEmpty()) {
            lVar2 = (l) arrayList.get(arrayList.size() - 1);
        }
        l lVar3 = this.f2467c;
        N2.g.e(lVar3, "state1");
        if (lVar == null || lVar.compareTo(lVar3) >= 0) {
            lVar = lVar3;
        }
        if (lVar2 == null || lVar2.compareTo(lVar) >= 0) {
            return lVar;
        }
        return lVar2;
    }

    public final void d(String str) {
        if (this.f2465a) {
            C0428a.a().f4790a.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
            }
        }
    }

    public final void e(EnumC0137k enumC0137k) {
        N2.g.e(enumC0137k, "event");
        d("handleLifecycleEvent");
        l a4 = enumC0137k.a();
        l lVar = this.f2467c;
        if (lVar != a4) {
            if (lVar == l.INITIALIZED && a4 == l.DESTROYED) {
                throw new IllegalStateException(("no event down from " + this.f2467c + " in component " + this.f2468d.get()).toString());
            }
            this.f2467c = a4;
            if (!this.f2470f && this.f2469e == 0) {
                this.f2470f = true;
                f();
                this.f2470f = false;
                if (this.f2467c == l.DESTROYED) {
                    this.f2466b = new C0436a();
                    return;
                }
                return;
            }
            this.g = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
        r9.g = false;
        r0 = r9.f2467c;
        r1 = r9.f2472i;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
        if (r0 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        r0 = Z2.l.f1793a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        r1.c(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.t.f():void");
    }
}
