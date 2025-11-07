package A;

import A0.AbstractC0017t;
import A0.C0001b;
import A0.RunnableC0004e;
import A0.U;
import A0.V;
import D.C;
import D.C0029j;
import D.C0037s;
import D.C0040v;
import D.f0;
import D.m0;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.hardware.camera2.CaptureResult;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.View;
import androidx.camera.core.impl.EnumC0083k;
import androidx.camera.core.impl.EnumC0084l;
import androidx.camera.core.impl.EnumC0085m;
import androidx.camera.core.impl.InterfaceC0086n;
import androidx.camera.core.impl.b0;
import androidx.camera.core.impl.c0;
import androidx.camera.core.impl.h0;
import androidx.camera.core.impl.i0;
import androidx.camera.core.impl.k0;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import b1.C0146b;
import b1.C0151g;
import b1.InterfaceC0150f;
import c1.InterfaceC0160b;
import c2.C0166e;
import d2.C0235c;
import e0.InterfaceC0247a;
import h2.E;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.locks.ReentrantLock;
import p.t0;
import w1.u;
import x1.AbstractC0612g0;
import x1.AbstractC0624h4;
import x1.X;
import x1.Y3;
import z.AbstractC0957j;
import z.n;

/* loaded from: classes.dex */
public final class f implements H.c, K0.h, InterfaceC0086n, r2.m, X0.b, Y2.d, InterfaceC0160b, InterfaceC0150f, E {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f9J;

    /* renamed from: K  reason: collision with root package name */
    public Object f10K;

    /* renamed from: L  reason: collision with root package name */
    public Object f11L;

    public /* synthetic */ f(int r12, Object obj, Object obj2) {
        this.f9J = r12;
        this.f10K = obj;
        this.f11L = obj2;
    }

    @Override // c1.InterfaceC0160b
    public Object Y() {
        b1.h hVar = (b1.h) ((a1.g) this.f10K).f1824c;
        hVar.getClass();
        return (Iterable) hVar.f(new f(24, hVar, (V0.c) this.f11L));
    }

    @Override // androidx.camera.core.impl.InterfaceC0086n
    public h0 a() {
        return (h0) this.f11L;
    }

