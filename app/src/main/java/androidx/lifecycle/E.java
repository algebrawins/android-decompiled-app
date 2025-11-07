package androidx.lifecycle;

import D.N;
import android.os.Handler;

/* loaded from: classes.dex */
public final class E implements r {

    /* renamed from: R  reason: collision with root package name */
    public static final E f2433R = new E();

    /* renamed from: J  reason: collision with root package name */
    public int f2434J;

    /* renamed from: K  reason: collision with root package name */
    public int f2435K;

    /* renamed from: N  reason: collision with root package name */
    public Handler f2438N;

    /* renamed from: L  reason: collision with root package name */
    public boolean f2436L = true;

    /* renamed from: M  reason: collision with root package name */
    public boolean f2437M = true;

    /* renamed from: O  reason: collision with root package name */
    public final t f2439O = new t(this);

    /* renamed from: P  reason: collision with root package name */
    public final N f2440P = new N(13, this);

    /* renamed from: Q  reason: collision with root package name */
    public final A.a f2441Q = new A.a(27, this);

    @Override // androidx.lifecycle.r
    public final t b() {
        return this.f2439O;
    }

    public final void c() {
        int r02 = this.f2435K + 1;
        this.f2435K = r02;
        if (r02 == 1) {
            if (this.f2436L) {
                this.f2439O.e(EnumC0137k.ON_RESUME);
                this.f2436L = false;
                return;
            }
            Handler handler = this.f2438N;
            N2.g.b(handler);
            handler.removeCallbacks(this.f2440P);
        }
    }
}
