package V2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: V2.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0057n {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1449b = AtomicIntegerFieldUpdater.newUpdater(C0057n.class, "_handled");
    private volatile int _handled;

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f1450a;

    public C0057n(Throwable th, boolean z3) {
        this.f1450a = th;
        this._handled = z3 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f1450a + ']';
    }
}
