package F1;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class p implements L1.a {

    /* renamed from: a  reason: collision with root package name */
    public volatile Set f643a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Set f644b;

    public final synchronized void a() {
        try {
            for (L1.a aVar : this.f643a) {
                this.f644b.add(aVar.get());
            }
            this.f643a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // L1.a
    public final Object get() {
        if (this.f644b == null) {
            synchronized (this) {
                try {
                    if (this.f644b == null) {
                        this.f644b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f644b);
    }
}
