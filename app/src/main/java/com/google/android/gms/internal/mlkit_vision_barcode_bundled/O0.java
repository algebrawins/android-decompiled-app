package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class O0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f2831a;

    /* renamed from: b  reason: collision with root package name */
    public static final W0 f2832b;

    /* renamed from: c  reason: collision with root package name */
    public static final W0 f2833c;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.google.android.gms.internal.mlkit_vision_barcode_bundled.W0] */
    static {
        Class<?> cls;
        Class<?> cls2;
        W0 w0 = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f2831a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                w0 = (W0) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f2832b = w0;
        f2833c = new Object();
    }

    public static int A(int r02, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (M.L(r02 << 3) + 4) * size;
    }

    public static int B(List list) {
        return list.size() * 4;
    }

    public static int C(int r02, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (M.L(r02 << 3) + 8) * size;
    }

    public static int D(List list) {
        return list.size() * 8;
    }

    public static int E(int r4, List list, N0 n02) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r22 = 0;
        for (int r12 = 0; r12 < size; r12++) {
            r22 += M.I(r4, (D) list.get(r12), n02);
        }
        return r22;
    }

    public static int F(int r12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (M.L(r12 << 3) * size) + G(list);
    }

    public static int G(List list) {
        int r22;
        int size = list.size();
        int r12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0171b0) {
            C0171b0 c0171b0 = (C0171b0) list;
            r22 = 0;
            while (r12 < size) {
                c0171b0.j(r12);
                r22 += M.J(c0171b0.f2872K[r12]);
                r12++;
            }
        } else {
            r22 = 0;
            while (r12 < size) {
                r22 += M.J(((Integer) list.get(r12)).intValue());
                r12++;
            }
        }
        return r22;
    }

    public static int H(int r12, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (M.L(r12 << 3) * list.size()) + I(list);
    }

    public static int I(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0216t0) {
            AbstractC0216t0 abstractC0216t0 = (AbstractC0216t0) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int r22 = 0;
        for (int r12 = 0; r12 < size; r12++) {
            r22 += M.M(((Long) list.get(r12)).longValue());
        }
        return r22;
    }

    public static int J(int r12, Object obj, N0 n02) {
        Logger logger = M.g;
        int b3 = ((D) obj).b(n02);
        return M.L(r12 << 3) + M.L(b3) + b3;
    }

    public static int K(int r3, List list, N0 n02) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int L3 = M.L(r3 << 3) * size;
        for (int r12 = 0; r12 < size; r12++) {
            int b3 = ((D) list.get(r12)).b(n02);
            L3 = D.C.r(b3, b3, L3);
        }
        return L3;
    }

    public static int L(int r12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (M.L(r12 << 3) * size) + M(list);
    }

    public static int M(List list) {
        int r22;
        int size = list.size();
        int r12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0171b0) {
            C0171b0 c0171b0 = (C0171b0) list;
            r22 = 0;
            while (r12 < size) {
                c0171b0.j(r12);
                int r3 = c0171b0.f2872K[r12];
                r22 += M.L((r3 >> 31) ^ (r3 + r3));
                r12++;
            }
        } else {
            r22 = 0;
            while (r12 < size) {
                int intValue = ((Integer) list.get(r12)).intValue();
                r22 += M.L((intValue >> 31) ^ (intValue + intValue));
                r12++;
            }
        }
        return r22;
    }

    public static int N(int r12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (M.L(r12 << 3) * size) + O(list);
    }

    public static int O(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0216t0) {
            AbstractC0216t0 abstractC0216t0 = (AbstractC0216t0) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int r22 = 0;
        for (int r12 = 0; r12 < size; r12++) {
            long longValue = ((Long) list.get(r12)).longValue();
            r22 += M.M((longValue >> 63) ^ (longValue + longValue));
        }
        return r22;
    }

    public static int P(int r4, List list) {
        int size = list.size();
        int r12 = 0;
        if (size == 0) {
            return 0;
        }
        boolean z3 = list instanceof InterfaceC0207o0;
        int L3 = M.L(r4 << 3) * size;
        if (z3) {
            InterfaceC0207o0 interfaceC0207o0 = (InterfaceC0207o0) list;
            while (r12 < size) {
                Object g = interfaceC0207o0.g(r12);
                if (g instanceof L) {
                    int j3 = ((L) g).j();
                    L3 = D.C.r(j3, j3, L3);
                } else {
                    L3 = M.K((String) g) + L3;
                }
                r12++;
            }
        } else {
            while (r12 < size) {
                Object obj = list.get(r12);
                if (obj instanceof L) {
                    int j4 = ((L) obj).j();
                    L3 = D.C.r(j4, j4, L3);
                } else {
                    L3 = M.K((String) obj) + L3;
                }
                r12++;
            }
        }
        return L3;
    }

    public static int Q(int r12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (M.L(r12 << 3) * size) + R(list);
    }

    public static int R(List list) {
        int r22;
        int size = list.size();
        int r12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0171b0) {
            C0171b0 c0171b0 = (C0171b0) list;
            r22 = 0;
            while (r12 < size) {
                c0171b0.j(r12);
                r22 += M.L(c0171b0.f2872K[r12]);
                r12++;
            }
        } else {
            r22 = 0;
            while (r12 < size) {
                r22 += M.L(((Integer) list.get(r12)).intValue());
                r12++;
            }
        }
        return r22;
    }

    public static int S(int r12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (M.L(r12 << 3) * size) + T(list);
    }

    public static int T(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC0216t0) {
            AbstractC0216t0 abstractC0216t0 = (AbstractC0216t0) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int r22 = 0;
        for (int r12 = 0; r12 < size; r12++) {
            r22 += M.M(((Long) list.get(r12)).longValue());
        }
        return r22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r5 = r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(java.lang.Object r2, int r3, int r4, java.lang.Object r5, com.google.android.gms.internal.mlkit_vision_barcode_bundled.W0 r6) {
        /*
            if (r5 != 0) goto L13
            r6.getClass()
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.a0 r2 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0168a0) r2
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.V0 r5 = r2.zzc
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.V0 r0 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.V0.f2856f
            if (r5 != r0) goto L13
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.V0 r5 = com.google.android.gms.internal.mlkit_vision_barcode_bundled.V0.b()
            r2.zzc = r5
        L13:
            long r0 = (long) r4
            r6.getClass()
            int r2 = r3 << 3
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            r4 = r5
            com.google.android.gms.internal.mlkit_vision_barcode_bundled.V0 r4 = (com.google.android.gms.internal.mlkit_vision_barcode_bundled.V0) r4
            r4.c(r2, r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.O0.a(java.lang.Object, int, int, java.lang.Object, com.google.android.gms.internal.mlkit_vision_barcode_bundled.W0):java.lang.Object");
    }

    public static void b(P p2, Object obj, Object obj2) {
        P0 p02;
        p2.getClass();
        S s3 = ((X) obj2).zza;
        if (!s3.f2844a.isEmpty()) {
            S n3 = ((X) obj).n();
            n3.getClass();
            int r4 = 0;
            while (true) {
                p02 = s3.f2844a;
                if (r4 >= p02.f2836K.size()) {
                    break;
                }
                n3.h(p02.d(r4));
                r4++;
            }
            for (Map.Entry entry : p02.b()) {
                n3.h(entry);
            }
        }
    }

    public static void c(W0 w0, Object obj, Object obj2) {
        w0.getClass();
        AbstractC0168a0 abstractC0168a0 = (AbstractC0168a0) obj;
        V0 v02 = abstractC0168a0.zzc;
        V0 v03 = ((AbstractC0168a0) obj2).zzc;
        V0 v04 = V0.f2856f;
        if (!v04.equals(v03)) {
            if (v04.equals(v02)) {
                int r02 = v02.f2857a + v03.f2857a;
                int[] copyOf = Arrays.copyOf(v02.f2858b, r02);
                System.arraycopy(v03.f2858b, 0, copyOf, v02.f2857a, v03.f2857a);
                Object[] copyOf2 = Arrays.copyOf(v02.f2859c, r02);
                System.arraycopy(v03.f2859c, 0, copyOf2, v02.f2857a, v03.f2857a);
                v02 = new V0(r02, copyOf, copyOf2, true);
            } else {
                v02.getClass();
                if (!v03.equals(v04)) {
                    if (v02.f2861e) {
                        int r03 = v02.f2857a + v03.f2857a;
                        v02.e(r03);
                        System.arraycopy(v03.f2858b, 0, v02.f2858b, v02.f2857a, v03.f2857a);
                        System.arraycopy(v03.f2859c, 0, v02.f2859c, v02.f2857a, v03.f2857a);
                        v02.f2857a = r03;
                    } else {
                        throw new UnsupportedOperationException();
                    }
                }
            }
        }
        abstractC0168a0.zzc = v02;
    }

    public static void d(int r22, List list, C0220v0 c0220v0, boolean z3) {
        if (list != null && !list.isEmpty()) {
            M m3 = (M) c0220v0.f2985a;
            int r02 = 0;
            if (z3) {
                m3.D(r22, 2);
                int r5 = 0;
                for (int r23 = 0; r23 < list.size(); r23++) {
                    ((Boolean) list.get(r23)).getClass();
                    r5++;
                }
                m3.F(r5);
                while (r02 < list.size()) {
                    m3.v(((Boolean) list.get(r02)).booleanValue() ? (byte) 1 : (byte) 0);
                    r02++;
                }
                return;
            }
            while (r02 < list.size()) {
                boolean booleanValue = ((Boolean) list.get(r02)).booleanValue();
                m3.F(r22 << 3);
                m3.v(booleanValue ? (byte) 1 : (byte) 0);
                r02++;
            }
        }
    }

    public static void e(int r3, List list, C0220v0 c0220v0) {
        if (list != null && !list.isEmpty()) {
            c0220v0.getClass();
            for (int r02 = 0; r02 < list.size(); r02++) {
                ((M) c0220v0.f2985a).x(r3, (L) list.get(r02));
            }
        }
    }

    public static void f(int r3, List list, C0220v0 c0220v0, boolean z3) {
        if (list != null && !list.isEmpty()) {
            M m3 = (M) c0220v0.f2985a;
            int r02 = 0;
            if (z3) {
                m3.D(r3, 2);
                int r6 = 0;
                for (int r32 = 0; r32 < list.size(); r32++) {
                    ((Double) list.get(r32)).getClass();
                    r6 += 8;
                }
                m3.F(r6);
                while (r02 < list.size()) {
                    m3.B(Double.doubleToRawLongBits(((Double) list.get(r02)).doubleValue()));
                    r02++;
                }
                return;
            }
            while (r02 < list.size()) {
                m3.A(Double.doubleToRawLongBits(((Double) list.get(r02)).doubleValue()), r3);
                r02++;
            }
        }
    }

    public static void g(int r3, List list, C0220v0 c0220v0, boolean z3) {
        if (list != null && !list.isEmpty()) {
            M m3 = (M) c0220v0.f2985a;
            int r02 = 0;
            if (z3) {
                m3.D(r3, 2);
                int r6 = 0;
                for (int r32 = 0; r32 < list.size(); r32++) {
                    r6 += M.J(((Integer) list.get(r32)).intValue());
                }
                m3.F(r6);
                while (r02 < list.size()) {
                    int intValue = ((Integer) list.get(r02)).intValue();
                    if (intValue >= 0) {
                        m3.F(intValue);
                    } else {
                        m3.H(intValue);
                    }
                    r02++;
                }
                return;
            }
            while (r02 < list.size()) {
                int intValue2 = ((Integer) list.get(r02)).intValue();
                m3.F(r3 << 3);
                if (intValue2 >= 0) {
                    m3.F(intValue2);
                } else {
                    m3.H(intValue2);
                }
                r02++;
            }
        }
    }

    public static void h(int r22, List list, C0220v0 c0220v0, boolean z3) {
        if (list != null && !list.isEmpty()) {
            M m3 = (M) c0220v0.f2985a;
            int r02 = 0;
            if (z3) {
                m3.D(r22, 2);
                int r5 = 0;
                for (int r23 = 0; r23 < list.size(); r23++) {
                    ((Integer) list.get(r23)).getClass();
                    r5 += 4;
                }
                m3.F(r5);
                while (r02 < list.size()) {
                    m3.z(((Integer) list.get(r02)).intValue());
                    r02++;
                }
                return;
            }
            while (r02 < list.size()) {
                m3.y(r22, ((Integer) list.get(r02)).intValue());
                r02++;
            }
        }
    }

    public static void i(int r3, List list, C0220v0 c0220v0, boolean z3) {
        if (list != null && !list.isEmpty()) {
            M m3 = (M) c0220v0.f2985a;
            int r02 = 0;
            if (z3) {
                m3.D(r3, 2);
                int r6 = 0;
                for (int r32 = 0; r32 < list.size(); r32++) {
                    ((Long) list.get(r32)).getClass();
                    r6 += 8;
                }
                m3.F(r6);
                while (r02 < list.size()) {
                    m3.B(((Long) list.get(r02)).longValue());
                    r02++;
                }
                return;
            }
            while (r02 < list.size()) {
                m3.A(((Long) list.get(r02)).longValue(), r3);
                r02++;
            }
        }
    }

    public static void j(int r22, List list, C0220v0 c0220v0, boolean z3) {
        if (list != null && !list.isEmpty()) {
            M m3 = (M) c0220v0.f2985a;
            int r02 = 0;
            if (z3) {
                m3.D(r22, 2);
                int r5 = 0;
                for (int r23 = 0; r23 < list.size(); r23++) {
                    ((Float) list.get(r23)).getClass();
                    r5 += 4;
                }
                m3.F(r5);
                while (r02 < list.size()) {
                    m3.z(Float.floatToRawIntBits(((Float) list.get(r02)).floatValue()));
                    r02++;
                }
                return;
            }
            while (r02 < list.size()) {
                m3.y(r22, Float.floatToRawIntBits(((Float) list.get(r02)).floatValue()));
                r02++;
            }
        }
    }

    public static void k(int r22, List list, C0220v0 c0220v0, N0 n02) {
        if (list != null && !list.isEmpty()) {
            for (int r02 = 0; r02 < list.size(); r02++) {
                c0220v0.m(r22, list.get(r02), n02);
            }
        }
    }

    public static void l(int r3, List list, C0220v0 c0220v0, boolean z3) {
        if (list != null && !list.isEmpty()) {
            M m3 = (M) c0220v0.f2985a;
            int r02 = 0;
            if (z3) {
                m3.D(r3, 2);
                int r6 = 0;
                for (int r32 = 0; r32 < list.size(); r32++) {
                    r6 += M.J(((Integer) list.get(r32)).intValue());
                }
                m3.F(r6);
                while (r02 < list.size()) {
                    int intValue = ((Integer) list.get(r02)).intValue();
                    if (intValue >= 0) {
                        m3.F(intValue);
                    } else {
                        m3.H(intValue);
                    }
                    r02++;
                }
                return;
            }
            while (r02 < list.size()) {
                int intValue2 = ((Integer) list.get(r02)).intValue();
                m3.F(r3 << 3);
                if (intValue2 >= 0) {
                    m3.F(intValue2);
                } else {
                    m3.H(intValue2);
                }
                r02++;
            }
        }
    }

    public static void m(int r3, List list, C0220v0 c0220v0, boolean z3) {
        if (list != null && !list.isEmpty()) {
            M m3 = (M) c0220v0.f2985a;
            int r02 = 0;
            if (z3) {
                m3.D(r3, 2);
                int r6 = 0;
                for (int r32 = 0; r32 < list.size(); r32++) {
                    r6 += M.M(((Long) list.get(r32)).longValue());
                }
                m3.F(r6);
                while (r02 < list.size()) {
                    m3.H(((Long) list.get(r02)).longValue());
                    r02++;
                }
                return;
            }
            while (r02 < list.size()) {
                m3.G(((Long) list.get(r02)).longValue(), r3);
                r02++;
            }
        }
    }

    public static void n(int r22, List list, C0220v0 c0220v0, N0 n02) {
        if (list != null && !list.isEmpty()) {
            for (int r02 = 0; r02 < list.size(); r02++) {
                c0220v0.p(r22, list.get(r02), n02);
            }
        }
    }

    public static void o(int r22, List list, C0220v0 c0220v0, boolean z3) {
        if (list != null && !list.isEmpty()) {
            M m3 = (M) c0220v0.f2985a;
            int r02 = 0;
            if (z3) {
                m3.D(r22, 2);
                int r5 = 0;
                for (int r23 = 0; r23 < list.size(); r23++) {
                    ((Integer) list.get(r23)).getClass();
                    r5 += 4;
                }
                m3.F(r5);
                while (r02 < list.size()) {
                    m3.z(((Integer) list.get(r02)).intValue());
                    r02++;
                }
                return;
            }
            while (r02 < list.size()) {
                m3.y(r22, ((Integer) list.get(r02)).intValue());
                r02++;
            }
        }
    }

    public static void p(int r3, List list, C0220v0 c0220v0, boolean z3) {
        if (list != null && !list.isEmpty()) {
            M m3 = (M) c0220v0.f2985a;
            int r02 = 0;
            if (z3) {
                m3.D(r3, 2);
                int r6 = 0;
                for (int r32 = 0; r32 < list.size(); r32++) {
                    ((Long) list.get(r32)).getClass();
                    r6 += 8;
                }
                m3.F(r6);
                while (r02 < list.size()) {
                    m3.B(((Long) list.get(r02)).longValue());
                    r02++;
                }
                return;
            }
            while (r02 < list.size()) {
                m3.A(((Long) list.get(r02)).longValue(), r3);
                r02++;
            }
        }
    }

    public static void q(int r3, List list, C0220v0 c0220v0, boolean z3) {
        if (list != null && !list.isEmpty()) {
            M m3 = (M) c0220v0.f2985a;
            int r02 = 0;
            if (z3) {
                m3.D(r3, 2);
                int r6 = 0;
                for (int r32 = 0; r32 < list.size(); r32++) {
                    int intValue = ((Integer) list.get(r32)).intValue();
                    r6 += M.L((intValue >> 31) ^ (intValue + intValue));
                }
                m3.F(r6);
                while (r02 < list.size()) {
                    int intValue2 = ((Integer) list.get(r02)).intValue();
                    m3.F((intValue2 >> 31) ^ (intValue2 + intValue2));
                    r02++;
                }
                return;
            }
            while (r02 < list.size()) {
                int intValue3 = ((Integer) list.get(r02)).intValue();
                m3.E(r3, (intValue3 >> 31) ^ (intValue3 + intValue3));
                r02++;
            }
        }
    }

    public static void r(int r6, List list, C0220v0 c0220v0, boolean z3) {
        if (list != null && !list.isEmpty()) {
            M m3 = (M) c0220v0.f2985a;
            int r12 = 0;
            if (z3) {
                m3.D(r6, 2);
                int r9 = 0;
                for (int r62 = 0; r62 < list.size(); r62++) {
                    long longValue = ((Long) list.get(r62)).longValue();
                    r9 += M.M((longValue >> 63) ^ (longValue + longValue));
                }
                m3.F(r9);
                while (r12 < list.size()) {
                    long longValue2 = ((Long) list.get(r12)).longValue();
                    m3.H((longValue2 >> 63) ^ (longValue2 + longValue2));
                    r12++;
                }
                return;
            }
            while (r12 < list.size()) {
                long longValue3 = ((Long) list.get(r12)).longValue();
                m3.G((longValue3 >> 63) ^ (longValue3 + longValue3), r6);
                r12++;
            }
        }
    }

    public static void s(int r4, List list, C0220v0 c0220v0) {
        if (list != null && !list.isEmpty()) {
            c0220v0.getClass();
            boolean z3 = list instanceof InterfaceC0207o0;
            int r12 = 0;
            M m3 = (M) c0220v0.f2985a;
            if (z3) {
                InterfaceC0207o0 interfaceC0207o0 = (InterfaceC0207o0) list;
                while (r12 < list.size()) {
                    Object g = interfaceC0207o0.g(r12);
                    if (g instanceof String) {
                        m3.C((String) g, r4);
                    } else {
                        m3.x(r4, (L) g);
                    }
                    r12++;
                }
                return;
            }
            while (r12 < list.size()) {
                m3.C((String) list.get(r12), r4);
                r12++;
            }
        }
    }

    public static void t(int r22, List list, C0220v0 c0220v0, boolean z3) {
        if (list != null && !list.isEmpty()) {
            M m3 = (M) c0220v0.f2985a;
            int r02 = 0;
            if (z3) {
                m3.D(r22, 2);
                int r5 = 0;
                for (int r23 = 0; r23 < list.size(); r23++) {
                    r5 += M.L(((Integer) list.get(r23)).intValue());
                }
                m3.F(r5);
                while (r02 < list.size()) {
                    m3.F(((Integer) list.get(r02)).intValue());
                    r02++;
                }
                return;
            }
            while (r02 < list.size()) {
                m3.E(r22, ((Integer) list.get(r02)).intValue());
                r02++;
            }
        }
    }

    public static void u(int r3, List list, C0220v0 c0220v0, boolean z3) {
        if (list != null && !list.isEmpty()) {
            M m3 = (M) c0220v0.f2985a;
            int r02 = 0;
            if (z3) {
                m3.D(r3, 2);
                int r6 = 0;
                for (int r32 = 0; r32 < list.size(); r32++) {
                    r6 += M.M(((Long) list.get(r32)).longValue());
                }
                m3.F(r6);
                while (r02 < list.size()) {
                    m3.H(((Long) list.get(r02)).longValue());
                    r02++;
                }
                return;
            }
            while (r02 < list.size()) {
                m3.G(((Long) list.get(r02)).longValue(), r3);
                r02++;
            }
        }
    }

    public static boolean v(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static int w(int r02, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (M.L(r02 << 3) + 1) * size;
    }

    public static int x(int r22, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int L3 = M.L(r22 << 3) * size;
        for (int r12 = 0; r12 < list.size(); r12++) {
            int j3 = ((L) list.get(r12)).j();
            L3 = D.C.r(j3, j3, L3);
        }
        return L3;
    }

    public static int y(int r12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (M.L(r12 << 3) * size) + z(list);
    }

    public static int z(List list) {
        int r22;
        int size = list.size();
        int r12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0171b0) {
            C0171b0 c0171b0 = (C0171b0) list;
            r22 = 0;
            while (r12 < size) {
                c0171b0.j(r12);
                r22 += M.J(c0171b0.f2872K[r12]);
                r12++;
            }
        } else {
            r22 = 0;
            while (r12 < size) {
                r22 += M.J(((Integer) list.get(r12)).intValue());
                r12++;
            }
        }
        return r22;
    }
}
