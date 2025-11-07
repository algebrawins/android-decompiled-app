package I;

import D.C;
import D.E;
import D.InterfaceC0031l;
import D.S;
import D.e0;
import D.r0;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.A;
import androidx.camera.core.impl.AbstractC0088p;
import androidx.camera.core.impl.C0076c;
import androidx.camera.core.impl.C0079f;
import androidx.camera.core.impl.G;
import androidx.camera.core.impl.H;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.InterfaceC0087o;
import androidx.camera.core.impl.InterfaceC0089q;
import androidx.camera.core.impl.InterfaceC0091t;
import androidx.camera.core.impl.O;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.W;
import androidx.camera.core.impl.X;
import androidx.camera.core.impl.k0;
import androidx.camera.core.impl.n0;
import androidx.camera.core.impl.r;
import com.google.android.libraries.barhopper.RecognitionOptions;
import h2.J;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import v.C0479a;
import w.C0489E;
import x1.AbstractC0624h4;
import x1.AbstractC0636k0;

/* loaded from: classes.dex */
public final class h implements InterfaceC0031l {

    /* renamed from: J  reason: collision with root package name */
    public final InterfaceC0091t f753J;

    /* renamed from: K  reason: collision with root package name */
    public final J f754K;

    /* renamed from: L  reason: collision with root package name */
    public final C0489E f755L;

    /* renamed from: M  reason: collision with root package name */
    public final f f756M;

    /* renamed from: P  reason: collision with root package name */
    public final B.a f759P;

    /* renamed from: V  reason: collision with root package name */
    public r0 f765V;

    /* renamed from: W  reason: collision with root package name */
    public P.a f766W;

    /* renamed from: X  reason: collision with root package name */
    public final W f767X;

    /* renamed from: Y  reason: collision with root package name */
    public final X f768Y;

    /* renamed from: N  reason: collision with root package name */
    public final ArrayList f757N = new ArrayList();

    /* renamed from: O  reason: collision with root package name */
    public final ArrayList f758O = new ArrayList();

    /* renamed from: Q  reason: collision with root package name */
    public List f760Q = Collections.emptyList();

    /* renamed from: R  reason: collision with root package name */
    public InterfaceC0087o f761R = AbstractC0088p.f2225a;

    /* renamed from: S  reason: collision with root package name */
    public final Object f762S = new Object();

    /* renamed from: T  reason: collision with root package name */
    public boolean f763T = true;

    /* renamed from: U  reason: collision with root package name */
    public A f764U = null;

    public h(LinkedHashSet linkedHashSet, B.a aVar, J j3, C0489E c0489e) {
        InterfaceC0091t interfaceC0091t = (InterfaceC0091t) linkedHashSet.iterator().next();
        this.f753J = interfaceC0091t;
        this.f756M = new f(new LinkedHashSet(linkedHashSet));
        this.f759P = aVar;
        this.f754K = j3;
        this.f755L = c0489e;
        W w3 = new W(interfaceC0091t.i());
        this.f767X = w3;
        this.f768Y = new X(interfaceC0091t.e(), w3);
    }

