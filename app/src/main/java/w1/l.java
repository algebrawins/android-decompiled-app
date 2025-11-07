package w1;

import D.C;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class l implements Map, Serializable {

    /* renamed from: P  reason: collision with root package name */
    public static final l f5304P = new l(null, new Object[0], 0);

    /* renamed from: J  reason: collision with root package name */
    public transient C0524i f5305J;

    /* renamed from: K  reason: collision with root package name */
    public transient C0525j f5306K;

    /* renamed from: L  reason: collision with root package name */
    public transient C0526k f5307L;

    /* renamed from: M  reason: collision with root package name */
    public final transient Object f5308M;

    /* renamed from: N  reason: collision with root package name */
    public final transient Object[] f5309N;

    /* renamed from: O  reason: collision with root package name */
    public final transient int f5310O;

    public l(Object obj, Object[] objArr, int r3) {
        this.f5308M = obj;
        this.f5309N = objArr;
        this.f5310O = r3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a2  */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static w1.l a(int r16, java.lang.Object[] r17, U1.h r18) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.l.a(int, java.lang.Object[], U1.h):w1.l");
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        C0526k c0526k = this.f5307L;
        if (c0526k == null) {
            c0526k = new C0526k(this.f5309N, 1, this.f5310O);
            this.f5307L = c0526k;
        }
        return c0526k.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C0524i c0524i = this.f5305J;
        if (c0524i == null) {
            C0524i c0524i2 = new C0524i(this, this.f5309N, this.f5310O);
            this.f5305J = c0524i2;
            return c0524i2;
        }
        return c0524i;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f A[RETURN] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L6
        L3:
            r10 = r0
            goto L9c
        L6:
            r1 = 1
            java.lang.Object[] r2 = r9.f5309N
            int r3 = r9.f5310O
            if (r3 != r1) goto L20
            r3 = 0
            r3 = r2[r3]
            r3.getClass()
            boolean r10 = r3.equals(r10)
            if (r10 == 0) goto L3
            r10 = r2[r1]
            r10.getClass()
            goto L9c
        L20:
            java.lang.Object r3 = r9.f5308M
            if (r3 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r3 instanceof byte[]
            r5 = -1
            if (r4 == 0) goto L51
            r4 = r3
            byte[] r4 = (byte[]) r4
            int r3 = r4.length
            int r6 = r3 + (-1)
            int r3 = r10.hashCode()
            int r3 = x1.AbstractC0585c5.a(r3)
        L38:
            r3 = r3 & r6
            r5 = r4[r3]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L3
        L41:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L4e:
            int r3 = r3 + 1
            goto L38
        L51:
            boolean r4 = r3 instanceof short[]
            if (r4 == 0) goto L7d
            r4 = r3
            short[] r4 = (short[]) r4
            int r3 = r4.length
            int r6 = r3 + (-1)
            int r3 = r10.hashCode()
            int r3 = x1.AbstractC0585c5.a(r3)
        L63:
            r3 = r3 & r6
            short r5 = r4[r3]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L3
        L6d:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L7a:
            int r3 = r3 + 1
            goto L63
        L7d:
            int[] r3 = (int[]) r3
            int r4 = r3.length
            int r4 = r4 + r5
            int r6 = r10.hashCode()
            int r6 = x1.AbstractC0585c5.a(r6)
        L89:
            r6 = r6 & r4
            r7 = r3[r6]
            if (r7 != r5) goto L90
            goto L3
        L90:
            r8 = r2[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r2[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r0
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.l.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int r3;
        C0524i c0524i = this.f5305J;
        if (c0524i == null) {
            c0524i = new C0524i(this, this.f5309N, this.f5310O);
            this.f5305J = c0524i;
        }
        int r22 = 0;
        for (Object obj : c0524i) {
            if (obj != null) {
                r3 = obj.hashCode();
            } else {
                r3 = 0;
            }
            r22 += r3;
        }
        return r22;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C0525j c0525j = this.f5306K;
        if (c0525j == null) {
            C0525j c0525j2 = new C0525j(this, new C0526k(this.f5309N, 0, this.f5310O));
            this.f5306K = c0525j2;
            return c0525j2;
        }
        return c0525j;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f5310O;
    }

    public final String toString() {
        int r02 = this.f5310O;
        if (r02 >= 0) {
            StringBuilder sb = new StringBuilder((int) Math.min(r02 * 8, 1073741824L));
            sb.append('{');
            Iterator it = ((C0524i) entrySet()).iterator();
            boolean z3 = true;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!z3) {
                    sb.append(", ");
                }
                sb.append(entry.getKey());
                sb.append('=');
                sb.append(entry.getValue());
                z3 = false;
            }
            sb.append('}');
            return sb.toString();
        }
        throw new IllegalArgumentException(C.w("size cannot be negative but was: ", r02));
    }

    @Override // java.util.Map
    public final Collection values() {
        C0526k c0526k = this.f5307L;
        if (c0526k == null) {
            C0526k c0526k2 = new C0526k(this.f5309N, 1, this.f5310O);
            this.f5307L = c0526k2;
            return c0526k2;
        }
        return c0526k;
    }
}
