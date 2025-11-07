package F1;

/* loaded from: classes.dex */
public final class o implements L1.a {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f640c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f641a = f640c;

    /* renamed from: b  reason: collision with root package name */
    public volatile L1.a f642b;

    public o(L1.a aVar) {
        this.f642b = aVar;
    }

    @Override // L1.a
    public final Object get() {
        Object obj = this.f641a;
        Object obj2 = f640c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f641a;
                    if (obj == obj2) {
                        obj = this.f642b.get();
                        this.f641a = obj;
                        this.f642b = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
