package w;

import D.AbstractC0024d;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Range;
import androidx.camera.core.impl.C0076c;
import androidx.camera.core.impl.C0079f;
import androidx.camera.core.impl.C0095x;
import androidx.camera.core.impl.C0096y;
import androidx.camera.core.impl.InterfaceC0086n;
import androidx.camera.core.impl.InterfaceC0089q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import v.C0479a;
import x.C0559n;
import x1.AbstractC0636k0;
import x1.AbstractC0699s0;
import z.InterfaceC0946G;

/* renamed from: w.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0501k implements InterfaceC0089q {

    /* renamed from: J  reason: collision with root package name */
    public final i f5177J;

    /* renamed from: K  reason: collision with root package name */
    public final G.l f5178K;

    /* renamed from: L  reason: collision with root package name */
    public final Object f5179L = new Object();

    /* renamed from: M  reason: collision with root package name */
    public final C0559n f5180M;

    /* renamed from: N  reason: collision with root package name */
    public final C0506p f5181N;

    /* renamed from: O  reason: collision with root package name */
    public final androidx.camera.core.impl.Z f5182O;

    /* renamed from: P  reason: collision with root package name */
    public final U f5183P;

    /* renamed from: Q  reason: collision with root package name */
    public final j1.o f5184Q;

    /* renamed from: R  reason: collision with root package name */
    public final i0 f5185R;

    /* renamed from: S  reason: collision with root package name */
    public final E.d f5186S;

    /* renamed from: T  reason: collision with root package name */
    public final o0 f5187T;

    /* renamed from: U  reason: collision with root package name */
    public final C.e f5188U;

    /* renamed from: V  reason: collision with root package name */
    public final C0486B f5189V;

    /* renamed from: W  reason: collision with root package name */
    public int f5190W;

    /* renamed from: X  reason: collision with root package name */
    public volatile boolean f5191X;

    /* renamed from: Y  reason: collision with root package name */
    public volatile int f5192Y;

    /* renamed from: Z  reason: collision with root package name */
    public final A.a f5193Z;
    public final A.b a0;

    /* renamed from: b0  reason: collision with root package name */
    public final AtomicLong f5194b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f5195c0;

    /* renamed from: d0  reason: collision with root package name */
    public long f5196d0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.camera.core.impl.Z, androidx.camera.core.impl.Y] */
    /* JADX WARN: Type inference failed for: r1v4, types: [w.h, androidx.camera.core.impl.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object, w.B] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, E.d] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, w.o0] */
    public C0501k(C0559n c0559n, G.l lVar, C0506p c0506p, A0.Q q3) {
        ?? y3 = new androidx.camera.core.impl.Y();
        this.f5182O = y3;
        this.f5190W = 0;
        this.f5191X = false;
        this.f5192Y = 2;
        this.f5194b0 = new AtomicLong(0L);
        this.f5195c0 = 1;
        this.f5196d0 = 0L;
        ?? obj = new Object();
        obj.f5160a = new HashSet();
        obj.f5161b = new ArrayMap();
        this.f5180M = c0559n;
        this.f5181N = c0506p;
        this.f5178K = lVar;
        i iVar = new i(lVar);
        this.f5177J = iVar;
        y3.f2159b.f2239c = this.f5195c0;
        y3.f2159b.b(new K(iVar));
        y3.f2159b.b(obj);
        ?? obj2 = new Object();
        obj2.f507a = false;
        obj2.f508b = new F1.a();
        this.f5186S = obj2;
        this.f5183P = new U(this);
        this.f5184Q = new j1.o(this, c0559n, lVar);
        this.f5185R = new i0(this, c0559n, lVar);
        if (Build.VERSION.SDK_INT >= 23) {
            this.f5187T = new p0(c0559n);
        } else {
            this.f5187T = new Object();
        }
        this.f5193Z = new A.a(q3, 0);
        this.a0 = new A.b(q3);
        this.f5188U = new C.e(this, lVar);
        ?? obj3 = new Object();
        Integer num = (Integer) c0559n.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num != null) {
            num.intValue();
        }
        q3.a(InterfaceC0946G.class);
        AbstractC0024d.a(new A.k(19, c0559n));
        this.f5189V = obj3;
        lVar.execute(new RunnableC0496e(this, 1));
    }

    public static boolean o(int[] r4, int r5) {
        for (int r3 : r4) {
            if (r5 == r3) {
                return true;
            }
        }
        return false;
    }

    public final void a(InterfaceC0500j interfaceC0500j) {
        ((HashSet) this.f5177J.f5166b).add(interfaceC0500j);
    }

    @Override // androidx.camera.core.impl.InterfaceC0089q
    public final void b(androidx.camera.core.impl.Z z3) {
        this.f5187T.b(z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.Runnable] */
    @Override // androidx.camera.core.impl.InterfaceC0089q
    public final void c(androidx.camera.core.impl.A a4) {
        C.e eVar = this.f5188U;
        androidx.camera.core.impl.S a5 = androidx.camera.core.impl.S.a(C.g.c(a4).f232b);
        synchronized (eVar.f225e) {
            try {
                for (C0076c c0076c : a5.o()) {
                    eVar.f226f.f232b.g(c0076c, a5.e(c0076c));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        H.f.d(AbstractC0699s0.a(new C.a(eVar, 0))).a(new Object(), AbstractC0636k0.a());
    }

    @Override // androidx.camera.core.impl.InterfaceC0089q
    public final androidx.camera.core.impl.A d() {
        return this.f5188U.a();
    }

    public final void e() {
        synchronized (this.f5179L) {
            try {
                int r12 = this.f5190W;
                if (r12 != 0) {
                    this.f5190W = r12 - 1;
                } else {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0089q
    public final Rect f() {
        Rect rect = (Rect) this.f5180M.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        return rect;
    }

    public final void g(boolean z3) {
        this.f5191X = z3;
        if (!z3) {
            C0095x c0095x = new C0095x();
            c0095x.f2239c = this.f5195c0;
            int r02 = 1;
            c0095x.f2242f = true;
            androidx.camera.core.impl.O b3 = androidx.camera.core.impl.O.b();
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
            int[] r3 = (int[]) this.f5180M.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
            if (r3 == null || (!o(r3, 1) && !o(r3, 1))) {
                r02 = 0;
            }
            b3.g(C0479a.r0(key), Integer.valueOf(r02));
            b3.g(C0479a.r0(CaptureRequest.FLASH_MODE), 0);
            c0095x.c(new A.a(7, androidx.camera.core.impl.S.a(b3)));
            q(Collections.singletonList(c0095x.d()));
        }
        r();
    }

    @Override // androidx.camera.core.impl.InterfaceC0089q
    public final void h(int r3) {
        if (!n()) {
            x1.X.g("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f5192Y = r3;
        o0 o0Var = this.f5187T;
        boolean z3 = true;
        if (this.f5192Y != 1 && this.f5192Y != 0) {
            z3 = false;
        }
        o0Var.j(z3);
        H.f.d(AbstractC0699s0.a(new A.k(18, this)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (o(r7, 1) != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009c, code lost:
        if (r2 != 1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.camera.core.impl.c0 i() {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.C0501k.i():androidx.camera.core.impl.c0");
    }

    @Override // androidx.camera.core.impl.InterfaceC0089q
    public final E1.a j(float f2) {
        E1.a hVar;
        I.a e4;
        if (!n()) {
            return new H.h(1, new Exception("Camera is not active."));
        }
        j1.o oVar = this.f5184Q;
        synchronized (((n0) oVar.f3833d)) {
            try {
                ((n0) oVar.f3833d).e(f2);
                e4 = I.a.e((n0) oVar.f3833d);
            } catch (IllegalArgumentException e5) {
                hVar = new H.h(1, e5);
            }
        }
        oVar.d(e4);
        hVar = AbstractC0699s0.a(new j0(oVar, e4, 1));
        return H.f.d(hVar);
    }

    @Override // androidx.camera.core.impl.InterfaceC0089q
    public final E1.a k() {
        E1.a hVar;
        I.a e4;
        if (!n()) {
            return new H.h(1, new Exception("Camera is not active."));
        }
        j1.o oVar = this.f5184Q;
        synchronized (((n0) oVar.f3833d)) {
            try {
                ((n0) oVar.f3833d).f();
                e4 = I.a.e((n0) oVar.f3833d);
            } catch (IllegalArgumentException e5) {
                hVar = new H.h(1, e5);
            }
        }
        oVar.d(e4);
        hVar = AbstractC0699s0.a(new j0(oVar, e4, 0));
        return H.f.d(hVar);
    }

    @Override // androidx.camera.core.impl.InterfaceC0089q
    public final E1.a l(final boolean z3) {
        E1.a a4;
        if (!n()) {
            return new H.h(1, new Exception("Camera is not active."));
        }
        final i0 i0Var = this.f5185R;
        if (!i0Var.f5170c) {
            x1.X.a("TorchControl", "Unable to enableTorch due to there is no flash unit.");
            a4 = new H.h(1, new IllegalStateException("No flash unit"));
        } else {
            i0.a(i0Var.f5169b, Integer.valueOf(z3 ? 1 : 0));
            a4 = AbstractC0699s0.a(new S.j() { // from class: w.g0
                @Override // S.j
                public final Object a0(final S.i iVar) {
                    final i0 i0Var2 = i0.this;
                    i0Var2.getClass();
                    final boolean z4 = z3;
                    i0Var2.f5171d.execute(new Runnable() { // from class: w.h0
                        @Override // java.lang.Runnable
                        public final void run() {
                            i0 i0Var3 = i0.this;
                            S.i iVar2 = iVar;
                            boolean z5 = z4;
                            if (!i0Var3.f5170c) {
                                if (iVar2 != null) {
                                    iVar2.b(new IllegalStateException("No flash unit"));
                                    return;
                                }
                                return;
                            }
                            boolean z6 = i0Var3.f5172e;
                            androidx.lifecycle.z zVar = i0Var3.f5169b;
                            if (!z6) {
                                i0.a(zVar, 0);
                                if (iVar2 != null) {
                                    iVar2.b(new Exception("Camera is not active."));
                                    return;
                                }
                                return;
                            }
                            i0Var3.g = z5;
                            i0Var3.f5168a.g(z5);
                            i0.a(zVar, Integer.valueOf(z5 ? 1 : 0));
                            S.i iVar3 = i0Var3.f5173f;
                            if (iVar3 != null) {
                                iVar3.b(new Exception("There is a new enableTorch being set"));
                            }
                            i0Var3.f5173f = iVar2;
                        }
                    });
                    return "enableTorch: " + z4;
                }
            });
        }
        return H.f.d(a4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.lang.Runnable] */
    @Override // androidx.camera.core.impl.InterfaceC0089q
    public final void m() {
        C.e eVar = this.f5188U;
        synchronized (eVar.f225e) {
            eVar.f226f = new C.g(4);
        }
        H.f.d(AbstractC0699s0.a(new C.a(eVar, 1))).a(new Object(), AbstractC0636k0.a());
    }

    public final boolean n() {
        int r12;
        synchronized (this.f5179L) {
            r12 = this.f5190W;
        }
        if (r12 > 0) {
            return true;
        }
        return false;
    }

    public final void p(boolean z3) {
        I.a e4;
        U u3 = this.f5183P;
        if (z3 != u3.f5086b) {
            u3.f5086b = z3;
            if (!u3.f5086b) {
                C0501k c0501k = u3.f5085a;
                ((HashSet) c0501k.f5177J.f5166b).remove(null);
                ((HashSet) c0501k.f5177J.f5166b).remove(null);
                if (u3.f5088d.length > 0 && u3.f5086b) {
                    C0095x c0095x = new C0095x();
                    c0095x.f2242f = true;
                    c0095x.f2239c = u3.f5087c;
                    androidx.camera.core.impl.O b3 = androidx.camera.core.impl.O.b();
                    b3.g(C0479a.r0(CaptureRequest.CONTROL_AF_TRIGGER), 2);
                    c0095x.c(new A.a(7, androidx.camera.core.impl.S.a(b3)));
                    u3.f5085a.q(Collections.singletonList(c0095x.d()));
                }
                MeteringRectangle[] meteringRectangleArr = U.g;
                u3.f5088d = meteringRectangleArr;
                u3.f5089e = meteringRectangleArr;
                u3.f5090f = meteringRectangleArr;
                c0501k.r();
            }
        }
        j1.o oVar = this.f5184Q;
        if (oVar.f3830a != z3) {
            oVar.f3830a = z3;
            if (!z3) {
                synchronized (((n0) oVar.f3833d)) {
                    ((n0) oVar.f3833d).f();
                    e4 = I.a.e((n0) oVar.f3833d);
                }
                oVar.d(e4);
                ((m0) oVar.f3835f).e();
                ((C0501k) oVar.f3831b).r();
            }
        }
        i0 i0Var = this.f5185R;
        if (i0Var.f5172e != z3) {
            i0Var.f5172e = z3;
            if (!z3) {
                if (i0Var.g) {
                    i0Var.g = false;
                    i0Var.f5168a.g(false);
                    i0.a(i0Var.f5169b, 0);
                }
                S.i iVar = i0Var.f5173f;
                if (iVar != null) {
                    iVar.b(new Exception("Camera is not active."));
                    i0Var.f5173f = null;
                }
            }
        }
        this.f5186S.b(z3);
        C.e eVar = this.f5188U;
        eVar.getClass();
        eVar.f224d.execute(new C.b(eVar, z3, 0));
    }

    public final void q(List list) {
        InterfaceC0086n interfaceC0086n;
        InterfaceC0086n interfaceC0086n2;
        C0506p c0506p = this.f5181N;
        c0506p.getClass();
        list.getClass();
        C0511v c0511v = c0506p.f5220J;
        c0511v.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0096y c0096y = (C0096y) it.next();
            HashSet hashSet = new HashSet();
            androidx.camera.core.impl.O.b();
            Range range = C0079f.f2191e;
            ArrayList arrayList2 = new ArrayList();
            androidx.camera.core.impl.P.a();
            hashSet.addAll(c0096y.f2246a);
            androidx.camera.core.impl.O c4 = androidx.camera.core.impl.O.c(c0096y.f2247b);
            arrayList2.addAll(c0096y.f2250e);
            ArrayMap arrayMap = new ArrayMap();
            androidx.camera.core.impl.h0 h0Var = c0096y.g;
            for (String str : h0Var.f2206a.keySet()) {
                arrayMap.put(str, h0Var.f2206a.get(str));
            }
            androidx.camera.core.impl.h0 h0Var2 = new androidx.camera.core.impl.h0(arrayMap);
            if (c0096y.f2248c == 5 && (interfaceC0086n2 = c0096y.f2252h) != null) {
                interfaceC0086n = interfaceC0086n2;
            } else {
                interfaceC0086n = null;
            }
            if (Collections.unmodifiableList(c0096y.f2246a).isEmpty() && c0096y.f2251f) {
                if (!hashSet.isEmpty()) {
                    x1.X.g("Camera2CameraImpl", "The capture config builder already has surface inside.");
                } else {
                    A.f fVar = c0511v.f5243J;
                    fVar.getClass();
                    ArrayList arrayList3 = new ArrayList();
                    for (Map.Entry entry : ((LinkedHashMap) fVar.f11L).entrySet()) {
                        androidx.camera.core.impl.i0 i0Var = (androidx.camera.core.impl.i0) entry.getValue();
                        if (i0Var.f2210d && i0Var.f2209c) {
                            arrayList3.add(((androidx.camera.core.impl.i0) entry.getValue()).f2207a);
                        }
                    }
                    for (androidx.camera.core.impl.c0 c0Var : Collections.unmodifiableCollection(arrayList3)) {
                        List<androidx.camera.core.impl.D> unmodifiableList = Collections.unmodifiableList(c0Var.f2184f.f2246a);
                        if (!unmodifiableList.isEmpty()) {
                            for (androidx.camera.core.impl.D d4 : unmodifiableList) {
                                hashSet.add(d4);
                            }
                        }
                    }
                    if (hashSet.isEmpty()) {
                        x1.X.g("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
                    }
                }
            }
            ArrayList arrayList4 = new ArrayList(hashSet);
            androidx.camera.core.impl.S a4 = androidx.camera.core.impl.S.a(c4);
            ArrayList arrayList5 = new ArrayList(arrayList2);
            androidx.camera.core.impl.h0 h0Var3 = androidx.camera.core.impl.h0.f2205b;
            ArrayMap arrayMap2 = new ArrayMap();
            ArrayMap arrayMap3 = h0Var2.f2206a;
            for (String str2 : arrayMap3.keySet()) {
                arrayMap2.put(str2, arrayMap3.get(str2));
            }
            arrayList.add(new C0096y(arrayList4, a4, c0096y.f2248c, c0096y.f2249d, arrayList5, c0096y.f2251f, new androidx.camera.core.impl.h0(arrayMap2), interfaceC0086n));
        }
        c0511v.q("Issue capture request", null);
        c0511v.f5254U.g(arrayList);
    }

    public final long r() {
        this.f5196d0 = this.f5194b0.getAndIncrement();
        this.f5181N.f5220J.I();
        return this.f5196d0;
    }
}
