package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class H extends I {

    /* renamed from: J  reason: collision with root package name */
    public int f2793J = 0;

    /* renamed from: K  reason: collision with root package name */
    public final int f2794K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ L f2795L;

    public H(L l3) {
        this.f2795L = l3;
        this.f2794K = l3.j();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I
    public final byte a() {
        int r02 = this.f2793J;
        if (r02 < this.f2794K) {
            this.f2793J = r02 + 1;
            return this.f2795L.h(r02);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2793J < this.f2794K;
    }
}
