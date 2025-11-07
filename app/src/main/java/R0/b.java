package r0;

import C2.i;
import C2.k;
import C2.t;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import k0.C0322i;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Map f4871a;

    /* renamed from: b  reason: collision with root package name */
    public final C0322i f4872b;

    public b(Map map, boolean z3) {
        N2.g.e(map, "preferencesMap");
        this.f4871a = map;
        this.f4872b = new C0322i(z3);
    }

    public final Map a() {
        B2.c cVar;
        Set<Map.Entry> entrySet = this.f4871a.entrySet();
        int a4 = t.a(k.g(entrySet));
        if (a4 < 16) {
            a4 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a4);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                N2.g.d(copyOf, "copyOf(this, size)");
                cVar = new B2.c(key, copyOf);
            } else {
                cVar = new B2.c(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(cVar.f200J, cVar.f201K);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        N2.g.d(unmodifiableMap, "unmodifiableMap(map)");
        return unmodifiableMap;
    }

    public final void b() {
        if (!((AtomicBoolean) this.f4872b.f3983K).get()) {
            return;
        }
        throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
    }

    public final Object c(d dVar) {
        N2.g.e(dVar, "key");
        Object obj = this.f4871a.get(dVar);
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            N2.g.d(copyOf, "copyOf(this, size)");
            return copyOf;
        }
        return obj;
    }

    public final void d(d dVar, Object obj) {
        b();
        Map map = this.f4871a;
        if (obj == null) {
            b();
            map.remove(dVar);
        } else if (obj instanceof Set) {
            Set unmodifiableSet = Collections.unmodifiableSet(i.n((Set) obj));
            N2.g.d(unmodifiableSet, "unmodifiableSet(set.toSet())");
            map.put(dVar, unmodifiableSet);
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            N2.g.d(copyOf, "copyOf(this, size)");
            map.put(dVar, copyOf);
        } else {
            map.put(dVar, obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0063 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof r0.b
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0.b r7 = (r0.b) r7
            java.util.Map r0 = r7.f4871a
            java.util.Map r2 = r6.f4871a
            r3 = 1
            if (r0 != r2) goto L10
            return r3
        L10:
            int r0 = r0.size()
            int r4 = r2.size()
            if (r0 == r4) goto L1b
            return r1
        L1b:
            java.util.Map r7 = r7.f4871a
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L25
        L23:
            r1 = 1
            goto L63
        L25:
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L2d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r4 = r2.get(r4)
            if (r4 == 0) goto L60
            java.lang.Object r0 = r0.getValue()
            boolean r5 = r0 instanceof byte[]
            if (r5 == 0) goto L5b
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L60
            byte[] r0 = (byte[]) r0
            byte[] r4 = (byte[]) r4
            boolean r0 = java.util.Arrays.equals(r0, r4)
            if (r0 == 0) goto L60
            r0 = 1
            goto L61
        L5b:
            boolean r0 = N2.g.a(r0, r4)
            goto L61
        L60:
            r0 = 0
        L61:
            if (r0 != 0) goto L2d
        L63:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode;
        int r12 = 0;
        for (Map.Entry entry : this.f4871a.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                hashCode = Arrays.hashCode((byte[]) value);
            } else {
                hashCode = value.hashCode();
            }
            r12 += hashCode;
        }
        return r12;
    }

    public final String toString() {
        return i.j(this.f4871a.entrySet(), ",\n", "{\n", "\n}", C0442a.f4870K, 24);
    }

    public /* synthetic */ b(boolean z3) {
        this(new LinkedHashMap(), z3);
    }
}
