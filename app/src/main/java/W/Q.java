package w;

import D.C0042x;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Range;
import android.view.Surface;
import androidx.camera.core.impl.C0076c;
import androidx.camera.core.impl.C0078e;
import androidx.camera.core.impl.C0079f;
import androidx.camera.core.impl.C0095x;
import androidx.camera.core.impl.C0096y;
import androidx.camera.core.impl.InterfaceC0086n;
import d2.C0235c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import k0.C0322i;
import v.C0480b;
import x1.AbstractC0624h4;
import x1.T4;
import y.AbstractC0772a;
import y.C0780i;
import y.InterfaceC0773b;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: e  reason: collision with root package name */
    public C0235c f5064e;

    /* renamed from: f  reason: collision with root package name */
    public d0 f5065f;
    public androidx.camera.core.impl.c0 g;

    /* renamed from: l  reason: collision with root package name */
    public O f5070l;

    /* renamed from: m  reason: collision with root package name */
    public S.l f5071m;

    /* renamed from: n  reason: collision with root package name */
    public S.i f5072n;

    /* renamed from: r  reason: collision with root package name */
    public final x.t f5076r;

    /* renamed from: a  reason: collision with root package name */
    public final Object f5060a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f5061b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final M f5062c = new CameraCaptureSession.CaptureCallback();

    /* renamed from: h  reason: collision with root package name */
    public androidx.camera.core.impl.S f5066h = androidx.camera.core.impl.S.f2152L;

    /* renamed from: i  reason: collision with root package name */
    public C0480b f5067i = C0480b.a();

    /* renamed from: j  reason: collision with root package name */
    public final HashMap f5068j = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    public List f5069k = Collections.emptyList();

    /* renamed from: o  reason: collision with root package name */
    public HashMap f5073o = new HashMap();

    /* renamed from: p  reason: collision with root package name */
    public final A.h f5074p = new A.h(0);

    /* renamed from: q  reason: collision with root package name */
    public final A.h f5075q = new A.h(1);

    /* renamed from: d  reason: collision with root package name */
    public final P f5063d = new P(this);

    /* JADX WARN: Type inference failed for: r0v2, types: [w.M, android.hardware.camera2.CameraCaptureSession$CaptureCallback] */
    public Q(x.t tVar) {
        this.f5070l = O.UNINITIALIZED;
        this.f5070l = O.INITIALIZED;
        this.f5076r = tVar;
    }

    public static A.l a(List list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        CameraCaptureSession.CaptureCallback lVar;
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.i iVar = (androidx.camera.core.impl.i) it.next();
            if (iVar == null) {
                lVar = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                if (iVar instanceof K) {
                    arrayList2.add(((K) iVar).f5055a);
                } else {
                    arrayList2.add(new A.l(iVar));
                }
                if (arrayList2.size() == 1) {
                    lVar = (CameraCaptureSession.CaptureCallback) arrayList2.get(0);
                } else {
                    lVar = new A.l(arrayList2);
                }
            }
            arrayList.add(lVar);
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return new A.l(arrayList);
    }

    public static ArrayList e(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0780i c0780i = (C0780i) it.next();
            if (!arrayList2.contains(c0780i.f6170a.e())) {
                arrayList2.add(c0780i.f6170a.e());
                arrayList3.add(c0780i);
            }
        }
        return arrayList3;
    }

    public static androidx.camera.core.impl.O i(ArrayList arrayList) {
        Object obj;
        androidx.camera.core.impl.O b3 = androidx.camera.core.impl.O.b();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.S s3 = ((C0096y) it.next()).f2247b;
            for (C0076c c0076c : s3.o()) {
                Object obj2 = null;
                try {
                    obj = s3.e(c0076c);
                } catch (IllegalArgumentException unused) {
                    obj = null;
                }
                if (b3.f2153J.containsKey(c0076c)) {
                    try {
                        obj2 = b3.e(c0076c);
                    } catch (IllegalArgumentException unused2) {
                    }
                    if (!Objects.equals(obj2, obj)) {
                        x1.X.a("CaptureSession", "Detect conflicting option " + c0076c.f2176a + " : " + obj + " != " + obj2);
                    }
                } else {
                    b3.g(c0076c, obj);
                }
            }
        }
        return b3;
    }

    public final void b() {
        O o3 = this.f5070l;
        O o4 = O.RELEASED;
        if (o3 == o4) {
            x1.X.a("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.f5070l = o4;
        this.f5065f = null;
        S.i iVar = this.f5072n;
        if (iVar != null) {
            iVar.a(null);
            this.f5072n = null;
        }
    }

    public final List c() {
        List unmodifiableList;
        synchronized (this.f5060a) {
            unmodifiableList = Collections.unmodifiableList(this.f5061b);
        }
        return unmodifiableList;
    }

    public final C0780i d(C0078e c0078e, HashMap hashMap, String str) {
        long j3;
        boolean z3;
        Surface surface = (Surface) hashMap.get(c0078e.f2186a);
        AbstractC0624h4.e(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        C0780i c0780i = new C0780i(c0078e.f2188c, surface);
        y.r rVar = c0780i.f6170a;
        if (str != null) {
            rVar.h(str);
        } else {
            rVar.h(null);
        }
        List<androidx.camera.core.impl.D> list = c0078e.f2187b;
        if (!list.isEmpty()) {
            rVar.b();
            for (androidx.camera.core.impl.D d4 : list) {
                Surface surface2 = (Surface) hashMap.get(d4);
                AbstractC0624h4.e(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                rVar.a(surface2);
            }
        }
        int r6 = Build.VERSION.SDK_INT;
        if (r6 >= 33) {
            x.t tVar = this.f5076r;
            tVar.getClass();
            if (r6 >= 33) {
                z3 = true;
            } else {
                z3 = false;
            }
            AbstractC0624h4.f("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", z3);
            DynamicRangeProfiles a4 = ((InterfaceC0773b) tVar.f5471a).a();
            if (a4 != null) {
                C0042x c0042x = c0078e.f2189d;
                Long a5 = AbstractC0772a.a(c0042x, a4);
                if (a5 == null) {
                    x1.X.b("CaptureSession", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + c0042x);
                } else {
                    j3 = a5.longValue();
                    rVar.g(j3);
                    return c0780i;
                }
            }
        }
        j3 = 1;
        rVar.g(j3);
        return c0780i;
    }

    public final void f(ArrayList arrayList) {
        i iVar;
        ArrayList arrayList2;
        boolean z3;
        InterfaceC0086n interfaceC0086n;
        synchronized (this.f5060a) {
            try {
                if (this.f5070l != O.OPENED) {
                    x1.X.a("CaptureSession", "Skipping issueBurstCaptureRequest due to session closed");
                } else if (!arrayList.isEmpty()) {
                    try {
                        iVar = new i();
                        arrayList2 = new ArrayList();
                        x1.X.a("CaptureSession", "Issuing capture request.");
                        Iterator it = arrayList.iterator();
                        z3 = false;
                        while (it.hasNext()) {
                            C0096y c0096y = (C0096y) it.next();
                            if (Collections.unmodifiableList(c0096y.f2246a).isEmpty()) {
                                x1.X.a("CaptureSession", "Skipping issuing empty capture request.");
                            } else {
                                Iterator it2 = Collections.unmodifiableList(c0096y.f2246a).iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        androidx.camera.core.impl.D d4 = (androidx.camera.core.impl.D) it2.next();
                                        if (!this.f5068j.containsKey(d4)) {
                                            x1.X.a("CaptureSession", "Skipping capture request with invalid surface: " + d4);
                                            break;
                                        }
                                    } else {
                                        if (c0096y.f2248c == 2) {
                                            z3 = true;
                                        }
                                        C0095x c0095x = new C0095x(c0096y);
                                        if (c0096y.f2248c == 5 && (interfaceC0086n = c0096y.f2252h) != null) {
                                            c0095x.f2243h = interfaceC0086n;
                                        }
                                        androidx.camera.core.impl.c0 c0Var = this.g;
                                        if (c0Var != null) {
                                            c0095x.c(c0Var.f2184f.f2247b);
                                        }
                                        c0095x.c(this.f5066h);
                                        c0095x.c(c0096y.f2247b);
                                        C0096y d5 = c0095x.d();
                                        d0 d0Var = this.f5065f;
                                        d0Var.g.getClass();
                                        CaptureRequest b3 = T4.b(d5, ((CameraCaptureSession) ((h2.J) d0Var.g.f3003K).f3303K).getDevice(), this.f5068j);
                                        if (b3 == null) {
                                            x1.X.a("CaptureSession", "Skipping issuing request without surface.");
                                            return;
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        for (androidx.camera.core.impl.i iVar2 : c0096y.f2250e) {
                                            if (iVar2 instanceof K) {
                                                arrayList3.add(((K) iVar2).f5055a);
                                            } else {
                                                arrayList3.add(new A.l(iVar2));
                                            }
                                        }
                                        iVar.a(b3, arrayList3);
                                        arrayList2.add(b3);
                                    }
                                }
                            }
                        }
                    } catch (CameraAccessException e4) {
                        x1.X.b("CaptureSession", "Unable to access camera: " + e4.getMessage());
                        Thread.dumpStack();
                    }
                    if (!arrayList2.isEmpty()) {
                        if (this.f5074p.c(arrayList2, z3)) {
                            d0 d0Var2 = this.f5065f;
                            AbstractC0624h4.e(d0Var2.g, "Need to call openCaptureSession before using this API.");
                            ((CameraCaptureSession) ((h2.J) d0Var2.g.f3003K).f3303K).stopRepeating();
                            iVar.f5167c = new L(this);
                        }
                        if (this.f5075q.b(arrayList2, z3)) {
                            iVar.a((CaptureRequest) arrayList2.get(arrayList2.size() - 1), Collections.singletonList(new A.l(3, this)));
                        }
                        d0 d0Var3 = this.f5065f;
                        AbstractC0624h4.e(d0Var3.g, "Need to call openCaptureSession before using this API.");
                        ((h2.J) d0Var3.g.f3003K).q(arrayList2, d0Var3.f5137d, iVar);
                        return;
                    }
                    x1.X.a("CaptureSession", "Skipping issuing burst request due to no valid request elements");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(List list) {
        synchronized (this.f5060a) {
            try {
                switch (N.f5057a[this.f5070l.ordinal()]) {
                    case 1:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f5070l);
                    case 2:
                    case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                    case 4:
                        this.f5061b.addAll(list);
                        break;
                    case q0.k.STRING_FIELD_NUMBER /* 5 */:
                        this.f5061b.addAll(list);
                        ArrayList arrayList = this.f5061b;
                        if (!arrayList.isEmpty()) {
                            f(arrayList);
                            arrayList.clear();
                            break;
                        }
                        break;
                    case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    case 8:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                }
            } finally {
            }
        }
    }

    public final void h(androidx.camera.core.impl.c0 c0Var) {
        synchronized (this.f5060a) {
            try {
            } catch (Throwable th) {
                throw th;
            }
            if (c0Var == null) {
                x1.X.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
            } else if (this.f5070l != O.OPENED) {
                x1.X.a("CaptureSession", "Skipping issueRepeatingCaptureRequests due to session closed");
            } else {
                C0096y c0096y = c0Var.f2184f;
                if (Collections.unmodifiableList(c0096y.f2246a).isEmpty()) {
                    x1.X.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                    try {
                        d0 d0Var = this.f5065f;
                        AbstractC0624h4.e(d0Var.g, "Need to call openCaptureSession before using this API.");
                        ((CameraCaptureSession) ((h2.J) d0Var.g.f3003K).f3303K).stopRepeating();
                    } catch (CameraAccessException e4) {
                        x1.X.b("CaptureSession", "Unable to access camera: " + e4.getMessage());
                        Thread.dumpStack();
                    }
                    return;
                }
                try {
                    x1.X.a("CaptureSession", "Issuing request for session.");
                    C0095x c0095x = new C0095x(c0096y);
                    C0480b c0480b = this.f5067i;
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
                        androidx.camera.core.impl.O i3 = i(arrayList2);
                        this.f5066h = i3;
                        c0095x.c(i3);
                        C0096y d4 = c0095x.d();
                        d0 d0Var2 = this.f5065f;
                        d0Var2.g.getClass();
                        CaptureRequest b3 = T4.b(d4, ((CameraCaptureSession) ((h2.J) d0Var2.g.f3003K).f3303K).getDevice(), this.f5068j);
                        if (b3 == null) {
                            x1.X.a("CaptureSession", "Skipping issuing empty request for session.");
                            return;
                        } else {
                            this.f5065f.p(b3, a(c0096y.f2250e, this.f5062c));
                            return;
                        }
                    }
                    it.next().getClass();
                    throw new ClassCastException();
                } catch (CameraAccessException e5) {
                    x1.X.b("CaptureSession", "Unable to access camera: " + e5.getMessage());
                    Thread.dumpStack();
                    return;
                }
                throw th;
            }
        }
    }

    public final E1.a j(androidx.camera.core.impl.c0 c0Var, CameraDevice cameraDevice, C0235c c0235c) {
        synchronized (this.f5060a) {
            try {
                if (N.f5057a[this.f5070l.ordinal()] != 2) {
                    x1.X.b("CaptureSession", "Open not allowed in state: " + this.f5070l);
                    return new H.h(1, new IllegalStateException("open() should not allow the state: " + this.f5070l));
                }
                this.f5070l = O.GET_SURFACE;
                ArrayList arrayList = new ArrayList(c0Var.b());
                this.f5069k = arrayList;
                this.f5064e = c0235c;
                H.d b3 = H.d.b(((d0) c0235c.f3003K).q(arrayList));
                androidx.camera.core.impl.E e4 = new androidx.camera.core.impl.E(this, c0Var, cameraDevice);
                G.l lVar = ((d0) this.f5064e.f3003K).f5137d;
                b3.getClass();
                H.b f2 = H.f.f(b3, e4, lVar);
                C0322i c0322i = new C0322i(20, this);
                f2.a(new H.e(0, f2, c0322i), ((d0) this.f5064e.f3003K).f5137d);
                return H.f.d(f2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0043 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:4:0x0009, B:5:0x0013, B:38:0x00c4, B:7:0x0018, B:9:0x001c, B:12:0x0023, B:13:0x003c, B:15:0x0043, B:17:0x0049, B:18:0x004d, B:19:0x0052, B:20:0x0053, B:22:0x005d, B:24:0x0080, B:31:0x0097, B:33:0x009d, B:34:0x009e, B:35:0x00a3, B:25:0x0084, B:27:0x0088, B:28:0x0093, B:29:0x0095, B:36:0x00a4, B:37:0x00c0, B:41:0x00c8, B:42:0x00db), top: B:45:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:4:0x0009, B:5:0x0013, B:38:0x00c4, B:7:0x0018, B:9:0x001c, B:12:0x0023, B:13:0x003c, B:15:0x0043, B:17:0x0049, B:18:0x004d, B:19:0x0052, B:20:0x0053, B:22:0x005d, B:24:0x0080, B:31:0x0097, B:33:0x009d, B:34:0x009e, B:35:0x00a3, B:25:0x0084, B:27:0x0088, B:28:0x0093, B:29:0x0095, B:36:0x00a4, B:37:0x00c0, B:41:0x00c8, B:42:0x00db), top: B:45:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0088 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:4:0x0009, B:5:0x0013, B:38:0x00c4, B:7:0x0018, B:9:0x001c, B:12:0x0023, B:13:0x003c, B:15:0x0043, B:17:0x0049, B:18:0x004d, B:19:0x0052, B:20:0x0053, B:22:0x005d, B:24:0x0080, B:31:0x0097, B:33:0x009d, B:34:0x009e, B:35:0x00a3, B:25:0x0084, B:27:0x0088, B:28:0x0093, B:29:0x0095, B:36:0x00a4, B:37:0x00c0, B:41:0x00c8, B:42:0x00db), top: B:45:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:4:0x0009, B:5:0x0013, B:38:0x00c4, B:7:0x0018, B:9:0x001c, B:12:0x0023, B:13:0x003c, B:15:0x0043, B:17:0x0049, B:18:0x004d, B:19:0x0052, B:20:0x0053, B:22:0x005d, B:24:0x0080, B:31:0x0097, B:33:0x009d, B:34:0x009e, B:35:0x00a3, B:25:0x0084, B:27:0x0088, B:28:0x0093, B:29:0x0095, B:36:0x00a4, B:37:0x00c0, B:41:0x00c8, B:42:0x00db), top: B:45:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final E1.a k() {
        /*
            r6 = this;
            java.lang.String r0 = "release() should not be possible in state: "
            java.lang.String r1 = "The Opener shouldn't null in state:"
            java.lang.String r2 = "The Opener shouldn't null in state:"
            java.lang.Object r3 = r6.f5060a
            monitor-enter(r3)
            int[] r4 = w.N.f5057a     // Catch: java.lang.Throwable -> L20
            w.O r5 = r6.f5070l     // Catch: java.lang.Throwable -> L20
            int r5 = r5.ordinal()     // Catch: java.lang.Throwable -> L20
            r4 = r4[r5]     // Catch: java.lang.Throwable -> L20
            switch(r4) {
                case 1: goto Lc8;
                case 2: goto Lc0;
                case 3: goto La4;
                case 4: goto L23;
                case 5: goto L18;
                case 6: goto L18;
                case 7: goto L84;
                default: goto L16;
            }     // Catch: java.lang.Throwable -> L20
        L16:
            goto Lc4
        L18:
            w.d0 r0 = r6.f5065f     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L23
            r0.i()     // Catch: java.lang.Throwable -> L20
            goto L23
        L20:
            r0 = move-exception
            goto Ldc
        L23:
            v.b r0 = r6.f5067i     // Catch: java.lang.Throwable -> L20
            r0.getClass()     // Catch: java.lang.Throwable -> L20
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L20
            java.util.HashSet r0 = r0.f5043a     // Catch: java.lang.Throwable -> L20
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L20
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)     // Catch: java.lang.Throwable -> L20
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L20
            r1.<init>()     // Catch: java.lang.Throwable -> L20
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L20
        L3c:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> L20
            r5 = 0
            if (r4 == 0) goto L53
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L4d
            r1.add(r5)     // Catch: java.lang.Throwable -> L20
            goto L3c
        L4d:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException     // Catch: java.lang.Throwable -> L20
            r0.<init>()     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L20
        L53:
            java.util.Iterator r0 = r1.iterator()     // Catch: java.lang.Throwable -> L20
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L97
            w.O r0 = w.O.RELEASING     // Catch: java.lang.Throwable -> L20
            r6.f5070l = r0     // Catch: java.lang.Throwable -> L20
            d2.c r0 = r6.f5064e     // Catch: java.lang.Throwable -> L20
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L20
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L20
            w.O r2 = r6.f5070l     // Catch: java.lang.Throwable -> L20
            r1.append(r2)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L20
            x1.AbstractC0624h4.e(r0, r1)     // Catch: java.lang.Throwable -> L20
            d2.c r0 = r6.f5064e     // Catch: java.lang.Throwable -> L20
            java.lang.Object r0 = r0.f3003K     // Catch: java.lang.Throwable -> L20
            w.d0 r0 = (w.d0) r0     // Catch: java.lang.Throwable -> L20
            boolean r0 = r0.r()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L84
            r6.b()     // Catch: java.lang.Throwable -> L20
            goto Lc4
        L84:
            S.l r0 = r6.f5071m     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L93
            w.L r0 = new w.L     // Catch: java.lang.Throwable -> L20
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L20
            S.l r0 = x1.AbstractC0699s0.a(r0)     // Catch: java.lang.Throwable -> L20
            r6.f5071m = r0     // Catch: java.lang.Throwable -> L20
        L93:
            S.l r0 = r6.f5071m     // Catch: java.lang.Throwable -> L20
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L20
            return r0
        L97:
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L9e
            throw r5     // Catch: java.lang.Throwable -> L20
        L9e:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException     // Catch: java.lang.Throwable -> L20
            r0.<init>()     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L20
        La4:
            d2.c r0 = r6.f5064e     // Catch: java.lang.Throwable -> L20
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L20
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L20
            w.O r1 = r6.f5070l     // Catch: java.lang.Throwable -> L20
            r2.append(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L20
            x1.AbstractC0624h4.e(r0, r1)     // Catch: java.lang.Throwable -> L20
            d2.c r0 = r6.f5064e     // Catch: java.lang.Throwable -> L20
            java.lang.Object r0 = r0.f3003K     // Catch: java.lang.Throwable -> L20
            w.d0 r0 = (w.d0) r0     // Catch: java.lang.Throwable -> L20
            r0.r()     // Catch: java.lang.Throwable -> L20
        Lc0:
            w.O r0 = w.O.RELEASED     // Catch: java.lang.Throwable -> L20
            r6.f5070l = r0     // Catch: java.lang.Throwable -> L20
        Lc4:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L20
            H.h r0 = H.h.f701L
            return r0
        Lc8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L20
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L20
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L20
            w.O r0 = r6.f5070l     // Catch: java.lang.Throwable -> L20
            r2.append(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L20
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L20
            throw r1     // Catch: java.lang.Throwable -> L20
        Ldc:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L20
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w.Q.k():E1.a");
    }

    public final void l(androidx.camera.core.impl.c0 c0Var) {
        synchronized (this.f5060a) {
            try {
                switch (N.f5057a[this.f5070l.ordinal()]) {
                    case 1:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.f5070l);
                    case 2:
                    case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                    case 4:
                        this.g = c0Var;
                        break;
                    case q0.k.STRING_FIELD_NUMBER /* 5 */:
                        this.g = c0Var;
                        if (c0Var == null) {
                            return;
                        }
                        if (!this.f5068j.keySet().containsAll(c0Var.b())) {
                            x1.X.b("CaptureSession", "Does not have the proper configured lists");
                            return;
                        }
                        x1.X.a("CaptureSession", "Attempting to submit CaptureRequest after setting");
                        h(this.g);
                        break;
                    case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    case 8:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                }
            } finally {
            }
        }
    }

    public final ArrayList m(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0096y c0096y = (C0096y) it.next();
            HashSet hashSet = new HashSet();
            androidx.camera.core.impl.O.b();
            Range range = C0079f.f2191e;
            ArrayList arrayList3 = new ArrayList();
            androidx.camera.core.impl.P.a();
            hashSet.addAll(c0096y.f2246a);
            androidx.camera.core.impl.O c4 = androidx.camera.core.impl.O.c(c0096y.f2247b);
            arrayList3.addAll(c0096y.f2250e);
            ArrayMap arrayMap = new ArrayMap();
            androidx.camera.core.impl.h0 h0Var = c0096y.g;
            for (String str : h0Var.f2206a.keySet()) {
                arrayMap.put(str, h0Var.f2206a.get(str));
            }
            androidx.camera.core.impl.h0 h0Var2 = new androidx.camera.core.impl.h0(arrayMap);
            for (androidx.camera.core.impl.D d4 : Collections.unmodifiableList(this.g.f2184f.f2246a)) {
                hashSet.add(d4);
            }
            ArrayList arrayList4 = new ArrayList(hashSet);
            androidx.camera.core.impl.S a4 = androidx.camera.core.impl.S.a(c4);
            ArrayList arrayList5 = new ArrayList(arrayList3);
            androidx.camera.core.impl.h0 h0Var3 = androidx.camera.core.impl.h0.f2205b;
            ArrayMap arrayMap2 = new ArrayMap();
            ArrayMap arrayMap3 = h0Var2.f2206a;
            for (String str2 : arrayMap3.keySet()) {
                arrayMap2.put(str2, arrayMap3.get(str2));
            }
            androidx.camera.core.impl.h0 h0Var4 = new androidx.camera.core.impl.h0(arrayMap2);
            arrayList2.add(new C0096y(arrayList4, a4, 1, c0096y.f2249d, arrayList5, c0096y.f2251f, h0Var4, null));
        }
        return arrayList2;
    }
}
