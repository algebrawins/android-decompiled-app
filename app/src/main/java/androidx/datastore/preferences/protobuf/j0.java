package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f2371a;

    /* renamed from: b  reason: collision with root package name */
    public static final q0 f2372b;

    /* renamed from: c  reason: collision with root package name */
    public static final q0 f2373c;

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.datastore.preferences.protobuf.q0, java.lang.Object] */
    static {
        Class<?> cls;
        Class<?> cls2;
        C0109f0 c0109f0 = C0109f0.f2342c;
        q0 q0Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f2371a = cls;
        try {
            C0109f0 c0109f02 = C0109f0.f2342c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                q0Var = (q0) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f2372b = q0Var;
        f2373c = new Object();
    }

    public static void A(q0 q0Var, Object obj, Object obj2) {
        q0Var.getClass();
        D d4 = (D) obj;
        p0 p0Var = d4.unknownFields;
        p0 p0Var2 = ((D) obj2).unknownFields;
        p0 p0Var3 = p0.f2404f;
        if (!p0Var3.equals(p0Var2)) {
            if (p0Var3.equals(p0Var)) {
                int r02 = p0Var.f2405a + p0Var2.f2405a;
                int[] copyOf = Arrays.copyOf(p0Var.f2406b, r02);
                System.arraycopy(p0Var2.f2406b, 0, copyOf, p0Var.f2405a, p0Var2.f2405a);
                Object[] copyOf2 = Arrays.copyOf(p0Var.f2407c, r02);
                System.arraycopy(p0Var2.f2407c, 0, copyOf2, p0Var.f2405a, p0Var2.f2405a);
                p0Var = new p0(r02, copyOf, copyOf2, true);
            } else {
                p0Var.getClass();
                if (!p0Var2.equals(p0Var3)) {
                    if (p0Var.f2409e) {
                        int r03 = p0Var.f2405a + p0Var2.f2405a;
                        p0Var.a(r03);
                        System.arraycopy(p0Var2.f2406b, 0, p0Var.f2406b, p0Var.f2405a, p0Var2.f2405a);
                        System.arraycopy(p0Var2.f2407c, 0, p0Var.f2407c, p0Var.f2405a, p0Var2.f2405a);
                        p0Var.f2405a = r03;
                    } else {
                        throw new UnsupportedOperationException();
                    }
                }
            }
        }
        d4.unknownFields = p0Var;
    }

    public static boolean B(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static void C(int r22, List list, Q q3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            q3.getClass();
            if (!(list instanceof AbstractC0104d)) {
                C0116n c0116n = (C0116n) q3.f2306a;
                int r02 = 0;
                if (z3) {
                    c0116n.R(r22, 2);
                    int r5 = 0;
                    for (int r23 = 0; r23 < list.size(); r23++) {
                        ((Boolean) list.get(r23)).getClass();
                        Logger logger = C0116n.f2395f;
                        r5++;
                    }
                    c0116n.T(r5);
                    while (r02 < list.size()) {
                        c0116n.E(((Boolean) list.get(r02)).booleanValue() ? (byte) 1 : (byte) 0);
                        r02++;
                    }
                    return;
                }
                while (r02 < list.size()) {
                    c0116n.G(r22, ((Boolean) list.get(r02)).booleanValue());
                    r02++;
                }
                return;
            }
            throw new ClassCastException();
        }
    }

    public static void D(int r3, List list, Q q3) {
        if (list != null && !list.isEmpty()) {
            q3.getClass();
            for (int r02 = 0; r02 < list.size(); r02++) {
                ((C0116n) q3.f2306a).H(r3, (C0111h) list.get(r02));
            }
        }
    }

    public static void E(int r3, List list, Q q3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            q3.getClass();
            if (!(list instanceof AbstractC0117o)) {
                C0116n c0116n = (C0116n) q3.f2306a;
                int r02 = 0;
                if (z3) {
                    c0116n.R(r3, 2);
                    int r6 = 0;
                    for (int r32 = 0; r32 < list.size(); r32++) {
                        ((Double) list.get(r32)).getClass();
                        Logger logger = C0116n.f2395f;
                        r6 += 8;
                    }
                    c0116n.T(r6);
                    while (r02 < list.size()) {
                        c0116n.M(Double.doubleToRawLongBits(((Double) list.get(r02)).doubleValue()));
                        r02++;
                    }
                    return;
                }
                while (r02 < list.size()) {
                    double doubleValue = ((Double) list.get(r02)).doubleValue();
                    c0116n.getClass();
                    c0116n.L(Double.doubleToRawLongBits(doubleValue), r3);
                    r02++;
                }
                return;
            }
            throw new ClassCastException();
        }
    }

    public static void F(int r3, List list, Q q3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            q3.getClass();
            if (!(list instanceof E)) {
                C0116n c0116n = (C0116n) q3.f2306a;
                int r02 = 0;
                if (z3) {
                    c0116n.R(r3, 2);
                    int r6 = 0;
                    for (int r32 = 0; r32 < list.size(); r32++) {
                        r6 += C0116n.B(((Integer) list.get(r32)).intValue());
                    }
                    c0116n.T(r6);
                    while (r02 < list.size()) {
                        c0116n.O(((Integer) list.get(r02)).intValue());
                        r02++;
                    }
                    return;
                }
                while (r02 < list.size()) {
                    c0116n.N(r3, ((Integer) list.get(r02)).intValue());
                    r02++;
                }
                return;
            }
            throw new ClassCastException();
        }
    }

    public static void G(int r22, List list, Q q3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            q3.getClass();
            if (!(list instanceof E)) {
                C0116n c0116n = (C0116n) q3.f2306a;
                int r02 = 0;
                if (z3) {
                    c0116n.R(r22, 2);
                    int r5 = 0;
                    for (int r23 = 0; r23 < list.size(); r23++) {
                        ((Integer) list.get(r23)).getClass();
                        Logger logger = C0116n.f2395f;
                        r5 += 4;
                    }
                    c0116n.T(r5);
                    while (r02 < list.size()) {
                        c0116n.K(((Integer) list.get(r02)).intValue());
                        r02++;
                    }
                    return;
                }
                while (r02 < list.size()) {
                    c0116n.J(r22, ((Integer) list.get(r02)).intValue());
                    r02++;
                }
                return;
            }
            throw new ClassCastException();
        }
    }

    public static void H(int r3, List list, Q q3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            q3.getClass();
            if (!(list instanceof N)) {
                C0116n c0116n = (C0116n) q3.f2306a;
                int r02 = 0;
                if (z3) {
                    c0116n.R(r3, 2);
                    int r6 = 0;
                    for (int r32 = 0; r32 < list.size(); r32++) {
                        ((Long) list.get(r32)).getClass();
                        Logger logger = C0116n.f2395f;
                        r6 += 8;
                    }
                    c0116n.T(r6);
                    while (r02 < list.size()) {
                        c0116n.M(((Long) list.get(r02)).longValue());
                        r02++;
                    }
                    return;
                }
                while (r02 < list.size()) {
                    c0116n.L(((Long) list.get(r02)).longValue(), r3);
                    r02++;
                }
                return;
            }
            throw new ClassCastException();
        }
    }

    public static void I(int r22, List list, Q q3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            q3.getClass();
            if (!(list instanceof AbstractC0126y)) {
                C0116n c0116n = (C0116n) q3.f2306a;
                int r02 = 0;
                if (z3) {
                    c0116n.R(r22, 2);
                    int r5 = 0;
                    for (int r23 = 0; r23 < list.size(); r23++) {
                        ((Float) list.get(r23)).getClass();
                        Logger logger = C0116n.f2395f;
                        r5 += 4;
                    }
                    c0116n.T(r5);
                    while (r02 < list.size()) {
                        c0116n.K(Float.floatToRawIntBits(((Float) list.get(r02)).floatValue()));
                        r02++;
                    }
                    return;
                }
                while (r02 < list.size()) {
                    float floatValue = ((Float) list.get(r02)).floatValue();
                    c0116n.getClass();
                    c0116n.J(r22, Float.floatToRawIntBits(floatValue));
                    r02++;
                }
                return;
            }
            throw new ClassCastException();
        }
    }

    public static void J(int r22, List list, Q q3, i0 i0Var) {
        if (list != null && !list.isEmpty()) {
            q3.getClass();
            for (int r02 = 0; r02 < list.size(); r02++) {
                q3.h(r22, list.get(r02), i0Var);
            }
        }
    }

    public static void K(int r3, List list, Q q3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            q3.getClass();
            if (!(list instanceof E)) {
                C0116n c0116n = (C0116n) q3.f2306a;
                int r02 = 0;
                if (z3) {
                    c0116n.R(r3, 2);
                    int r6 = 0;
                    for (int r32 = 0; r32 < list.size(); r32++) {
                        r6 += C0116n.B(((Integer) list.get(r32)).intValue());
                    }
                    c0116n.T(r6);
                    while (r02 < list.size()) {
                        c0116n.O(((Integer) list.get(r02)).intValue());
                        r02++;
                    }
                    return;
                }
                while (r02 < list.size()) {
                    c0116n.N(r3, ((Integer) list.get(r02)).intValue());
                    r02++;
                }
                return;
            }
            throw new ClassCastException();
        }
    }

    public static void L(int r3, List list, Q q3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            q3.getClass();
            if (!(list instanceof N)) {
                C0116n c0116n = (C0116n) q3.f2306a;
                int r02 = 0;
                if (z3) {
                    c0116n.R(r3, 2);
                    int r6 = 0;
                    for (int r32 = 0; r32 < list.size(); r32++) {
                        r6 += C0116n.B(((Long) list.get(r32)).longValue());
                    }
                    c0116n.T(r6);
                    while (r02 < list.size()) {
                        c0116n.V(((Long) list.get(r02)).longValue());
                        r02++;
                    }
                    return;
                }
                while (r02 < list.size()) {
                    c0116n.U(((Long) list.get(r02)).longValue(), r3);
                    r02++;
                }
                return;
            }
            throw new ClassCastException();
        }
    }

    public static void M(int r22, List list, Q q3, i0 i0Var) {
        if (list != null && !list.isEmpty()) {
            q3.getClass();
            for (int r02 = 0; r02 < list.size(); r02++) {
                q3.k(r22, list.get(r02), i0Var);
            }
        }
    }

    public static void N(int r22, List list, Q q3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            q3.getClass();
            if (!(list instanceof E)) {
                C0116n c0116n = (C0116n) q3.f2306a;
                int r02 = 0;
                if (z3) {
                    c0116n.R(r22, 2);
                    int r5 = 0;
                    for (int r23 = 0; r23 < list.size(); r23++) {
                        ((Integer) list.get(r23)).getClass();
                        Logger logger = C0116n.f2395f;
                        r5 += 4;
                    }
                    c0116n.T(r5);
                    while (r02 < list.size()) {
                        c0116n.K(((Integer) list.get(r02)).intValue());
                        r02++;
                    }
                    return;
                }
                while (r02 < list.size()) {
                    c0116n.J(r22, ((Integer) list.get(r02)).intValue());
                    r02++;
                }
                return;
            }
            throw new ClassCastException();
        }
    }

    public static void O(int r3, List list, Q q3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            q3.getClass();
            if (!(list instanceof N)) {
                C0116n c0116n = (C0116n) q3.f2306a;
                int r02 = 0;
                if (z3) {
                    c0116n.R(r3, 2);
                    int r6 = 0;
                    for (int r32 = 0; r32 < list.size(); r32++) {
                        ((Long) list.get(r32)).getClass();
                        Logger logger = C0116n.f2395f;
                        r6 += 8;
                    }
                    c0116n.T(r6);
                    while (r02 < list.size()) {
                        c0116n.M(((Long) list.get(r02)).longValue());
                        r02++;
                    }
                    return;
                }
                while (r02 < list.size()) {
                    c0116n.L(((Long) list.get(r02)).longValue(), r3);
                    r02++;
                }
                return;
            }
            throw new ClassCastException();
        }
    }

    public static void P(int r3, List list, Q q3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            q3.getClass();
            if (!(list instanceof E)) {
                C0116n c0116n = (C0116n) q3.f2306a;
                int r02 = 0;
                if (z3) {
                    c0116n.R(r3, 2);
                    int r6 = 0;
                    for (int r32 = 0; r32 < list.size(); r32++) {
                        int intValue = ((Integer) list.get(r32)).intValue();
                        r6 += C0116n.z((intValue >> 31) ^ (intValue << 1));
                    }
                    c0116n.T(r6);
                    while (r02 < list.size()) {
                        int intValue2 = ((Integer) list.get(r02)).intValue();
                        c0116n.T((intValue2 >> 31) ^ (intValue2 << 1));
                        r02++;
                    }
                    return;
                }
                while (r02 < list.size()) {
                    int intValue3 = ((Integer) list.get(r02)).intValue();
                    c0116n.S(r3, (intValue3 >> 31) ^ (intValue3 << 1));
                    r02++;
                }
                return;
            }
            throw new ClassCastException();
        }
    }

    public static void Q(int r7, List list, Q q3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            q3.getClass();
            if (!(list instanceof N)) {
                C0116n c0116n = (C0116n) q3.f2306a;
                int r22 = 0;
                if (z3) {
                    c0116n.R(r7, 2);
                    int r10 = 0;
                    for (int r72 = 0; r72 < list.size(); r72++) {
                        long longValue = ((Long) list.get(r72)).longValue();
                        r10 += C0116n.B((longValue >> 63) ^ (longValue << 1));
                    }
                    c0116n.T(r10);
                    while (r22 < list.size()) {
                        long longValue2 = ((Long) list.get(r22)).longValue();
                        c0116n.V((longValue2 >> 63) ^ (longValue2 << 1));
                        r22++;
                    }
                    return;
                }
                while (r22 < list.size()) {
                    long longValue3 = ((Long) list.get(r22)).longValue();
                    c0116n.U((longValue3 >> 63) ^ (longValue3 << 1), r7);
                    r22++;
                }
                return;
            }
            throw new ClassCastException();
        }
    }

    public static void R(int r4, List list, Q q3) {
        if (list != null && !list.isEmpty()) {
            q3.getClass();
            boolean z3 = list instanceof K;
            C0116n c0116n = (C0116n) q3.f2306a;
            int r12 = 0;
            if (z3) {
                K k3 = (K) list;
                while (r12 < list.size()) {
                    Object d4 = k3.d();
                    if (d4 instanceof String) {
                        c0116n.P((String) d4, r4);
                    } else {
                        c0116n.H(r4, (C0111h) d4);
                    }
                    r12++;
                }
                return;
            }
            while (r12 < list.size()) {
                c0116n.P((String) list.get(r12), r4);
                r12++;
            }
        }
    }

    public static void S(int r22, List list, Q q3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            q3.getClass();
            if (!(list instanceof E)) {
                C0116n c0116n = (C0116n) q3.f2306a;
                int r02 = 0;
                if (z3) {
                    c0116n.R(r22, 2);
                    int r5 = 0;
                    for (int r23 = 0; r23 < list.size(); r23++) {
                        r5 += C0116n.z(((Integer) list.get(r23)).intValue());
                    }
                    c0116n.T(r5);
                    while (r02 < list.size()) {
                        c0116n.T(((Integer) list.get(r02)).intValue());
                        r02++;
                    }
                    return;
                }
                while (r02 < list.size()) {
                    c0116n.S(r22, ((Integer) list.get(r02)).intValue());
                    r02++;
                }
                return;
            }
            throw new ClassCastException();
        }
    }

    public static void T(int r3, List list, Q q3, boolean z3) {
        if (list != null && !list.isEmpty()) {
            q3.getClass();
            if (!(list instanceof N)) {
                C0116n c0116n = (C0116n) q3.f2306a;
                int r02 = 0;
                if (z3) {
                    c0116n.R(r3, 2);
                    int r6 = 0;
                    for (int r32 = 0; r32 < list.size(); r32++) {
                        r6 += C0116n.B(((Long) list.get(r32)).longValue());
                    }
                    c0116n.T(r6);
                    while (r02 < list.size()) {
                        c0116n.V(((Long) list.get(r02)).longValue());
                        r02++;
                    }
                    return;
                }
                while (r02 < list.size()) {
                    c0116n.U(((Long) list.get(r02)).longValue(), r3);
                    r02++;
                }
                return;
            }
            throw new ClassCastException();
        }
    }

    public static int a(int r02, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0116n.g(r02) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int r22, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int x3 = C0116n.x(r22) * size;
        for (int r12 = 0; r12 < list.size(); r12++) {
            x3 += C0116n.i((C0111h) list.get(r12));
        }
        return x3;
    }

    public static int d(int r12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0116n.x(r12) * size) + e(list);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof E) {
            E e4 = (E) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int r22 = 0;
        for (int r12 = 0; r12 < size; r12++) {
            r22 += C0116n.B(((Integer) list.get(r12)).intValue());
        }
        return r22;
    }

    public static int f(int r02, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0116n.l(r02) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int r02, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0116n.m(r02) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int r4, List list, i0 i0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r22 = 0;
        for (int r12 = 0; r12 < size; r12++) {
            r22 += C0116n.o(r4, (AbstractC0098a) list.get(r12), i0Var);
        }
        return r22;
    }

    public static int k(int r12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0116n.x(r12) * size) + l(list);
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof E) {
            E e4 = (E) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int r22 = 0;
        for (int r12 = 0; r12 < size; r12++) {
            r22 += C0116n.B(((Integer) list.get(r12)).intValue());
        }
        return r22;
    }

    public static int m(int r12, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C0116n.x(r12) * list.size()) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof N) {
            N n3 = (N) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int r22 = 0;
        for (int r12 = 0; r12 < size; r12++) {
            r22 += C0116n.B(((Long) list.get(r12)).longValue());
        }
        return r22;
    }

    public static int o(int r02, Object obj, i0 i0Var) {
        int x3 = C0116n.x(r02);
        int a4 = ((AbstractC0098a) obj).a(i0Var);
        return C0116n.z(a4) + a4 + x3;
    }

    public static int p(int r4, List list, i0 i0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int x3 = C0116n.x(r4) * size;
        for (int r12 = 0; r12 < size; r12++) {
            int a4 = ((AbstractC0098a) list.get(r12)).a(i0Var);
            x3 += C0116n.z(a4) + a4;
        }
        return x3;
    }

    public static int q(int r12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0116n.x(r12) * size) + r(list);
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof E) {
            E e4 = (E) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int r22 = 0;
        for (int r12 = 0; r12 < size; r12++) {
            int intValue = ((Integer) list.get(r12)).intValue();
            r22 += C0116n.z((intValue >> 31) ^ (intValue << 1));
        }
        return r22;
    }

    public static int s(int r12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0116n.x(r12) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof N) {
            N n3 = (N) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int r22 = 0;
        for (int r12 = 0; r12 < size; r12++) {
            long longValue = ((Long) list.get(r12)).longValue();
            r22 += C0116n.B((longValue >> 63) ^ (longValue << 1));
        }
        return r22;
    }

    public static int u(int r4, List list) {
        int w3;
        int w4;
        int size = list.size();
        int r12 = 0;
        if (size == 0) {
            return 0;
        }
        int x3 = C0116n.x(r4) * size;
        if (list instanceof K) {
            K k3 = (K) list;
            while (r12 < size) {
                Object d4 = k3.d();
                if (d4 instanceof C0111h) {
                    w4 = C0116n.i((C0111h) d4);
                } else {
                    w4 = C0116n.w((String) d4);
                }
                x3 = w4 + x3;
                r12++;
            }
        } else {
            while (r12 < size) {
                Object obj = list.get(r12);
                if (obj instanceof C0111h) {
                    w3 = C0116n.i((C0111h) obj);
                } else {
                    w3 = C0116n.w((String) obj);
                }
                x3 = w3 + x3;
                r12++;
            }
        }
        return x3;
    }

    public static int v(int r12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0116n.x(r12) * size) + w(list);
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof E) {
            E e4 = (E) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int r22 = 0;
        for (int r12 = 0; r12 < size; r12++) {
            r22 += C0116n.z(((Integer) list.get(r12)).intValue());
        }
        return r22;
    }

    public static int x(int r12, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0116n.x(r12) * size) + y(list);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof N) {
            N n3 = (N) list;
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int r22 = 0;
        for (int r12 = 0; r12 < size; r12++) {
            r22 += C0116n.B(((Long) list.get(r12)).longValue());
        }
        return r22;
    }

    public static Object z(Object obj, int r12, F f2, Object obj2, q0 q0Var) {
        return obj2;
    }
}
