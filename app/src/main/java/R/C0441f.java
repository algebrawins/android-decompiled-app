package r;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: r.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0441f implements Iterable {

    /* renamed from: J  reason: collision with root package name */
    public C0438c f4866J;

    /* renamed from: K  reason: collision with root package name */
    public C0438c f4867K;

    /* renamed from: L  reason: collision with root package name */
    public final WeakHashMap f4868L = new WeakHashMap();

    /* renamed from: M  reason: collision with root package name */
    public int f4869M = 0;

    public C0438c e(Object obj) {
        C0438c c0438c = this.f4866J;
        while (c0438c != null && !c0438c.f4859J.equals(obj)) {
            c0438c = c0438c.f4861L;
        }
        return c0438c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r3.hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (((r.C0437b) r7).hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof r.C0441f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r.f r7 = (r.C0441f) r7
            int r1 = r6.f4869M
            int r3 = r7.f4869M
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            r.b r3 = (r.C0437b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            r.b r4 = (r.C0437b) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            r.b r7 = (r.C0437b) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = 0
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C0441f.equals(java.lang.Object):boolean");
    }

    public Object h(Object obj) {
        C0438c e4 = e(obj);
        if (e4 == null) {
            return null;
        }
        this.f4869M--;
        WeakHashMap weakHashMap = this.f4868L;
        if (!weakHashMap.isEmpty()) {
            for (AbstractC0440e abstractC0440e : weakHashMap.keySet()) {
                abstractC0440e.a(e4);
            }
        }
        C0438c c0438c = e4.f4862M;
        if (c0438c != null) {
            c0438c.f4861L = e4.f4861L;
        } else {
            this.f4866J = e4.f4861L;
        }
        C0438c c0438c2 = e4.f4861L;
        if (c0438c2 != null) {
            c0438c2.f4862M = c0438c;
        } else {
            this.f4867K = c0438c;
        }
        e4.f4861L = null;
        e4.f4862M = null;
        return e4.f4860K;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int r12 = 0;
        while (true) {
            C0437b c0437b = (C0437b) it;
            if (c0437b.hasNext()) {
                r12 += ((Map.Entry) c0437b.next()).hashCode();
            } else {
                return r12;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0437b c0437b = new C0437b(this.f4866J, this.f4867K, 0);
        this.f4868L.put(c0437b, Boolean.FALSE);
        return c0437b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C0437b c0437b = (C0437b) it;
            if (c0437b.hasNext()) {
                sb.append(((Map.Entry) c0437b.next()).toString());
                if (c0437b.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
