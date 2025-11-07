package androidx.datastore.preferences.protobuf;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class Z implements i0 {

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f2316n = new int[0];

    /* renamed from: o  reason: collision with root package name */
    public static final Unsafe f2317o = v0.i();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f2318a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f2319b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2320c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2321d;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC0098a f2322e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f2323f;
    public final int[] g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2324h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2325i;

    /* renamed from: j  reason: collision with root package name */
    public final C0101b0 f2326j;

    /* renamed from: k  reason: collision with root package name */
    public final L f2327k;

    /* renamed from: l  reason: collision with root package name */
    public final q0 f2328l;

    /* renamed from: m  reason: collision with root package name */
    public final V f2329m;

    public Z(int[] r12, Object[] objArr, int r3, int r4, AbstractC0098a abstractC0098a, int[] r6, int r7, int r8, C0101b0 c0101b0, L l3, q0 q0Var, r rVar, V v3) {
        this.f2318a = r12;
        this.f2319b = objArr;
        this.f2320c = r3;
        this.f2321d = r4;
        this.f2323f = abstractC0098a instanceof D;
        this.g = r6;
        this.f2324h = r7;
        this.f2325i = r8;
        this.f2326j = c0101b0;
        this.f2327k = l3;
        this.f2328l = q0Var;
        this.f2322e = abstractC0098a;
        this.f2329m = v3;
    }

    public static long A(long j3, Object obj) {
        return ((Long) v0.f2425c.h(j3, obj)).longValue();
    }

    public static Field G(Class cls, String str) {
        Field[] declaredFields;
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            for (Field field : cls.getDeclaredFields()) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static int L(int r12) {
        return (r12 & 267386880) >>> 20;
    }

    public static void P(int r12, Object obj, Q q3) {
        if (obj instanceof String) {
            ((C0116n) q3.f2306a).P((String) obj, r12);
            return;
        }
        q3.b(r12, (C0111h) obj);
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof D) {
            return ((D) obj).i();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x026e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.datastore.preferences.protobuf.Z x(androidx.datastore.preferences.protobuf.h0 r32, androidx.datastore.preferences.protobuf.C0101b0 r33, androidx.datastore.preferences.protobuf.L r34, androidx.datastore.preferences.protobuf.q0 r35, androidx.datastore.preferences.protobuf.r r36, androidx.datastore.preferences.protobuf.V r37) {
        /*
            Method dump skipped, instructions count: 1014
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Z.x(androidx.datastore.preferences.protobuf.h0, androidx.datastore.preferences.protobuf.b0, androidx.datastore.preferences.protobuf.L, androidx.datastore.preferences.protobuf.q0, androidx.datastore.preferences.protobuf.r, androidx.datastore.preferences.protobuf.V):androidx.datastore.preferences.protobuf.Z");
    }

    public static long y(int r22) {
        return r22 & 1048575;
    }

    public static int z(long j3, Object obj) {
        return ((Integer) v0.f2425c.h(j3, obj)).intValue();
    }

    public final int B(int r8) {
        if (r8 < this.f2320c || r8 > this.f2321d) {
            return -1;
        }
        int[] r02 = this.f2318a;
        int length = (r02.length / 3) - 1;
        int r3 = 0;
        while (r3 <= length) {
            int r4 = (length + r3) >>> 1;
            int r5 = r4 * 3;
            int r6 = r02[r5];
            if (r8 == r6) {
                return r5;
            }
            if (r8 < r6) {
                length = r4 - 1;
            } else {
                r3 = r4 + 1;
            }
        }
        return -1;
    }

    public final void C(Object obj, long j3, C0115m c0115m, i0 i0Var, C0119q c0119q) {
        int u3;
        this.f2327k.getClass();
        F b3 = L.b(j3, obj);
        int r3 = c0115m.f2387b;
        if ((r3 & 7) == 3) {
            do {
                D g = i0Var.g();
                c0115m.b(g, i0Var, c0119q);
                i0Var.h(g);
                b3.add(g);
                AbstractC0113k abstractC0113k = c0115m.f2386a;
                if (!abstractC0113k.c() && c0115m.f2389d == 0) {
                    u3 = abstractC0113k.u();
                } else {
                    return;
                }
            } while (u3 == r3);
            c0115m.f2389d = u3;
            return;
        }
        throw I.b();
    }

    public final void D(Object obj, int r4, C0115m c0115m, i0 i0Var, C0119q c0119q) {
        int u3;
        this.f2327k.getClass();
        F b3 = L.b(r4 & 1048575, obj);
        int r42 = c0115m.f2387b;
        if ((r42 & 7) == 2) {
            do {
                D g = i0Var.g();
                c0115m.c(g, i0Var, c0119q);
                i0Var.h(g);
                b3.add(g);
                AbstractC0113k abstractC0113k = c0115m.f2386a;
                if (!abstractC0113k.c() && c0115m.f2389d == 0) {
                    u3 = abstractC0113k.u();
                } else {
                    return;
                }
            } while (u3 == r42);
            c0115m.f2389d = u3;
            return;
        }
        throw I.b();
    }

    public final void E(int r5, C0115m c0115m, Object obj) {
        boolean z3;
        if ((536870912 & r5) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            c0115m.w(2);
            v0.o(r5 & 1048575, obj, c0115m.f2386a.t());
        } else if (this.f2323f) {
            c0115m.w(2);
            v0.o(r5 & 1048575, obj, c0115m.f2386a.s());
        } else {
            v0.o(r5 & 1048575, obj, c0115m.e());
        }
    }

    public final void F(int r6, C0115m c0115m, Object obj) {
        boolean z3;
        if ((536870912 & r6) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        L l3 = this.f2327k;
        if (z3) {
            l3.getClass();
            c0115m.s(L.b(r6 & 1048575, obj), true);
            return;
        }
        l3.getClass();
        c0115m.s(L.b(r6 & 1048575, obj), false);
    }

    public final void H(int r6, Object obj) {
        int r62 = this.f2318a[r6 + 2];
        long j3 = 1048575 & r62;
        if (j3 == 1048575) {
            return;
        }
        v0.m((1 << (r62 >>> 20)) | v0.f2425c.f(j3, obj), j3, obj);
    }

    public final void I(Object obj, int r4, int r5) {
        v0.m(r4, this.f2318a[r5 + 2] & 1048575, obj);
    }

    public final void J(Object obj, int r5, AbstractC0098a abstractC0098a) {
        f2317o.putObject(obj, M(r5) & 1048575, abstractC0098a);
        H(r5, obj);
    }

    public final void K(Object obj, int r5, int r6, AbstractC0098a abstractC0098a) {
        f2317o.putObject(obj, M(r6) & 1048575, abstractC0098a);
        I(obj, r5, r6);
    }

    public final int M(int r22) {
        return this.f2318a[r22 + 1];
    }

    public final void N(Object obj, Q q3) {
        int r13;
        int r17;
        int r18;
        int[] r16;
        int r19;
        int[] r9 = this.f2318a;
        int length = r9.length;
        Unsafe unsafe = f2317o;
        int r02 = 1048575;
        int r12 = 0;
        int r14 = 0;
        while (r14 < length) {
            int M3 = M(r14);
            int r15 = r9[r14];
            int L3 = L(M3);
            if (L3 <= 17) {
                int r4 = r9[r14 + 2];
                int r132 = r4 & 1048575;
                if (r132 != r02) {
                    if (r132 == 1048575) {
                        r12 = 0;
                    } else {
                        r12 = unsafe.getInt(obj, r132);
                    }
                    r02 = r132;
                }
                r13 = r02;
                r17 = r12;
                r18 = 1 << (r4 >>> 20);
            } else {
                r13 = r02;
                r17 = r12;
                r18 = 0;
            }
            long j3 = M3 & 1048575;
            switch (L3) {
                case RecognitionOptions.UNRECOGNIZED /* 0 */:
                    r16 = r9;
                    r19 = length;
                    if (o(obj, r14, r13, r17, r18)) {
                        q3.c(r15, v0.f2425c.d(j3, obj));
                        continue;
                    }
                    r14 += 3;
                    r02 = r13;
                    r9 = r16;
                    r12 = r17;
                    length = r19;
                case 1:
                    r16 = r9;
                    r19 = length;
                    if (o(obj, r14, r13, r17, r18)) {
                        q3.g(r15, v0.f2425c.e(j3, obj));
                    } else {
                        continue;
                    }
                    r14 += 3;
                    r02 = r13;
                    r9 = r16;
                    r12 = r17;
                    length = r19;
                case 2:
                    r16 = r9;
                    r19 = length;
                    if (o(obj, r14, r13, r17, r18)) {
                        q3.j(unsafe.getLong(obj, j3), r15);
                    } else {
                        continue;
                    }
                    r14 += 3;
                    r02 = r13;
                    r9 = r16;
                    r12 = r17;
                    length = r19;
                case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                    r16 = r9;
                    r19 = length;
                    if (o(obj, r14, r13, r17, r18)) {
                        q3.q(unsafe.getLong(obj, j3), r15);
                    } else {
                        continue;
                    }
                    r14 += 3;
                    r02 = r13;
                    r9 = r16;
                    r12 = r17;
                    length = r19;
                case 4:
                    r16 = r9;
                    r19 = length;
                    if (o(obj, r14, r13, r17, r18)) {
                        q3.i(r15, unsafe.getInt(obj, j3));
                    } else {
                        continue;
                    }
                    r14 += 3;
                    r02 = r13;
                    r9 = r16;
                    r12 = r17;
                    length = r19;
                case q0.k.STRING_FIELD_NUMBER /* 5 */:
                    r16 = r9;
                    r19 = length;
                    if (o(obj, r14, r13, r17, r18)) {
                        q3.f(unsafe.getLong(obj, j3), r15);
                    } else {
                        continue;
                    }
                    r14 += 3;
                    r02 = r13;
                    r9 = r16;
                    r12 = r17;
                    length = r19;
                case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    r16 = r9;
                    r19 = length;
                    if (o(obj, r14, r13, r17, r18)) {
                        q3.e(r15, unsafe.getInt(obj, j3));
                    } else {
                        continue;
                    }
                    r14 += 3;
                    r02 = r13;
                    r9 = r16;
                    r12 = r17;
                    length = r19;
                case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    r16 = r9;
                    r19 = length;
                    if (o(obj, r14, r13, r17, r18)) {
                        q3.a(r15, v0.f2425c.c(j3, obj));
                    } else {
                        continue;
                    }
                    r14 += 3;
                    r02 = r13;
                    r9 = r16;
                    r12 = r17;
                    length = r19;
                case 8:
                    r16 = r9;
                    r19 = length;
                    if (o(obj, r14, r13, r17, r18)) {
                        P(r15, unsafe.getObject(obj, j3), q3);
                    } else {
                        continue;
                    }
                    r14 += 3;
                    r02 = r13;
                    r9 = r16;
                    r12 = r17;
                    length = r19;
                case 9:
                    r16 = r9;
                    r19 = length;
                    if (o(obj, r14, r13, r17, r18)) {
                        q3.k(r15, unsafe.getObject(obj, j3), m(r14));
                    } else {
                        continue;
                    }
                    r14 += 3;
                    r02 = r13;
                    r9 = r16;
                    r12 = r17;
                    length = r19;
                case 10:
                    r16 = r9;
                    r19 = length;
                    if (o(obj, r14, r13, r17, r18)) {
                        q3.b(r15, (C0111h) unsafe.getObject(obj, j3));
                    } else {
                        continue;
                    }
                    r14 += 3;
                    r02 = r13;
                    r9 = r16;
                    r12 = r17;
                    length = r19;
                case 11:
                    r16 = r9;
                    r19 = length;
                    if (o(obj, r14, r13, r17, r18)) {
                        q3.p(r15, unsafe.getInt(obj, j3));
                    } else {
                        continue;
                    }
                    r14 += 3;
                    r02 = r13;
                    r9 = r16;
                    r12 = r17;
                    length = r19;
                case 12:
                    r16 = r9;
                    r19 = length;
                    if (o(obj, r14, r13, r17, r18)) {
                        q3.d(r15, unsafe.getInt(obj, j3));
                    } else {
                        continue;
                    }
                    r14 += 3;
                    r02 = r13;
                    r9 = r16;
                    r12 = r17;
                    length = r19;
                case 13:
                    r16 = r9;
                    r19 = length;
                    if (o(obj, r14, r13, r17, r18)) {
                        q3.l(r15, unsafe.getInt(obj, j3));
                    } else {
                        continue;
                    }
                    r14 += 3;
                    r02 = r13;
                    r9 = r16;
                    r12 = r17;
                    length = r19;
                case 14:
                    r16 = r9;
                    r19 = length;
                    if (o(obj, r14, r13, r17, r18)) {
                        q3.m(unsafe.getLong(obj, j3), r15);
                    } else {
                        continue;
                    }
                    r14 += 3;
                    r02 = r13;
                    r9 = r16;
                    r12 = r17;
                    length = r19;
                case 15:
                    r16 = r9;
                    r19 = length;
                    if (o(obj, r14, r13, r17, r18)) {
                        q3.n(r15, unsafe.getInt(obj, j3));
                    } else {
                        continue;
                    }
                    r14 += 3;
                    r02 = r13;
                    r9 = r16;
                    r12 = r17;
                    length = r19;
                case 16:
                    r16 = r9;
                    r19 = length;
                    if (o(obj, r14, r13, r17, r18)) {
                        q3.o(unsafe.getLong(obj, j3), r15);
                    } else {
                        continue;
                    }
                    r14 += 3;
                    r02 = r13;
                    r9 = r16;
                    r12 = r17;
                    length = r19;
                case 17:
                    r16 = r9;
                    r19 = length;
                    if (o(obj, r14, r13, r17, r18)) {
                        q3.h(r15, unsafe.getObject(obj, j3), m(r14));
                    } else {
                        continue;
                    }
                    r14 += 3;
                    r02 = r13;
                    r9 = r16;
                    r12 = r17;
                    length = r19;
                case 18:
                    j0.E(r9[r14], (List) unsafe.getObject(obj, j3), q3, false);
                    break;
                case 19:
                    j0.I(r9[r14], (List) unsafe.getObject(obj, j3), q3, false);
                    break;
                case 20:
                    j0.L(r9[r14], (List) unsafe.getObject(obj, j3), q3, false);
                    break;
                case 21:
                    j0.T(r9[r14], (List) unsafe.getObject(obj, j3), q3, false);
                    break;
                case 22:
                    j0.K(r9[r14], (List) unsafe.getObject(obj, j3), q3, false);
                    break;
                case 23:
                    j0.H(r9[r14], (List) unsafe.getObject(obj, j3), q3, false);
                    break;
                case 24:
                    j0.G(r9[r14], (List) unsafe.getObject(obj, j3), q3, false);
                    break;
                case 25:
                    j0.C(r9[r14], (List) unsafe.getObject(obj, j3), q3, false);
                    break;
                case 26:
                    j0.R(r9[r14], (List) unsafe.getObject(obj, j3), q3);
                    break;
                case 27:
                    j0.M(r9[r14], (List) unsafe.getObject(obj, j3), q3, m(r14));
                    break;
                case 28:
                    j0.D(r9[r14], (List) unsafe.getObject(obj, j3), q3);
                    break;
                case 29:
                    j0.S(r9[r14], (List) unsafe.getObject(obj, j3), q3, false);
                    break;
                case 30:
                    j0.F(r9[r14], (List) unsafe.getObject(obj, j3), q3, false);
                    break;
                case 31:
                    j0.N(r9[r14], (List) unsafe.getObject(obj, j3), q3, false);
                    break;
                case 32:
                    j0.O(r9[r14], (List) unsafe.getObject(obj, j3), q3, false);
                    break;
                case 33:
                    j0.P(r9[r14], (List) unsafe.getObject(obj, j3), q3, false);
                    break;
                case 34:
                    j0.Q(r9[r14], (List) unsafe.getObject(obj, j3), q3, false);
                    break;
                case 35:
                    j0.E(r9[r14], (List) unsafe.getObject(obj, j3), q3, true);
                    break;
                case 36:
                    j0.I(r9[r14], (List) unsafe.getObject(obj, j3), q3, true);
                    break;
                case 37:
                    j0.L(r9[r14], (List) unsafe.getObject(obj, j3), q3, true);
                    break;
                case 38:
                    j0.T(r9[r14], (List) unsafe.getObject(obj, j3), q3, true);
                    break;
                case 39:
                    j0.K(r9[r14], (List) unsafe.getObject(obj, j3), q3, true);
                    break;
                case 40:
                    j0.H(r9[r14], (List) unsafe.getObject(obj, j3), q3, true);
                    break;
                case 41:
                    j0.G(r9[r14], (List) unsafe.getObject(obj, j3), q3, true);
                    break;
                case 42:
                    j0.C(r9[r14], (List) unsafe.getObject(obj, j3), q3, true);
                    break;
                case 43:
                    j0.S(r9[r14], (List) unsafe.getObject(obj, j3), q3, true);
                    break;
                case 44:
                    j0.F(r9[r14], (List) unsafe.getObject(obj, j3), q3, true);
                    break;
                case 45:
                    j0.N(r9[r14], (List) unsafe.getObject(obj, j3), q3, true);
                    break;
                case 46:
                    j0.O(r9[r14], (List) unsafe.getObject(obj, j3), q3, true);
                    break;
                case 47:
                    j0.P(r9[r14], (List) unsafe.getObject(obj, j3), q3, true);
                    break;
                case 48:
                    j0.Q(r9[r14], (List) unsafe.getObject(obj, j3), q3, true);
                    break;
                case 49:
                    j0.J(r9[r14], (List) unsafe.getObject(obj, j3), q3, m(r14));
                    break;
                case 50:
                    O(q3, r15, unsafe.getObject(obj, j3), r14);
                    break;
                case 51:
                    if (q(obj, r15, r14)) {
                        q3.c(r15, ((Double) v0.f2425c.h(j3, obj)).doubleValue());
                        break;
                    }
                    break;
                case 52:
                    if (q(obj, r15, r14)) {
                        q3.g(r15, ((Float) v0.f2425c.h(j3, obj)).floatValue());
                        break;
                    }
                    break;
                case 53:
                    if (q(obj, r15, r14)) {
                        q3.j(A(j3, obj), r15);
                        break;
                    }
                    break;
                case 54:
                    if (q(obj, r15, r14)) {
                        q3.q(A(j3, obj), r15);
                        break;
                    }
                    break;
                case 55:
                    if (q(obj, r15, r14)) {
                        q3.i(r15, z(j3, obj));
                        break;
                    }
                    break;
                case 56:
                    if (q(obj, r15, r14)) {
                        q3.f(A(j3, obj), r15);
                        break;
                    }
                    break;
                case 57:
                    if (q(obj, r15, r14)) {
                        q3.e(r15, z(j3, obj));
                        break;
                    }
                    break;
                case 58:
                    if (q(obj, r15, r14)) {
                        q3.a(r15, ((Boolean) v0.f2425c.h(j3, obj)).booleanValue());
                        break;
                    }
                    break;
                case 59:
                    if (q(obj, r15, r14)) {
                        P(r15, unsafe.getObject(obj, j3), q3);
                        break;
                    }
                    break;
                case 60:
                    if (q(obj, r15, r14)) {
                        q3.k(r15, unsafe.getObject(obj, j3), m(r14));
                        break;
                    }
                    break;
                case 61:
                    if (q(obj, r15, r14)) {
                        q3.b(r15, (C0111h) unsafe.getObject(obj, j3));
                        break;
                    }
                    break;
                case 62:
                    if (q(obj, r15, r14)) {
                        q3.p(r15, z(j3, obj));
                        break;
                    }
                    break;
                case 63:
                    if (q(obj, r15, r14)) {
                        q3.d(r15, z(j3, obj));
                        break;
                    }
                    break;
                case RecognitionOptions.EAN_8 /* 64 */:
                    if (q(obj, r15, r14)) {
                        q3.l(r15, z(j3, obj));
                        break;
                    }
                    break;
                case 65:
                    if (q(obj, r15, r14)) {
                        q3.m(A(j3, obj), r15);
                        break;
                    }
                    break;
                case 66:
                    if (q(obj, r15, r14)) {
                        q3.n(r15, z(j3, obj));
                        break;
                    }
                    break;
                case 67:
                    if (q(obj, r15, r14)) {
                        q3.o(A(j3, obj), r15);
                        break;
                    }
                    break;
                case 68:
                    if (q(obj, r15, r14)) {
                        q3.h(r15, unsafe.getObject(obj, j3), m(r14));
                        break;
                    }
                    break;
            }
            r16 = r9;
            r19 = length;
            r14 += 3;
            r02 = r13;
            r9 = r16;
            r12 = r17;
            length = r19;
        }
        this.f2328l.getClass();
        ((D) obj).unknownFields.d(q3);
    }

    public final void O(Q q3, int r7, Object obj, int r9) {
        if (obj != null) {
            Object obj2 = this.f2319b[(r9 / 3) * 2];
            this.f2329m.getClass();
            S s3 = ((T) obj2).f2310a;
            C0116n c0116n = (C0116n) q3.f2306a;
            c0116n.getClass();
            for (Map.Entry entry : ((U) obj).entrySet()) {
                c0116n.R(r7, 2);
                c0116n.T(T.a(s3, entry.getKey(), entry.getValue()));
                Object key = entry.getKey();
                Object value = entry.getValue();
                C0122u.b(c0116n, s3.f2307a, 1, key);
                C0122u.b(c0116n, s3.f2308b, 2, value);
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final boolean a(Object obj) {
        int r15;
        int r16;
        int r02 = 1048575;
        int r12 = 0;
        int r10 = 0;
        while (r10 < this.f2324h) {
            int r11 = this.g[r10];
            int[] r22 = this.f2318a;
            int r122 = r22[r11];
            int M3 = M(r11);
            int r23 = r22[r11 + 2];
            int r4 = r23 & 1048575;
            int r14 = 1 << (r23 >>> 20);
            if (r4 != r02) {
                if (r4 != 1048575) {
                    r12 = f2317o.getInt(obj, r4);
                }
                r16 = r12;
                r15 = r4;
            } else {
                r15 = r02;
                r16 = r12;
            }
            if ((268435456 & M3) != 0 && !o(obj, r11, r15, r16, r14)) {
                return false;
            }
            int L3 = L(M3);
            if (L3 != 9 && L3 != 17) {
                if (L3 != 27) {
                    if (L3 != 60 && L3 != 68) {
                        if (L3 != 49) {
                            if (L3 != 50) {
                                continue;
                            } else {
                                Object h3 = v0.f2425c.h(M3 & 1048575, obj);
                                this.f2329m.getClass();
                                U u3 = (U) h3;
                                if (u3.isEmpty()) {
                                    continue;
                                } else {
                                    if (((T) this.f2319b[(r11 / 3) * 2]).f2310a.f2308b.a() != E0.MESSAGE) {
                                        continue;
                                    } else {
                                        i0 i0Var = null;
                                        for (Object obj2 : u3.values()) {
                                            if (i0Var == null) {
                                                i0Var = C0109f0.f2342c.a(obj2.getClass());
                                            }
                                            if (!i0Var.a(obj2)) {
                                                return false;
                                            }
                                        }
                                        continue;
                                    }
                                }
                            }
                        }
                    } else if (q(obj, r122, r11)) {
                        if (!m(r11).a(v0.f2425c.h(M3 & 1048575, obj))) {
                            return false;
                        }
                    } else {
                        continue;
                    }
                }
                List list = (List) v0.f2425c.h(M3 & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    i0 m3 = m(r11);
                    for (int r24 = 0; r24 < list.size(); r24++) {
                        if (!m3.a(list.get(r24))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (o(obj, r11, r15, r16, r14)) {
                if (!m(r11).a(v0.f2425c.h(M3 & 1048575, obj))) {
                    return false;
                }
            } else {
                continue;
            }
            r10++;
            r02 = r15;
            r12 = r16;
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void b(Object obj, C0115m c0115m, C0119q c0119q) {
        c0119q.getClass();
        if (p(obj)) {
            r(this.f2328l, obj, c0115m, c0119q);
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void c(Object obj, Object obj2) {
        if (p(obj)) {
            obj2.getClass();
            int r02 = 0;
            while (true) {
                int[] r12 = this.f2318a;
                if (r02 < r12.length) {
                    int M3 = M(r02);
                    long j3 = 1048575 & M3;
                    int r13 = r12[r02];
                    switch (L(M3)) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            if (!n(r02, obj2)) {
                                break;
                            } else {
                                u0 u0Var = v0.f2425c;
                                u0Var.l(obj, j3, u0Var.d(j3, obj2));
                                H(r02, obj);
                                break;
                            }
                        case 1:
                            if (!n(r02, obj2)) {
                                break;
                            } else {
                                u0 u0Var2 = v0.f2425c;
                                u0Var2.m(obj, j3, u0Var2.e(j3, obj2));
                                H(r02, obj);
                                break;
                            }
                        case 2:
                            if (!n(r02, obj2)) {
                                break;
                            } else {
                                v0.n(obj, j3, v0.f2425c.g(j3, obj2));
                                H(r02, obj);
                                break;
                            }
                        case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                            if (!n(r02, obj2)) {
                                break;
                            } else {
                                v0.n(obj, j3, v0.f2425c.g(j3, obj2));
                                H(r02, obj);
                                break;
                            }
                        case 4:
                            if (!n(r02, obj2)) {
                                break;
                            } else {
                                v0.m(v0.f2425c.f(j3, obj2), j3, obj);
                                H(r02, obj);
                                break;
                            }
                        case q0.k.STRING_FIELD_NUMBER /* 5 */:
                            if (!n(r02, obj2)) {
                                break;
                            } else {
                                v0.n(obj, j3, v0.f2425c.g(j3, obj2));
                                H(r02, obj);
                                break;
                            }
                        case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            if (!n(r02, obj2)) {
                                break;
                            } else {
                                v0.m(v0.f2425c.f(j3, obj2), j3, obj);
                                H(r02, obj);
                                break;
                            }
                        case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            if (!n(r02, obj2)) {
                                break;
                            } else {
                                u0 u0Var3 = v0.f2425c;
                                u0Var3.j(obj, j3, u0Var3.c(j3, obj2));
                                H(r02, obj);
                                break;
                            }
                        case 8:
                            if (!n(r02, obj2)) {
                                break;
                            } else {
                                v0.o(j3, obj, v0.f2425c.h(j3, obj2));
                                H(r02, obj);
                                break;
                            }
                        case 9:
                            t(r02, obj, obj2);
                            break;
                        case 10:
                            if (!n(r02, obj2)) {
                                break;
                            } else {
                                v0.o(j3, obj, v0.f2425c.h(j3, obj2));
                                H(r02, obj);
                                break;
                            }
                        case 11:
                            if (!n(r02, obj2)) {
                                break;
                            } else {
                                v0.m(v0.f2425c.f(j3, obj2), j3, obj);
                                H(r02, obj);
                                break;
                            }
                        case 12:
                            if (!n(r02, obj2)) {
                                break;
                            } else {
                                v0.m(v0.f2425c.f(j3, obj2), j3, obj);
                                H(r02, obj);
                                break;
                            }
                        case 13:
                            if (!n(r02, obj2)) {
                                break;
                            } else {
                                v0.m(v0.f2425c.f(j3, obj2), j3, obj);
                                H(r02, obj);
                                break;
                            }
                        case 14:
                            if (!n(r02, obj2)) {
                                break;
                            } else {
                                v0.n(obj, j3, v0.f2425c.g(j3, obj2));
                                H(r02, obj);
                                break;
                            }
                        case 15:
                            if (!n(r02, obj2)) {
                                break;
                            } else {
                                v0.m(v0.f2425c.f(j3, obj2), j3, obj);
                                H(r02, obj);
                                break;
                            }
                        case 16:
                            if (!n(r02, obj2)) {
                                break;
                            } else {
                                v0.n(obj, j3, v0.f2425c.g(j3, obj2));
                                H(r02, obj);
                                break;
                            }
                        case 17:
                            t(r02, obj, obj2);
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
                            this.f2327k.getClass();
                            u0 u0Var4 = v0.f2425c;
                            F f2 = (F) u0Var4.h(j3, obj);
                            F f4 = (F) u0Var4.h(j3, obj2);
                            int size = f2.size();
                            int size2 = f4.size();
                            if (size > 0 && size2 > 0) {
                                if (!((AbstractC0100b) f2).f2333J) {
                                    f2 = ((g0) f2).i(size2 + size);
                                }
                                f2.addAll(f4);
                            }
                            if (size > 0) {
                                f4 = f2;
                            }
                            v0.o(j3, obj, f4);
                            break;
                        case 50:
                            Class cls = j0.f2371a;
                            u0 u0Var5 = v0.f2425c;
                            Object h3 = u0Var5.h(j3, obj);
                            Object h4 = u0Var5.h(j3, obj2);
                            this.f2329m.getClass();
                            v0.o(j3, obj, V.b(h3, h4));
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
                            if (!q(obj2, r13, r02)) {
                                break;
                            } else {
                                v0.o(j3, obj, v0.f2425c.h(j3, obj2));
                                I(obj, r13, r02);
                                break;
                            }
                        case 60:
                            u(r02, obj, obj2);
                            break;
                        case 61:
                        case 62:
                        case 63:
                        case RecognitionOptions.EAN_8 /* 64 */:
                        case 65:
                        case 66:
                        case 67:
                            if (!q(obj2, r13, r02)) {
                                break;
                            } else {
                                v0.o(j3, obj, v0.f2425c.h(j3, obj2));
                                I(obj, r13, r02);
                                break;
                            }
                        case 68:
                            u(r02, obj, obj2);
                            break;
                    }
                    r02 += 3;
                } else {
                    j0.A(this.f2328l, obj, obj2);
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Mutating immutable message: " + obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void d(Object obj, Q q3) {
        q3.getClass();
        if (F0.ASCENDING == F0.DESCENDING) {
            this.f2328l.getClass();
            ((D) obj).unknownFields.d(q3);
            int[] r02 = this.f2318a;
            for (int length = r02.length - 3; length >= 0; length -= 3) {
                int M3 = M(length);
                int r3 = r02[length];
                switch (L(M3)) {
                    case RecognitionOptions.UNRECOGNIZED /* 0 */:
                        if (n(length, obj)) {
                            q3.c(r3, v0.f2425c.d(M3 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (n(length, obj)) {
                            q3.g(r3, v0.f2425c.e(M3 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (n(length, obj)) {
                            q3.j(v0.f2425c.g(M3 & 1048575, obj), r3);
                            break;
                        } else {
                            break;
                        }
                    case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                        if (n(length, obj)) {
                            q3.q(v0.f2425c.g(M3 & 1048575, obj), r3);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (n(length, obj)) {
                            q3.i(r3, v0.f2425c.f(M3 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case q0.k.STRING_FIELD_NUMBER /* 5 */:
                        if (n(length, obj)) {
                            q3.f(v0.f2425c.g(M3 & 1048575, obj), r3);
                            break;
                        } else {
                            break;
                        }
                    case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (n(length, obj)) {
                            q3.e(r3, v0.f2425c.f(M3 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (n(length, obj)) {
                            q3.a(r3, v0.f2425c.c(M3 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (n(length, obj)) {
                            P(r3, v0.f2425c.h(M3 & 1048575, obj), q3);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (n(length, obj)) {
                            q3.k(r3, v0.f2425c.h(M3 & 1048575, obj), m(length));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (n(length, obj)) {
                            q3.b(r3, (C0111h) v0.f2425c.h(M3 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (n(length, obj)) {
                            q3.p(r3, v0.f2425c.f(M3 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (n(length, obj)) {
                            q3.d(r3, v0.f2425c.f(M3 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (n(length, obj)) {
                            q3.l(r3, v0.f2425c.f(M3 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (n(length, obj)) {
                            q3.m(v0.f2425c.g(M3 & 1048575, obj), r3);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (n(length, obj)) {
                            q3.n(r3, v0.f2425c.f(M3 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (n(length, obj)) {
                            q3.o(v0.f2425c.g(M3 & 1048575, obj), r3);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (n(length, obj)) {
                            q3.h(r3, v0.f2425c.h(M3 & 1048575, obj), m(length));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        j0.E(r02[length], (List) v0.f2425c.h(M3 & 1048575, obj), q3, false);
                        break;
                    case 19:
                        j0.I(r02[length], (List) v0.f2425c.h(M3 & 1048575, obj), q3, false);
                        break;
                    case 20:
                        j0.L(r02[length], (List) v0.f2425c.h(M3 & 1048575, obj), q3, false);
                        break;
                    case 21:
                        j0.T(r02[length], (List) v0.f2425c.h(M3 & 1048575, obj), q3, false);
                        break;
                    case 22:
                        j0.K(r02[length], (List) v0.f2425c.h(M3 & 1048575, obj), q3, false);
                        break;
                    case 23:
                        j0.H(r02[length], (List) v0.f2425c.h(M3 & 1048575, obj), q3, false);
                        break;
                    case 24:
                        j0.G(r02[length], (List) v0.f2425c.h(M3 & 1048575, obj), q3, false);
                        break;
                    case 25:
                        j0.C(r02[length], (List) v0.f2425c.h(M3 & 1048575, obj), q3, false);
                        break;
                    case 26:
                        j0.R(r02[length], (List) v0.f2425c.h(M3 & 1048575, obj), q3);
                        break;
                    case 27:
                        j0.M(r02[length], (List) v0.f2425c.h(M3 & 1048575, obj), q3, m(length));
                        break;
                    case 28:
                        j0.D(r02[length], (List) v0.f2425c.h(M3 & 1048575, obj), q3);
                        break;
                    case 29:
                        j0.S(r02[length], (List) v0.f2425c.h(M3 & 1048575, obj), q3, false);
                        break;
                    case 30:
                        j0.F(r02[length], (List) v0.f2425c.h(M3 & 1048575, obj), q3, false);
                        break;
                    case 31:
                        j0.N(r02[length], (List) v0.f2425c.h(M3 & 1048575, obj), q3, false);
                        break;
                    case 32:
                        j0.O(r02[length], (List) v0.f2425c.h(M3 & 1048575, obj), q3, false);
                        break;
                    case 33:
                        j0.P(r02[length], (List) v0.f2425c.h(M3 & 1048575, obj), q3, false);
                        break;
                    case 34:
                        j0.Q(r02[length], (List) v0.f2425c.h(M3 & 1048575, obj), q3, false);
                        break;
                    case 35:
                        j0.E(r02[length], (List) v0.f2425c.h(M3 & 1048575, obj), q3, true);
                        break;
                    case 36:
                        j0.I(r02[length], (List) v0.f2425c.h(M3 & 1048575, obj), q3, true);
                        break;
                    case 37:
                        j0.L(r02[length], (List) v0.f2425c.h(M3 & 1048575, obj), q3, true);
                        break;
                    case 38:
                        j0.T(r02[length], (List) v0.f2425c.h(M3 & 1048575, obj), q3, true);
                        break;
                    case 39:
                        j0.K(r02[length], (List) v0.f2425c.h(M3 & 1048575, obj), q3, true);
                        break;
                    case 40:
                        j0.H(r02[length], (List) v0.f2425c.h(M3 & 1048575, obj), q3, true);
                        break;
                    case 41:
                        j0.G(r02[length], (List) v0.f2425c.h(M3 & 1048575, obj), q3, true);
                        break;
                    case 42:
                        j0.C(r02[length], (List) v0.f2425c.h(M3 & 1048575, obj), q3, true);
                        break;
                    case 43:
                        j0.S(r02[length], (List) v0.f2425c.h(M3 & 1048575, obj), q3, true);
                        break;
                    case 44:
                        j0.F(r02[length], (List) v0.f2425c.h(M3 & 1048575, obj), q3, true);
                        break;
                    case 45:
                        j0.N(r02[length], (List) v0.f2425c.h(M3 & 1048575, obj), q3, true);
                        break;
                    case 46:
                        j0.O(r02[length], (List) v0.f2425c.h(M3 & 1048575, obj), q3, true);
                        break;
                    case 47:
                        j0.P(r02[length], (List) v0.f2425c.h(M3 & 1048575, obj), q3, true);
                        break;
                    case 48:
                        j0.Q(r02[length], (List) v0.f2425c.h(M3 & 1048575, obj), q3, true);
                        break;
                    case 49:
                        j0.J(r02[length], (List) v0.f2425c.h(M3 & 1048575, obj), q3, m(length));
                        break;
                    case 50:
                        O(q3, r3, v0.f2425c.h(M3 & 1048575, obj), length);
                        break;
                    case 51:
                        if (q(obj, r3, length)) {
                            q3.c(r3, ((Double) v0.f2425c.h(M3 & 1048575, obj)).doubleValue());
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (q(obj, r3, length)) {
                            q3.g(r3, ((Float) v0.f2425c.h(M3 & 1048575, obj)).floatValue());
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (q(obj, r3, length)) {
                            q3.j(A(M3 & 1048575, obj), r3);
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (q(obj, r3, length)) {
                            q3.q(A(M3 & 1048575, obj), r3);
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (q(obj, r3, length)) {
                            q3.i(r3, z(M3 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (q(obj, r3, length)) {
                            q3.f(A(M3 & 1048575, obj), r3);
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (q(obj, r3, length)) {
                            q3.e(r3, z(M3 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (q(obj, r3, length)) {
                            q3.a(r3, ((Boolean) v0.f2425c.h(M3 & 1048575, obj)).booleanValue());
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (q(obj, r3, length)) {
                            P(r3, v0.f2425c.h(M3 & 1048575, obj), q3);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (q(obj, r3, length)) {
                            q3.k(r3, v0.f2425c.h(M3 & 1048575, obj), m(length));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (q(obj, r3, length)) {
                            q3.b(r3, (C0111h) v0.f2425c.h(M3 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (q(obj, r3, length)) {
                            q3.p(r3, z(M3 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (q(obj, r3, length)) {
                            q3.d(r3, z(M3 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case RecognitionOptions.EAN_8 /* 64 */:
                        if (q(obj, r3, length)) {
                            q3.l(r3, z(M3 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (q(obj, r3, length)) {
                            q3.m(A(M3 & 1048575, obj), r3);
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (q(obj, r3, length)) {
                            q3.n(r3, z(M3 & 1048575, obj));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (q(obj, r3, length)) {
                            q3.o(A(M3 & 1048575, obj), r3);
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (q(obj, r3, length)) {
                            q3.h(r3, v0.f2425c.h(M3 & 1048575, obj), m(length));
                            break;
                        } else {
                            break;
                        }
                }
            }
            return;
        }
        N(obj, q3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00df, code lost:
        if (r4 != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e1, code lost:
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e3, code lost:
        r3 = r8 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0217, code lost:
        if (r4 != false) goto L52;
     */
    @Override // androidx.datastore.preferences.protobuf.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(androidx.datastore.preferences.protobuf.D r12) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Z.e(androidx.datastore.preferences.protobuf.D):int");
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final int f(D d4) {
        int r14;
        int r15;
        int r5;
        int j3;
        int v3;
        int i3;
        int x3;
        int z3;
        Unsafe unsafe = f2317o;
        int r10 = 1048575;
        int r02 = 1048575;
        int r12 = 0;
        int r11 = 0;
        int r122 = 0;
        while (true) {
            int[] r22 = this.f2318a;
            if (r11 < r22.length) {
                int M3 = M(r11);
                int L3 = L(M3);
                int r13 = r22[r11];
                int r23 = r22[r11 + 2];
                int r52 = r23 & r10;
                if (L3 <= 17) {
                    if (r52 != r02) {
                        if (r52 == r10) {
                            r12 = 0;
                        } else {
                            r12 = unsafe.getInt(d4, r52);
                        }
                        r02 = r52;
                    }
                    r14 = r02;
                    r15 = r12;
                    r5 = 1 << (r23 >>> 20);
                } else {
                    r14 = r02;
                    r15 = r12;
                    r5 = 0;
                }
                long j4 = M3 & r10;
                if (L3 >= EnumC0125x.DOUBLE_LIST_PACKED.a()) {
                    EnumC0125x.SINT64_LIST_PACKED.a();
                }
                switch (L3) {
                    case RecognitionOptions.UNRECOGNIZED /* 0 */:
                        if (!o(d4, r11, r14, r15, r5)) {
                            break;
                        } else {
                            j3 = C0116n.j(r13);
                            r122 += j3;
                            break;
                        }
                    case 1:
                        if (!o(d4, r11, r14, r15, r5)) {
                            break;
                        } else {
                            j3 = C0116n.n(r13);
                            r122 += j3;
                            break;
                        }
                    case 2:
                        if (!o(d4, r11, r14, r15, r5)) {
                            break;
                        } else {
                            j3 = C0116n.q(unsafe.getLong(d4, j4), r13);
                            r122 += j3;
                            break;
                        }
                    case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                        if (!o(d4, r11, r14, r15, r5)) {
                            break;
                        } else {
                            j3 = C0116n.A(unsafe.getLong(d4, j4), r13);
                            r122 += j3;
                            break;
                        }
                    case 4:
                        if (!o(d4, r11, r14, r15, r5)) {
                            break;
                        } else {
                            j3 = C0116n.p(r13, unsafe.getInt(d4, j4));
                            r122 += j3;
                            break;
                        }
                    case q0.k.STRING_FIELD_NUMBER /* 5 */:
                        if (!o(d4, r11, r14, r15, r5)) {
                            break;
                        } else {
                            j3 = C0116n.m(r13);
                            r122 += j3;
                            break;
                        }
                    case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (!o(d4, r11, r14, r15, r5)) {
                            break;
                        } else {
                            j3 = C0116n.l(r13);
                            r122 += j3;
                            break;
                        }
                    case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        if (!o(d4, r11, r14, r15, r5)) {
                            break;
                        } else {
                            j3 = C0116n.g(r13);
                            r122 += j3;
                            break;
                        }
                    case 8:
                        if (!o(d4, r11, r14, r15, r5)) {
                            break;
                        } else {
                            Object object = unsafe.getObject(d4, j4);
                            if (object instanceof C0111h) {
                                v3 = C0116n.h(r13, (C0111h) object);
                            } else {
                                v3 = C0116n.v((String) object, r13);
                            }
                            r122 = v3 + r122;
                            break;
                        }
                    case 9:
                        if (!o(d4, r11, r14, r15, r5)) {
                            break;
                        } else {
                            j3 = j0.o(r13, unsafe.getObject(d4, j4), m(r11));
                            r122 += j3;
                            break;
                        }
                    case 10:
                        if (!o(d4, r11, r14, r15, r5)) {
                            break;
                        } else {
                            j3 = C0116n.h(r13, (C0111h) unsafe.getObject(d4, j4));
                            r122 += j3;
                            break;
                        }
                    case 11:
                        if (!o(d4, r11, r14, r15, r5)) {
                            break;
                        } else {
                            j3 = C0116n.y(r13, unsafe.getInt(d4, j4));
                            r122 += j3;
                            break;
                        }
                    case 12:
                        if (!o(d4, r11, r14, r15, r5)) {
                            break;
                        } else {
                            j3 = C0116n.k(r13, unsafe.getInt(d4, j4));
                            r122 += j3;
                            break;
                        }
                    case 13:
                        if (!o(d4, r11, r14, r15, r5)) {
                            break;
                        } else {
                            j3 = C0116n.r(r13);
                            r122 += j3;
                            break;
                        }
                    case 14:
                        if (!o(d4, r11, r14, r15, r5)) {
                            break;
                        } else {
                            j3 = C0116n.s(r13);
                            r122 += j3;
                            break;
                        }
                    case 15:
                        if (!o(d4, r11, r14, r15, r5)) {
                            break;
                        } else {
                            j3 = C0116n.t(r13, unsafe.getInt(d4, j4));
                            r122 += j3;
                            break;
                        }
                    case 16:
                        if (!o(d4, r11, r14, r15, r5)) {
                            break;
                        } else {
                            j3 = C0116n.u(unsafe.getLong(d4, j4), r13);
                            r122 += j3;
                            break;
                        }
                    case 17:
                        if (!o(d4, r11, r14, r15, r5)) {
                            break;
                        } else {
                            j3 = C0116n.o(r13, (AbstractC0098a) unsafe.getObject(d4, j4), m(r11));
                            r122 += j3;
                            break;
                        }
                    case 18:
                        j3 = j0.h(r13, (List) unsafe.getObject(d4, j4));
                        r122 += j3;
                        break;
                    case 19:
                        j3 = j0.f(r13, (List) unsafe.getObject(d4, j4));
                        r122 += j3;
                        break;
                    case 20:
                        j3 = j0.m(r13, (List) unsafe.getObject(d4, j4));
                        r122 += j3;
                        break;
                    case 21:
                        j3 = j0.x(r13, (List) unsafe.getObject(d4, j4));
                        r122 += j3;
                        break;
                    case 22:
                        j3 = j0.k(r13, (List) unsafe.getObject(d4, j4));
                        r122 += j3;
                        break;
                    case 23:
                        j3 = j0.h(r13, (List) unsafe.getObject(d4, j4));
                        r122 += j3;
                        break;
                    case 24:
                        j3 = j0.f(r13, (List) unsafe.getObject(d4, j4));
                        r122 += j3;
                        break;
                    case 25:
                        j3 = j0.a(r13, (List) unsafe.getObject(d4, j4));
                        r122 += j3;
                        break;
                    case 26:
                        j3 = j0.u(r13, (List) unsafe.getObject(d4, j4));
                        r122 += j3;
                        break;
                    case 27:
                        j3 = j0.p(r13, (List) unsafe.getObject(d4, j4), m(r11));
                        r122 += j3;
                        break;
                    case 28:
                        j3 = j0.c(r13, (List) unsafe.getObject(d4, j4));
                        r122 += j3;
                        break;
                    case 29:
                        j3 = j0.v(r13, (List) unsafe.getObject(d4, j4));
                        r122 += j3;
                        break;
                    case 30:
                        j3 = j0.d(r13, (List) unsafe.getObject(d4, j4));
                        r122 += j3;
                        break;
                    case 31:
                        j3 = j0.f(r13, (List) unsafe.getObject(d4, j4));
                        r122 += j3;
                        break;
                    case 32:
                        j3 = j0.h(r13, (List) unsafe.getObject(d4, j4));
                        r122 += j3;
                        break;
                    case 33:
                        j3 = j0.q(r13, (List) unsafe.getObject(d4, j4));
                        r122 += j3;
                        break;
                    case 34:
                        j3 = j0.s(r13, (List) unsafe.getObject(d4, j4));
                        r122 += j3;
                        break;
                    case 35:
                        i3 = j0.i((List) unsafe.getObject(d4, j4));
                        if (i3 <= 0) {
                            break;
                        } else {
                            x3 = C0116n.x(r13);
                            z3 = C0116n.z(i3);
                            r122 += z3 + x3 + i3;
                            break;
                        }
                    case 36:
                        i3 = j0.g((List) unsafe.getObject(d4, j4));
                        if (i3 <= 0) {
                            break;
                        } else {
                            x3 = C0116n.x(r13);
                            z3 = C0116n.z(i3);
                            r122 += z3 + x3 + i3;
                            break;
                        }
                    case 37:
                        i3 = j0.n((List) unsafe.getObject(d4, j4));
                        if (i3 <= 0) {
                            break;
                        } else {
                            x3 = C0116n.x(r13);
                            z3 = C0116n.z(i3);
                            r122 += z3 + x3 + i3;
                            break;
                        }
                    case 38:
                        i3 = j0.y((List) unsafe.getObject(d4, j4));
                        if (i3 <= 0) {
                            break;
                        } else {
                            x3 = C0116n.x(r13);
                            z3 = C0116n.z(i3);
                            r122 += z3 + x3 + i3;
                            break;
                        }
                    case 39:
                        i3 = j0.l((List) unsafe.getObject(d4, j4));
                        if (i3 <= 0) {
                            break;
                        } else {
                            x3 = C0116n.x(r13);
                            z3 = C0116n.z(i3);
                            r122 += z3 + x3 + i3;
                            break;
                        }
                    case 40:
                        i3 = j0.i((List) unsafe.getObject(d4, j4));
                        if (i3 <= 0) {
                            break;
                        } else {
                            x3 = C0116n.x(r13);
                            z3 = C0116n.z(i3);
                            r122 += z3 + x3 + i3;
                            break;
                        }
                    case 41:
                        i3 = j0.g((List) unsafe.getObject(d4, j4));
                        if (i3 <= 0) {
                            break;
                        } else {
                            x3 = C0116n.x(r13);
                            z3 = C0116n.z(i3);
                            r122 += z3 + x3 + i3;
                            break;
                        }
                    case 42:
                        i3 = j0.b((List) unsafe.getObject(d4, j4));
                        if (i3 <= 0) {
                            break;
                        } else {
                            x3 = C0116n.x(r13);
                            z3 = C0116n.z(i3);
                            r122 += z3 + x3 + i3;
                            break;
                        }
                    case 43:
                        i3 = j0.w((List) unsafe.getObject(d4, j4));
                        if (i3 <= 0) {
                            break;
                        } else {
                            x3 = C0116n.x(r13);
                            z3 = C0116n.z(i3);
                            r122 += z3 + x3 + i3;
                            break;
                        }
                    case 44:
                        i3 = j0.e((List) unsafe.getObject(d4, j4));
                        if (i3 <= 0) {
                            break;
                        } else {
                            x3 = C0116n.x(r13);
                            z3 = C0116n.z(i3);
                            r122 += z3 + x3 + i3;
                            break;
                        }
                    case 45:
                        i3 = j0.g((List) unsafe.getObject(d4, j4));
                        if (i3 <= 0) {
                            break;
                        } else {
                            x3 = C0116n.x(r13);
                            z3 = C0116n.z(i3);
                            r122 += z3 + x3 + i3;
                            break;
                        }
                    case 46:
                        i3 = j0.i((List) unsafe.getObject(d4, j4));
                        if (i3 <= 0) {
                            break;
                        } else {
                            x3 = C0116n.x(r13);
                            z3 = C0116n.z(i3);
                            r122 += z3 + x3 + i3;
                            break;
                        }
                    case 47:
                        i3 = j0.r((List) unsafe.getObject(d4, j4));
                        if (i3 <= 0) {
                            break;
                        } else {
                            x3 = C0116n.x(r13);
                            z3 = C0116n.z(i3);
                            r122 += z3 + x3 + i3;
                            break;
                        }
                    case 48:
                        i3 = j0.t((List) unsafe.getObject(d4, j4));
                        if (i3 <= 0) {
                            break;
                        } else {
                            x3 = C0116n.x(r13);
                            z3 = C0116n.z(i3);
                            r122 += z3 + x3 + i3;
                            break;
                        }
                    case 49:
                        j3 = j0.j(r13, (List) unsafe.getObject(d4, j4), m(r11));
                        r122 += j3;
                        break;
                    case 50:
                        Object object2 = unsafe.getObject(d4, j4);
                        Object obj = this.f2319b[(r11 / 3) * 2];
                        this.f2329m.getClass();
                        j3 = V.a(r13, object2, obj);
                        r122 += j3;
                        break;
                    case 51:
                        if (!q(d4, r13, r11)) {
                            break;
                        } else {
                            j3 = C0116n.j(r13);
                            r122 += j3;
                            break;
                        }
                    case 52:
                        if (!q(d4, r13, r11)) {
                            break;
                        } else {
                            j3 = C0116n.n(r13);
                            r122 += j3;
                            break;
                        }
                    case 53:
                        if (!q(d4, r13, r11)) {
                            break;
                        } else {
                            j3 = C0116n.q(A(j4, d4), r13);
                            r122 += j3;
                            break;
                        }
                    case 54:
                        if (!q(d4, r13, r11)) {
                            break;
                        } else {
                            j3 = C0116n.A(A(j4, d4), r13);
                            r122 += j3;
                            break;
                        }
                    case 55:
                        if (!q(d4, r13, r11)) {
                            break;
                        } else {
                            j3 = C0116n.p(r13, z(j4, d4));
                            r122 += j3;
                            break;
                        }
                    case 56:
                        if (!q(d4, r13, r11)) {
                            break;
                        } else {
                            j3 = C0116n.m(r13);
                            r122 += j3;
                            break;
                        }
                    case 57:
                        if (!q(d4, r13, r11)) {
                            break;
                        } else {
                            j3 = C0116n.l(r13);
                            r122 += j3;
                            break;
                        }
                    case 58:
                        if (!q(d4, r13, r11)) {
                            break;
                        } else {
                            j3 = C0116n.g(r13);
                            r122 += j3;
                            break;
                        }
                    case 59:
                        if (!q(d4, r13, r11)) {
                            break;
                        } else {
                            Object object3 = unsafe.getObject(d4, j4);
                            if (object3 instanceof C0111h) {
                                v3 = C0116n.h(r13, (C0111h) object3);
                            } else {
                                v3 = C0116n.v((String) object3, r13);
                            }
                            r122 = v3 + r122;
                            break;
                        }
                    case 60:
                        if (!q(d4, r13, r11)) {
                            break;
                        } else {
                            j3 = j0.o(r13, unsafe.getObject(d4, j4), m(r11));
                            r122 += j3;
                            break;
                        }
                    case 61:
                        if (!q(d4, r13, r11)) {
                            break;
                        } else {
                            j3 = C0116n.h(r13, (C0111h) unsafe.getObject(d4, j4));
                            r122 += j3;
                            break;
                        }
                    case 62:
                        if (!q(d4, r13, r11)) {
                            break;
                        } else {
                            j3 = C0116n.y(r13, z(j4, d4));
                            r122 += j3;
                            break;
                        }
                    case 63:
                        if (!q(d4, r13, r11)) {
                            break;
                        } else {
                            j3 = C0116n.k(r13, z(j4, d4));
                            r122 += j3;
                            break;
                        }
                    case RecognitionOptions.EAN_8 /* 64 */:
                        if (!q(d4, r13, r11)) {
                            break;
                        } else {
                            j3 = C0116n.r(r13);
                            r122 += j3;
                            break;
                        }
                    case 65:
                        if (!q(d4, r13, r11)) {
                            break;
                        } else {
                            j3 = C0116n.s(r13);
                            r122 += j3;
                            break;
                        }
                    case 66:
                        if (!q(d4, r13, r11)) {
                            break;
                        } else {
                            j3 = C0116n.t(r13, z(j4, d4));
                            r122 += j3;
                            break;
                        }
                    case 67:
                        if (!q(d4, r13, r11)) {
                            break;
                        } else {
                            j3 = C0116n.u(A(j4, d4), r13);
                            r122 += j3;
                            break;
                        }
                    case 68:
                        if (!q(d4, r13, r11)) {
                            break;
                        } else {
                            j3 = C0116n.o(r13, (AbstractC0098a) unsafe.getObject(d4, j4), m(r11));
                            r122 += j3;
                            break;
                        }
                }
                r11 += 3;
                r02 = r14;
                r12 = r15;
                r10 = 1048575;
            } else {
                this.f2328l.getClass();
                return d4.unknownFields.b() + r122;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final D g() {
        this.f2326j.getClass();
        return ((D) this.f2322e).k();
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public final void h(Object obj) {
        if (!p(obj)) {
            return;
        }
        if (obj instanceof D) {
            D d4 = (D) obj;
            d4.d();
            d4.c();
            d4.j();
        }
        int[] r02 = this.f2318a;
        int length = r02.length;
        for (int r22 = 0; r22 < length; r22 += 3) {
            int M3 = M(r22);
            long j3 = 1048575 & M3;
            int L3 = L(M3);
            if (L3 != 9) {
                if (L3 != 60 && L3 != 68) {
                    switch (L3) {
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
                            this.f2327k.getClass();
                            L.a(j3, obj);
                            break;
                        case 50:
                            Unsafe unsafe = f2317o;
                            Object object = unsafe.getObject(obj, j3);
                            if (object != null) {
                                this.f2329m.getClass();
                                V.c(object);
                                unsafe.putObject(obj, j3, object);
                                break;
                            } else {
                                break;
                            }
                    }
                } else if (q(obj, r02[r22], r22)) {
                    m(r22).h(f2317o.getObject(obj, j3));
                }
            }
            if (n(r22, obj)) {
                m(r22).h(f2317o.getObject(obj, j3));
            }
        }
        this.f2328l.getClass();
        q0.b(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ec, code lost:
        if (java.lang.Double.doubleToLongBits(r5.d(r7, r12)) == java.lang.Double.doubleToLongBits(r5.d(r7, r13))) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (androidx.datastore.preferences.protobuf.j0.B(r9.h(r7, r12), r9.h(r7, r13)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
        if (androidx.datastore.preferences.protobuf.j0.B(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009e, code lost:
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b4, code lost:
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dc, code lost:
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f0, code lost:
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0108, code lost:
        if (androidx.datastore.preferences.protobuf.j0.B(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0120, code lost:
        if (androidx.datastore.preferences.protobuf.j0.B(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0138, code lost:
        if (androidx.datastore.preferences.protobuf.j0.B(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014c, code lost:
        if (r5.c(r7, r12) == r5.c(r7, r13)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0160, code lost:
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0176, code lost:
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x018a, code lost:
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019f, code lost:
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b4, code lost:
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01cf, code lost:
        if (java.lang.Float.floatToIntBits(r5.e(r7, r12)) == java.lang.Float.floatToIntBits(r5.e(r7, r13))) goto L85;
     */
    @Override // androidx.datastore.preferences.protobuf.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(androidx.datastore.preferences.protobuf.D r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 662
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Z.i(androidx.datastore.preferences.protobuf.D, java.lang.Object):boolean");
    }

    public final boolean j(D d4, Object obj, int r3) {
        if (n(r3, d4) == n(r3, obj)) {
            return true;
        }
        return false;
    }

    public final void k(int r3, Object obj, Object obj2) {
        int r5 = this.f2318a[r3];
        if (v0.f2425c.h(M(r3) & 1048575, obj) == null) {
            return;
        }
        l(r3);
    }

    public final void l(int r22) {
        if (this.f2319b[((r22 / 3) * 2) + 1] == null) {
            return;
        }
        throw new ClassCastException();
    }

    public final i0 m(int r4) {
        int r42 = (r4 / 3) * 2;
        Object[] objArr = this.f2319b;
        i0 i0Var = (i0) objArr[r42];
        if (i0Var != null) {
            return i0Var;
        }
        i0 a4 = C0109f0.f2342c.a((Class) objArr[r42 + 1]);
        objArr[r42] = a4;
        return a4;
    }

    public final boolean n(int r10, Object obj) {
        int r02 = this.f2318a[r10 + 2];
        long j3 = r02 & 1048575;
        if (j3 == 1048575) {
            int M3 = M(r10);
            long j4 = M3 & 1048575;
            switch (L(M3)) {
                case RecognitionOptions.UNRECOGNIZED /* 0 */:
                    if (Double.doubleToRawLongBits(v0.f2425c.d(j4, obj)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(v0.f2425c.e(j4, obj)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (v0.f2425c.g(j4, obj) == 0) {
                        return false;
                    }
                    return true;
                case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                    if (v0.f2425c.g(j4, obj) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (v0.f2425c.f(j4, obj) == 0) {
                        return false;
                    }
                    return true;
                case q0.k.STRING_FIELD_NUMBER /* 5 */:
                    if (v0.f2425c.g(j4, obj) == 0) {
                        return false;
                    }
                    return true;
                case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (v0.f2425c.f(j4, obj) == 0) {
                        return false;
                    }
                    return true;
                case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    return v0.f2425c.c(j4, obj);
                case 8:
                    Object h3 = v0.f2425c.h(j4, obj);
                    if (h3 instanceof String) {
                        return !((String) h3).isEmpty();
                    }
                    if (h3 instanceof C0111h) {
                        return !C0111h.f2350L.equals(h3);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (v0.f2425c.h(j4, obj) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    return !C0111h.f2350L.equals(v0.f2425c.h(j4, obj));
                case 11:
                    if (v0.f2425c.f(j4, obj) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (v0.f2425c.f(j4, obj) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (v0.f2425c.f(j4, obj) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (v0.f2425c.g(j4, obj) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (v0.f2425c.f(j4, obj) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (v0.f2425c.g(j4, obj) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (v0.f2425c.h(j4, obj) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (r02 >>> 20)) & v0.f2425c.f(j3, obj)) == 0) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean o(Object obj, int r3, int r4, int r5, int r6) {
        if (r4 == 1048575) {
            return n(r3, obj);
        }
        if ((r5 & r6) != 0) {
            return true;
        }
        return false;
    }

    public final boolean q(Object obj, int r4, int r5) {
        if (v0.f2425c.f(this.f2318a[r5 + 2] & 1048575, obj) == r4) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0646 A[Catch: all -> 0x025a, TryCatch #3 {all -> 0x025a, blocks: (B:67:0x0255, B:120:0x0641, B:122:0x0646, B:123:0x064b, B:70:0x025d, B:71:0x0270, B:72:0x0283, B:73:0x0296, B:74:0x02a9, B:75:0x02c2, B:76:0x02d5, B:77:0x02e8, B:78:0x02fb, B:79:0x030e, B:80:0x0321, B:81:0x0334, B:82:0x0347, B:83:0x035a, B:84:0x036d, B:85:0x0380, B:86:0x0393, B:87:0x03a6, B:88:0x03b9, B:89:0x03d2, B:90:0x03e5, B:91:0x03f8, B:92:0x040c, B:93:0x0414, B:94:0x0427, B:95:0x043a, B:96:0x044d, B:97:0x0460, B:98:0x0473, B:99:0x0486, B:100:0x0499, B:101:0x04ac, B:102:0x04c5, B:103:0x04db, B:104:0x04f1, B:105:0x0508, B:106:0x051f, B:107:0x0538, B:108:0x054e, B:109:0x0561, B:110:0x057a, B:111:0x0585, B:112:0x059d, B:113:0x05b4, B:114:0x05cb, B:115:0x05e1, B:116:0x05f7, B:117:0x060c, B:118:0x0624), top: B:144:0x0255 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0651 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(androidx.datastore.preferences.protobuf.q0 r20, java.lang.Object r21, androidx.datastore.preferences.protobuf.C0115m r22, androidx.datastore.preferences.protobuf.C0119q r23) {
        /*
            Method dump skipped, instructions count: 1806
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Z.r(androidx.datastore.preferences.protobuf.q0, java.lang.Object, androidx.datastore.preferences.protobuf.m, androidx.datastore.preferences.protobuf.q):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0099, code lost:
        r10.put(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009c, code lost:
        r0.d(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(java.lang.Object r9, int r10, java.lang.Object r11, androidx.datastore.preferences.protobuf.C0119q r12, androidx.datastore.preferences.protobuf.C0115m r13) {
        /*
            r8 = this;
            int r10 = r8.M(r10)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r0
            long r0 = (long) r10
            androidx.datastore.preferences.protobuf.u0 r10 = androidx.datastore.preferences.protobuf.v0.f2425c
            java.lang.Object r10 = r10.h(r0, r9)
            androidx.datastore.preferences.protobuf.V r2 = r8.f2329m
            if (r10 != 0) goto L20
            r2.getClass()
            androidx.datastore.preferences.protobuf.U r10 = androidx.datastore.preferences.protobuf.U.f2311K
            androidx.datastore.preferences.protobuf.U r10 = r10.b()
            androidx.datastore.preferences.protobuf.v0.o(r0, r9, r10)
            goto L37
        L20:
            r2.getClass()
            r3 = r10
            androidx.datastore.preferences.protobuf.U r3 = (androidx.datastore.preferences.protobuf.U) r3
            boolean r3 = r3.f2312J
            if (r3 != 0) goto L37
            androidx.datastore.preferences.protobuf.U r3 = androidx.datastore.preferences.protobuf.U.f2311K
            androidx.datastore.preferences.protobuf.U r3 = r3.b()
            androidx.datastore.preferences.protobuf.V.b(r3, r10)
            androidx.datastore.preferences.protobuf.v0.o(r0, r9, r3)
            r10 = r3
        L37:
            r2.getClass()
            androidx.datastore.preferences.protobuf.U r10 = (androidx.datastore.preferences.protobuf.U) r10
            androidx.datastore.preferences.protobuf.T r11 = (androidx.datastore.preferences.protobuf.T) r11
            androidx.datastore.preferences.protobuf.S r9 = r11.f2310a
            r11 = 2
            r13.w(r11)
            androidx.datastore.preferences.protobuf.k r0 = r13.f2386a
            int r1 = r0.v()
            int r1 = r0.e(r1)
            java.lang.String r2 = ""
            q0.k r3 = r9.f2309c
            r4 = r3
        L53:
            int r5 = r13.a()     // Catch: java.lang.Throwable -> L77
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r6) goto L99
            boolean r6 = r0.c()     // Catch: java.lang.Throwable -> L77
            if (r6 == 0) goto L63
            goto L99
        L63:
            r6 = 1
            java.lang.String r7 = "Unable to parse map entry."
            if (r5 == r6) goto L84
            if (r5 == r11) goto L79
            boolean r5 = r13.x()     // Catch: java.lang.Throwable -> L77 androidx.datastore.preferences.protobuf.H -> L8c
            if (r5 == 0) goto L71
            goto L53
        L71:
            androidx.datastore.preferences.protobuf.I r5 = new androidx.datastore.preferences.protobuf.I     // Catch: java.lang.Throwable -> L77 androidx.datastore.preferences.protobuf.H -> L8c
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L77 androidx.datastore.preferences.protobuf.H -> L8c
            throw r5     // Catch: java.lang.Throwable -> L77 androidx.datastore.preferences.protobuf.H -> L8c
        L77:
            r9 = move-exception
            goto La0
        L79:
            androidx.datastore.preferences.protobuf.D0 r5 = r9.f2308b     // Catch: java.lang.Throwable -> L77 androidx.datastore.preferences.protobuf.H -> L8c
            java.lang.Class r6 = r3.getClass()     // Catch: java.lang.Throwable -> L77 androidx.datastore.preferences.protobuf.H -> L8c
            java.lang.Object r4 = r13.i(r5, r6, r12)     // Catch: java.lang.Throwable -> L77 androidx.datastore.preferences.protobuf.H -> L8c
            goto L53
        L84:
            androidx.datastore.preferences.protobuf.D0 r5 = r9.f2307a     // Catch: java.lang.Throwable -> L77 androidx.datastore.preferences.protobuf.H -> L8c
            r6 = 0
            java.lang.Object r2 = r13.i(r5, r6, r6)     // Catch: java.lang.Throwable -> L77 androidx.datastore.preferences.protobuf.H -> L8c
            goto L53
        L8c:
            boolean r5 = r13.x()     // Catch: java.lang.Throwable -> L77
            if (r5 == 0) goto L93
            goto L53
        L93:
            androidx.datastore.preferences.protobuf.I r9 = new androidx.datastore.preferences.protobuf.I     // Catch: java.lang.Throwable -> L77
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L77
            throw r9     // Catch: java.lang.Throwable -> L77
        L99:
            r10.put(r2, r4)     // Catch: java.lang.Throwable -> L77
            r0.d(r1)
            return
        La0:
            r0.d(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Z.s(java.lang.Object, int, java.lang.Object, androidx.datastore.preferences.protobuf.q, androidx.datastore.preferences.protobuf.m):void");
    }

    public final void t(int r6, Object obj, Object obj2) {
        if (!n(r6, obj2)) {
            return;
        }
        long M3 = M(r6) & 1048575;
        Unsafe unsafe = f2317o;
        Object object = unsafe.getObject(obj2, M3);
        if (object != null) {
            i0 m3 = m(r6);
            if (!n(r6, obj)) {
                if (!p(object)) {
                    unsafe.putObject(obj, M3, object);
                } else {
                    D g = m3.g();
                    m3.c(g, object);
                    unsafe.putObject(obj, M3, g);
                }
                H(r6, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, M3);
            if (!p(object2)) {
                D g3 = m3.g();
                m3.c(g3, object2);
                unsafe.putObject(obj, M3, g3);
                object2 = g3;
            }
            m3.c(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.f2318a[r6] + " is present but null: " + obj2);
    }

    public final void u(int r7, Object obj, Object obj2) {
        int[] r02;
        int r12 = this.f2318a[r7];
        if (!q(obj2, r12, r7)) {
            return;
        }
        long M3 = M(r7) & 1048575;
        Unsafe unsafe = f2317o;
        Object object = unsafe.getObject(obj2, M3);
        if (object != null) {
            i0 m3 = m(r7);
            if (!q(obj, r12, r7)) {
                if (!p(object)) {
                    unsafe.putObject(obj, M3, object);
                } else {
                    D g = m3.g();
                    m3.c(g, object);
                    unsafe.putObject(obj, M3, g);
                }
                I(obj, r12, r7);
                return;
            }
            Object object2 = unsafe.getObject(obj, M3);
            if (!p(object2)) {
                D g3 = m3.g();
                m3.c(g3, object2);
                unsafe.putObject(obj, M3, g3);
                object2 = g3;
            }
            m3.c(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + r02[r7] + " is present but null: " + obj2);
    }

    public final Object v(int r4, Object obj) {
        i0 m3 = m(r4);
        long M3 = M(r4) & 1048575;
        if (!n(r4, obj)) {
            return m3.g();
        }
        Object object = f2317o.getObject(obj, M3);
        if (p(object)) {
            return object;
        }
        D g = m3.g();
        if (object != null) {
            m3.c(g, object);
        }
        return g;
    }

    public final Object w(Object obj, int r5, int r6) {
        i0 m3 = m(r6);
        if (!q(obj, r5, r6)) {
            return m3.g();
        }
        Object object = f2317o.getObject(obj, M(r6) & 1048575);
        if (p(object)) {
            return object;
        }
        D g = m3.g();
        if (object != null) {
            m3.c(g, object);
        }
        return g;
    }
}
