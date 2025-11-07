package w;

import D.C0026f;
import D.RunnableC0023c;
import D.r0;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.AbstractC0088p;
import androidx.camera.core.impl.C0076c;
import androidx.camera.core.impl.C0079f;
import androidx.camera.core.impl.C0092u;
import androidx.camera.core.impl.C0093v;
import androidx.camera.core.impl.C0096y;
import androidx.camera.core.impl.EnumC0090s;
import androidx.camera.core.impl.InterfaceC0087o;
import androidx.camera.core.impl.InterfaceC0089q;
import androidx.camera.core.impl.InterfaceC0091t;
import d2.C0235c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import k0.C0322i;
import v.C0480b;
import x.C0551f;
import x.C0559n;
import x1.AbstractC0624h4;
import x1.AbstractC0636k0;
import z.AbstractC0957j;

/* renamed from: w.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0511v implements InterfaceC0091t {

    /* renamed from: J  reason: collision with root package name */
    public final A.f f5243J;

    /* renamed from: K  reason: collision with root package name */
    public final x.w f5244K;

    /* renamed from: L  reason: collision with root package name */
    public final G.l f5245L;

    /* renamed from: M  reason: collision with root package name */
    public volatile EnumC0508s f5246M = EnumC0508s.INITIALIZED;

    /* renamed from: N  reason: collision with root package name */
    public final A.a f5247N;

    /* renamed from: O  reason: collision with root package name */
    public final h2.J f5248O;

    /* renamed from: P  reason: collision with root package name */
    public final C0501k f5249P;

    /* renamed from: Q  reason: collision with root package name */
    public final C0510u f5250Q;

    /* renamed from: R  reason: collision with root package name */
    public final C0514y f5251R;

    /* renamed from: S  reason: collision with root package name */
    public CameraDevice f5252S;

    /* renamed from: T  reason: collision with root package name */
    public int f5253T;

    /* renamed from: U  reason: collision with root package name */
    public Q f5254U;

    /* renamed from: V  reason: collision with root package name */
    public final LinkedHashMap f5255V;

    /* renamed from: W  reason: collision with root package name */
    public final r f5256W;

    /* renamed from: X  reason: collision with root package name */
    public final B.a f5257X;

    /* renamed from: Y  reason: collision with root package name */
    public final C0093v f5258Y;

    /* renamed from: Z  reason: collision with root package name */
    public final HashSet f5259Z;
    public E.c a0;

    /* renamed from: b0  reason: collision with root package name */
    public final V0.a f5260b0;

    /* renamed from: c0  reason: collision with root package name */
    public final i2.e f5261c0;

    /* renamed from: d0  reason: collision with root package name */
    public final HashSet f5262d0;

    /* renamed from: e0  reason: collision with root package name */
    public A.a f5263e0;

    /* renamed from: f0  reason: collision with root package name */
    public final Object f5264f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f5265g0;

    /* renamed from: h0  reason: collision with root package name */
    public final S f5266h0;

    /* renamed from: i0  reason: collision with root package name */
    public final x.t f5267i0;

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, V0.a] */
    public C0511v(x.w wVar, String str, C0514y c0514y, B.a aVar, C0093v c0093v, Executor executor, Handler handler, S s3) {
        A.a aVar2 = new A.a(26);
        this.f5247N = aVar2;
        this.f5253T = 0;
        new AtomicInteger(0);
        this.f5255V = new LinkedHashMap();
        this.f5259Z = new HashSet();
        this.f5262d0 = new HashSet();
        this.f5263e0 = AbstractC0088p.f2225a;
        this.f5264f0 = new Object();
        this.f5265g0 = false;
        this.f5244K = wVar;
        this.f5257X = aVar;
        this.f5258Y = c0093v;
        G.e eVar = new G.e(handler);
        G.l lVar = new G.l(executor);
        this.f5245L = lVar;
        this.f5250Q = new C0510u(this, lVar, eVar);
        this.f5243J = new A.f(str, 22);
        ((androidx.lifecycle.z) aVar2.f1K).h(new A.c(20, EnumC0090s.CLOSED));
        h2.J j3 = new h2.J(c0093v);
        this.f5248O = j3;
        ?? obj = new Object();
        obj.f1357K = new Object();
        obj.f1358L = new LinkedHashSet();
        obj.f1359M = new LinkedHashSet();
        obj.f1360N = new LinkedHashSet();
        obj.f1361O = new H((V0.a) obj);
        obj.f1356J = lVar;
        this.f5260b0 = obj;
        this.f5266h0 = s3;
        try {
            C0559n b3 = wVar.b(str);
            C0501k c0501k = new C0501k(b3, lVar, new C0506p(this), c0514y.f5279i);
            this.f5249P = c0501k;
            this.f5251R = c0514y;
            c0514y.l(c0501k);
            c0514y.f5278h.l((androidx.lifecycle.z) j3.f3304L);
            this.f5267i0 = x.t.a(b3);
            this.f5254U = w();
            this.f5261c0 = new i2.e(c0514y.f5279i, AbstractC0957j.f6565a, eVar, lVar, obj, handler);
            r rVar = new r(this, str);
            this.f5256W = rVar;
            C0322i c0322i = new C0322i(19, this);
            synchronized (c0093v.f2232b) {
                AbstractC0624h4.f("Camera is already registered: " + this, !c0093v.f2235e.containsKey(this));
                c0093v.f2235e.put(this, new C0092u(lVar, c0322i, rVar));
            }
            wVar.f5479a.B(lVar, rVar);
        } catch (C0551f e4) {
            throw new Exception(e4);
        }
    }

    public static ArrayList E(ArrayList arrayList) {
        Size size;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r0 r0Var = (r0) it.next();
            String u3 = u(r0Var);
            Class<?> cls = r0Var.getClass();
            androidx.camera.core.impl.c0 c0Var = r0Var.f452l;
            androidx.camera.core.impl.k0 k0Var = r0Var.f447f;
            C0079f c0079f = r0Var.g;
            if (c0079f != null) {
                size = c0079f.f2192a;
            } else {
                size = null;
            }
            arrayList2.add(new C0493b(u3, cls, c0Var, k0Var, size));
        }
        return arrayList2;
    }

    public static String s(int r12) {
        if (r12 != 0) {
            if (r12 != 1) {
                if (r12 != 2) {
                    if (r12 != 3) {
                        if (r12 != 4) {
                            if (r12 != 5) {
                                return "UNKNOWN ERROR";
                            }
                            return "ERROR_CAMERA_SERVICE";
                        }
                        return "ERROR_CAMERA_DEVICE";
                    }
                    return "ERROR_CAMERA_DISABLED";
                }
                return "ERROR_MAX_CAMERAS_IN_USE";
            }
            return "ERROR_CAMERA_IN_USE";
        }
        return "ERROR_NONE";
    }

    public static String t(E.c cVar) {
        StringBuilder sb = new StringBuilder("MeteringRepeating");
        cVar.getClass();
        sb.append(cVar.hashCode());
        return sb.toString();
    }

    public static String u(r0 r0Var) {
        return r0Var.f() + r0Var.hashCode();
    }

    public final void A() {
        if (this.a0 != null) {
            StringBuilder sb = new StringBuilder("MeteringRepeating");
            this.a0.getClass();
            sb.append(this.a0.hashCode());
            String sb2 = sb.toString();
            A.f fVar = this.f5243J;
            LinkedHashMap linkedHashMap = (LinkedHashMap) fVar.f11L;
            if (linkedHashMap.containsKey(sb2)) {
                androidx.camera.core.impl.i0 i0Var = (androidx.camera.core.impl.i0) linkedHashMap.get(sb2);
                i0Var.f2209c = false;
                if (!i0Var.f2210d) {
                    linkedHashMap.remove(sb2);
                }
            }
            StringBuilder sb3 = new StringBuilder("MeteringRepeating");
            this.a0.getClass();
            sb3.append(this.a0.hashCode());
            String sb4 = sb3.toString();
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) fVar.f11L;
            if (linkedHashMap2.containsKey(sb4)) {
                androidx.camera.core.impl.i0 i0Var2 = (androidx.camera.core.impl.i0) linkedHashMap2.get(sb4);
                i0Var2.f2210d = false;
                if (!i0Var2.f2209c) {
                    linkedHashMap2.remove(sb4);
                }
            }
            E.c cVar = this.a0;
            cVar.getClass();
            x1.X.a("MeteringRepeating", "MeteringRepeating clear!");
            D.l0 l0Var = (D.l0) cVar.f502K;
            if (l0Var != null) {
                l0Var.a();
            }
            cVar.f502K = null;
            this.a0 = null;
        }
    }

    public final void B() {
        boolean z3;
        androidx.camera.core.impl.c0 c0Var;
        if (this.f5254U != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0624h4.f(null, z3);
        q("Resetting Capture Session", null);
        Q q3 = this.f5254U;
        synchronized (q3.f5060a) {
            c0Var = q3.g;
        }
        List c4 = q3.c();
        Q w3 = w();
        this.f5254U = w3;
        w3.l(c0Var);
        this.f5254U.g(c4);
        z(q3);
    }

    public final void C(EnumC0508s enumC0508s) {
        D(enumC0508s, null, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(w.EnumC0508s r10, D.C0026f r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C0511v.D(w.s, D.f, boolean):void");
    }

    public final void F(ArrayList arrayList) {
        boolean z3;
        Size size;
        boolean isEmpty = this.f5243J.o().isEmpty();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        Rational rational = null;
        while (true) {
            z3 = true;
            if (!it.hasNext()) {
                break;
            }
            C0493b c0493b = (C0493b) it.next();
            if (!this.f5243J.u(c0493b.f5122a)) {
                A.f fVar = this.f5243J;
                String str = c0493b.f5122a;
                androidx.camera.core.impl.c0 c0Var = c0493b.f5124c;
                androidx.camera.core.impl.k0 k0Var = c0493b.f5125d;
                LinkedHashMap linkedHashMap = (LinkedHashMap) fVar.f11L;
                androidx.camera.core.impl.i0 i0Var = (androidx.camera.core.impl.i0) linkedHashMap.get(str);
                if (i0Var == null) {
                    i0Var = new androidx.camera.core.impl.i0(c0Var, k0Var);
                    linkedHashMap.put(str, i0Var);
                }
                i0Var.f2209c = true;
                arrayList2.add(c0493b.f5122a);
                if (c0493b.f5123b == D.e0.class && (size = c0493b.f5126e) != null) {
                    rational = new Rational(size.getWidth(), size.getHeight());
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        q("Use cases [" + TextUtils.join(", ", arrayList2) + "] now ATTACHED", null);
        if (isEmpty) {
            this.f5249P.p(true);
            C0501k c0501k = this.f5249P;
            synchronized (c0501k.f5179L) {
                c0501k.f5190W++;
            }
        }
        f();
        J();
        I();
        B();
        EnumC0508s enumC0508s = this.f5246M;
        EnumC0508s enumC0508s2 = EnumC0508s.OPENED;
        if (enumC0508s == enumC0508s2) {
            y();
        } else {
            int r12 = AbstractC0507q.f5230a[this.f5246M.ordinal()];
            if (r12 != 1 && r12 != 2) {
                if (r12 != 3) {
                    q("open() ignored due to being in state: " + this.f5246M, null);
                } else {
                    C(EnumC0508s.REOPENING);
                    if (!v() && this.f5253T == 0) {
                        if (this.f5252S == null) {
                            z3 = false;
                        }
                        AbstractC0624h4.f("Camera Device should be open if session close is not complete", z3);
                        C(enumC0508s2);
                        y();
                    }
                }
            } else {
                G(false);
            }
        }
        if (rational != null) {
            this.f5249P.f5183P.getClass();
        }
    }

    public final void G(boolean z3) {
        q("Attempting to force open the camera.", null);
        if (!this.f5258Y.c(this)) {
            q("No cameras available. Waiting for available camera before opening camera.", null);
            C(EnumC0508s.PENDING_OPEN);
            return;
        }
        x(z3);
    }

    public final void H(boolean z3) {
        q("Attempting to open the camera.", null);
        if (this.f5256W.f5232b && this.f5258Y.c(this)) {
            x(z3);
            return;
        }
        q("No cameras available. Waiting for available camera before opening camera.", null);
        C(EnumC0508s.PENDING_OPEN);
    }

    public final void I() {
        boolean z3;
        A.f fVar = this.f5243J;
        fVar.getClass();
        androidx.camera.core.impl.b0 b0Var = new androidx.camera.core.impl.b0();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) fVar.f11L).entrySet()) {
            androidx.camera.core.impl.i0 i0Var = (androidx.camera.core.impl.i0) entry.getValue();
            if (i0Var.f2210d && i0Var.f2209c) {
                b0Var.a(i0Var.f2207a);
                arrayList.add((String) entry.getKey());
            }
        }
        x1.X.a("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + ((String) fVar.f10K));
        if (b0Var.f2175j && b0Var.f2174i) {
            z3 = true;
        } else {
            z3 = false;
        }
        C0501k c0501k = this.f5249P;
        if (z3) {
            int r02 = b0Var.b().f2184f.f2248c;
            c0501k.f5195c0 = r02;
            c0501k.f5183P.f5087c = r02;
            c0501k.f5189V.getClass();
            b0Var.a(c0501k.i());
            this.f5254U.l(b0Var.b());
            return;
        }
        c0501k.f5195c0 = 1;
        c0501k.f5183P.f5087c = 1;
        c0501k.f5189V.getClass();
        this.f5254U.l(c0501k.i());
    }

    public final void J() {
        boolean z3 = false;
        for (androidx.camera.core.impl.k0 k0Var : this.f5243J.p()) {
            z3 |= k0Var.O();
        }
        this.f5249P.f5187T.e(z3);
    }

    @Override // androidx.camera.core.impl.InterfaceC0091t
    public final void a(r0 r0Var) {
        r0Var.getClass();
        this.f5245L.execute(new RunnableC0505o(this, u(r0Var), r0Var.f452l, r0Var.f447f, 0));
    }

    @Override // androidx.camera.core.impl.InterfaceC0091t
    public final void b(r0 r0Var) {
        r0Var.getClass();
        this.f5245L.execute(new RunnableC0023c(21, this, u(r0Var)));
    }

    @Override // androidx.camera.core.impl.InterfaceC0091t
    public final void c(boolean z3) {
        this.f5245L.execute(new C.b(this, z3, 1));
    }

    @Override // androidx.camera.core.impl.InterfaceC0091t
    public final /* synthetic */ boolean d() {
        return true;
    }

    @Override // androidx.camera.core.impl.InterfaceC0091t
    public final androidx.camera.core.impl.r e() {
        return this.f5251R;
    }

    public final void f() {
        A.f fVar = this.f5243J;
        androidx.camera.core.impl.c0 b3 = fVar.n().b();
        C0096y c0096y = b3.f2184f;
        int size = Collections.unmodifiableList(c0096y.f2246a).size();
        int size2 = b3.b().size();
        if (!b3.b().isEmpty()) {
            if (Collections.unmodifiableList(c0096y.f2246a).isEmpty()) {
                if (this.a0 == null) {
                    this.a0 = new E.c(this.f5251R.f5273b, this.f5266h0, new C0502l(this));
                }
                E.c cVar = this.a0;
                if (cVar != null) {
                    String t3 = t(cVar);
                    E.c cVar2 = this.a0;
                    androidx.camera.core.impl.c0 c0Var = (androidx.camera.core.impl.c0) cVar2.f503L;
                    LinkedHashMap linkedHashMap = (LinkedHashMap) fVar.f11L;
                    androidx.camera.core.impl.i0 i0Var = (androidx.camera.core.impl.i0) linkedHashMap.get(t3);
                    if (i0Var == null) {
                        i0Var = new androidx.camera.core.impl.i0(c0Var, (X) cVar2.f504M);
                        linkedHashMap.put(t3, i0Var);
                    }
                    i0Var.f2209c = true;
                    E.c cVar3 = this.a0;
                    androidx.camera.core.impl.c0 c0Var2 = (androidx.camera.core.impl.c0) cVar3.f503L;
                    androidx.camera.core.impl.i0 i0Var2 = (androidx.camera.core.impl.i0) linkedHashMap.get(t3);
                    if (i0Var2 == null) {
                        i0Var2 = new androidx.camera.core.impl.i0(c0Var2, (X) cVar3.f504M);
                        linkedHashMap.put(t3, i0Var2);
                    }
                    i0Var2.f2210d = true;
                }
            } else if (size2 == 1 && size == 1) {
                A();
            } else if (size >= 2) {
                A();
            } else {
                x1.X.a("Camera2CameraImpl", "mMeteringRepeating is ATTACHED, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size);
            }
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0091t
    public final void g(InterfaceC0087o interfaceC0087o) {
        if (interfaceC0087o == null) {
            interfaceC0087o = AbstractC0088p.f2225a;
        }
        A.a aVar = (A.a) interfaceC0087o;
        if (((androidx.camera.core.impl.S) aVar.V()).i0(InterfaceC0087o.f2224j, null) == null) {
            this.f5263e0 = aVar;
            synchronized (this.f5264f0) {
            }
            return;
        }
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x018b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 463
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C0511v.h():void");
    }

    @Override // androidx.camera.core.impl.InterfaceC0091t
    public final InterfaceC0089q i() {
        return this.f5249P;
    }

    @Override // androidx.camera.core.impl.InterfaceC0091t
    public final InterfaceC0087o j() {
        return this.f5263e0;
    }

    @Override // D.InterfaceC0031l
    public final androidx.camera.core.impl.r k() {
        return e();
    }

    @Override // androidx.camera.core.impl.InterfaceC0091t
    public final void l(r0 r0Var) {
        r0Var.getClass();
        this.f5245L.execute(new RunnableC0505o(this, u(r0Var), r0Var.f452l, r0Var.f447f, 1));
    }

    @Override // androidx.camera.core.impl.InterfaceC0091t
    public final boolean m() {
        if (((C0514y) k()).b() == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.camera.core.impl.InterfaceC0091t
    public final void n(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        ArrayList arrayList3 = new ArrayList(E(arrayList2));
        Iterator it = new ArrayList(arrayList2).iterator();
        while (it.hasNext()) {
            r0 r0Var = (r0) it.next();
            String u3 = u(r0Var);
            HashSet hashSet = this.f5262d0;
            if (hashSet.contains(u3)) {
                r0Var.t();
                hashSet.remove(u3);
            }
        }
        this.f5245L.execute(new RunnableC0503m(this, arrayList3, 0));
    }

    @Override // androidx.camera.core.impl.InterfaceC0091t
    public final void o(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        C0501k c0501k = this.f5249P;
        synchronized (c0501k.f5179L) {
            c0501k.f5190W++;
        }
        Iterator it = new ArrayList(arrayList2).iterator();
        while (it.hasNext()) {
            r0 r0Var = (r0) it.next();
            String u3 = u(r0Var);
            HashSet hashSet = this.f5262d0;
            if (!hashSet.contains(u3)) {
                hashSet.add(u3);
                r0Var.s();
                r0Var.q();
            }
        }
        try {
            this.f5245L.execute(new RunnableC0503m(this, new ArrayList(E(arrayList2)), 1));
        } catch (RejectedExecutionException e4) {
            q("Unable to attach use cases.", e4);
            c0501k.e();
        }
    }

    public final CameraDevice.StateCallback p() {
        ArrayList arrayList = new ArrayList(this.f5243J.n().b().f2180b);
        arrayList.add((H) this.f5260b0.f1361O);
        arrayList.add(this.f5250Q);
        if (arrayList.isEmpty()) {
            return new CameraDevice.StateCallback();
        }
        if (arrayList.size() == 1) {
            return (CameraDevice.StateCallback) arrayList.get(0);
        }
        return new H(arrayList);
    }

    public final void q(String str, Throwable th) {
        String str2 = "{" + toString() + "} " + str;
        String f2 = x1.X.f("Camera2CameraImpl");
        if (x1.X.e(f2, 3)) {
            Log.d(f2, str2, th);
        }
    }

    public final void r() {
        boolean z3;
        if (this.f5246M != EnumC0508s.RELEASING && this.f5246M != EnumC0508s.CLOSING) {
            z3 = false;
        } else {
            z3 = true;
        }
        AbstractC0624h4.f(null, z3);
        AbstractC0624h4.f(null, this.f5255V.isEmpty());
        this.f5252S = null;
        if (this.f5246M == EnumC0508s.CLOSING) {
            C(EnumC0508s.INITIALIZED);
            return;
        }
        x.w wVar = this.f5244K;
        wVar.f5479a.E(this.f5256W);
        C(EnumC0508s.RELEASED);
    }

    public final String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f5251R.f5272a);
    }

    public final boolean v() {
        if (this.f5255V.isEmpty() && this.f5259Z.isEmpty()) {
            return true;
        }
        return false;
    }

    public final Q w() {
        Q q3;
        synchronized (this.f5264f0) {
            q3 = new Q(this.f5267i0);
        }
        return q3;
    }

    public final void x(boolean z3) {
        C0510u c0510u = this.f5250Q;
        if (!z3) {
            c0510u.f5241e.f88K = -1L;
        }
        c0510u.a();
        q("Opening camera.", null);
        C(EnumC0508s.OPENING);
        try {
            x.w wVar = this.f5244K;
            wVar.f5479a.A(this.f5251R.f5272a, this.f5245L, p());
        } catch (SecurityException e4) {
            q("Unable to open camera due to " + e4.getMessage(), null);
            C(EnumC0508s.REOPENING);
            c0510u.b();
        } catch (C0551f e5) {
            q("Unable to open camera due to " + e5.getMessage(), null);
            if (e5.f5443J == 10001) {
                D(EnumC0508s.INITIALIZED, new C0026f(7, e5), true);
            }
        }
    }

    public final void y() {
        boolean z3;
        if (this.f5246M == EnumC0508s.OPENED) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0624h4.f(null, z3);
        androidx.camera.core.impl.b0 n3 = this.f5243J.n();
        if (n3.f2175j && n3.f2174i) {
            if (!this.f5258Y.d(this.f5252S.getId(), this.f5257X.c(this.f5252S.getId()))) {
                q("Unable to create capture session in camera operating mode = " + this.f5257X.f171J, null);
                return;
            }
            HashMap hashMap = new HashMap();
            Collection<androidx.camera.core.impl.c0> o3 = this.f5243J.o();
            Collection p2 = this.f5243J.p();
            C0076c c0076c = Y.f5094a;
            ArrayList arrayList = new ArrayList(p2);
            Iterator it = o3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                androidx.camera.core.impl.c0 c0Var = (androidx.camera.core.impl.c0) it.next();
                androidx.camera.core.impl.S s3 = c0Var.f2184f.f2247b;
                C0076c c0076c2 = Y.f5094a;
                if (s3.f2153J.containsKey(c0076c2) && c0Var.b().size() != 1) {
                    x1.X.b("Camera2CameraImpl", String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Integer.valueOf(c0Var.b().size())));
                    break;
                } else if (c0Var.f2184f.f2247b.f2153J.containsKey(c0076c2)) {
                    int r5 = 0;
                    for (androidx.camera.core.impl.c0 c0Var2 : o3) {
                        if (((androidx.camera.core.impl.k0) arrayList.get(r5)).m() == androidx.camera.core.impl.m0.METERING_REPEATING) {
                            hashMap.put((androidx.camera.core.impl.D) c0Var2.b().get(0), 1L);
                        } else if (c0Var2.f2184f.f2247b.f2153J.containsKey(c0076c2)) {
                            hashMap.put((androidx.camera.core.impl.D) c0Var2.b().get(0), (Long) c0Var2.f2184f.f2247b.e(c0076c2));
                        }
                        r5++;
                    }
                }
            }
            Q q3 = this.f5254U;
            synchronized (q3.f5060a) {
                q3.f5073o = hashMap;
            }
            Q q4 = this.f5254U;
            androidx.camera.core.impl.c0 b3 = n3.b();
            CameraDevice cameraDevice = this.f5252S;
            cameraDevice.getClass();
            E1.a j3 = q4.j(b3, cameraDevice, this.f5261c0.c());
            j3.a(new H.e(0, j3, new C0506p(this)), this.f5245L);
            return;
        }
        q("Unable to create capture session due to conflicting configurations", null);
    }

    public final E1.a z(Q q3) {
        synchronized (q3.f5060a) {
            int r4 = N.f5057a[q3.f5070l.ordinal()];
            if (r4 != 1) {
                if (r4 != 2) {
                    if (r4 != 3) {
                        if (r4 != 4) {
                            if (r4 == 5) {
                                if (q3.g != null) {
                                    C0480b c0480b = q3.f5067i;
                                    c0480b.getClass();
                                    List<Object> unmodifiableList = Collections.unmodifiableList(new ArrayList(c0480b.f5043a));
                                    ArrayList arrayList = new ArrayList();
                                    for (Object obj : unmodifiableList) {
                                        if (obj == null) {
                                            arrayList.add(null);
                                        } else {
                                            throw new ClassCastException();
                                        }
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it = arrayList.iterator();
                                    if (!it.hasNext()) {
                                        if (!arrayList2.isEmpty()) {
                                            try {
                                                q3.g(q3.m(arrayList2));
                                            } catch (IllegalStateException e4) {
                                                x1.X.c("CaptureSession", "Unable to issue the request before close the capture session", e4);
                                            }
                                        }
                                    } else if (it.next() == null) {
                                        throw null;
                                    } else {
                                        throw new ClassCastException();
                                    }
                                }
                            }
                        }
                        C0235c c0235c = q3.f5064e;
                        AbstractC0624h4.e(c0235c, "The Opener shouldn't null in state:" + q3.f5070l);
                        ((d0) q3.f5064e.f3003K).r();
                        q3.f5070l = O.CLOSED;
                        q3.g = null;
                    } else {
                        C0235c c0235c2 = q3.f5064e;
                        AbstractC0624h4.e(c0235c2, "The Opener shouldn't null in state:" + q3.f5070l);
                        ((d0) q3.f5064e.f3003K).r();
                    }
                }
                q3.f5070l = O.RELEASED;
            } else {
                throw new IllegalStateException("close() should not be possible in state: " + q3.f5070l);
            }
        }
        E1.a k3 = q3.k();
        q("Releasing session in state " + this.f5246M.name(), null);
        this.f5255V.put(q3, k3);
        h2.J j3 = new h2.J(22, this, q3);
        k3.a(new H.e(0, k3, j3), AbstractC0636k0.a());
        return k3;
    }
}
