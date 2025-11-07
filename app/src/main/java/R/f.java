package R;

import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f1126a;

    /* renamed from: b  reason: collision with root package name */
    public int f1127b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1128c;

    /* renamed from: d  reason: collision with root package name */
    public int f1129d;

    /* renamed from: e  reason: collision with root package name */
    public int f1130e;

    public f(int r4) {
        if (r4 > 0) {
            this.f1128c = r4;
            this.f1126a = new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final Object a(Object obj) {
        if (obj != null) {
            synchronized (this) {
                try {
                    Object obj2 = this.f1126a.get(obj);
                    if (obj2 != null) {
                        this.f1129d++;
                        return obj2;
                    }
                    this.f1130e++;
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new NullPointerException("key == null");
    }

    public final Object b(Object obj, Object obj2) {
        Object put;
        if (obj != null) {
            synchronized (this) {
                try {
                    this.f1127b++;
                    put = this.f1126a.put(obj, obj2);
                    if (put != null) {
                        this.f1127b--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c(this.f1128c);
            return put;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r3) {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            int r0 = r2.f1127b     // Catch: java.lang.Throwable -> L12
            if (r0 < 0) goto L47
            java.util.LinkedHashMap r0 = r2.f1126a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            int r0 = r2.f1127b     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L47
            goto L14
        L12:
            r3 = move-exception
            goto L66
        L14:
            int r0 = r2.f1127b     // Catch: java.lang.Throwable -> L12
            if (r0 <= r3) goto L45
            java.util.LinkedHashMap r0 = r2.f1126a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L21
            goto L45
        L21:
            java.util.LinkedHashMap r0 = r2.f1126a     // Catch: java.lang.Throwable -> L12
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L12
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L12
            r0.getValue()     // Catch: java.lang.Throwable -> L12
            java.util.LinkedHashMap r0 = r2.f1126a     // Catch: java.lang.Throwable -> L12
            r0.remove(r1)     // Catch: java.lang.Throwable -> L12
            int r0 = r2.f1127b     // Catch: java.lang.Throwable -> L12
            int r0 = r0 + (-1)
            r2.f1127b = r0     // Catch: java.lang.Throwable -> L12
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            goto L0
        L45:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            return
        L47:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.Class r1 = r2.getClass()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L12
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L12
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L12
            throw r3     // Catch: java.lang.Throwable -> L12
        L66:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: R.f.c(int):void");
    }

    public final synchronized String toString() {
        int r12;
        int r22;
        int r4;
        int r3;
        try {
            r12 = this.f1129d;
            r22 = this.f1130e;
            int r32 = r12 + r22;
            if (r32 != 0) {
                r4 = (r12 * 100) / r32;
            } else {
                r4 = 0;
            }
            Locale locale = Locale.US;
            r3 = this.f1128c;
        } catch (Throwable th) {
            throw th;
        }
        return "LruCache[maxSize=" + r3 + ",hits=" + r12 + ",misses=" + r22 + ",hitRate=" + r4 + "%]";
    }
}
