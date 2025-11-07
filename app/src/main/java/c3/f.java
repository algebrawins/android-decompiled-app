package c3;

import V2.AbstractC0061s;

/* loaded from: classes.dex */
public final class f extends i {

    /* renamed from: M  reason: collision with root package name */
    public static final f f2688M;

    /* JADX WARN: Type inference failed for: r0v0, types: [c3.f, V2.s, c3.i] */
    static {
        int r22 = m.f2697c;
        int r3 = m.f2698d;
        long j3 = m.f2699e;
        String str = m.f2695a;
        ?? abstractC0061s = new AbstractC0061s();
        abstractC0061s.f2690L = new d(r22, r3, j3, str);
        f2688M = abstractC0061s;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // V2.AbstractC0061s
    public final String toString() {
        return "Dispatchers.Default";
    }
}
