package D;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class O extends A {

    /* renamed from: M  reason: collision with root package name */
    public final /* synthetic */ int f329M = 1;

    /* renamed from: N  reason: collision with root package name */
    public final Object f330N;

    public O(X x3) {
        super(x3);
        this.f330N = new AtomicBoolean(false);
    }

    @Override // D.A, java.lang.AutoCloseable
    public void close() {
        switch (this.f329M) {
            case 1:
                if (!((AtomicBoolean) this.f330N).getAndSet(true)) {
                    super.close();
                    return;
                }
                return;
            default:
                super.close();
                return;
        }
    }

    public O(X x3, P p2) {
        super(x3);
        this.f330N = new WeakReference(p2);
        a(new M(0, this));
    }
}
