package androidx.camera.core.impl;

import D.InterfaceC0031l;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: androidx.camera.core.impl.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0093v {

    /* renamed from: a  reason: collision with root package name */
    public final StringBuilder f2231a = new StringBuilder();

    /* renamed from: b  reason: collision with root package name */
    public final Object f2232b;

    /* renamed from: c  reason: collision with root package name */
    public int f2233c;

    /* renamed from: d  reason: collision with root package name */
    public final B.a f2234d;

    /* renamed from: e  reason: collision with root package name */
    public final HashMap f2235e;

    /* renamed from: f  reason: collision with root package name */
    public int f2236f;

    public C0093v(B.a aVar) {
        Object obj = new Object();
        this.f2232b = obj;
        this.f2235e = new HashMap();
        this.f2233c = 1;
        synchronized (obj) {
            this.f2234d = aVar;
            this.f2236f = this.f2233c;
        }
    }

    public final C0092u a(String str) {
        HashMap hashMap = this.f2235e;
        for (InterfaceC0031l interfaceC0031l : hashMap.keySet()) {
            if (str.equals(interfaceC0031l.k().e())) {
                return (C0092u) hashMap.get(interfaceC0031l);
            }
        }
        return null;
    }

    public final void b() {
        String str;
        boolean d4 = x1.X.d("CameraStateRegistry");
        StringBuilder sb = this.f2231a;
        if (d4) {
            sb.setLength(0);
            sb.append("Recalculating open cameras:\n");
            sb.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            sb.append("-------------------------------------------------------------------\n");
        }
        int r8 = 0;
        for (Map.Entry entry : this.f2235e.entrySet()) {
            if (x1.X.d("CameraStateRegistry")) {
                if (((C0092u) entry.getValue()).f2227a != null) {
                    str = ((C0092u) entry.getValue()).f2227a.toString();
                } else {
                    str = "UNKNOWN";
                }
                sb.append(String.format(Locale.US, "%-45s%-22s\n", ((InterfaceC0031l) entry.getKey()).toString(), str));
            }
            EnumC0090s enumC0090s = ((C0092u) entry.getValue()).f2227a;
            if (enumC0090s != null && enumC0090s.a()) {
                r8++;
            }
        }
        if (x1.X.d("CameraStateRegistry")) {
            sb.append("-------------------------------------------------------------------\n");
            Locale locale = Locale.US;
            int r02 = this.f2233c;
            sb.append("Open count: " + r8 + " (Max allowed: " + r02 + ")");
            x1.X.a("CameraStateRegistry", sb.toString());
        }
        this.f2236f = Math.max(this.f2233c - r8, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0089 A[Catch: all -> 0x0065, TryCatch #0 {all -> 0x0065, blocks: (B:4:0x0007, B:6:0x001e, B:8:0x002d, B:12:0x0036, B:15:0x0067, B:17:0x006b, B:19:0x006f, B:27:0x0081, B:29:0x0089, B:33:0x0094, B:35:0x00a8, B:36:0x00ab, B:26:0x007d), top: B:40:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8 A[Catch: all -> 0x0065, TryCatch #0 {all -> 0x0065, blocks: (B:4:0x0007, B:6:0x001e, B:8:0x002d, B:12:0x0036, B:15:0x0067, B:17:0x006b, B:19:0x006f, B:27:0x0081, B:29:0x0089, B:33:0x0094, B:35:0x00a8, B:36:0x00ab, B:26:0x007d), top: B:40:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(w.C0511v r12) {
        /*
            r11 = this;
            java.lang.String r0 = "tryOpenCamera("
            java.lang.String r1 = " --> "
            java.lang.Object r2 = r11.f2232b
            monitor-enter(r2)
            java.util.HashMap r3 = r11.f2235e     // Catch: java.lang.Throwable -> L65
            java.lang.Object r3 = r3.get(r12)     // Catch: java.lang.Throwable -> L65
            androidx.camera.core.impl.u r3 = (androidx.camera.core.impl.C0092u) r3     // Catch: java.lang.Throwable -> L65
            java.lang.String r4 = "Camera must first be registered with registerCamera()"
            x1.AbstractC0624h4.e(r3, r4)     // Catch: java.lang.Throwable -> L65
            java.lang.String r4 = "CameraStateRegistry"
            boolean r4 = x1.X.d(r4)     // Catch: java.lang.Throwable -> L65
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L67
            java.lang.StringBuilder r4 = r11.f2231a     // Catch: java.lang.Throwable -> L65
            r4.setLength(r6)     // Catch: java.lang.Throwable -> L65
            java.lang.StringBuilder r4 = r11.f2231a     // Catch: java.lang.Throwable -> L65
            java.util.Locale r7 = java.util.Locale.US     // Catch: java.lang.Throwable -> L65
            int r7 = r11.f2236f     // Catch: java.lang.Throwable -> L65
            androidx.camera.core.impl.s r8 = r3.f2227a     // Catch: java.lang.Throwable -> L65
            if (r8 == 0) goto L35
            boolean r8 = r8.a()     // Catch: java.lang.Throwable -> L65
            if (r8 == 0) goto L35
            r8 = 1
            goto L36
        L35:
            r8 = 0
        L36:
            androidx.camera.core.impl.s r9 = r3.f2227a     // Catch: java.lang.Throwable -> L65
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L65
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L65
            r10.append(r12)     // Catch: java.lang.Throwable -> L65
            java.lang.String r12 = ") [Available Cameras: "
            r10.append(r12)     // Catch: java.lang.Throwable -> L65
            r10.append(r7)     // Catch: java.lang.Throwable -> L65
            java.lang.String r12 = ", Already Open: "
            r10.append(r12)     // Catch: java.lang.Throwable -> L65
            r10.append(r8)     // Catch: java.lang.Throwable -> L65
            java.lang.String r12 = " (Previous state: "
            r10.append(r12)     // Catch: java.lang.Throwable -> L65
            r10.append(r9)     // Catch: java.lang.Throwable -> L65
            java.lang.String r12 = ")]"
            r10.append(r12)     // Catch: java.lang.Throwable -> L65
            java.lang.String r12 = r10.toString()     // Catch: java.lang.Throwable -> L65
            r4.append(r12)     // Catch: java.lang.Throwable -> L65
            goto L67
        L65:
            r12 = move-exception
            goto Lad
        L67:
            int r12 = r11.f2236f     // Catch: java.lang.Throwable -> L65
            if (r12 > 0) goto L7d
            androidx.camera.core.impl.s r12 = r3.f2227a     // Catch: java.lang.Throwable -> L65
            if (r12 == 0) goto L77
            boolean r12 = r12.a()     // Catch: java.lang.Throwable -> L65
            if (r12 == 0) goto L77
            r12 = 1
            goto L78
        L77:
            r12 = 0
        L78:
            if (r12 == 0) goto L7b
            goto L7d
        L7b:
            r5 = 0
            goto L81
        L7d:
            androidx.camera.core.impl.s r12 = androidx.camera.core.impl.EnumC0090s.OPENING     // Catch: java.lang.Throwable -> L65
            r3.f2227a = r12     // Catch: java.lang.Throwable -> L65
        L81:
            java.lang.String r12 = "CameraStateRegistry"
            boolean r12 = x1.X.d(r12)     // Catch: java.lang.Throwable -> L65
            if (r12 == 0) goto La6
            java.lang.StringBuilder r12 = r11.f2231a     // Catch: java.lang.Throwable -> L65
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L92
            java.lang.String r0 = "SUCCESS"
            goto L94
        L92:
            java.lang.String r0 = "FAIL"
        L94:
            java.lang.String r0 = r1.concat(r0)     // Catch: java.lang.Throwable -> L65
            r12.append(r0)     // Catch: java.lang.Throwable -> L65
            java.lang.String r12 = "CameraStateRegistry"
            java.lang.StringBuilder r0 = r11.f2231a     // Catch: java.lang.Throwable -> L65
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L65
            x1.X.a(r12, r0)     // Catch: java.lang.Throwable -> L65
        La6:
            if (r5 == 0) goto Lab
            r11.b()     // Catch: java.lang.Throwable -> L65
        Lab:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L65
            return r5
        Lad:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L65
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.C0093v.c(w.v):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0055 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f2232b
            monitor-enter(r0)
            B.a r1 = r5.f2234d     // Catch: java.lang.Throwable -> Ld
            int r1 = r1.f171J     // Catch: java.lang.Throwable -> Ld
            r2 = 2
            r3 = 1
            if (r1 == r2) goto Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r3
        Ld:
            r6 = move-exception
            goto L5b
        Lf:
            androidx.camera.core.impl.u r1 = r5.a(r6)     // Catch: java.lang.Throwable -> Ld
            r2 = 0
            if (r1 == 0) goto L1d
            androidx.camera.core.impl.u r6 = r5.a(r6)     // Catch: java.lang.Throwable -> Ld
            androidx.camera.core.impl.s r6 = r6.f2227a     // Catch: java.lang.Throwable -> Ld
            goto L1e
        L1d:
            r6 = r2
        L1e:
            if (r7 == 0) goto L2c
            androidx.camera.core.impl.u r1 = r5.a(r7)     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto L2c
            androidx.camera.core.impl.u r7 = r5.a(r7)     // Catch: java.lang.Throwable -> Ld
            androidx.camera.core.impl.s r2 = r7.f2227a     // Catch: java.lang.Throwable -> Ld
        L2c:
            androidx.camera.core.impl.s r7 = androidx.camera.core.impl.EnumC0090s.OPEN     // Catch: java.lang.Throwable -> Ld
            boolean r1 = r7.equals(r6)     // Catch: java.lang.Throwable -> Ld
            r4 = 0
            if (r1 != 0) goto L40
            androidx.camera.core.impl.s r1 = androidx.camera.core.impl.EnumC0090s.CONFIGURED     // Catch: java.lang.Throwable -> Ld
            boolean r6 = r1.equals(r6)     // Catch: java.lang.Throwable -> Ld
            if (r6 == 0) goto L3e
            goto L40
        L3e:
            r6 = 0
            goto L41
        L40:
            r6 = 1
        L41:
            boolean r7 = r7.equals(r2)     // Catch: java.lang.Throwable -> Ld
            if (r7 != 0) goto L52
            androidx.camera.core.impl.s r7 = androidx.camera.core.impl.EnumC0090s.CONFIGURED     // Catch: java.lang.Throwable -> Ld
            boolean r7 = r7.equals(r2)     // Catch: java.lang.Throwable -> Ld
            if (r7 == 0) goto L50
            goto L52
        L50:
            r7 = 0
            goto L53
        L52:
            r7 = 1
        L53:
            if (r6 == 0) goto L58
            if (r7 == 0) goto L58
            goto L59
        L58:
            r3 = 0
        L59:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            return r3
        L5b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.C0093v.d(java.lang.String, java.lang.String):boolean");
    }
}
