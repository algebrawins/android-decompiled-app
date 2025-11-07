package x1;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class L implements Map, Serializable {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f5648J;

    /* renamed from: K  reason: collision with root package name */
    public final transient Object[] f5649K;

    /* renamed from: L  reason: collision with root package name */
    public transient AbstractCollection f5650L;

    /* renamed from: M  reason: collision with root package name */
    public transient AbstractCollection f5651M;

    /* renamed from: N  reason: collision with root package name */
    public transient AbstractCollection f5652N;

    public /* synthetic */ L(int r12, Object[] objArr) {
        this.f5648J = r12;
        this.f5649K = objArr;
    }

    @Override // java.util.Map
    public final void clear() {
        switch (this.f5648J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.f5648J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                if (get(obj) != null) {
                    return true;
                }
                return false;
            default:
                if (get(obj) != null) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        switch (this.f5648J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                K k3 = (K) this.f5652N;
                if (k3 == null) {
                    k3 = new K(1, this.f5649K);
                    this.f5652N = k3;
                }
                return k3.contains(obj);
            default:
                y1.b5 b5Var = (y1.b5) this.f5652N;
                if (b5Var == null) {
                    b5Var = new y1.b5(1, this.f5649K);
                    this.f5652N = b5Var;
                }
                return b5Var.contains(obj);
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        switch (this.f5648J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                I r02 = (I) this.f5650L;
                if (r02 == null) {
                    I r03 = new I(this, this.f5649K);
                    this.f5650L = r03;
                    return r03;
                }
                return r02;
            default:
                y1.Z4 z4 = (y1.Z4) this.f5650L;
                if (z4 == null) {
                    y1.Z4 z42 = new y1.Z4(this, this.f5649K);
                    this.f5650L = z42;
                    return z42;
                }
                return z4;
        }
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        switch (this.f5648J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Map)) {
                    return false;
                }
                return entrySet().equals(((Map) obj).entrySet());
            default:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Map)) {
                    return false;
                }
                return entrySet().equals(((Map) obj).entrySet());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.f5648J
            switch(r0) {
                case 0: goto L23;
                default: goto L5;
            }
        L5:
            r0 = 0
            if (r4 != 0) goto La
        L8:
            r4 = r0
            goto L1e
        La:
            java.lang.Object[] r1 = r3.f5649K
            r2 = 0
            r2 = r1[r2]
            r2.getClass()
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L8
            r4 = 1
            r4 = r1[r4]
            r4.getClass()
        L1e:
            if (r4 != 0) goto L21
            goto L22
        L21:
            r0 = r4
        L22:
            return r0
        L23:
            r0 = 0
            if (r4 != 0) goto L28
        L26:
            r4 = r0
            goto L3c
        L28:
            java.lang.Object[] r1 = r3.f5649K
            r2 = 0
            r2 = r1[r2]
            r2.getClass()
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L26
            r4 = 1
            r4 = r1[r4]
            r4.getClass()
        L3c:
            if (r4 != 0) goto L3f
            goto L40
        L3f:
            r0 = r4
        L40:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.L.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        switch (this.f5648J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                Object obj3 = get(obj);
                if (obj3 != null) {
                    return obj3;
                }
                return obj2;
            default:
                Object obj4 = get(obj);
                if (obj4 != null) {
                    return obj4;
                }
                return obj2;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        int r3;
        switch (this.f5648J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                I r02 = (I) this.f5650L;
                if (r02 == null) {
                    r02 = new I(this, this.f5649K);
                    this.f5650L = r02;
                }
                return AbstractC0649l5.a(r02);
            default:
                y1.Z4 z4 = (y1.Z4) this.f5650L;
                if (z4 == null) {
                    z4 = new y1.Z4(this, this.f5649K);
                    this.f5650L = z4;
                }
                int r22 = 0;
                for (Object obj : z4) {
                    if (obj != null) {
                        r3 = obj.hashCode();
                    } else {
                        r3 = 0;
                    }
                    r22 += r3;
                }
                return r22;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        switch (this.f5648J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return false;
            default:
                return false;
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        switch (this.f5648J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                J j3 = (J) this.f5651M;
                if (j3 == null) {
                    J j4 = new J(this, new K(0, this.f5649K));
                    this.f5651M = j4;
                    return j4;
                }
                return j3;
            default:
                y1.a5 a5Var = (y1.a5) this.f5651M;
                if (a5Var == null) {
                    y1.a5 a5Var2 = new y1.a5(this, new y1.b5(0, this.f5649K));
                    this.f5651M = a5Var2;
                    return a5Var2;
                }
                return a5Var;
        }
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        switch (this.f5648J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        switch (this.f5648J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        switch (this.f5648J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final int size() {
        switch (this.f5648J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return 1;
            default:
                return 1;
        }
    }

    public final String toString() {
        switch (this.f5648J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                boolean z3 = true;
                StringBuilder sb = new StringBuilder((int) Math.min(1 * 8, 1073741824L));
                sb.append('{');
                Iterator it = ((I) entrySet()).iterator();
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
            default:
                boolean z4 = true;
                StringBuilder sb2 = new StringBuilder((int) Math.min(1 * 8, 1073741824L));
                sb2.append('{');
                Iterator it2 = ((y1.Z4) entrySet()).iterator();
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    if (!z4) {
                        sb2.append(", ");
                    }
                    sb2.append(entry2.getKey());
                    sb2.append('=');
                    sb2.append(entry2.getValue());
                    z4 = false;
                }
                sb2.append('}');
                return sb2.toString();
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        switch (this.f5648J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                K k3 = (K) this.f5652N;
                if (k3 == null) {
                    K k4 = new K(1, this.f5649K);
                    this.f5652N = k4;
                    return k4;
                }
                return k3;
            default:
                y1.b5 b5Var = (y1.b5) this.f5652N;
                if (b5Var == null) {
                    y1.b5 b5Var2 = new y1.b5(1, this.f5649K);
                    this.f5652N = b5Var2;
                    return b5Var2;
                }
                return b5Var;
        }
    }
}
