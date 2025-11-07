package R;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class k {

    /* renamed from: M  reason: collision with root package name */
    public static Object[] f1143M;

    /* renamed from: N  reason: collision with root package name */
    public static int f1144N;

    /* renamed from: O  reason: collision with root package name */
    public static Object[] f1145O;

    /* renamed from: P  reason: collision with root package name */
    public static int f1146P;

    /* renamed from: J  reason: collision with root package name */
    public int[] f1147J = d.f1119a;

    /* renamed from: K  reason: collision with root package name */
    public Object[] f1148K = d.f1120b;

    /* renamed from: L  reason: collision with root package name */
    public int f1149L = 0;

    public static void b(int[] r7, Object[] objArr, int r9) {
        if (r7.length == 8) {
            synchronized (k.class) {
                try {
                    if (f1146P < 10) {
                        objArr[0] = f1145O;
                        objArr[1] = r7;
                        for (int r72 = (r9 << 1) - 1; r72 >= 2; r72--) {
                            objArr[r72] = null;
                        }
                        f1145O = objArr;
                        f1146P++;
                    }
                } finally {
                }
            }
        } else if (r7.length == 4) {
            synchronized (k.class) {
                try {
                    if (f1144N < 10) {
                        objArr[0] = f1143M;
                        objArr[1] = r7;
                        for (int r73 = (r9 << 1) - 1; r73 >= 2; r73--) {
                            objArr[r73] = null;
                        }
                        f1143M = objArr;
                        f1144N++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int r6) {
        if (r6 == 8) {
            synchronized (k.class) {
                try {
                    Object[] objArr = f1145O;
                    if (objArr != null) {
                        this.f1148K = objArr;
                        f1145O = (Object[]) objArr[0];
                        this.f1147J = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f1146P--;
                        return;
                    }
                } finally {
                }
            }
        } else if (r6 == 4) {
            synchronized (k.class) {
                try {
                    Object[] objArr2 = f1143M;
                    if (objArr2 != null) {
                        this.f1148K = objArr2;
                        f1143M = (Object[]) objArr2[0];
                        this.f1147J = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f1144N--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f1147J = new int[r6];
        this.f1148K = new Object[r6 << 1];
    }

    public final int c(int r6, Object obj) {
        int r02 = this.f1149L;
        if (r02 == 0) {
            return -1;
        }
        try {
            int a4 = d.a(r02, r6, this.f1147J);
            if (a4 < 0) {
                return a4;
            }
            if (obj.equals(this.f1148K[a4 << 1])) {
                return a4;
            }
            int r22 = a4 + 1;
            while (r22 < r02 && this.f1147J[r22] == r6) {
                if (obj.equals(this.f1148K[r22 << 1])) {
                    return r22;
                }
                r22++;
            }
            for (int r12 = a4 - 1; r12 >= 0 && this.f1147J[r12] == r6; r12--) {
                if (obj.equals(this.f1148K[r12 << 1])) {
                    return r12;
                }
            }
            return ~r22;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int r02 = this.f1149L;
        if (r02 > 0) {
            int[] r12 = this.f1147J;
            Object[] objArr = this.f1148K;
            this.f1147J = d.f1119a;
            this.f1148K = d.f1120b;
            this.f1149L = 0;
            b(r12, objArr, r02);
        }
        if (this.f1149L <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final boolean containsKey(Object obj) {
        if (d(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(Object obj) {
        if (f(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final int d(Object obj) {
        if (obj == null) {
            return e();
        }
        return c(obj.hashCode(), obj);
    }

    public final int e() {
        int r02 = this.f1149L;
        if (r02 == 0) {
            return -1;
        }
        try {
            int a4 = d.a(r02, 0, this.f1147J);
            if (a4 < 0) {
                return a4;
            }
            if (this.f1148K[a4 << 1] == null) {
                return a4;
            }
            int r22 = a4 + 1;
            while (r22 < r02 && this.f1147J[r22] == 0) {
                if (this.f1148K[r22 << 1] == null) {
                    return r22;
                }
                r22++;
            }
            for (int r12 = a4 - 1; r12 >= 0 && this.f1147J[r12] == 0; r12--) {
                if (this.f1148K[r12 << 1] == null) {
                    return r12;
                }
            }
            return ~r22;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f1149L != kVar.f1149L) {
                return false;
            }
            for (int r12 = 0; r12 < this.f1149L; r12++) {
                try {
                    Object g = g(r12);
                    Object i3 = i(r12);
                    Object orDefault = kVar.getOrDefault(g, null);
                    if (i3 == null) {
                        if (orDefault != null || !kVar.containsKey(g)) {
                            return false;
                        }
                    } else if (!i3.equals(orDefault)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f1149L != map.size()) {
                return false;
            }
            for (int r13 = 0; r13 < this.f1149L; r13++) {
                try {
                    Object g3 = g(r13);
                    Object i4 = i(r13);
                    Object obj2 = map.get(g3);
                    if (i4 == null) {
                        if (obj2 != null || !map.containsKey(g3)) {
                            return false;
                        }
                    } else if (!i4.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(Object obj) {
        int r02 = this.f1149L * 2;
        Object[] objArr = this.f1148K;
        if (obj == null) {
            for (int r6 = 1; r6 < r02; r6 += 2) {
                if (objArr[r6] == null) {
                    return r6 >> 1;
                }
            }
            return -1;
        }
        for (int r3 = 1; r3 < r02; r3 += 2) {
            if (obj.equals(objArr[r3])) {
                return r3 >> 1;
            }
        }
        return -1;
    }

    public final Object g(int r22) {
        return this.f1148K[r22 << 1];
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int d4 = d(obj);
        if (d4 >= 0) {
            return this.f1148K[(d4 << 1) + 1];
        }
        return obj2;
    }

    public final Object h(int r11) {
        Object[] objArr = this.f1148K;
        int r12 = r11 << 1;
        Object obj = objArr[r12 + 1];
        int r3 = this.f1149L;
        int r4 = 0;
        if (r3 <= 1) {
            b(this.f1147J, objArr, r3);
            this.f1147J = d.f1119a;
            this.f1148K = d.f1120b;
        } else {
            int r6 = r3 - 1;
            int[] r7 = this.f1147J;
            int r9 = 8;
            if (r7.length > 8 && r3 < r7.length / 3) {
                if (r3 > 8) {
                    r9 = r3 + (r3 >> 1);
                }
                a(r9);
                if (r3 == this.f1149L) {
                    if (r11 > 0) {
                        System.arraycopy(r7, 0, this.f1147J, 0, r11);
                        System.arraycopy(objArr, 0, this.f1148K, 0, r12);
                    }
                    if (r11 < r6) {
                        int r42 = r11 + 1;
                        int r92 = r6 - r11;
                        System.arraycopy(r7, r42, this.f1147J, r11, r92);
                        System.arraycopy(objArr, r42 << 1, this.f1148K, r12, r92 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (r11 < r6) {
                    int r02 = r11 + 1;
                    int r43 = r6 - r11;
                    System.arraycopy(r7, r02, r7, r11, r43);
                    Object[] objArr2 = this.f1148K;
                    System.arraycopy(objArr2, r02 << 1, objArr2, r12, r43 << 1);
                }
                Object[] objArr3 = this.f1148K;
                int r03 = r6 << 1;
                objArr3[r03] = null;
                objArr3[r03 + 1] = null;
            }
            r4 = r6;
        }
        if (r3 == this.f1149L) {
            this.f1149L = r4;
            return obj;
        }
        throw new ConcurrentModificationException();
    }

    public final int hashCode() {
        int hashCode;
        int[] r02 = this.f1147J;
        Object[] objArr = this.f1148K;
        int r22 = this.f1149L;
        int r4 = 1;
        int r5 = 0;
        int r6 = 0;
        while (r5 < r22) {
            Object obj = objArr[r4];
            int r8 = r02[r5];
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            r6 += hashCode ^ r8;
            r5++;
            r4 += 2;
        }
        return r6;
    }

    public final Object i(int r22) {
        return this.f1148K[(r22 << 1) + 1];
    }

    public final boolean isEmpty() {
        if (this.f1149L <= 0) {
            return true;
        }
        return false;
    }

    public final Object put(Object obj, Object obj2) {
        int r3;
        int c4;
        int r02 = this.f1149L;
        if (obj == null) {
            c4 = e();
            r3 = 0;
        } else {
            int hashCode = obj.hashCode();
            r3 = hashCode;
            c4 = c(hashCode, obj);
        }
        if (c4 >= 0) {
            int r10 = (c4 << 1) + 1;
            Object[] objArr = this.f1148K;
            Object obj3 = objArr[r10];
            objArr[r10] = obj2;
            return obj3;
        }
        int r22 = ~c4;
        int[] r4 = this.f1147J;
        if (r02 >= r4.length) {
            int r5 = 8;
            if (r02 >= 8) {
                r5 = (r02 >> 1) + r02;
            } else if (r02 < 4) {
                r5 = 4;
            }
            Object[] objArr2 = this.f1148K;
            a(r5);
            if (r02 == this.f1149L) {
                int[] r52 = this.f1147J;
                if (r52.length > 0) {
                    System.arraycopy(r4, 0, r52, 0, r4.length);
                    System.arraycopy(objArr2, 0, this.f1148K, 0, objArr2.length);
                }
                b(r4, objArr2, r02);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (r22 < r02) {
            int[] r12 = this.f1147J;
            int r42 = r22 + 1;
            System.arraycopy(r12, r22, r12, r42, r02 - r22);
            Object[] objArr3 = this.f1148K;
            System.arraycopy(objArr3, r22 << 1, objArr3, r42 << 1, (this.f1149L - r22) << 1);
        }
        int r13 = this.f1149L;
        if (r02 == r13) {
            int[] r03 = this.f1147J;
            if (r22 < r03.length) {
                r03[r22] = r3;
                Object[] objArr4 = this.f1148K;
                int r23 = r22 << 1;
                objArr4[r23] = obj;
                objArr4[r23 + 1] = obj2;
                this.f1149L = r13 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, null);
        if (orDefault == null) {
            return put(obj, obj2);
        }
        return orDefault;
    }

    public final Object remove(Object obj) {
        int d4 = d(obj);
        if (d4 >= 0) {
            return h(d4);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int d4 = d(obj);
        if (d4 >= 0) {
            int r3 = (d4 << 1) + 1;
            Object[] objArr = this.f1148K;
            Object obj3 = objArr[r3];
            objArr[r3] = obj2;
            return obj3;
        }
        return null;
    }

    public final int size() {
        return this.f1149L;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1149L * 28);
        sb.append('{');
        for (int r12 = 0; r12 < this.f1149L; r12++) {
            if (r12 > 0) {
                sb.append(", ");
            }
            Object g = g(r12);
            if (g != this) {
                sb.append(g);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object i3 = i(r12);
            if (i3 != this) {
                sb.append(i3);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int d4 = d(obj);
        if (d4 >= 0) {
            Object i3 = i(d4);
            if (obj2 == i3 || (obj2 != null && obj2.equals(i3))) {
                h(d4);
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int d4 = d(obj);
        if (d4 >= 0) {
            Object i3 = i(d4);
            if (i3 == obj2 || (obj2 != null && obj2.equals(i3))) {
                int r3 = (d4 << 1) + 1;
                Object[] objArr = this.f1148K;
                Object obj4 = objArr[r3];
                objArr[r3] = obj3;
                return true;
            }
            return false;
        }
        return false;
    }
}
