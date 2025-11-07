package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class K0 extends I {

    /* renamed from: J  reason: collision with root package name */
    public final L0 f2810J;

    /* renamed from: K  reason: collision with root package name */
    public I f2811K = b();

    public K0(M0 m02) {
        this.f2810J = new L0(m02);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.I
    public final byte a() {
        I r02 = this.f2811K;
        if (r02 != null) {
            byte a4 = r02.a();
            if (!this.f2811K.hasNext()) {
                this.f2811K = b();
            }
            return a4;
        }
        throw new NoSuchElementException();
    }

    public final H b() {
        L0 l02 = this.f2810J;
        if (l02.hasNext()) {
            return new H(l02.next());
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2811K != null;
    }
}
