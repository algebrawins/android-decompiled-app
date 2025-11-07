package x1;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: x1.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0730w extends AbstractMap implements Serializable {

    /* renamed from: S  reason: collision with root package name */
    public static final Object f6113S = new Object();

    /* renamed from: J  reason: collision with root package name */
    public transient Object f6114J;

    /* renamed from: K  reason: collision with root package name */
    public transient int[] f6115K;

    /* renamed from: L  reason: collision with root package name */
    public transient Object[] f6116L;

    /* renamed from: M  reason: collision with root package name */
    public transient Object[] f6117M;

    /* renamed from: N  reason: collision with root package name */
    public transient int f6118N = Math.min(Math.max(12, 1), 1073741823);

    /* renamed from: O  reason: collision with root package name */
    public transient int f6119O;

    /* renamed from: P  reason: collision with root package name */
    public transient C0706t f6120P;

    /* renamed from: Q  reason: collision with root package name */
    public transient C0706t f6121Q;

    /* renamed from: R  reason: collision with root package name */
    public transient C0722v f6122R;

    public final Map a() {
        Object obj = this.f6114J;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void b(int r11, int r12) {
        Object obj = this.f6114J;
        obj.getClass();
        int[] r13 = this.f6115K;
        r13.getClass();
        Object[] objArr = this.f6116L;
        objArr.getClass();
        Object[] objArr2 = this.f6117M;
        objArr2.getClass();
        int size = size();
        int r5 = size - 1;
        if (r11 < r5) {
            Object obj2 = objArr[r5];
            objArr[r11] = obj2;
            objArr2[r11] = objArr2[r5];
            objArr[r5] = null;
            objArr2[r5] = null;
            r13[r11] = r13[r5];
            r13[r5] = 0;
            int a4 = AbstractC0641k5.a(obj2) & r12;
            int b3 = AbstractC0633j5.b(a4, obj);
            if (b3 == size) {
                AbstractC0633j5.d(obj, a4, r11 + 1);
                return;
            }
            while (true) {
                int r3 = b3 - 1;
                int r02 = r13[r3];
                int r22 = r02 & r12;
                if (r22 != size) {
                    b3 = r22;
                } else {
                    r13[r3] = ((r11 + 1) & r12) | (r02 & (~r12));
                    return;
                }
            }
        } else {
            objArr[r11] = null;
            objArr2[r11] = null;
            r13[r11] = 0;
        }
    }

    public final boolean c() {
        if (this.f6114J == null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (c()) {
            return;
        }
        this.f6118N += 32;
        Map a4 = a();
        if (a4 == null) {
            Object[] objArr = this.f6116L;
            objArr.getClass();
            Arrays.fill(objArr, 0, this.f6119O, (Object) null);
            Object[] objArr2 = this.f6117M;
            objArr2.getClass();
            Arrays.fill(objArr2, 0, this.f6119O, (Object) null);
            Object obj = this.f6114J;
            obj.getClass();
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, (short) 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            int[] r02 = this.f6115K;
            r02.getClass();
            Arrays.fill(r02, 0, this.f6119O, 0);
            this.f6119O = 0;
            return;
        }
        this.f6118N = Math.min(Math.max(size(), 3), 1073741823);
        a4.clear();
        this.f6114J = null;
        this.f6119O = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map a4 = a();
        if (a4 != null) {
            return a4.containsKey(obj);
        }
        if (e(obj) == -1) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map a4 = a();
        if (a4 == null) {
            for (int r12 = 0; r12 < this.f6119O; r12++) {
                Object[] objArr = this.f6117M;
                objArr.getClass();
                if (AbstractC0617g5.a(obj, objArr[r12])) {
                    return true;
                }
            }
            return false;
        }
        return a4.containsValue(obj);
    }

    public final int d() {
        return (1 << (this.f6118N & 31)) - 1;
    }

    public final int e(Object obj) {
        if (c()) {
            return -1;
        }
        int a4 = AbstractC0641k5.a(obj);
        int d4 = d();
        Object obj2 = this.f6114J;
        obj2.getClass();
        int b3 = AbstractC0633j5.b(a4 & d4, obj2);
        if (b3 == 0) {
            return -1;
        }
        int r4 = ~d4;
        int r02 = a4 & r4;
        do {
            int r3 = b3 - 1;
            int[] r5 = this.f6115K;
            r5.getClass();
            int r52 = r5[r3];
            if ((r52 & r4) == r02) {
                Object[] objArr = this.f6116L;
                objArr.getClass();
                if (AbstractC0617g5.a(obj, objArr[r3])) {
                    return r3;
                }
            }
            b3 = r52 & d4;
        } while (b3 != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C0706t c0706t = this.f6121Q;
        if (c0706t == null) {
            C0706t c0706t2 = new C0706t(this, 0);
            this.f6121Q = c0706t2;
            return c0706t2;
        }
        return c0706t;
    }

    public final int f(int r9, int r10, int r11, int r12) {
        int r02 = r10 - 1;
        Object c4 = AbstractC0633j5.c(r10);
        if (r12 != 0) {
            AbstractC0633j5.d(c4, r11 & r02, r12 + 1);
        }
        Object obj = this.f6114J;
        obj.getClass();
        int[] r122 = this.f6115K;
        r122.getClass();
        for (int r13 = 0; r13 <= r9; r13++) {
            int b3 = AbstractC0633j5.b(r13, obj);
            while (b3 != 0) {
                int r3 = b3 - 1;
                int r4 = r122[r3];
                int r5 = ((~r9) & r4) | r13;
                int r6 = r5 & r02;
                int b4 = AbstractC0633j5.b(r6, c4);
                AbstractC0633j5.d(c4, r6, b3);
                r122[r3] = ((~r02) & r5) | (b4 & r02);
                b3 = r4 & r9;
            }
        }
        this.f6114J = c4;
        this.f6118N = ((32 - Integer.numberOfLeadingZeros(r02)) & 31) | (this.f6118N & (-32));
        return r02;
    }

    public final Object g(Object obj) {
        boolean c4 = c();
        Object obj2 = f6113S;
        if (c4) {
            return obj2;
        }
        int d4 = d();
        Object obj3 = this.f6114J;
        obj3.getClass();
        int[] r6 = this.f6115K;
        r6.getClass();
        Object[] objArr = this.f6116L;
        objArr.getClass();
        int a4 = AbstractC0633j5.a(obj, null, d4, obj3, r6, objArr, null);
        if (a4 == -1) {
            return obj2;
        }
        Object[] objArr2 = this.f6117M;
        objArr2.getClass();
        Object obj4 = objArr2[a4];
        b(a4, d4);
        this.f6119O--;
        this.f6118N += 32;
        return obj4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map a4 = a();
        if (a4 != null) {
            return a4.get(obj);
        }
        int e4 = e(obj);
        if (e4 == -1) {
            return null;
        }
        Object[] objArr = this.f6117M;
        objArr.getClass();
        return objArr[e4];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C0706t c0706t = this.f6120P;
        if (c0706t == null) {
            C0706t c0706t2 = new C0706t(this, 1);
            this.f6120P = c0706t2;
            return c0706t2;
        }
        return c0706t;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int r16;
        int min;
        int r162;
        int r7 = -1;
        if (c()) {
            AbstractC0625h5.c("Arrays already allocated", c());
            int r3 = this.f6118N;
            int max = Math.max(r3 + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > highestOneBit && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f6114J = AbstractC0633j5.c(max2);
            this.f6118N = ((32 - Integer.numberOfLeadingZeros(max2 - 1)) & 31) | (this.f6118N & (-32));
            this.f6115K = new int[r3];
            this.f6116L = new Object[r3];
            this.f6117M = new Object[r3];
        }
        Map a4 = a();
        if (a4 == null) {
            int[] r8 = this.f6115K;
            r8.getClass();
            Object[] objArr = this.f6116L;
            objArr.getClass();
            Object[] objArr2 = this.f6117M;
            objArr2.getClass();
            int r11 = this.f6119O;
            int r12 = r11 + 1;
            int a5 = AbstractC0641k5.a(obj);
            int d4 = d();
            int r32 = a5 & d4;
            Object obj3 = this.f6114J;
            obj3.getClass();
            int b3 = AbstractC0633j5.b(r32, obj3);
            if (b3 == 0) {
                if (r12 > d4) {
                    if (d4 < 32) {
                        r162 = 4;
                    } else {
                        r162 = 2;
                    }
                    d4 = f(d4, (d4 + 1) * r162, a5, r11);
                } else {
                    Object obj4 = this.f6114J;
                    obj4.getClass();
                    AbstractC0633j5.d(obj4, r32, r12);
                }
            } else {
                int r33 = ~d4;
                int r6 = a5 & r33;
                int r17 = 0;
                int r18 = 0;
                while (true) {
                    int r15 = b3 + r7;
                    int r19 = r8[r15];
                    int r72 = r19 & r33;
                    if (r72 == r6 && AbstractC0617g5.a(obj, objArr[r15])) {
                        Object obj5 = objArr2[r15];
                        objArr2[r15] = obj2;
                        return obj5;
                    }
                    int r5 = r19 & d4;
                    int r192 = r33;
                    int r34 = r18 + 1;
                    if (r5 == 0) {
                        if (r34 >= 9) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap(d() + 1, 1.0f);
                            if (isEmpty()) {
                                r17 = -1;
                            }
                            while (r17 >= 0) {
                                Object[] objArr3 = this.f6116L;
                                objArr3.getClass();
                                Object obj6 = objArr3[r17];
                                Object[] objArr4 = this.f6117M;
                                objArr4.getClass();
                                linkedHashMap.put(obj6, objArr4[r17]);
                                int r35 = r17 + 1;
                                if (r35 >= this.f6119O) {
                                    r17 = -1;
                                } else {
                                    r17 = r35;
                                }
                            }
                            this.f6114J = linkedHashMap;
                            this.f6115K = null;
                            this.f6116L = null;
                            this.f6117M = null;
                            this.f6118N += 32;
                            return linkedHashMap.put(obj, obj2);
                        } else if (r12 > d4) {
                            if (d4 < 32) {
                                r16 = 4;
                            } else {
                                r16 = 2;
                            }
                            d4 = f(d4, (d4 + 1) * r16, a5, r11);
                        } else {
                            r8[r15] = (r12 & d4) | r72;
                        }
                    } else {
                        r18 = r34;
                        b3 = r5;
                        r33 = r192;
                        r7 = -1;
                    }
                }
            }
            int[] r36 = this.f6115K;
            r36.getClass();
            int length = r36.length;
            if (r12 > length && (min = Math.min(1073741823, 1 | (Math.max(1, length >>> 1) + length))) != length) {
                int[] r37 = this.f6115K;
                r37.getClass();
                this.f6115K = Arrays.copyOf(r37, min);
                Object[] objArr5 = this.f6116L;
                objArr5.getClass();
                this.f6116L = Arrays.copyOf(objArr5, min);
                Object[] objArr6 = this.f6117M;
                objArr6.getClass();
                this.f6117M = Arrays.copyOf(objArr6, min);
            }
            int[] r4 = this.f6115K;
            r4.getClass();
            r4[r11] = (~d4) & a5;
            Object[] objArr7 = this.f6116L;
            objArr7.getClass();
            objArr7[r11] = obj;
            Object[] objArr8 = this.f6117M;
            objArr8.getClass();
            objArr8[r11] = obj2;
            this.f6119O = r12;
            this.f6118N += 32;
            return null;
        }
        return a4.put(obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map a4 = a();
        if (a4 != null) {
            return a4.remove(obj);
        }
        Object g = g(obj);
        if (g == f6113S) {
            return null;
        }
        return g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map a4 = a();
        if (a4 != null) {
            return a4.size();
        }
        return this.f6119O;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C0722v c0722v = this.f6122R;
        if (c0722v == null) {
            C0722v c0722v2 = new C0722v(this);
            this.f6122R = c0722v2;
            return c0722v2;
        }
        return c0722v;
    }
}
