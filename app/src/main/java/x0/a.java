package X0;

/* loaded from: classes.dex */
public final class a implements A2.a {

    /* renamed from: L  reason: collision with root package name */
    public static final Object f1579L = new Object();

    /* renamed from: J  reason: collision with root package name */
    public volatile b f1580J;

    /* renamed from: K  reason: collision with root package name */
    public volatile Object f1581K;

    /* JADX WARN: Type inference failed for: r0v1, types: [X0.a, java.lang.Object, A2.a] */
    public static A2.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f1581K = f1579L;
        obj.f1580J = bVar;
        return obj;
    }

    @Override // A2.a
    public final Object get() {
        Object obj = this.f1581K;
        Object obj2 = f1579L;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f1581K;
                    if (obj == obj2) {
                        obj = this.f1580J.get();
                        Object obj3 = this.f1581K;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f1581K = obj;
                        this.f1580J = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
