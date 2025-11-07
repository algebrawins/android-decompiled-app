package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: c  reason: collision with root package name */
    public static final S f2843c = new S(0);

    /* renamed from: a  reason: collision with root package name */
    public final P0 f2844a = new P0(16);

    /* renamed from: b  reason: collision with root package name */
    public boolean f2845b;

    public S() {
    }

    public static int a(Y y3, Object obj) {
        int j3;
        int L3;
        EnumC0190h1 enumC0190h1 = y3.f2866K;
        int L4 = M.L(y3.f2865J << 3);
        if (enumC0190h1 == EnumC0190h1.zzj) {
            D d4 = (D) obj;
            Charset charset = AbstractC0192j0.f2920a;
            L4 += L4;
        }
        i1 i1Var = i1.INT;
        int r12 = 4;
        switch (enumC0190h1.ordinal()) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                ((Double) obj).getClass();
                r12 = 8;
                break;
            case 1:
                ((Float) obj).getClass();
                break;
            case 2:
                r12 = M.M(((Long) obj).longValue());
                break;
            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                r12 = M.M(((Long) obj).longValue());
                break;
            case 4:
                r12 = M.J(((Integer) obj).intValue());
                break;
            case q0.k.STRING_FIELD_NUMBER /* 5 */:
                ((Long) obj).getClass();
                r12 = 8;
                break;
            case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Integer) obj).getClass();
                break;
            case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Boolean) obj).getClass();
                r12 = 1;
                break;
            case 8:
                if (obj instanceof L) {
                    j3 = ((L) obj).j();
                    L3 = M.L(j3);
                    r12 = L3 + j3;
                    break;
                } else {
                    r12 = M.K((String) obj);
                    break;
                }
            case 9:
                r12 = ((AbstractC0168a0) ((D) obj)).c();
                break;
            case 10:
                j3 = ((AbstractC0168a0) ((D) obj)).c();
                L3 = M.L(j3);
                r12 = L3 + j3;
                break;
            case 11:
                if (obj instanceof L) {
                    j3 = ((L) obj).j();
                    L3 = M.L(j3);
                } else {
                    j3 = ((byte[]) obj).length;
                    L3 = M.L(j3);
                }
                r12 = L3 + j3;
                break;
            case 12:
                r12 = M.L(((Integer) obj).intValue());
                break;
            case 13:
                if (obj instanceof InterfaceC0174c0) {
                    r12 = M.J(((L1) ((InterfaceC0174c0) obj)).a());
                    break;
                } else {
                    r12 = M.J(((Integer) obj).intValue());
                    break;
                }
            case 14:
                ((Integer) obj).getClass();
                break;
            case 15:
                ((Long) obj).getClass();
                r12 = 8;
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                r12 = M.L((intValue >> 31) ^ (intValue + intValue));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                r12 = M.M((longValue >> 63) ^ (longValue + longValue));
                break;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return L4 + r12;
    }

    public static boolean i(Map.Entry entry) {
        if (((Y) entry.getKey()).f2866K.a() == i1.MESSAGE) {
            Object value = entry.getValue();
            if (value instanceof A0) {
                return ((A0) value).a();
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        return true;
    }

    public static final int j(Map.Entry entry) {
        Y y3 = (Y) entry.getKey();
        Object value = entry.getValue();
        if (y3.f2866K.a() == i1.MESSAGE) {
            int L3 = M.L(((Y) entry.getKey()).f2865J);
            int c4 = ((AbstractC0168a0) ((D) value)).c();
            int L4 = M.L(24) + M.L(c4) + c4;
            int L5 = M.L(16);
            int L6 = M.L(8);
            return L5 + L3 + L6 + L6 + L4;
        }
        return a(y3, value);
    }

    /* renamed from: b */
    public final S clone() {
        P0 p02;
        S s3 = new S();
        int r12 = 0;
        while (true) {
            p02 = this.f2844a;
            if (r12 >= p02.f2836K.size()) {
                break;
            }
            Map.Entry d4 = p02.d(r12);
            s3.f((Y) d4.getKey(), d4.getValue());
            r12++;
        }
        for (Map.Entry entry : p02.b()) {
            s3.f((Y) entry.getKey(), entry.getValue());
        }
        return s3;
    }

    public final Object c(Y y3) {
        return this.f2844a.get(y3);
    }

    public final Iterator d() {
        return ((androidx.datastore.preferences.protobuf.n0) this.f2844a.entrySet()).iterator();
    }

    public final void e() {
        P0 p02;
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (!this.f2845b) {
            int r12 = 0;
            while (true) {
                p02 = this.f2844a;
                if (r12 >= p02.f2836K.size()) {
                    break;
                }
                Map.Entry d4 = p02.d(r12);
                if (d4.getValue() instanceof AbstractC0168a0) {
                    AbstractC0168a0 abstractC0168a0 = (AbstractC0168a0) d4.getValue();
                    abstractC0168a0.getClass();
                    H0.f2796c.b(abstractC0168a0.getClass()).a(abstractC0168a0);
                    abstractC0168a0.g();
                }
                r12++;
            }
            if (!p02.f2838M) {
                for (int r02 = 0; r02 < p02.f2836K.size(); r02++) {
                    ((Y) p02.d(r02).getKey()).getClass();
                }
                for (Map.Entry entry : p02.b()) {
                    ((Y) entry.getKey()).getClass();
                }
            }
            if (!p02.f2838M) {
                if (p02.f2837L.isEmpty()) {
                    unmodifiableMap = Collections.emptyMap();
                } else {
                    unmodifiableMap = Collections.unmodifiableMap(p02.f2837L);
                }
                p02.f2837L = unmodifiableMap;
                if (p02.f2840O.isEmpty()) {
                    unmodifiableMap2 = Collections.emptyMap();
                } else {
                    unmodifiableMap2 = Collections.unmodifiableMap(p02.f2840O);
                }
                p02.f2840O = unmodifiableMap2;
                p02.f2838M = true;
            }
            this.f2845b = true;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        return this.f2844a.equals(((S) obj).f2844a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
        if ((r6 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC0174c0) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
        if ((r6 instanceof byte[]) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
        if (r1 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
        if ((r6 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.D) != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(com.google.android.gms.internal.mlkit_vision_barcode_bundled.Y r5, java.lang.Object r6) {
        /*
            r4 = this;
            r5.getClass()
            java.nio.charset.Charset r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0192j0.f2920a
            r6.getClass()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.h1 r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.EnumC0190h1.zza
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.i1 r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.i1.INT
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.h1 r0 = r5.f2866K
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.i1 r1 = r0.a()
            int r1 = r1.ordinal()
            switch(r1) {
                case 0: goto L40;
                case 1: goto L3d;
                case 2: goto L3a;
                case 3: goto L37;
                case 4: goto L34;
                case 5: goto L31;
                case 6: goto L28;
                case 7: goto L1f;
                case 8: goto L1a;
                default: goto L19;
            }
        L19:
            goto L4a
        L1a:
            boolean r1 = r6 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.D
            if (r1 == 0) goto L4a
            goto L44
        L1f:
            boolean r1 = r6 instanceof java.lang.Integer
            if (r1 != 0) goto L44
            boolean r1 = r6 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC0174c0
            if (r1 == 0) goto L4a
            goto L44
        L28:
            boolean r1 = r6 instanceof com.google.android.gms.internal.mlkit_vision_barcode_bundled.L
            if (r1 != 0) goto L44
            boolean r1 = r6 instanceof byte[]
            if (r1 == 0) goto L4a
            goto L44
        L31:
            boolean r1 = r6 instanceof java.lang.String
            goto L42
        L34:
            boolean r1 = r6 instanceof java.lang.Boolean
            goto L42
        L37:
            boolean r1 = r6 instanceof java.lang.Double
            goto L42
        L3a:
            boolean r1 = r6 instanceof java.lang.Float
            goto L42
        L3d:
            boolean r1 = r6 instanceof java.lang.Long
            goto L42
        L40:
            boolean r1 = r6 instanceof java.lang.Integer
        L42:
            if (r1 == 0) goto L4a
        L44:
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0 r0 = r4.f2844a
            r0.put(r5, r6)
            return
        L4a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            int r5 = r5.f2865J
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.i1 r0 = r0.a()
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r0
            r5 = 2
            r2[r5] = r6
            java.lang.String r5 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r5 = java.lang.String.format(r5, r2)
            r1.<init>(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.S.f(com.google.android.gms.internal.mlkit_vision_barcode_bundled.Y, java.lang.Object):void");
    }

    public final boolean g() {
        int r12 = 0;
        while (true) {
            P0 p02 = this.f2844a;
            if (r12 < p02.f2836K.size()) {
                if (!i(p02.d(r12))) {
                    return false;
                }
                r12++;
            } else {
                for (Map.Entry entry : p02.b()) {
                    if (!i(entry)) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    public final void h(Map.Entry entry) {
        Y y3 = (Y) entry.getKey();
        Object value = entry.getValue();
        y3.getClass();
        i1 a4 = y3.f2866K.a();
        i1 i1Var = i1.MESSAGE;
        P0 p02 = this.f2844a;
        if (a4 == i1Var) {
            Object obj = p02.get(y3);
            if (obj == null) {
                if (value instanceof byte[]) {
                    byte[] bArr = (byte[]) value;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    System.arraycopy(bArr, 0, bArr2, 0, length);
                    value = bArr2;
                }
                p02.put(y3, value);
                return;
            }
            AbstractC0168a0 abstractC0168a0 = (AbstractC0168a0) ((D) obj);
            W w3 = (W) abstractC0168a0.m(5, null);
            w3.b(abstractC0168a0);
            w3.b((AbstractC0168a0) ((D) value));
            p02.put(y3, w3.c());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr3 = (byte[]) value;
            int length2 = bArr3.length;
            byte[] bArr4 = new byte[length2];
            System.arraycopy(bArr3, 0, bArr4, 0, length2);
            value = bArr4;
        }
        p02.put(y3, value);
    }

    public final int hashCode() {
        return this.f2844a.hashCode();
    }

    public S(int r22) {
        e();
        e();
    }
}