    @Override // b1.InterfaceC0150f
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        S0.b bVar = b1.h.f2621N;
        b1.h hVar = (b1.h) this.f10K;
        hVar.getClass();
        ArrayList arrayList = new ArrayList();
        V0.c cVar = (V0.c) this.f11L;
        Long b3 = b1.h.b(sQLiteDatabase, cVar);
        if (b3 != null) {
            b1.h.k(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{b3.toString()}, null, null, null, String.valueOf(hVar.f2625M.f2608b)), new C0001b(hVar, arrayList, cVar, 13));
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int r12 = 0; r12 < arrayList.size(); r12++) {
            sb.append(((C0146b) arrayList.get(r12)).f2612a);
            if (r12 < arrayList.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        b1.h.k(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new i2.h(hashMap));
        ListIterator listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            C0146b c0146b = (C0146b) listIterator.next();
            if (hashMap.containsKey(Long.valueOf(c0146b.f2612a))) {
                V0.a c4 = c0146b.f2614c.c();
                long j3 = c0146b.f2612a;
                for (C0151g c0151g : (Set) hashMap.get(Long.valueOf(j3))) {
                    c4.a(c0151g.f2619a, c0151g.f2620b);
                }
                listIterator.set(new C0146b(j3, c0146b.f2613b, c4.c()));
            }
        }
        return arrayList;
    }

    @Override // H.c
    public void b(Object obj) {
        switch (this.f9J) {
            case 2:
                Void r3 = (Void) obj;
                AbstractC0624h4.f(null, ((S.i) this.f10K).a(null));
                return;
            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                Void r32 = (Void) obj;
                ((InterfaceC0247a) this.f10K).accept(new C0029j(0, (Surface) this.f11L));
                return;
            case 9:
                Void r33 = (Void) obj;
                ((S.i) this.f10K).a((C0040v) this.f11L);
                return;
            default:
                ((S.i) this.f10K).a(new ArrayList((List) obj));
                ((ScheduledFuture) this.f11L).cancel(true);
                return;
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0086n
    public long c() {
        InterfaceC0086n interfaceC0086n = (InterfaceC0086n) this.f10K;
        if (interfaceC0086n != null) {
            return interfaceC0086n.c();
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    @Override // H.c
    public void c0(Throwable th) {
        switch (this.f9J) {
            case 2:
                if (th instanceof m0) {
                    AbstractC0624h4.f(null, ((S.l) this.f11L).cancel(false));
                    return;
                } else {
                    AbstractC0624h4.f(null, ((S.i) this.f10K).a(null));
                    return;
                }
            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                AbstractC0624h4.f("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th, th instanceof m0);
                ((InterfaceC0247a) this.f10K).accept(new C0029j(1, (Surface) this.f11L));
                return;
            case 9:
                ((S.i) this.f10K).b(th);
                return;
            default:
                ((S.i) this.f10K).a(Collections.unmodifiableList(Collections.emptyList()));
                ((ScheduledFuture) this.f11L).cancel(true);
                return;
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0086n
    public EnumC0085m d() {
        InterfaceC0086n interfaceC0086n = (InterfaceC0086n) this.f10K;
        if (interfaceC0086n != null) {
            return interfaceC0086n.d();
        }
        return EnumC0085m.UNKNOWN;
    }

    @Override // h2.E
    public void e(KeyEvent keyEvent, E.d dVar) {
        String str;
        int action = keyEvent.getAction();
        boolean z3 = true;
        if (action != 0 && action != 1) {
            dVar.a(false);
            return;
        }
        Character a4 = ((c3.k) this.f11L).a(keyEvent.getUnicodeChar());
        if (action == 0) {
            z3 = false;
        }
        k kVar = new k(16, dVar);
        C0235c c0235c = (C0235c) this.f10K;
        HashMap hashMap = new HashMap();
        if (z3) {
            str = "keyup";
        } else {
            str = "keydown";
        }
        hashMap.put("type", str);
        hashMap.put("keymap", "android");
        hashMap.put("flags", Integer.valueOf(keyEvent.getFlags()));
        hashMap.put("plainCodePoint", Integer.valueOf(keyEvent.getUnicodeChar(0)));
        hashMap.put("codePoint", Integer.valueOf(keyEvent.getUnicodeChar()));
        hashMap.put("keyCode", Integer.valueOf(keyEvent.getKeyCode()));
        hashMap.put("scanCode", Integer.valueOf(keyEvent.getScanCode()));
        hashMap.put("metaState", Integer.valueOf(keyEvent.getMetaState()));
        hashMap.put("character", a4.toString());
        hashMap.put("source", Integer.valueOf(keyEvent.getSource()));
        hashMap.put("deviceId", Integer.valueOf(keyEvent.getDeviceId()));
        hashMap.put("repeatCount", Integer.valueOf(keyEvent.getRepeatCount()));
        ((a1.i) c0235c.f3003K).k(hashMap, new k(17, kVar));
    }

    @Override // androidx.camera.core.impl.InterfaceC0086n
    public CaptureResult f() {
        return C.c();
    }

    @Override // androidx.camera.core.impl.InterfaceC0086n
    public EnumC0084l g() {
        InterfaceC0086n interfaceC0086n = (InterfaceC0086n) this.f10K;
        if (interfaceC0086n != null) {
            return interfaceC0086n.g();
        }
        return EnumC0084l.UNKNOWN;
    }

    @Override // A2.a
    public Object get() {
        return new W0.g((Context) ((c) this.f10K).f5K, (W0.e) ((W0.f) this.f11L).get());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v6, types: [N2.l, java.lang.Object] */
    @Override // Y2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object h(Y2.e r7, D2.d r8) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A.f.h(Y2.e, D2.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
        if (r3.equals("share") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
        if (r3.equals("shareFilesWithResult") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
        if (r3.equals("shareWithResult") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0096, code lost:
        if ((r7 instanceof java.util.Map) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0098, code lost:
        if (r12 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009e, code lost:
        if (r15.a(r23) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a2, code lost:
        r3 = r22.p("text");
        N2.g.c(r3, "null cannot be cast to non-null type kotlin.String");
        r13.n((java.lang.String) r3, (java.lang.String) r22.p("subject"), r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        if (r12 != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b6, code lost:
        if (r4 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b8, code lost:
        r23.c("dev.fluttercommunity.plus/share/unavailable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bc, code lost:
        r23.c(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c6, code lost:
        throw new java.lang.IllegalArgumentException("Map arguments expected");
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cd, code lost:
        if (r3.equals("shareFiles") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d5, code lost:
        if ((r7 instanceof java.util.Map) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d7, code lost:
        if (r12 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dd, code lost:
        if (r15.a(r23) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e0, code lost:
        r3 = r22.p("paths");
        N2.g.b(r3);
        r13.o((java.util.List) r3, (java.util.List) r22.p("mimeTypes"), (java.lang.String) r22.p("text"), (java.lang.String) r22.p("subject"), r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010a, code lost:
        if (r12 != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010c, code lost:
        if (r4 == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010e, code lost:
        r23.c("dev.fluttercommunity.plus/share/unavailable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0112, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0114, code lost:
        r23.c(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0119, code lost:
        r23.a("Share failed", r0.getMessage(), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0129, code lost:
        throw new java.lang.IllegalArgumentException("Map arguments expected");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01e8, code lost:
        if (r4.startsWith("generic") == false) goto L102;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02a1 A[LOOP:1: B:107:0x029b->B:109:0x02a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0312 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0119 -> B:307:0x0123). Please submit an issue!!! */
    @Override // r2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i(h2.J r22, q2.n r23) {
        /*
            Method dump skipped, instructions count: 1842
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A.f.i(h2.J, q2.n):void");
    }

    @Override // androidx.camera.core.impl.InterfaceC0086n
    public EnumC0083k j() {
        InterfaceC0086n interfaceC0086n = (InterfaceC0086n) this.f10K;
        if (interfaceC0086n != null) {
            return interfaceC0086n.j();
        }
        return EnumC0083k.UNKNOWN;
    }

    public View k(int r10, int r11, int r12, int r13) {
        int r3;
        V v3 = (V) this.f10K;
        int H3 = v3.H();
        int F3 = v3.F();
        if (r11 > r10) {
            r3 = 1;
        } else {
            r3 = -1;
        }
        View view = null;
        while (r10 != r11) {
            View C3 = v3.C(r10);
            int Z3 = v3.Z(C3);
            int P3 = v3.P(C3);
            U u3 = (U) this.f11L;
            u3.f77b = H3;
            u3.f78c = F3;
            u3.f79d = Z3;
            u3.f80e = P3;
            if (r12 != 0) {
                u3.f76a = r12;
                if (u3.a()) {
                    return C3;
                }
            }
            if (r13 != 0) {
                u3.f76a = r13;
                if (u3.a()) {
                    view = C3;
                }
            }
            r10 += r3;
        }
        return view;
    }

    public J l(Class cls, String str) {
        N2.g.e(str, "key");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.datatransport.cct.CctBackendFactory m(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A.f.m(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    public b0 n() {
        b0 b0Var = new b0();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.f11L).entrySet()) {
            i0 i0Var = (i0) entry.getValue();
            if (i0Var.f2209c) {
                b0Var.a(i0Var.f2207a);
                arrayList.add((String) entry.getKey());
            }
        }
        X.a("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + ((String) this.f10K));
        return b0Var;
    }

    public Collection o() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.f11L).entrySet()) {
            if (((i0) entry.getValue()).f2209c) {
                arrayList.add(((i0) entry.getValue()).f2207a);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public Collection p() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.f11L).entrySet()) {
            if (((i0) entry.getValue()).f2209c) {
                arrayList.add(((i0) entry.getValue()).f2208b);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public LinkedHashSet q() {
        LinkedHashSet linkedHashSet;
        synchronized (this.f10K) {
            linkedHashSet = new LinkedHashSet(((LinkedHashMap) this.f11L).values());
        }
        return linkedHashSet;
    }

    public int r() {
        boolean z3;
        int k3;
        AbstractC0612g0.a();
        if (((f0) this.f10K) != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0624h4.f("The ImageReader is not initialized.", z3);
        f0 f0Var = (f0) this.f10K;
        synchronized (f0Var.f383J) {
            k3 = f0Var.f386M.k() - f0Var.f384K;
        }
        return k3;
    }

    public void t(t0 t0Var) {
        synchronized (this.f10K) {
            try {
                t0Var.getClass();
                for (String str : new LinkedHashSet((ArrayList) t0Var.f4722e)) {
                    X.a("CameraRepository", "Added camera: " + str);
                    ((LinkedHashMap) this.f11L).put(str, t0Var.a(str));
                }
            } catch (C0037s e4) {
                throw new Exception(e4);
            }
        }
    }

    public boolean u(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f11L;
        if (!linkedHashMap.containsKey(str)) {
            return false;
        }
        return ((i0) linkedHashMap.get(str)).f2209c;
    }

    public void v() {
        boolean z3;
        AbstractC0612g0.a();
        if (r() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0624h4.f("Too many acquire images. Close image to be able to process next.", z3);
        throw null;
    }

    public void w(String str, String str2) {
        E.d dVar = (E.d) this.f10K;
        dVar.f507a = false;
        dVar.f508b = null;
        ((c) this.f11L).K(str, str2);
    }

    public void x(c0.d dVar) {
        int r02 = dVar.f2645b;
        Handler handler = (Handler) this.f11L;
        c cVar = (c) this.f10K;
        if (r02 == 0) {
            handler.post(new H.e(14, cVar, dVar.f2644a));
        } else {
            handler.post(new RunnableC0004e(cVar, r02));
        }
    }

    public void y(String str, c0 c0Var, k0 k0Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f11L;
        if (!linkedHashMap.containsKey(str)) {
            return;
        }
        i0 i0Var = new i0(c0Var, k0Var);
        i0 i0Var2 = (i0) linkedHashMap.get(str);
        i0Var.f2209c = i0Var2.f2209c;
        i0Var.f2210d = i0Var2.f2210d;
        linkedHashMap.put(str, i0Var);
    }

    public /* synthetic */ f(int r12, boolean z3) {
        this.f9J = r12;
    }

    public f(E.c cVar, C0166e c0166e) {
        this.f9J = 27;
        N2.g.e(c0166e, "manager");
        this.f10K = cVar;
        this.f11L = c0166e;
    }

    public f(Context context, u uVar, Q0.c cVar, O1.a aVar) {
        this.f9J = 10;
        this.f10K = context;
        this.f11L = cVar;
    }

    public f(C0235c c0235c) {
        this.f9J = 29;
        this.f11L = new c3.k();
        this.f10K = c0235c;
    }

    public f(K0.b bVar) {
        this.f9J = 6;
        f fVar = new f(5);
        this.f10K = bVar;
        this.f11L = fVar;
    }

    public f(Y3 y3, K k3, AbstractC0017t abstractC0017t) {
        this.f9J = 23;
        N2.g.e(y3, "store");
        N2.g.e(abstractC0017t, "defaultCreationExtras");
        this.f10K = k3;
        this.f11L = abstractC0017t;
    }

    public f(String str, int r3) {
        this.f9J = r3;
        switch (r3) {
            case 22:
                this.f11L = new LinkedHashMap();
                this.f10K = str;
                return;
            default:
                this.f10K = (n) AbstractC0957j.f6565a.b(n.class);
                this.f11L = new a(1, str);
                return;
        }
    }

    public f(int r12) {
        this.f9J = r12;
        switch (r12) {
            case q0.k.STRING_FIELD_NUMBER /* 5 */:
                this.f10K = new ReentrantLock();
                this.f11L = new LinkedHashMap();
                return;
            case 20:
                this.f10K = new Object();
                this.f11L = new LinkedHashMap();
                new HashSet();
                return;
            default:
                new HashSet();
                return;
        }
    }

    public f(Context context) {
        this.f9J = 13;
        this.f11L = null;
        this.f10K = context;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [A0.U, java.lang.Object] */
    public f(V v3) {
        this.f9J = 1;
        this.f10K = v3;
        ?? obj = new Object();
        obj.f76a = 0;
        this.f11L = obj;
    }

    public f(ArrayList arrayList, ArrayList arrayList2) {
        this.f9J = 15;
        int size = arrayList.size();
        this.f10K = new int[size];
        this.f11L = new float[size];
        for (int r12 = 0; r12 < size; r12++) {
            ((int[]) this.f10K)[r12] = ((Integer) arrayList.get(r12)).intValue();
            ((float[]) this.f11L)[r12] = ((Float) arrayList2.get(r12)).floatValue();
        }
    }

    public f(int r22, int r3) {
        this.f9J = 15;
        this.f10K = new int[]{r22, r3};
        this.f11L = new float[]{0.0f, 1.0f};
    }

    public f(int r22, int r3, int r4) {
        this.f9J = 15;
        this.f10K = new int[]{r22, r3, r4};
        this.f11L = new float[]{0.0f, 0.5f, 1.0f};
    }
}
