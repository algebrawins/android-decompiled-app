package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a  reason: collision with root package name */
    public final D f2827a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2828b;

    public N(D d4, int r22) {
        this.f2827a = d4;
        this.f2828b = r22;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof N)) {
            return false;
        }
        N n3 = (N) obj;
        if (this.f2827a != n3.f2827a || this.f2828b != n3.f2828b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f2827a) * 65535) + this.f2828b;
    }
}
