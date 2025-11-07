package R;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class c implements Collection, Set {

    /* renamed from: N  reason: collision with root package name */
    public static final int[] f1109N = new int[0];

    /* renamed from: O  reason: collision with root package name */
    public static final Object[] f1110O = new Object[0];

    /* renamed from: P  reason: collision with root package name */
    public static Object[] f1111P;

    /* renamed from: Q  reason: collision with root package name */
    public static int f1112Q;

    /* renamed from: R  reason: collision with root package name */
    public static Object[] f1113R;

    /* renamed from: S  reason: collision with root package name */
    public static int f1114S;

    /* renamed from: J  reason: collision with root package name */
    public int[] f1115J;

    /* renamed from: K  reason: collision with root package name */
    public Object[] f1116K;

    /* renamed from: L  reason: collision with root package name */
    public int f1117L;

    /* renamed from: M  reason: collision with root package name */
    public a f1118M;

    public c(int r12) {
        if (r12 == 0) {
            this.f1115J = f1109N;
            this.f1116K = f1110O;
        } else {
            e(r12);
        }
        this.f1117L = 0;
    }

    public static void h(int[] r7, Object[] objArr, int r9) {
        if (r7.length == 8) {
            synchronized (c.class) {
                try {
                    if (f1114S < 10) {
                        objArr[0] = f1113R;
                        objArr[1] = r7;
                        for (int r92 = r9 - 1; r92 >= 2; r92--) {
                            objArr[r92] = null;
                        }
                        f1113R = objArr;
                        f1114S++;
                    }
                } finally {
                }
            }
        } else if (r7.length == 4) {
            synchronized (c.class) {
                try {
                    if (f1112Q < 10) {
                        objArr[0] = f1111P;
                        objArr[1] = r7;
                        for (int r93 = r9 - 1; r93 >= 2; r93--) {
                            objArr[r93] = null;
                        }
                        f1111P = objArr;
                        f1112Q++;
                    }
                } finally {
                }
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int r22;
        int i3;
        if (obj == null) {
            i3 = j();
            r22 = 0;
        } else {
            int hashCode = obj.hashCode();
            r22 = hashCode;
            i3 = i(hashCode, obj);
        }
        if (i3 >= 0) {
            return false;
        }
        int r12 = ~i3;
        int r3 = this.f1117L;
        int[] r4 = this.f1115J;
        if (r3 >= r4.length) {
            int r5 = 8;
            if (r3 >= 8) {
                r5 = (r3 >> 1) + r3;
            } else if (r3 < 4) {
                r5 = 4;
            }
            Object[] objArr = this.f1116K;
            e(r5);
            int[] r52 = this.f1115J;
            if (r52.length > 0) {
                System.arraycopy(r4, 0, r52, 0, r4.length);
                System.arraycopy(objArr, 0, this.f1116K, 0, objArr.length);
            }
            h(r4, objArr, this.f1117L);
        }
        int r02 = this.f1117L;
        if (r12 < r02) {
            int[] r32 = this.f1115J;
            int r42 = r12 + 1;
            System.arraycopy(r32, r12, r32, r42, r02 - r12);
            Object[] objArr2 = this.f1116K;
            System.arraycopy(objArr2, r12, objArr2, r42, this.f1117L - r12);
        }
        this.f1115J[r12] = r22;
        this.f1116K[r12] = obj;
        this.f1117L++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f1117L;
        int[] r02 = this.f1115J;
        boolean z3 = false;
        if (r02.length < size) {
            Object[] objArr = this.f1116K;
            e(size);
            int r12 = this.f1117L;
            if (r12 > 0) {
                System.arraycopy(r02, 0, this.f1115J, 0, r12);
                System.arraycopy(objArr, 0, this.f1116K, 0, this.f1117L);
            }
            h(r02, objArr, this.f1117L);
        }
        for (Object obj : collection) {
            z3 |= add(obj);
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int r02 = this.f1117L;
        if (r02 != 0) {
            h(this.f1115J, this.f1116K, r02);
            this.f1115J = f1109N;
            this.f1116K = f1110O;
            this.f1117L = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    public final void e(int r6) {
        if (r6 == 8) {
            synchronized (c.class) {
                try {
                    Object[] objArr = f1113R;
                    if (objArr != null) {
                        this.f1116K = objArr;
                        f1113R = (Object[]) objArr[0];
                        this.f1115J = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f1114S--;
                        return;
                    }
                } finally {
                }
            }
        } else if (r6 == 4) {
            synchronized (c.class) {
                try {
                    Object[] objArr2 = f1111P;
                    if (objArr2 != null) {
                        this.f1116K = objArr2;
                        f1111P = (Object[]) objArr2[0];
                        this.f1115J = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f1112Q--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f1115J = new int[r6];
        this.f1116K = new Object[r6];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f1117L != set.size()) {
                return false;
            }
            for (int r12 = 0; r12 < this.f1117L; r12++) {
                try {
                    if (!set.contains(this.f1116K[r12])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] r02 = this.f1115J;
        int r12 = this.f1117L;
        int r3 = 0;
        for (int r22 = 0; r22 < r12; r22++) {
            r3 += r02[r22];
        }
        return r3;
    }

    public final int i(int r5, Object obj) {
        int r02 = this.f1117L;
        if (r02 == 0) {
            return -1;
        }
        int a4 = d.a(r02, r5, this.f1115J);
        if (a4 < 0) {
            return a4;
        }
        if (obj.equals(this.f1116K[a4])) {
            return a4;
        }
        int r22 = a4 + 1;
        while (r22 < r02 && this.f1115J[r22] == r5) {
            if (obj.equals(this.f1116K[r22])) {
                return r22;
            }
            r22++;
        }
        for (int r12 = a4 - 1; r12 >= 0 && this.f1115J[r12] == r5; r12--) {
            if (obj.equals(this.f1116K[r12])) {
                return r12;
            }
        }
        return ~r22;
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return j();
        }
        return i(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        if (this.f1117L <= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (this.f1118M == null) {
            this.f1118M = new a(1, this);
        }
        a aVar = this.f1118M;
        if (((h) aVar.f1067b) == null) {
            aVar.f1067b = new h(aVar, 1);
        }
        return ((h) aVar.f1067b).iterator();
    }

    public final int j() {
        int r02 = this.f1117L;
        if (r02 == 0) {
            return -1;
        }
        int a4 = d.a(r02, 0, this.f1115J);
        if (a4 < 0) {
            return a4;
        }
        if (this.f1116K[a4] == null) {
            return a4;
        }
        int r22 = a4 + 1;
        while (r22 < r02 && this.f1115J[r22] == 0) {
            if (this.f1116K[r22] == null) {
                return r22;
            }
            r22++;
        }
        for (int r12 = a4 - 1; r12 >= 0 && this.f1115J[r12] == 0; r12--) {
            if (this.f1116K[r12] == null) {
                return r12;
            }
        }
        return ~r22;
    }

    public final void k(int r8) {
        Object[] objArr = this.f1116K;
        Object obj = objArr[r8];
        int r12 = this.f1117L;
        if (r12 <= 1) {
            h(this.f1115J, objArr, r12);
            this.f1115J = f1109N;
            this.f1116K = f1110O;
            this.f1117L = 0;
            return;
        }
        int[] r4 = this.f1115J;
        int r6 = 8;
        if (r4.length > 8 && r12 < r4.length / 3) {
            if (r12 > 8) {
                r6 = r12 + (r12 >> 1);
            }
            e(r6);
            this.f1117L--;
            if (r8 > 0) {
                System.arraycopy(r4, 0, this.f1115J, 0, r8);
                System.arraycopy(objArr, 0, this.f1116K, 0, r8);
            }
            int r13 = this.f1117L;
            if (r8 < r13) {
                int r22 = r8 + 1;
                System.arraycopy(r4, r22, this.f1115J, r8, r13 - r8);
                System.arraycopy(objArr, r22, this.f1116K, r8, this.f1117L - r8);
                return;
            }
            return;
        }
        int r14 = r12 - 1;
        this.f1117L = r14;
        if (r8 < r14) {
            int r02 = r8 + 1;
            System.arraycopy(r4, r02, r4, r8, r14 - r8);
            Object[] objArr2 = this.f1116K;
            System.arraycopy(objArr2, r02, objArr2, r8, this.f1117L - r8);
        }
        this.f1116K[this.f1117L] = null;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            k(indexOf);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        boolean z3 = false;
        for (Object obj : collection) {
            z3 |= remove(obj);
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z3 = false;
        for (int r02 = this.f1117L - 1; r02 >= 0; r02--) {
            if (!collection.contains(this.f1116K[r02])) {
                k(r02);
                z3 = true;
            }
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f1117L;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int r02 = this.f1117L;
        Object[] objArr = new Object[r02];
        System.arraycopy(this.f1116K, 0, objArr, 0, r02);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1117L * 14);
        sb.append('{');
        for (int r12 = 0; r12 < this.f1117L; r12++) {
            if (r12 > 0) {
                sb.append(", ");
            }
            Object obj = this.f1116K[r12];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f1117L) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f1117L);
        }
        System.arraycopy(this.f1116K, 0, objArr, 0, this.f1117L);
        int length = objArr.length;
        int r12 = this.f1117L;
        if (length > r12) {
            objArr[r12] = null;
        }
        return objArr;
    }
}
