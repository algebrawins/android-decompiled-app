package C2;

import D.C;
import a.AbstractC0069a;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class g extends AbstractList implements List {

    /* renamed from: M  reason: collision with root package name */
    public static final Object[] f263M = new Object[0];

    /* renamed from: J  reason: collision with root package name */
    public int f264J;

    /* renamed from: K  reason: collision with root package name */
    public Object[] f265K = f263M;

    /* renamed from: L  reason: collision with root package name */
    public int f266L;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r8, Object obj) {
        int r82;
        int r02 = this.f266L;
        if (r8 < 0 || r8 > r02) {
            throw new IndexOutOfBoundsException(C.x("index: ", r8, ", size: ", r02));
        }
        if (r8 == r02) {
            addLast(obj);
        } else if (r8 == 0) {
            addFirst(obj);
        } else {
            m();
            h(this.f266L + 1);
            int l3 = l(this.f264J + r8);
            int r22 = this.f266L;
            if (r8 < ((r22 + 1) >> 1)) {
                if (l3 == 0) {
                    Object[] objArr = this.f265K;
                    N2.g.e(objArr, "<this>");
                    l3 = objArr.length;
                }
                int r03 = l3 - 1;
                int r23 = this.f264J;
                if (r23 == 0) {
                    Object[] objArr2 = this.f265K;
                    N2.g.e(objArr2, "<this>");
                    r82 = objArr2.length - 1;
                } else {
                    r82 = r23 - 1;
                }
                int r24 = this.f264J;
                if (r03 >= r24) {
                    Object[] objArr3 = this.f265K;
                    objArr3[r82] = objArr3[r24];
                    h.b(objArr3, objArr3, r24, r24 + 1, r03 + 1);
                } else {
                    Object[] objArr4 = this.f265K;
                    h.b(objArr4, objArr4, r24 - 1, r24, objArr4.length);
                    Object[] objArr5 = this.f265K;
                    objArr5[objArr5.length - 1] = objArr5[0];
                    h.b(objArr5, objArr5, 0, 1, r03 + 1);
                }
                this.f265K[r03] = obj;
                this.f264J = r82;
            } else {
                int l4 = l(this.f264J + r22);
                if (l3 < l4) {
                    Object[] objArr6 = this.f265K;
                    h.b(objArr6, objArr6, l3 + 1, l3, l4);
                } else {
                    Object[] objArr7 = this.f265K;
                    h.b(objArr7, objArr7, 1, 0, l4);
                    Object[] objArr8 = this.f265K;
                    objArr8[0] = objArr8[objArr8.length - 1];
                    h.b(objArr8, objArr8, l3 + 1, l3, objArr8.length - 1);
                }
                this.f265K[l3] = obj;
            }
            this.f266L++;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int r9, Collection collection) {
        N2.g.e(collection, "elements");
        int r02 = this.f266L;
        if (r9 >= 0 && r9 <= r02) {
            if (collection.isEmpty()) {
                return false;
            }
            if (r9 == this.f266L) {
                return addAll(collection);
            }
            m();
            h(collection.size() + this.f266L);
            int l3 = l(this.f264J + this.f266L);
            int l4 = l(this.f264J + r9);
            int size = collection.size();
            if (r9 < ((this.f266L + 1) >> 1)) {
                int r92 = this.f264J;
                int r03 = r92 - size;
                if (l4 < r92) {
                    Object[] objArr = this.f265K;
                    h.b(objArr, objArr, r03, r92, objArr.length);
                    if (size >= l4) {
                        Object[] objArr2 = this.f265K;
                        h.b(objArr2, objArr2, objArr2.length - size, 0, l4);
                    } else {
                        Object[] objArr3 = this.f265K;
                        h.b(objArr3, objArr3, objArr3.length - size, 0, size);
                        Object[] objArr4 = this.f265K;
                        h.b(objArr4, objArr4, 0, size, l4);
                    }
                } else if (r03 >= 0) {
                    Object[] objArr5 = this.f265K;
                    h.b(objArr5, objArr5, r03, r92, l4);
                } else {
                    Object[] objArr6 = this.f265K;
                    r03 += objArr6.length;
                    int r6 = l4 - r92;
                    int length = objArr6.length - r03;
                    if (length >= r6) {
                        h.b(objArr6, objArr6, r03, r92, l4);
                    } else {
                        h.b(objArr6, objArr6, r03, r92, r92 + length);
                        Object[] objArr7 = this.f265K;
                        h.b(objArr7, objArr7, 0, this.f264J + length, l4);
                    }
                }
                this.f264J = r03;
                e(j(l4 - size), collection);
            } else {
                int r93 = l4 + size;
                if (l4 < l3) {
                    int r3 = size + l3;
                    Object[] objArr8 = this.f265K;
                    if (r3 <= objArr8.length) {
                        h.b(objArr8, objArr8, r93, l4, l3);
                    } else if (r93 >= objArr8.length) {
                        h.b(objArr8, objArr8, r93 - objArr8.length, l4, l3);
                    } else {
                        int length2 = l3 - (r3 - objArr8.length);
                        h.b(objArr8, objArr8, 0, length2, l3);
                        Object[] objArr9 = this.f265K;
                        h.b(objArr9, objArr9, r93, l4, length2);
                    }
                } else {
                    Object[] objArr10 = this.f265K;
                    h.b(objArr10, objArr10, size, 0, l3);
                    Object[] objArr11 = this.f265K;
                    if (r93 >= objArr11.length) {
                        h.b(objArr11, objArr11, r93 - objArr11.length, l4, objArr11.length);
                    } else {
                        h.b(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                        Object[] objArr12 = this.f265K;
                        h.b(objArr12, objArr12, r93, l4, objArr12.length - size);
                    }
                }
                e(l4, collection);
            }
            return true;
        }
        throw new IndexOutOfBoundsException(C.x("index: ", r9, ", size: ", r02));
    }

    public final void addFirst(Object obj) {
        m();
        h(this.f266L + 1);
        int r02 = this.f264J;
        if (r02 == 0) {
            Object[] objArr = this.f265K;
            N2.g.e(objArr, "<this>");
            r02 = objArr.length;
        }
        int r03 = r02 - 1;
        this.f264J = r03;
        this.f265K[r03] = obj;
        this.f266L++;
    }

    public final void addLast(Object obj) {
        m();
        h(this.f266L + 1);
        this.f265K[l(this.f264J + this.f266L)] = obj;
        this.f266L++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m();
            k(this.f264J, l(this.f264J + this.f266L));
        }
        this.f264J = 0;
        this.f266L = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final void e(int r5, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f265K.length;
        while (r5 < length && it.hasNext()) {
            this.f265K[r5] = it.next();
            r5++;
        }
        int r52 = this.f264J;
        for (int r12 = 0; r12 < r52 && it.hasNext(); r12++) {
            this.f265K[r12] = it.next();
        }
        this.f266L = collection.size() + this.f266L;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int r5) {
        int r02 = this.f266L;
        if (r5 >= 0 && r5 < r02) {
            return this.f265K[l(this.f264J + r5)];
        }
        throw new IndexOutOfBoundsException(C.x("index: ", r5, ", size: ", r02));
    }

    public final void h(int r5) {
        if (r5 >= 0) {
            Object[] objArr = this.f265K;
            if (r5 <= objArr.length) {
                return;
            }
            if (objArr == f263M) {
                if (r5 < 10) {
                    r5 = 10;
                }
                this.f265K = new Object[r5];
                return;
            }
            int length = objArr.length;
            int r12 = length + (length >> 1);
            if (r12 - r5 < 0) {
                r12 = r5;
            }
            if (r12 - 2147483639 > 0) {
                if (r5 > 2147483639) {
                    r12 = Integer.MAX_VALUE;
                } else {
                    r12 = 2147483639;
                }
            }
            Object[] objArr2 = new Object[r12];
            h.b(objArr, objArr2, 0, this.f264J, objArr.length);
            Object[] objArr3 = this.f265K;
            int length2 = objArr3.length;
            int r22 = this.f264J;
            h.b(objArr3, objArr2, length2 - r22, 0, r22);
            this.f264J = 0;
            this.f265K = objArr2;
            return;
        }
        throw new IllegalStateException("Deque is too big.");
    }

    public final int i(int r3) {
        Object[] objArr = this.f265K;
        N2.g.e(objArr, "<this>");
        if (r3 == objArr.length - 1) {
            return 0;
        }
        return r3 + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int r5;
        int l3 = l(this.f264J + this.f266L);
        int r12 = this.f264J;
        if (r12 < l3) {
            while (r12 < l3) {
                if (N2.g.a(obj, this.f265K[r12])) {
                    r5 = this.f264J;
                } else {
                    r12++;
                }
            }
            return -1;
        } else if (r12 >= l3) {
            int length = this.f265K.length;
            while (true) {
                if (r12 < length) {
                    if (N2.g.a(obj, this.f265K[r12])) {
                        r5 = this.f264J;
                        break;
                    }
                    r12++;
                } else {
                    for (int r13 = 0; r13 < l3; r13++) {
                        if (N2.g.a(obj, this.f265K[r13])) {
                            r12 = r13 + this.f265K.length;
                            r5 = this.f264J;
                        }
                    }
                    return -1;
                }
            }
        } else {
            return -1;
        }
        return r12 - r5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        if (this.f266L == 0) {
            return true;
        }
        return false;
    }

    public final int j(int r22) {
        if (r22 < 0) {
            return r22 + this.f265K.length;
        }
        return r22;
    }

    public final void k(int r5, int r6) {
        if (r5 < r6) {
            Object[] objArr = this.f265K;
            N2.g.e(objArr, "<this>");
            Arrays.fill(objArr, r5, r6, (Object) null);
            return;
        }
        Object[] objArr2 = this.f265K;
        Arrays.fill(objArr2, r5, objArr2.length, (Object) null);
        Object[] objArr3 = this.f265K;
        N2.g.e(objArr3, "<this>");
        Arrays.fill(objArr3, 0, r6, (Object) null);
    }

    public final int l(int r3) {
        Object[] objArr = this.f265K;
        if (r3 >= objArr.length) {
            return r3 - objArr.length;
        }
        return r3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int r5;
        int l3 = l(this.f264J + this.f266L);
        int r12 = this.f264J;
        if (r12 < l3) {
            length = l3 - 1;
            if (r12 <= length) {
                while (!N2.g.a(obj, this.f265K[length])) {
                    if (length != r12) {
                        length--;
                    }
                }
                r5 = this.f264J;
                return length - r5;
            }
            return -1;
        }
        if (r12 > l3) {
            int r02 = l3 - 1;
            while (true) {
                if (-1 < r02) {
                    if (N2.g.a(obj, this.f265K[r02])) {
                        length = r02 + this.f265K.length;
                        r5 = this.f264J;
                        break;
                    }
                    r02--;
                } else {
                    Object[] objArr = this.f265K;
                    N2.g.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int r13 = this.f264J;
                    if (r13 <= length) {
                        while (!N2.g.a(obj, this.f265K[length])) {
                            if (length != r13) {
                                length--;
                            }
                        }
                        r5 = this.f264J;
                    }
                }
            }
        }
        return -1;
    }

    public final void m() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int r9) {
        int r02 = this.f266L;
        if (r9 >= 0 && r9 < r02) {
            if (r9 == j.a(this)) {
                return removeLast();
            }
            if (r9 == 0) {
                return removeFirst();
            }
            m();
            int l3 = l(this.f264J + r9);
            Object[] objArr = this.f265K;
            Object obj = objArr[l3];
            if (r9 < (this.f266L >> 1)) {
                int r92 = this.f264J;
                if (l3 >= r92) {
                    h.b(objArr, objArr, r92 + 1, r92, l3);
                } else {
                    h.b(objArr, objArr, 1, 0, l3);
                    Object[] objArr2 = this.f265K;
                    objArr2[0] = objArr2[objArr2.length - 1];
                    int r03 = this.f264J;
                    h.b(objArr2, objArr2, r03 + 1, r03, objArr2.length - 1);
                }
                Object[] objArr3 = this.f265K;
                int r04 = this.f264J;
                objArr3[r04] = null;
                this.f264J = i(r04);
            } else {
                int l4 = l(j.a(this) + this.f264J);
                if (l3 <= l4) {
                    Object[] objArr4 = this.f265K;
                    h.b(objArr4, objArr4, l3, l3 + 1, l4 + 1);
                } else {
                    Object[] objArr5 = this.f265K;
                    h.b(objArr5, objArr5, l3, l3 + 1, objArr5.length);
                    Object[] objArr6 = this.f265K;
                    objArr6[objArr6.length - 1] = objArr6[0];
                    h.b(objArr6, objArr6, 0, 1, l4 + 1);
                }
                this.f265K[l4] = null;
            }
            this.f266L--;
            return obj;
        }
        throw new IndexOutOfBoundsException(C.x("index: ", r9, ", size: ", r02));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int l3;
        N2.g.e(collection, "elements");
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.f265K.length != 0) {
            int l4 = l(this.f264J + this.f266L);
            int r22 = this.f264J;
            if (r22 < l4) {
                l3 = r22;
                while (r22 < l4) {
                    Object obj = this.f265K[r22];
                    if (!collection.contains(obj)) {
                        this.f265K[l3] = obj;
                        l3++;
                    } else {
                        z3 = true;
                    }
                    r22++;
                }
                Object[] objArr = this.f265K;
                N2.g.e(objArr, "<this>");
                Arrays.fill(objArr, l3, l4, (Object) null);
            } else {
                int length = this.f265K.length;
                int r6 = r22;
                boolean z4 = false;
                while (r22 < length) {
                    Object[] objArr2 = this.f265K;
                    Object obj2 = objArr2[r22];
                    objArr2[r22] = null;
                    if (!collection.contains(obj2)) {
                        this.f265K[r6] = obj2;
                        r6++;
                    } else {
                        z4 = true;
                    }
                    r22++;
                }
                l3 = l(r6);
                for (int r12 = 0; r12 < l4; r12++) {
                    Object[] objArr3 = this.f265K;
                    Object obj3 = objArr3[r12];
                    objArr3[r12] = null;
                    if (!collection.contains(obj3)) {
                        this.f265K[l3] = obj3;
                        l3 = i(l3);
                    } else {
                        z4 = true;
                    }
                }
                z3 = z4;
            }
            if (z3) {
                m();
                this.f266L = j(l3 - this.f264J);
            }
        }
        return z3;
    }

    public final Object removeFirst() {
        if (!isEmpty()) {
            m();
            Object[] objArr = this.f265K;
            int r12 = this.f264J;
            Object obj = objArr[r12];
            objArr[r12] = null;
            this.f264J = i(r12);
            this.f266L--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final Object removeLast() {
        if (!isEmpty()) {
            m();
            int l3 = l(j.a(this) + this.f264J);
            Object[] objArr = this.f265K;
            Object obj = objArr[l3];
            objArr[l3] = null;
            this.f266L--;
            return obj;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    @Override // java.util.AbstractList
    public final void removeRange(int r8, int r9) {
        AbstractC0069a.a(r8, r9, this.f266L);
        int r02 = r9 - r8;
        if (r02 == 0) {
            return;
        }
        if (r02 == this.f266L) {
            clear();
        } else if (r02 == 1) {
            remove(r8);
        } else {
            m();
            if (r8 < this.f266L - r9) {
                int l3 = l((r8 - 1) + this.f264J);
                int l4 = l((r9 - 1) + this.f264J);
                while (r8 > 0) {
                    int r12 = l3 + 1;
                    int min = Math.min(r8, Math.min(r12, l4 + 1));
                    Object[] objArr = this.f265K;
                    int r92 = l4 - min;
                    int r22 = l3 - min;
                    h.b(objArr, objArr, r92 + 1, r22 + 1, r12);
                    l3 = j(r22);
                    l4 = j(r92);
                    r8 -= min;
                }
                int l5 = l(this.f264J + r02);
                k(this.f264J, l5);
                this.f264J = l5;
            } else {
                int l6 = l(this.f264J + r9);
                int l7 = l(this.f264J + r8);
                int r23 = this.f266L;
                while (true) {
                    r23 -= r9;
                    if (r23 <= 0) {
                        break;
                    }
                    Object[] objArr2 = this.f265K;
                    r9 = Math.min(r23, Math.min(objArr2.length - l6, objArr2.length - l7));
                    Object[] objArr3 = this.f265K;
                    int r4 = l6 + r9;
                    h.b(objArr3, objArr3, l7, l6, r4);
                    l6 = l(r4);
                    l7 = l(l7 + r9);
                }
                int l8 = l(this.f264J + this.f266L);
                k(j(l8 - r02), l8);
            }
            this.f266L -= r02;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int l3;
        N2.g.e(collection, "elements");
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.f265K.length != 0) {
            int l4 = l(this.f264J + this.f266L);
            int r22 = this.f264J;
            if (r22 < l4) {
                l3 = r22;
                while (r22 < l4) {
                    Object obj = this.f265K[r22];
                    if (collection.contains(obj)) {
                        this.f265K[l3] = obj;
                        l3++;
                    } else {
                        z3 = true;
                    }
                    r22++;
                }
                Object[] objArr = this.f265K;
                N2.g.e(objArr, "<this>");
                Arrays.fill(objArr, l3, l4, (Object) null);
            } else {
                int length = this.f265K.length;
                int r6 = r22;
                boolean z4 = false;
                while (r22 < length) {
                    Object[] objArr2 = this.f265K;
                    Object obj2 = objArr2[r22];
                    objArr2[r22] = null;
                    if (collection.contains(obj2)) {
                        this.f265K[r6] = obj2;
                        r6++;
                    } else {
                        z4 = true;
                    }
                    r22++;
                }
                l3 = l(r6);
                for (int r12 = 0; r12 < l4; r12++) {
                    Object[] objArr3 = this.f265K;
                    Object obj3 = objArr3[r12];
                    objArr3[r12] = null;
                    if (collection.contains(obj3)) {
                        this.f265K[l3] = obj3;
                        l3 = i(l3);
                    } else {
                        z4 = true;
                    }
                }
                z3 = z4;
            }
            if (z3) {
                m();
                this.f266L = j(l3 - this.f264J);
            }
        }
        return z3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int r4, Object obj) {
        int r02 = this.f266L;
        if (r4 >= 0 && r4 < r02) {
            int l3 = l(this.f264J + r4);
            Object[] objArr = this.f265K;
            Object obj2 = objArr[l3];
            objArr[l3] = obj;
            return obj2;
        }
        throw new IndexOutOfBoundsException(C.x("index: ", r4, ", size: ", r02));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f266L;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f266L]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        N2.g.e(objArr, "array");
        int length = objArr.length;
        int r12 = this.f266L;
        if (length < r12) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), r12);
            N2.g.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int l3 = l(this.f264J + this.f266L);
        int r13 = this.f264J;
        if (r13 < l3) {
            h.b(this.f265K, objArr, 0, r13, l3);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f265K;
            h.b(objArr2, objArr, 0, this.f264J, objArr2.length);
            Object[] objArr3 = this.f265K;
            h.b(objArr3, objArr, objArr3.length - this.f264J, 0, l3);
        }
        int r02 = this.f266L;
        if (r02 < objArr.length) {
            objArr[r02] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        N2.g.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        m();
        h(collection.size() + this.f266L);
        e(l(this.f264J + this.f266L), collection);
        return true;
    }
}