    public static ArrayList E(List list, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((r0) it.next()).getClass();
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
        }
        return arrayList2;
    }

    public static S s() {
        Object obj;
        Integer num;
        C.g gVar = new C.g(2);
        C0076c c0076c = l.f780b;
        O o3 = gVar.f232b;
        o3.g(c0076c, "ImageCapture-Extra");
        C0076c c0076c2 = G.f2130M;
        o3.getClass();
        Object obj2 = null;
        try {
            obj = o3.e(c0076c2);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            o3.g(H.f2135l, num2);
        } else {
            o3.g(H.f2135l, Integer.valueOf((int) RecognitionOptions.QR_CODE));
        }
        G g = new G(androidx.camera.core.impl.S.a(o3));
        I.e(g);
        S s3 = new S(g);
        try {
            obj2 = o3.e(androidx.camera.core.impl.J.f2142r);
        } catch (IllegalArgumentException unused2) {
        }
        Size size = (Size) obj2;
        if (size != null) {
            new Rational(size.getWidth(), size.getHeight());
        }
        C0076c c0076c3 = i.f769a;
        Object c4 = AbstractC0636k0.c();
        try {
            c4 = o3.e(c0076c3);
        } catch (IllegalArgumentException unused3) {
        }
        AbstractC0624h4.e((Executor) c4, "The IO executor can't be null");
        C0076c c0076c4 = G.f2129L;
        if (o3.f2153J.containsKey(c0076c4) && ((num = (Integer) o3.e(c0076c4)) == null || (num.intValue() != 0 && num.intValue() != 1 && num.intValue() != 2))) {
            throw new IllegalArgumentException("The flash mode is not allowed to set: " + num);
        }
        return s3;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean y(androidx.camera.core.impl.C0079f r4, androidx.camera.core.impl.c0 r5) {
        /*
            androidx.camera.core.impl.y r0 = r5.f2184f
            androidx.camera.core.impl.S r0 = r0.f2247b
            v.a r4 = r4.f2195d
            r4.getClass()
            java.util.Set r1 = D.C.n(r4)
            int r1 = r1.size()
            androidx.camera.core.impl.y r5 = r5.f2184f
            androidx.camera.core.impl.S r5 = r5.f2247b
            java.util.Set r5 = r5.o()
            int r5 = r5.size()
            r2 = 1
            if (r1 == r5) goto L21
            return r2
        L21:
            java.util.Set r5 = D.C.n(r4)
            java.util.Iterator r5 = r5.iterator()
        L29:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r5.next()
            androidx.camera.core.impl.c r1 = (androidx.camera.core.impl.C0076c) r1
            java.util.TreeMap r3 = r0.f2153J
            boolean r3 = r3.containsKey(r1)
            if (r3 == 0) goto L4b
            java.lang.Object r3 = r0.e(r1)
            java.lang.Object r1 = D.C.o(r4, r1)
            boolean r1 = java.util.Objects.equals(r3, r1)
            if (r1 != 0) goto L29
        L4b:
            return r2
        L4c:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: I.h.y(androidx.camera.core.impl.f, androidx.camera.core.impl.c0):boolean");
    }

    public final boolean A() {
        boolean z3;
        synchronized (this.f762S) {
            A.a aVar = (A.a) this.f761R;
            aVar.getClass();
            z3 = false;
            if (((Integer) C.p(aVar, InterfaceC0087o.f2223i, 0)).intValue() == 1) {
                z3 = true;
            }
        }
        return z3;
    }

    public final void B(ArrayList arrayList) {
        synchronized (this.f762S) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f757N);
            linkedHashSet.removeAll(arrayList);
            G(linkedHashSet, false);
        }
    }

    public final void C() {
        synchronized (this.f762S) {
            try {
                if (this.f764U != null) {
                    this.f753J.i().c(this.f764U);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void D(List list) {
        synchronized (this.f762S) {
            this.f760Q = list;
        }
    }

    public final void F() {
        synchronized (this.f762S) {
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [I.g, java.lang.Object] */
    public final void G(LinkedHashSet linkedHashSet, boolean z3) {
        C0079f c0079f;
        C0479a c0479a;
        synchronized (this.f762S) {
            try {
                r0 q3 = q(linkedHashSet);
                P.a t3 = t(linkedHashSet, z3);
                ArrayList arrayList = new ArrayList(linkedHashSet);
                if (q3 != null) {
                    arrayList.add(q3);
                }
                if (t3 != null) {
                    arrayList.add(t3);
                    arrayList.removeAll(t3.f1017n.f1024J);
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList2.removeAll(this.f758O);
                ArrayList arrayList3 = new ArrayList(arrayList);
                arrayList3.retainAll(this.f758O);
                ArrayList arrayList4 = new ArrayList(this.f758O);
                arrayList4.removeAll(arrayList);
                A.a aVar = (A.a) this.f761R;
                aVar.getClass();
                n0 n0Var = (n0) ((androidx.camera.core.impl.S) aVar.V()).i0(InterfaceC0087o.f2222h, n0.f2221a);
                C0489E c0489e = this.f755L;
                HashMap hashMap = new HashMap();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    r0 r0Var = (r0) it.next();
                    k0 e4 = r0Var.e(false, n0Var);
                    P.a aVar2 = t3;
                    k0 e5 = r0Var.e(true, c0489e);
                    ?? obj = new Object();
                    obj.f751a = e4;
                    obj.f752b = e5;
                    hashMap.put(r0Var, obj);
                    t3 = aVar2;
                }
                P.a aVar3 = t3;
                try {
                    HashMap r3 = r(v(), this.f753J.e(), arrayList2, arrayList3, hashMap);
                    H();
                    ArrayList E3 = E(this.f760Q, arrayList);
                    ArrayList arrayList5 = new ArrayList(linkedHashSet);
                    arrayList5.removeAll(arrayList);
                    ArrayList E4 = E(E3, arrayList5);
                    if (E4.size() > 0) {
                        x1.X.g("CameraUseCaseAdapter", "Unused effects: " + E4);
                    }
                    Iterator it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        ((r0) it2.next()).z(this.f753J);
                    }
                    this.f753J.n(arrayList4);
                    if (!arrayList4.isEmpty()) {
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            r0 r0Var2 = (r0) it3.next();
                            if (r3.containsKey(r0Var2) && (c0479a = (c0079f = (C0079f) r3.get(r0Var2)).f2195d) != null && y(c0079f, r0Var2.f452l)) {
                                r0Var2.g = r0Var2.u(c0479a);
                            }
                        }
                    }
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        r0 r0Var3 = (r0) it4.next();
                        g gVar = (g) hashMap.get(r0Var3);
                        Objects.requireNonNull(gVar);
                        r0Var3.a(this.f753J, gVar.f751a, gVar.f752b);
                        C0079f c0079f2 = (C0079f) r3.get(r0Var3);
                        c0079f2.getClass();
                        r0Var3.g = r0Var3.v(c0079f2);
                    }
                    if (this.f763T) {
                        this.f753J.o(arrayList2);
                    }
                    Iterator it5 = arrayList2.iterator();
                    while (it5.hasNext()) {
                        ((r0) it5.next()).o();
                    }
                    this.f757N.clear();
                    this.f757N.addAll(linkedHashSet);
                    this.f758O.clear();
                    this.f758O.addAll(arrayList);
                    this.f765V = q3;
                    this.f766W = aVar3;
                } catch (IllegalArgumentException e6) {
                    if (!z3 && z() && this.f759P.f171J != 2) {
                        G(linkedHashSet, true);
                        return;
                    }
                    throw e6;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void H() {
        synchronized (this.f762S) {
        }
    }

    public final void f(List list) {
        synchronized (this.f762S) {
            try {
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.f757N);
                linkedHashSet.addAll(list);
                try {
                    G(linkedHashSet, false);
                } catch (IllegalArgumentException e4) {
                    throw new Exception(e4.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        synchronized (this.f762S) {
            try {
                if (!this.f763T) {
                    this.f753J.o(this.f758O);
                    C();
                    Iterator it = this.f758O.iterator();
                    while (it.hasNext()) {
                        ((r0) it.next()).o();
                    }
                    this.f763T = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // D.InterfaceC0031l
    public final r k() {
        return this.f768Y;
    }

    public final void p() {
        synchronized (this.f762S) {
            InterfaceC0089q i3 = this.f753J.i();
            this.f764U = i3.d();
            i3.m();
        }
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [D.d0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v11, types: [D.r0, D.e0] */
    public final r0 q(LinkedHashSet linkedHashSet) {
        S s3;
        synchronized (this.f762S) {
            try {
                if (A()) {
                    Iterator it = linkedHashSet.iterator();
                    boolean z3 = false;
                    boolean z4 = false;
                    boolean z5 = false;
                    while (it.hasNext()) {
                        r0 r0Var = (r0) it.next();
                        if (r0Var instanceof e0) {
                            z5 = true;
                        } else if (r0Var instanceof S) {
                            z4 = true;
                        }
                    }
                    if (z4 && !z5) {
                        r0 r0Var2 = this.f765V;
                        if (!(r0Var2 instanceof e0)) {
                            E e4 = new E(1);
                            e4.f285b.g(l.f780b, "Preview-Extra");
                            T t3 = new T(androidx.camera.core.impl.S.a(e4.f285b));
                            I.e(t3);
                            ?? r0Var3 = new r0(t3);
                            r0Var3.f376n = e0.f374t;
                            r0Var3.D(new Object());
                            s3 = r0Var3;
                        }
                    } else {
                        Iterator it2 = linkedHashSet.iterator();
                        boolean z6 = false;
                        while (it2.hasNext()) {
                            r0 r0Var4 = (r0) it2.next();
                            if (r0Var4 instanceof e0) {
                                z3 = true;
                            } else if (r0Var4 instanceof S) {
                                z6 = true;
                            }
                        }
                        if (z3 && !z6) {
                            r0 r0Var5 = this.f765V;
                            s3 = r0Var5 instanceof S ? r0Var5 : s();
                        }
                    }
                }
                s3 = null;
            } finally {
            }
        }
        return s3;
    }

    /* JADX WARN: Removed duplicated region for block: B:192:0x02c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.HashMap r(int r24, androidx.camera.core.impl.r r25, java.util.ArrayList r26, java.util.ArrayList r27, java.util.HashMap r28) {
        /*
            Method dump skipped, instructions count: 1221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: I.h.r(int, androidx.camera.core.impl.r, java.util.ArrayList, java.util.ArrayList, java.util.HashMap):java.util.HashMap");
    }

    public final P.a t(LinkedHashSet linkedHashSet, boolean z3) {
        boolean z4;
        synchronized (this.f762S) {
            try {
                HashSet w3 = w(linkedHashSet, z3);
                if (w3.size() < 2) {
                    return null;
                }
                P.a aVar = this.f766W;
                if (aVar != null && aVar.f1017n.f1024J.equals(w3)) {
                    P.a aVar2 = this.f766W;
                    Objects.requireNonNull(aVar2);
                    return aVar2;
                }
                int[] r14 = {1, 2, 4};
                HashSet hashSet = new HashSet();
                Iterator it = w3.iterator();
                while (it.hasNext()) {
                    r0 r0Var = (r0) it.next();
                    for (int r7 = 0; r7 < 3; r7++) {
                        int r8 = r14[r7];
                        Iterator it2 = r0Var.h().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                int intValue = ((Integer) it2.next()).intValue();
                                if ((r8 & intValue) == intValue) {
                                    z4 = true;
                                    break;
                                }
                            } else {
                                z4 = false;
                                break;
                            }
                        }
                        if (z4) {
                            if (hashSet.contains(Integer.valueOf(r8))) {
                                return null;
                            }
                            hashSet.add(Integer.valueOf(r8));
                        }
                    }
                }
                return new P.a(this.f753J, w3, this.f755L);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u() {
        synchronized (this.f762S) {
            try {
                if (this.f763T) {
                    this.f753J.n(new ArrayList(this.f758O));
                    p();
                    this.f763T = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int v() {
        synchronized (this.f762S) {
            try {
                if (this.f759P.f171J == 2) {
                    return 1;
                }
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet w(LinkedHashSet linkedHashSet, boolean z3) {
        int r7;
        HashSet hashSet = new HashSet();
        synchronized (this.f762S) {
            Iterator it = this.f760Q.iterator();
            if (!it.hasNext()) {
                if (z3) {
                    r7 = 3;
                } else {
                    r7 = 0;
                }
            } else if (it.next() == null) {
                throw null;
            } else {
                throw new ClassCastException();
            }
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            r0 r0Var = (r0) it2.next();
            AbstractC0624h4.a("Only support one level of sharing for now.", !(r0Var instanceof P.a));
            Iterator it3 = r0Var.h().iterator();
            while (true) {
                if (it3.hasNext()) {
                    int intValue = ((Integer) it3.next()).intValue();
                    if ((r7 & intValue) == intValue) {
                        hashSet.add(r0Var);
                        break;
                    }
                }
            }
        }
        return hashSet;
    }

    public final List x() {
        ArrayList arrayList;
        synchronized (this.f762S) {
            arrayList = new ArrayList(this.f757N);
        }
        return arrayList;
    }

    public final boolean z() {
        boolean z3;
        synchronized (this.f762S) {
            if (this.f761R == AbstractC0088p.f2225a) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        return z3;
    }
}
