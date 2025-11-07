package B2;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class f implements Serializable {

    /* renamed from: J  reason: collision with root package name */
    public M2.a f203J;

    /* renamed from: K  reason: collision with root package name */
    public volatile Object f204K = h.f209a;

    /* renamed from: L  reason: collision with root package name */
    public final Object f205L = this;

    public f(M2.a aVar) {
        this.f203J = aVar;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f204K;
        h hVar = h.f209a;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.f205L) {
            obj = this.f204K;
            if (obj == hVar) {
                M2.a aVar = this.f203J;
                N2.g.b(aVar);
                obj = aVar.a();
                this.f204K = obj;
                this.f203J = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f204K != h.f209a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
