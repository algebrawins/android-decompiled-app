package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class C0 implements N0 {

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f2768n = new int[0];

    /* renamed from: o  reason: collision with root package name */
    public static final Unsafe f2769o = AbstractC0181e1.j();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f2770a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f2771b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2772c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2773d;

    /* renamed from: e  reason: collision with root package name */
    public final D f2774e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f2775f;
    public final int[] g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2776h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2777i;

    /* renamed from: j  reason: collision with root package name */
    public final AbstractC0214s0 f2778j;

    /* renamed from: k  reason: collision with root package name */
    public final W0 f2779k;

    /* renamed from: l  reason: collision with root package name */
    public final P f2780l;

    /* renamed from: m  reason: collision with root package name */
    public final int f2781m;

    public C0(int[] r12, Object[] objArr, int r3, int r4, D d4, int r6, int[] r7, int r8, int r9, AbstractC0214s0 abstractC0214s0, W0 w0, P p2) {
        this.f2770a = r12;
        this.f2771b = objArr;
        this.f2772c = r3;
        this.f2773d = r4;
        this.f2781m = r6;
        boolean z3 = false;
        if (p2 != null && (d4 instanceof X)) {
            z3 = true;
        }
        this.f2775f = z3;
        this.g = r7;
        this.f2776h = r8;
        this.f2777i = r9;
        this.f2778j = abstractC0214s0;
        this.f2779k = w0;
        this.f2780l = p2;
        this.f2774e = d4;
    }

    public static V0 B(Object obj) {
        AbstractC0168a0 abstractC0168a0 = (AbstractC0168a0) obj;
        V0 v02 = abstractC0168a0.zzc;
        if (v02 == V0.f2856f) {
            V0 b3 = V0.b();
            abstractC0168a0.zzc = b3;
            return b3;
        }
        return v02;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0279  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.mlkit_vision_barcode_bundled.C0 C(com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0 r32, com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0214s0 r33, com.google.android.gms.internal.mlkit_vision_barcode_bundled.W0 r34, com.google.android.gms.internal.mlkit_vision_barcode_bundled.P r35) {
        /*
            Method dump skipped, instructions count: 1011
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.C0.C(com.google.android.gms.internal.mlkit_vision_barcode_bundled.J0, com.google.android.gms.internal.mlkit_vision_barcode_bundled.s0, com.google.android.gms.internal.mlkit_vision_barcode_bundled.W0, com.google.android.gms.internal.mlkit_vision_barcode_bundled.P):com.google.android.gms.internal.mlkit_vision_barcode_bundled.C0");
    }

    public static int E(long j3, Object obj) {
        return ((Integer) AbstractC0181e1.i(j3, obj)).intValue();
    }

    public static int J(int r02) {
        return (r02 >>> 20) & 255;
    }

    public static long L(long j3, Object obj) {
        return ((Long) AbstractC0181e1.i(j3, obj)).longValue();
    }

    public static Field o(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static void p(Object obj) {
        if (x(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    public static boolean x(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0168a0) {
            return ((AbstractC0168a0) obj).k();
        }
        return true;
    }

    public static final void z(int r12, Object obj, C0220v0 c0220v0) {
        if (obj instanceof String) {
            ((M) c0220v0.f2985a).C((String) obj, r12);
            return;
        }
        c0220v0.g(r12, (L) obj);
    }

    public final int A(Object obj, byte[] bArr, int r37, int r38, int r39, G g) {
        int[] r26;
        Unsafe unsafe;
        int r7;
        Object obj2;
        C0 c02;
        int r3;
        int r02;
        int r8;
        int r21;
        int r22;
        int r23;
        boolean z3;
        int r15;
        int r372;
        Object obj3;
        int r10;
        Object obj4;
        int r232;
        long j3;
        int r72;
        int r13;
        int r6;
        int r11;
        int r373;
        int r132;
        int q3;
        int r24;
        C0 c03 = this;
        Object obj5 = obj;
        byte[] bArr2 = bArr;
        int r133 = r38;
        int r112 = r39;
        G g3 = g;
        p(obj);
        Unsafe unsafe2 = f2769o;
        int r03 = r37;
        int r12 = -1;
        int r25 = 0;
        int r32 = 0;
        int r4 = 0;
        int r5 = 1048575;
        while (true) {
            int[] r62 = c03.f2770a;
            Object obj6 = null;
            if (r03 < r133) {
                int r33 = r03 + 1;
                byte b3 = bArr2[r03];
                if (b3 < 0) {
                    r02 = S0.o(b3, bArr2, r33, g3);
                    r3 = g3.f2789a;
                } else {
                    r3 = b3;
                    r02 = r33;
                }
                int r73 = r3 >>> 3;
                int r82 = c03.f2773d;
                int r374 = r02;
                int r04 = c03.f2772c;
                if (r73 > r12) {
                    r25 = (r73 < r04 || r73 > r82) ? -1 : c03.I(r73, r25 / 3);
                } else {
                    r25 = (r73 < r04 || r73 > r82) ? -1 : c03.I(r73, 0);
                }
                if (r25 == -1) {
                    r8 = r3;
                    r21 = r4;
                    r22 = r5;
                    r26 = r62;
                    unsafe = unsafe2;
                    c02 = c03;
                    r23 = 0;
                    z3 = true;
                    r15 = r374;
                    r372 = r73;
                    r7 = r39;
                } else {
                    int r83 = r3 & 7;
                    int r113 = r62[r25 + 1];
                    int J3 = J(r113);
                    long j4 = r113 & 1048575;
                    int r242 = r3;
                    if (J3 <= 17) {
                        int r05 = r62[r25 + 2];
                        int r252 = 1 << (r05 >>> 20);
                        r26 = r62;
                        int r06 = r05 & 1048575;
                        r232 = r73;
                        if (r06 != r5) {
                            if (r5 != 1048575) {
                                j3 = j4;
                                obj5 = obj;
                                unsafe2.putInt(obj5, r5, r4);
                            } else {
                                j3 = j4;
                                obj5 = obj;
                            }
                            r13 = r06;
                            r72 = unsafe2.getInt(obj5, r06);
                        } else {
                            j3 = j4;
                            obj5 = obj;
                            r72 = r4;
                            r13 = r5;
                        }
                        switch (J3) {
                            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                                r6 = r374;
                                r11 = r25;
                                r373 = r13;
                                r132 = r242;
                                long j5 = j3;
                                if (r83 == 1) {
                                    AbstractC0181e1.l(obj5, j5, Double.longBitsToDouble(S0.u(bArr2, r6)));
                                    r03 = r6 + 8;
                                    r4 = r72 | r252;
                                    r5 = r373;
                                    r25 = r11;
                                    r32 = r132;
                                    r12 = r232;
                                    r133 = r38;
                                    r112 = r39;
                                    break;
                                } else {
                                    r22 = r373;
                                    r21 = r72;
                                    unsafe = unsafe2;
                                    r8 = r132;
                                    c02 = c03;
                                    r372 = r232;
                                    z3 = true;
                                    r7 = r39;
                                    r15 = r6;
                                    r23 = r11;
                                    break;
                                }
                            case 1:
                                r6 = r374;
                                r11 = r25;
                                r373 = r13;
                                r132 = r242;
                                long j6 = j3;
                                if (r83 == 5) {
                                    AbstractC0181e1.m(obj5, j6, Float.intBitsToFloat(S0.d(bArr2, r6)));
                                    r03 = r6 + 4;
                                    r4 = r72 | r252;
                                    r5 = r373;
                                    r25 = r11;
                                    r32 = r132;
                                    r12 = r232;
                                    r133 = r38;
                                    r112 = r39;
                                    break;
                                } else {
                                    r22 = r373;
                                    r21 = r72;
                                    unsafe = unsafe2;
                                    r8 = r132;
                                    c02 = c03;
                                    r372 = r232;
                                    z3 = true;
                                    r7 = r39;
                                    r15 = r6;
                                    r23 = r11;
                                    break;
                                }
                            case 2:
                            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                                r6 = r374;
                                r11 = r25;
                                r373 = r13;
                                r132 = r242;
                                long j7 = j3;
                                if (r83 == 0) {
                                    q3 = S0.q(bArr2, r6, g3);
                                    unsafe2.putLong(obj, j7, g3.f2790b);
                                    r4 = r72 | r252;
                                    r5 = r373;
                                    r03 = q3;
                                    r25 = r11;
                                    r32 = r132;
                                    r12 = r232;
                                    r133 = r38;
                                    r112 = r39;
                                    break;
                                } else {
                                    r22 = r373;
                                    r21 = r72;
                                    unsafe = unsafe2;
                                    r8 = r132;
                                    c02 = c03;
                                    r372 = r232;
                                    z3 = true;
                                    r7 = r39;
                                    r15 = r6;
                                    r23 = r11;
                                    break;
                                }
                            case 4:
                            case 11:
                                r6 = r374;
                                r11 = r25;
                                r373 = r13;
                                r132 = r242;
                                long j8 = j3;
                                if (r83 == 0) {
                                    r03 = S0.n(bArr2, r6, g3);
                                    unsafe2.putInt(obj5, j8, g3.f2789a);
                                    r4 = r72 | r252;
                                    r5 = r373;
                                    r25 = r11;
                                    r32 = r132;
                                    r12 = r232;
                                    r133 = r38;
                                    r112 = r39;
                                    break;
                                } else {
                                    r22 = r373;
                                    r21 = r72;
                                    unsafe = unsafe2;
                                    r8 = r132;
                                    c02 = c03;
                                    r372 = r232;
                                    z3 = true;
                                    r7 = r39;
                                    r15 = r6;
                                    r23 = r11;
                                    break;
                                }
                            case q0.k.STRING_FIELD_NUMBER /* 5 */:
                            case 14:
                                r6 = r374;
                                r373 = r13;
                                r132 = r242;
                                long j9 = j3;
                                if (r83 == 1) {
                                    r11 = r25;
                                    unsafe2.putLong(obj, j9, S0.u(bArr2, r6));
                                    r03 = r6 + 8;
                                    r4 = r72 | r252;
                                    r5 = r373;
                                    r25 = r11;
                                    r32 = r132;
                                    r12 = r232;
                                    r133 = r38;
                                    r112 = r39;
                                    break;
                                } else {
                                    r11 = r25;
                                    r22 = r373;
                                    r21 = r72;
                                    unsafe = unsafe2;
                                    r8 = r132;
                                    c02 = c03;
                                    r372 = r232;
                                    z3 = true;
                                    r7 = r39;
                                    r15 = r6;
                                    r23 = r11;
                                    break;
                                }
                            case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            case 13:
                                r6 = r374;
                                r373 = r13;
                                r132 = r242;
                                long j10 = j3;
                                if (r83 == 5) {
                                    unsafe2.putInt(obj5, j10, S0.d(bArr2, r6));
                                    r03 = r6 + 4;
                                    r4 = r72 | r252;
                                    r5 = r373;
                                    r112 = r39;
                                    r32 = r132;
                                    r12 = r232;
                                    r133 = r38;
                                    break;
                                } else {
                                    r11 = r25;
                                    r22 = r373;
                                    r21 = r72;
                                    unsafe = unsafe2;
                                    r8 = r132;
                                    c02 = c03;
                                    r372 = r232;
                                    z3 = true;
                                    r7 = r39;
                                    r15 = r6;
                                    r23 = r11;
                                    break;
                                }
                            case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                                r6 = r374;
                                r373 = r13;
                                r132 = r242;
                                long j11 = j3;
                                if (r83 == 0) {
                                    int q4 = S0.q(bArr2, r6, g3);
                                    AbstractC0181e1.k(obj5, j11, g3.f2790b != 0);
                                    r4 = r72 | r252;
                                    r5 = r373;
                                    r112 = r39;
                                    r03 = q4;
                                    r32 = r132;
                                    r12 = r232;
                                    r133 = r38;
                                    break;
                                } else {
                                    r11 = r25;
                                    r22 = r373;
                                    r21 = r72;
                                    unsafe = unsafe2;
                                    r8 = r132;
                                    c02 = c03;
                                    r372 = r232;
                                    z3 = true;
                                    r7 = r39;
                                    r15 = r6;
                                    r23 = r11;
                                    break;
                                }
                            case 8:
                                r6 = r374;
                                r373 = r13;
                                r132 = r242;
                                long j12 = j3;
                                if (r83 == 2) {
                                    if ((536870912 & r113) == 0) {
                                        r03 = S0.k(bArr2, r6, g3);
                                    } else {
                                        r03 = S0.l(bArr2, r6, g3);
                                    }
                                    unsafe2.putObject(obj5, j12, g3.f2791c);
                                    r4 = r72 | r252;
                                    r5 = r373;
                                    r112 = r39;
                                    r32 = r132;
                                    r12 = r232;
                                    r133 = r38;
                                    break;
                                } else {
                                    r11 = r25;
                                    r22 = r373;
                                    r21 = r72;
                                    unsafe = unsafe2;
                                    r8 = r132;
                                    c02 = c03;
                                    r372 = r232;
                                    z3 = true;
                                    r7 = r39;
                                    r15 = r6;
                                    r23 = r11;
                                    break;
                                }
                            case 9:
                                r6 = r374;
                                r11 = r25;
                                r373 = r13;
                                r132 = r242;
                                if (r83 == 2) {
                                    Object m3 = c03.m(r11, obj5);
                                    r03 = S0.s(m3, c03.k(r11), bArr, r6, r38, g);
                                    c03.t(r11, obj5, m3);
                                    r4 = r72 | r252;
                                    r5 = r373;
                                    r25 = r11;
                                    r32 = r132;
                                    r12 = r232;
                                    r133 = r38;
                                    r112 = r39;
                                    break;
                                } else {
                                    r22 = r373;
                                    r21 = r72;
                                    unsafe = unsafe2;
                                    r8 = r132;
                                    c02 = c03;
                                    r372 = r232;
                                    z3 = true;
                                    r7 = r39;
                                    r15 = r6;
                                    r23 = r11;
                                    break;
                                }
                            case 10:
                                r6 = r374;
                                r11 = r25;
                                r373 = r13;
                                r132 = r242;
                                long j13 = j3;
                                if (r83 == 2) {
                                    r03 = S0.a(bArr2, r6, g3);
                                    unsafe2.putObject(obj5, j13, g3.f2791c);
                                    r4 = r72 | r252;
                                    r5 = r373;
                                    r25 = r11;
                                    r32 = r132;
                                    r12 = r232;
                                    r133 = r38;
                                    r112 = r39;
                                    break;
                                } else {
                                    r22 = r373;
                                    r21 = r72;
                                    unsafe = unsafe2;
                                    r8 = r132;
                                    c02 = c03;
                                    r372 = r232;
                                    z3 = true;
                                    r7 = r39;
                                    r15 = r6;
                                    r23 = r11;
                                    break;
                                }
                            case 12:
                                r6 = r374;
                                r11 = r25;
                                r373 = r13;
                                r132 = r242;
                                long j14 = j3;
                                if (r83 == 0) {
                                    r03 = S0.n(bArr2, r6, g3);
                                    int r14 = g3.f2789a;
                                    InterfaceC0180e0 j15 = c03.j(r11);
                                    if (j15 != null && !j15.a(r14)) {
                                        B(obj).c(r132, Long.valueOf(r14));
                                        r5 = r373;
                                        r4 = r72;
                                        r25 = r11;
                                        r32 = r132;
                                        r12 = r232;
                                        r133 = r38;
                                        r112 = r39;
                                    } else {
                                        unsafe2.putInt(obj5, j14, r14);
                                        r4 = r72 | r252;
                                        r5 = r373;
                                        r25 = r11;
                                        r32 = r132;
                                        r12 = r232;
                                        r133 = r38;
                                        r112 = r39;
                                        break;
                                    }
                                } else {
                                    r22 = r373;
                                    r21 = r72;
                                    unsafe = unsafe2;
                                    r8 = r132;
                                    c02 = c03;
                                    r372 = r232;
                                    z3 = true;
                                    r7 = r39;
                                    r15 = r6;
                                    r23 = r11;
                                    break;
                                }
                                break;
                            case 15:
                                r6 = r374;
                                r11 = r25;
                                r373 = r13;
                                r132 = r242;
                                if (r83 == 0) {
                                    r03 = S0.n(bArr2, r6, g3);
                                    unsafe2.putInt(obj5, j3, S0.c(g3.f2789a));
                                    r4 = r72 | r252;
                                    r5 = r373;
                                    r25 = r11;
                                    r32 = r132;
                                    r12 = r232;
                                    r133 = r38;
                                    r112 = r39;
                                    break;
                                } else {
                                    r22 = r373;
                                    r21 = r72;
                                    unsafe = unsafe2;
                                    r8 = r132;
                                    c02 = c03;
                                    r372 = r232;
                                    z3 = true;
                                    r7 = r39;
                                    r15 = r6;
                                    r23 = r11;
                                    break;
                                }
                            case 16:
                                r6 = r374;
                                r11 = r25;
                                r373 = r13;
                                r132 = r242;
                                if (r83 == 0) {
                                    q3 = S0.q(bArr2, r6, g3);
                                    unsafe2.putLong(obj, j3, S0.f(g3.f2790b));
                                    r4 = r72 | r252;
                                    r5 = r373;
                                    r03 = q3;
                                    r25 = r11;
                                    r32 = r132;
                                    r12 = r232;
                                    r133 = r38;
                                    r112 = r39;
                                    break;
                                } else {
                                    r22 = r373;
                                    r21 = r72;
                                    unsafe = unsafe2;
                                    r8 = r132;
                                    c02 = c03;
                                    r372 = r232;
                                    z3 = true;
                                    r7 = r39;
                                    r15 = r6;
                                    r23 = r11;
                                    break;
                                }
                            default:
                                if (r83 == 3) {
                                    Object m4 = c03.m(r25, obj5);
                                    r11 = r25;
                                    r373 = r13;
                                    r132 = r242;
                                    r03 = S0.r(m4, c03.k(r25), bArr, r374, r38, (r232 << 3) | 4, g);
                                    c03.t(r11, obj5, m4);
                                    r4 = r72 | r252;
                                    r5 = r373;
                                    r25 = r11;
                                    r32 = r132;
                                    r12 = r232;
                                    r133 = r38;
                                    r112 = r39;
                                    break;
                                } else {
                                    r6 = r374;
                                    r373 = r13;
                                    r132 = r242;
                                    r11 = r25;
                                    r22 = r373;
                                    r21 = r72;
                                    unsafe = unsafe2;
                                    r8 = r132;
                                    c02 = c03;
                                    r372 = r232;
                                    z3 = true;
                                    r7 = r39;
                                    r15 = r6;
                                    r23 = r11;
                                    break;
                                }
                        }
                    } else {
                        r26 = r62;
                        r232 = r73;
                        obj5 = obj;
                        int r74 = r25;
                        if (J3 != 27) {
                            r21 = r4;
                            r22 = r5;
                            if (J3 <= 49) {
                                z3 = true;
                                r372 = r232;
                                r23 = r74;
                                unsafe = unsafe2;
                                r24 = r242;
                                r03 = H(obj, bArr, r374, r38, r242, r232, r83, r23, r113, J3, j4, g);
                                if (r03 != r374) {
                                    c03 = this;
                                    obj5 = obj;
                                    bArr2 = bArr;
                                    r12 = r372;
                                    r133 = r38;
                                    r112 = r39;
                                    g3 = g;
                                    r4 = r21;
                                    r5 = r22;
                                    r25 = r23;
                                    r32 = r24;
                                    unsafe2 = unsafe;
                                } else {
                                    c02 = this;
                                    r7 = r39;
                                    r15 = r03;
                                }
                            } else {
                                r15 = r374;
                                unsafe = unsafe2;
                                r24 = r242;
                                r372 = r232;
                                z3 = true;
                                r23 = r74;
                                if (J3 != 50) {
                                    c02 = this;
                                    r03 = G(obj, bArr, r15, r38, r24, r372, r83, r113, J3, j4, r23, g);
                                    if (r03 != r15) {
                                        bArr2 = bArr;
                                        r12 = r372;
                                        r133 = r38;
                                        r112 = r39;
                                        g3 = g;
                                        c03 = c02;
                                        r4 = r21;
                                        r5 = r22;
                                        r25 = r23;
                                        r32 = r24;
                                        unsafe2 = unsafe;
                                        obj5 = obj;
                                    } else {
                                        r7 = r39;
                                        r15 = r03;
                                    }
                                } else if (r83 == 2) {
                                    F(r23, j4, obj);
                                    throw null;
                                }
                            }
                            r8 = r24;
                        } else if (r83 == 2) {
                            E e4 = (E) ((i0) unsafe2.getObject(obj5, j4));
                            boolean h3 = e4.h();
                            i0 i0Var = e4;
                            if (!h3) {
                                int size = e4.size();
                                i0 b4 = e4.b(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj5, j4, b4);
                                i0Var = b4;
                            }
                            r03 = S0.h(c03.k(r74), r242, bArr, r374, r38, i0Var, g);
                            r112 = r39;
                            r25 = r74;
                            r32 = r242;
                            r4 = r4;
                            r5 = r5;
                            r12 = r232;
                            r133 = r38;
                        } else {
                            r21 = r4;
                            r22 = r5;
                            r15 = r374;
                            unsafe = unsafe2;
                            r24 = r242;
                            r372 = r232;
                            z3 = true;
                            r23 = r74;
                        }
                        c02 = this;
                        r7 = r39;
                        r8 = r24;
                    }
                }
                if (r8 != r7 || r7 == 0) {
                    if (c02.f2775f) {
                        O o3 = O.f2829b;
                        g3 = g;
                        O o4 = g3.f2792d;
                        if (o4 != o3) {
                            r10 = r372;
                            Z a4 = o4.a(c02.f2774e, r10);
                            if (a4 == null) {
                                r03 = S0.m(r8, bArr, r15, r38, B(obj), g);
                                obj3 = obj;
                                bArr2 = bArr;
                            } else {
                                obj3 = obj;
                                X x3 = (X) obj3;
                                x3.n();
                                S s3 = x3.zza;
                                Y y3 = a4.f2869b;
                                EnumC0190h1 enumC0190h1 = y3.f2866K;
                                if (enumC0190h1 != EnumC0190h1.zzn) {
                                    int ordinal = enumC0190h1.ordinal();
                                    AbstractC0168a0 abstractC0168a0 = a4.f2868a;
                                    switch (ordinal) {
                                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                                            bArr2 = bArr;
                                            obj6 = Double.valueOf(Double.longBitsToDouble(S0.u(bArr2, r15)));
                                            r15 += 8;
                                            obj4 = obj6;
                                            s3.f(y3, obj4);
                                            r03 = r15;
                                            break;
                                        case 1:
                                            bArr2 = bArr;
                                            obj6 = Float.valueOf(Float.intBitsToFloat(S0.d(bArr2, r15)));
                                            r15 += 4;
                                            obj4 = obj6;
                                            s3.f(y3, obj4);
                                            r03 = r15;
                                            break;
                                        case 2:
                                        case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                                            bArr2 = bArr;
                                            r15 = S0.q(bArr2, r15, g3);
                                            obj6 = Long.valueOf(g3.f2790b);
                                            obj4 = obj6;
                                            s3.f(y3, obj4);
                                            r03 = r15;
                                            break;
                                        case 4:
                                        case 12:
                                            bArr2 = bArr;
                                            r15 = S0.n(bArr2, r15, g3);
                                            obj6 = Integer.valueOf(g3.f2789a);
                                            obj4 = obj6;
                                            s3.f(y3, obj4);
                                            r03 = r15;
                                            break;
                                        case q0.k.STRING_FIELD_NUMBER /* 5 */:
                                        case 15:
                                            bArr2 = bArr;
                                            obj6 = Long.valueOf(S0.u(bArr2, r15));
                                            r15 += 8;
                                            obj4 = obj6;
                                            s3.f(y3, obj4);
                                            r03 = r15;
                                            break;
                                        case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                                        case 14:
                                            bArr2 = bArr;
                                            obj6 = Integer.valueOf(S0.d(bArr2, r15));
                                            r15 += 4;
                                            obj4 = obj6;
                                            s3.f(y3, obj4);
                                            r03 = r15;
                                            break;
                                        case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                                            bArr2 = bArr;
                                            r15 = S0.q(bArr2, r15, g3);
                                            if (g3.f2790b == 0) {
                                                z3 = false;
                                            }
                                            obj6 = Boolean.valueOf(z3);
                                            obj4 = obj6;
                                            s3.f(y3, obj4);
                                            r03 = r15;
                                            break;
                                        case 8:
                                            bArr2 = bArr;
                                            r15 = S0.k(bArr2, r15, g3);
                                            obj4 = g3.f2791c;
                                            s3.f(y3, obj4);
                                            r03 = r15;
                                            break;
                                        case 9:
                                            bArr2 = bArr;
                                            int r52 = (r10 << 3) | 4;
                                            N0 b5 = H0.a().b(abstractC0168a0.getClass());
                                            Object c4 = s3.c(y3);
                                            if (c4 == null) {
                                                c4 = b5.c();
                                                s3.f(y3, c4);
                                            }
                                            r03 = S0.r(c4, b5, bArr, r15, r38, r52, g);
                                            break;
                                        case 10:
                                            bArr2 = bArr;
                                            N0 b6 = H0.a().b(abstractC0168a0.getClass());
                                            Object c5 = s3.c(y3);
                                            if (c5 == null) {
                                                c5 = b6.c();
                                                s3.f(y3, c5);
                                            }
                                            r03 = S0.s(c5, b6, bArr, r15, r38, g);
                                            break;
                                        case 11:
                                            bArr2 = bArr;
                                            r15 = S0.a(bArr2, r15, g3);
                                            obj4 = g3.f2791c;
                                            s3.f(y3, obj4);
                                            r03 = r15;
                                            break;
                                        case 13:
                                            throw new IllegalStateException("Shouldn't reach here.");
                                        case 16:
                                            bArr2 = bArr;
                                            r15 = S0.n(bArr2, r15, g3);
                                            obj6 = Integer.valueOf(S0.c(g3.f2789a));
                                            obj4 = obj6;
                                            s3.f(y3, obj4);
                                            r03 = r15;
                                            break;
                                        case 17:
                                            bArr2 = bArr;
                                            r15 = S0.q(bArr2, r15, g3);
                                            obj6 = Long.valueOf(S0.f(g3.f2790b));
                                            obj4 = obj6;
                                            s3.f(y3, obj4);
                                            r03 = r15;
                                            break;
                                        default:
                                            bArr2 = bArr;
                                            obj4 = obj6;
                                            s3.f(y3, obj4);
                                            r03 = r15;
                                            break;
                                    }
                                } else {
                                    S0.n(bArr, r15, g3);
                                    throw null;
                                }
                            }
                            r133 = r38;
                            r32 = r8;
                            r12 = r10;
                            c03 = c02;
                            r4 = r21;
                            r5 = r22;
                            r25 = r23;
                            unsafe2 = unsafe;
                            obj5 = obj3;
                            r112 = r7;
                        } else {
                            obj3 = obj;
                            bArr2 = bArr;
                            r10 = r372;
                        }
                    } else {
                        obj3 = obj;
                        bArr2 = bArr;
                        r10 = r372;
                        g3 = g;
                    }
                    r03 = S0.m(r8, bArr, r15, r38, B(obj), g);
                    r133 = r38;
                    r32 = r8;
                    r12 = r10;
                    c03 = c02;
                    r4 = r21;
                    r5 = r22;
                    r25 = r23;
                    unsafe2 = unsafe;
                    obj5 = obj3;
                    r112 = r7;
                } else {
                    obj2 = obj;
                    r32 = r8;
                    r03 = r15;
                    r4 = r21;
                    r5 = r22;
                }
            } else {
                r26 = r62;
                unsafe = unsafe2;
                r7 = r112;
                obj2 = obj5;
                c02 = c03;
            }
        }
        if (r5 != 1048575) {
            unsafe.putInt(obj2, r5, r4);
        }
        for (int r27 = c02.f2776h; r27 < c02.f2777i; r27++) {
            int r42 = c02.g[r27];
            int r53 = r26[r42];
            Object i3 = AbstractC0181e1.i(c02.K(r42) & 1048575, obj2);
            if (i3 != null && c02.j(r42) != null) {
                C0222w0 c0222w0 = (C0222w0) i3;
                D.C.G(c02.l(r42));
                throw null;
            }
        }
        if (r7 == 0) {
            if (r03 != r38) {
                throw C0198l0.c();
            }
        } else if (r03 > r38 || r32 != r7) {
            throw C0198l0.c();
        }
        return r03;
    }

    public final int D(AbstractC0168a0 abstractC0168a0) {
        int r10;
        int J3;
        int L3;
        int M3;
        Unsafe unsafe = f2769o;
        int r5 = 1048575;
        int r6 = 0;
        int r7 = 0;
        int r8 = 1048575;
        int r9 = 0;
        while (true) {
            int[] r102 = this.f2770a;
            if (r6 < r102.length) {
                int K3 = K(r6);
                int r12 = r102[r6];
                int J4 = J(K3);
                if (J4 <= 17) {
                    int r103 = r102[r6 + 2];
                    int r14 = r103 & r5;
                    int r104 = r103 >>> 20;
                    if (r14 != r8) {
                        r9 = unsafe.getInt(abstractC0168a0, r14);
                        r8 = r14;
                    }
                    r10 = 1 << r104;
                } else {
                    r10 = 0;
                }
                long j3 = K3 & r5;
                switch (J4) {
                    case RecognitionOptions.UNRECOGNIZED /* 0 */:
                        if ((r9 & r10) != 0) {
                            r7 = D.C.r(r12 << 3, 8, r7);
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case 1:
                        if ((r9 & r10) != 0) {
                            r7 = D.C.r(r12 << 3, 4, r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case 2:
                        if ((r9 & r10) != 0) {
                            r7 = D.C.r(r12 << 3, M.M(unsafe.getLong(abstractC0168a0, j3)), r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                        if ((r9 & r10) != 0) {
                            r7 = D.C.r(r12 << 3, M.M(unsafe.getLong(abstractC0168a0, j3)), r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case 4:
                        if ((r9 & r10) != 0) {
                            r7 = D.C.r(r12 << 3, M.J(unsafe.getInt(abstractC0168a0, j3)), r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case q0.k.STRING_FIELD_NUMBER /* 5 */:
                        if ((r9 & r10) != 0) {
                            r7 = D.C.r(r12 << 3, 8, r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        if ((r9 & r10) != 0) {
                            r7 = D.C.r(r12 << 3, 4, r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        if ((r9 & r10) != 0) {
                            r7 = D.C.r(r12 << 3, 1, r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case 8:
                        if ((r9 & r10) != 0) {
                            Object object = unsafe.getObject(abstractC0168a0, j3);
                            if (object instanceof L) {
                                Logger logger = M.g;
                                int j4 = ((L) object).j();
                                r7 = D.C.r(r12 << 3, M.L(j4) + j4, r7);
                            } else {
                                r7 = D.C.r(r12 << 3, M.K((String) object), r7);
                            }
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case 9:
                        if ((r9 & r10) != 0) {
                            J3 = O0.J(r12, unsafe.getObject(abstractC0168a0, j3), k(r6));
                            break;
                        } else {
                            continue;
                            r6 += 3;
                            r5 = 1048575;
                        }
                    case 10:
                        if ((r9 & r10) != 0) {
                            Logger logger2 = M.g;
                            int j5 = ((L) unsafe.getObject(abstractC0168a0, j3)).j();
                            r7 = D.C.r(r12 << 3, M.L(j5) + j5, r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case 11:
                        if ((r9 & r10) != 0) {
                            r7 = D.C.r(r12 << 3, M.L(unsafe.getInt(abstractC0168a0, j3)), r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case 12:
                        if ((r9 & r10) != 0) {
                            r7 = D.C.r(r12 << 3, M.J(unsafe.getInt(abstractC0168a0, j3)), r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case 13:
                        if ((r9 & r10) != 0) {
                            r7 = D.C.r(r12 << 3, 4, r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case 14:
                        if ((r9 & r10) != 0) {
                            r7 = D.C.r(r12 << 3, 8, r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case 15:
                        if ((r9 & r10) != 0) {
                            int r4 = unsafe.getInt(abstractC0168a0, j3);
                            r7 = D.C.r((r4 >> 31) ^ (r4 + r4), M.L(r12 << 3), r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case 16:
                        if ((r9 & r10) != 0) {
                            long j6 = unsafe.getLong(abstractC0168a0, j3);
                            L3 = M.L(r12 << 3);
                            M3 = M.M((j6 >> 63) ^ (j6 + j6));
                            J3 = M3 + L3;
                            break;
                        } else {
                            continue;
                            r6 += 3;
                            r5 = 1048575;
                        }
                    case 17:
                        if ((r9 & r10) != 0) {
                            J3 = M.I(r12, (D) unsafe.getObject(abstractC0168a0, j3), k(r6));
                            break;
                        } else {
                            continue;
                            r6 += 3;
                            r5 = 1048575;
                        }
                    case 18:
                        J3 = O0.C(r12, (List) unsafe.getObject(abstractC0168a0, j3));
                        break;
                    case 19:
                        J3 = O0.A(r12, (List) unsafe.getObject(abstractC0168a0, j3));
                        break;
                    case 20:
                        J3 = O0.H(r12, (List) unsafe.getObject(abstractC0168a0, j3));
                        break;
                    case 21:
                        J3 = O0.S(r12, (List) unsafe.getObject(abstractC0168a0, j3));
                        break;
                    case 22:
                        J3 = O0.F(r12, (List) unsafe.getObject(abstractC0168a0, j3));
                        break;
                    case 23:
                        J3 = O0.C(r12, (List) unsafe.getObject(abstractC0168a0, j3));
                        break;
                    case 24:
                        J3 = O0.A(r12, (List) unsafe.getObject(abstractC0168a0, j3));
                        break;
                    case 25:
                        J3 = O0.w(r12, (List) unsafe.getObject(abstractC0168a0, j3));
                        break;
                    case 26:
                        J3 = O0.P(r12, (List) unsafe.getObject(abstractC0168a0, j3));
                        break;
                    case 27:
                        J3 = O0.K(r12, (List) unsafe.getObject(abstractC0168a0, j3), k(r6));
                        break;
                    case 28:
                        J3 = O0.x(r12, (List) unsafe.getObject(abstractC0168a0, j3));
                        break;
                    case 29:
                        J3 = O0.Q(r12, (List) unsafe.getObject(abstractC0168a0, j3));
                        break;
                    case 30:
                        J3 = O0.y(r12, (List) unsafe.getObject(abstractC0168a0, j3));
                        break;
                    case 31:
                        J3 = O0.A(r12, (List) unsafe.getObject(abstractC0168a0, j3));
                        break;
                    case 32:
                        J3 = O0.C(r12, (List) unsafe.getObject(abstractC0168a0, j3));
                        break;
                    case 33:
                        J3 = O0.L(r12, (List) unsafe.getObject(abstractC0168a0, j3));
                        break;
                    case 34:
                        J3 = O0.N(r12, (List) unsafe.getObject(abstractC0168a0, j3));
                        break;
                    case 35:
                        int D3 = O0.D((List) unsafe.getObject(abstractC0168a0, j3));
                        if (D3 > 0) {
                            r7 = D.C.s(r12 << 3, M.L(D3), D3, r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case 36:
                        int B3 = O0.B((List) unsafe.getObject(abstractC0168a0, j3));
                        if (B3 > 0) {
                            r7 = D.C.s(r12 << 3, M.L(B3), B3, r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case 37:
                        int I3 = O0.I((List) unsafe.getObject(abstractC0168a0, j3));
                        if (I3 > 0) {
                            r7 = D.C.s(r12 << 3, M.L(I3), I3, r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case 38:
                        int T3 = O0.T((List) unsafe.getObject(abstractC0168a0, j3));
                        if (T3 > 0) {
                            r7 = D.C.s(r12 << 3, M.L(T3), T3, r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case 39:
                        int G3 = O0.G((List) unsafe.getObject(abstractC0168a0, j3));
                        if (G3 > 0) {
                            r7 = D.C.s(r12 << 3, M.L(G3), G3, r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case 40:
                        int D4 = O0.D((List) unsafe.getObject(abstractC0168a0, j3));
                        if (D4 > 0) {
                            r7 = D.C.s(r12 << 3, M.L(D4), D4, r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case 41:
                        int B4 = O0.B((List) unsafe.getObject(abstractC0168a0, j3));
                        if (B4 > 0) {
                            r7 = D.C.s(r12 << 3, M.L(B4), B4, r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case 42:
                        Class cls = O0.f2831a;
                        int size = ((List) unsafe.getObject(abstractC0168a0, j3)).size();
                        if (size > 0) {
                            r7 = D.C.s(r12 << 3, M.L(size), size, r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case 43:
                        int R3 = O0.R((List) unsafe.getObject(abstractC0168a0, j3));
                        if (R3 > 0) {
                            r7 = D.C.s(r12 << 3, M.L(R3), R3, r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case 44:
                        int z3 = O0.z((List) unsafe.getObject(abstractC0168a0, j3));
                        if (z3 > 0) {
                            r7 = D.C.s(r12 << 3, M.L(z3), z3, r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case 45:
                        int B5 = O0.B((List) unsafe.getObject(abstractC0168a0, j3));
                        if (B5 > 0) {
                            r7 = D.C.s(r12 << 3, M.L(B5), B5, r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case 46:
                        int D5 = O0.D((List) unsafe.getObject(abstractC0168a0, j3));
                        if (D5 > 0) {
                            r7 = D.C.s(r12 << 3, M.L(D5), D5, r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case 47:
                        int M4 = O0.M((List) unsafe.getObject(abstractC0168a0, j3));
                        if (M4 > 0) {
                            r7 = D.C.s(r12 << 3, M.L(M4), M4, r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case 48:
                        int O2 = O0.O((List) unsafe.getObject(abstractC0168a0, j3));
                        if (O2 > 0) {
                            r7 = D.C.s(r12 << 3, M.L(O2), O2, r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case 49:
                        J3 = O0.E(r12, (List) unsafe.getObject(abstractC0168a0, j3), k(r6));
                        break;
                    case 50:
                        C0224x0.a(unsafe.getObject(abstractC0168a0, j3), l(r6));
                        continue;
                        r6 += 3;
                        r5 = 1048575;
                    case 51:
                        if (y(abstractC0168a0, r12, r6)) {
                            r7 = D.C.r(r12 << 3, 8, r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case 52:
                        if (y(abstractC0168a0, r12, r6)) {
                            r7 = D.C.r(r12 << 3, 4, r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case 53:
                        if (y(abstractC0168a0, r12, r6)) {
                            r7 = D.C.r(r12 << 3, M.M(L(j3, abstractC0168a0)), r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case 54:
                        if (y(abstractC0168a0, r12, r6)) {
                            r7 = D.C.r(r12 << 3, M.M(L(j3, abstractC0168a0)), r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case 55:
                        if (y(abstractC0168a0, r12, r6)) {
                            r7 = D.C.r(r12 << 3, M.J(E(j3, abstractC0168a0)), r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case 56:
                        if (y(abstractC0168a0, r12, r6)) {
                            r7 = D.C.r(r12 << 3, 8, r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case 57:
                        if (y(abstractC0168a0, r12, r6)) {
                            r7 = D.C.r(r12 << 3, 4, r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case 58:
                        if (y(abstractC0168a0, r12, r6)) {
                            r7 = D.C.r(r12 << 3, 1, r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case 59:
                        if (y(abstractC0168a0, r12, r6)) {
                            Object object2 = unsafe.getObject(abstractC0168a0, j3);
                            if (object2 instanceof L) {
                                Logger logger3 = M.g;
                                int j7 = ((L) object2).j();
                                r7 = D.C.r(r12 << 3, M.L(j7) + j7, r7);
                            } else {
                                r7 = D.C.r(r12 << 3, M.K((String) object2), r7);
                            }
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case 60:
                        if (y(abstractC0168a0, r12, r6)) {
                            J3 = O0.J(r12, unsafe.getObject(abstractC0168a0, j3), k(r6));
                            break;
                        } else {
                            continue;
                            r6 += 3;
                            r5 = 1048575;
                        }
                    case 61:
                        if (y(abstractC0168a0, r12, r6)) {
                            Logger logger4 = M.g;
                            int j8 = ((L) unsafe.getObject(abstractC0168a0, j3)).j();
                            r7 = D.C.r(r12 << 3, M.L(j8) + j8, r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case 62:
                        if (y(abstractC0168a0, r12, r6)) {
                            r7 = D.C.r(r12 << 3, M.L(E(j3, abstractC0168a0)), r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case 63:
                        if (y(abstractC0168a0, r12, r6)) {
                            r7 = D.C.r(r12 << 3, M.J(E(j3, abstractC0168a0)), r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case RecognitionOptions.EAN_8 /* 64 */:
                        if (y(abstractC0168a0, r12, r6)) {
                            r7 = D.C.r(r12 << 3, 4, r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case 65:
                        if (y(abstractC0168a0, r12, r6)) {
                            r7 = D.C.r(r12 << 3, 8, r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case 66:
                        if (y(abstractC0168a0, r12, r6)) {
                            int E3 = E(j3, abstractC0168a0);
                            r7 = D.C.r((E3 >> 31) ^ (E3 + E3), M.L(r12 << 3), r7);
                        } else {
                            continue;
                        }
                        r6 += 3;
                        r5 = 1048575;
                    case 67:
                        if (y(abstractC0168a0, r12, r6)) {
                            long L4 = L(j3, abstractC0168a0);
                            L3 = M.L(r12 << 3);
                            M3 = M.M((L4 >> 63) ^ (L4 + L4));
                            J3 = M3 + L3;
                            break;
                        } else {
                            continue;
                            r6 += 3;
                            r5 = 1048575;
                        }
                    case 68:
                        if (y(abstractC0168a0, r12, r6)) {
                            J3 = M.I(r12, (D) unsafe.getObject(abstractC0168a0, j3), k(r6));
                            break;
                        } else {
                            continue;
                            r6 += 3;
                            r5 = 1048575;
                        }
                    default:
                        r6 += 3;
                        r5 = 1048575;
                }
                r7 += J3;
                r6 += 3;
                r5 = 1048575;
            } else {
                this.f2779k.getClass();
                int a4 = W0.a(W0.b(abstractC0168a0)) + r7;
                if (this.f2775f) {
                    this.f2780l.getClass();
                    S b3 = P.b(abstractC0168a0);
                    int r42 = 0;
                    int r16 = 0;
                    while (true) {
                        int a5 = b3.f2844a.a();
                        P0 p02 = b3.f2844a;
                        if (r42 < a5) {
                            Map.Entry d4 = p02.d(r42);
                            r16 = S.a((Y) d4.getKey(), d4.getValue()) + r16;
                            r42++;
                        } else {
                            for (Map.Entry entry : p02.b()) {
                                r16 = S.a((Y) entry.getKey(), entry.getValue()) + r16;
                            }
                            return a4 + r16;
                        }
                    }
                } else {
                    return a4;
                }
            }
        }
    }

    public final void F(int r4, long j3, Object obj) {
        Unsafe unsafe = f2769o;
        Object l3 = l(r4);
        Object object = unsafe.getObject(obj, j3);
        if (!((C0222w0) object).d()) {
            C0222w0 b3 = C0222w0.a().b();
            C0224x0.b(b3, object);
            unsafe.putObject(obj, j3, b3);
        }
        D.C.G(l3);
        throw null;
    }

    public final int G(Object obj, byte[] bArr, int r21, int r22, int r23, int r24, int r25, int r26, int r27, long j3, int r30, G g) {
        Unsafe unsafe = f2769o;
        long j4 = this.f2770a[r30 + 2] & 1048575;
        switch (r27) {
            case 51:
                if (r25 == 1) {
                    unsafe.putObject(obj, j3, Double.valueOf(Double.longBitsToDouble(S0.u(bArr, r21))));
                    int r28 = r21 + 8;
                    unsafe.putInt(obj, j4, r24);
                    return r28;
                }
                break;
            case 52:
                if (r25 == 5) {
                    unsafe.putObject(obj, j3, Float.valueOf(Float.intBitsToFloat(S0.d(bArr, r21))));
                    int r29 = r21 + 4;
                    unsafe.putInt(obj, j4, r24);
                    return r29;
                }
                break;
            case 53:
            case 54:
                if (r25 == 0) {
                    int q3 = S0.q(bArr, r21, g);
                    unsafe.putObject(obj, j3, Long.valueOf(g.f2790b));
                    unsafe.putInt(obj, j4, r24);
                    return q3;
                }
                break;
            case 55:
            case 62:
                if (r25 == 0) {
                    int n3 = S0.n(bArr, r21, g);
                    unsafe.putObject(obj, j3, Integer.valueOf(g.f2789a));
                    unsafe.putInt(obj, j4, r24);
                    return n3;
                }
                break;
            case 56:
            case 65:
                if (r25 == 1) {
                    unsafe.putObject(obj, j3, Long.valueOf(S0.u(bArr, r21)));
                    int r210 = r21 + 8;
                    unsafe.putInt(obj, j4, r24);
                    return r210;
                }
                break;
            case 57:
            case RecognitionOptions.EAN_8 /* 64 */:
                if (r25 == 5) {
                    unsafe.putObject(obj, j3, Integer.valueOf(S0.d(bArr, r21)));
                    int r211 = r21 + 4;
                    unsafe.putInt(obj, j4, r24);
                    return r211;
                }
                break;
            case 58:
                if (r25 == 0) {
                    int q4 = S0.q(bArr, r21, g);
                    unsafe.putObject(obj, j3, Boolean.valueOf(g.f2790b != 0));
                    unsafe.putInt(obj, j4, r24);
                    return q4;
                }
                break;
            case 59:
                if (r25 == 2) {
                    int n4 = S0.n(bArr, r21, g);
                    int r3 = g.f2789a;
                    if (r3 == 0) {
                        unsafe.putObject(obj, j3, "");
                    } else if ((r26 & 536870912) != 0 && !AbstractC0187g1.d(bArr, n4, n4 + r3)) {
                        throw C0198l0.a();
                    } else {
                        unsafe.putObject(obj, j3, new String(bArr, n4, r3, AbstractC0192j0.f2920a));
                        n4 += r3;
                    }
                    unsafe.putInt(obj, j4, r24);
                    return n4;
                }
                break;
            case 60:
                if (r25 == 2) {
                    Object n5 = n(obj, r24, r30);
                    int s3 = S0.s(n5, k(r30), bArr, r21, r22, g);
                    u(obj, r24, r30, n5);
                    return s3;
                }
                break;
            case 61:
                if (r25 == 2) {
                    int a4 = S0.a(bArr, r21, g);
                    unsafe.putObject(obj, j3, g.f2791c);
                    unsafe.putInt(obj, j4, r24);
                    return a4;
                }
                break;
            case 63:
                if (r25 == 0) {
                    int n6 = S0.n(bArr, r21, g);
                    int r4 = g.f2789a;
                    InterfaceC0180e0 j5 = j(r30);
                    if (j5 != null && !j5.a(r4)) {
                        B(obj).c(r23, Long.valueOf(r4));
                    } else {
                        unsafe.putObject(obj, j3, Integer.valueOf(r4));
                        unsafe.putInt(obj, j4, r24);
                    }
                    return n6;
                }
                break;
            case 66:
                if (r25 == 0) {
                    int n7 = S0.n(bArr, r21, g);
                    unsafe.putObject(obj, j3, Integer.valueOf(S0.c(g.f2789a)));
                    unsafe.putInt(obj, j4, r24);
                    return n7;
                }
                break;
            case 67:
                if (r25 == 0) {
                    int q5 = S0.q(bArr, r21, g);
                    unsafe.putObject(obj, j3, Long.valueOf(S0.f(g.f2790b)));
                    unsafe.putInt(obj, j4, r24);
                    return q5;
                }
                break;
            case 68:
                if (r25 == 3) {
                    Object n8 = n(obj, r24, r30);
                    int r5 = S0.r(n8, k(r30), bArr, r21, r22, (r23 & (-8)) | 4, g);
                    u(obj, r24, r30, n8);
                    return r5;
                }
                break;
        }
        return r21;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x01e5 -> B:109:0x01e6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:129:0x0236 -> B:130:0x0237). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0168 -> B:77:0x0169). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int H(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.mlkit_vision_barcode_bundled.G r29) {
        /*
            Method dump skipped, instructions count: 1022
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.C0.H(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.mlkit_vision_barcode_bundled.G):int");
    }

    public final int I(int r7, int r8) {
        int[] r02 = this.f2770a;
        int length = (r02.length / 3) - 1;
        while (r8 <= length) {
            int r3 = (length + r8) >>> 1;
            int r4 = r3 * 3;
            int r5 = r02[r4];
            if (r7 == r5) {
                return r4;
            }
            if (r7 < r5) {
                length = r3 - 1;
            } else {
                r8 = r3 + 1;
            }
        }
        return -1;
    }

    public final int K(int r22) {
        return this.f2770a[r22 + 1];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.N0
    public final void a(Object obj) {
        if (!x(obj)) {
            return;
        }
        if (obj instanceof AbstractC0168a0) {
            AbstractC0168a0 abstractC0168a0 = (AbstractC0168a0) obj;
            abstractC0168a0.i();
            abstractC0168a0.zzb = 0;
            abstractC0168a0.g();
        }
        int[] r02 = this.f2770a;
        int length = r02.length;
        for (int r12 = 0; r12 < length; r12 += 3) {
            int K3 = K(r12);
            int r4 = 1048575 & K3;
            int J3 = J(K3);
            long j3 = r4;
            if (J3 != 9) {
                if (J3 != 60 && J3 != 68) {
                    switch (J3) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.f2778j.a(j3, obj);
                            break;
                        case 50:
                            Unsafe unsafe = f2769o;
                            Object object = unsafe.getObject(obj, j3);
                            if (object != null) {
                                ((C0222w0) object).c();
                                unsafe.putObject(obj, j3, object);
                                break;
                            } else {
                                break;
                            }
                    }
                } else if (y(obj, r02[r12], r12)) {
                    k(r12).a(f2769o.getObject(obj, j3));
                }
            }
            if (w(r12, obj)) {
                k(r12).a(f2769o.getObject(obj, j3));
            }
        }
        this.f2779k.getClass();
        W0.c(obj);
        if (this.f2775f) {
            this.f2780l.getClass();
            P.c(obj);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.N0
    public final int b(AbstractC0168a0 abstractC0168a0) {
        int J3;
        int L3;
        int M3;
        EnumC0190h1 enumC0190h1 = EnumC0190h1.zza;
        if (this.f2781m - 1 != 0) {
            Unsafe unsafe = f2769o;
            int r12 = 0;
            int r22 = 0;
            while (true) {
                int[] r3 = this.f2770a;
                if (r12 < r3.length) {
                    int K3 = K(r12);
                    int J4 = J(K3);
                    int r6 = r3[r12];
                    int r4 = K3 & 1048575;
                    if (J4 >= T.zzJ.a() && J4 <= T.zzW.a()) {
                        int r32 = r3[r12 + 2];
                    }
                    long j3 = r4;
                    switch (J4) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            if (w(r12, abstractC0168a0)) {
                                r22 = D.C.r(r6 << 3, 8, r22);
                                continue;
                            }
                            r12 += 3;
                        case 1:
                            if (w(r12, abstractC0168a0)) {
                                r22 = D.C.r(r6 << 3, 4, r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case 2:
                            if (w(r12, abstractC0168a0)) {
                                r22 = D.C.r(r6 << 3, M.M(AbstractC0181e1.g(j3, abstractC0168a0)), r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                            if (w(r12, abstractC0168a0)) {
                                r22 = D.C.r(r6 << 3, M.M(AbstractC0181e1.g(j3, abstractC0168a0)), r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case 4:
                            if (w(r12, abstractC0168a0)) {
                                r22 = D.C.r(r6 << 3, M.J(AbstractC0181e1.f(j3, abstractC0168a0)), r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case q0.k.STRING_FIELD_NUMBER /* 5 */:
                            if (w(r12, abstractC0168a0)) {
                                r22 = D.C.r(r6 << 3, 8, r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            if (w(r12, abstractC0168a0)) {
                                r22 = D.C.r(r6 << 3, 4, r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            if (w(r12, abstractC0168a0)) {
                                r22 = D.C.r(r6 << 3, 1, r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case 8:
                            if (w(r12, abstractC0168a0)) {
                                Object i3 = AbstractC0181e1.i(j3, abstractC0168a0);
                                if (i3 instanceof L) {
                                    Logger logger = M.g;
                                    int j4 = ((L) i3).j();
                                    r22 = D.C.r(r6 << 3, M.L(j4) + j4, r22);
                                } else {
                                    r22 = D.C.r(r6 << 3, M.K((String) i3), r22);
                                }
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case 9:
                            if (w(r12, abstractC0168a0)) {
                                J3 = O0.J(r6, AbstractC0181e1.i(j3, abstractC0168a0), k(r12));
                                break;
                            } else {
                                continue;
                                r12 += 3;
                            }
                        case 10:
                            if (w(r12, abstractC0168a0)) {
                                Logger logger2 = M.g;
                                int j5 = ((L) AbstractC0181e1.i(j3, abstractC0168a0)).j();
                                r22 = D.C.r(r6 << 3, M.L(j5) + j5, r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case 11:
                            if (w(r12, abstractC0168a0)) {
                                r22 = D.C.r(r6 << 3, M.L(AbstractC0181e1.f(j3, abstractC0168a0)), r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case 12:
                            if (w(r12, abstractC0168a0)) {
                                r22 = D.C.r(r6 << 3, M.J(AbstractC0181e1.f(j3, abstractC0168a0)), r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case 13:
                            if (w(r12, abstractC0168a0)) {
                                r22 = D.C.r(r6 << 3, 4, r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case 14:
                            if (w(r12, abstractC0168a0)) {
                                r22 = D.C.r(r6 << 3, 8, r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case 15:
                            if (w(r12, abstractC0168a0)) {
                                int f2 = AbstractC0181e1.f(j3, abstractC0168a0);
                                r22 = D.C.r((f2 >> 31) ^ (f2 + f2), M.L(r6 << 3), r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case 16:
                            if (w(r12, abstractC0168a0)) {
                                long g = AbstractC0181e1.g(j3, abstractC0168a0);
                                L3 = M.L(r6 << 3);
                                M3 = M.M((g >> 63) ^ (g + g));
                                J3 = M3 + L3;
                                break;
                            } else {
                                continue;
                                r12 += 3;
                            }
                        case 17:
                            if (w(r12, abstractC0168a0)) {
                                J3 = M.I(r6, (D) AbstractC0181e1.i(j3, abstractC0168a0), k(r12));
                                break;
                            } else {
                                continue;
                                r12 += 3;
                            }
                        case 18:
                            J3 = O0.C(r6, (List) AbstractC0181e1.i(j3, abstractC0168a0));
                            break;
                        case 19:
                            J3 = O0.A(r6, (List) AbstractC0181e1.i(j3, abstractC0168a0));
                            break;
                        case 20:
                            J3 = O0.H(r6, (List) AbstractC0181e1.i(j3, abstractC0168a0));
                            break;
                        case 21:
                            J3 = O0.S(r6, (List) AbstractC0181e1.i(j3, abstractC0168a0));
                            break;
                        case 22:
                            J3 = O0.F(r6, (List) AbstractC0181e1.i(j3, abstractC0168a0));
                            break;
                        case 23:
                            J3 = O0.C(r6, (List) AbstractC0181e1.i(j3, abstractC0168a0));
                            break;
                        case 24:
                            J3 = O0.A(r6, (List) AbstractC0181e1.i(j3, abstractC0168a0));
                            break;
                        case 25:
                            J3 = O0.w(r6, (List) AbstractC0181e1.i(j3, abstractC0168a0));
                            break;
                        case 26:
                            J3 = O0.P(r6, (List) AbstractC0181e1.i(j3, abstractC0168a0));
                            break;
                        case 27:
                            J3 = O0.K(r6, (List) AbstractC0181e1.i(j3, abstractC0168a0), k(r12));
                            break;
                        case 28:
                            J3 = O0.x(r6, (List) AbstractC0181e1.i(j3, abstractC0168a0));
                            break;
                        case 29:
                            J3 = O0.Q(r6, (List) AbstractC0181e1.i(j3, abstractC0168a0));
                            break;
                        case 30:
                            J3 = O0.y(r6, (List) AbstractC0181e1.i(j3, abstractC0168a0));
                            break;
                        case 31:
                            J3 = O0.A(r6, (List) AbstractC0181e1.i(j3, abstractC0168a0));
                            break;
                        case 32:
                            J3 = O0.C(r6, (List) AbstractC0181e1.i(j3, abstractC0168a0));
                            break;
                        case 33:
                            J3 = O0.L(r6, (List) AbstractC0181e1.i(j3, abstractC0168a0));
                            break;
                        case 34:
                            J3 = O0.N(r6, (List) AbstractC0181e1.i(j3, abstractC0168a0));
                            break;
                        case 35:
                            int D3 = O0.D((List) unsafe.getObject(abstractC0168a0, j3));
                            if (D3 > 0) {
                                r22 = D.C.s(r6 << 3, M.L(D3), D3, r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case 36:
                            int B3 = O0.B((List) unsafe.getObject(abstractC0168a0, j3));
                            if (B3 > 0) {
                                r22 = D.C.s(r6 << 3, M.L(B3), B3, r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case 37:
                            int I3 = O0.I((List) unsafe.getObject(abstractC0168a0, j3));
                            if (I3 > 0) {
                                r22 = D.C.s(r6 << 3, M.L(I3), I3, r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case 38:
                            int T3 = O0.T((List) unsafe.getObject(abstractC0168a0, j3));
                            if (T3 > 0) {
                                r22 = D.C.s(r6 << 3, M.L(T3), T3, r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case 39:
                            int G3 = O0.G((List) unsafe.getObject(abstractC0168a0, j3));
                            if (G3 > 0) {
                                r22 = D.C.s(r6 << 3, M.L(G3), G3, r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case 40:
                            int D4 = O0.D((List) unsafe.getObject(abstractC0168a0, j3));
                            if (D4 > 0) {
                                r22 = D.C.s(r6 << 3, M.L(D4), D4, r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case 41:
                            int B4 = O0.B((List) unsafe.getObject(abstractC0168a0, j3));
                            if (B4 > 0) {
                                r22 = D.C.s(r6 << 3, M.L(B4), B4, r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case 42:
                            Class cls = O0.f2831a;
                            int size = ((List) unsafe.getObject(abstractC0168a0, j3)).size();
                            if (size > 0) {
                                r22 = D.C.s(r6 << 3, M.L(size), size, r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case 43:
                            int R3 = O0.R((List) unsafe.getObject(abstractC0168a0, j3));
                            if (R3 > 0) {
                                r22 = D.C.s(r6 << 3, M.L(R3), R3, r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case 44:
                            int z3 = O0.z((List) unsafe.getObject(abstractC0168a0, j3));
                            if (z3 > 0) {
                                r22 = D.C.s(r6 << 3, M.L(z3), z3, r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case 45:
                            int B5 = O0.B((List) unsafe.getObject(abstractC0168a0, j3));
                            if (B5 > 0) {
                                r22 = D.C.s(r6 << 3, M.L(B5), B5, r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case 46:
                            int D5 = O0.D((List) unsafe.getObject(abstractC0168a0, j3));
                            if (D5 > 0) {
                                r22 = D.C.s(r6 << 3, M.L(D5), D5, r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case 47:
                            int M4 = O0.M((List) unsafe.getObject(abstractC0168a0, j3));
                            if (M4 > 0) {
                                r22 = D.C.s(r6 << 3, M.L(M4), M4, r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case 48:
                            int O2 = O0.O((List) unsafe.getObject(abstractC0168a0, j3));
                            if (O2 > 0) {
                                r22 = D.C.s(r6 << 3, M.L(O2), O2, r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case 49:
                            J3 = O0.E(r6, (List) AbstractC0181e1.i(j3, abstractC0168a0), k(r12));
                            break;
                        case 50:
                            C0224x0.a(AbstractC0181e1.i(j3, abstractC0168a0), l(r12));
                            continue;
                            r12 += 3;
                        case 51:
                            if (y(abstractC0168a0, r6, r12)) {
                                r22 = D.C.r(r6 << 3, 8, r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case 52:
                            if (y(abstractC0168a0, r6, r12)) {
                                r22 = D.C.r(r6 << 3, 4, r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case 53:
                            if (y(abstractC0168a0, r6, r12)) {
                                r22 = D.C.r(r6 << 3, M.M(L(j3, abstractC0168a0)), r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case 54:
                            if (y(abstractC0168a0, r6, r12)) {
                                r22 = D.C.r(r6 << 3, M.M(L(j3, abstractC0168a0)), r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case 55:
                            if (y(abstractC0168a0, r6, r12)) {
                                r22 = D.C.r(r6 << 3, M.J(E(j3, abstractC0168a0)), r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case 56:
                            if (y(abstractC0168a0, r6, r12)) {
                                r22 = D.C.r(r6 << 3, 8, r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case 57:
                            if (y(abstractC0168a0, r6, r12)) {
                                r22 = D.C.r(r6 << 3, 4, r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case 58:
                            if (y(abstractC0168a0, r6, r12)) {
                                r22 = D.C.r(r6 << 3, 1, r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case 59:
                            if (y(abstractC0168a0, r6, r12)) {
                                Object i4 = AbstractC0181e1.i(j3, abstractC0168a0);
                                if (i4 instanceof L) {
                                    Logger logger3 = M.g;
                                    int j6 = ((L) i4).j();
                                    r22 = D.C.r(r6 << 3, M.L(j6) + j6, r22);
                                } else {
                                    r22 = D.C.r(r6 << 3, M.K((String) i4), r22);
                                }
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case 60:
                            if (y(abstractC0168a0, r6, r12)) {
                                J3 = O0.J(r6, AbstractC0181e1.i(j3, abstractC0168a0), k(r12));
                                break;
                            } else {
                                continue;
                                r12 += 3;
                            }
                        case 61:
                            if (y(abstractC0168a0, r6, r12)) {
                                Logger logger4 = M.g;
                                int j7 = ((L) AbstractC0181e1.i(j3, abstractC0168a0)).j();
                                r22 = D.C.r(r6 << 3, M.L(j7) + j7, r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case 62:
                            if (y(abstractC0168a0, r6, r12)) {
                                r22 = D.C.r(r6 << 3, M.L(E(j3, abstractC0168a0)), r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case 63:
                            if (y(abstractC0168a0, r6, r12)) {
                                r22 = D.C.r(r6 << 3, M.J(E(j3, abstractC0168a0)), r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case RecognitionOptions.EAN_8 /* 64 */:
                            if (y(abstractC0168a0, r6, r12)) {
                                r22 = D.C.r(r6 << 3, 4, r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case 65:
                            if (y(abstractC0168a0, r6, r12)) {
                                r22 = D.C.r(r6 << 3, 8, r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case 66:
                            if (y(abstractC0168a0, r6, r12)) {
                                int E3 = E(j3, abstractC0168a0);
                                r22 = D.C.r((E3 >> 31) ^ (E3 + E3), M.L(r6 << 3), r22);
                            } else {
                                continue;
                            }
                            r12 += 3;
                        case 67:
                            if (y(abstractC0168a0, r6, r12)) {
                                long L4 = L(j3, abstractC0168a0);
                                L3 = M.L(r6 << 3);
                                M3 = M.M((L4 >> 63) ^ (L4 + L4));
                                J3 = M3 + L3;
                                break;
                            } else {
                                continue;
                                r12 += 3;
                            }
                        case 68:
                            if (y(abstractC0168a0, r6, r12)) {
                                J3 = M.I(r6, (D) AbstractC0181e1.i(j3, abstractC0168a0), k(r12));
                                break;
                            } else {
                                continue;
                                r12 += 3;
                            }
                        default:
                            r12 += 3;
                    }
                    r22 = J3 + r22;
                    r12 += 3;
                } else {
                    this.f2779k.getClass();
                    return W0.a(W0.b(abstractC0168a0)) + r22;
                }
            }
        } else {
            return D(abstractC0168a0);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.N0
    public final Object c() {
        return (AbstractC0168a0) ((AbstractC0168a0) this.f2774e).m(4, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.N0
    public final void d(Object obj, Object obj2) {
        p(obj);
        obj2.getClass();
        int r02 = 0;
        while (true) {
            int[] r12 = this.f2770a;
            if (r02 < r12.length) {
                int K3 = K(r02);
                int r5 = r12[r02];
                long j3 = K3 & 1048575;
                switch (J(K3)) {
                    case RecognitionOptions.UNRECOGNIZED /* 0 */:
                        if (!w(r02, obj2)) {
                            break;
                        } else {
                            AbstractC0181e1.l(obj, j3, AbstractC0181e1.f2899c.a(j3, obj2));
                            s(r02, obj);
                            break;
                        }
                    case 1:
                        if (!w(r02, obj2)) {
                            break;
                        } else {
                            AbstractC0181e1.m(obj, j3, AbstractC0181e1.f2899c.b(j3, obj2));
                            s(r02, obj);
                            break;
                        }
                    case 2:
                        if (!w(r02, obj2)) {
                            break;
                        } else {
                            AbstractC0181e1.o(obj, j3, AbstractC0181e1.g(j3, obj2));
                            s(r02, obj);
                            break;
                        }
                    case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                        if (!w(r02, obj2)) {
                            break;
                        } else {
                            AbstractC0181e1.o(obj, j3, AbstractC0181e1.g(j3, obj2));
                            s(r02, obj);
                            break;
                        }
                    case 4:
                        if (!w(r02, obj2)) {
                            break;
                        } else {
                            AbstractC0181e1.n(AbstractC0181e1.f(j3, obj2), j3, obj);
                            s(r02, obj);
                            break;
                        }
                    case q0.k.STRING_FIELD_NUMBER /* 5 */:
                        if (!w(r02, obj2)) {
                            break;
                        } else {
                            AbstractC0181e1.o(obj, j3, AbstractC0181e1.g(j3, obj2));
                            s(r02, obj);
                            break;
                        }
                    case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (!w(r02, obj2)) {
                            break;
                        } else {
                            AbstractC0181e1.n(AbstractC0181e1.f(j3, obj2), j3, obj);
                            s(r02, obj);
                            break;
                        }
                    case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (!w(r02, obj2)) {
                            break;
                        } else {
                            AbstractC0181e1.k(obj, j3, AbstractC0181e1.f2899c.g(j3, obj2));
                            s(r02, obj);
                            break;
                        }
                    case 8:
                        if (!w(r02, obj2)) {
                            break;
                        } else {
                            AbstractC0181e1.p(j3, obj, AbstractC0181e1.i(j3, obj2));
                            s(r02, obj);
                            break;
                        }
                    case 9:
                        q(r02, obj, obj2);
                        break;
                    case 10:
                        if (!w(r02, obj2)) {
                            break;
                        } else {
                            AbstractC0181e1.p(j3, obj, AbstractC0181e1.i(j3, obj2));
                            s(r02, obj);
                            break;
                        }
                    case 11:
                        if (!w(r02, obj2)) {
                            break;
                        } else {
                            AbstractC0181e1.n(AbstractC0181e1.f(j3, obj2), j3, obj);
                            s(r02, obj);
                            break;
                        }
                    case 12:
                        if (!w(r02, obj2)) {
                            break;
                        } else {
                            AbstractC0181e1.n(AbstractC0181e1.f(j3, obj2), j3, obj);
                            s(r02, obj);
                            break;
                        }
                    case 13:
                        if (!w(r02, obj2)) {
                            break;
                        } else {
                            AbstractC0181e1.n(AbstractC0181e1.f(j3, obj2), j3, obj);
                            s(r02, obj);
                            break;
                        }
                    case 14:
                        if (!w(r02, obj2)) {
                            break;
                        } else {
                            AbstractC0181e1.o(obj, j3, AbstractC0181e1.g(j3, obj2));
                            s(r02, obj);
                            break;
                        }
                    case 15:
                        if (!w(r02, obj2)) {
                            break;
                        } else {
                            AbstractC0181e1.n(AbstractC0181e1.f(j3, obj2), j3, obj);
                            s(r02, obj);
                            break;
                        }
                    case 16:
                        if (!w(r02, obj2)) {
                            break;
                        } else {
                            AbstractC0181e1.o(obj, j3, AbstractC0181e1.g(j3, obj2));
                            s(r02, obj);
                            break;
                        }
                    case 17:
                        q(r02, obj, obj2);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.f2778j.b(j3, obj, obj2);
                        break;
                    case 50:
                        Class cls = O0.f2831a;
                        AbstractC0181e1.p(j3, obj, C0224x0.b(AbstractC0181e1.i(j3, obj), AbstractC0181e1.i(j3, obj2)));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!y(obj2, r5, r02)) {
                            break;
                        } else {
                            AbstractC0181e1.p(j3, obj, AbstractC0181e1.i(j3, obj2));
                            AbstractC0181e1.n(r5, r12[r02 + 2] & 1048575, obj);
                            break;
                        }
                    case 60:
                        r(r02, obj, obj2);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case RecognitionOptions.EAN_8 /* 64 */:
                    case 65:
                    case 66:
                    case 67:
                        if (!y(obj2, r5, r02)) {
                            break;
                        } else {
                            AbstractC0181e1.p(j3, obj, AbstractC0181e1.i(j3, obj2));
                            AbstractC0181e1.n(r5, r12[r02 + 2] & 1048575, obj);
                            break;
                        }
                    case 68:
                        r(r02, obj, obj2);
                        break;
                }
                r02 += 3;
            } else {
                O0.c(this.f2779k, obj, obj2);
                if (this.f2775f) {
                    O0.b(this.f2780l, obj, obj2);
                    return;
                }
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d9, code lost:
        if (r4 != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00db, code lost:
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dd, code lost:
        r3 = r8 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01e9, code lost:
        if (r4 != false) goto L54;
     */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.N0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0168a0 r13) {
        /*
            Method dump skipped, instructions count: 754
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.C0.e(com.google.android.gms.internal.mlkit_vision_barcode_bundled.a0):int");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.N0
    public final boolean f(Object obj) {
        boolean z3;
        int r22 = 0;
        int r3 = 1048575;
        int r4 = 0;
        while (true) {
            boolean z4 = true;
            if (r22 < this.f2776h) {
                int r5 = this.g[r22];
                int[] r7 = this.f2770a;
                int r8 = r7[r5];
                int K3 = K(r5);
                int r72 = r7[r5 + 2];
                int r10 = r72 & 1048575;
                int r73 = 1 << (r72 >>> 20);
                if (r10 != r3) {
                    if (r10 != 1048575) {
                        r4 = f2769o.getInt(obj, r10);
                    }
                    r3 = r10;
                }
                if ((268435456 & K3) != 0) {
                    if (r3 == 1048575) {
                        z3 = w(r5, obj);
                    } else if ((r4 & r73) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        return false;
                    }
                }
                int J3 = J(K3);
                if (J3 != 9 && J3 != 17) {
                    if (J3 != 27) {
                        if (J3 != 60 && J3 != 68) {
                            if (J3 != 49) {
                                if (J3 == 50 && !((C0222w0) AbstractC0181e1.i(K3 & 1048575, obj)).isEmpty()) {
                                    D.C.G(l(r5));
                                    throw null;
                                }
                            }
                        } else if (y(obj, r8, r5) && !k(r5).f(AbstractC0181e1.i(K3 & 1048575, obj))) {
                            return false;
                        }
                    }
                    List list = (List) AbstractC0181e1.i(K3 & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        N0 k3 = k(r5);
                        for (int r74 = 0; r74 < list.size(); r74++) {
                            if (!k3.f(list.get(r74))) {
                                return false;
                            }
                        }
                        continue;
                    }
                } else {
                    if (r3 == 1048575) {
                        z4 = w(r5, obj);
                    } else if ((r73 & r4) == 0) {
                        z4 = false;
                    }
                    if (z4 && !k(r5).f(AbstractC0181e1.i(K3 & 1048575, obj))) {
                        return false;
                    }
                }
                r22++;
            } else {
                if (this.f2775f) {
                    this.f2780l.getClass();
                    if (!P.b(obj).g()) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0a36  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x054f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x031a  */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.N0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(java.lang.Object r21, com.google.android.gms.internal.mlkit_vision_barcode_bundled.C0220v0 r22) {
        /*
            Method dump skipped, instructions count: 2934
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.C0.g(java.lang.Object, com.google.android.gms.internal.mlkit_vision_barcode_bundled.v0):void");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.N0
    public final void h(Object obj, byte[] bArr, int r33, int r34, G g) {
        byte b3;
        int I3;
        int r23;
        int r26;
        int r27;
        Unsafe unsafe;
        int r22;
        Object obj2;
        Unsafe unsafe2;
        int r11;
        int r21;
        G g3;
        int r3;
        G g4;
        G g5;
        boolean z3;
        Unsafe unsafe3;
        int r14;
        int r15;
        int r4;
        C0 c02 = this;
        Object obj3 = obj;
        byte[] bArr2 = bArr;
        int r13 = r34;
        G g6 = g;
        EnumC0190h1 enumC0190h1 = EnumC0190h1.zza;
        int r8 = -1;
        if (c02.f2781m - 1 != 0) {
            p(obj);
            Unsafe unsafe4 = f2769o;
            int r6 = 0;
            int r02 = r33;
            int r12 = -1;
            int r24 = 0;
            int r32 = 0;
            int r5 = 1048575;
            while (r02 < r13) {
                int r9 = r02 + 1;
                byte b4 = bArr2[r02];
                if (b4 < 0) {
                    int o3 = S0.o(b4, bArr2, r9, g6);
                    b3 = g6.f2789a;
                    r9 = o3;
                } else {
                    b3 = b4;
                }
                int r03 = b3 >>> 3;
                int r42 = c02.f2773d;
                int r10 = c02.f2772c;
                if (r03 > r12) {
                    int r25 = r24 / 3;
                    if (r03 >= r10 && r03 <= r42) {
                        I3 = c02.I(r03, r25);
                    }
                    I3 = -1;
                } else {
                    if (r03 >= r10 && r03 <= r42) {
                        I3 = c02.I(r03, r6);
                    }
                    I3 = -1;
                }
                int r102 = I3;
                if (r102 == r8) {
                    r23 = r03;
                    r26 = r32;
                    r27 = r5;
                    unsafe = unsafe4;
                    r22 = r9;
                    obj2 = obj3;
                } else {
                    int r43 = b3 & 7;
                    int[] r16 = c02.f2770a;
                    int r28 = r16[r102 + 1];
                    int J3 = J(r28);
                    Unsafe unsafe5 = unsafe4;
                    long j3 = r28 & 1048575;
                    if (J3 <= 17) {
                        int r17 = r16[r102 + 2];
                        int r82 = 1 << (r17 >>> 20);
                        int r103 = 1048575;
                        int r18 = r17 & 1048575;
                        if (r18 != r5) {
                            if (r5 != 1048575) {
                                long j4 = r5;
                                unsafe3 = unsafe5;
                                unsafe3.putInt(obj3, j4, r32);
                                r103 = 1048575;
                            } else {
                                unsafe3 = unsafe5;
                            }
                            if (r18 != r103) {
                                r32 = unsafe3.getInt(obj3, r18);
                            }
                            r21 = r18;
                            r11 = r32;
                            unsafe2 = unsafe3;
                        } else {
                            unsafe2 = unsafe5;
                            r11 = r32;
                            r21 = r5;
                        }
                        switch (J3) {
                            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                                g3 = g;
                                r23 = r03;
                                r24 = r102;
                                if (r43 == 1) {
                                    AbstractC0181e1.l(obj3, j3, Double.longBitsToDouble(S0.u(bArr2, r9)));
                                    r02 = r9 + 8;
                                    r32 = r11 | r82;
                                    unsafe4 = unsafe2;
                                    g6 = g3;
                                    r5 = r21;
                                    r12 = r23;
                                    r6 = 0;
                                    r8 = -1;
                                    r13 = r34;
                                    break;
                                } else {
                                    r6 = r24;
                                    r22 = r9;
                                    unsafe = unsafe2;
                                    r26 = r11;
                                    obj2 = obj3;
                                    r27 = r21;
                                    break;
                                }
                            case 1:
                                g3 = g;
                                r23 = r03;
                                r24 = r102;
                                if (r43 == 5) {
                                    AbstractC0181e1.m(obj3, j3, Float.intBitsToFloat(S0.d(bArr2, r9)));
                                    r32 = r11 | r82;
                                    r02 = r9 + 4;
                                    unsafe4 = unsafe2;
                                    g6 = g3;
                                    r5 = r21;
                                    r12 = r23;
                                    r6 = 0;
                                    r8 = -1;
                                    r13 = r34;
                                    break;
                                } else {
                                    r6 = r24;
                                    r22 = r9;
                                    unsafe = unsafe2;
                                    r26 = r11;
                                    obj2 = obj3;
                                    r27 = r21;
                                    break;
                                }
                            case 2:
                            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                                g3 = g;
                                r23 = r03;
                                r24 = r102;
                                if (r43 == 0) {
                                    int q3 = S0.q(bArr2, r9, g3);
                                    unsafe2.putLong(obj, j3, g3.f2790b);
                                    r32 = r11 | r82;
                                    r24 = r24;
                                    r02 = q3;
                                    unsafe4 = unsafe2;
                                    g6 = g3;
                                    r5 = r21;
                                    r12 = r23;
                                    r6 = 0;
                                    r8 = -1;
                                    r13 = r34;
                                    break;
                                } else {
                                    r6 = r24;
                                    r22 = r9;
                                    unsafe = unsafe2;
                                    r26 = r11;
                                    obj2 = obj3;
                                    r27 = r21;
                                    break;
                                }
                            case 4:
                            case 11:
                                g3 = g;
                                r23 = r03;
                                r24 = r102;
                                if (r43 == 0) {
                                    r02 = S0.n(bArr2, r9, g3);
                                    unsafe2.putInt(obj3, j3, g3.f2789a);
                                    r32 = r11 | r82;
                                    unsafe4 = unsafe2;
                                    g6 = g3;
                                    r5 = r21;
                                    r12 = r23;
                                    r6 = 0;
                                    r8 = -1;
                                    r13 = r34;
                                    break;
                                } else {
                                    r6 = r24;
                                    r22 = r9;
                                    unsafe = unsafe2;
                                    r26 = r11;
                                    obj2 = obj3;
                                    r27 = r21;
                                    break;
                                }
                            case q0.k.STRING_FIELD_NUMBER /* 5 */:
                            case 14:
                                g3 = g;
                                r23 = r03;
                                r3 = r102;
                                if (r43 != 1) {
                                    r24 = r3;
                                    r6 = r24;
                                    r22 = r9;
                                    unsafe = unsafe2;
                                    r26 = r11;
                                    obj2 = obj3;
                                    r27 = r21;
                                    break;
                                } else {
                                    unsafe2.putLong(obj, j3, S0.u(bArr2, r9));
                                    r02 = r9 + 8;
                                    r32 = r11 | r82;
                                    r24 = r3;
                                    unsafe4 = unsafe2;
                                    g6 = g3;
                                    r5 = r21;
                                    r12 = r23;
                                    r6 = 0;
                                    r8 = -1;
                                    r13 = r34;
                                    break;
                                }
                            case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            case 13:
                                g5 = g;
                                r23 = r03;
                                r3 = r102;
                                if (r43 != 5) {
                                    r24 = r3;
                                    r6 = r24;
                                    r22 = r9;
                                    unsafe = unsafe2;
                                    r26 = r11;
                                    obj2 = obj3;
                                    r27 = r21;
                                    break;
                                } else {
                                    unsafe2.putInt(obj3, j3, S0.d(bArr2, r9));
                                    r02 = r9 + 4;
                                    int r19 = r11 | r82;
                                    r24 = r3;
                                    unsafe4 = unsafe2;
                                    g6 = g5;
                                    r5 = r21;
                                    r6 = 0;
                                    r8 = -1;
                                    r13 = r34;
                                    r32 = r19;
                                    r12 = r23;
                                    break;
                                }
                            case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                                g5 = g;
                                r23 = r03;
                                r3 = r102;
                                if (r43 != 0) {
                                    r24 = r3;
                                    r6 = r24;
                                    r22 = r9;
                                    unsafe = unsafe2;
                                    r26 = r11;
                                    obj2 = obj3;
                                    r27 = r21;
                                    break;
                                } else {
                                    r02 = S0.q(bArr2, r9, g5);
                                    if (g5.f2790b != 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    AbstractC0181e1.k(obj3, j3, z3);
                                    int r192 = r11 | r82;
                                    r24 = r3;
                                    unsafe4 = unsafe2;
                                    g6 = g5;
                                    r5 = r21;
                                    r6 = 0;
                                    r8 = -1;
                                    r13 = r34;
                                    r32 = r192;
                                    r12 = r23;
                                    break;
                                }
                            case 8:
                                g5 = g;
                                r23 = r03;
                                r3 = r102;
                                if (r43 == 2) {
                                    if ((536870912 & r28) == 0) {
                                        r02 = S0.k(bArr2, r9, g5);
                                    } else {
                                        r02 = S0.l(bArr2, r9, g5);
                                    }
                                    unsafe2.putObject(obj3, j3, g5.f2791c);
                                    int r1922 = r11 | r82;
                                    r24 = r3;
                                    unsafe4 = unsafe2;
                                    g6 = g5;
                                    r5 = r21;
                                    r6 = 0;
                                    r8 = -1;
                                    r13 = r34;
                                    r32 = r1922;
                                    r12 = r23;
                                    break;
                                } else {
                                    r24 = r3;
                                    r6 = r24;
                                    r22 = r9;
                                    unsafe = unsafe2;
                                    r26 = r11;
                                    obj2 = obj3;
                                    r27 = r21;
                                    break;
                                }
                            case 9:
                                g3 = g;
                                r23 = r03;
                                if (r43 != 2) {
                                    r24 = r102;
                                    r6 = r24;
                                    r22 = r9;
                                    unsafe = unsafe2;
                                    r26 = r11;
                                    obj2 = obj3;
                                    r27 = r21;
                                    break;
                                } else {
                                    Object m3 = c02.m(r102, obj3);
                                    r02 = S0.s(m3, c02.k(r102), bArr, r9, r34, g);
                                    c02.t(r102, obj3, m3);
                                    r32 = r11 | r82;
                                    r24 = r102;
                                    unsafe4 = unsafe2;
                                    g6 = g3;
                                    r5 = r21;
                                    r12 = r23;
                                    r6 = 0;
                                    r8 = -1;
                                    r13 = r34;
                                    break;
                                }
                            case 10:
                                g4 = g;
                                r23 = r03;
                                if (r43 != 2) {
                                    r24 = r102;
                                    r6 = r24;
                                    r22 = r9;
                                    unsafe = unsafe2;
                                    r26 = r11;
                                    obj2 = obj3;
                                    r27 = r21;
                                    break;
                                } else {
                                    int a4 = S0.a(bArr2, r9, g4);
                                    unsafe2.putObject(obj3, j3, g4.f2791c);
                                    r32 = r11 | r82;
                                    r02 = a4;
                                    unsafe4 = unsafe2;
                                    g6 = g4;
                                    r5 = r21;
                                    r24 = r102;
                                    r12 = r23;
                                    r6 = 0;
                                    r8 = -1;
                                    r13 = r34;
                                    break;
                                }
                            case 12:
                                g4 = g;
                                r23 = r03;
                                if (r43 != 0) {
                                    r24 = r102;
                                    r6 = r24;
                                    r22 = r9;
                                    unsafe = unsafe2;
                                    r26 = r11;
                                    obj2 = obj3;
                                    r27 = r21;
                                    break;
                                } else {
                                    r02 = S0.n(bArr2, r9, g4);
                                    unsafe2.putInt(obj3, j3, g4.f2789a);
                                    r32 = r11 | r82;
                                    unsafe4 = unsafe2;
                                    g6 = g4;
                                    r5 = r21;
                                    r24 = r102;
                                    r12 = r23;
                                    r6 = 0;
                                    r8 = -1;
                                    r13 = r34;
                                    break;
                                }
                            case 15:
                                g4 = g;
                                r23 = r03;
                                if (r43 != 0) {
                                    r24 = r102;
                                    r6 = r24;
                                    r22 = r9;
                                    unsafe = unsafe2;
                                    r26 = r11;
                                    obj2 = obj3;
                                    r27 = r21;
                                    break;
                                } else {
                                    r02 = S0.n(bArr2, r9, g4);
                                    unsafe2.putInt(obj3, j3, S0.c(g4.f2789a));
                                    r32 = r11 | r82;
                                    unsafe4 = unsafe2;
                                    g6 = g4;
                                    r5 = r21;
                                    r24 = r102;
                                    r12 = r23;
                                    r6 = 0;
                                    r8 = -1;
                                    r13 = r34;
                                    break;
                                }
                            case 16:
                                if (r43 != 0) {
                                    r23 = r03;
                                    r24 = r102;
                                    r6 = r24;
                                    r22 = r9;
                                    unsafe = unsafe2;
                                    r26 = r11;
                                    obj2 = obj3;
                                    r27 = r21;
                                    break;
                                } else {
                                    g4 = g;
                                    int q4 = S0.q(bArr2, r9, g4);
                                    r23 = r03;
                                    unsafe2.putLong(obj, j3, S0.f(g4.f2790b));
                                    r32 = r11 | r82;
                                    r02 = q4;
                                    unsafe4 = unsafe2;
                                    g6 = g4;
                                    r5 = r21;
                                    r24 = r102;
                                    r12 = r23;
                                    r6 = 0;
                                    r8 = -1;
                                    r13 = r34;
                                    break;
                                }
                            default:
                                r23 = r03;
                                r24 = r102;
                                r6 = r24;
                                r22 = r9;
                                unsafe = unsafe2;
                                r26 = r11;
                                obj2 = obj3;
                                r27 = r21;
                                break;
                        }
                    } else {
                        r23 = r03;
                        if (J3 == 27) {
                            if (r43 == 2) {
                                E e4 = (E) ((i0) unsafe5.getObject(obj3, j3));
                                boolean h3 = e4.h();
                                i0 i0Var = e4;
                                if (!h3) {
                                    int size = e4.size();
                                    if (size == 0) {
                                        r4 = 10;
                                    } else {
                                        r4 = size + size;
                                    }
                                    i0 b5 = e4.b(r4);
                                    unsafe5.putObject(obj3, j3, b5);
                                    i0Var = b5;
                                }
                                int r132 = r32;
                                r02 = S0.h(c02.k(r102), b3, bArr, r9, r34, i0Var, g);
                                r5 = r5;
                                unsafe4 = unsafe5;
                                r24 = r102;
                                r32 = r132;
                                r12 = r23;
                                r6 = 0;
                                r8 = -1;
                                r13 = r34;
                                g6 = g;
                            } else {
                                r26 = r32;
                                r27 = r5;
                                r14 = r9;
                                unsafe = unsafe5;
                                r15 = r102;
                            }
                        } else {
                            int r110 = r32;
                            if (J3 <= 49) {
                                r26 = r110;
                                r27 = r5;
                                int r29 = r9;
                                unsafe = unsafe5;
                                r15 = r102;
                                r02 = H(obj, bArr, r9, r34, b3, r23, r43, r102, r28, J3, j3, g);
                                if (r02 != r29) {
                                    obj3 = obj;
                                    bArr2 = bArr;
                                    r13 = r34;
                                    g6 = g;
                                    r24 = r15;
                                } else {
                                    r22 = r02;
                                    r6 = r15;
                                    obj2 = obj;
                                    r02 = S0.m(b3, bArr, r22, r34, B(obj), g);
                                    bArr2 = bArr;
                                    r13 = r34;
                                    g6 = g;
                                    r24 = r6;
                                    obj3 = obj2;
                                }
                            } else {
                                r26 = r110;
                                r27 = r5;
                                r14 = r9;
                                unsafe = unsafe5;
                                r15 = r102;
                                if (J3 == 50) {
                                    if (r43 == 2) {
                                        F(r15, j3, obj);
                                        throw null;
                                    }
                                } else {
                                    obj2 = obj;
                                    r02 = G(obj, bArr, r14, r34, b3, r23, r43, r28, J3, j3, r15, g);
                                    if (r02 != r14) {
                                        bArr2 = bArr;
                                        r13 = r34;
                                        g6 = g;
                                        obj3 = obj2;
                                        r24 = r15;
                                    } else {
                                        r22 = r02;
                                        r6 = r15;
                                        r02 = S0.m(b3, bArr, r22, r34, B(obj), g);
                                        bArr2 = bArr;
                                        r13 = r34;
                                        g6 = g;
                                        r24 = r6;
                                        obj3 = obj2;
                                    }
                                }
                            }
                            r12 = r23;
                            r32 = r26;
                            r5 = r27;
                            unsafe4 = unsafe;
                            r6 = 0;
                            r8 = -1;
                            c02 = this;
                        }
                        r22 = r14;
                        r6 = r15;
                        obj2 = obj;
                        r02 = S0.m(b3, bArr, r22, r34, B(obj), g);
                        bArr2 = bArr;
                        r13 = r34;
                        g6 = g;
                        r24 = r6;
                        obj3 = obj2;
                        r12 = r23;
                        r32 = r26;
                        r5 = r27;
                        unsafe4 = unsafe;
                        r6 = 0;
                        r8 = -1;
                        c02 = this;
                    }
                }
                r02 = S0.m(b3, bArr, r22, r34, B(obj), g);
                bArr2 = bArr;
                r13 = r34;
                g6 = g;
                r24 = r6;
                obj3 = obj2;
                r12 = r23;
                r32 = r26;
                r5 = r27;
                unsafe4 = unsafe;
                r6 = 0;
                r8 = -1;
                c02 = this;
            }
            int r262 = r32;
            int r44 = r5;
            Unsafe unsafe6 = unsafe4;
            Object obj4 = obj3;
            if (r44 != 1048575) {
                unsafe6.putInt(obj4, r44, r262);
            }
            if (r02 == r34) {
                return;
            }
            throw C0198l0.c();
        }
        A(obj, bArr, r33, r34, 0, g);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.N0
    public final boolean i(AbstractC0168a0 abstractC0168a0, Object obj) {
        boolean v3;
        int[] r02 = this.f2770a;
        int length = r02.length;
        for (int r3 = 0; r3 < length; r3 += 3) {
            int K3 = K(r3);
            long j3 = K3 & 1048575;
            switch (J(K3)) {
                case RecognitionOptions.UNRECOGNIZED /* 0 */:
                    if (v(abstractC0168a0, obj, r3)) {
                        AbstractC0178d1 abstractC0178d1 = AbstractC0181e1.f2899c;
                        if (Double.doubleToLongBits(abstractC0178d1.a(j3, abstractC0168a0)) == Double.doubleToLongBits(abstractC0178d1.a(j3, obj))) {
                            continue;
                        }
                    }
                    return false;
                case 1:
                    if (v(abstractC0168a0, obj, r3)) {
                        AbstractC0178d1 abstractC0178d12 = AbstractC0181e1.f2899c;
                        if (Float.floatToIntBits(abstractC0178d12.b(j3, abstractC0168a0)) == Float.floatToIntBits(abstractC0178d12.b(j3, obj))) {
                            continue;
                        }
                    }
                    return false;
                case 2:
                    if (v(abstractC0168a0, obj, r3) && AbstractC0181e1.g(j3, abstractC0168a0) == AbstractC0181e1.g(j3, obj)) {
                        continue;
                    }
                    return false;
                case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                    if (v(abstractC0168a0, obj, r3) && AbstractC0181e1.g(j3, abstractC0168a0) == AbstractC0181e1.g(j3, obj)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (v(abstractC0168a0, obj, r3) && AbstractC0181e1.f(j3, abstractC0168a0) == AbstractC0181e1.f(j3, obj)) {
                        continue;
                    }
                    return false;
                case q0.k.STRING_FIELD_NUMBER /* 5 */:
                    if (v(abstractC0168a0, obj, r3) && AbstractC0181e1.g(j3, abstractC0168a0) == AbstractC0181e1.g(j3, obj)) {
                        continue;
                    }
                    return false;
                case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (v(abstractC0168a0, obj, r3) && AbstractC0181e1.f(j3, abstractC0168a0) == AbstractC0181e1.f(j3, obj)) {
                        continue;
                    }
                    return false;
                case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (v(abstractC0168a0, obj, r3)) {
                        AbstractC0178d1 abstractC0178d13 = AbstractC0181e1.f2899c;
                        if (abstractC0178d13.g(j3, abstractC0168a0) == abstractC0178d13.g(j3, obj)) {
                            continue;
                        }
                    }
                    return false;
                case 8:
                    if (v(abstractC0168a0, obj, r3) && O0.v(AbstractC0181e1.i(j3, abstractC0168a0), AbstractC0181e1.i(j3, obj))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (v(abstractC0168a0, obj, r3) && O0.v(AbstractC0181e1.i(j3, abstractC0168a0), AbstractC0181e1.i(j3, obj))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (v(abstractC0168a0, obj, r3) && O0.v(AbstractC0181e1.i(j3, abstractC0168a0), AbstractC0181e1.i(j3, obj))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (v(abstractC0168a0, obj, r3) && AbstractC0181e1.f(j3, abstractC0168a0) == AbstractC0181e1.f(j3, obj)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (v(abstractC0168a0, obj, r3) && AbstractC0181e1.f(j3, abstractC0168a0) == AbstractC0181e1.f(j3, obj)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (v(abstractC0168a0, obj, r3) && AbstractC0181e1.f(j3, abstractC0168a0) == AbstractC0181e1.f(j3, obj)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (v(abstractC0168a0, obj, r3) && AbstractC0181e1.g(j3, abstractC0168a0) == AbstractC0181e1.g(j3, obj)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (v(abstractC0168a0, obj, r3) && AbstractC0181e1.f(j3, abstractC0168a0) == AbstractC0181e1.f(j3, obj)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (v(abstractC0168a0, obj, r3) && AbstractC0181e1.g(j3, abstractC0168a0) == AbstractC0181e1.g(j3, obj)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (v(abstractC0168a0, obj, r3) && O0.v(AbstractC0181e1.i(j3, abstractC0168a0), AbstractC0181e1.i(j3, obj))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    v3 = O0.v(AbstractC0181e1.i(j3, abstractC0168a0), AbstractC0181e1.i(j3, obj));
                    break;
                case 50:
                    v3 = O0.v(AbstractC0181e1.i(j3, abstractC0168a0), AbstractC0181e1.i(j3, obj));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case RecognitionOptions.EAN_8 /* 64 */:
                case 65:
                case 66:
                case 67:
                case 68:
                    long j4 = r02[r3 + 2] & 1048575;
                    if (AbstractC0181e1.f(j4, abstractC0168a0) == AbstractC0181e1.f(j4, obj) && O0.v(AbstractC0181e1.i(j3, abstractC0168a0), AbstractC0181e1.i(j3, obj))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!v3) {
                return false;
            }
        }
        this.f2779k.getClass();
        if (!abstractC0168a0.zzc.equals(((AbstractC0168a0) obj).zzc)) {
            return false;
        }
        if (this.f2775f) {
            this.f2780l.getClass();
            return ((X) abstractC0168a0).zza.equals(((X) obj).zza);
        }
        return true;
    }

    public final InterfaceC0180e0 j(int r22) {
        int r23 = r22 / 3;
        return (InterfaceC0180e0) this.f2771b[r23 + r23 + 1];
    }

    public final N0 k(int r4) {
        int r42 = r4 / 3;
        int r43 = r42 + r42;
        Object[] objArr = this.f2771b;
        N0 n02 = (N0) objArr[r43];
        if (n02 != null) {
            return n02;
        }
        N0 b3 = H0.f2796c.b((Class) objArr[r43 + 1]);
        objArr[r43] = b3;
        return b3;
    }

    public final Object l(int r22) {
        int r23 = r22 / 3;
        return this.f2771b[r23 + r23];
    }

    public final Object m(int r4, Object obj) {
        N0 k3 = k(r4);
        int K3 = K(r4) & 1048575;
        if (!w(r4, obj)) {
            return k3.c();
        }
        Object object = f2769o.getObject(obj, K3);
        if (x(object)) {
            return object;
        }
        Object c4 = k3.c();
        if (object != null) {
            k3.d(c4, object);
        }
        return c4;
    }

    public final Object n(Object obj, int r5, int r6) {
        N0 k3 = k(r6);
        if (!y(obj, r5, r6)) {
            return k3.c();
        }
        Object object = f2769o.getObject(obj, K(r6) & 1048575);
        if (x(object)) {
            return object;
        }
        Object c4 = k3.c();
        if (object != null) {
            k3.d(c4, object);
        }
        return c4;
    }

    public final void q(int r6, Object obj, Object obj2) {
        if (!w(r6, obj2)) {
            return;
        }
        Unsafe unsafe = f2769o;
        long K3 = K(r6) & 1048575;
        Object object = unsafe.getObject(obj2, K3);
        if (object != null) {
            N0 k3 = k(r6);
            if (!w(r6, obj)) {
                if (!x(object)) {
                    unsafe.putObject(obj, K3, object);
                } else {
                    Object c4 = k3.c();
                    k3.d(c4, object);
                    unsafe.putObject(obj, K3, c4);
                }
                s(r6, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, K3);
            if (!x(object2)) {
                Object c5 = k3.c();
                k3.d(c5, object2);
                unsafe.putObject(obj, K3, c5);
                object2 = c5;
            }
            k3.d(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.f2770a[r6] + " is present but null: " + obj2.toString());
    }

    public final void r(int r9, Object obj, Object obj2) {
        int[] r02 = this.f2770a;
        int r12 = r02[r9];
        if (!y(obj2, r12, r9)) {
            return;
        }
        Unsafe unsafe = f2769o;
        long K3 = K(r9) & 1048575;
        Object object = unsafe.getObject(obj2, K3);
        if (object != null) {
            N0 k3 = k(r9);
            if (!y(obj, r12, r9)) {
                if (!x(object)) {
                    unsafe.putObject(obj, K3, object);
                } else {
                    Object c4 = k3.c();
                    k3.d(c4, object);
                    unsafe.putObject(obj, K3, c4);
                }
                AbstractC0181e1.n(r12, r02[r9 + 2] & 1048575, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, K3);
            if (!x(object2)) {
                Object c5 = k3.c();
                k3.d(c5, object2);
                unsafe.putObject(obj, K3, c5);
                object2 = c5;
            }
            k3.d(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + r02[r9] + " is present but null: " + obj2.toString());
    }

    public final void s(int r6, Object obj) {
        int r62 = this.f2770a[r6 + 2];
        long j3 = 1048575 & r62;
        if (j3 == 1048575) {
            return;
        }
        AbstractC0181e1.n((1 << (r62 >>> 20)) | AbstractC0181e1.f(j3, obj), j3, obj);
    }

    public final void t(int r4, Object obj, Object obj2) {
        f2769o.putObject(obj, K(r4) & 1048575, obj2);
        s(r4, obj);
    }

    public final void u(Object obj, int r7, int r8, Object obj2) {
        f2769o.putObject(obj, K(r8) & 1048575, obj2);
        AbstractC0181e1.n(r7, this.f2770a[r8 + 2] & 1048575, obj);
    }

    public final boolean v(AbstractC0168a0 abstractC0168a0, Object obj, int r3) {
        if (w(r3, abstractC0168a0) == w(r3, obj)) {
            return true;
        }
        return false;
    }

    public final boolean w(int r10, Object obj) {
        int r02 = this.f2770a[r10 + 2];
        long j3 = r02 & 1048575;
        if (j3 == 1048575) {
            int K3 = K(r10);
            long j4 = K3 & 1048575;
            switch (J(K3)) {
                case RecognitionOptions.UNRECOGNIZED /* 0 */:
                    if (Double.doubleToRawLongBits(AbstractC0181e1.f2899c.a(j4, obj)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(AbstractC0181e1.f2899c.b(j4, obj)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (AbstractC0181e1.g(j4, obj) == 0) {
                        return false;
                    }
                    return true;
                case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                    if (AbstractC0181e1.g(j4, obj) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (AbstractC0181e1.f(j4, obj) == 0) {
                        return false;
                    }
                    return true;
                case q0.k.STRING_FIELD_NUMBER /* 5 */:
                    if (AbstractC0181e1.g(j4, obj) == 0) {
                        return false;
                    }
                    return true;
                case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (AbstractC0181e1.f(j4, obj) == 0) {
                        return false;
                    }
                    return true;
                case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    return AbstractC0181e1.f2899c.g(j4, obj);
                case 8:
                    Object i3 = AbstractC0181e1.i(j4, obj);
                    if (i3 instanceof String) {
                        if (((String) i3).isEmpty()) {
                            return false;
                        }
                        return true;
                    } else if (i3 instanceof L) {
                        if (L.f2812K.equals(i3)) {
                            return false;
                        }
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (AbstractC0181e1.i(j4, obj) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (L.f2812K.equals(AbstractC0181e1.i(j4, obj))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (AbstractC0181e1.f(j4, obj) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (AbstractC0181e1.f(j4, obj) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (AbstractC0181e1.f(j4, obj) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (AbstractC0181e1.g(j4, obj) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (AbstractC0181e1.f(j4, obj) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (AbstractC0181e1.g(j4, obj) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (AbstractC0181e1.i(j4, obj) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (r02 >>> 20)) & AbstractC0181e1.f(j3, obj)) == 0) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean y(Object obj, int r4, int r5) {
        if (AbstractC0181e1.f(this.f2770a[r5 + 2] & 1048575, obj) == r4) {
            return true;
        }
        return false;
    }
}
