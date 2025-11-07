package D;

import android.util.Size;

/* loaded from: classes.dex */
public final class g0 extends A {

    /* renamed from: M  reason: collision with root package name */
    public final Object f394M;

    /* renamed from: N  reason: collision with root package name */
    public final U f395N;

    /* renamed from: O  reason: collision with root package name */
    public final int f396O;

    /* renamed from: P  reason: collision with root package name */
    public final int f397P;

    public g0(X x3, Size size, U u3) {
        super(x3);
        this.f394M = new Object();
        if (size == null) {
            this.f396O = this.f277K.getWidth();
            this.f397P = this.f277K.getHeight();
        } else {
            this.f396O = size.getWidth();
            this.f397P = size.getHeight();
        }
        this.f395N = u3;
    }

    @Override // D.A, D.X
    public final U g() {
        return this.f395N;
    }

    @Override // D.A, D.X
    public final int getHeight() {
        return this.f397P;
    }

    @Override // D.A, D.X
    public final int getWidth() {
        return this.f396O;
    }
}
