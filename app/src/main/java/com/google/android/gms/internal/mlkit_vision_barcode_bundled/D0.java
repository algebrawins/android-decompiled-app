package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class D0 implements N0 {

    /* renamed from: a  reason: collision with root package name */
    public final D f2782a;

    /* renamed from: b  reason: collision with root package name */
    public final W0 f2783b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2784c;

    /* renamed from: d  reason: collision with root package name */
    public final P f2785d;

    public D0(W0 w0, P p2, D d4) {
        this.f2783b = w0;
        this.f2784c = d4 instanceof X;
        this.f2785d = p2;
        this.f2782a = d4;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.N0
    public final void a(Object obj) {
        this.f2783b.getClass();
        W0.c(obj);
        P.c(obj);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.N0
    public final int b(AbstractC0168a0 abstractC0168a0) {
        P0 p02;
        this.f2783b.getClass();
        V0 v02 = abstractC0168a0.zzc;
        int r12 = v02.f2860d;
        int r3 = 0;
        if (r12 == -1) {
            r12 = 0;
            for (int r22 = 0; r22 < v02.f2857a; r22++) {
                Logger logger = M.g;
                int j3 = ((L) v02.f2859c[r22]).j();
                int L3 = M.L(j3) + j3;
                int L4 = M.L(16);
                int L5 = M.L(v02.f2858b[r22] >>> 3);
                int L6 = M.L(8);
                r12 = D.C.s(24, L3, L4 + L5 + L6 + L6, r12);
            }
            v02.f2860d = r12;
        }
        if (this.f2784c) {
            S s3 = ((X) abstractC0168a0).zza;
            int r02 = 0;
            while (true) {
                p02 = s3.f2844a;
                if (r3 >= p02.f2836K.size()) {
                    break;
                }
                r02 += S.j(p02.d(r3));
                r3++;
            }
            for (Map.Entry entry : p02.b()) {
                r02 += S.j(entry);
            }
            return r12 + r02;
        }
        return r12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.N0
    public final Object c() {
        D d4 = this.f2782a;
        if (d4 instanceof AbstractC0168a0) {
            return (AbstractC0168a0) ((AbstractC0168a0) d4).m(4, null);
        }
        return ((W) ((AbstractC0168a0) d4).m(5, null)).e();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.N0
    public final void d(Object obj, Object obj2) {
        O0.c(this.f2783b, obj, obj2);
        if (this.f2784c) {
            O0.b(this.f2785d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.N0
    public final int e(AbstractC0168a0 abstractC0168a0) {
        this.f2783b.getClass();
        int hashCode = abstractC0168a0.zzc.hashCode();
        if (this.f2784c) {
            return ((X) abstractC0168a0).zza.f2844a.hashCode() + (hashCode * 53);
        }
        return hashCode;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.N0
    public final boolean f(Object obj) {
        this.f2785d.getClass();
        return ((X) obj).zza.g();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.N0
    public final void g(Object obj, C0220v0 c0220v0) {
        Iterator d4 = ((X) obj).zza.d();
        while (true) {
            androidx.datastore.preferences.protobuf.m0 m0Var = (androidx.datastore.preferences.protobuf.m0) d4;
            if (m0Var.hasNext()) {
                Map.Entry entry = (Map.Entry) m0Var.next();
                Y y3 = (Y) entry.getKey();
                if (y3.f2866K.a() == i1.MESSAGE) {
                    c0220v0.q(y3.f2865J, entry.getValue());
                } else {
                    throw new IllegalStateException("Found invalid MessageSet item.");
                }
            } else {
                this.f2783b.getClass();
                V0 v02 = ((AbstractC0168a0) obj).zzc;
                for (int r02 = 0; r02 < v02.f2857a; r02++) {
                    c0220v0.q(v02.f2858b[r02] >>> 3, v02.f2859c[r02]);
                }
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bc A[EDGE_INSN: B:53:0x00bc->B:35:0x00bc ?: BREAK  , SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.N0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(java.lang.Object r17, byte[] r18, int r19, int r20, com.google.android.gms.internal.mlkit_vision_barcode_bundled.G r21) {
        /*
            r16 = this;
            r6 = r18
            r7 = r20
            r8 = r21
            r0 = r17
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.a0 r0 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0168a0) r0
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.V0 r1 = r0.zzc
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.V0 r2 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.V0.f2856f
            if (r1 != r2) goto L16
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.V0 r1 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.V0.b()
            r0.zzc = r1
        L16:
            r9 = r1
            r0 = r17
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.X r0 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.X) r0
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.S r10 = r0.n()
            r0 = r19
            r1 = 0
        L22:
            if (r0 >= r7) goto Lc8
            int r2 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.S0.n(r6, r0, r8)
            int r0 = r8.f2789a
            r3 = 11
            r12 = r16
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.D r4 = r12.f2782a
            r5 = 2
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.O r13 = r8.f2792d
            if (r0 == r3) goto L6b
            r3 = r0 & 7
            if (r3 != r5) goto L66
            int r1 = r0 >>> 3
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.Z r13 = r13.a(r4, r1)
            if (r13 == 0) goto L5a
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.H0 r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.H0.f2796c
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.a0 r1 = r13.f2868a
            java.lang.Class r1 = r1.getClass()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.N0 r0 = r0.b(r1)
            int r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.S0.g(r0, r6, r2, r7, r8)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.Y r1 = r13.f2869b
            java.lang.Object r2 = r8.f2791c
            r10.f(r1, r2)
        L58:
            r1 = r13
            goto L22
        L5a:
            r1 = r18
            r3 = r20
            r4 = r9
            r5 = r21
            int r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.S0.m(r0, r1, r2, r3, r4, r5)
            goto L58
        L66:
            int r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.S0.t(r0, r6, r2, r7, r8)
            goto L22
        L6b:
            r0 = 0
            r3 = 0
        L6d:
            if (r2 >= r7) goto Lbc
            int r2 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.S0.n(r6, r2, r8)
            int r14 = r8.f2789a
            int r15 = r14 >>> 3
            r11 = r14 & 7
            if (r15 == r5) goto La6
            r5 = 3
            if (r15 == r5) goto L7f
            goto Lb3
        L7f:
            if (r1 == 0) goto L9a
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.H0 r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.H0.f2796c
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.a0 r11 = r1.f2868a
            java.lang.Class r11 = r11.getClass()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.N0 r5 = r5.b(r11)
            int r2 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.S0.g(r5, r6, r2, r7, r8)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.Y r5 = r1.f2869b
            java.lang.Object r11 = r8.f2791c
            r10.f(r5, r11)
        L98:
            r5 = 2
            goto L6d
        L9a:
            r5 = 2
            if (r11 != r5) goto Lb3
            int r2 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.S0.a(r6, r2, r8)
            java.lang.Object r3 = r8.f2791c
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.L r3 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.L) r3
            goto L98
        La6:
            if (r11 != 0) goto Lb3
            int r2 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.S0.n(r6, r2, r8)
            int r0 = r8.f2789a
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.Z r1 = r13.a(r4, r0)
            goto L98
        Lb3:
            r5 = 12
            if (r14 == r5) goto Lbc
            int r2 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.S0.t(r14, r6, r2, r7, r8)
            goto L98
        Lbc:
            if (r3 == 0) goto Lc5
            int r0 = r0 << 3
            r4 = 2
            r0 = r0 | r4
            r9.c(r0, r3)
        Lc5:
            r0 = r2
            goto L22
        Lc8:
            r12 = r16
            if (r0 != r7) goto Lcd
            return
        Lcd:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.l0 r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.C0198l0.c()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.D0.h(java.lang.Object, byte[], int, int, com.google.android.gms.internal.mlkit_vision_barcode_bundled.G):void");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.N0
    public final boolean i(AbstractC0168a0 abstractC0168a0, Object obj) {
        this.f2783b.getClass();
        if (!abstractC0168a0.zzc.equals(((AbstractC0168a0) obj).zzc)) {
            return false;
        }
        if (this.f2784c) {
            return ((X) abstractC0168a0).zza.equals(((X) obj).zza);
        }
        return true;
    }
}
